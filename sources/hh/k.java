package hh;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mh.g f73692a;

    public k(mh.g delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f73692a = delegate;
    }

    public final mh.g a() {
        return this.f73692a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new mh.g(lh.e.f94307i, i10, j10, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
