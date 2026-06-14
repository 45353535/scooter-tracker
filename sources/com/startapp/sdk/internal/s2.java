package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* JADX INFO: loaded from: classes11.dex */
public final class s2 implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2 f65237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f65238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f65239c;

    public s2(x2 x2Var, w2 w2Var, boolean z10) {
        this.f65239c = x2Var;
        this.f65237a = w2Var;
        this.f65238b = z10;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad2) {
        x2 x2Var = this.f65239c;
        x2Var.f65514o = null;
        x2Var.a(null, this.f65238b);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad2) {
        a0.b(this.f65239c.f65500a, this.f65237a, ad2, true);
    }
}
