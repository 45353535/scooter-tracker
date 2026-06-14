package com.bytedance.adsdk.ugeno.wd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes6.dex */
public final class mml {

    @SuppressLint({"StaticFieldLeak"})
    private static Context lnr;
    private static String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static Resources f16272ud;

    public static void qdl(String str) {
        qdl = str;
    }

    public static int ud(Context context, String str) {
        return qdl(context, str, "drawable");
    }

    private static String qdl(Context context) {
        if (qdl == null) {
            qdl = context.getPackageName();
        }
        return qdl;
    }

    private static int qdl(Context context, String str, String str2) {
        if (f16272ud == null) {
            f16272ud = context.getResources();
        }
        return f16272ud.getIdentifier(str, str2, qdl(context));
    }

    public static int qdl(Context context, String str) {
        return qdl(context, str, "raw");
    }
}
