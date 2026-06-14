package lh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f94296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f94297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f94298d;

    public a(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f94295a = name;
        this.f94296b = z10;
        this.f94298d = -1L;
    }

    public final boolean a() {
        return this.f94296b;
    }

    public final String b() {
        return this.f94295a;
    }

    public final long c() {
        return this.f94298d;
    }

    public final d d() {
        return this.f94297c;
    }

    public final void e(d queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        d dVar = this.f94297c;
        if (dVar == queue) {
            return;
        }
        if (dVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f94297c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f94298d = j10;
    }

    public String toString() {
        return this.f94295a;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
