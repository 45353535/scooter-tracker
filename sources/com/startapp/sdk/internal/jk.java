package com.startapp.sdk.internal;

import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class jk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f64800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Point f64801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerOptions f64802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.bannerstandard.e f64803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk f64804e;

    public jk(kk kkVar, WeakReference weakReference, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.e eVar) {
        this.f64804e = kkVar;
        this.f64800a = weakReference;
        this.f64801b = point;
        this.f64802c = bannerOptions;
        this.f64803d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lk lkVarA = hk.a((View) this.f64800a.get(), this.f64801b, this.f64802c, new AtomicReference(), true);
        this.f64803d.a(lkVarA.f64896d == null, lkVarA);
        this.f64804e.f64835a.postDelayed(this, 100L);
    }
}
