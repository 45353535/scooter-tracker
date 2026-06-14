package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* JADX INFO: loaded from: classes11.dex */
public final class m1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f64904b;

    public m1(n1 n1Var) {
        this.f64904b = n1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f64903a) {
            return;
        }
        this.f64903a = true;
        this.f64904b.f64952c.f63758b.removeOnAttachStateChangeListener(this);
        com.startapp.sdk.ads.banner.d dVar = this.f64904b.f64952c;
        BannerListener bannerListener = dVar.f63757a;
        if (bannerListener != null) {
            bannerListener.onReceiveAd(dVar.f63758b);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
