package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f21735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f21736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21737c;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f21735a = jArr;
        this.f21736b = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f21737c = 0L;
        } else {
            int i10 = length - 1;
            this.f21737c = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f21737c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f21735a[z.a(this.f21736b, j10, true)];
    }
}
