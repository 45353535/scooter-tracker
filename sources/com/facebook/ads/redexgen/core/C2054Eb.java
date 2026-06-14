package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2054Eb extends QC<EZ> {
    public final int A00;
    public final C2820dL A01;
    public final KE A02;
    public final List<String> A03;

    public C2054Eb(C2820dL c2820dL, List<String> screenshotUrls, int i10, KE ke2) {
        this.A03 = screenshotUrls;
        this.A00 = i10;
        this.A01 = c2820dL;
        this.A02 = ke2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final EZ A0F(ViewGroup viewGroup, int i10) {
        C2053Ea c2053Ea = new C2053Ea(this.A01);
        if (U7.A1C(this.A01)) {
            c2053Ea.setOnClickListener(new ViewOnClickListenerC2816dH(this));
        }
        return new EZ(c2053Ea);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0K(EZ ez, int i10) {
        String str = this.A03.get(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i10 != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i10 >= A0B() + (-1) ? this.A00 * 4 : this.A00, 0);
        ez.A0p().setLayoutParams(marginLayoutParams);
        ez.A0p().A00(str);
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A03.size();
    }
}
