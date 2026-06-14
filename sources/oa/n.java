package oa;

import java.io.EOFException;
import oa.s0;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f96611a = new byte[4096];

    @Override // oa.s0
    public void a(q9.d0 d0Var, int i10, int i11) {
        d0Var.X(i10);
    }

    @Override // oa.s0
    public /* synthetic */ int b(n9.h hVar, int i10, boolean z10) {
        return r0.b(this, hVar, i10, z10);
    }

    @Override // oa.s0
    public /* synthetic */ void c(q9.d0 d0Var, int i10) {
        r0.c(this, d0Var, i10);
    }

    @Override // oa.s0
    public /* synthetic */ void d(long j10) {
        r0.a(this, j10);
    }

    @Override // oa.s0
    public int g(n9.h hVar, int i10, boolean z10, int i11) throws EOFException {
        int i12 = hVar.read(this.f96611a, 0, Math.min(this.f96611a.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // oa.s0
    public void f(io.bidmachine.media3.common.a aVar) {
    }

    @Override // oa.s0
    public void e(long j10, int i10, int i11, int i12, s0.a aVar) {
    }
}
