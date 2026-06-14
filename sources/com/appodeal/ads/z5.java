package com.appodeal.ads;

import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z5 extends a4 {
    public z5() {
        super(h6.f13388b);
    }

    @Override // com.appodeal.ads.i2
    public final void P(te teVar, uc ucVar) {
        int i10;
        q7 adRequest = (q7) teVar;
        l7 adObject = (l7) ucVar;
        if (h6.f13390d == null) {
            h6.f13390d = new q3();
        }
        h6.f13390d.getClass();
        com.appodeal.ads.context.o oVar = com.appodeal.ads.context.o.f13205b;
        AudioManager audioManager = (AudioManager) oVar.f13206a.getApplicationContext().getSystemService("audio");
        if (audioManager != null && db.f13243e && audioManager.getStreamVolume(3) == 0 && (i10 = db.f13244f) != -1) {
            audioManager.setStreamVolume(3, i10, 0);
        }
        q3.f14290a.set(false);
        this.f13410c.f13582v = null;
        adObject.f14936b.setInterstitialShowing(false);
        if (!adRequest.f14913y && this.f13410c.w() > 0 && adRequest.f14900l > 0 && System.currentTimeMillis() - adRequest.f14900l >= this.f13410c.w()) {
            Intrinsics.checkNotNullParameter(adRequest, "adRequest");
            Intrinsics.checkNotNullParameter(adObject, "adObject");
            Y(adRequest, adObject, null);
        }
        if (adRequest.f14895g) {
            return;
        }
        l0 l0Var = this.f13410c;
        if (l0Var.f13572l) {
            q7 q7Var = (q7) l0Var.A();
            if (q7Var == null || q7Var.h()) {
                this.f13410c.t(oVar.f13206a.getApplicationContext());
            }
        }
    }

    @Override // com.appodeal.ads.i2
    public final void a0(te teVar, uc ucVar) {
        super.a0((q7) teVar, (l7) ucVar);
        q3.f14290a.set(false);
    }

    @Override // com.appodeal.ads.i2
    public final void d0(te teVar, uc ucVar) {
        ((l7) ucVar).f14936b.setInterstitialShowing(true);
    }
}
