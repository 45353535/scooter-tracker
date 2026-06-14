package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2983g0 extends QK {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(AbstractC2367Qg abstractC2367Qg);

    public abstract boolean A0Y(AbstractC2367Qg abstractC2367Qg);

    public abstract boolean A0Z(AbstractC2367Qg abstractC2367Qg, int i10, int i11, int i12, int i13);

    public abstract boolean A0a(AbstractC2367Qg abstractC2367Qg, AbstractC2367Qg abstractC2367Qg2, int i10, int i11, int i12, int i13);

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0N(AbstractC2367Qg abstractC2367Qg) {
        return !this.A00 || abstractC2367Qg.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0O(AbstractC2367Qg abstractC2367Qg, QJ qj, QJ qj2) {
        if (qj != null && (qj.A01 != qj2.A01 || qj.A03 != qj2.A03)) {
            return A0Z(abstractC2367Qg, qj.A01, qj.A03, qj2.A01, qj2.A03);
        }
        return A0X(abstractC2367Qg);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0P(AbstractC2367Qg abstractC2367Qg, QJ qj, QJ qj2) {
        int i10 = qj.A01;
        int oldLeft = qj.A03;
        View view = abstractC2367Qg.A0H;
        int oldTop = qj2 == null ? view.getLeft() : qj2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = qj2 == null ? view.getTop() : qj2.A03;
        if (!abstractC2367Qg.A0g() && (i10 != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0Z(abstractC2367Qg, i10, oldLeft, oldTop, top);
        }
        return A0Y(abstractC2367Qg);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0Q(AbstractC2367Qg abstractC2367Qg, QJ qj, QJ qj2) {
        if (qj.A01 != qj2.A01 || qj.A03 != qj2.A03) {
            return A0Z(abstractC2367Qg, qj.A01, qj.A03, qj2.A01, qj2.A03);
        }
        A0U(abstractC2367Qg);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0R(AbstractC2367Qg abstractC2367Qg, AbstractC2367Qg abstractC2367Qg2, QJ qj, QJ qj2) {
        int i10;
        int i11;
        int i12 = qj.A01;
        int i13 = qj.A03;
        if (abstractC2367Qg2.A0l()) {
            i10 = qj.A01;
            i11 = qj.A03;
        } else {
            i10 = qj2.A01;
            i11 = qj2.A03;
        }
        return A0a(abstractC2367Qg, abstractC2367Qg2, i12, i13, i10, i11);
    }

    public final void A0T(AbstractC2367Qg abstractC2367Qg) {
        A0K(abstractC2367Qg);
    }

    public final void A0U(AbstractC2367Qg abstractC2367Qg) {
        A0K(abstractC2367Qg);
    }

    public final void A0V(AbstractC2367Qg abstractC2367Qg) {
        A0K(abstractC2367Qg);
    }

    public final void A0W(AbstractC2367Qg abstractC2367Qg, boolean z10) {
        A0K(abstractC2367Qg);
    }
}
