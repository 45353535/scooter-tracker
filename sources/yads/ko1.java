package yads;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ko1 implements nw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw0 f112794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pm1 f112795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mo1 f112796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cp2 f112797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jn1 f112798e;

    public ko1(rw0 rw0Var, t9 t9Var, to1 to1Var) {
        this.f112794a = rw0Var;
        c4 c4VarE = rw0Var.e();
        es2 es2VarH = rw0Var.h();
        qn1 qn1Var = new qn1(c4VarE);
        jn1 jn1Var = new jn1(c4VarE, es2VarH, t9Var);
        this.f112798e = jn1Var;
        lo1 lo1Var = new lo1(new ym1(to1Var.c(), qn1Var, jn1Var));
        v5 v5VarF = rw0Var.f();
        fa2 fa2Var = new fa2(rw0Var, to1Var);
        mo1 mo1Var = new mo1();
        this.f112796c = mo1Var;
        pm1 pm1Var = new pm1(c4VarE, es2VarH, v5VarF, mo1Var, jn1Var, lo1Var, fa2Var);
        this.f112795b = pm1Var;
        this.f112797d = new cp2(rw0Var, pm1Var);
    }

    @Override // yads.nw0
    public final void a(Context context) {
        this.f112794a.f115510f.a();
        this.f112795b.a(context);
    }

    @Override // yads.dc
    public final List b() {
        return CollectionsKt.emptyList();
    }

    @Override // yads.nw0
    public final String getAdInfo() {
        return null;
    }

    @Override // yads.nw0
    public final void a(Context context, t9 t9Var) {
        this.f112795b.a(context, this.f112797d);
    }

    @Override // yads.nw0
    public final Object a(cx0 cx0Var, Activity activity) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            this.f112796c.getClass();
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            this.f112795b.getClass();
        }
        return objB;
    }

    @Override // yads.dc
    public final List a() {
        return CollectionsKt.emptyList();
    }
}
