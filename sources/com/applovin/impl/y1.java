package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

/* JADX INFO: loaded from: classes6.dex */
public class y1 extends v1 {
    public y1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.v1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f11127d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f11126c.n(), (this.f11126c.u0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f11127d.addView(kVar, this.f11128e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f11127d);
        } else {
            this.f11125b.setContentView(this.f11127d);
        }
    }
}
