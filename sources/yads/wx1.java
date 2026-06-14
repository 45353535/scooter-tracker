package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class wx1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f117626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qz1 f117627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jy1 f117628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tx1 f117629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m30 f117630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx1 f117631g;

    public wx1(yx1 yx1Var, t9 t9Var, qz1 qz1Var, jy1 jy1Var, tx1 tx1Var, vn2 vn2Var) {
        this.f117631g = yx1Var;
        this.f117626b = t9Var;
        this.f117627c = qz1Var;
        this.f117628d = jy1Var;
        this.f117629e = tx1Var;
        this.f117630f = new n30(yx1Var.f118431e, yx1Var.f118427a, vn2Var.b(t9Var, yx1Var.f118428b)).a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            qz1 qz1Var = this.f117627c;
            if (qz1Var == null) {
                this.f117629e.a(f9.f110642c);
                return;
            }
            if (qz1Var.f115232a.isEmpty()) {
                this.f117629e.a(f9.f110647h);
                return;
            }
            qz1 qz1Var2 = this.f117627c;
            t9 t9Var = this.f117626b;
            yx1 yx1Var = this.f117631g;
            dx1 dx1Var = new dx1(t9Var, yx1Var.f118428b, qz1Var2);
            tx1 tx1Var = this.f117629e;
            v5 v5Var = yx1Var.f118429c;
            vx1 vx1Var = new vx1(this, tx1Var, v5Var);
            v5Var.a(u5.f116510n, null);
            yx1 yx1Var2 = this.f117631g;
            f32 f32Var = yx1Var2.f118433g;
            Context context = yx1Var2.f118431e;
            c4 c4Var = yx1Var2.f118428b;
            m30 m30Var = this.f117630f;
            tx1 tx1Var2 = this.f117629e;
            f32Var.getClass();
            eg.i.d(f32Var.f110590a, new g32(tx1Var2), null, new e32(context, tx1Var2, vx1Var, f32Var, c4Var, dx1Var, m30Var, null), 2, null);
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
            this.f117629e.a(f9.f110642c);
        }
    }
}
