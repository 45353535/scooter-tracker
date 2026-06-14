package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.d0;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.i1;
import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.k1;
import com.startapp.sdk.internal.w6;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63724a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63725b = com.startapp.sdk.internal.g.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Point f63726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i7 f63727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f63728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f63729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MetaData f63730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f63731h;

    public b(BannerStandard bannerStandard, Point point, i7 i7Var, AdUnitConfig adUnitConfig, int i10, MetaData metaData) {
        this.f63731h = bannerStandard;
        this.f63726c = point;
        this.f63727d = i7Var;
        this.f63728e = adUnitConfig;
        this.f63729f = i10;
        this.f63730g = metaData;
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a() {
    }

    @Override // com.startapp.sdk.internal.d0
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.d0
    public final void c() {
        Context context = this.f63731h.getContext();
        BannerStandard bannerStandard = this.f63731h;
        k1.a(context, bannerStandard.listener, (View) bannerStandard, (String) null);
        h0.a(this.f63731h.getContext(), this.f63730g.c(), new ExternalAdTracking(this.f63724a, this.f63731h.getAdTag(), this.f63728e.getSioPrice(), this.f63728e.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f63725b, null, "DISABLED", this.f63726c, "BANNER"));
    }

    @Override // com.startapp.sdk.internal.d0
    public final void d() {
        Context context = this.f63731h.getContext();
        BannerStandard bannerStandard = this.f63731h;
        BannerListener bannerListener = bannerStandard.listener;
        w6.a("onImpression", bannerListener != null, null, null);
        h0.a(bannerListener != null ? new i1(context, bannerListener, bannerStandard) : null);
        e9.a(this.f63731h.getContext(), Collections.singletonList(this.f63730g.B()), (TrackingParams) new ExternalAdTracking(this.f63724a, this.f63731h.getAdTag(), this.f63728e.getSioPrice(), this.f63728e.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f63725b, null, "DISABLED", this.f63726c, "BANNER"));
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(View view) {
        if (view == null) {
            this.f63731h.sendLoadError("No view returned");
            return;
        }
        this.f63731h.updateBannerView();
        BannerStandard bannerStandard = this.f63731h;
        Point point = this.f63726c;
        bannerStandard.attachAdViewToContainer(view, point.x, point.y);
        Context context = this.f63731h.getContext();
        BannerStandard bannerStandard2 = this.f63731h;
        k1.b(context, bannerStandard2.listener, bannerStandard2, null);
        this.f63727d.a(Boolean.TRUE);
        BannerStandard bannerStandard3 = this.f63731h;
        bannerStandard3.sendInfoAdRequest(true, this.f63724a, this.f63725b, bannerStandard3.getAdPreferences(), this.f63726c, this.f63728e, this.f63729f);
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(String str) {
        this.f63731h.sendLoadError(str);
        this.f63727d.a(Boolean.FALSE);
        BannerStandard bannerStandard = this.f63731h;
        bannerStandard.sendInfoAdRequest(false, this.f63724a, this.f63725b, bannerStandard.getAdPreferences(), this.f63726c, this.f63728e, this.f63729f);
    }
}
