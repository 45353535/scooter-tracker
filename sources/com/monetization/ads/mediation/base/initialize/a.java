package com.monetization.ads.mediation.base.initialize;

import java.util.concurrent.atomic.AtomicBoolean;
import yads.eo1;
import yads.es2;
import yads.fn1;
import yads.gn1;
import yads.if2;
import yads.xo;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f59033g = new AtomicBoolean(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f59034h = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2 f59035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xo f59036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final if2 f59037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eo1 f59038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gn1 f59039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fn1 f59040f;

    public /* synthetic */ a(es2 es2Var) {
        xo xoVar = new xo();
        if2 if2Var = new if2();
        eo1 eo1Var = new eo1();
        this(es2Var, xoVar, if2Var, eo1Var, new gn1(eo1Var), new fn1(eo1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r5, yads.cp1 r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof yads.ho1
            if (r0 == 0) goto L13
            r0 = r7
            yads.ho1 r0 = (yads.ho1) r0
            int r1 = r0.f111649e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111649e = r1
            goto L18
        L13:
            yads.ho1 r0 = new yads.ho1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f111647c
            pf.b.g()
            int r0 = r0.f111649e
            if (r0 == 0) goto L33
            r5 = 1
            if (r0 != r5) goto L2b
            kotlin.d.b(r7)
            androidx.privacysandbox.ads.adservices.topics.a.a(r7)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.d.b(r7)
            yads.eo1 r7 = r4.f59038d
            r7.b(r6)
            yads.fn1 r7 = r4.f59040f
            yads.es2 r0 = r4.f59035a
            r7.a(r5, r6, r0)
        L42:
            boolean r5 = yads.lb1.f113032a
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.mediation.base.initialize.a.a(android.content.Context, yads.cp1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public a(es2 es2Var, xo xoVar, if2 if2Var, eo1 eo1Var, gn1 gn1Var, fn1 fn1Var) {
        this.f59035a = es2Var;
        this.f59036b = xoVar;
        this.f59037c = if2Var;
        this.f59038d = eo1Var;
        this.f59039e = gn1Var;
        this.f59040f = fn1Var;
    }
}
