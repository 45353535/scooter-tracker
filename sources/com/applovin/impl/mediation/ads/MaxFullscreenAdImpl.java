package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.c3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.g0;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.w3;
import com.applovin.impl.x3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0179a, j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f9448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f9449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f9450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c3 f9452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f9453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f9454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f9455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g0 f9456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f9457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f9459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f9460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f9461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f9462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WeakReference f9463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f9464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f9465s;

    public interface a {
        Activity getActivity();
    }

    protected class b implements MaxAdListener, MaxAdRevenueListener, a.InterfaceC0175a {
        protected b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final c3 c3Var = (c3) maxAd;
            MaxFullscreenAdImpl.this.d();
            final boolean z10 = MaxFullscreenAdImpl.this.f9459m;
            if (z10) {
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.B0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.this.f9459m = false;
            }
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9537b.a(maxAd, z10, c3Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            final c3 c3Var = (c3) maxAd;
            if (MaxFullscreenAdImpl.this.f9459m) {
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Ad failover succeeded");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.A0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.this.f9459m = false;
            }
            MaxFullscreenAdImpl.this.sdk.f().a(c3Var);
            MaxFullscreenAdImpl.this.b(c3Var);
            MaxFullscreenAdImpl.this.f();
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(r3.f10327p8)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.q0().b(new r6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new Runnable() { // from class: com.applovin.impl.mediation.ads.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9542b.a(c3Var);
                    }
                }), d6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            com.applovin.impl.sdk.o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f9459m = false;
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9528b.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.e();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9533b.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            c3 c3Var;
            synchronized (MaxFullscreenAdImpl.this.f9451e) {
                c3Var = MaxFullscreenAdImpl.this.f9452f;
            }
            MaxFullscreenAdImpl.this.sdk.H().a(MaxFullscreenAdImpl.this.adUnitId);
            final c3 c3Var2 = (c3) maxAd;
            MaxFullscreenAdImpl.this.a(c3Var2);
            if (!MaxFullscreenAdImpl.this.f9454h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9530b.a(c3Var2, maxAd);
                    }
                });
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f9455i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.g();
            }
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + c3Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            t2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) c3Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            t2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            t2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f9459m) {
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Attempting ad failover");
                }
                c3Var.j(MaxFullscreenAdImpl.this.f9462p);
                MaxFullscreenAdImpl.this.sdk.P().a(d2.f8610z0, c3Var, CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.f9462p));
                MaxFullscreenAdImpl.this.g();
                return;
            }
            com.applovin.impl.sdk.o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var) {
            if (c3Var.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.P().a(d2.f8598t0, c3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z10, c3 c3Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z10 && c3Var.z0()) {
                if (MaxFullscreenAdImpl.this.b()) {
                    AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9536b.a();
                        }
                    });
                    return;
                }
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Unable to attempt ad failover due to missing cached ad");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.f8608y0, c3Var);
            }
            com.applovin.impl.sdk.o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f9459m = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, com.applovin.impl.sdk.k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.f9451e = new Object();
        this.f9452f = null;
        this.f9453g = c.IDLE;
        this.f9454h = new AtomicBoolean();
        this.f9455i = new AtomicBoolean();
        this.f9463q = new WeakReference(null);
        this.f9464r = new WeakReference(null);
        this.f9465s = new WeakReference(null);
        this.f9447a = aVar;
        this.f9449c = createAdListenerWrapper();
        this.f9450d = new com.applovin.impl.mediation.b(kVar);
        this.f9448b = new WeakReference(context);
        kVar.j().a(this);
        com.applovin.impl.sdk.o.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    protected b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f9515b.c();
            }
        });
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f9451e) {
            try {
                c3 c3Var = this.f9452f;
                z10 = c3Var != null && c3Var.X() && this.f9453g == c.READY;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            this.sdk.H().c(this.adUnitId);
        }
        return z10;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0179a
    public void onAdExpired(t1 t1Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f9454h.set(true);
        a aVar = this.f9447a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            e();
            this.f9449c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, com.applovin.impl.i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f9449c);
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        c3 c3Var = this.f9452f;
        if (c3Var == null || !c3Var.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f9452f.h(str2);
        t2.b(this.adReviewListener, str2, this.f9452f);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        c3 c3Var;
        List listB = this.sdk.s0().b();
        if (!this.sdk.s0().d() || listB == null || (c3Var = this.f9452f) == null || listB.contains(c3Var.c())) {
            if (activity == null) {
                activity = this.sdk.u0();
            }
            if (a(activity, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9522b.a(str, str2, activity);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.f9452f.c() + "> which is not in the list of selected ad networks " + listB;
        com.applovin.impl.sdk.o.h(this.tag, str3);
        a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f9520b.b(str3);
            }
        });
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append('\'');
        sb2.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f9447a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        c3 c3Var = this.f9452f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c3 c3Var;
        if (this.f9454h.compareAndSet(true, false)) {
            synchronized (this.f9451e) {
                c3Var = this.f9452f;
                this.f9452f = null;
            }
            this.sdk.X().destroyAd(c3Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        final Long l10 = (Long) this.sdk.a(x4.D2);
        if (l10.longValue() <= 0) {
            return;
        }
        this.f9456j = g0.a(l10.longValue(), true, this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f9526b.a(l10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Activity activityU0 = (Activity) this.f9463q.get();
        if (activityU0 == null) {
            activityU0 = this.sdk.u0();
        }
        Activity activity = activityU0;
        if (this.f9458l) {
            showAd(this.f9460n, this.f9461o, (ViewGroup) this.f9464r.get(), (Lifecycle) this.f9465s.get(), activity);
        } else {
            showAd(this.f9460n, this.f9461o, activity);
        }
    }

    public void loadAd(final com.applovin.impl.i iVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f9453g == c.DESTROYED) {
            boolean zC = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.f9447a;
            final Activity activity = aVar != null ? aVar.getActivity() : null;
            final Context context = (Context) this.f9448b.get();
            a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9516b.a(activity, context, iVar);
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.f9452f + "), listener=" + this.adListener);
        }
        t2.f(this.adListener, (MaxAd) this.f9452f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f9451e) {
            try {
                if (this.f9452f != null) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f9452f + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    this.sdk.X().destroyAd(this.f9452f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.sdk.j().b(this);
        this.f9450d.a();
        g0 g0Var = this.f9456j;
        if (g0Var != null) {
            g0Var.a();
            this.f9456j = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            this.sdk.p0().b(z4.R);
        }
        if (this.f9456j != null) {
            this.sdk.p0().b(z4.S);
            this.f9456j.a();
            this.f9456j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, com.applovin.impl.i iVar) {
        Context context2;
        Context contextO = activity;
        if (activity != null) {
            context2 = contextO;
        } else if (context != null) {
            context2 = context;
        } else {
            if (this.sdk.u0() != null) {
                contextO = this.sdk.u0();
            } else {
                contextO = com.applovin.impl.sdk.k.o();
            }
            context2 = contextO;
        }
        this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, context2, this.f9449c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            List listB = y2Var.b("mappk_urls");
            if (CollectionUtils.isEmpty(listB)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) listB));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(f2.a(y2Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(w3.a(y2Var, this.sdk)));
            this.sdk.p0().b(z4.R, jSONObject.toString());
        }
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final Lifecycle lifecycle, Activity activity) {
        c3 c3Var;
        if (viewGroup != null && lifecycle != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(r3.f10318k8)).booleanValue()) {
                com.applovin.impl.sdk.o.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                t2.a(this.adListener, (MaxAd) this.f9452f, (MaxError) maxErrorImpl, true);
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f9452f);
                return;
            }
            List listB = this.sdk.s0().b();
            if (this.sdk.s0().d() && listB != null && (c3Var = this.f9452f) != null && !listB.contains(c3Var.c())) {
                final String str3 = "Attempting to show ad from <" + this.f9452f.c() + "> which is not in the list of selected ad networks " + listB;
                com.applovin.impl.sdk.o.h(this.tag, str3);
                a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9505b.c(str3);
                    }
                });
                return;
            }
            if (activity == null) {
                activity = this.sdk.u0();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9507b.a(str, str2, activity2, viewGroup, lifecycle);
                    }
                });
                return;
            }
            return;
        }
        com.applovin.impl.sdk.o.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f9452f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) this.f9452f, (MaxError) maxErrorImpl2, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f9452f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f9458l = false;
        this.f9463q = new WeakReference(activity);
        this.sdk.X().showFullscreenAd(this.f9452f, activity, this.localExtraParameters, this.extraParameters, this.f9449c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, Lifecycle lifecycle) {
        a(str, str2);
        this.f9458l = true;
        this.f9463q = new WeakReference(activity);
        this.f9464r = new WeakReference(viewGroup);
        this.f9465s = new WeakReference(lifecycle);
        this.sdk.X().showFullscreenAd(this.f9452f, viewGroup, lifecycle, activity, this.localExtraParameters, this.extraParameters, this.f9449c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        c3 c3Var = this.f9452f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        if (this.sdk.R() != null) {
            return this.sdk.R().e(this.adUnitId);
        }
        return this.sdk.Q().d(this.adUnitId);
    }

    private boolean a(Activity activity, final String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f9453g == c.DESTROYED) {
            boolean zC = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            com.applovin.impl.sdk.o.h(this.tag, str2);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + x3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f9452f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f9452f);
            }
            return false;
        }
        Long l10 = (Long) this.sdk.a(r3.V7);
        Long l11 = (Long) this.sdk.a(r3.O7);
        if (l10.longValue() > 0 && (this.f9452f.getTimeToLiveMillis() < l11.longValue() || this.f9454h.get())) {
            this.f9455i.set(true);
            this.sdk.q0().a(new r6(this.sdk, "handleShowOnLoadTimeoutError", new Runnable() { // from class: com.applovin.impl.mediation.ads.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9513b.a(str);
                }
            }), d6.b.TIMEOUT, l10.longValue());
            return false;
        }
        if (n7.a(com.applovin.impl.sdk.k.o()) != 0 && this.sdk.n0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!n7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(r3.f10317j8)).booleanValue()) {
                    com.applovin.impl.sdk.o.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f9452f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                    }
                    t2.a(this.adListener, (MaxAd) this.f9452f, (MaxError) maxErrorImpl2, true);
                    this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f9452f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.H().e() && !this.sdk.H().d()) {
            return true;
        }
        com.applovin.impl.sdk.o.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f9452f + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) this.f9452f, (MaxError) maxErrorImpl3, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f9452f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.f9455i.compareAndSet(true, false)) {
            com.applovin.impl.sdk.o.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.H().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + x3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f9452f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f9452f);
            }
        }
    }

    private void a(String str, String str2) {
        this.f9450d.e(this.f9452f);
        this.f9452f.g(str);
        this.f9452f.f(str2);
        this.f9460n = str;
        this.f9461o = str2;
        this.f9462p = this.f9452f.getNetworkName();
        this.sdk.y().d(this.f9452f);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f9452f + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        a((y2) this.f9452f);
    }

    private void a() {
        c3 c3Var;
        synchronized (this.f9451e) {
            c3Var = this.f9452f;
            this.f9452f = null;
        }
        this.sdk.X().destroyAd(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        this.f9457k += l10.longValue();
        this.sdk.p0().b(z4.S, Long.valueOf(this.f9457k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var) {
        if (this.sdk.f().a(c3Var, this)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + c3Var);
            }
            this.f9452f = c3Var;
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z10;
        c cVar2 = this.f9453g;
        synchronized (this.f9451e) {
            try {
                c cVar3 = c.IDLE;
                if (cVar2 == cVar3) {
                    if (cVar == c.LOADING || cVar == c.DESTROYED) {
                        z10 = true;
                    } else {
                        if (cVar == c.SHOWING) {
                            com.applovin.impl.sdk.o.h(this.tag, "No ad is loading or loaded");
                        } else if (com.applovin.impl.sdk.o.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                        }
                        z10 = false;
                    }
                } else {
                    c cVar4 = c.LOADING;
                    if (cVar2 == cVar4) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                com.applovin.impl.sdk.o.h(this.tag, "An ad is already loading");
                            } else if (cVar != c.READY) {
                                if (cVar == c.SHOWING) {
                                    com.applovin.impl.sdk.o.h(this.tag, "An ad is not ready to be shown yet");
                                } else if (cVar != c.DESTROYED) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z10 = false;
                        }
                        z10 = true;
                    } else {
                        c cVar5 = c.READY;
                        if (cVar2 == cVar5) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    com.applovin.impl.sdk.o.h(this.tag, "An ad is already loaded");
                                } else if (cVar == cVar5) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.logger.b(this.tag, "An ad is already marked as ready");
                                    }
                                } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                                z10 = false;
                            }
                            z10 = true;
                        } else {
                            c cVar6 = c.SHOWING;
                            if (cVar2 == cVar6) {
                                if (cVar != cVar3) {
                                    if (cVar == cVar4) {
                                        com.applovin.impl.sdk.o.h(this.tag, "Can not load another ad while the ad is showing");
                                    } else if (cVar == cVar5) {
                                        if (com.applovin.impl.sdk.o.a()) {
                                            this.logger.b(this.tag, "An ad is already showing, ignoring");
                                        }
                                    } else if (cVar == cVar6) {
                                        com.applovin.impl.sdk.o.h(this.tag, "The ad is already showing, not showing another one");
                                    } else if (cVar != c.DESTROYED) {
                                        if (com.applovin.impl.sdk.o.a()) {
                                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                        }
                                    }
                                }
                                z10 = true;
                            } else if (cVar2 == c.DESTROYED) {
                                com.applovin.impl.sdk.o.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.f9453g);
                            }
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.f9453g + " to " + cVar + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    this.f9453g = cVar;
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.logger.k(this.tag, "Not allowed to transition from " + this.f9453g + " to " + cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((c3) maxAd);
        this.f9450d.a();
        a();
        this.sdk.a0().a((y2) maxAd);
    }
}
