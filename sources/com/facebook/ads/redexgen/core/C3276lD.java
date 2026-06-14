package com.facebook.ads.redexgen.core;

import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3276lD extends GQ {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3276lD(final C2112Gh c2112Gh, int i10, long j10, long j11) {
        super(new GL() { // from class: com.facebook.ads.redexgen.X.lF
            @Override // com.facebook.ads.redexgen.core.GL
            public final long AJf(long j12) {
                return c2112Gh.A07(j12);
            }
        }, new C3277lE(c2112Gh, i10), c2112Gh.A06(), 0L, c2112Gh.A09, j10, j11, c2112Gh.A05(), Math.max(6, c2112Gh.A06));
        Objects.requireNonNull(c2112Gh);
    }
}
