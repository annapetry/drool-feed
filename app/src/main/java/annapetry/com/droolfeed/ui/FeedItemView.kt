package annapetry.com.droolfeed.ui

import android.content.Context
import android.net.Uri
import android.util.AttributeSet
import android.webkit.WebView
import android.widget.ImageView
import annapetry.com.droolfeed.models.FeedItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_feed_item.view.*

/**
 *  Created by Anna Petry on 4/2/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */
class FeedItemView: ImageView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun update(feedItem: FeedItem, listener: FeedListAdapter.OnItemTappedListener) {
        Picasso.with(context).load(feedItem.image).into(feedImage)

        setOnClickListener { v -> listener.onItemTapped(feedItem)}
    }
}