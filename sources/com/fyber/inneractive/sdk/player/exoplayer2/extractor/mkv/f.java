package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f22059a = new n(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22060b;

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        int i10 = 0;
        bVar.a(this.f22059a.f23134a, 0, 1, false);
        int i11 = this.f22059a.f23134a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        bVar.a(this.f22059a.f23134a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.f22059a.f23134a[i10] & 255) + (i14 << 8);
        }
        this.f22060b = i13 + 1 + this.f22060b;
        return i14;
    }
}
