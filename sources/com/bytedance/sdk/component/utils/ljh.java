package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes6.dex */
public final class ljh {
    private static Resources lnr;
    private static String mml;
    private static boolean mo;
    private static boolean mzz;

    @SuppressLint({"StaticFieldLeak"})
    private static Context qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static String f16726ud;

    public static int jpc(Context context, String str) {
        return qdl(context, str, "color");
    }

    public static Drawable lnr(Context context, String str) {
        try {
            return ud(context).getDrawable(mml(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String mml(Context context) {
        if (mml == null) {
            mml = context.getPackageName();
        }
        return mml;
    }

    public static int mo(Context context, String str) {
        return qdl(context, str, "style");
    }

    public static int mzz(Context context, String str) {
        return qdl(context, str, "id");
    }

    public static void qdl(Context context) {
        qdl = context;
    }

    public static int tvp(Context context, String str) {
        return qdl(context, str, "anim");
    }

    public static int ud(Context context, String str) {
        return qdl(context, str, TypedValues.Custom.S_STRING);
    }

    public static int wd(Context context, String str) {
        return ud(context).getColor(jpc(context, str));
    }

    public static void qdl(String str) {
        mml = str;
    }

    public static Resources ud(Context context) {
        Resources resources = lnr;
        if (resources == null) {
            resources = null;
        }
        Context context2 = qdl;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static synchronized void lnr(Context context) {
        try {
            if (TextUtils.isEmpty(f16726ud)) {
                return;
            }
            mzz = true;
        } catch (Throwable th2) {
            Log.e("ResourceHelp", "makePluginResources failed", th2);
        }
    }

    private static int qdl(Context context, String str, String str2) {
        int identifier = ud(context).getIdentifier(str, str2, mml(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!mzz) {
            lnr(context);
            return ud(context).getIdentifier(str, str2, mml(context));
        }
        return context.getResources().getIdentifier(str, str2, mml(context));
    }

    public static int mml(Context context, String str) {
        try {
            return qdl(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String qdl(Context context, String str) {
        return ud(context).getString(ud(context, str));
    }
}
