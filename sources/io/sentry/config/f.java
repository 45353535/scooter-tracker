package io.sentry.config;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {
    public static Boolean a(g gVar, String str) {
        String strH = gVar.h(str);
        if (strH != null) {
            return Boolean.valueOf(strH);
        }
        return null;
    }

    public static Double b(g gVar, String str) {
        String strH = gVar.h(str);
        if (strH == null) {
            return null;
        }
        try {
            return Double.valueOf(strH);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static List c(g gVar, String str) {
        String strH = gVar.h(str);
        return strH != null ? Arrays.asList(strH.split(StringUtils.COMMA)) : Collections.EMPTY_LIST;
    }

    public static List d(g gVar, String str) {
        String strH = gVar.h(str);
        if (strH != null) {
            return Arrays.asList(strH.split(StringUtils.COMMA));
        }
        return null;
    }

    public static Long e(g gVar, String str) {
        String strH = gVar.h(str);
        if (strH == null) {
            return null;
        }
        try {
            return Long.valueOf(strH);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(g gVar, String str, String str2) {
        String strH = gVar.h(str);
        return strH != null ? strH : str2;
    }
}
