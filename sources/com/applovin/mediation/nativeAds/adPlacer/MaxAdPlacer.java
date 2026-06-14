package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w2;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class MaxAdPlacer implements x2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AppLovinSdkUtils.Size f11768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MaxNativeAdViewBinder f11769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w2 f11770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x2 f11771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Listener f11772e;
    protected final o logger;
    protected final k sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i10);

        void onAdRemoved(int i10);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings) {
        this(maxAdPlacerSettings, k.o());
    }

    public void clearAds() {
        a(this.f11770c.b(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f11793b.b();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i10) {
        final Collection<Integer> collectionE = this.f11770c.e(i10);
        if (!collectionE.isEmpty()) {
            a(collectionE, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11794b.a(i10, collectionE);
                }
            });
        }
        return collectionE;
    }

    public void destroy() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f11771d.c();
    }

    public long getAdItemId(int i10) {
        if (isFilledPosition(i10)) {
            return -System.identityHashCode(this.f11770c.a(i10));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i10) {
        if (isFilledPosition(i10)) {
            boolean z10 = this.f11768a != AppLovinSdkUtils.Size.ZERO;
            d3 d3Var = (d3) this.f11770c.a(i10);
            if (z10) {
                return this.f11768a;
            }
            if (d3Var.s0() != null) {
                View mainView = d3Var.s0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i10) {
        return this.f11770c.b(i10);
    }

    public int getAdjustedPosition(int i10) {
        return this.f11770c.c(i10);
    }

    public int getOriginalPosition(int i10) {
        return this.f11770c.d(i10);
    }

    public void insertItem(int i10) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i10);
        }
        this.f11770c.f(i10);
    }

    public boolean isAdPosition(int i10) {
        return this.f11770c.g(i10);
    }

    public boolean isFilledPosition(int i10) {
        return this.f11770c.h(i10);
    }

    public void loadAds() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f11771d.e();
    }

    public void moveItem(int i10, int i11) {
        this.f11770c.b(i10, i11);
    }

    @Override // com.applovin.impl.x2.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f11772e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f11772e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (o.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdLoaded() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(final int i10) {
        a(isFilledPosition(i10) ? Collections.singletonList(Integer.valueOf(i10)) : Collections.EMPTY_LIST, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f11791b.a(i10);
            }
        });
    }

    public void renderAd(int i10, ViewGroup viewGroup) {
        MaxAd maxAdA = this.f11770c.a(i10);
        if (maxAdA == null) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i10);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewS0 = ((d3) maxAdA).s0();
        if (maxNativeAdViewS0 == null) {
            if (this.f11769b == null) {
                if (o.a()) {
                    this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            maxNativeAdViewS0 = new MaxNativeAdView(this.f11769b, viewGroup.getContext());
            if (this.f11771d.a(maxNativeAdViewS0, maxAdA)) {
                if (o.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i10);
                }
            } else if (o.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10);
            }
        } else if (o.a()) {
            this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i10);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewS0.getParent() != null) {
            ((ViewGroup) maxNativeAdViewS0.getParent()).removeView(maxNativeAdViewS0);
        }
        viewGroup.addView(maxNativeAdViewS0, -1, -1);
    }

    public void setAdSize(int i10, int i11) {
        this.f11768a = new AppLovinSdkUtils.Size(i10, i11);
    }

    public void setListener(Listener listener) {
        this.f11772e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f11769b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i10, int i11) {
        this.f11770c.c(i10, i11);
        if (i10 == -1 || i11 == -1) {
            return;
        }
        a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10, Collection collection) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i10);
        }
        this.f11770c.a(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f11770c.a();
        this.f11771d.a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f11768a = AppLovinSdkUtils.Size.ZERO;
        k kVarA = appLovinSdk.a();
        this.sdk = kVarA;
        o oVarO = kVarA.O();
        this.logger = oVarO;
        this.f11770c = new w2(maxAdPlacerSettings);
        this.f11771d = new x2(maxAdPlacerSettings, context, this);
        if (o.a()) {
            oVarO.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i10);
        }
        this.f11770c.i(i10);
    }

    private void a() {
        int iC;
        while (this.f11771d.d() && (iC = this.f11770c.c()) != -1) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + iC);
            }
            this.f11770c.a(this.f11771d.b(), iC);
            Listener listener = this.f11772e;
            if (listener != null) {
                listener.onAdLoaded(iC);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f11771d.a(this.f11770c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f11772e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f11772e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
