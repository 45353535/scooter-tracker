package com.ironsource.environment;

import com.ironsource.C4462o4;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class StringUtils {
    public static String decodeURI(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    public static String encodeURI(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }

    public static String toLowerCase(String str) {
        return str == null ? "" : str.toLowerCase(Locale.ENGLISH);
    }

    public static String toUpperCase(String str) {
        return str == null ? "" : str.toUpperCase(Locale.ENGLISH);
    }
}
