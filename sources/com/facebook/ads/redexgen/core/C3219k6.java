package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3219k6 implements J7 {
    public final C2192Jk A00;
    public final Map<String, C2199Jr> A01;
    public final Map<String, String> A02;
    public final Map<String, C2193Jl> A03;
    public final long[] A04;

    public C3219k6(C2192Jk c2192Jk, Map<String, C2199Jr> map, Map<String, C2193Jl> map2, Map<String, String> imageMap) {
        this.A00 = c2192Jk;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = c2192Jk.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C3448o2> A7P(long j10) {
        return this.A00.A0E(j10, this.A01, this.A03, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i10) {
        return this.A04[i10];
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return this.A04.length;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j10) {
        int iA0K = AbstractC18094a.A0K(this.A04, j10, false, false);
        int index = this.A04.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
