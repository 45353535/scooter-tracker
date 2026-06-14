package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f23113b = new long[32];

    public final void a(long j10) {
        int i10 = this.f23112a;
        long[] jArr = this.f23113b;
        if (i10 == jArr.length) {
            this.f23113b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f23113b;
        int i11 = this.f23112a;
        this.f23112a = i11 + 1;
        jArr2[i11] = j10;
    }
}
