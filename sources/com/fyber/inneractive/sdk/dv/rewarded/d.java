package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends com.fyber.inneractive.sdk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f20551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f20552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f20553m;

    public d(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f20551k = new a(this);
        this.f20552l = new b(this);
        this.f20553m = new c(this);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f20518g = cVar;
        RewardedAd.load(o.f23888a, "FyberRewarded", adRequest, this.f20551k);
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
    public final void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f20109j = aVar;
        Object obj = this.f20520i;
        if (obj != null) {
            ((RewardedAd) obj).setFullScreenContentCallback(this.f20552l);
            ((RewardedAd) this.f20520i).show(activity, this.f20553m);
        }
    }
}
