package com.startapp.sdk.internal;

import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f65193a;

    static {
        String[] strArrA = a("[k1]{v1|v2}[k2]{v1|v2}");
        WeakHashMap weakHashMap = vi.f65408a;
        strArrA.getClass();
        f65193a = strArrA;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap a(int r9, java.util.Map r10, com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig r11) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.r8.a(int, java.util.Map, com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig):java.util.HashMap");
    }

    public static String[] a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = Pattern.compile("^(.*)k1(.*)v1(.*)v2(.*)k2(.*)v1(.*)v2(.*)$").matcher(str);
            if (matcher.matches()) {
                return new String[]{matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), matcher.group(5), matcher.group(6), matcher.group(7)};
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
