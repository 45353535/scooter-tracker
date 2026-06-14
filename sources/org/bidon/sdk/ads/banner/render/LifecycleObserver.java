package org.bidon.sdk.ads.banner.render;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/LifecycleObserver;", "", "<init>", "()V", "isLifecycleRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "observe", "", "applicationContext", "Landroid/content/Context;", "onActivityDestroyed", "Lkotlin/Function1;", "Landroid/app/Activity;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LifecycleObserver {

    @NotNull
    private final AtomicBoolean isLifecycleRegistered = new AtomicBoolean(false);

    public final void observe(@NotNull Context applicationContext, @NotNull final Function1<? super Activity, Unit> onActivityDestroyed) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(onActivityDestroyed, "onActivityDestroyed");
        if (this.isLifecycleRegistered.getAndSet(true)) {
            return;
        }
        applicationContext.registerComponentCallbacks(new ComponentCallbacks() { // from class: org.bidon.sdk.ads.banner.render.LifecycleObserver.observe.1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration newConfig) {
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }
        });
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: org.bidon.sdk.ads.banner.render.LifecycleObserver.observe.2
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                onActivityDestroyed.invoke(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
        });
    }
}
