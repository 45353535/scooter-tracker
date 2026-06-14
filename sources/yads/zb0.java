package yads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class zb0 extends co {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yb0 f118603e;

    public zb0(yb0 yb0Var, long j10, long j11) {
        super(j10, j11);
        this.f118603e = yb0Var;
    }

    @Override // yads.ki1
    public final long a() {
        long j10 = this.f109493d;
        if (j10 < this.f109491b || j10 > this.f109492c) {
            throw new NoSuchElementException();
        }
        return this.f118603e.a(j10);
    }

    @Override // yads.ki1
    public final long b() {
        long j10 = this.f109493d;
        if (j10 < this.f109491b || j10 > this.f109492c) {
            throw new NoSuchElementException();
        }
        yb0 yb0Var = this.f118603e;
        return yb0Var.f118135d.a(j10 - yb0Var.f118137f);
    }
}
