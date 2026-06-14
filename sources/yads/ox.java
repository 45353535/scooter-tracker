package yads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class ox extends qx {
    @Override // yads.qx
    public final int a() {
        return 0;
    }

    @Override // yads.qx
    public final qx b(boolean z10, boolean z11) {
        return a(cq.a(z11, z10));
    }

    public static qx a(int i10) {
        return i10 < 0 ? qx.f115189b : i10 > 0 ? qx.f115190c : qx.f115188a;
    }

    @Override // yads.qx
    public final qx a(int i10, int i11) {
        return a(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // yads.qx
    public final qx a(long j10, long j11) {
        return a(j10 < j11 ? -1 : j10 > j11 ? 1 : 0);
    }

    @Override // yads.qx
    public final qx a(Object obj, Object obj2, Comparator comparator) {
        return a(comparator.compare(obj, obj2));
    }

    @Override // yads.qx
    public final qx a(boolean z10, boolean z11) {
        return a(cq.a(z10, z11));
    }
}
