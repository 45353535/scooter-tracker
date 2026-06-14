package com.google.android.exoplayer2.ui;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes7.dex */
final class HtmlUtils {
    private HtmlUtils() {
    }

    public static String cssAllClassDescendantsSelector(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String toCssRgba(@ColorInt int i10) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }
}
