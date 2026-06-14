package com.mobilefuse.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.core.R;
import com.mobilefuse.sdk.internal.AdRefresher;
import com.mobilefuse.sdk.internal.Callback;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.internal.mute.MutableAd;
import com.mobilefuse.sdk.internal.mute.MutableAdController;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetrySdkTypesKt;
import com.mobilefuse.sdk.utils.AdErrorCallback;
import com.mobilefuse.sdk.utils.PlacementUtil;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class MobileFuseBannerAd extends FrameLayout implements WinningBidInfoSource, MutableAd {
    private boolean activityInBackground;
    private AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver;
    protected int adBackgroundColor;
    protected AdController adController;
    protected AdController.AdListener adControllerListener;
    protected boolean adExpanded;

    @NonNull
    private final AdInstanceInfo adInstanceInfo;
    protected Listener adListener;
    protected AdController adRefreshedController;
    protected AdController.AdListener adRefreshedControllerListener;
    private AdRefresher adRefresher;
    private AdSize adSize;

    @NonNull
    private final AdController.AdType adType;
    private boolean attachedToWindow;
    private boolean destroyed;

    @NonNull
    private final Handler handler;
    private FrameLayout inlineContainer;

    @NonNull
    protected final MutableAdController mutableAdController;

    @NonNull
    protected final ObservableConfig observableConfig;
    private String placementId;
    private Activity renderingActivity;
    private boolean requestedOneTimeAdRefresh;

    public enum AdSize {
        BANNER_320x50("BANNER_320x50", 320, 50),
        BANNER_300x50("BANNER_300x50", 300, 50),
        BANNER_300x250("BANNER_300x250", 300, 250),
        BANNER_ADAPTIVE("ADAPTIVE", -1, -1),
        BANNER_728x90("BANNER_728x90", 728, 90);

        public int height;
        public String name;
        public int width;

        AdSize(String str, int i10, int i11) {
            this.name = str;
            this.width = i10;
            this.height = i11;
        }

        public static AdSize getAdSize(String str) throws Throwable {
            if (str == null) {
                return BANNER_320x50;
            }
            String upperCase = str.toUpperCase();
            AdSize adSize = BANNER_300x50;
            if (upperCase.equals(adSize.name)) {
                return adSize;
            }
            AdSize adSize2 = BANNER_300x250;
            if (upperCase.equals(adSize2.name)) {
                return adSize2;
            }
            AdSize adSize3 = BANNER_728x90;
            return upperCase.equals(adSize3.name) ? adSize3 : BANNER_320x50;
        }
    }

    public interface Listener extends BaseAdListener {
        void onAdCollapsed() throws Throwable;

        void onAdExpanded() throws Throwable;
    }

    public MobileFuseBannerAd(@NonNull Context context, @NonNull String str, @NonNull AdSize adSize) {
        this(context, str, adSize, false);
    }

    private void applyCurrentBackgroundColor() throws Throwable {
        AdController adController;
        Drawable background = getBackground();
        if (background != null && (background instanceof ColorDrawable)) {
            int color = ((ColorDrawable) background).getColor();
            this.adBackgroundColor = color;
            if (color == -1 || (adController = this.adController) == null) {
                return;
            }
            adController.setAdBackgroundColor(color);
        }
    }

    public static /* synthetic */ void b(MobileFuseBannerAd mobileFuseBannerAd) throws Throwable {
        mobileFuseBannerAd.getClass();
        MobileFuse.logDebug("[Banner AdRefresher] onAdRefresh");
        if (mobileFuseBannerAd.adRefreshedController == null) {
            mobileFuseBannerAd.requestAdRefresh();
        }
        mobileFuseBannerAd.tryToRotateAd(false);
    }

    public static /* synthetic */ Unit c(MobileFuseBannerAd mobileFuseBannerAd) {
        mobileFuseBannerAd.loadAdInternal();
        return Unit.f93236a;
    }

    private AdController.AdListener createListener() {
        return new AdController.AdListener() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd.2
            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClicked(String str) {
                try {
                    MobileFuseBannerAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdClickedAction(str, MobileFuseBannerAd.this.adInstanceInfo));
                    Listener listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdClicked();
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClosed() {
                MobileFuseBannerAd.this.forceRefresh();
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdControllerUpdated(AdController adController) {
                try {
                    MobileFuse.logDebug("[Banner::AdmCacheMonitor] onAdControllerUpdated");
                    MobileFuseBannerAd mobileFuseBannerAd = MobileFuseBannerAd.this;
                    adController.adListener = mobileFuseBannerAd.adControllerListener;
                    AdController adController2 = mobileFuseBannerAd.adController;
                    adController2.adListener = null;
                    adController2.destroy();
                    MobileFuseBannerAd mobileFuseBannerAd2 = MobileFuseBannerAd.this;
                    mobileFuseBannerAd2.adController = adController;
                    adController.setAdBackgroundColor(mobileFuseBannerAd2.adBackgroundColor);
                    if (MobileFuseBannerAd.this.attachedToWindow) {
                        MobileFuseBannerAd.this.showAd();
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdError(AdError adError) {
                try {
                    MobileFuseBannerAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdErrorAction(MobileFuseBannerAd.this.adInstanceInfo, adError != null ? adError.getErrorMessage() : ""));
                    AdError adError2 = AdError.AD_RUNTIME_ERROR;
                    if (adError != adError2) {
                        Listener listener = MobileFuseBannerAd.this.adListener;
                        if (listener != null) {
                            listener.onAdError(adError);
                            return;
                        }
                        return;
                    }
                    MobileFuseBannerAd mobileFuseBannerAd = MobileFuseBannerAd.this;
                    AdController.AdState adState = mobileFuseBannerAd.adController.adState;
                    if (adState == AdController.AdState.NOT_FILLED) {
                        Listener listener2 = mobileFuseBannerAd.adListener;
                        if (listener2 != null) {
                            listener2.onAdNotFilled();
                            return;
                        }
                        return;
                    }
                    if (adState == AdController.AdState.RENDERED) {
                        Listener listener3 = mobileFuseBannerAd.adListener;
                        if (listener3 != null) {
                            listener3.onAdError(adError2);
                        }
                        MobileFuseBannerAd.this.inlineContainer.removeAllViews();
                        MobileFuseBannerAd.this.adController.updateState(AdController.AdState.IDLE);
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdExpired(float f10) {
                try {
                    MobileFuseBannerAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdExpiryAction(f10, MobileFuseBannerAd.this.adInstanceInfo));
                    MobileFuseBannerAd mobileFuseBannerAd = MobileFuseBannerAd.this;
                    AdController adControllerNewInstance = mobileFuseBannerAd.adController.newInstance(mobileFuseBannerAd.adControllerListener);
                    try {
                        MobileFuseBannerAd.this.adController.destroy();
                        MobileFuseBannerAd.this.adController = null;
                    } catch (Throwable th2) {
                        StabilityHelper.logException(this, th2);
                    }
                    MobileFuseBannerAd mobileFuseBannerAd2 = MobileFuseBannerAd.this;
                    mobileFuseBannerAd2.adController = adControllerNewInstance;
                    adControllerNewInstance.setAdBackgroundColor(mobileFuseBannerAd2.adBackgroundColor);
                    Listener listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdExpired();
                    }
                } catch (Throwable th3) {
                    StabilityHelper.logException(this, th3);
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdLoaded() {
                try {
                    MobileFuseBannerAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_LOADED, MobileFuseBannerAd.this.adInstanceInfo));
                    Listener listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdLoaded();
                    }
                    if (MobileFuseBannerAd.this.attachedToWindow) {
                        MobileFuseBannerAd.this.showAd();
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdNotFilled(int i10) {
                MobileFuseBannerAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_NOT_FILLED, MobileFuseBannerAd.this.adInstanceInfo));
                Listener listener = MobileFuseBannerAd.this.adListener;
                if (listener != null) {
                    listener.onAdNotFilled();
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdRendered() {
                try {
                    MobileFuseBannerAd.this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(TelemetryAdLifecycleEvent.AD_RENDERED, MobileFuseBannerAd.this.adInstanceInfo));
                    Listener listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        listener.onAdRendered();
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logAdRenderingException(this, th2, MobileFuseBannerAd.this.observableConfig);
                }
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onFullscreenChanged(boolean z10) {
                try {
                    MobileFuseBannerAd mobileFuseBannerAd = MobileFuseBannerAd.this;
                    mobileFuseBannerAd.adExpanded = z10;
                    mobileFuseBannerAd.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdLifecycleAction(z10 ? TelemetryAdLifecycleEvent.AD_EXPANDED : TelemetryAdLifecycleEvent.AD_COLLAPSED, MobileFuseBannerAd.this.adInstanceInfo));
                    Listener listener = MobileFuseBannerAd.this.adListener;
                    if (listener != null) {
                        if (z10) {
                            listener.onAdExpanded();
                        } else {
                            listener.onAdCollapsed();
                        }
                    }
                    if (z10) {
                        return;
                    }
                    MobileFuseBannerAd.this.tryToRotateAd(false);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }
        };
    }

    public static /* synthetic */ Unit d(MobileFuseBannerAd mobileFuseBannerAd, String str) {
        mobileFuseBannerAd.loadAdFromBiddingTokenInternal(str);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyAdRefreshedController() throws Throwable {
        AdController adController = this.adRefreshedController;
        if (adController == null) {
            return;
        }
        adController.destroy();
        this.adRefreshedController = null;
        this.adRefreshedControllerListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyInternal() {
        try {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_INSTANCE_DESTROYED, this.adInstanceInfo));
            try {
                AdController adController = this.adController;
                if (adController != null) {
                    adController.destroy();
                    this.adController = null;
                }
                if (isAdRefresherNotNull()) {
                    this.adRefresher.reset();
                }
                destroyAdRefreshedController();
                stopActivityLifecycleChecking();
                this.adListener = null;
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
            }
        } catch (Throwable th3) {
            StabilityHelper.logException(this, th3);
        }
    }

    private void detectTestModeFromPlacementId() throws Throwable {
        String str;
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig == null || (str = this.placementId) == null) {
            return;
        }
        PlacementUtil.detectTestMode(str, observableConfig, new Callback() { // from class: com.mobilefuse.sdk.t
            @Override // com.mobilefuse.sdk.internal.Callback
            public final void call(Object obj) {
                this.f53430a.placementId = (String) obj;
            }
        });
    }

    public static /* synthetic */ void f(MobileFuseBannerAd mobileFuseBannerAd, AdError adError, ObservableConfig observableConfig) {
        mobileFuseBannerAd.getClass();
        try {
            MobileFuse.logDebug("Ad Error: " + adError);
            Listener listener = mobileFuseBannerAd.adListener;
            if (listener != null) {
                listener.onAdError(adError);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(mobileFuseBannerAd, th2);
        }
    }

    private void initAdRefresher() throws Throwable {
        if (this.adRefresher != null) {
            return;
        }
        this.adRefresher = new AdRefresher(getContext(), 30L, new AdRefresher.Listener() { // from class: com.mobilefuse.sdk.q
            @Override // com.mobilefuse.sdk.internal.AdRefresher.Listener
            public final void onAdRefresh() throws Throwable {
                MobileFuseBannerAd.b(this.f53424a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAdRefresherEnabled() {
        return isAdRefresherNotNull() && this.adRefresher.isEnabled();
    }

    private boolean isAdRefresherNotNull() {
        return this.adRefresher != null;
    }

    private void loadAdFromBiddingTokenInternal(String str) {
        try {
            if (this.adController == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(TelemetrySdkTypesKt.createParamBidResponseToken(str));
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_BIDDING_LOAD_REQUESTED, this.adInstanceInfo, arrayList));
            this.adController.loadAdFromBiddingToken(str);
        } catch (Throwable th2) {
            StabilityHelper.logAdErrorException(this, th2, this.observableConfig, AdError.AD_LOAD_ERROR);
        }
    }

    private void loadAdInternal() {
        try {
            if (this.adController == null) {
                return;
            }
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceLoadAdAction(this.adInstanceInfo));
            this.adController.loadAd();
        } catch (Throwable th2) {
            StabilityHelper.logAdErrorException(this, th2, this.observableConfig, AdError.AD_LOAD_ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRefreshAdLoadFailed() throws Throwable {
        Listener listener;
        if (this.adRefreshedController == null) {
            return;
        }
        try {
            if (isAdRefresherNotNull()) {
                this.adRefresher.reset();
            }
            destroyAdRefreshedController();
            this.adRefresher.start();
            if (!this.requestedOneTimeAdRefresh || (listener = this.adListener) == null) {
                return;
            }
            listener.onAdNotFilled();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private void parseViewAttrs(AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.com_mobilefuse_sdk_BannerAd, 0, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.com_mobilefuse_sdk_BannerAd_mobilefusePlacementId);
            if (string != null) {
                this.placementId = string;
                this.adInstanceInfo.setPlacementId(string);
            }
            int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.com_mobilefuse_sdk_BannerAd_mobilefuseAdSize, 1);
            if (i10 == 1) {
                this.adSize = AdSize.BANNER_320x50;
            } else if (i10 == 2) {
                this.adSize = AdSize.BANNER_300x50;
            } else if (i10 == 3) {
                this.adSize = AdSize.BANNER_300x250;
            } else if (i10 == 4) {
                this.adSize = AdSize.BANNER_728x90;
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestAdRefresh() throws Throwable {
        if (this.adRefreshedController == null && !this.activityInBackground) {
            this.adRefreshedControllerListener = new AdController.AdListener() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd.4
                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdClicked(String str) throws Throwable {
                    MobileFuse.logDebug("[Banner Refresh] onAdClicked");
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdClosed() throws Throwable {
                    MobileFuse.logDebug("[Banner Refresh] onAdClosed");
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdControllerUpdated(AdController adController) throws Throwable {
                    MobileFuse.logDebug("[Banner::Refresh::AdmCacheMonitor] onUpdated");
                    MobileFuseBannerAd mobileFuseBannerAd = MobileFuseBannerAd.this;
                    adController.adListener = mobileFuseBannerAd.adRefreshedControllerListener;
                    AdController adController2 = mobileFuseBannerAd.adRefreshedController;
                    adController2.adListener = null;
                    adController2.destroy();
                    MobileFuseBannerAd mobileFuseBannerAd2 = MobileFuseBannerAd.this;
                    mobileFuseBannerAd2.adRefreshedController = adController;
                    mobileFuseBannerAd2.tryToRotateAd(false);
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdError(AdError adError) throws Throwable {
                    MobileFuse.logDebug("[Banner Refresh] onAdError");
                    MobileFuseBannerAd.this.onRefreshAdLoadFailed();
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdExpired(float f10) throws Throwable {
                    MobileFuse.logDebug("[Banner::Refresh::AdmCacheMonitor] onAdExpired");
                    MobileFuseBannerAd.this.destroyAdRefreshedController();
                    MobileFuseBannerAd.this.requestAdRefresh();
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdLoaded() throws Throwable {
                    MobileFuse.logDebug("[Banner Refresh] onAdLoaded");
                    MobileFuseBannerAd mobileFuseBannerAd = MobileFuseBannerAd.this;
                    mobileFuseBannerAd.tryToRotateAd(mobileFuseBannerAd.requestedOneTimeAdRefresh);
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdNotFilled(int i10) throws Throwable {
                    MobileFuse.logDebug("[Banner Refresh] onAdNotFilled");
                    MobileFuseBannerAd.this.onRefreshAdLoadFailed();
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onAdRendered() throws Throwable {
                    MobileFuse.logDebug("[Banner Refresh] onAdRendered");
                }

                @Override // com.mobilefuse.sdk.AdController.AdListener
                public void onFullscreenChanged(boolean z10) throws Throwable {
                    MobileFuse.logDebug("[Banner Refresh] onFullscreenChanged");
                }
            };
            Context context = getContext();
            String str = this.placementId;
            AdController.AdType adType = this.adType;
            AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
            AdSize adSize = this.adSize;
            AdController adController = new AdController(context, str, adType, adInstanceInfo, adSize.width, adSize.height, this.observableConfig, this.adRefreshedControllerListener);
            this.adRefreshedController = adController;
            adController.loadAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAd() throws Throwable {
        View viewShowInlineAd;
        try {
            boolean z10 = this.adController.adState == AdController.AdState.LOADED;
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createShowAdAction(z10, this.adInstanceInfo));
            if (z10 && (viewShowInlineAd = this.adController.showInlineAd()) != null) {
                if (viewShowInlineAd.getParent() == null) {
                    this.inlineContainer.addView(viewShowInlineAd, new FrameLayout.LayoutParams(-1, -1));
                }
                if (isAdRefresherEnabled()) {
                    requestAdRefresh();
                    this.adRefresher.reset();
                    this.adRefresher.start();
                }
            }
        } catch (Throwable th2) {
            StabilityHelper.logAdRenderingException(this, th2, this.observableConfig);
        }
    }

    private void startActivityLifecycleChecking() throws Throwable {
        if (this.activityLifecycleObserver == null) {
            this.activityLifecycleObserver = new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.MobileFuseBannerAd.3
                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onActivityPaused(@NonNull Activity activity) {
                    try {
                        if (MobileFuseBannerAd.this.renderingActivity != activity) {
                            return;
                        }
                        MobileFuseBannerAd.this.activityInBackground = true;
                        MobileFuse.logDebug("[Banner] onActivityPaused");
                        if (MobileFuseBannerAd.this.isAdRefresherEnabled()) {
                            MobileFuse.logDebug("[Banner] PAUSE ad refresher");
                            MobileFuseBannerAd.this.adRefresher.pause();
                        }
                    } catch (Throwable th2) {
                        StabilityHelper.logException(this, th2);
                    }
                }

                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onActivityResumed(@NonNull Activity activity) {
                    try {
                        if (MobileFuseBannerAd.this.renderingActivity != activity) {
                            return;
                        }
                        MobileFuseBannerAd.this.activityInBackground = false;
                        MobileFuse.logDebug("[Banner] onActivityResumed");
                        if (MobileFuseBannerAd.this.isAdRefresherEnabled()) {
                            MobileFuse.logDebug("[Banner] RESUME ad refresher");
                            MobileFuseBannerAd.this.adRefresher.start();
                        }
                    } catch (Throwable th2) {
                        StabilityHelper.logException(this, th2);
                    }
                }
            };
        }
        AppLifecycleHelper.addActivityLifecycleObserver(this.activityLifecycleObserver);
    }

    private void stopActivityLifecycleChecking() throws Throwable {
        AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = this.activityLifecycleObserver;
        if (activityLifecycleObserver == null) {
            return;
        }
        AppLifecycleHelper.removeActivityLifecycleObserver(activityLifecycleObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tryToRotateAd(boolean z10) throws Throwable {
        AdController adController;
        if (this.adExpanded) {
            return false;
        }
        if ((z10 || this.adRefresher.isCompleted()) && (adController = this.adRefreshedController) != null && adController.adState == AdController.AdState.LOADED) {
            try {
                this.requestedOneTimeAdRefresh = false;
                if (isAdRefresherNotNull()) {
                    this.adRefresher.reset();
                }
                this.adController.destroy();
                AdController adController2 = this.adRefreshedController;
                this.adController = adController2;
                adController2.setRenderingActivity(this.renderingActivity);
                AdController adController3 = this.adController;
                adController3.adListener = this.adControllerListener;
                adController3.setAdBackgroundColor(this.adBackgroundColor);
                this.adRefreshedController = null;
                this.adRefreshedControllerListener = null;
                showAd();
                return true;
            } catch (Throwable th2) {
                StabilityHelper.logAdRenderingException(this, th2, this.observableConfig);
            }
        }
        return false;
    }

    public void clearBidFloor() {
        try {
            PlacementUtil.clearBidFloor(this.observableConfig);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    AdController createAdController(Context context, String str, @NonNull AdInstanceInfo adInstanceInfo, int i10, int i11, ObservableConfig observableConfig, AdController.AdListener adListener) throws Throwable {
        return new AdController(context, str, this.adType, adInstanceInfo, i10, i11, observableConfig, adListener);
    }

    public void destroy() {
        try {
            this.handler.post(new Runnable() { // from class: com.mobilefuse.sdk.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53419b.destroyInternal();
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void forceRefresh() {
        try {
            AdController adController = this.adController;
            if (adController == null) {
                return;
            }
            AdController.AdState adState = adController.adState;
            if (adState == AdController.AdState.RENDERED || adState == AdController.AdState.CLOSED) {
                this.requestedOneTimeAdRefresh = true;
                if (isAdRefresherNotNull()) {
                    this.adRefresher.reset();
                }
                if (tryToRotateAd(true)) {
                    return;
                }
                requestAdRefresh();
            }
        } catch (Throwable th2) {
            StabilityHelper.logAdRenderingException(this, th2, this.observableConfig);
        }
    }

    public boolean getAutorefreshEnabled() {
        return this.adRefresher.isEnabled();
    }

    @Nullable
    public Float getBidFloor() {
        try {
            return PlacementUtil.getBidFloor(this.observableConfig);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return null;
        }
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    @Nullable
    public MuteChangedListener getMuteChangedListener() {
        return this.mutableAdController.getMuteChangedListener();
    }

    @Override // com.mobilefuse.sdk.WinningBidInfoSource
    @Nullable
    public WinningBidInfo getWinningBidInfo() {
        AdController adController = this.adController;
        if (adController == null) {
            return null;
        }
        return adController.getWinningBidInfo();
    }

    void init(AttributeSet attributeSet) throws Throwable {
        if (attributeSet != null) {
            parseViewAttrs(attributeSet);
        }
        AdSize adSize = this.adSize;
        if (adSize != null) {
            this.adInstanceInfo.setAdSize(adSize.name);
        }
        this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceCreatedAction(this.adInstanceInfo));
        startActivityLifecycleChecking();
        initAdRefresher();
        this.observableConfig.setValue(ObservableConfigKey.ENDCARD_CLOSABLE, Boolean.FALSE);
        this.observableConfig.setValue(ObservableConfigKey.AD_INSTANCE_INFO, this.adInstanceInfo);
        this.mutableAdController.init();
        this.observableConfig.setValue(ObservableConfigKey.AD_ERROR_CALLBACK, new AdErrorCallback() { // from class: com.mobilefuse.sdk.r
            @Override // com.mobilefuse.sdk.utils.AdErrorCallback
            public final void onError(AdError adError, ObservableConfig observableConfig) {
                MobileFuseBannerAd.f(this.f53427a, adError, observableConfig);
            }
        });
        detectTestModeFromPlacementId();
        this.adControllerListener = createListener();
        Context context = getContext();
        String str = this.placementId;
        AdInstanceInfo adInstanceInfo = this.adInstanceInfo;
        AdSize adSize2 = this.adSize;
        this.adController = createAdController(context, str, adInstanceInfo, adSize2.width, adSize2.height, this.observableConfig, this.adControllerListener);
        ViewGroup.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        AdSize adSize3 = this.adSize;
        if (adSize3.width <= 1 || adSize3.height <= 1) {
            this.inlineContainer = new FrameLayout(getContext());
        } else {
            final int iConvertDpToPx = Utils.convertDpToPx(getContext(), this.adSize.width);
            final int iConvertDpToPx2 = Utils.convertDpToPx(getContext(), this.adSize.height);
            this.inlineContainer = new FrameLayout(getContext()) { // from class: com.mobilefuse.sdk.MobileFuseBannerAd.1
                @Override // android.widget.FrameLayout, android.view.View
                protected void onMeasure(int i10, int i11) {
                    try {
                        int mode = View.MeasureSpec.getMode(i10);
                        int mode2 = View.MeasureSpec.getMode(i11);
                        int size = View.MeasureSpec.getSize(i10);
                        int size2 = View.MeasureSpec.getSize(i11);
                        int i12 = iConvertDpToPx;
                        if (size > i12 || mode == 0) {
                            i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                        }
                        int i13 = iConvertDpToPx2;
                        if (size2 > i13 || mode2 == 0) {
                            i11 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                        }
                    } catch (Throwable th2) {
                        StabilityHelper.logException(this, th2);
                    }
                    super.onMeasure(i10, i11);
                }
            };
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        setLayoutParams(layoutParams);
        addView(this.inlineContainer, layoutParams2);
        if (getBackground() == null) {
            setBackgroundResource(R.color.mobilefuse_default_banner_bg);
        } else {
            applyCurrentBackgroundColor();
        }
    }

    public boolean isDestroyed() {
        return this.destroyed;
    }

    public boolean isLoaded() {
        return this.adController.isAdLoaded();
    }

    public boolean isLoading() {
        return this.adController.isAdLoading();
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public boolean isMuted() {
        return this.mutableAdController.isMuted();
    }

    public boolean isTestMode() {
        try {
            return PlacementUtil.isTestMode(this.observableConfig);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return false;
        }
    }

    public void loadAd() {
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileFuseBannerAd.c(this.f53428b);
            }
        });
    }

    public void loadAdFromBiddingToken(final String str) {
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileFuseBannerAd.d(this.f53421b, str);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View viewFindViewById;
        try {
            if (this.adController == null) {
                return;
            }
            this.attachedToWindow = true;
            if (Utils.isAttachedToWindow(this)) {
                this.renderingActivity = null;
                try {
                    if (getContext() instanceof Activity) {
                        this.renderingActivity = (Activity) getContext();
                    }
                    if (this.renderingActivity == null && getRootView() != null && (viewFindViewById = getRootView().findViewById(android.R.id.content)) != null) {
                        this.renderingActivity = Utils.getActivityForView(viewFindViewById);
                    }
                    if (this.renderingActivity == null) {
                        this.renderingActivity = AppLifecycleHelper.getCurrentActivity();
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
                Activity activity = this.renderingActivity;
                if (activity != null) {
                    this.adController.setRenderingActivity(activity);
                }
            }
            AdController adController = this.adController;
            if (adController != null && adController.adState == AdController.AdState.LOADED) {
                showAd();
            }
        } catch (Throwable th3) {
            StabilityHelper.logAdRenderingException(this, th3, this.observableConfig);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            if (this.adController == null) {
                return;
            } else {
                this.attachedToWindow = false;
            }
        } catch (Throwable th2) {
            StabilityHelper.logAdRenderingException(this, th2, this.observableConfig);
        }
        super.onDetachedFromWindow();
    }

    public void setAutorefreshEnabled(boolean z10) {
        try {
            this.adRefresher.setEnabled(z10);
            if (!z10) {
                destroyAdRefreshedController();
            } else if (this.adController.adState == AdController.AdState.RENDERED) {
                this.adRefresher.start();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void setAutorefreshInterval(int i10) {
        try {
            this.adRefresher.setRefreshDelay(Math.max(i10, 30L));
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        try {
            applyCurrentBackgroundColor();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void setBidFloor(float f10) {
        try {
            PlacementUtil.setBidFloor(this.observableConfig, Float.valueOf(f10));
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void setListener(Listener listener) {
        this.adListener = listener;
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuteChangedListener(MuteChangedListener muteChangedListener) {
        this.mutableAdController.setMuteChangedListener(muteChangedListener);
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuted(boolean z10) throws Throwable {
        this.mutableAdController.setMuted(z10);
    }

    public void setTestMode(boolean z10) {
        try {
            PlacementUtil.setTestMode(this.observableConfig, z10);
            this.adInstanceInfo.getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceSetTestModeAction(z10, this.adInstanceInfo));
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    MobileFuseBannerAd(@NonNull Context context, @NonNull String str, @NonNull AdSize adSize, boolean z10) {
        super(context);
        this.handler = Utils.getHandler();
        AdController.AdType adType = AdController.AdType.BANNER;
        this.adType = adType;
        AdSize adSize2 = AdSize.BANNER_320x50;
        this.adBackgroundColor = -1;
        this.placementId = str;
        this.adSize = adSize;
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices.requireAllServices();
        AdInstanceInfo adInstanceInfo = new AdInstanceInfo(this, adType.getValue(), str);
        this.adInstanceInfo = adInstanceInfo;
        ObservableConfig observableConfig = new ObservableConfig();
        this.observableConfig = observableConfig;
        this.mutableAdController = new MutableAdController(observableConfig, adInstanceInfo);
        if (z10) {
            return;
        }
        try {
            init(null);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public MobileFuseBannerAd(@NonNull Context context) {
        this(context, null);
    }

    public MobileFuseBannerAd(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MobileFuseBannerAd(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.handler = Utils.getHandler();
        AdController.AdType adType = AdController.AdType.BANNER;
        this.adType = adType;
        this.adSize = AdSize.BANNER_320x50;
        this.adBackgroundColor = -1;
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices.requireAllServices();
        AdInstanceInfo adInstanceInfo = new AdInstanceInfo(this, adType.getValue());
        this.adInstanceInfo = adInstanceInfo;
        ObservableConfig observableConfig = new ObservableConfig();
        this.observableConfig = observableConfig;
        this.mutableAdController = new MutableAdController(observableConfig, adInstanceInfo);
        try {
            init(attributeSet);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @SuppressLint({"NewApi"})
    public MobileFuseBannerAd(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.handler = Utils.getHandler();
        AdController.AdType adType = AdController.AdType.BANNER;
        this.adType = adType;
        this.adSize = AdSize.BANNER_320x50;
        this.adBackgroundColor = -1;
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices.requireAllServices();
        AdInstanceInfo adInstanceInfo = new AdInstanceInfo(this, adType.getValue());
        this.adInstanceInfo = adInstanceInfo;
        ObservableConfig observableConfig = new ObservableConfig();
        this.observableConfig = observableConfig;
        this.mutableAdController = new MutableAdController(observableConfig, adInstanceInfo);
        try {
            init(attributeSet);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }
}
