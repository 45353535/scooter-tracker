package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;

/* JADX INFO: loaded from: classes11.dex */
public final class l1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f64846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.b f64847c;

    public l1(com.startapp.sdk.ads.banner.b bVar, BannerStandard bannerStandard) {
        this.f64847c = bVar;
        this.f64846b = bannerStandard;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f64845a) {
            return;
        }
        this.f64845a = true;
        this.f64846b.removeOnAttachStateChangeListener(this);
        this.f64846b.onReceiveAd(this.f64847c.f63681b.f63756d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
