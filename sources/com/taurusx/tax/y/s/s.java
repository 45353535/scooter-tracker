package com.taurusx.tax.y.s;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes11.dex */
public class s {
    public static int w(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int z(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }
}
