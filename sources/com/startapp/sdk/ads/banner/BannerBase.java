package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.g1;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ik;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.vi;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BannerBase extends RelativeLayout {
    private static final int LOAD_BANNER = 1;
    private static final int LOAD_BANNER_DELAYED = 2;
    private static final String LOG_TAG = "BannerBase";
    private static final long MIN_REFRESH_INTERVAL_MILLIS = 10000;
    private static final long RELOAD_CHECK_INTERVAL_MILLIS = 2000;

    @NonNull
    protected final lb adCacheManager;

    @Nullable
    private AdPreferences adPreferences;
    protected AdRulesResult adRulesResult;
    private boolean attachedToWindow;
    private boolean clicked;

    @NonNull
    protected final lb consentManager;

    @Nullable
    protected Point desirableSizeForManualLoading;
    protected boolean drawn;

    @Nullable
    private String error;

    @NonNull
    protected final lb eventTracer;
    private boolean firstLoad;

    @NonNull
    private final Handler handler;

    @NonNull
    private final Object handlerLock;

    @NonNull
    protected final lb httpClient;
    private long loadedUptimeMillis;

    @NonNull
    protected final lb motionProcessor;

    @NonNull
    protected final lb networkApiExecutor;
    protected int offset;

    @NonNull
    protected final lb runtimeClassDetector;

    @NonNull
    private final Runnable scheduleReloadTask;
    private boolean shouldReloadBanner;

    @NonNull
    protected final lb showIntentionsKeeper;

    @NonNull
    protected final lb videoAdCacheManager;
    protected ik viewabilityRunner;

    @NonNull
    protected final lb webViewCacheLoader;

    @NonNull
    protected final lb webViewFactory;

    public BannerBase(Context context, AttributeSet attributeSet, int i10, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10, lb lbVar11) {
        super(context, attributeSet, i10);
        this.attachedToWindow = false;
        this.offset = 0;
        this.firstLoad = true;
        this.drawn = false;
        this.clicked = false;
        this.shouldReloadBanner = false;
        this.scheduleReloadTask = new Runnable() { // from class: com.startapp.sdk.ads.banner.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f63768b.scheduleReloadTask();
            }
        };
        this.handler = new Handler(Looper.getMainLooper(), new a(this));
        this.handlerLock = new Object();
        this.eventTracer = lbVar;
        this.consentManager = lbVar2;
        this.adCacheManager = lbVar3;
        this.videoAdCacheManager = lbVar4;
        this.webViewFactory = lbVar5;
        this.httpClient = lbVar6;
        this.networkApiExecutor = lbVar7;
        this.motionProcessor = lbVar8;
        this.webViewCacheLoader = lbVar9;
        this.runtimeClassDetector = lbVar10;
        this.showIntentionsKeeper = lbVar11;
        setAdTag(new g1(context, attributeSet).f64541a);
        try {
            ((sf) lbVar10.a()).a(512);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addDisplayEventOnLoad() {
        if (isFirstLoad() || AdaptMetaData.b().a().b()) {
            setFirstLoad(false);
            t.f65279d.a(new s(AdPreferences.Placement.INAPP_BANNER, getAdTag()));
        }
    }

    protected void cancelDelayedLoading() {
        synchronized (this.handlerLock) {
            this.handler.removeMessages(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancelReloadTask() {
        if (isInEditMode()) {
            return;
        }
        removeCallbacks(this.scheduleReloadTask);
        cancelDelayedLoading();
    }

    @NonNull
    protected Point getAdLoadingSize() {
        return new Point(getWidthInDp(), getHeightInDp());
    }

    @NonNull
    public AdPreferences getAdPreferences() {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences != null) {
            return adPreferences;
        }
        AdPreferences adPreferences2 = new AdPreferences();
        this.adPreferences = adPreferences2;
        return adPreferences2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public String getAdTag() {
        return getAdPreferences().getAdTag();
    }

    protected abstract String getBannerName();

    @Nullable
    public String getErrorMessage() {
        return this.error;
    }

    @Keep
    protected abstract int getHeightInDp();

    protected long getRefreshDelayMillis() {
        return 0L;
    }

    protected abstract int getRefreshRate();

    protected long getTimePassedSinceAdLoadedToViewMillis() {
        return SystemClock.uptimeMillis() - this.loadedUptimeMillis;
    }

    @NonNull
    protected View getViewableBanner() {
        return this;
    }

    @Keep
    protected abstract int getWidthInDp();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void hideBanner();

    protected void init() {
        if (!isInEditMode()) {
            initRuntime();
            return;
        }
        setMinimumWidth(li.a(getContext(), getWidthInDp()));
        setMinimumHeight(li.a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(getBannerName());
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    protected abstract void initRuntime();

    protected boolean isAdLoadedToView() {
        return this.loadedUptimeMillis > 0;
    }

    public boolean isClicked() {
        return this.clicked;
    }

    public boolean isFirstLoad() {
        return this.firstLoad;
    }

    protected boolean isTiedToAdm() {
        return false;
    }

    protected void load(@Nullable String str) {
        ik ikVar = this.viewabilityRunner;
        if (ikVar != null) {
            ikVar.a();
            this.viewabilityRunner = null;
        }
        if (this.adRulesResult != null && !AdaptMetaData.b().a().b()) {
            if (this.adRulesResult.b()) {
                reload(str);
            }
        } else {
            AdRulesResult adRulesResultA = AdaptMetaData.b().a().a(AdPreferences.Placement.INAPP_BANNER, getAdTag());
            this.adRulesResult = adRulesResultA;
            if (adRulesResultA.b()) {
                reload(str);
            } else {
                hideBanner();
            }
        }
    }

    public void loadAd(int i10, int i11) {
        loadAd(i10, i11, null);
    }

    protected void loadBanner(@Nullable String str) {
        try {
            ((sf) this.runtimeClassDetector.a()).a(1024);
        } catch (Throwable unused) {
        }
        synchronized (this.handlerLock) {
            try {
                if (!this.handler.hasMessages(1)) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = str;
                    messageObtain.what = 1;
                    this.handler.sendMessage(messageObtain);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void loadBannerDelayed(long j10) {
        synchronized (this.handlerLock) {
            this.handler.removeMessages(2);
            this.handler.sendEmptyMessageDelayed(2, j10);
        }
    }

    protected void loadBannerImpl(@Nullable String str) {
        scheduleReloadTask();
        load(str);
    }

    protected void onAdLoadedToView() {
        getContext();
        WeakHashMap weakHashMap = vi.f65408a;
        Log.println(2, "StartAppSDK", "Banner start rendering the ad content");
        this.loadedUptimeMillis = SystemClock.uptimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            ((sf) this.runtimeClassDetector.a()).a(4096);
        } catch (Throwable unused) {
        }
        this.attachedToWindow = true;
        scheduleReloadTask();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        cancelReloadTask();
        ik ikVar = this.viewabilityRunner;
        if (ikVar != null) {
            ikVar.a();
            this.viewabilityRunner = null;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.adRulesResult = (AdRulesResult) bundle.getSerializable("adRulesResult");
        this.adPreferences = (AdPreferences) bundle.getSerializable("adPreferences");
        this.offset = bundle.getInt("offset");
        this.firstLoad = bundle.getBoolean("firstLoad");
        this.shouldReloadBanner = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.shouldReloadBanner = true;
        }
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("upperState", parcelableOnSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.adRulesResult);
        bundle.putSerializable("adPreferences", this.adPreferences);
        bundle.putInt("offset", this.offset);
        bundle.putBoolean("firstLoad", this.firstLoad);
        bundle.putBoolean("shouldReloadBanner", this.shouldReloadBanner);
        return bundle;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10) {
            this.attachedToWindow = false;
            cancelReloadTask();
            return;
        }
        if (this.shouldReloadBanner) {
            this.shouldReloadBanner = false;
            load(null);
        }
        this.attachedToWindow = true;
        scheduleReloadTask();
    }

    @NonNull
    protected AdPreferences prepareAdPreferences() {
        AdPreferences adPreferences = getAdPreferences();
        if (adPreferences.getPlacementId() == null) {
            adPreferences.setPlacementId(h0.a(this));
        }
        adPreferences.setHardwareAccelerated(q0.a(this, this.attachedToWindow));
        return adPreferences;
    }

    protected abstract void reload(String str);

    protected void scheduleReloadTask() {
        AdRulesResult adRulesResult;
        if (!isInEditMode() && CacheMetaData.d() && this.attachedToWindow && !isTiedToAdm()) {
            long jMax = Math.max(0L, getRefreshDelayMillis());
            long jMax2 = ((this.loadedUptimeMillis + Math.max(10000L, getRefreshRate())) - jMax) - SystemClock.uptimeMillis();
            if (jMax2 > 0) {
                removeCallbacks(this.scheduleReloadTask);
                if (jMax <= 0) {
                    jMax2 = Math.min(2000L, jMax2);
                }
                postDelayed(this.scheduleReloadTask, jMax2);
                return;
            }
            if (isShown() || ((adRulesResult = this.adRulesResult) != null && !adRulesResult.b())) {
                load(null);
            }
            loadBannerDelayed(((long) MetaData.E().M()) * 1000);
        }
    }

    public void setAdPreferences(@Nullable AdPreferences adPreferences) {
        this.adPreferences = adPreferences != null ? new AdPreferences(adPreferences) : null;
    }

    public void setAdTag(@Nullable String str) {
        getAdPreferences().setAdTag(str);
    }

    public void setClicked(boolean z10) {
        this.clicked = z10;
    }

    public void setErrorMessage(@Nullable String str) {
        this.error = str;
    }

    public void setFirstLoad(boolean z10) {
        this.firstLoad = z10;
    }

    protected boolean shouldSendImpression(ag agVar) {
        return agVar != null && agVar.f64280j.get() == 0;
    }

    protected void startVisibilityRunnable(ag agVar) {
        if (this.viewabilityRunner != null) {
            return;
        }
        ik ikVar = new ik(getViewableBanner(), getAdLoadingSize(), agVar, BannerMetaData.c().a());
        this.viewabilityRunner = ikVar;
        if (ikVar.c()) {
            ikVar.run();
        }
    }

    public void loadAd(int i10, int i11, @Nullable String str) {
        if (i10 > getWidthInDp() && i11 > getHeightInDp()) {
            this.desirableSizeForManualLoading = new Point(i10, i11);
        }
        loadBanner(str);
    }

    @Keep
    public void loadAd() {
        loadBanner(null);
    }

    @Keep
    public void loadAd(@Nullable String str) {
        loadBanner(str);
    }
}
