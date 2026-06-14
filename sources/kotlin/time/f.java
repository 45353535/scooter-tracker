package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    private static final long a(long j10) {
        return j10 < 0 ? b.f93560c.b() : b.f93560c.a();
    }

    public static final long b(long j10, long j11, cg.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? b.M(a(j11)) : c(j10, j11, unit);
    }

    private static final long c(long j10, long j11, cg.b bVar) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return c.t(j12, bVar);
        }
        cg.b bVar2 = cg.b.f6838e;
        if (bVar.compareTo(bVar2) >= 0) {
            return b.M(a(j12));
        }
        long jB = d.b(1L, bVar2, bVar);
        long j13 = (j10 / jB) - (j11 / jB);
        long j14 = (j10 % jB) - (j11 % jB);
        b.a aVar = b.f93560c;
        return b.G(c.t(j13, bVar2), c.t(j14, bVar));
    }

    public static final long d(long j10, long j11, cg.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return ((j11 - 1) | 1) == Long.MAX_VALUE ? j10 == j11 ? b.f93560c.c() : b.M(a(j11)) : (1 | (j10 - 1)) == Long.MAX_VALUE ? a(j10) : c(j10, j11, unit);
    }
}
