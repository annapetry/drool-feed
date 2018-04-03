package annapetry.com.droolfeed.networking.responses

import annapetry.com.droolfeed.models.Channel
import annapetry.com.droolfeed.models.FeedItem
import annapetry.com.droolfeed.networking.responses.Cookbooks101.Cookbooks101FeedResponse
import annapetry.com.enums.ChannelType

/**
 *  Created by Anna Petry on 3/28/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */
object ResponseParser {
    fun parse101Response(response: Cookbooks101FeedResponse?): Channel {
        val channel = Channel(ChannelType.Cookbooks101)

        response?.channel?.items?.forEach {
            channel.addItem(FeedItem(it.title, it.image, it.link, it.category, ChannelType.Cookbooks101))
        }

        return channel
    }
}