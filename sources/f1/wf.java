package f1;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f71464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd f71465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f71466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i8 f71467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t6 f71468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f71469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Cif f71470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f71471h;

    public wf(Executor backgroundExecutor, hd factory, i reachability, i8 timeSource, t6 uiPoster, Executor networkExecutor, Cif eventTracker) {
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(networkExecutor, "networkExecutor");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f71464a = backgroundExecutor;
        this.f71465b = factory;
        this.f71466c = reachability;
        this.f71467d = timeSource;
        this.f71468e = uiPoster;
        this.f71469f = networkExecutor;
        this.f71470g = eventTracker;
        this.f71471h = rd.f70996b.e();
    }

    public final String a() {
        return this.f71471h;
    }

    public final void b(bd request) {
        Intrinsics.checkNotNullParameter(request, "request");
        eg.n("Execute request: " + request.j(), null);
        this.f71469f.execute(new uc(this.f71464a, this.f71465b, this.f71466c, this.f71467d, this.f71468e, request, this.f71470g));
    }
}
