package com.bytedance.sdk.component.adexpress.mml;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ljh;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    public static float lnr(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().ud();
        }
        return f10 * mml(context);
    }

    private static float mml(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int qdl(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static int ud(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().ud();
        }
        float fMml = mml(context);
        if (fMml <= 0.0f) {
            fMml = 1.0f;
        }
        return (int) ((f10 / fMml) + 0.5f);
    }

    public static float qdl(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().ud();
        }
        return (f10 * mml(context)) + 0.5f;
    }

    public static String lnr(@NonNull Context context) {
        String language;
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = ljh.ud(context).getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return qdl(language);
    }

    public static int ud(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().ud();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int qdl(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr().ud();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String qdl(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
