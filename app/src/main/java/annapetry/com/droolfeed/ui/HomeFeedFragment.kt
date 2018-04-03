package annapetry.com.droolfeed.ui

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.View
import annapetry.com.droolfeed.R
import annapetry.com.droolfeed.models.Channel
import annapetry.com.droolfeed.models.FeedItem
import kotlinx.android.synthetic.main.fragment_home_feed.*

/**
 *  Created by Anna Petry on 3/25/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */
class HomeFeedFragment : BaseFragment(), FeedListAdapter.OnItemTappedListener {

    override val layoutResourceId = R.layout.fragment_home_feed
    override val TAG = "HomeFeedFragment"

    lateinit var channels: List<Channel>
    lateinit var feedListAdapter: FeedListAdapter
    private lateinit var gridLayoutManager: GridLayoutManager


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gridLayoutManager = GridLayoutManager(mainActivity, 2)
        val itemDecoration = ItemOffsetDecoration(20)
        feedList.addItemDecoration(itemDecoration)

        feedList.layoutManager = gridLayoutManager
        feedListAdapter = FeedListAdapter(this, channels.first().feedItems)
        feedList.adapter = feedListAdapter
    }

    override fun onItemTapped(feedItem: FeedItem) {
        mainActivity.openWebViewWith(feedItem.link)
    }

    companion object {
        fun newInstance(channels: List<Channel>): HomeFeedFragment {
            val fragment = HomeFeedFragment()
            fragment.channels = channels
            return fragment
        }
    }
}