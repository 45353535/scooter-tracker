package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3150ix implements InterfaceC18314w {
    public static String[] A08 = {"FmqEYLEjOBovlIuvu7xTusZ6GIuR3pge", "QeU0DUuOAkxor0HSqOzEAO6P6r4bp110", "WNDsEfwHyCZVTn6rYNycLV5FNYvDeUGR", "", "9kl6sBOZXnbWpCxdvxnR8wYz13jzyZGc", "QdIGCZBZzwjOBdbigrYBFiKU6cV", "ZYM92CzuhlmQLmzBChoRToTytAMTrYW0", "W1yocJmlBB3ILJesLtmFt5l7ilHzoTT3"};
    public int A00;
    public int A01;
    public InterfaceC18284t A02;
    public InterfaceC18314w A04;
    public InterfaceC2247Ln A05;
    public boolean A07;
    public InterfaceC18314w A03 = new C3428nh();
    public InterfaceC2256Lw A06 = InterfaceC2256Lw.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC18314w
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C7S A5A() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00, this.A01);
    }

    private C7S A01(InterfaceC3432nl interfaceC3432nl, int i10, int i11) {
        C3151iy c3151iyA59;
        InterfaceC2247Ln interfaceC2247Ln = (InterfaceC2247Ln) C3M.A01(this.A05);
        if (this.A07 || interfaceC3432nl == null) {
            c3151iyA59 = null;
        } else if (this.A02 != null) {
            InterfaceC18284t interfaceC18284t = this.A02;
            String[] strArr = A08;
            if (strArr[6].charAt(29) == strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "BsDku37cs2h0edzjFuAGMntAOCTwp5qB";
            strArr2[1] = "0s0KxP1bBIf3QxkhX8XEl0TpXhOFUtvY";
            c3151iyA59 = interfaceC18284t.A59();
        } else {
            c3151iyA59 = new C3152iz().A00(interfaceC2247Ln).A59();
        }
        return new C7S(interfaceC2247Ln, interfaceC3432nl, this.A03.A5A(), c3151iyA59, this.A06, i10, null, i11, null);
    }

    public final AnonymousClass31 A02() {
        return null;
    }

    public final C3150ix A03(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C3150ix A04(InterfaceC18314w interfaceC18314w) {
        this.A03 = interfaceC18314w;
        return this;
    }

    public final C3150ix A05(InterfaceC18314w interfaceC18314w) {
        this.A04 = interfaceC18314w;
        return this;
    }

    public final C3150ix A06(InterfaceC2247Ln interfaceC2247Ln) {
        this.A05 = interfaceC2247Ln;
        return this;
    }

    public final C7S A07() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00 | 1, -1000);
    }
}
