package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2984g1 extends AbstractC2316Oh {
    public final AbstractC2316Oh A00 = new C2985g2(this);
    public final C18676g A01;

    public C2984g1(C18676g c18676g) {
        this.A01 = c18676g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2316Oh
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C18676g.class.getName());
        if ((view instanceof C18676g) && !A0B()) {
            C18676g c18676g = (C18676g) view;
            if (c18676g.getLayoutManager() != null) {
                c18676g.getLayoutManager().A1v(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2316Oh
    public final void A08(View view, PS ps) {
        super.A08(view, ps);
        ps.A0O(C18676g.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1H(ps);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2316Oh
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1X(i10, bundle);
        }
        return false;
    }

    public final AbstractC2316Oh A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
