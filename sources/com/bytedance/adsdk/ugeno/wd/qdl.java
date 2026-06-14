package com.bytedance.adsdk.ugeno.wd;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.wd.qdl$qdl, reason: collision with other inner class name */
    public static class C0216qdl {
        public float[] lnr;
        public GradientDrawable.Orientation qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public int[] f16274ud;
    }

    public static boolean lnr(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static GradientDrawable.Orientation mml(String str) {
        try {
            int i10 = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            return i10 == 90 ? GradientDrawable.Orientation.LEFT_RIGHT : i10 == 180 ? GradientDrawable.Orientation.TOP_BOTTOM : i10 == 270 ? GradientDrawable.Orientation.RIGHT_LEFT : i10 == 135 ? GradientDrawable.Orientation.TL_BR : i10 == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int qdl(String str) {
        return qdl(str, ViewCompat.MEASURED_STATE_MASK);
    }

    public static C0216qdl ud(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            int iQdl = qdl(strSubstring, '%');
            int iIndexOf = strSubstring.indexOf(StringUtils.COMMA);
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0216qdl c0216qdl = new C0216qdl();
            c0216qdl.qdl = mml(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[iQdl];
            float[] fArr = new float[iQdl];
            for (int i10 = 0; i10 < iQdl; i10++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(" ")) + 1;
                iArr[i10] = qdl(strTrim.substring(0, iIndexOf3).trim());
                fArr[i10] = lnr.qdl(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
                int i11 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i11) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i11);
            }
            if (iQdl < 2) {
                return null;
            }
            c0216qdl.f16274ud = iArr;
            c0216qdl.lnr = fArr;
            return c0216qdl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int qdl(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(C4240b4.i.T)) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb2 = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i11 = 1; i11 < charArray.length; i11++) {
                    sb2.append(charArray[i11]);
                    sb2.append(charArray[i11]);
                }
                return Color.parseColor(sb2.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return ViewCompat.MEASURED_STATE_MASK;
            }
            String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(StringUtils.COMMA);
            if (strArrSplit != null && strArrSplit.length == 4) {
                return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
            }
        }
        return i10;
    }

    public static int qdl(String str, char c10) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        return i10;
    }

    public static int qdl(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i11 = 255;
        }
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (i11 << 24);
    }
}
