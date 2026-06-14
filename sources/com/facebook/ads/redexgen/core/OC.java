package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OC extends QT {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C17140h A00;

    public OC(C17140h c17140h) {
        this.A00 = c17140h;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0L(C18676g c18676g, int i10) {
        int iA25;
        InterfaceC2558Xu interfaceC2558Xu;
        super.A0L(c18676g, i10);
        C3000gI linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (iA25 = linearLayoutManager.A25()) >= 0) {
            C17140h c17140h = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c17140h.getAdapter() == null || iA25 >= this.A00.getAdapter().A0B() || (interfaceC2558Xu = (InterfaceC2558Xu) c18676g.A1F(iA25)) == null) {
                return;
            }
            interfaceC2558Xu.AIV();
        }
    }
}
