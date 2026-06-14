package com.startapp.sdk.internal;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerListener;

/* JADX INFO: loaded from: classes11.dex */
public final class n1 implements BannerCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f64951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.d f64952c;

    public n1(com.startapp.sdk.ads.banner.d dVar, View view) {
        this.f64952c = dVar;
        this.f64951b = view;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        if (this.f64950a) {
            throw new IllegalStateException();
        }
        com.startapp.sdk.ads.banner.d dVar = this.f64952c;
        dVar.f63757a = bannerListener;
        View view = this.f64951b;
        dVar.f63758b = view;
        view.addOnAttachStateChangeListener(new m1(this));
        this.f64950a = true;
        return this.f64951b;
    }
}
