package coil.request;

import a0.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import c0.i;
import coil.util.Lifecycles;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;
import o.e;
import y.h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcoil/request/ViewTargetRequestDelegate;", "Lcoil/request/RequestDelegate;", "Lo/e;", "imageLoader", "Ly/h;", "initialRequest", "La0/b;", TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lo/e;Ly/h;La0/b;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()V", "a", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "b", "Lo/e;", "Ly/h;", "La0/b;", "Landroidx/lifecycle/Lifecycle;", InneractiveMediationDefs.GENDER_FEMALE, "Lkotlinx/coroutines/Job;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ViewTargetRequestDelegate extends RequestDelegate {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e imageLoader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h initialRequest;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b target;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Job job;

    public ViewTargetRequestDelegate(e eVar, h hVar, b bVar, Lifecycle lifecycle, Job job) {
        super(null);
        this.imageLoader = eVar;
        this.initialRequest = hVar;
        this.target = bVar;
        this.lifecycle = lifecycle;
        this.job = job;
    }

    @Override // coil.request.RequestDelegate
    public void a() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        i.l(this.target.getView()).c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // coil.request.RequestDelegate
    public void c() {
        this.lifecycle.addObserver(this);
        b bVar = this.target;
        if (bVar instanceof LifecycleObserver) {
            Lifecycles.b(this.lifecycle, (LifecycleObserver) bVar);
        }
        i.l(this.target.getView()).c(this);
    }

    public void d() {
        Job.a.a(this.job, null, 1, null);
        b bVar = this.target;
        if (bVar instanceof LifecycleObserver) {
            this.lifecycle.removeObserver((LifecycleObserver) bVar);
        }
        this.lifecycle.removeObserver(this);
    }

    public final void e() {
        this.imageLoader.b(this.initialRequest);
    }

    @Override // coil.request.RequestDelegate, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        i.l(this.target.getView()).a();
    }
}
