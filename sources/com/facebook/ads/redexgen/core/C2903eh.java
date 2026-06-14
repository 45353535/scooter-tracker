package com.facebook.ads.redexgen.core;

import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2903eh {
    public C2907el A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C2903eh A00(C2907el c2907el) {
        this.A00 = c2907el;
        return this;
    }

    public final C2903eh A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C2903eh A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C2903eh A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final C2903eh A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final C2904ei A05() {
        return new C2904ei(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
