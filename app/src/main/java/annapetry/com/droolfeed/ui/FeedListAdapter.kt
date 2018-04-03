package annapetry.com.droolfeed.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import annapetry.com.droolfeed.R
import annapetry.com.droolfeed.models.FeedItem

/**
 *  Created by Anna Petry on 4/2/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */

class FeedListAdapter(val listener: OnItemTappedListener, val feedItems: List<FeedItem>) : RecyclerView.Adapter<FeedListAdapter.FeedItemViewHolder>() {

    interface OnItemTappedListener {
        fun onItemTapped(feedItem: FeedItem)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedItemViewHolder {
        return FeedItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_feed_item, parent, false))
    }

    override fun onBindViewHolder(holder: FeedItemViewHolder, position: Int) {
        (holder as FeedItemViewHolder).update(feedItems.get(position), listener)
    }

    override fun getItemCount(): Int {
        return feedItems.count()
    }

    class FeedItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        internal fun update(feedItem: FeedItem, listener: OnItemTappedListener) {
            (itemView as FeedItemView).update(feedItem, listener)
        }
    }
}