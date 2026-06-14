package p1;

import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f98040b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f98041a;

    public static void a(d dVar, Exception exc) {
        b(dVar, x1.a.a(exc, null));
    }

    public static void b(d dVar, Object... objArr) {
        t1.b.a("%s : dispatching event", "IgniteEventDispatcher");
        if (f98040b.f98041a != null) {
            t tVarA = t.a(dVar);
            if (tVarA == null) {
                IAlog.f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", dVar);
            } else {
                new w(tVarA).a(objArr).a((String) null);
            }
        }
    }
}
