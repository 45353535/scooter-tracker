package com.taurusx.tax.a.z;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.ironsource.D5;
import com.taurusx.tax.g.n;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class w {
    public static Map<String, String> c() {
        HashMap map = new HashMap();
        map.put("Content-Type", D5.L);
        map.put(HttpHeaders.ACCEPT_ENCODING, "identity");
        String str = n.R;
        map.put("x-ssp-ce", str);
        map.put("x-ssp-ae", str);
        return map;
    }

    public static String w(Context context) {
        return com.taurusx.tax.w.o.w.f67368p;
    }

    public static String[] y(Context context) {
        String str = com.taurusx.tax.w.o.w.f67368p;
        return new String[]{str, str, com.taurusx.tax.w.o.w.f67361i, com.taurusx.tax.w.o.w.f67373v};
    }

    public static String z(Context context) {
        if (com.taurusx.tax.w.z.t().m()) {
            return com.taurusx.tax.w.o.w.f67375x;
        }
        String strP = com.taurusx.tax.w.o.w.p();
        return TextUtils.isEmpty(strP) ? com.taurusx.tax.w.o.w.f67364l : strP;
    }

    public static Map<String, String> w() {
        HashMap map = new HashMap();
        map.put("Content-Type", D5.L);
        map.put("x-ssp-ce", n.R);
        return map;
    }

    public static Map<String, String> y() {
        HashMap map = new HashMap();
        map.put("x-ssp-ae", n.R);
        return map;
    }

    public static Map<String, String> z() {
        HashMap map = new HashMap();
        map.put("x-ssp-ce", "aes");
        return map;
    }

    public static byte[] z(String str) {
        if (str != null && str.length() > 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(str.getBytes());
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
