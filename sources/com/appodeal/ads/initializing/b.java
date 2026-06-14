package com.appodeal.ads.initializing;

import android.app.Activity;
import android.content.res.Configuration;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.modules.common.internal.context.ActivityProvider;
import com.appodeal.ads.unified.UnifiedAppStateChangeListener;
import com.appodeal.ads.utils.app.AppState;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ActivityProvider.LifecycleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdNetwork f13466a;

    public b(AdNetwork adNetwork) {
        this.f13466a = adNetwork;
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider.LifecycleCallback
    public final void onActivityDestroyed(Activity activity) {
        UnifiedAppStateChangeListener appStateChangeListener = this.f13466a.getAppStateChangeListener();
        if (appStateChangeListener != null) {
            appStateChangeListener.onAppStateChanged(activity, AppState.Destroyed, com.appodeal.ads.utils.c.c(activity));
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider.LifecycleCallback
    public final void onActivityPaused(Activity activity) {
        UnifiedAppStateChangeListener appStateChangeListener = this.f13466a.getAppStateChangeListener();
        if (appStateChangeListener != null) {
            appStateChangeListener.onAppStateChanged(activity, AppState.Paused, com.appodeal.ads.utils.c.c(activity));
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider.LifecycleCallback
    public final void onActivityResumed(Activity activity) {
        UnifiedAppStateChangeListener appStateChangeListener = this.f13466a.getAppStateChangeListener();
        if (appStateChangeListener != null) {
            appStateChangeListener.onAppStateChanged(activity, AppState.Resumed, com.appodeal.ads.utils.c.c(activity));
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider.LifecycleCallback
    public final void onAppConfigurationChanged(Configuration configuration) {
        ActivityProvider.LifecycleCallback.DefaultImpls.onAppConfigurationChanged(this, configuration);
    }
}
