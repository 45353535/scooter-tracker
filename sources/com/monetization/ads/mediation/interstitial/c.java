package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import yads.c4;
import yads.cx0;
import yads.es2;
import yads.fa2;
import yads.jn1;
import yads.nw0;
import yads.pm1;
import yads.qn1;
import yads.rw0;
import yads.t9;
import yads.to1;
import yads.un1;
import yads.v5;
import yads.ym1;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements nw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw0 f59046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pm1 f59047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f59048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f59049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jn1 f59050e;

    public c(rw0 rw0Var, t9 t9Var, to1 to1Var) {
        this.f59046a = rw0Var;
        c4 c4VarE = rw0Var.e();
        es2 es2VarH = rw0Var.h();
        qn1 qn1Var = new qn1(c4VarE);
        jn1 jn1Var = new jn1(c4VarE, es2VarH, t9Var);
        this.f59050e = jn1Var;
        un1 un1Var = new un1(new ym1(to1Var.c(), qn1Var, jn1Var));
        v5 v5VarF = rw0Var.f();
        fa2 fa2Var = new fa2(rw0Var, to1Var);
        b bVar = new b();
        this.f59048c = bVar;
        pm1 pm1Var = new pm1(c4VarE, es2VarH, v5VarF, bVar, jn1Var, un1Var, fa2Var);
        this.f59047b = pm1Var;
        this.f59049d = new a(rw0Var, pm1Var);
    }

    @Override // yads.nw0
    public final void a(Context context, t9 t9Var) {
        this.f59047b.a(context, this.f59049d);
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
    public final Object a(cx0 cx0Var, Activity activity) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            this.f59048c.getClass();
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.g(objB) != null) {
            this.f59047b.getClass();
        }
        return objB;
    }

    @Override // yads.dc
    public final List a() {
        return CollectionsKt.emptyList();
    }

    @Override // yads.nw0
    public final void a(Context context) {
        this.f59046a.f115510f.a();
        this.f59047b.a(context);
    }
}
