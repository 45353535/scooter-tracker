package mh;

import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mh.e;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f94996f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f94997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f94998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lh.d f94999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f95000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue f95001e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends lh.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // lh.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(lh.e taskRunner, int i10, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f94997a = i10;
        this.f94998b = timeUnit.toNanos(j10);
        this.f94999c = taskRunner.i();
        this.f95000d = new b(ih.d.f74844i + " ConnectionPool");
        this.f95001e = new ConcurrentLinkedQueue();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int d(f fVar, long j10) {
        if (ih.d.f74843h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List listN = fVar.n();
        int i10 = 0;
        while (i10 < listN.size()) {
            Reference reference = (Reference) listN.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                rh.h.f99497a.g().m("A connection to " + fVar.z().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                listN.remove(i10);
                fVar.C(true);
                if (listN.isEmpty()) {
                    fVar.B(j10 - this.f94998b);
                    return 0;
                }
            }
        }
        return listN.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(hh.a r4, mh.e r5, java.util.List r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.f95001e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            mh.f r1 = (mh.f) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2d
            boolean r2 = r1.v()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            goto L2d
        L2b:
            r4 = move-exception
            goto L3d
        L2d:
            boolean r2 = r1.t(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            r5.c(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            r4 = 1
            return r4
        L39:
            kotlin.Unit r2 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            goto L10
        L3d:
            monitor-exit(r1)
            throw r4
        L3f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.g.a(hh.a, mh.e, java.util.List, boolean):boolean");
    }

    public final long b(long j10) {
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        for (f connection : this.f95001e) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (d(connection, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long jO = j10 - connection.o();
                    if (jO > j11) {
                        fVar = connection;
                        j11 = jO;
                    }
                    Unit unit = Unit.f93236a;
                }
            }
        }
        long j12 = this.f94998b;
        if (j11 < j12 && i10 <= this.f94997a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j11 != j10) {
                return 0L;
            }
            fVar.C(true);
            this.f95001e.remove(fVar);
            ih.d.n(fVar.D());
            if (this.f95001e.isEmpty()) {
                this.f94999c.a();
            }
            return 0L;
        }
    }

    public final boolean c(f connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (ih.d.f74843h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.p() && this.f94997a != 0) {
            lh.d.j(this.f94999c, this.f95000d, 0L, 2, null);
            return false;
        }
        connection.C(true);
        this.f95001e.remove(connection);
        if (this.f95001e.isEmpty()) {
            this.f94999c.a();
        }
        return true;
    }

    public final void e(f connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!ih.d.f74843h || Thread.holdsLock(connection)) {
            this.f95001e.add(connection);
            lh.d.j(this.f94999c, this.f95000d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
