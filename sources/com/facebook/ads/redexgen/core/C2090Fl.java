package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2090Fl implements InterfaceC2549Xl {
    public static String[] A01 = {"ziFc1AxLwl06l9cm2ro8EEkTqcfxuLTc", "Ot3h47XlIqwqlb0VDKX34tYNREgAb88h", "XErmhi3UBKLFfekLEXmFG5T5AXnu", "x4ahbzSdp8w2tJq97wkZytqruvrbxvGd", "5eNtQA6JlDjBFR49aczWqHsgt2phfPFu", "5gzf4", "tgwS2khKEZgsCudiehRL6tpdm2kFQW", "Wy"};
    public final /* synthetic */ C18003r A00;

    public C2090Fl(C18003r c18003r) {
        this.A00 = c18003r;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549Xl
    public final void ACC(AbstractC2550Xm abstractC2550Xm) {
        if (abstractC2550Xm.getToolbarActionMode() == 8) {
            this.A00.A0e();
            return;
        }
        ((G2) this.A00).A06.A04(UZ.A07, null);
        if (this.A00.A0i()) {
            return;
        }
        InterfaceC2551Xn interfaceC2551Xn = ((G2) this.A00).A09;
        YY yy = ((G2) this.A00).A0A;
        if (A01[7].length() != 2) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "aiGFPxx8CXfEdquuZVm2W5wuPm6cCNUb";
        strArr[3] = "iaZJUoQxe1noplKpEgf5PzuXPp1HxeHv";
        interfaceC2551Xn.A4b(yy.A7o());
    }
}
