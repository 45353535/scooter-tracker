package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public class x2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f11254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f11255c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11256d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f11257e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f11258f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public x2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f11253a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f11258f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f11254b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, i.NATIVE_AD_PLACER);
    }

    public void a(MaxAd maxAd) {
        this.f11254b.destroy(maxAd);
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f11257e) {
            maxAd = null;
            while (!this.f11255c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.f11255c.remove();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f11258f = null;
        a();
        this.f11254b.destroy();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f11257e) {
            z10 = !this.f11255c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f11257e) {
            try {
                if (!this.f11256d && this.f11255c.size() < this.f11253a) {
                    this.f11256d = true;
                    this.f11254b.loadAd();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f11258f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f11258f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f11258f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f11257e) {
            this.f11255c.add(maxAd);
            this.f11256d = false;
            e();
        }
        a aVar = this.f11258f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a() {
        synchronized (this.f11257e) {
            try {
                Iterator it = this.f11255c.iterator();
                while (it.hasNext()) {
                    a((MaxAd) it.next());
                }
                this.f11255c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f11254b.render(maxNativeAdView, maxAd);
    }
}
