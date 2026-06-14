package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a6;
import com.applovin.impl.d6;
import com.applovin.impl.e6;
import com.applovin.impl.e8;
import com.applovin.impl.i5;
import com.applovin.impl.k;
import com.applovin.impl.k7;
import com.applovin.impl.m2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.x4;
import com.applovin.impl.y5;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, a.InterfaceC0179a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f10433d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f10434e = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f10435f = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    class b implements m2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f10436a;

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f10430a.i().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f10430a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f10430a);
            }
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f10436a.f10438a) {
                try {
                    if (!this.f10436a.f10440c) {
                        hashSet = new HashSet(this.f10436a.f10441d);
                        this.f10436a.f10441d.clear();
                    }
                    c cVar = this.f10436a;
                    cVar.f10439b = false;
                    cVar.f10440c = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            failedToReceiveAdV2(new AppLovinError(i10, ""));
        }

        @Override // com.applovin.impl.m2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f10436a.f10438a) {
                try {
                    if (!this.f10436a.f10440c) {
                        hashSet = new HashSet(this.f10436a.f10441d);
                        this.f10436a.f10441d.clear();
                    }
                    c cVar = this.f10436a;
                    cVar.f10439b = false;
                    cVar.f10440c = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }

        private b(c cVar) {
            this.f10436a = cVar;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f10438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f10439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f10440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection f10441d;

        private c() {
            this.f10438a = new Object();
            this.f10441d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f10439b + ", isReloadingExpiredAd=" + this.f10440c + ", pendingAdListeners=" + this.f10441d + '}';
        }
    }

    AppLovinAdServiceImpl(k kVar) {
        this.f10430a = kVar;
        this.f10431b = kVar.O();
        HashMap map = new HashMap(6);
        this.f10432c = map;
        map.put(com.applovin.impl.u.c(), new c());
        map.put(com.applovin.impl.u.k(), new c());
        map.put(com.applovin.impl.u.j(), new c());
        map.put(com.applovin.impl.u.m(), new c());
        map.put(com.applovin.impl.u.b(), new c());
        map.put(com.applovin.impl.u.h(), new c());
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f10434e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f10430a.A().a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA = this.f10430a.i().a(uVar);
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplA + " for zone: " + uVar + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        return appLovinAdImplA;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f10435f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f10434e) {
            map = CollectionUtils.map(this.f10434e);
            this.f10434e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strI = this.f10430a.A().I();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (StringUtils.isValidString(strI) && o.a()) {
            this.f10431b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strI;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.u.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, final AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            o.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.k kVar = new com.applovin.impl.k(strTrim, this.f10430a);
        if (kVar.c() == k.a.REGULAR) {
            if (o.a()) {
                this.f10431b.a("AppLovinAdService", "Loading next ad for token: " + kVar);
            }
            a(new a6(kVar, appLovinAdLoadListener, this.f10430a));
            return;
        }
        if (kVar.c() != k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            o.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        final JSONObject jSONObjectA = kVar.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + kVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            o.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.r0.c(jSONObjectA, this.f10430a);
        com.applovin.impl.r0.b(jSONObjectA, this.f10430a);
        com.applovin.impl.r0.a(jSONObjectA, this.f10430a);
        this.f10430a.m().a();
        if (JsonUtils.getJSONArray(jSONObjectA, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()).length() <= 0) {
            if (o.a()) {
                this.f10431b.b("AppLovinAdService", "No ad returned from the server for token: " + kVar);
            }
            c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Rendering ad for token: " + kVar);
        }
        final com.applovin.impl.u uVarA = n7.a(jSONObjectA, this.f10430a);
        MaxAdFormat maxAdFormatD = uVarA.d();
        if (((Boolean) this.f10430a.a(x4.X0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f10430a.h().a(uVarA, new d.a() { // from class: com.applovin.impl.sdk.s
                @Override // com.applovin.impl.sdk.d.a
                public final void a(com.applovin.impl.sdk.ad.b bVar) {
                    this.f10934a.a(appLovinAdLoadListener, jSONObjectA, uVarA, bVar);
                }
            });
        } else {
            a(new e6(jSONObjectA, uVarA, appLovinAdLoadListener, this.f10430a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(com.applovin.impl.u.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.u.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l10;
        if (((Boolean) this.f10430a.a(x4.f11458x2)).booleanValue() && (l10 = (Long) this.f10430a.b(z4.N)) != null && System.currentTimeMillis() - l10.longValue() <= ((Long) this.f10430a.a(x4.B2)).longValue()) {
            if (((Boolean) this.f10430a.a(x4.A2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.applovin.impl.e> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0179a
    public void onAdExpired(com.applovin.impl.t1 t1Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) t1Var;
        com.applovin.impl.u adZone = appLovinAdImpl.getAdZone();
        if (o.a()) {
            this.f10431b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f10430a.i().b(appLovinAdImpl);
        if (this.f10430a.G0() || !((Boolean) this.f10430a.a(x4.f11288d1)).booleanValue()) {
            return;
        }
        c cVarA = a(adZone);
        synchronized (cVarA.f10438a) {
            try {
                if (!cVarA.f10439b) {
                    this.f10430a.O();
                    if (o.a()) {
                        this.f10430a.O().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    cVarA.f10439b = true;
                    cVarA.f10440c = true;
                    a(adZone, new b(cVarA));
                } else if (o.a()) {
                    this.f10431b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f10435f.set(jSONObject);
    }

    @NonNull
    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f10432c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, @Nullable MotionEvent motionEvent) {
        if (bVar == null) {
            if (o.a()) {
                this.f10431b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.a(motionEvent));
        if (appLovinAdView != null && uri != null) {
            a(bVar, appLovinAdView, aVar, uri);
        } else if (o.a()) {
            this.f10431b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, com.applovin.impl.w1 w1Var, Context context) {
        if (bVar == null) {
            if (o.a()) {
                this.f10431b.b("AppLovinAdService", "Unable to track video click. No ad specified");
            }
        } else {
            if (o.a()) {
                this.f10431b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent));
            a(w1Var.b().getController(), uri, context);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabHiddenPostbacks());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabShownPostbacks());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j10, List<Long> list, long j11, boolean z10, int i10) {
        if (bVar == null) {
            if (o.a()) {
                this.f10431b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.e> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            if (o.a()) {
                this.f10431b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (com.applovin.impl.e eVar : listE) {
            String strA = a(eVar.c(), j10, j11, list, bVar.v(), z10, i10);
            String strA2 = a(eVar.a(), j10, j11, list, bVar.v(), z10, i10);
            if (StringUtils.isValidString(strA)) {
                a(new com.applovin.impl.e(strA, strA2));
            } else if (o.a()) {
                this.f10431b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (o.a()) {
                this.f10431b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (o.a()) {
                this.f10431b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.A());
        }
    }

    public void trackNativeAdCustomTabsNavigationAborted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFailed(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFinished(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationStarted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackNativeAdCustomTabsTabHidden(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabHiddenPostbacks());
    }

    public void trackNativeAdCustomTabsTabShown(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabShownPostbacks());
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j10, int i10, boolean z10) {
        if (bVar == null) {
            if (o.a()) {
                this.f10431b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.e> listG0 = bVar.g0();
        if (listG0 == null || listG0.isEmpty()) {
            if (o.a()) {
                this.f10431b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.e eVar : listG0) {
            if (StringUtils.isValidString(eVar.c())) {
                String strA = a(eVar.c(), j10, i10, string, z10);
                String strA2 = a(eVar.a(), j10, i10, string, z10);
                if (strA != null) {
                    a(new com.applovin.impl.e(strA, strA2));
                } else if (o.a()) {
                    this.f10431b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
                }
            } else if (o.a()) {
                this.f10431b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinError appLovinError, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f10940b.a(appLovinError, appLovinAdLoadListener);
            }
        });
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof m2) {
            ((m2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.u.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th2) {
            this.f10430a.O();
            if (o.a()) {
                this.f10430a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f10430a.D().a("AppLovinAdService", "buildDeepLinkPlusUrl", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, com.applovin.impl.u uVar, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.t
                @Override // java.lang.Runnable
                public final void run() {
                    appLovinAdLoadListener.adReceived(bVar);
                }
            });
        } else {
            a(new e6(jSONObject, uVar, appLovinAdLoadListener, this.f10430a));
        }
    }

    private boolean b() {
        if (!com.applovin.impl.o0.b()) {
            return true;
        }
        Context contextO = k.o();
        ApplicationExitInfo applicationExitInfoA = androidx.work.impl.utils.j.a(((ActivityManager) contextO.getSystemService("activity")).getHistoricalProcessExitReasons(contextO.getPackageName(), 0, 1).get(0));
        return applicationExitInfoA.getReason() == 10 || applicationExitInfoA.getReason() == 11;
    }

    private void a(com.applovin.impl.u uVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f10430a.O();
            if (o.a()) {
                this.f10430a.O().a("AppLovinAdService", "Loading next ad of zone {" + uVar + "}...");
            }
            c cVarA = a(uVar);
            synchronized (cVarA.f10438a) {
                try {
                    cVarA.f10441d.add(appLovinAdLoadListener);
                    if (!cVarA.f10439b) {
                        cVarA.f10439b = true;
                        a(uVar, new b(cVarA));
                    } else if (o.a()) {
                        this.f10431b.a("AppLovinAdService", "Already waiting on an ad load...");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(i5 i5Var) {
        if (!this.f10430a.B0()) {
            o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f10430a.c();
        this.f10430a.q0().a(i5Var, d6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f10931b.a(appLovinAdLoadListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th2) {
            o.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th2);
            this.f10430a.D().a("AppLovinAdService", "notifyAdLoadedCallback", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th2) {
            o.c("AppLovinAdService", "Unable to notify listener about ad load failure", th2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("notifyAdLoadFailedCallback");
            sb2.append(appLovinAdLoadListener instanceof m2 ? "V2" : "");
            this.f10430a.D().a("AppLovinAdService", sb2.toString(), th2);
        }
    }

    private void a(com.applovin.impl.adview.a aVar, Uri uri, Context context) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        if (k7.a(uri)) {
            a(uri, bVarG, aVar.i(), aVar, context, this.f10430a);
        } else if (bVarG != null && bVarG.isCustomTabsEnabled()) {
            this.f10430a.z().a(uri, aVar, this.f10430a.u0());
        } else {
            k7.b(uri, bVarG, context, this.f10430a);
        }
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (!((Boolean) this.f10430a.a(x4.f11447w)).booleanValue() || (context = e8.b(appLovinAdView, this.f10430a)) == null) {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (k7.a(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f10430a);
        } else if (bVar != null && bVar.isCustomTabsEnabled()) {
            this.f10430a.z().a(uri, aVar, this.f10430a.u0());
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j10, int i10, String str2, boolean z10) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i10 < 0 || i10 > 100) {
                i10 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j10)).appendQueryParameter("pv", Integer.toString(i10)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
        } catch (Throwable th2) {
            if (o.a()) {
                this.f10431b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th2);
            }
            this.f10430a.D().a("AppLovinAdService", "buildVideoEndUrl", th2);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (k7.b(uri, bVar, context, this.f10430a)) {
            t2.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.w();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri uriB = b(uri, "primaryUrl");
            List listA = a(uri, "primaryTrackingUrl");
            Uri uriB2 = b(uri, "fallbackUrl");
            List listA2 = a(uri, "fallbackTrackingUrl");
            if (uriB == null && uriB2 == null) {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(uriB, "primary", listA, bVar, appLovinAdView, aVar, context, kVar)) {
                a(uriB2, "backup", listA2, bVar, appLovinAdView, aVar, context, kVar);
            }
            if (aVar != null) {
                aVar.w();
                return;
            }
            return;
        }
        kVar.O();
        if (o.a()) {
            kVar.O().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        kVar.O();
        if (o.a()) {
            kVar.O().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zB = k7.b(uri, bVar, context, kVar);
        if (zB) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.g0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                t2.b(aVar.e(), bVar, appLovinAdView);
                return zB;
            }
        } else {
            kVar.O();
            if (o.a()) {
                kVar.O().b("AppLovinAdService", "URL failed to open");
            }
        }
        return zB;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th2) {
                this.f10430a.O();
                if (o.a()) {
                    this.f10430a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f10430a.D().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th2);
            }
        }
        return arrayList;
    }

    private String a(String str, long j10, long j11, List list, String str2, boolean z10, int i10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j10)).appendQueryParameter("vs_ms", Long.toString(j11));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            builderAppendQueryParameter.appendQueryParameter(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, str2);
        }
        if (i10 != i.f10667h) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(i.a(i10)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    private void a() {
        Map<String, String> mapTryToStringMap;
        if (o.a()) {
            this.f10431b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f10430a.b(z4.Q);
        if (TextUtils.isEmpty(str)) {
            if (o.a()) {
                this.f10431b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            mapTryToStringMap = null;
        } else {
            mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f10430a.D().d(com.applovin.impl.d2.H0, mapTryToStringMap);
        String str2 = (String) this.f10430a.b(z4.P);
        if (str2 != null) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l10 = (Long) this.f10430a.b(z4.O);
            if (l10 != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l10));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l10));
            }
            a(new com.applovin.impl.e(string, string2));
            return;
        }
        if (o.a()) {
            this.f10431b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    private void a(com.applovin.impl.e eVar) {
        if (StringUtils.isValidString(eVar.c())) {
            this.f10430a.f0().e(com.applovin.impl.sdk.network.d.b().d(eVar.c()).a(StringUtils.isValidString(eVar.a()) ? eVar.a() : null).a(eVar.b()).a(false).b(eVar.d()).a());
        } else if (o.a()) {
            this.f10431b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(final com.applovin.impl.u uVar, final b bVar) {
        AppLovinAdImpl appLovinAdImplE = this.f10430a.i().e(uVar);
        if (appLovinAdImplE != null && !appLovinAdImplE.isExpired()) {
            if (o.a()) {
                this.f10431b.a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplE + " for " + uVar);
            }
            bVar.adReceived(appLovinAdImplE);
            return;
        }
        MaxAdFormat maxAdFormatD = uVar.d();
        if (((Boolean) this.f10430a.a(x4.X0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f10430a.h().a(uVar, new d.a() { // from class: com.applovin.impl.sdk.v
                @Override // com.applovin.impl.sdk.d.a
                public final void a(com.applovin.impl.sdk.ad.b bVar2) {
                    this.f10959a.a(bVar, uVar, bVar2);
                }
            });
        } else {
            a(new y5(uVar, bVar, this.f10430a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final b bVar, com.applovin.impl.u uVar, final com.applovin.impl.sdk.ad.b bVar2) {
        if (bVar2 != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.w
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.adReceived(bVar2);
                }
            });
        } else {
            a(new y5(uVar, bVar, this.f10430a));
        }
    }

    private c a(com.applovin.impl.u uVar) {
        c cVar;
        synchronized (this.f10433d) {
            try {
                cVar = (c) this.f10432c.get(uVar);
                if (cVar == null) {
                    cVar = new c();
                    this.f10432c.put(uVar, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
