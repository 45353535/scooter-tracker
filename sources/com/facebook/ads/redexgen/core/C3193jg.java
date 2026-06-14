package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3193jg extends GQ {
    public C3193jg(C4R c4r, long j10, long j11) {
        super(new C3292lU(), new C3194jh(c4r), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255);
    }
}
