package annapetry.com.droolfeed.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import annapetry.com.droolfeed.R
import annapetry.com.droolfeed.models.Channel
import annapetry.com.droolfeed.networking.ApiClient
import annapetry.com.droolfeed.networking.FeedURLs
import annapetry.com.droolfeed.networking.responses.ResponseParser
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : RxAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        if (savedInstanceState == null)
            getChannels()
    }

    fun getChannels() {
        val channels = mutableListOf<Channel>()
//        ApiClient.service.getBAHealthyishFeed(FeedURLs.BAHealthyish.toString())
//                .observeOn(Schedulers.io())
//                .subscribe {
//                    if (it.isSuccessful) {
//                        val feedResponse = it.body()
//                    }
//                }
        ApiClient.service.get101CookbooksFeed(FeedURLs.cookbooks101.toString())
                .observeOn(Schedulers.io())
                .subscribe {
                    if (it.isSuccessful) {
                        channels.add(ResponseParser.parse101Response(it.body()))
                        showHomeFeed(channels)
                    }

                }

//        return channels
    }

    private fun showHomeFeed(channels: MutableList<Channel>) {
        val fragment = HomeFeedFragment.newInstance(channels)
        val transaction = fragmentManager.beginTransaction()
        transaction.add(fragmentLayout.getId(), fragment, fragment.TAG)
        transaction.commitAllowingStateLoss()
    }

    fun openWebViewWith(url: String) {
        webview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        webview.visibility = View.VISIBLE
        webview.loadUrl(url)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_filter -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
