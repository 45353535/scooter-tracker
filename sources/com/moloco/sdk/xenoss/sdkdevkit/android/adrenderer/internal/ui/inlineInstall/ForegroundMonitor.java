package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import hg.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/ForegroundMonitor;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "", "a", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lkotlinx/coroutines/flow/MutableStateFlow;", "_isForeground", "d", "Z", "isInitialized", "Lkotlinx/coroutines/flow/StateFlow;", "b", "()Lkotlinx/coroutines/flow/StateFlow;", "isForeground", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class ForegroundMonitor implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static boolean isInitialized;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ForegroundMonitor f57046b = new ForegroundMonitor();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final MutableStateFlow _isForeground = l0.a(Boolean.TRUE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f57049e = 8;

    private ForegroundMonitor() {
    }

    public final void a() {
        if (isInitialized) {
            return;
        }
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this);
        isInitialized = true;
    }

    public final StateFlow b() {
        return _isForeground;
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
        _isForeground.setValue(Boolean.TRUE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        _isForeground.setValue(Boolean.FALSE);
    }
}
