package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzrh extends Exception {
    public zzrh(long j10, long j11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 63 + String.valueOf(j10).length());
        sb2.append("Unexpected audio track timestamp discontinuity: expected ");
        sb2.append(j11);
        sb2.append(", got ");
        sb2.append(j10);
        super(sb2.toString());
    }
}
