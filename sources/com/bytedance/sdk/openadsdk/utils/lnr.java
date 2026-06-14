package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    public static int qdl = -1;

    public static int qdl(Context context, int i10, int i11) {
        int iQdl = qdl(context, i11);
        if (iQdl == -1) {
            return qdl;
        }
        return Math.max(Math.min(i10 > 655 ? Math.round((i10 / 728.0f) * 90.0f) : i10 > 632 ? 81 : i10 > 526 ? Math.round((i10 / 468.0f) * 60.0f) : i10 > 432 ? 68 : Math.round((i10 / 320.0f) * 50.0f), Math.min(90, Math.round(iQdl * 0.15f))), 50);
    }

    public static int qdl(Context context, int i10) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (configuration = resources.getConfiguration()) != null) {
                    int i11 = configuration.orientation;
                    if (i10 == 0) {
                        i10 = i11;
                    }
                    if (i10 == i11) {
                        return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                    }
                    return Math.round(displayMetrics.widthPixels / displayMetrics.density);
                }
            } catch (Throwable unused) {
                return qdl;
            }
        }
        return qdl;
    }
}
