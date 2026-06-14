package com.appodeal.ads;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes6.dex */
public final class we extends a4 {
    public we() {
        super(af.f12643a);
    }

    @Override // com.appodeal.ads.i2
    public final boolean B() {
        return true;
    }

    @Override // com.appodeal.ads.i2
    public final void P(te teVar, uc ucVar) {
        int i10;
        ce ceVar = (ce) teVar;
        vd vdVar = (vd) ucVar;
        if (af.f12647e == null) {
            af.f12647e = new q3();
        }
        af.f12647e.getClass();
        com.appodeal.ads.context.o oVar = com.appodeal.ads.context.o.f13205b;
        AudioManager audioManager = (AudioManager) oVar.f13206a.getApplicationContext().getSystemService("audio");
        if (audioManager != null && db.f13243e && audioManager.getStreamVolume(3) == 0 && (i10 = db.f13244f) != -1) {
            audioManager.setStreamVolume(3, i10, 0);
        }
        q3.f14290a.set(false);
        this.f13410c.f13582v = null;
        vdVar.f14936b.setRewardedShowing(false);
        if (ceVar.f14895g) {
            return;
        }
        l0 l0Var = this.f13410c;
        if (l0Var.f13572l) {
            ce ceVar2 = (ce) l0Var.A();
            if (ceVar2 == null || ceVar2.h()) {
                this.f13410c.t(oVar.f13206a.getApplicationContext());
            }
        }
    }

    @Override // com.appodeal.ads.i2
    public final void a0(te teVar, uc ucVar) {
        super.a0((ce) teVar, (vd) ucVar);
        q3.f14290a.set(false);
    }

    @Override // com.appodeal.ads.i2
    public final void d0(te teVar, uc ucVar) {
        ((vd) ucVar).f14936b.setRewardedShowing(true);
    }

    @Override // com.appodeal.ads.i2
    public final /* bridge */ /* synthetic */ boolean m0(te teVar, uc ucVar) {
        return false;
    }
}
