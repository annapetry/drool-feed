package annapetry.com.droolfeed.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trello.rxlifecycle2.components.RxFragment

/**
 *  Created by Anna Petry on 3/25/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */
abstract class BaseFragment : RxFragment() {
    protected abstract val layoutResourceId: Int
    abstract val TAG: String

    open val mainActivity : MainActivity get() = activity as MainActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layoutResourceId, container, false)
        setHasOptionsMenu(true)
        retainInstance = true
        return view
    }
}