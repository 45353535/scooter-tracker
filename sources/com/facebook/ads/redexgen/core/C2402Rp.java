package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2402Rp {
    public final long A00;
    public final EnumC2401Ro A01;
    public final String A02;
    public final boolean A03;

    public C2402Rp(String str, boolean z10, EnumC2401Ro enumC2401Ro) {
        this(str, z10, enumC2401Ro, System.currentTimeMillis());
    }

    public C2402Rp(String str, boolean z10, EnumC2401Ro enumC2401Ro, long j10) {
        this.A02 = str;
        this.A03 = z10;
        this.A01 = enumC2401Ro;
        this.A00 = j10;
    }

    public static C2402Rp A00() {
        return new C2402Rp("", true, EnumC2401Ro.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC2401Ro A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
