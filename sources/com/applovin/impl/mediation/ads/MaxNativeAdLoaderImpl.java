package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.d3;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.a;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0179a, j.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f9473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.i f9476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxNativeAdListener f9478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f9479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f9480h;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f9481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f9482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9483c;

        a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f9481a = maxNativeAd;
            this.f9482b = list;
            this.f9483c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9481a.prepareForInteraction(this.f9482b, this.f9483c)) {
                return;
            }
            com.applovin.impl.sdk.o.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f9485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d3 f9486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f9487c;

        b(MaxNativeAdView maxNativeAdView, d3 d3Var, MaxNativeAd maxNativeAd) {
            this.f9485a = maxNativeAdView;
            this.f9486b = d3Var;
            this.f9487c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.f9485a);
            }
            MaxNativeAdLoaderImpl.this.sdk.y().d(this.f9486b);
            this.f9485a.render(this.f9486b, MaxNativeAdLoaderImpl.this.f9473a, MaxNativeAdLoaderImpl.this.sdk);
            this.f9487c.setNativeAdView(this.f9485a);
            if (this.f9487c.prepareForInteraction(this.f9485a.getClickableViews(), this.f9485a)) {
                return;
            }
            this.f9487c.prepareViewForInteraction(this.f9485a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements a.InterfaceC0175a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9478f);
            }
            t2.a(MaxNativeAdLoaderImpl.this.f9478f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f9478f);
            }
            t2.a(MaxNativeAdLoaderImpl.this.f9478f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9544b.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            t2.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            d3 d3Var = (d3) maxAd;
            d3Var.g(MaxNativeAdLoaderImpl.this.f9474b);
            d3Var.f(MaxNativeAdLoaderImpl.this.f9475c);
            synchronized (MaxNativeAdLoaderImpl.this.f9477e) {
                MaxNativeAdLoaderImpl.this.f9480h.add(d3Var);
            }
            MaxNativeAdView maxNativeAdViewA = MaxNativeAdLoaderImpl.this.a(d3Var.K());
            if (maxNativeAdViewA == null) {
                com.applovin.impl.sdk.o oVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                com.applovin.impl.sdk.o oVar3 = MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl3.logger.a(maxNativeAdLoaderImpl3.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9478f);
                }
                t2.a(MaxNativeAdLoaderImpl.this.f9478f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(d3Var);
                return;
            }
            a(maxNativeAdViewA);
            MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA, d3Var, d3Var.getNativeAd());
            com.applovin.impl.sdk.o oVar4 = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + maxNativeAdViewA + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9478f);
            }
            t2.a(MaxNativeAdLoaderImpl.this.f9478f, maxNativeAdViewA, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(d3Var);
            MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA);
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            d3 d3VarB;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (d3VarB = adViewTracker.b()) == null) {
                return;
            }
            com.applovin.impl.sdk.o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(d3VarB);
        }
    }

    public MaxNativeAdLoaderImpl(String str, com.applovin.impl.sdk.k kVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", kVar);
        this.f9473a = new c(this, null);
        this.f9476d = com.applovin.impl.i.PUBLISHER_INITIATED;
        this.f9477e = new Object();
        this.f9479g = new HashMap();
        this.f9480h = new HashSet();
        kVar.j().a(this);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f9478f = null;
        this.sdk.j().b(this);
        synchronized (this.f9477e) {
            this.f9479g.clear();
            this.f9480h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.f9474b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((d3) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.c();
        } else if (com.applovin.impl.sdk.o.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(@Nullable MaxNativeAdView maxNativeAdView) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f9473a + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.X().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f9476d, this.localExtraParameters, this.extraParameters, com.applovin.impl.sdk.k.o(), this.f9473a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0179a
    public void onAdExpired(t1 t1Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + t1Var + "), listener=" + this.f9478f);
        }
        t2.b(this.f9478f, (MaxAd) t1Var, true);
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        d3 d3Var;
        Iterator it = this.f9480h.iterator();
        while (true) {
            if (!it.hasNext()) {
                d3Var = null;
                break;
            } else {
                d3Var = (d3) it.next();
                if (d3Var.Q().equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        if (d3Var != null) {
            d3Var.h(str2);
            t2.b(this.adReviewListener, str2, d3Var);
            synchronized (this.f9477e) {
                this.f9480h.remove(d3Var);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        d3 d3Var = (d3) maxAd;
        MaxNativeAd nativeAd = d3Var.getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        d3Var.a(viewGroup);
        this.sdk.y().d(d3Var);
        a((y2) d3Var);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(d3Var, viewGroup, this.f9473a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.q0().a((i5) new r6(this.sdk, "renderMaxNativeAd", aVar), d6.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof d3)) {
            com.applovin.impl.sdk.o.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            com.applovin.impl.sdk.o.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        d3 d3Var = (d3) maxAd;
        MaxNativeAd nativeAd = d3Var.getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(r3.T7)).booleanValue()) {
            com.applovin.impl.sdk.o.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, d3Var, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        n7.b(str, this.tag);
        this.f9475c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof com.applovin.impl.i)) {
            this.f9476d = (com.applovin.impl.i) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f9478f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f9474b = str;
    }

    @NonNull
    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f9478f + ", revenueListener=" + this.revenueListener + '}';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d3 d3Var) {
        if (d3Var.u0().get()) {
            return;
        }
        this.sdk.f().a(d3Var, this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f9477e) {
            this.f9479g.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof d3) {
            d3 d3Var = (d3) maxAd;
            if (d3Var.x0()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Native ad (" + d3Var + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.f9477e) {
                this.f9480h.remove(d3Var);
            }
            MaxNativeAdView maxNativeAdViewS0 = d3Var.s0();
            if (maxNativeAdViewS0 != null && (adViewTracker = maxNativeAdViewS0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                maxNativeAdViewS0.recycle();
            }
            MaxNativeAd nativeAd = d3Var.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(d3Var);
            this.sdk.X().destroyAd(d3Var);
            if (this.sdk.R() != null) {
                this.sdk.R().c(this.adUnitId, d3Var.K());
                return;
            } else {
                this.sdk.Q().c(this.adUnitId, d3Var.K());
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f9477e) {
            maxNativeAdView = (MaxNativeAdView) this.f9479g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView, d3 d3Var, MaxNativeAd maxNativeAd) {
        d3Var.a(maxNativeAdView);
        a((y2) d3Var);
        b bVar = new b(maxNativeAdView, d3Var, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.q0().a((i5) new r6(this.sdk, "renderMaxNativeAd", bVar), d6.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null || !maxNativeAdView.isAttachedToWindow()) {
            return;
        }
        adViewTracker.c();
    }
}
