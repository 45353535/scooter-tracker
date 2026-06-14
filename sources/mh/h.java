package mh;

import hh.d0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f95003a = new LinkedHashSet();

    public final synchronized void a(d0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f95003a.remove(route);
    }

    public final synchronized void b(d0 failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f95003a.add(failedRoute);
    }

    public final synchronized boolean c(d0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f95003a.contains(route);
    }
}
