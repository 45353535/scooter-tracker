package yads;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
public final class pt2 implements nw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw0 f114771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f114772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vy1 f114773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uq2 f114774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i32 f114775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c4 f114776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q02 f114777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ww0 f114778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t9 f114779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public jz1 f114780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f114781k;

    public /* synthetic */ pt2(rw0 rw0Var, es2 es2Var) {
        this(rw0Var, es2Var, new vy1());
    }

    @Override // yads.dc
    public final List a() {
        vy1 vy1Var = this.f114773c;
        jz1 jz1Var = this.f114780j;
        vy1Var.getClass();
        return vy1.a(jz1Var);
    }

    @Override // yads.dc
    public final List b() {
        vy1 vy1Var = this.f114773c;
        jz1 jz1Var = this.f114780j;
        vy1Var.getClass();
        return vy1.b(jz1Var);
    }

    @Override // yads.nw0
    public final String getAdInfo() {
        return this.f114773c.c(this.f114780j);
    }

    @Override // yads.nw0
    public final void a(Context context) {
        this.f114781k = true;
        this.f114779i = null;
        this.f114780j = null;
        this.f114775e.f111851b.a();
        boolean z10 = lb1.f113032a;
    }

    public pt2(rw0 rw0Var, es2 es2Var, vy1 vy1Var) {
        this.f114771a = rw0Var;
        this.f114772b = es2Var;
        this.f114773c = vy1Var;
        Context contextG = rw0Var.g();
        c4 c4VarE = rw0Var.e();
        this.f114776f = c4VarE;
        this.f114777g = new q02(c4VarE);
        v5 v5VarF = rw0Var.f();
        this.f114774d = new uq2(c4VarE, es2Var);
        this.f114775e = new i32(contextG, es2Var, c4VarE, v5VarF);
        this.f114778h = new ww0(es2Var);
    }

    @Override // yads.nw0
    public final void a(Context context, t9 t9Var) {
        if (this.f114781k) {
            return;
        }
        this.f114779i = t9Var;
        this.f114771a.f115506b.a(u5.f116499c, null);
        this.f114775e.a(t9Var, new ot2(this), new nt2(this, context, t9Var));
    }

    @Override // yads.nw0
    public final Object a(cx0 cx0Var, Activity activity) {
        Result.Companion companion = Result.f93230c;
        Object objB = Result.b(kotlin.d.a(m7.f113341b));
        t9 t9Var = this.f114779i;
        jz1 jz1Var = this.f114780j;
        if (t9Var == null || jz1Var == null) {
            return objB;
        }
        c4 c4Var = this.f114776f;
        Object objA = this.f114778h.a(activity, new x1(t9Var, c4Var, cx0Var.f115231c, this.f114772b, jz1Var, c4Var.f109208o, null, 64));
        this.f114779i = null;
        this.f114780j = null;
        return objA;
    }
}
