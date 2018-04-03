package annapetry.com.droolfeed

import android.content.Context
import android.support.multidex.MultiDexApplication

/**
 *  Created by Anna Petry on 3/28/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */
class DroolFeedApp : MultiDexApplication() {
    lateinit var context : Context

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}