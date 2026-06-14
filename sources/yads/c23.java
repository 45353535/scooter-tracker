package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c23 implements d23 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a20[] f109183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f109184c;

    public c23(a20[] a20VarArr, long[] jArr) {
        this.f109183b = a20VarArr;
        this.f109184c = jArr;
    }

    @Override // yads.d23
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f109184c;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.d23
    public final List b(long j10) {
        a20 a20Var;
        int iB = w83.b(this.f109184c, j10, false);
        return (iB == -1 || (a20Var = this.f109183b[iB]) == a20.f108518s) ? Collections.EMPTY_LIST : Collections.singletonList(a20Var);
    }

    @Override // yads.d23
    public final int a() {
        return this.f109184c.length;
    }

    @Override // yads.d23
    public final int a(long j10) {
        int iA = w83.a(this.f109184c, j10, false);
        if (iA < this.f109184c.length) {
            return iA;
        }
        return -1;
    }
}
