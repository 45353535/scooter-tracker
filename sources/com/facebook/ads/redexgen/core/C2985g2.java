package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2985g2 extends AbstractC2316Oh {
    public static String[] A01 = {"TEi6qE8rkCQGgGy4v7NzSxsVq0pzva7O", "YDOvw0rnr4UKw3Mnxoslotwc24p8", "a0zjiBNZeYiCSuvwyHtYeell8KyTQ5xY", "ogjV6WpDB35FLp8RKY", "WANqVRIVKxhPnPWopei7e1k0CZWy62T", "aZZWj5Yt51SqLR33GVZjsdPHZCc7cpWa", "7MlacYU9Pwo9bfliYZC3slRrct3tH7Ko", "0XE4m45s2Z74YdVCvJuFI2R02XTQtmXa"};
    public final C2984g1 A00;

    public C2985g2(C2984g1 c2984g1) {
        this.A00 = c2984g1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2316Oh
    public final void A08(View view, PS ps) {
        super.A08(view, ps);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            QO layoutManager = this.A00.A01.getLayoutManager();
            if (A01[1].length() != 28) {
                throw new RuntimeException();
            }
            A01[4] = "lLG2rM4BR6TSMRI6WEis0bH1e3aTZeM";
            layoutManager.A1E(view, ps);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2316Oh
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1Z(view, i10, bundle);
        }
        return false;
    }
}
