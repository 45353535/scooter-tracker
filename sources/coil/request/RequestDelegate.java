package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcoil/request/RequestDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "", "a", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "b", "Lcoil/request/BaseRequestDelegate;", "Lcoil/request/ViewTargetRequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class RequestDelegate implements DefaultLifecycleObserver {
    public /* synthetic */ RequestDelegate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        c.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        c.f(this, lifecycleOwner);
    }

    private RequestDelegate() {
    }
}
