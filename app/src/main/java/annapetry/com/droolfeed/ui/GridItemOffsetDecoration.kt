package annapetry.com.droolfeed.ui

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 *  Created by Anna Petry on 4/2/18.
 *  Copyright (c) 2018 Mango Health. All rights reserved.
 */

class ItemOffsetDecoration(private val itemOffset: Int) : RecyclerView.ItemDecoration() {

//    constructor(@NonNull context: Context, @DimenRes itemOffsetId: Int) : this(context.getResources().getDimensionPixelSize(itemOffsetId)) {}

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView,
                       state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.set(itemOffset, itemOffset, itemOffset, itemOffset)
    }
}