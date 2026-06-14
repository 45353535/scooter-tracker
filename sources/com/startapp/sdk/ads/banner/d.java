package com.startapp.sdk.ads.banner;

import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.d0;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.n1;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerListener f63757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f63758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63759c = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f63760d = com.startapp.sdk.internal.g.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f63761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f63762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Point f63763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f63764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MetaData f63766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ BannerRequest f63767k;

    public d(BannerRequest bannerRequest, BannerRequest.Callback callback, AdPreferences adPreferences, Point point, AdUnitConfig adUnitConfig, int i10, MetaData metaData) {
        this.f63767k = bannerRequest;
        this.f63761e = callback;
        this.f63762f = adPreferences;
        this.f63763g = point;
        this.f63764h = adUnitConfig;
        this.f63765i = i10;
        this.f63766j = metaData;
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a() {
    }

    @Override // com.startapp.sdk.internal.d0
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.d0
    public final void c() {
        BannerListener bannerListener = this.f63757a;
        if (bannerListener != null) {
            bannerListener.onClick(this.f63758b);
        }
        h0.a(this.f63767k.context, this.f63766j.c(), new ExternalAdTracking(this.f63759c, this.f63767k.adPreferences.getAdTag(), this.f63764h.getSioPrice(), this.f63764h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f63760d, null, "DISABLED", this.f63763g, "BANNER"));
    }

    @Override // com.startapp.sdk.internal.d0
    public final void d() {
        BannerListener bannerListener = this.f63757a;
        if (bannerListener != null) {
            bannerListener.onImpression(this.f63758b);
        }
        e9.a(this.f63767k.context, Collections.singletonList(this.f63766j.B()), (TrackingParams) new ExternalAdTracking(this.f63759c, this.f63767k.adPreferences.getAdTag(), this.f63764h.getSioPrice(), this.f63764h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f63760d, null, "DISABLED", this.f63763g, "BANNER"));
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(View view) {
        if (view == null) {
            this.f63761e.onFinished(null, "No view returned");
        } else {
            this.f63761e.onFinished(new n1(this, view), null);
            this.f63767k.sendInfoAdRequest(true, this.f63759c, this.f63760d, this.f63762f, this.f63763g, this.f63764h, this.f63765i);
        }
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(String str) {
        this.f63761e.onFinished(null, str);
        this.f63767k.sendInfoAdRequest(false, this.f63759c, this.f63760d, this.f63762f, this.f63763g, this.f63764h, this.f63765i);
    }
}
