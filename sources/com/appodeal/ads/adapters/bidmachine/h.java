package com.appodeal.ads.adapters.bidmachine;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12090a = new Object();

    public static double a(Object obj) {
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).doubleValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                try {
                    return str.lastIndexOf(46) > str.lastIndexOf(44) ? NumberFormat.getInstance(Locale.TAIWAN).parse(str).doubleValue() : NumberFormat.getInstance().parse(str).doubleValue();
                } catch (Exception unused) {
                }
            }
        }
        return -1.0d;
    }

    public static String[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        try {
            return str.split(StringUtils.COMMA);
        } catch (Exception unused) {
            return new String[0];
        }
    }
}
