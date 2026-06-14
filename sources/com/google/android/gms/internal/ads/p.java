package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class p {
    public static /* synthetic */ long a(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j11 ^ j10) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }
}
