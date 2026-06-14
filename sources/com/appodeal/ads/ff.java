package com.appodeal.ads;

import android.app.Activity;
import android.content.res.Configuration;
import com.appodeal.ads.modules.common.internal.context.ActivityProvider;
import com.appodeal.ads.utils.app.AppState;

/* JADX INFO: loaded from: classes6.dex */
public final class ff implements ActivityProvider.LifecycleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f13331a;

    public ff(l0 l0Var) {
        this.f13331a = l0Var;
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider.LifecycleCallback
    public final void onActivityDestroyed(Activity activity) {
        this.f13331a.e(activity, AppState.Destroyed);
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider.LifecycleCallback
    public final void onActivityPaused(Activity activity) {
        this.f13331a.e(activity, AppState.Paused);
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider.LifecycleCallback
    public final void onActivityResumed(Activity activity) {
        this.f13331a.e(activity, AppState.Resumed);
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider.LifecycleCallback
    public final void onAppConfigurationChanged(Configuration configuration) {
        this.f13331a.h(configuration);
    }
}
