package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.mediation.ads.a;

/* JADX INFO: loaded from: classes6.dex */
public class b implements g8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d3 f9492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g8 f9493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f8 f9494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0175a f9495e;

    public b(d3 d3Var, ViewGroup viewGroup, a.InterfaceC0175a interfaceC0175a, com.applovin.impl.sdk.k kVar) {
        this.f9491a = kVar;
        this.f9492b = d3Var;
        this.f9495e = interfaceC0175a;
        this.f9494d = new f8(viewGroup, kVar);
        g8 g8Var = new g8(viewGroup, kVar, this);
        this.f9493c = g8Var;
        g8Var.a(d3Var);
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f9493c.b();
    }

    public d3 b() {
        return this.f9492b;
    }

    public void c() {
        this.f9491a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9491a.O().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f9492b.u0().compareAndSet(false, true)) {
            this.f9491a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9491a.O().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f9492b.getNativeAd().isExpired()) {
                com.applovin.impl.sdk.o.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f9491a.f().a(this.f9492b);
            }
            this.f9491a.X().processRawAdImpression(this.f9492b, this.f9495e);
        }
    }

    @Override // com.applovin.impl.g8.a
    public void onLogVisibilityImpression() {
        a(this.f9494d.a(this.f9492b));
    }

    private void a(long j10) {
        if (this.f9492b.v0().compareAndSet(false, true)) {
            this.f9491a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9491a.O().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f9491a.X().processViewabilityAdImpressionPostback(this.f9492b, j10, this.f9495e);
        }
    }
}
