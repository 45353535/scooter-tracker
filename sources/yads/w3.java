package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class w3 implements x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2 f117289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f117290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4 f117291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gy1 f117292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b33 f117293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xa f117294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lx1 f117295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w53 f117296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r5 f117297i;

    public /* synthetic */ w3(Context context, es2 es2Var, t9 t9Var, c4 c4Var, gy1 gy1Var, b33 b33Var) {
        xa xaVar = new xa(context, es2Var, c4Var);
        this(es2Var, t9Var, c4Var, gy1Var, b33Var, xaVar, new lx1(context, c4Var, es2Var, t9Var), new w53(xaVar), new r5(gy1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.view.View r5, yads.td1 r6, yads.v0 r7, yads.y22 r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof yads.v3
            if (r0 == 0) goto L13
            r0 = r9
            yads.v3 r0 = (yads.v3) r0
            int r1 = r0.f116861g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116861g = r1
            goto L18
        L13:
            yads.v3 r0 = new yads.v3
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f116859e
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f116861g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            yads.b92 r8 = r0.f116858d
            yads.td1 r6 = r0.f116857c
            yads.w3 r5 = r0.f116856b
            kotlin.d.b(r9)
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.d.b(r9)
            java.util.List r9 = r6.f116205a
            r0.f116856b = r4
            r0.f116857c = r6
            r0.f116858d = r8
            r0.f116861g = r3
            java.lang.Object r9 = r7.a(r5, r9, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            yads.zy0 r9 = (yads.zy0) r9
            yads.w53 r5 = r5.f117296h
            java.util.List r7 = r6.f116207c
            r5.a(r7)
            java.lang.String r5 = r6.f116208d
            if (r5 == 0) goto L62
            int r6 = r5.length()
            if (r6 <= 0) goto L62
            r8.a(r5)
        L62:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.w3.a(android.view.View, yads.td1, yads.v0, yads.y22, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public w3(es2 es2Var, t9 t9Var, c4 c4Var, gy1 gy1Var, b33 b33Var, xa xaVar, lx1 lx1Var, w53 w53Var, r5 r5Var) {
        this.f117289a = es2Var;
        this.f117290b = t9Var;
        this.f117291c = c4Var;
        this.f117292d = gy1Var;
        this.f117293e = b33Var;
        this.f117294f = xaVar;
        this.f117295g = lx1Var;
        this.f117296h = w53Var;
        this.f117297i = r5Var;
    }
}
