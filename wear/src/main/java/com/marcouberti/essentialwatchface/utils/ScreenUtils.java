package com.marcouberti.essentialwatchface.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/**
 * Created by Marco on 16/10/15.
 */
public class ScreenUtils {
    public static int convertDpToPixels(Context context, float dp) {
        Resources r = context.getResources();
        return (int)(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
