package com.demo.imagesearch.util

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ItemOffsetDecorationCommon(var space:Float) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        //if (parent.getChildAdapterPosition(view)!= parent.adapter?.itemCount?.minus( - 1)){
            outRect.bottom = (space.toInt())
        //}
        if (parent.getChildAdapterPosition(view) == 0){
            outRect.top = space.toInt()
        }

        outRect.left = space.toInt()
        outRect.right = space.toInt()
    }
}