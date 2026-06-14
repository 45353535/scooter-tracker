package com.taurusx.tax.o;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes11.dex */
public class o {
    public static int w(float f10, Context context) {
        return (int) (z(f10, context) + 0.5f);
    }

    public static float z(float f10, Context context) {
        return TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static int z(int i10, Context context) {
        return (i10 * 160) / context.getResources().getDisplayMetrics().densityDpi;
    }
}
