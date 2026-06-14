package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LE extends QC<FD> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC2551Xn A03;
    public C2893eX A04;
    public String A05;
    public List<C2787cn> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC3095hy A08;
    public final SF A09;
    public final C2820dL A0A;
    public final US A0B;
    public final C2363Qc A0C;
    public final XH A0D;
    public final C18535s A0E;
    public final C2023Cw A0F;

    public LE(C2820dL c2820dL, List<C2787cn> list, AbstractC3095hy abstractC3095hy, US us, C2363Qc c2363Qc, InterfaceC2551Xn interfaceC2551Xn, String str, C18535s c18535s, C2023Cw c2023Cw) {
        this.A0A = c2820dL;
        this.A0B = us;
        this.A0C = c2363Qc;
        this.A09 = c2363Qc.A11();
        this.A04 = c2363Qc.A1B();
        this.A0D = c2363Qc.A1A();
        this.A03 = interfaceC2551Xn;
        this.A08 = abstractC3095hy;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c18535s;
        this.A0F = c2023Cw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FD A0F(ViewGroup viewGroup, int i10) {
        return new FD(AbstractC2621a6.A00(new C2657ah(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0T(this.A0F).A0O(this.A0C).A0W(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FD fd2, int i10) {
        C2787cn c2787cn = this.A06.get(i10);
        fd2.A0q(this.A04);
        fd2.A0p(c2787cn, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C2893eX c2893eX) {
        this.A04 = c2893eX;
    }
}
