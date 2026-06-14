package io.sentry.util;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.sentry.ILogger;
import io.sentry.g7;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f84296a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f84297b = Pattern.compile("[\\W_]+");

    public static String a(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(str.getBytes(f84296a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e10) {
                iLogger.a(g7.INFO, "SHA-1 isn't available to calculate the hash.", e10);
            } catch (Throwable th2) {
                iLogger.c(g7.INFO, "string: %s could not calculate its hash", th2, str);
            }
        }
        return null;
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] strArrSplit = f84297b.split(str, -1);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb2.append(c(str2));
        }
        return sb2.toString();
    }

    public static String c(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(strSubstring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    public static String d(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return (iLastIndexOf < 0 || str.length() <= (i10 = iLastIndexOf + 1)) ? str : str.substring(i10);
    }

    public static String e(String str) {
        return str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
    }

    public static String f(String str, String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }

    public static String g(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
