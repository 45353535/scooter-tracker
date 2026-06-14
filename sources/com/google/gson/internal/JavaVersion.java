package com.google.gson.internal;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f33559a = a();

    private static int a() {
        return d(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb2.append(cCharAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int c(String str) {
        try {
            String[] strArrSplit = str.split("[._]", 3);
            int i10 = Integer.parseInt(strArrSplit[0]);
            return (i10 != 1 || strArrSplit.length <= 1) ? i10 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static int d(String str) {
        int iC = c(str);
        if (iC == -1) {
            iC = b(str);
        }
        if (iC == -1) {
            return 6;
        }
        return iC;
    }

    public static int getMajorJavaVersion() {
        return f33559a;
    }

    public static boolean isJava9OrLater() {
        return f33559a >= 9;
    }
}
