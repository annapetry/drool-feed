package annapetry.com.util

import annapetry.com.droolfeed.DroolFeedApp
import java.net.URI

/**
 *  Created by Anna Petry on 3/28/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */
object StringUtil {
    fun getString(resourceId: Int) = DroolFeedApp().context.getString(resourceId)

    @JvmStatic
    fun getQueryparams(urlString: String): String {
        return URI(urlString).query.toString()
    }
}