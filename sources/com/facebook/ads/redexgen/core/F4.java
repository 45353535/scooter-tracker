package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F4 extends QC<C2074Ev> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC2550Xm A04;
    public InterfaceC2551Xn A05;
    public String A06;
    public List<C2787cn> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC3095hy A0A;
    public final SF A0B;
    public final C2820dL A0C;
    public final US A0D;
    public final XH A0E;
    public final FH A0F;
    public final C2893eX A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public F4(C2820dL c2820dL, List<C2787cn> list, AbstractC3095hy abstractC3095hy, US us, SF sf2, C2893eX c2893eX, XH xh2, InterfaceC2551Xn interfaceC2551Xn, String str, int i10, int i11, int i12, int i13, FH fh2, AbstractC2550Xm abstractC2550Xm) {
        this.A0C = c2820dL;
        this.A0D = us;
        this.A0B = sf2;
        this.A0G = c2893eX;
        this.A0E = xh2;
        this.A05 = interfaceC2551Xn;
        this.A0A = abstractC3095hy;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = fh2;
        this.A04 = abstractC2550Xm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C2074Ev A0F(ViewGroup viewGroup, int i10) {
        return new C2074Ev(AbstractC2717bf.A00(new C2657ah(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0R(this.A04).A0W(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C2074Ev c2074Ev, int i10) {
        c2074Ev.A0q(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            c2074Ev.AIV();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A07.size();
    }
}
