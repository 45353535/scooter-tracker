package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f20540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f20541l;

    public d(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f20540k = new b(this);
        this.f20541l = new c(this);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f20518g = cVar;
        InterstitialAd.load(o.f23888a, "FyberInterstitial", adRequest, this.f20540k);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f20520i != null;
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(a aVar, Activity activity) {
        this.f20109j = aVar;
        Object obj = this.f20520i;
        if (obj != null) {
            ((InterstitialAd) obj).setFullScreenContentCallback(this.f20541l);
            ((InterstitialAd) this.f20520i).show(activity);
        }
    }
}
