package com.taurusx.tax.g;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes11.dex */
public class j {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f66138z;

    public static int c(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int o(Context context) {
        if (f66138z == 0) {
            try {
                Class<?> cls = Class.forName("com.android.internal.R$dimen");
                f66138z = context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        }
        return f66138z;
    }

    public static int w(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int y(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static int z(Context context, float f10) {
        return (int) (f10 * context.getResources().getDisplayMetrics().density);
    }

    public static int z(Context context) {
        try {
            return context.getResources().getDisplayMetrics().densityDpi;
        } catch (Exception unused) {
            return -1;
        }
    }
}
