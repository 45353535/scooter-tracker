package yads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
public final class wj0 implements z43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f117482a = new byte[4096];

    @Override // yads.z43
    public final void a(long j10, int i10, int i11, int i12, y43 y43Var) {
    }

    @Override // yads.z43
    public /* synthetic */ int b(y20 y20Var, int i10, boolean z10) {
        return m71.a(this, y20Var, i10, z10);
    }

    @Override // yads.z43
    public final void a(yv0 yv0Var) {
    }

    @Override // yads.z43
    public /* synthetic */ void b(int i10, w92 w92Var) {
        m71.b(this, i10, w92Var);
    }

    @Override // yads.z43
    public final int a(y20 y20Var, int i10, boolean z10) throws EOFException {
        int iC = y20Var.c(this.f117482a, 0, Math.min(this.f117482a.length, i10));
        if (iC != -1) {
            return iC;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // yads.z43
    public final void a(int i10, w92 w92Var) {
        w92Var.e(w92Var.f117357b + i10);
    }
}
