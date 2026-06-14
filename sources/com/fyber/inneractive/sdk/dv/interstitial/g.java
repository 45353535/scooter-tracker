package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f20544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f20545l;

    public g(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f20544k = new e(this);
        this.f20545l = new f(this);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f20518g = cVar;
        InterstitialAd interstitialAd = new InterstitialAd(o.f23888a);
        this.f20520i = interstitialAd;
        interstitialAd.setAdListener(this.f20544k);
        ((InterstitialAd) this.f20520i).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.f20520i).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        Object obj = this.f20520i;
        return obj != null && ((InterstitialAd) obj).isLoaded();
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(a aVar, Activity activity) {
        this.f20109j = aVar;
        Object obj = this.f20520i;
        if (obj != null) {
            ((InterstitialAd) obj).setAdListener(this.f20545l);
            ((InterstitialAd) this.f20520i).show();
        }
    }
}
