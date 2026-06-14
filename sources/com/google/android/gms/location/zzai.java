package com.google.android.gms.location;

/* JADX INFO: loaded from: classes8.dex */
public final class zzai {
    public static String zza(int i10) {
        if (i10 == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i10 == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i10 == 2) {
            return "THROTTLE_NEVER";
        }
        throw new IllegalArgumentException();
    }
}
