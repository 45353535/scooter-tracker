package yads;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class lj0 implements nj0 {
    @Override // yads.nj0
    public /* synthetic */ mj0 a(jj0 jj0Var, yv0 yv0Var) {
        return wr.a(this, jj0Var, yv0Var);
    }

    @Override // yads.nj0
    public final hj0 b(jj0 jj0Var, yv0 yv0Var) {
        if (yv0Var.f118401p == null) {
            return null;
        }
        return new ol0(new gj0(new y73(), 6001));
    }

    @Override // yads.nj0
    public /* synthetic */ void prepare() {
        wr.b(this);
    }

    @Override // yads.nj0
    public /* synthetic */ void release() {
        wr.c(this);
    }

    @Override // yads.nj0
    public final void a(Looper looper, wc2 wc2Var) {
    }

    @Override // yads.nj0
    public final int a(yv0 yv0Var) {
        return yv0Var.f118401p != null ? 1 : 0;
    }
}
