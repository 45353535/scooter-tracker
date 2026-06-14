package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcoil/request/BaseRequestDelegate;", "Lcoil/request/RequestDelegate;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()V", "b", "d", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle;", "Lkotlinx/coroutines/Job;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BaseRequestDelegate extends RequestDelegate {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Job job;

    public BaseRequestDelegate(Lifecycle lifecycle, Job job) {
        super(null);
        this.lifecycle = lifecycle;
        this.job = job;
    }

    @Override // coil.request.RequestDelegate
    public void b() {
        this.lifecycle.removeObserver(this);
    }

    @Override // coil.request.RequestDelegate
    public void c() {
        this.lifecycle.addObserver(this);
    }

    public void d() {
        Job.a.a(this.job, null, 1, null);
    }

    @Override // coil.request.RequestDelegate, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        d();
    }
}
