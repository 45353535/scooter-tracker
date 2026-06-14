package com.monetization.ads.mediation.banner;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import yads.c4;
import yads.cm;
import yads.es2;
import yads.fa2;
import yads.j1;
import yads.jn1;
import yads.lb1;
import yads.ln1;
import yads.mm;
import yads.nn1;
import yads.pm1;
import yads.pn1;
import yads.t9;
import yads.to1;
import yads.ym1;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements mm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f59030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f59031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pm1 f59032c;

    public c(cm cmVar, t9 t9Var, to1 to1Var) {
        this.f59030a = t9Var;
        c4 c4VarE = cmVar.e();
        es2 es2VarH = cmVar.h();
        nn1 nn1Var = new nn1(c4VarE);
        jn1 jn1Var = new jn1(c4VarE, es2VarH, t9Var);
        ln1 ln1Var = new ln1(new ym1(to1Var.c(), nn1Var, jn1Var));
        pm1 pm1Var = new pm1(c4VarE, es2VarH, cmVar.f(), new b(), jn1Var, ln1Var, new fa2(cmVar, to1Var));
        this.f59032c = pm1Var;
        this.f59031b = new a(cmVar, pm1Var, new pn1(cmVar.r(), cmVar.e().d()));
    }

    @Override // yads.mm
    public final List a() {
        return CollectionsKt.emptyList();
    }

    @Override // yads.mm
    public final List b() {
        return CollectionsKt.emptyList();
    }

    @Override // yads.mm
    public final String getAdInfo() {
        return this.f59030a.f116110c;
    }

    @Override // yads.mm
    public final void a(Context context) {
        this.f59032c.a(context);
    }

    @Override // yads.mm
    public final void a(Context context, t9 t9Var) {
        Activity activityA = j1.a();
        if (activityA != null) {
            boolean z10 = lb1.f113032a;
        }
        if (activityA != null) {
            context = activityA;
        }
        this.f59032c.a(context, this.f59031b);
    }
}
