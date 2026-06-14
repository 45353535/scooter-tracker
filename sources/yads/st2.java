package yads;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class st2 implements nw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw0 f115933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f115934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vy1 f115935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uq2 f115936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i32 f115937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c4 f115938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q02 f115939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ww0 f115940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t9 f115941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public jz1 f115942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f115943k;

    public st2(rw0 rw0Var, es2 es2Var, vy1 vy1Var) {
        this.f115933a = rw0Var;
        this.f115934b = es2Var;
        this.f115935c = vy1Var;
        Context contextG = rw0Var.g();
        c4 c4VarE = rw0Var.e();
        this.f115938f = c4VarE;
        this.f115939g = new q02(c4VarE);
        v5 v5VarF = rw0Var.f();
        this.f115936d = new uq2(c4VarE, es2Var);
        this.f115937e = new i32(contextG, es2Var, c4VarE, v5VarF);
        this.f115940h = new ww0(es2Var);
    }

    @Override // yads.nw0
    public final void a(Context context) {
        this.f115943k = true;
        this.f115941i = null;
        this.f115942j = null;
        this.f115937e.f111851b.a();
        boolean z10 = lb1.f113032a;
    }

    @Override // yads.dc
    public final List b() {
        vy1 vy1Var = this.f115935c;
        jz1 jz1Var = this.f115942j;
        vy1Var.getClass();
        return vy1.b(jz1Var);
    }

    @Override // yads.nw0
    public final String getAdInfo() {
        return this.f115935c.c(this.f115942j);
    }

    @Override // yads.nw0
    public final void a(Context context, t9 t9Var) {
        if (this.f115943k) {
            return;
        }
        this.f115941i = t9Var;
        this.f115933a.f115506b.a(u5.f116499c, null);
        this.f115937e.a(t9Var, new rt2(this), new qt2(this, context, t9Var));
    }

    @Override // yads.nw0
    public final Object a(cx0 cx0Var, Activity activity) {
        ro2 ro2Var = (ro2) cx0Var;
        Result.Companion companion = Result.f93230c;
        Object objB = Result.b(kotlin.d.a(m7.f113341b));
        t9 t9Var = this.f115941i;
        jz1 jz1Var = this.f115942j;
        if (t9Var == null || jz1Var == null) {
            return objB;
        }
        c4 c4Var = this.f115938f;
        Object objA = this.f115940h.a(activity, new x1(t9Var, c4Var, ro2Var.f115231c, this.f115934b, jz1Var, c4Var.f109208o, null, 64));
        this.f115941i = null;
        this.f115942j = null;
        return objA;
    }

    @Override // yads.dc
    public final List a() {
        return CollectionsKt.emptyList();
    }
}
