package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3152iz implements InterfaceC18284t {
    public InterfaceC2247Ln A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C3152iz A00(InterfaceC2247Ln interfaceC2247Ln) {
        this.A02 = interfaceC2247Ln;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC18284t
    public final C3151iy A59() {
        return new C3151iy((InterfaceC2247Ln) C3M.A01(this.A02), this.A01, this.A00);
    }
}
