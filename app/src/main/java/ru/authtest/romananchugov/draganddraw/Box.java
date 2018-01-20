package ru.authtest.romananchugov.draganddraw;

import android.graphics.PointF;

/**
 * Created by romananchugov on 20.01.2018.
 */

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;
    public Box(PointF mOrigin){
        this.mCurrent = mOrigin;
        this.mOrigin = mOrigin;
    }

    public PointF getmOrigin() {
        return mOrigin;
    }

    public PointF getmCurrent() {
        return mCurrent;
    }

    public void setmCurrent(PointF mCurrent) {
        this.mCurrent = mCurrent;
    }
}
