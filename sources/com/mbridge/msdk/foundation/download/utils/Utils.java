package com.mbridge.msdk.foundation.download.utils;

/* JADX INFO: loaded from: classes10.dex */
public final class Utils {
    private Utils() {
    }

    public static int getDownloadRate(long j10, long j11) {
        if (j10 == 0 || j11 == 0) {
            return 0;
        }
        if (j10 == j11) {
            return 100;
        }
        return (int) (((j11 * 1.0d) / (j10 * 1.0d)) * 100.0d);
    }
}
