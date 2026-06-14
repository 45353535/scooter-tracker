package kotlin.time;

import kotlin.time.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f93565a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f93566b = System.nanoTime();

    private g() {
    }

    private final long e() {
        return System.nanoTime() - f93566b;
    }

    @Override // cg.c
    public /* bridge */ /* synthetic */ a a() {
        return h.a.c(d());
    }

    public final long b(long j10, long j11) {
        return f.d(j10, j11, cg.b.f6836c);
    }

    public final long c(long j10) {
        return f.b(e(), j10, cg.b.f6836c);
    }

    public long d() {
        return h.a.e(e());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
