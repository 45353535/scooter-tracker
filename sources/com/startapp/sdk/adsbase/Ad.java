package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.b2;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.tk;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class Ad {
    private static boolean init;
    protected ActivityExtra activityExtra;

    @NonNull
    protected final lb adCacheManager;
    private AdInformationOverrides adInfoOverride;
    protected ConsentData consentData;

    @NonNull
    protected final lb consentManager;

    @NonNull
    protected final Context context;

    @Nullable
    private String erid;

    @Nullable
    private String eridUrl;

    @Nullable
    protected String errorMessage;

    @NonNull
    protected final lb eventTracer;

    @NonNull
    protected final lb httpClient;

    @NonNull
    protected final lb motionProcessor;

    @NonNull
    protected final lb networkApiExecutor;
    private NotDisplayedReason notDisplayedReason;

    @Nullable
    protected final AdPreferences.Placement placement;

    @Nullable
    private String requestUrl;
    private boolean tiedToAdm;
    private AdType type;

    @NonNull
    protected final lb videoAdCacheManager;
    private boolean videoCancelCallBack;

    @NonNull
    protected final lb webViewCacheLoader;

    @NonNull
    protected final lb webViewFactory;

    @NonNull
    private WeakReference<Activity> adapterCompatActivity = new WeakReference<>(null);
    protected Serializable extraData = null;
    protected Long adCacheTtl = null;
    private AdState state = AdState.UN_INITIALIZED;
    private Long lastLoadTime = null;
    protected boolean belowMinCPM = false;

    @Keep
    public enum AdState {
        UN_INITIALIZED,
        PROCESSING,
        READY
    }

    @Keep
    public enum AdType {
        INTERSTITIAL,
        RICH_TEXT,
        VIDEO,
        REWARDED_VIDEO,
        NON_VIDEO,
        VIDEO_NO_VAST
    }

    @Keep
    public Ad(@NonNull Context context, @Nullable AdPreferences.Placement placement, @NonNull lb lbVar, @NonNull lb lbVar2, @NonNull lb lbVar3, @NonNull lb lbVar4, @NonNull lb lbVar5, @NonNull lb lbVar6, @NonNull lb lbVar7, @NonNull lb lbVar8, @NonNull lb lbVar9) {
        this.context = context;
        this.placement = placement;
        this.eventTracer = lbVar;
        this.consentManager = lbVar2;
        this.adCacheManager = lbVar3;
        this.videoAdCacheManager = lbVar4;
        this.webViewFactory = lbVar5;
        this.httpClient = lbVar6;
        this.networkApiExecutor = lbVar7;
        this.motionProcessor = lbVar8;
        this.webViewCacheLoader = lbVar9;
        WeakHashMap weakHashMap = vi.f65408a;
        this.adInfoOverride = AdInformationOverrides.a();
    }

    private static boolean b(String str) {
        EnabledConfig enabledConfigE;
        if (str == null || (enabledConfigE = MetaData.E().e()) == null) {
            return true;
        }
        return enabledConfigE.a(new n());
    }

    protected boolean canShowAd() {
        return MetaData.E().b();
    }

    protected abstract b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public Long getAdCacheTtl() {
        long fallbackAdCacheTtl = getFallbackAdCacheTtl();
        Long l10 = this.adCacheTtl;
        if (l10 != null) {
            fallbackAdCacheTtl = Math.min(l10.longValue(), fallbackAdCacheTtl);
        }
        return Long.valueOf(fallbackAdCacheTtl);
    }

    public abstract String getAdId();

    @Keep
    public AdInformationOverrides getAdInfoOverride() {
        return this.adInfoOverride;
    }

    @Nullable
    @Keep
    public final ConsentData getConsentData() {
        return this.consentData;
    }

    @NonNull
    public Context getContext() {
        return this.context;
    }

    @Nullable
    public String getDParam() {
        return null;
    }

    @Nullable
    public String getErid() {
        return this.erid;
    }

    @Nullable
    public String getEridUrl() {
        return this.eridUrl;
    }

    @Nullable
    @Keep
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Keep
    public Serializable getExtraData() {
        return this.extraData;
    }

    protected long getFallbackAdCacheTtl() {
        return CacheMetaData.b().a().a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long getLastLoadTime() {
        return this.lastLoadTime;
    }

    @Keep
    public NotDisplayedReason getNotDisplayedReason() {
        return this.notDisplayedReason;
    }

    @Nullable
    protected AdPreferences.Placement getPlacement() {
        return this.placement;
    }

    @Nullable
    public String getRequestUrl() {
        return this.requestUrl;
    }

    @Keep
    public AdState getState() {
        return this.state;
    }

    @Keep
    public AdType getType() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getVideoCancelCallBack() {
        return this.videoCancelCallBack;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean hasAdCacheTtlPassed() {
        return this.lastLoadTime != null && System.currentTimeMillis() - this.lastLoadTime.longValue() > getAdCacheTtl().longValue();
    }

    @Keep
    public boolean isBelowMinCPM() {
        return this.belowMinCPM;
    }

    @Keep
    public boolean isReady() {
        return this.state == AdState.READY && !hasAdCacheTtlPassed();
    }

    public boolean isTiedToAdm() {
        return this.tiedToAdm;
    }

    @Keep
    @Deprecated
    public void load() {
        load(new AdPreferences(), null);
    }

    protected final void loadAds(@Nullable AdPreferences adPreferences, @Nullable AdEventListener adEventListener, @Nullable String str) {
        this.tiedToAdm = str != null;
        b2 b2VarCreateService = createService(adPreferences, adEventListener, str);
        if (b2VarCreateService != null) {
            ((z6) ((y6) this.eventTracer.a())).a(this, b2VarCreateService);
            b2VarCreateService.a();
        } else if (adEventListener != null) {
            adEventListener.onFailedToReceiveAd(this);
        }
    }

    @Nullable
    protected Activity resolveActivityToShowAd() {
        Object obj = this.context;
        if (!(obj instanceof Activity)) {
            obj = this.adapterCompatActivity.get();
        }
        Activity activity = (Activity) obj;
        return activity == null ? ih.f64695a.f64783k : activity;
    }

    @Keep
    public void setActivityExtra(ActivityExtra activityExtra) {
        this.activityExtra = activityExtra;
    }

    @Keep
    public void setAdInfoOverride(AdInformationOverrides adInformationOverrides) {
        this.adInfoOverride = adInformationOverrides;
    }

    @Keep
    public void setContext(@NonNull Context context) {
        if (context instanceof Activity) {
            this.adapterCompatActivity = new WeakReference<>((Activity) context);
        }
    }

    public void setErid(@Nullable String str) {
        this.erid = str;
    }

    public void setEridUrl(@Nullable String str) {
        this.eridUrl = str;
    }

    @Keep
    public void setErrorMessage(@Nullable String str) {
        this.errorMessage = str;
    }

    @Keep
    public void setExtraData(Serializable serializable) {
        this.extraData = serializable;
    }

    protected void setNotDisplayedReason(NotDisplayedReason notDisplayedReason) {
        this.notDisplayedReason = notDisplayedReason;
    }

    public void setRequestUrl(@Nullable String str) {
        this.requestUrl = str;
    }

    @Keep
    public void setState(AdState adState) {
        this.state = adState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setVideoCancelCallBack(boolean z10) {
        this.videoCancelCallBack = z10;
    }

    @Keep
    @Deprecated
    public void load(@Nullable AdEventListener adEventListener) {
        load(new AdPreferences(), adEventListener);
    }

    @Keep
    @Deprecated
    public void load(@Nullable AdPreferences adPreferences) {
        load(adPreferences, null);
    }

    @Keep
    @Deprecated
    public void load(@Nullable AdPreferences adPreferences, @Nullable AdEventListener adEventListener) {
        load(adPreferences, adEventListener, null);
    }

    @Keep
    @Deprecated
    public void load(@Nullable AdPreferences adPreferences, @Nullable AdEventListener adEventListener, @Nullable String str) {
        String str2;
        boolean z10;
        String name;
        a aVar = new a(this, adEventListener);
        ((tk) this.webViewFactory.a()).b();
        boolean z11 = true;
        if (!init) {
            g.f(this.context);
            init = true;
        }
        if (this.state != AdState.UN_INITIALIZED) {
            str2 = "load() was already called.";
            z10 = true;
        } else {
            str2 = "";
            z10 = false;
        }
        Context context = this.context;
        WeakHashMap weakHashMap = vi.f65408a;
        if (!((g6) com.startapp.sdk.components.a.a(context).f64193t.a()).b()) {
            str2 = "network not available.";
            z10 = true;
        }
        if (canShowAd()) {
            z11 = z10;
        } else {
            str2 = "serving ads disabled";
        }
        if (z11) {
            setErrorMessage("Ad wasn't loaded: ".concat(str2));
            a0.a(this.context, aVar, this, false);
            return;
        }
        setState(AdState.PROCESSING);
        b bVar = new b(this, adPreferences, aVar, str);
        if (adPreferences != null && adPreferences.getType() != null) {
            this.type = adPreferences.getType();
        }
        if (adPreferences != null && adPreferences.getPlacementId() == null) {
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
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f64707l);
        ((z6) ((y6) this.eventTracer.a())).a(this, bVar);
        MetaData.E().a(this.context, adPreferences, pg.f65112d.f65115c, b(str), bVar, false);
    }
}
