package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m33 extends jo implements Handler.Callback {
    public int A;
    public long B;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f113303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l33 f113304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h23 f113305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zv0 f113306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f113307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f113308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f113309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f113310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public yv0 f113311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e23 f113312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i23 f113313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j23 f113314y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j23 f113315z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m33(sm0 sm0Var, Looper looper) {
        super(3);
        g23 g23Var = h23.f111449a;
        this.f113304o = (l33) fi.a(sm0Var);
        this.f113303n = looper == null ? null : w83.a(looper, (Handler.Callback) this);
        this.f113305p = g23Var;
        this.f113306q = new zv0();
        this.B = -9223372036854775807L;
    }

    @Override // yads.jo
    public final void a(long j10, boolean z10) {
        List list = Collections.EMPTY_LIST;
        Handler handler = this.f113303n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            ((sm0) this.f113304o).a(list);
            ((sm0) this.f113304o).a(new c20(list));
        }
        this.f113307r = false;
        this.f113308s = false;
        this.B = -9223372036854775807L;
        if (this.f113310u != 0) {
            p();
            n();
        } else {
            o();
            e23 e23Var = this.f113312w;
            e23Var.getClass();
            e23Var.flush();
        }
    }

    @Override // yads.jo
    public final String d() {
        return "TextRenderer";
    }

    @Override // yads.jo
    public final boolean f() {
        return this.f113308s;
    }

    @Override // yads.jo
    public final boolean g() {
        return true;
    }

    @Override // yads.jo
    public final void h() {
        this.f113311v = null;
        this.B = -9223372036854775807L;
        List list = Collections.EMPTY_LIST;
        Handler handler = this.f113303n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            ((sm0) this.f113304o).a(list);
            ((sm0) this.f113304o).a(new c20(list));
        }
        p();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List list = (List) message.obj;
        ((sm0) this.f113304o).a(list);
        ((sm0) this.f113304o).a(new c20(list));
        return true;
    }

    public final long m() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        this.f113314y.getClass();
        if (this.A >= this.f113314y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f113314y.a(this.A);
    }

    public final void n() {
        this.f113309t = true;
        h23 h23Var = this.f113305p;
        yv0 yv0Var = this.f113311v;
        yv0Var.getClass();
        this.f113312w = ((g23) h23Var).a(yv0Var);
    }

    public final void o() {
        this.f113313x = null;
        this.A = -1;
        j23 j23Var = this.f113314y;
        if (j23Var != null) {
            j23Var.b();
            this.f113314y = null;
        }
        j23 j23Var2 = this.f113315z;
        if (j23Var2 != null) {
            j23Var2.b();
            this.f113315z = null;
        }
    }

    public final void p() {
        o();
        e23 e23Var = this.f113312w;
        e23Var.getClass();
        e23Var.release();
        this.f113312w = null;
        this.f113310u = 0;
    }

    @Override // yads.jo
    public final void a(yv0[] yv0VarArr, long j10, long j11) {
        this.f113311v = yv0VarArr[0];
        if (this.f113312w != null) {
            this.f113310u = 1;
        } else {
            n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    @Override // yads.jo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r12, long r14) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.m33.a(long, long):void");
    }

    @Override // yads.jo
    public final int a(yv0 yv0Var) {
        if (((g23) this.f113305p).b(yv0Var)) {
            return jo.a(yv0Var.F == 0 ? 4 : 2, 0, 0);
        }
        if (tr1.e(yv0Var.f118398m)) {
            return jo.a(1, 0, 0);
        }
        return jo.a(0, 0, 0);
    }
}
