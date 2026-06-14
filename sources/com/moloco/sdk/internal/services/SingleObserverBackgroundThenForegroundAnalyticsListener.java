package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/moloco/sdk/internal/services/SingleObserverBackgroundThenForegroundAnalyticsListener;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/moloco/sdk/internal/services/analytics/a;", "analyticsService", "Lcom/moloco/sdk/internal/services/i;", "timeProviderService", "<init>", "(Lcom/moloco/sdk/internal/services/analytics/a;Lcom/moloco/sdk/internal/services/i;)V", "", "a", "()V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "b", "Lcom/moloco/sdk/internal/services/analytics/a;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/moloco/sdk/internal/services/i;", "", "d", "Ljava/lang/Long;", "lastBgTimestamp", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Z", "trackNext", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class SingleObserverBackgroundThenForegroundAnalyticsListener implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final com.moloco.sdk.internal.services.analytics.a analyticsService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final i timeProviderService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Long lastBgTimestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean trackNext;

    public SingleObserverBackgroundThenForegroundAnalyticsListener(com.moloco.sdk.internal.services.analytics.a analyticsService, i timeProviderService) {
        Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.analyticsService = analyticsService;
        this.timeProviderService = timeProviderService;
    }

    public final void a() {
        this.trackNext = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        androidx.lifecycle.c.e(this, owner);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStart", false, 4, null);
        Long l10 = this.lastBgTimestamp;
        if (l10 != null) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Background event has been recorded, recording foreground", false, 4, null);
            this.analyticsService.a(this.timeProviderService.invoke(), l10.longValue());
            this.lastBgTimestamp = null;
            this.trackNext = false;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        androidx.lifecycle.c.f(this, owner);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStop", false, 4, null);
        if (this.trackNext) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Tracking of event is true. Recording background", false, 4, null);
            long jInvoke = this.timeProviderService.invoke();
            this.lastBgTimestamp = Long.valueOf(jInvoke);
            this.analyticsService.a(jInvoke);
        }
    }
}
