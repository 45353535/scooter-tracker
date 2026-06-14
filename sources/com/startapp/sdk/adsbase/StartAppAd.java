package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.b2;
import com.startapp.sdk.internal.ca;
import com.startapp.sdk.internal.da;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.h7;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.jh;
import com.startapp.sdk.internal.k0;
import com.startapp.sdk.internal.l7;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.m7;
import com.startapp.sdk.internal.ma;
import com.startapp.sdk.internal.n7;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.p7;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.x0;
import com.startapp.sdk.internal.y;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.internal.zb;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class StartAppAd extends Ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lb f63944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lb f63945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lb f63946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CacheKey f63947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f63948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h7 f63949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AdMode f63950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AdPreferences f63951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.startapp.sdk.adsbase.adlisteners.VideoListener f63952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    AdDisplayListener f63953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h f63954k;

    @Keep
    public enum AdMode {
        AUTOMATIC,
        FULLPAGE,
        OFFERWALL,
        REWARDED_VIDEO,
        VIDEO,
        OVERLAY
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Keep
    public StartAppAd(@NonNull Context context) {
        lb lbVar = com.startapp.sdk.components.a.a(context).K;
        lb lbVar2 = com.startapp.sdk.components.a.a(context).f64183j;
        lb lbVar3 = com.startapp.sdk.components.a.a(context).M;
        lb lbVar4 = com.startapp.sdk.components.a.a(context).N;
        lb lbVar5 = com.startapp.sdk.components.a.a(context).f64175b;
        lb lbVar6 = com.startapp.sdk.components.a.a(context).f64187n;
        lb lbVar7 = com.startapp.sdk.components.a.a(context).A;
        lb lbVar8 = com.startapp.sdk.components.a.a(context).f64196w;
        lb lbVar9 = com.startapp.sdk.components.a.a(context).f64176c;
        lb lbVar10 = com.startapp.sdk.components.a.a(context).f64174a;
        lb lbVar11 = com.startapp.sdk.components.a.a(context).G;
        lb lbVar12 = com.startapp.sdk.components.a.a(context).f64194u;
        super(context, null, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.f63947d = null;
        this.f63950g = AdMode.AUTOMATIC;
        this.f63951h = null;
        this.f63952i = null;
        this.f63953j = null;
        this.f63954k = new h(this);
        this.f63944a = lbVar10;
        this.f63945b = lbVar11;
        this.f63946c = lbVar12;
        try {
            ((sf) lbVar12.a()).a(8192);
        } catch (Throwable unused) {
        }
    }

    @Keep
    public static void disableAutoInterstitial() {
        ma.f64919a.f64046a = false;
    }

    @Keep
    @Deprecated
    public static void disableSplash() {
    }

    @Keep
    public static void enableAutoInterstitial() {
        ma.f64919a.f64046a = true;
    }

    @Keep
    @Deprecated
    public static void enableConsent(@NonNull Context context, boolean z10) {
        StartAppSDK.enableConsent(context, z10);
    }

    @Keep
    @Deprecated
    public static void init(Context context, String str, String str2) {
        StartAppSDK.init(context, str, str2);
    }

    @Keep
    public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autoInterstitialPreferences) {
        e eVar = ma.f64919a;
        eVar.f64047b = autoInterstitialPreferences;
        eVar.f64048c = -1L;
        eVar.f64049d = -1;
    }

    @Keep
    public static void setCommonAdsPreferences(@NonNull Context context, @NonNull SDKAdPreferences sDKAdPreferences) {
        Context contextA = x0.a(context);
        if (contextA != null) {
            ih.f64695a.f64773a = sDKAdPreferences;
            g7.b(contextA, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
        }
    }

    @Keep
    public static void setReturnAdsPreferences(@Nullable AdPreferences adPreferences) {
    }

    @Keep
    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle) {
    }

    @Keep
    @Deprecated
    public void close() {
        zb.a(this.context).a(this.f63954k);
        zb.a(this.context).a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    @Override // com.startapp.sdk.adsbase.Ad
    protected final /* bridge */ /* synthetic */ b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        Object objA = ((com.startapp.sdk.internal.p) this.adCacheManager.a()).a(this.f63947d);
        if (objA instanceof o8) {
            return vi.a(((o8) objA).a(), "@adId@", "@adId@");
        }
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    protected final AdPreferences.Placement getPlacement() {
        AdPreferences.Placement placement = super.getPlacement();
        return (placement != null || this.f63947d == null || ((com.startapp.sdk.internal.p) this.adCacheManager.a()).a(this.f63947d) == null) ? placement : ((Ad) ((com.startapp.sdk.internal.p) this.adCacheManager.a()).a(this.f63947d)).getPlacement();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final Ad.AdState getState() {
        f fVarA = ((com.startapp.sdk.internal.p) this.adCacheManager.a()).a(this.f63947d);
        return fVarA != null ? fVarA.getState() : Ad.AdState.UN_INITIALIZED;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final boolean isBelowMinCPM() {
        f fVarA = ((com.startapp.sdk.internal.p) this.adCacheManager.a()).a(this.f63947d);
        if (fVarA != null) {
            return fVarA.isBelowMinCPM();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Keep
    @Deprecated
    public boolean isReady() {
        f fVarA = ((com.startapp.sdk.internal.p) this.adCacheManager.a()).a(this.f63947d);
        if (fVarA != null) {
            return fVarA.isReady();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Keep
    @Deprecated
    public void load(@Nullable AdPreferences adPreferences, @Nullable AdEventListener adEventListener) {
        load(adPreferences, adEventListener, null);
    }

    @Keep
    public void loadAd() {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), (AdEventListener) null);
    }

    @Keep
    @Deprecated
    public void onBackPressed() {
        showAd("exit_ad");
        jh jhVar = ih.f64695a;
        jhVar.f64775c = false;
        jhVar.f64777e = true;
    }

    @Keep
    @Deprecated
    public void onPause() {
    }

    @Keep
    @Deprecated
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        int i10 = bundle.getInt("AdMode");
        this.f63950g = AdMode.AUTOMATIC;
        if (i10 == 1) {
            this.f63950g = AdMode.FULLPAGE;
        } else if (i10 == 2) {
            this.f63950g = AdMode.OFFERWALL;
        } else if (i10 == 3) {
            this.f63950g = AdMode.OVERLAY;
        } else if (i10 == 4) {
            this.f63950g = AdMode.REWARDED_VIDEO;
        } else if (i10 == 5) {
            this.f63950g = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.f63951h = (AdPreferences) serializable;
        }
    }

    @Keep
    @Deprecated
    public void onResume() {
        if (isReady()) {
            return;
        }
        loadAd();
    }

    @Keep
    @Deprecated
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        int i10 = m.f64076a[this.f63950g.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        i11 = 0;
                    }
                }
            }
        }
        AdPreferences adPreferences = this.f63951h;
        if (adPreferences != null) {
            bundle.putSerializable("AdPrefs", adPreferences);
        }
        bundle.putInt("AdMode", i11);
    }

    @Keep
    public void setVideoListener(@Nullable com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener) {
        this.f63952i = videoListener;
    }

    @Keep
    public boolean showAd() {
        return showAd(null, null);
    }

    @Keep
    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Keep
    @Deprecated
    public void load(@Nullable AdPreferences adPreferences, @Nullable AdEventListener adEventListener, @Nullable String str) {
        String name;
        if (!canShowAd()) {
            if (adEventListener != null) {
                setErrorMessage("serving ads disabled");
                a0.a(this.context, adEventListener, this, false);
                return;
            }
            return;
        }
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        if (adPreferences.getPlacementId() == null) {
            Context baseContext = this.context;
            String packageName = baseContext.getPackageName();
            String name2 = getClass().getName();
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    name = null;
                    break;
                } else {
                    if (baseContext instanceof Activity) {
                        name = baseContext.getClass().getName();
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            adPreferences.setPlacementId(h0.a(packageName, name2, name, (String) null));
        }
        ((z6) ((y6) this.eventTracer.a())).a((Object) this, ii.f64696a);
        i iVar = new i(this, adEventListener);
        if (e7.a(false, adPreferences.getAdTag(), false, this.f63950g == AdMode.REWARDED_VIDEO)) {
            b(new j(this, iVar), 1);
            return;
        }
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f64721z);
        AdPreferences adPreferences2 = this.f63951h;
        if (adPreferences2 == null) {
            adPreferences2 = new AdPreferences();
        }
        this.f63947d = ((com.startapp.sdk.internal.p) this.adCacheManager.a()).a(this, this.f63950g, this.f63951h, new k(this, iVar, adPreferences2), str);
    }

    @Keep
    public void loadAd(@NonNull AdPreferences adPreferences) {
        loadAd(AdMode.AUTOMATIC, adPreferences, (AdEventListener) null);
    }

    @Keep
    @Deprecated
    public boolean showAd(String str) {
        return showAd(str, null);
    }

    static void a(StartAppAd startAppAd, i iVar) {
        ((z6) ((y6) startAppAd.eventTracer.a())).c(startAppAd, ii.f64721z);
        AdPreferences adPreferences = startAppAd.f63951h;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        startAppAd.f63947d = ((com.startapp.sdk.internal.p) startAppAd.adCacheManager.a()).a(startAppAd, startAppAd.f63950g, startAppAd.f63951h, new k(startAppAd, iVar, adPreferences), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AdEventListener adEventListener, final int i10) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f64720y);
        AdPreferences adPreferences = this.f63951h;
        if (adPreferences != null && !TextUtils.isEmpty(adPreferences.getAdTag())) {
            h0.a(new Runnable() { // from class: com.startapp.sdk.adsbase.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64115b.a(adEventListener, i10);
                }
            });
        } else {
            adEventListener.onFailedToReceiveAd(null);
        }
    }

    @Keep
    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences) {
    }

    @Keep
    public void loadAd(@NonNull AdEventListener adEventListener) {
        loadAd(adEventListener, (String) null);
    }

    @Keep
    public boolean showAd(@Nullable AdDisplayListener adDisplayListener) {
        return showAd(null, adDisplayListener);
    }

    @Keep
    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences, SplashHideListener splashHideListener) {
    }

    @Keep
    public void loadAd(@NonNull AdEventListener adEventListener, @Nullable String str) {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener, str);
    }

    @Keep
    @Deprecated
    public boolean showAd(@Deprecated String str, AdDisplayListener adDisplayListener) {
        try {
            return a(str, adDisplayListener);
        } catch (Throwable th2) {
            g9.a(th2);
            setNotDisplayedReason(NotDisplayedReason.INTERNAL_ERROR);
            y.a(this.context, this.f63953j, null);
            return false;
        }
    }

    @Keep
    @Deprecated
    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }

    @Keep
    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences) {
    }

    @Keep
    public void loadAd(@NonNull AdPreferences adPreferences, @NonNull AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, adPreferences, adEventListener);
    }

    @Keep
    public void loadAd(@NonNull AdMode adMode) {
        loadAd(adMode, new AdPreferences(), (AdEventListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdEventListener adEventListener, final int i10) {
        final AdEventListener adEventListener2;
        Throwable th2;
        final AdUnitConfig adUnitConfig;
        try {
            final MetaData metaDataE = MetaData.E();
            ExternalAdConfig externalAdConfigV = metaDataE.v();
            if (externalAdConfigV != null) {
                try {
                    adUnitConfig = externalAdConfigV.getMapping().get(this.f63951h.getAdTag());
                } catch (Throwable th3) {
                    th2 = th3;
                    adEventListener2 = adEventListener;
                }
            } else {
                adUnitConfig = null;
            }
            if (adUnitConfig == null) {
                adEventListener.onFailedToReceiveAd(null);
                return;
            }
            adEventListener2 = adEventListener;
            try {
                ((k0) this.f63944a.a()).b(adUnitConfig, new Function1() { // from class: com.startapp.sdk.adsbase.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return this.f64110b.a(adEventListener2, adUnitConfig, i10, metaDataE, (h7) obj);
                    }
                });
                return;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            adEventListener2 = adEventListener;
        }
        th2 = th;
        adEventListener2.onFailedToReceiveAd(null);
        g9.a(th2);
    }

    @Keep
    public void loadAd(@NonNull AdMode adMode, @NonNull AdPreferences adPreferences) {
        loadAd(adMode, adPreferences, (AdEventListener) null);
    }

    @Keep
    @Deprecated
    public static boolean showAd(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return new StartAppAd(context).showAd();
        } catch (Throwable th2) {
            g9.a(th2);
            return false;
        }
    }

    @Keep
    public void loadAd(@NonNull AdMode adMode, @NonNull AdEventListener adEventListener) {
        loadAd(adMode, new AdPreferences(), adEventListener);
    }

    @Keep
    public void loadAd(@NonNull AdMode adMode, @Nullable AdPreferences adPreferences, @Nullable AdEventListener adEventListener) {
        loadAd(adMode, adPreferences, adEventListener, null);
    }

    @Keep
    public void loadAd(@NonNull AdMode adMode, @Nullable AdEventListener adEventListener, @Nullable String str) {
        loadAd(adMode, new AdPreferences(), adEventListener, str);
    }

    @Keep
    public void loadAd(@NonNull AdMode adMode, @Nullable AdPreferences adPreferences, @Nullable AdEventListener adEventListener, @Nullable String str) {
        try {
            ((sf) this.f63946c.a()).a(16384);
        } catch (Throwable unused) {
        }
        this.f63950g = adMode;
        this.f63951h = adPreferences;
        try {
            load(adPreferences, adEventListener, str);
        } catch (Throwable th2) {
            g9.a(th2);
            if (adEventListener != null) {
                a0.a(this.context, adEventListener, this, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit a(AdEventListener adEventListener, AdUnitConfig adUnitConfig, int i10, MetaData metaData, h7 h7Var) {
        DisplayMetrics displayMetrics;
        Point point = new Point();
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        }
        if (h7Var == null) {
            adEventListener.onFailedToReceiveAd(null);
            return Unit.f93236a;
        }
        this.f63949f = h7Var;
        p7 p7Var = (p7) h7Var;
        p7Var.f65086c = new l(this, adEventListener, adUnitConfig, i10, metaData, point);
        boolean z10 = this.f63950g == AdMode.REWARDED_VIDEO;
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, List<String>> entry : p7Var.f65085b.getKeyValues().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest adManagerAdRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(adManagerAdRequestBuild, "build(...)");
        if (z10) {
            RewardedAd.load(p7Var.f65084a, p7Var.f65085b.getAdUnitId(), adManagerAdRequestBuild, (RewardedAdLoadCallback) new l7(p7Var));
        } else {
            AdManagerInterstitialAd.load(p7Var.f65084a, p7Var.f65085b.getAdUnitId(), adManagerAdRequestBuild, new m7(p7Var));
        }
        return Unit.f93236a;
    }

    static void a(StartAppAd startAppAd, boolean z10, String uuid, String originalTS, AdPreferences adPreferences, AdUnitConfig config, int i10) {
        Context context = startAppAd.context;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        lb lbVar = startAppAd.httpClient;
        lb lbVar2 = startAppAd.networkApiExecutor;
        lb lbVar3 = startAppAd.eventTracer;
        lb lbVar4 = startAppAd.motionProcessor;
        ca caVar = new ca(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4);
        caVar.f64355a = startAppAd.f63950g == AdMode.REWARDED_VIDEO;
        caVar.f64356b = z10;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        caVar.f64357c = uuid;
        Intrinsics.checkNotNullParameter(originalTS, "originalTS");
        caVar.f64359e = originalTS;
        Intrinsics.checkNotNullParameter(config, "config");
        caVar.f64358d = config;
        caVar.f64362h = Integer.valueOf(i10);
        caVar.f64363i = config.getSioPrice();
        new da(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4, caVar).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r9, com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r10) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.a(java.lang.String, com.startapp.sdk.adsbase.adlisteners.AdDisplayListener):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        p7 p7Var = (p7) this.f63949f;
        p7Var.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        AdManagerInterstitialAd adManagerInterstitialAd = p7Var.f65087d;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(new n7(p7Var));
        }
        AdManagerInterstitialAd adManagerInterstitialAd2 = p7Var.f65087d;
        if (adManagerInterstitialAd2 != null) {
            adManagerInterstitialAd2.show(activity);
        } else {
            p7Var.a(activity);
        }
    }
}
