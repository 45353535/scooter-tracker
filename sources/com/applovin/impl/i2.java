package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import j$.util.DesugarCollections;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f9052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AppLovinAdServiceImpl f9053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAd f9054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SoftReference f9056f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f9058h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile double f9060j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f9051a = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9057g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f9059i = false;

    class a implements AppLovinAdRewardListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            i2.this.f9052b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f9052b.O().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            i2.this.f9052b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f9052b.O().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            i2.this.f9052b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f9052b.O().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            i2.this.f9052b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f9052b.O().b("IncentivizedAdController", "Reward validation failed: " + i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppLovinAdLoadListener f9062a;

        b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f9062a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            i2.this.f9054d = appLovinAd;
            if (this.f9062a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.bb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8461b.a(appLovinAd);
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i10) {
            if (this.f9062a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.cb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8517b.a(i10);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f9062a.adReceived(appLovinAd);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th2);
                i2.this.f9052b.D().a("IncentivizedAdController", "adLoaded", th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            try {
                this.f9062a.failedToReceiveAd(i10);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th2);
                i2.this.f9052b.D().a("IncentivizedAdController", "adLoadFailed", th2);
            }
        }
    }

    private class c implements l2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppLovinAd f9064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinAdDisplayListener f9065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AppLovinAdClickListener f9066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f9067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AppLovinAdRewardListener f9068e;

        /* synthetic */ c(i2 i2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar, String str) {
            int i10;
            i2.this.f9052b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f9052b.O().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String strB = i2.this.b();
            if (!StringUtils.isValidString(strB) || !i2.this.f9059i) {
                i2.this.f9052b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f9052b.O().b("IncentivizedAdController", "Invalid reward state - result: " + strB + " and wasFullyEngaged: " + i2.this.f9059i);
                }
                i2.this.f9052b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f9052b.O().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (i2.this.f9059i) {
                    i2.this.f9052b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        i2.this.f9052b.O().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    i2.this.f9052b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        i2.this.f9052b.O().b("IncentivizedAdController", "Ad closed prematurely from source: " + str);
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(o4.a(str));
                i2.this.f9052b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f9052b.O().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                t2.a(this.f9068e, bVar, i10);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", String.valueOf(i2.this.f9060j));
                CollectionUtils.putStringIfValid("source", str, mapHashMap);
                i2.this.f9052b.g().a(d2.J, bVar, mapHashMap);
            }
            if (bVar.z0().getAndSet(true)) {
                return;
            }
            i2.this.f9052b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f9052b.O().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            i2.this.f9052b.q0().a((i5) new m6(bVar, i2.this.f9052b), d6.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            t2.a(this.f9066c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            t2.a(this.f9065b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdF;
                a(bVar, a(bVar, false));
            } else {
                if (appLovinAdF == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + appLovinAdF;
                }
                i2.this.f9052b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f9052b.O().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            i2.this.a(appLovinAdF);
            i2.this.f9052b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f9052b.O().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            t2.b(this.f9065b, appLovinAd);
        }

        @Override // com.applovin.impl.l2
        public void onAdDisplayFailed(String str) {
            String str2;
            AppLovinAd appLovinAdF = this.f9064a;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.c) {
                appLovinAdF = ((com.applovin.impl.sdk.ad.c) appLovinAdF).f();
            }
            boolean z10 = this.f9065b instanceof l2;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdF;
                a(bVar, a(bVar, StringUtils.isValidString(str)));
            } else {
                if (appLovinAdF == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + appLovinAdF;
                }
                i2.this.f9052b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVarO = i2.this.f9052b.O();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Received `");
                    sb2.append(z10 ? "adDisplayFailed" : "adHidden");
                    sb2.append("` callback for ");
                    sb2.append(str2);
                    oVarO.b("IncentivizedAdController", sb2.toString());
                }
            }
            i2.this.a(appLovinAdF);
            if (z10) {
                t2.a(this.f9065b, str);
            } else {
                t2.b(this.f9065b, this.f9064a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            i2.this.a("quota_exceeded");
            t2.b(this.f9068e, appLovinAd, map);
            i2.this.f9052b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            i2.this.a("rejected");
            t2.a(this.f9068e, appLovinAd, map);
            i2.this.f9052b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            i2.this.a("accepted");
            t2.c(this.f9068e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            i2.this.a("network_timeout");
            t2.a(this.f9068e, appLovinAd, i10);
            i2.this.f9052b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "network_timeout"));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            t2.a(this.f9067d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            boolean z11 = (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) && ((com.applovin.impl.sdk.ad.b) appLovinAdF).G0();
            i2 i2Var = i2.this;
            if (z11) {
                d10 = 100.0d;
            }
            i2Var.f9060j = d10;
            i2.this.f9059i = z10 || z11;
            t2.a(this.f9067d, appLovinAd, i2.this.f9060j, i2.this.f9059i);
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f9064a = appLovinAd;
            this.f9065b = appLovinAdDisplayListener;
            this.f9066c = appLovinAdClickListener;
            this.f9067d = appLovinAdVideoPlaybackListener;
            this.f9068e = appLovinAdRewardListener;
        }

        private String a(com.applovin.impl.sdk.ad.b bVar, boolean z10) {
            if (StringUtils.isValidString(bVar.v())) {
                return bVar.v();
            }
            if (z10) {
                return "ad_display_failure";
            }
            return null;
        }
    }

    public i2(String str, AppLovinSdk appLovinSdk) {
        this.f9052b = appLovinSdk.a();
        this.f9053c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f9055e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f9056f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public boolean d() {
        return this.f9054d != null;
    }

    public String c() {
        return this.f9055e;
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f9052b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9052b.O().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f9056f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f9054d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f9053c.loadNextIncentivizedAd(this.f9055e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f9054d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f9054d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.f9057g) {
            str = this.f9058h;
        }
        return str;
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f9052b.q0().a((i5) new t6(bVar, appLovinAdRewardListener, this.f9052b), d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f9057g) {
            this.f9058h = str;
        }
    }

    public void a(String str, Object obj) {
        this.f9051a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = f2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAd", mapA);
        this.f9052b.g().d(d2.C, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = n7.a(appLovinAdImpl, this.f9052b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f9052b.y0(), context);
        for (String str : this.f9051a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f9051a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = f2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAdView", mapA);
        this.f9052b.g().d(d2.C, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = n7.a(appLovinAdImpl, this.f9052b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f9052b.y0(), context);
        for (String str : this.f9051a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f9051a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA, viewGroup, lifecycle);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, l2 l2Var) {
        t2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        t2.a(l2Var, str);
        Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", "rewardedAdShowFailed", mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f9052b.g().d(d2.F, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f9054d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.f9054d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.f9054d = null;
            }
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
