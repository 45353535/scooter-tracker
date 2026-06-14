package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2769cV {
    public String A02;
    public String A03;
    public String A04;
    public final C2281Mw A06;
    public final N9 A07;
    public final C2820dL A08;
    public C2283My A01 = C2283My.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C2769cV(C2820dL c2820dL, C2281Mw c2281Mw, N9 n92) {
        this.A08 = c2820dL;
        this.A06 = c2281Mw;
        this.A07 = n92;
    }

    public final C2769cV A09(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C2769cV A0A(C2283My c2283My) {
        this.A01 = c2283My;
        return this;
    }

    public final C2769cV A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C2769cV A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C2769cV A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C2769cV A0E(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final C2771cX A0F() {
        return new C2771cX(this, null);
    }
}
