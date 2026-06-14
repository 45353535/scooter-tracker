package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.b3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.i5;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements f.a, g8.a, j.b {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdView f9419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f9421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b3 f9423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f9424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f9425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MaxAdViewConfiguration f9426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f9427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f9428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.applovin.impl.sdk.f f9429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f8 f9430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g8 f9431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f9432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f9433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b3 f9434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MaxAd f9435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f9436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f9437t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f9438u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f9439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f9440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f9441x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f9442y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f9443z;

    private class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            t2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
                return;
            }
            b3 b3Var = (b3) maxAd;
            b3Var.g(MaxAdViewImpl.this.f9424g);
            b3Var.f(MaxAdViewImpl.this.f9425h);
            if (b3Var.y() == null) {
                MaxAdViewImpl.this.sdk.X().destroyAd(b3Var);
                onAdLoadFailed(b3Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (b3Var.w0()) {
                long jR0 = b3Var.r0();
                MaxAdViewImpl.this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl.this.sdk.O().a(MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + jR0 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                }
                MaxAdViewImpl.this.f9429l.a(jR0);
                if (MaxAdViewImpl.this.f9429l.g() || MaxAdViewImpl.this.f9438u) {
                    com.applovin.impl.sdk.o oVar2 = MaxAdViewImpl.this.logger;
                    if (com.applovin.impl.sdk.o.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f9429l.j();
                }
            }
            com.applovin.impl.sdk.o oVar3 = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                maxAdViewImpl3.logger.a(maxAdViewImpl3.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            t2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(b3Var);
        }
    }

    private abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0175a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9434q)) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9435r)) {
                MaxAdViewImpl.this.f9435r = null;
                if ((MaxAdViewImpl.this.f9434q.x0() || MaxAdViewImpl.this.B) && MaxAdViewImpl.this.f9436s) {
                    MaxAdViewImpl.this.f9436s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f9434q)) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9434q)) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9434q)) {
                MaxAdViewImpl.this.f9435r = maxAd;
                if ((MaxAdViewImpl.this.f9434q.x0() || MaxAdViewImpl.this.B) && !MaxAdViewImpl.this.f9429l.g()) {
                    MaxAdViewImpl.this.f9436s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9434q)) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                t2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            t2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            t2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    private class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f9441x) {
                com.applovin.impl.sdk.o oVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(r3.H7)).booleanValue()) {
                    MaxAdViewImpl.this.b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.a(maxAd);
                    return;
                }
            }
            com.applovin.impl.sdk.o oVar2 = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).a());
        this.f9420c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f9422e = Long.MAX_VALUE;
        this.f9432o = new Object();
        this.f9433p = new Object();
        this.f9434q = null;
        this.f9435r = null;
        this.f9439v = new AtomicBoolean();
        this.f9441x = false;
        this.f9418a = context.getApplicationContext();
        this.f9419b = maxAdView;
        this.f9421d = view;
        this.f9427j = new b();
        this.f9428k = new d();
        this.f9429l = new com.applovin.impl.sdk.f(this.sdk, this);
        this.f9430m = new f8(maxAdView, this.sdk);
        this.f9431n = new g8(maxAdView, this.sdk, this);
        this.f9426i = maxAdViewConfiguration;
        this.sdk.j().a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        if (((Boolean) this.sdk.a(r3.I7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9496b.g();
                }
            });
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f9424g;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(r3.H7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        b3 b3Var = this.f9434q;
        if (b3Var != null && b3Var.Q().equalsIgnoreCase(str)) {
            this.f9434q.h(str2);
            t2.b(this.adReviewListener, str2, this.f9434q);
            return;
        }
        b3 b3Var2 = this.f9423f;
        if (b3Var2 == null || !b3Var2.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f9423f.h(str2);
    }

    @Override // com.applovin.impl.g8.a
    public void onLogVisibilityImpression() {
        a(this.f9434q, this.f9430m.a(this.f9434q));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(r3.E7)).booleanValue() && this.f9429l.h()) {
            if (e8.b(i10)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f9429l.d();
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f9429l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f9434q != null && com.applovin.impl.sdk.o.a()) {
            this.logger.k(this.tag, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        n7.b(str, this.tag);
        this.f9425h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f9434q != null && com.applovin.impl.sdk.o.a()) {
            this.logger.k(this.tag, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.f9424g = str;
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f9422e = i10;
    }

    public void startAutoRefresh() {
        this.f9438u = false;
        if (!this.f9429l.g()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f9429l.m();
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f9429l.b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.f9434q == null) {
            if (this.f9442y || ((Boolean) this.sdk.a(r3.G7)).booleanValue()) {
                this.f9438u = true;
                return;
            } else {
                com.applovin.impl.sdk.o.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f9429l.b() + "ms");
        }
        this.f9429l.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append('\'');
        sb2.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f9419b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        sb2.append(a());
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final b3 b3Var) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f9499b.b(b3Var);
            }
        });
    }

    private void e() {
        this.f9439v.set(false);
        if (this.f9423f != null) {
            i();
            return;
        }
        if (!b()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(com.applovin.impl.i.REFRESH);
        } else if (this.f9437t) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(com.applovin.impl.i.REFRESH);
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f9439v.set(true);
        }
    }

    private void f() {
        boolean z10;
        boolean z11;
        synchronized (this.f9433p) {
            try {
                z10 = false;
                this.f9439v.set(false);
                z11 = this.f9423f != null;
                if (!z11) {
                    if (b()) {
                        if (!this.f9437t) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                            }
                            this.f9439v.set(true);
                        } else if (com.applovin.impl.sdk.o.a()) {
                            this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network...");
                    }
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            i();
        } else if (z10) {
            loadAd(com.applovin.impl.i.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h();
        if (this.f9423f != null) {
            this.sdk.X().destroyAd(this.f9423f);
        }
        synchronized (this.f9432o) {
            this.f9441x = true;
        }
        this.f9429l.a();
        this.sdk.j().b(this);
        if (this.sdk.R() != null) {
            this.sdk.R().c(this.adUnitId, this.f9420c);
        } else {
            this.sdk.Q().c(this.adUnitId, this.f9420c);
        }
        super.destroy();
    }

    private void h() {
        b3 b3Var;
        MaxAdView maxAdView = this.f9419b;
        if (maxAdView != null) {
            com.applovin.impl.s.a(maxAdView, this.f9421d);
        }
        this.f9431n.b();
        synchronized (this.f9432o) {
            b3Var = this.f9434q;
        }
        MaxAd maxAd = this.f9435r;
        if (maxAd != null && maxAd.equals(b3Var)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            t2.b(this.f9427j, maxAd);
        }
        if (b3Var != null) {
            this.sdk.X().destroyAd(b3Var);
        }
    }

    private void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f9423f + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f9427j.onAdLoaded(this.f9423f);
        this.f9423f = null;
    }

    public void loadAd(com.applovin.impl.i iVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        boolean z10 = this.f9442y || ((Boolean) this.sdk.a(r3.G7)).booleanValue();
        if (z10 && !this.f9429l.g() && this.f9429l.h()) {
            com.applovin.impl.sdk.o.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f9429l.b()) + " seconds.");
            return;
        }
        if (!z10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.f9427j);
        } else if (this.f9423f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.f9440w) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f9439v.set(true);
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.f9427j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final b3 b3Var) {
        View viewY = b3Var.y();
        String str = viewY == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f9419b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + b3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) b3Var, (MaxError) maxErrorImpl, true);
            this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, b3Var);
            return;
        }
        h();
        a((y2) b3Var);
        if (b3Var.q0()) {
            this.f9431n.a(b3Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (b3Var.s0() != Long.MAX_VALUE) {
            this.f9421d.setBackgroundColor((int) b3Var.s0());
        } else {
            long j10 = this.f9422e;
            if (j10 != Long.MAX_VALUE) {
                this.f9421d.setBackgroundColor((int) j10);
            } else {
                this.f9421d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewY);
        a(viewY, b3Var);
        this.sdk.y().d(b3Var);
        c(b3Var);
        synchronized (this.f9432o) {
            this.f9434q = b3Var;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.X().processRawAdImpression(b3Var, this.f9427j);
        if (StringUtils.isValidString(this.f9434q.getAdReviewCreativeId())) {
            t2.a(this.adReviewListener, this.f9434q.getAdReviewCreativeId(), (MaxAd) this.f9434q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f9497b.a(b3Var);
            }
        }, b3Var.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, this.f9428k);
    }

    private void d() {
        if (b()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f9440w = true;
            this.sdk.q0().a((i5) new r6(this.sdk, "loadMaxAdForPrecacheRequest", new Runnable() { // from class: com.applovin.impl.mediation.ads.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9504b.c();
                }
            }), d6.b.MEDIATION);
        }
    }

    private void c(b3 b3Var) {
        int height = this.f9419b.getHeight();
        int width = this.f9419b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f9418a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f9418a, width);
            MaxAdFormat format = b3Var.getFormat();
            int height2 = (this.D ? format.getAdaptiveSize(iPxToDp2, this.f9419b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), o0.b(this.f9418a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n**************************************************\n`MaxAdView` size ");
                sb2.append(iPxToDp2);
                sb2.append("x");
                sb2.append(iPxToDp);
                sb2.append(" dp smaller than required ");
                sb2.append(this.D ? "adaptive " : "");
                sb2.append("size: ");
                sb2.append(iMin);
                sb2.append("x");
                sb2.append(height2);
                sb2.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String string = sb2.toString();
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.b("AppLovinSdk", string);
                }
            }
        }
    }

    private void a(final com.applovin.impl.i iVar, final a.InterfaceC0175a interfaceC0175a) {
        if (a()) {
            boolean zC = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zC));
            if (!zC) {
                com.applovin.impl.sdk.o.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            }
            throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f9501b.a(interfaceC0175a, iVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a.InterfaceC0175a interfaceC0175a, com.applovin.impl.i iVar) {
        int adaptiveWidth;
        b3 b3Var = this.f9434q;
        if (b3Var != null) {
            long jA = this.f9430m.a(b3Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f9434q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f9419b.getContext(), this.f9419b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f9419b.getContext(), this.f9419b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f9429l.g() || this.f9438u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f9443z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.f9426i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            com.applovin.impl.sdk.o.j(this.tag, "The requested adaptive ad view width (" + adaptiveWidth + " dp) is different from the MaxAdView width (" + iPxToDp + " dp).");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0175a + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.sdk.X().loadAd(this.adUnitId, this.f9420c, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, this.f9418a, interfaceC0175a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f9442y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated disable auto-retries to: " + str2);
            }
            this.f9443z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated precached disabled to: " + str2);
            }
            this.A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.B = Boolean.parseBoolean(str2);
            return;
        }
        if ("force_precache".equals(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated force precache to: " + str2);
            }
            this.C = Boolean.parseBoolean(str2);
            return;
        }
        if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Updated is adaptive banner to: " + str2);
            }
            if (this.f9426i == null) {
                com.applovin.impl.sdk.o.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://support.axon.ai/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f9440w = false;
        synchronized (this.f9433p) {
            try {
                zCompareAndSet = this.f9439v.compareAndSet(true, false);
                if (!zCompareAndSet) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "Saving precache ad...");
                    }
                    b3 b3Var = (b3) maxAd;
                    this.f9423f = b3Var;
                    b3Var.g(this.f9424g);
                    this.f9423f.f(this.f9425h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zCompareAndSet) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f9427j.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.A) {
            return false;
        }
        return ((Boolean) this.sdk.a(r3.N7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var) {
        long jA = this.f9430m.a(b3Var);
        if (!b3Var.q0()) {
            a(b3Var, jA);
        }
        a(jA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(r3.A7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.sdk.O().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f9438u && !this.f9429l.g()) {
            this.f9437t = true;
            this.f9440w = false;
            long jLongValue = ((Long) this.sdk.a(r3.f10346z7)).longValue();
            if (jLongValue >= 0) {
                this.sdk.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.sdk.O().a(this.tag, "Scheduling failed banner ad refresh " + jLongValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f9429l.a(jLongValue);
                return;
            }
            return;
        }
        if (this.f9440w) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f9440w = false;
        }
        if (this.f9439v.get()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(View view, b3 b3Var) {
        int iV0 = b3Var.v0();
        int iT0 = b3Var.t0();
        int iDpToPx = iV0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iV0);
        int iDpToPx2 = iT0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iT0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Pinning ad view to MAX ad view with width: " + iDpToPx + " and height: " + iDpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i10 : e8.a(this.f9419b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i10);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(b3 b3Var, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.X().processViewabilityAdImpressionPostback(b3Var, j10, this.f9427j);
    }

    private void a(long j10) {
        if (n7.a(j10, ((Long) this.sdk.a(r3.M7)).longValue()) && !this.C) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j10) + ", undesired: " + Long.toBinaryString(j10));
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f9437t = true;
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f9437t = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f9440w = false;
        if (this.f9439v.compareAndSet(true, false)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f9427j.onAdLoaded(maxAd);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        b3 b3Var = (b3) maxAd;
        this.f9423f = b3Var;
        b3Var.g(this.f9424g);
        this.f9423f.f(this.f9425h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z10;
        synchronized (this.f9432o) {
            z10 = this.f9441x;
        }
        return z10;
    }
}
