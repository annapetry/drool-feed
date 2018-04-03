package annapetry.com.droolfeed.networking.responses

import org.simpleframework.xml.Root

//package annapetry.com.networking.responses
//
//import org.simpleframework.xml.Element
//import org.simpleframework.xml.ElementList
//import org.simpleframework.xml.Root
import java.io.Serializable
//
///**
// *  Created by Anna Petry on 3/25/18.
// *  Copyright (c) 2018 Mango Health. All rights reserved.
// */
@Root(name = "rss", strict = false)
class BAFeedResponse() : Serializable {}
//
//    @set:Element
//    @get:Element private var channel: Channel? = null
//
//
////    @get:ElementList(inline = true, name = "item")
////    val items: List<BAFeedItemResponse>? = null
//
//}
//
//@Root(name = "channel", strict = false)
//class Channel : Serializable{
//    @set:Element(name = "title")
//    @get:Element private var title: String? = null
//
//    @set:Element(name = "description")
//    @get:Element private var description: String? = null
//
//    @set:Element(name = "link")
//    @get:Element private var link: String? = null
//
//    @set:Element(name = "atom:link")
//    @get:Element private var atomLink: String? = null
//
//    @set:Element(name = "copyright")
//    @get:Element private var copyright: String? = null
//
//    @set:Element(name = "language")
//    @get:Element private var language: String? = null
//
//    @set:Element(name = "lastBuildDate")
//    @get:Element private var lastBuildDate: String? = null
//
//    @ElementList(inline = true)
//    internal var itemms: List<BAFeedItemResponse>? = null
//}
//
//@Root(name = "item", strict = false)
//class BAFeedItemResponse : Serializable{
////    @get:Element(name = "title", required = false)
////    private val title: String? = null
////
////    @get:Element(name = "description", required = false)
////    private val description: String? = null
////
////    @get:Element(name = "link", required = false)
////    private val link: String? = null
////
////    @get:Element(name = "category", required = false)
////    private val category: String? = null
////
////    @get:Element(name = "media:thumbnail", required = false)
////    private val thumbnail: String? = null
//}
//
