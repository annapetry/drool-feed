package annapetry.com.droolfeed.models

import annapetry.com.enums.ChannelType

/**
 *  Created by Anna Petry on 3/28/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */
class Channel(val channelType: ChannelType) {
    val feedItems: MutableList<FeedItem> = mutableListOf()

    fun addItem(item: FeedItem) {
        feedItems.add(item)
    }
}