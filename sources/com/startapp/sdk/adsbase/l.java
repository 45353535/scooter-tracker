package com.startapp.sdk.adsbase;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.d0;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.nj;
import com.startapp.sdk.internal.u;
import com.startapp.sdk.internal.v;
import com.startapp.sdk.internal.w;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.y;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64067a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64068b = com.startapp.sdk.internal.g.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f64070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f64071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f64072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MetaData f64073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Point f64074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f64075i;

    public l(StartAppAd startAppAd, AdEventListener adEventListener, AdUnitConfig adUnitConfig, int i10, MetaData metaData, Point point) {
        this.f64075i = startAppAd;
        this.f64070d = adEventListener;
        this.f64071e = adUnitConfig;
        this.f64072f = i10;
        this.f64073g = metaData;
        this.f64074h = point;
        this.f64069c = startAppAd.f63950g == StartAppAd.AdMode.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(View view) {
        this.f64070d.onReceiveAd(this.f64075i);
        StartAppAd startAppAd = this.f64075i;
        StartAppAd.a(startAppAd, true, this.f64067a, this.f64068b, startAppAd.f63951h, this.f64071e, this.f64072f);
    }

    @Override // com.startapp.sdk.internal.d0
    public final void b() {
        this.f64075i.f63949f = null;
        StartAppAd startAppAd = this.f64075i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f63953j;
        w6.a("adHidden", adDisplayListener != null, null, null);
        h0.a(adDisplayListener != null ? new u(context, adDisplayListener, startAppAd) : null);
    }

    @Override // com.startapp.sdk.internal.d0
    public final void c() {
        StartAppAd startAppAd = this.f64075i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f63953j;
        w6.a("onClicked", adDisplayListener != null, null, null);
        h0.a(adDisplayListener != null ? new w(context, adDisplayListener, startAppAd) : null);
        Context context2 = this.f64075i.context;
        String strC = this.f64073g.c();
        String str = this.f64067a;
        String adTag = this.f64075i.f63951h.getAdTag();
        String sioPrice = this.f64071e.getSioPrice();
        String bp = this.f64071e.getBp();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        String str2 = this.f64068b;
        Boolean boolValueOf = Boolean.valueOf(this.f64069c);
        boolean z10 = this.f64069c;
        h0.a(context2, strC, new ExternalAdTracking(str, adTag, sioPrice, bp, placement, str2, boolValueOf, z10 ? "FORCED" : "ENABLED", this.f64074h, z10 ? "VIDEO" : "INTERSTITIAL"));
    }

    @Override // com.startapp.sdk.internal.d0
    public final void d() {
        this.f64075i.f63949f = null;
        StartAppAd startAppAd = this.f64075i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f63953j;
        w6.a("onShow", adDisplayListener != null, null, null);
        h0.a(adDisplayListener != null ? new v(context, adDisplayListener, startAppAd) : null);
        Context context2 = this.f64075i.context;
        List listSingletonList = Collections.singletonList(this.f64073g.B());
        String str = this.f64067a;
        String adTag = this.f64075i.f63951h.getAdTag();
        String sioPrice = this.f64071e.getSioPrice();
        String bp = this.f64071e.getBp();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        String str2 = this.f64068b;
        Boolean boolValueOf = Boolean.valueOf(this.f64069c);
        boolean z10 = this.f64069c;
        e9.a(context2, listSingletonList, (TrackingParams) new ExternalAdTracking(str, adTag, sioPrice, bp, placement, str2, boolValueOf, z10 ? "FORCED" : "ENABLED", this.f64074h, z10 ? "VIDEO" : "INTERSTITIAL"));
    }

    public final void e() {
        StartAppAd startAppAd = this.f64075i;
        y.a(startAppAd.context, startAppAd.f63953j, startAppAd);
    }

    public final void f() {
        StartAppAd startAppAd = this.f64075i;
        Context context = startAppAd.context;
        com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener = startAppAd.f63952i;
        w6.a("onVideoCompleted", videoListener != null, null, null);
        h0.a(videoListener != null ? new nj(videoListener, context) : null);
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a(String str) {
        this.f64075i.f63949f = null;
        this.f64070d.onFailedToReceiveAd(this.f64075i);
        StartAppAd startAppAd = this.f64075i;
        StartAppAd.a(startAppAd, false, this.f64067a, this.f64068b, startAppAd.f63951h, this.f64071e, this.f64072f);
    }

    @Override // com.startapp.sdk.internal.d0
    public final void a() {
        this.f64075i.f63949f = null;
    }
}
