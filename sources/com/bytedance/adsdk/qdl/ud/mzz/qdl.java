package com.bytedance.adsdk.qdl.ud.mzz;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public static boolean lnr(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean mml(char c10) {
        return '+' == c10 || '-' == c10 || '*' == c10 || '/' == c10 || '%' == c10 || '=' == c10 || '>' == c10 || '<' == c10 || '!' == c10 || '&' == c10 || '|' == c10 || '?' == c10 || ':' == c10;
    }

    public static boolean qdl(char c10) {
        return c10 == ' ';
    }

    public static boolean ud(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }
}
