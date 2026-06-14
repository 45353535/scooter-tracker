package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YU implements InterfaceC2497Vj {
    @Override // com.facebook.ads.redexgen.core.InterfaceC2497Vj
    public final void AHp(Throwable th2, Object obj) {
        if (obj instanceof SM) {
            C2820dL adContext = ((SM) obj).A6e();
            if (adContext != null) {
                adContext.A0Q(th2);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C2820dL)) {
            return;
        }
        ((C2820dL) context).A0Q(th2);
    }
}
