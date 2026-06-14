package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class n2 implements AppLovinInterstitialAdDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f9861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f9862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9863c = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f9864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f9865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile AppLovinAdVideoPlaybackListener f9866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile AppLovinAdClickListener f9867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f9868h;

    class a implements AppLovinAdLoadListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            n2.this.b(appLovinAd);
            n2.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            n2.this.b(i10);
        }
    }

    public n2(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f9861a = appLovinSdk.a();
        this.f9862b = new WeakReference(context);
    }

    private long g() {
        String str = this.f9861a.n0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || Boolean.parseBoolean(str)) {
            return Math.max(0L, ((Long) this.f9861a.a(x4.V1)).longValue());
        }
        return 0L;
    }

    public Map h() {
        return this.f9863c;
    }

    public boolean i() {
        final com.applovin.impl.sdk.ad.b bVar = this.f9868h;
        if (bVar == null) {
            return false;
        }
        bVar.q0();
        bVar.setHasShown(false);
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.qc
            @Override // java.lang.Runnable
            public final void run() {
                this.f10252b.b(bVar);
            }
        });
        return true;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f9867g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f9865e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f9864d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f9866f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.f9863c.put(str, obj);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAd", mapA);
            this.f9861a.g().d(d2.C, mapA);
        }
        AppLovinAd appLovinAdA = n7.a(appLovinAd, this.f9861a);
        Context contextE = e();
        String strA = a(appLovinAdA, appLovinAd, contextE);
        if (StringUtils.isValidString(strA)) {
            a("interstitialAdShowFailed", strA, appLovinAd);
        } else {
            if (((Boolean) this.f9861a.a(x4.X5)).booleanValue() && a((com.applovin.impl.sdk.ad.b) appLovinAdA)) {
                return;
            }
            a((com.applovin.impl.sdk.ad.b) appLovinAdA, contextE);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    private Context e() {
        return (Context) this.f9862b.get();
    }

    public AppLovinAdDisplayListener c() {
        return this.f9865e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f9866f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.f9868h;
    }

    public AppLovinAdClickListener b() {
        return this.f9867g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar) {
        this.f9861a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9861a.O().a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Lifecycle lifecycle, AppLovinAd appLovinAd, ViewGroup viewGroup, Activity activity) {
        a((com.applovin.impl.sdk.ad.b) appLovinAd, viewGroup, new AppLovinFullscreenAdViewObserver(lifecycle, this), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th2, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        appLovinFullscreenAdViewObserver.onDestroy();
        a(bVar, appLovinAdDisplayListener, str, th2, (AppLovinFullscreenActivity) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) (this.f9868h.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f9861a.i0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f9861a.e().a() == null && ((Boolean) this.f9861a.a(x4.f11386o2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    protected boolean a(com.applovin.impl.sdk.ad.b bVar) {
        List listA = n7.a(!bVar.C0(), bVar, this.f9861a, com.applovin.impl.sdk.k.o());
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f9861a.a(x4.W0)).booleanValue() && !n7.a(listA, bVar)) {
            a(listA, (com.applovin.impl.sdk.ad.a) bVar);
            return false;
        }
        String str = "Missing ad resources: " + listA;
        if (((Boolean) this.f9861a.a(x4.T5)).booleanValue()) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failing ad display due to missing resources: " + listA);
            a("missingCachedAdResources", str, bVar);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
            CollectionUtils.putStringIfValid("details", "Failing ad display", mapHashMap);
            this.f9861a.D().a(d2.M0, "missingCachedAdResources", mapHashMap);
            return true;
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Streaming ad due to missing ad resources: " + listA);
        bVar.E0();
        HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("error_message", str);
        CollectionUtils.putStringIfValid("details", "Streaming ad", mapHashMap2);
        this.f9861a.D().a(d2.M0, "missingCachedAdResources", mapHashMap2);
        return false;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, final ViewGroup viewGroup, final Lifecycle lifecycle) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAdView", mapA);
            this.f9861a.g().d(d2.C, mapA);
        }
        if (viewGroup != null && lifecycle != null) {
            final AppLovinAd appLovinAdA = n7.a(appLovinAd, this.f9861a);
            final Activity activityU0 = this.f9861a.u0();
            String strA = a(appLovinAdA, appLovinAd, activityU0);
            if (StringUtils.isValidString(strA)) {
                a("interstitialAdShowFailed", strA, appLovinAd);
                return;
            } else {
                if (((Boolean) this.f9861a.a(x4.X5)).booleanValue() && a((com.applovin.impl.sdk.ad.b) appLovinAdA)) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.lc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9283b.a(lifecycle, appLovinAdA, viewGroup, activityU0);
                    }
                });
                return;
            }
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a("interstitialAdShowFailed", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object", appLovinAd);
    }

    class b implements w1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f9870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f9871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9872c;

        b(Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f9870a = activity;
            this.f9871b = appLovinFullscreenAdViewObserver;
            this.f9872c = viewGroup;
        }

        @Override // com.applovin.impl.w1.g
        public void a(w1 w1Var) {
            if (d.d(this.f9870a)) {
                com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                n2.b(n2.this.f9868h, n2.this.f9865e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, this.f9871b);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "invalidActivity");
                CollectionUtils.putStringIfValid("error_message", "Failed to show interstitial: attempting to show ad when parent activity is finishing", mapHashMap);
                n2.this.f9861a.g().a(d2.F, n2.this.f9868h, mapHashMap);
                return;
            }
            this.f9871b.setPresenter(w1Var);
            try {
                w1Var.a(this.f9872c);
            } catch (Throwable th2) {
                String str = "Failed to show interstitial: presenter threw exception " + th2;
                com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", str);
                n2.b(n2.this.f9868h, n2.this.f9865e, str, th2, this.f9871b);
                HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("source", "presentContainerView");
                CollectionUtils.putStringIfValid("error_message", str, mapHashMap2);
                CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapHashMap2);
                n2.this.f9861a.g().a(d2.F, n2.this.f9868h, mapHashMap2);
            }
        }

        @Override // com.applovin.impl.w1.g
        public void a(String str, Throwable th2) {
            n2.b(n2.this.f9868h, n2.this.f9865e, str, th2, this.f9871b);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderInterstitialAdView");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapHashMap);
            n2.this.f9861a.g().a(d2.F, n2.this.f9868h, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pc
            @Override // java.lang.Runnable
            public final void run() {
                this.f10130b.a(appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i10) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mc
            @Override // java.lang.Runnable
            public final void run() {
                this.f9352b.a(i10);
            }
        });
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        this.f9861a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9861a.O().a("InterstitialAdDialogWrapper", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.a(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f9861a.g().a(d2.K, aVar, mapHashMap);
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th2, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.o.c("InterstitialAdDialogWrapper", str, th2);
        if (appLovinAdDisplayListener instanceof l2) {
            t2.a(appLovinAdDisplayListener, str);
        } else {
            t2.b(appLovinAdDisplayListener, bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss("failed_to_display_ad");
        }
    }

    public void a() {
        this.f9867g = null;
        this.f9864d = null;
        this.f9866f = null;
        this.f9865e = null;
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f9861a.k().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f9861a.a(x4.I1)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.o.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f9861a.f().a(bVar);
        this.f9868h = bVar;
        long jG = g();
        this.f9861a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9861a.O().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jG + "ms...");
        }
        if (((Boolean) this.f9861a.a(x4.X0)).booleanValue()) {
            this.f9861a.h().a(this.f9868h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.nc
            @Override // java.lang.Runnable
            public final void run() {
                this.f9914b.a(context);
            }
        }, jG);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final ViewGroup viewGroup, final AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, final Activity activity) {
        this.f9861a.f().a(bVar);
        this.f9868h = bVar;
        long jG = g();
        this.f9861a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9861a.O().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jG + "ms...");
        }
        if (((Boolean) this.f9861a.a(x4.X0)).booleanValue()) {
            this.f9861a.h().a(this.f9868h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.oc
            @Override // java.lang.Runnable
            public final void run() {
                this.f10049b.a(viewGroup, activity, appLovinFullscreenAdViewObserver);
            }
        }, jG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f9861a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9861a.O().a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        w1.a(this.f9868h, this.f9867g, this.f9865e, this.f9866f, this.f9863c, this.f9861a, activity, new b(activity, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(String str, String str2, AppLovinAd appLovinAd) {
        if (this.f9865e != null) {
            if (this.f9865e instanceof l2) {
                ((l2) this.f9865e).onAdDisplayFailed(str2);
            } else {
                this.f9865e.adHidden(appLovinAd);
            }
        }
        Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", str, mapA);
        CollectionUtils.putStringIfValid("error_message", str2, mapA);
        this.f9861a.g().d(d2.F, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f9864d != null) {
            this.f9864d.adReceived(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (this.f9864d != null) {
            this.f9864d.failedToReceiveAd(i10);
        }
    }
}
