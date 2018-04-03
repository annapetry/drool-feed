package annapetry.com.enums

import annapetry.com.droolfeed.R
import annapetry.com.util.StringUtil

/**
 *  Created by Anna Petry on 3/28/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */
enum class ChannelType {
    BonAppetit, Cookbooks101;

    val displayName : String
        get() {
            return when (this) {
                BonAppetit -> StringUtil.getString(R.string.bonAppetit)
                Cookbooks101 -> StringUtil.getString(R.string.cookbooks101)
            }
        }
}