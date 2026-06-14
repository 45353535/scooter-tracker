package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.ad.rendering.ExtendedController;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.config.Observer;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.omid.OmidFriendlyObstructionPurpose;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseAdRenderer<T extends OmidBridge> {
    private AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver;
    protected AdLifecycleEventListener adLifecycleEventListener;
    protected String adm;

    @Nullable
    public AdmClickInfoProvider admClickInfoProvider;
    protected AdRendererConfig config;
    protected Observer configObserver;
    protected AdRendererContainer contentContainer;
    protected Context context;
    protected ExtendedAdType extendedAdType;
    protected ExtendedController extendedController;

    @Nullable
    private View.OnLayoutChangeListener layoutChangeListener;

    @Nullable
    private View layoutChangeListenerOwner;
    protected AdRendererListener listener;
    protected ObservableConfig observableConfig;
    protected T omidBridge;

    @Nullable
    protected Activity renderingActivity;
    protected State state = State.IDLE;
    protected boolean impressionCallbackCalled = false;
    protected int adBackgroundColor = ViewCompat.MEASURED_STATE_MASK;
    protected List<View> externalFriendlyObstructions = new ArrayList();

    public enum State {
        IDLE,
        PRELOADED,
        RENDERING
    }

    public BaseAdRenderer(Context context, AdRendererConfig adRendererConfig, AdRendererListener adRendererListener) throws Throwable {
        this.extendedAdType = BaseExtendedAdType.NORMAL;
        this.context = context;
        this.config = adRendererConfig;
        this.listener = adRendererListener;
        if (adRendererConfig.getExtendedAdType() != null) {
            this.extendedAdType = adRendererConfig.getExtendedAdType();
        }
        ObservableConfig observableConfig = adRendererConfig.getObservableConfig();
        this.observableConfig = observableConfig;
        if (observableConfig != null) {
            observableConfig.setValue(ObservableConfigKey.SKIP_AD_AVAILABLE, Boolean.FALSE);
            Observer observer = new Observer() { // from class: com.mobilefuse.sdk.m
                @Override // com.mobilefuse.sdk.config.Observer
                public final void onChanged(ObservableConfigKey observableConfigKey, Object obj) throws Throwable {
                    this.f53392a.onConfigPropertyChanged(observableConfigKey, obj);
                }
            };
            this.configObserver = observer;
            this.observableConfig.registerObserver(observer);
        }
    }

    private void stopActivityLifecycleChecking() throws Throwable {
        AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = this.activityLifecycleObserver;
        if (activityLifecycleObserver == null) {
            return;
        }
        AppLifecycleHelper.removeActivityLifecycleObserver(activityLifecycleObserver);
        this.activityLifecycleObserver = null;
    }

    protected void addRegisteredExternalFriendlyObstructions() {
        if (this.omidBridge == null) {
            return;
        }
        try {
            Iterator<View> it = this.externalFriendlyObstructions.iterator();
            while (it.hasNext()) {
                this.omidBridge.addFriendlyObstruction(it.next(), OmidFriendlyObstructionPurpose.OTHER, null);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    protected void applyCurrentBackgroundColor() throws Throwable {
    }

    public void destroy() throws Throwable {
        ObservableConfig observableConfig;
        stopActivityLifecycleChecking();
        stopListeningLayoutChange();
        Observer observer = this.configObserver;
        if (observer != null && (observableConfig = this.observableConfig) != null) {
            observableConfig.unregisterObserver(observer);
            this.observableConfig = null;
        }
        destroyOmidBridge();
        this.renderingActivity = null;
        this.admClickInfoProvider = null;
    }

    protected void destroyOmidBridge() throws Throwable {
        if (hasOmidBridge()) {
            this.omidBridge.finishAdSession();
            this.omidBridge = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void dispatchSkipAdAvailability() {
        try {
            ObservableConfig observableConfig = this.observableConfig;
            if (observableConfig == null) {
                return;
            }
            ObservableConfigKey observableConfigKey = ObservableConfigKey.SKIP_AD_AVAILABLE;
            if (observableConfig.getBooleanValue(observableConfigKey)) {
                return;
            }
            observableConfig.setValue(observableConfigKey, Boolean.TRUE);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public int getAdBackgroundColor() {
        return this.adBackgroundColor;
    }

    public AdLifecycleEventListener getAdLifecycleEventListener() {
        return this.adLifecycleEventListener;
    }

    public abstract View getAdView() throws Throwable;

    public final ExtendedAdType getExtendedAdType() {
        return this.extendedAdType;
    }

    protected abstract View.OnLayoutChangeListener getOnLayoutChangeListener(Context context) throws Throwable;

    public boolean hasOmidBridge() {
        return this.omidBridge != null;
    }

    public boolean isAdPreloaded() {
        return this.state == State.PRELOADED;
    }

    protected boolean isOmidBridgeAvailable() {
        return this.omidBridge != null;
    }

    public boolean isTransparentBackground() throws Throwable {
        return this.config.isTransparentBackground();
    }

    public boolean isVisibleOnScreen() {
        try {
            View adView = getAdView();
            if (adView == null) {
                return false;
            }
            return Utils.isAttachedToWindow(adView);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return false;
        }
    }

    public void onActivityDestroy() throws Throwable {
    }

    public void onActivityPause() throws Throwable {
    }

    protected void onActivityPauseImpl() throws Throwable {
    }

    public void onActivityResume() throws Throwable {
    }

    protected void onActivityResumeImpl() throws Throwable {
    }

    public void onActivityStart() throws Throwable {
    }

    public void onActivityStop() throws Throwable {
    }

    protected boolean onAdCloseRequested() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAdClosed() throws Throwable {
        onAdLifecycleEvent(BaseAdLifecycleEvent.AD_CLOSED);
        this.listener.onAdClosed();
        this.state = State.IDLE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAdLifecycleEvent(AdLifecycleEvent adLifecycleEvent) throws Throwable {
        onAdLifecycleEvent(adLifecycleEvent, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAdPreloaded() throws Throwable {
        this.state = State.PRELOADED;
        onAdLifecycleEvent(BaseAdLifecycleEvent.AD_PRELOAD_COMPLETE);
        this.listener.onPreloadStatusChange(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAdRuntimeError(RtbLossReason rtbLossReason) throws Throwable {
        this.listener.onAdRuntimeError(rtbLossReason);
    }

    protected void onConfigPropertyChanged(ObservableConfigKey observableConfigKey, Object obj) throws Throwable {
    }

    public final void preloadAd(String str) throws Throwable {
        this.adm = str;
        onAdLifecycleEvent(BaseAdLifecycleEvent.AD_PRELOAD_STARTED);
        preloadAdmImpl(str);
    }

    protected abstract void preloadAdmImpl(String str) throws Throwable;

    public void registerExternalFriendlyObstruction(View view) {
        this.externalFriendlyObstructions.add(view);
        try {
            T t10 = this.omidBridge;
            if (t10 == null) {
                return;
            }
            t10.addFriendlyObstruction(view, OmidFriendlyObstructionPurpose.OTHER, null);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void renderAd() throws Throwable {
        this.state = State.RENDERING;
        onAdLifecycleEvent(BaseAdLifecycleEvent.AD_RENDERED);
        renderAdmImpl();
        stopListeningLayoutChange();
        startListeningLayoutChange();
    }

    protected abstract void renderAdmImpl() throws Throwable;

    /* JADX INFO: Access modifiers changed from: protected */
    public void reportAdImpression() {
        if (this.impressionCallbackCalled) {
            return;
        }
        this.impressionCallbackCalled = true;
        try {
            AdRendererListener adRendererListener = this.listener;
            if (adRendererListener != null) {
                adRendererListener.onAdImpression();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    void requestAdClose() throws Throwable {
        if (onAdCloseRequested()) {
            onAdClosed();
        }
    }

    public void setAdBackgroundColor(int i10) throws Throwable {
        if (i10 == -1 || this.adBackgroundColor == i10) {
            return;
        }
        this.adBackgroundColor = i10;
        applyCurrentBackgroundColor();
    }

    public void setAdLifecycleEventListener(AdLifecycleEventListener adLifecycleEventListener) throws Throwable {
        this.adLifecycleEventListener = adLifecycleEventListener;
        ExtendedController extendedController = this.extendedController;
        if (extendedController != null) {
            extendedController.setAdLifecycleEventListener(adLifecycleEventListener);
        }
    }

    public void setOmidBridge(T t10) throws Throwable {
        this.omidBridge = t10;
    }

    public final void setRenderingActivity(@NonNull Activity activity) throws Throwable {
        this.renderingActivity = activity;
    }

    protected void startActivityLifecycleChecking() throws Throwable {
        if (this.activityLifecycleObserver == null) {
            this.activityLifecycleObserver = new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.BaseAdRenderer.1
                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onActivityPaused(@NonNull Activity activity) {
                    try {
                        BaseAdRenderer baseAdRenderer = BaseAdRenderer.this;
                        Activity activity2 = baseAdRenderer.renderingActivity;
                        if (activity2 != null && activity2 == activity) {
                            baseAdRenderer.onActivityPauseImpl();
                        }
                    } catch (Throwable th2) {
                        StabilityHelper.logException(this, th2);
                    }
                }

                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onActivityResumed(@NonNull Activity activity) {
                    try {
                        BaseAdRenderer baseAdRenderer = BaseAdRenderer.this;
                        Activity activity2 = baseAdRenderer.renderingActivity;
                        if (activity2 != null && activity2 == activity) {
                            baseAdRenderer.onActivityResumeImpl();
                        }
                    } catch (Throwable th2) {
                        StabilityHelper.logException(this, th2);
                    }
                }
            };
        }
        AppLifecycleHelper.addActivityLifecycleObserver(this.activityLifecycleObserver);
    }

    protected void startListeningLayoutChange() throws Throwable {
        try {
            AdRendererContainer adRendererContainer = this.contentContainer;
            if (adRendererContainer == null) {
                return;
            }
            View rootView = adRendererContainer.getRootView();
            Activity activity = this.renderingActivity;
            if (activity != null) {
                rootView = activity.getWindow().getDecorView().getRootView();
            }
            if (rootView != null && this.layoutChangeListenerOwner != rootView) {
                View.OnLayoutChangeListener onLayoutChangeListener = getOnLayoutChangeListener(this.context);
                this.layoutChangeListener = onLayoutChangeListener;
                this.layoutChangeListenerOwner = rootView;
                rootView.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    protected void stopListeningLayoutChange() throws Throwable {
        try {
            View view = this.layoutChangeListenerOwner;
            if (view != null) {
                view.removeOnLayoutChangeListener(this.layoutChangeListener);
                this.layoutChangeListenerOwner = null;
                this.layoutChangeListener = null;
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void unregisterExternalFriendlyObstruction(View view) {
        this.externalFriendlyObstructions.remove(view);
        try {
            T t10 = this.omidBridge;
            if (t10 == null) {
                return;
            }
            t10.removeFriendlyObstruction(view);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    protected void onAdLifecycleEvent(AdLifecycleEvent adLifecycleEvent, Map<String, String> map) throws Throwable {
        ExtendedAdType extendedAdType = getExtendedAdType();
        AdLifecycleEventListener adLifecycleEventListener = this.adLifecycleEventListener;
        if (adLifecycleEventListener != null) {
            adLifecycleEventListener.onAdLifecycleEvent(adLifecycleEvent, extendedAdType, map);
        }
    }
}
