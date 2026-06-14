package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class kx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt2 f112884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k62 f112885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f62 f112886c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx1(Context context, c4 c4Var, es2 es2Var) {
        this(ut2.a(), new k62(context, c4Var, es2Var), new f62());
        Object obj = vt2.f117186j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(yads.kx1 r9, yads.gi r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof yads.gx1
            if (r0 == 0) goto L16
            r0 = r11
            yads.gx1 r0 = (yads.gx1) r0
            int r1 = r0.f111385e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f111385e = r1
            goto L1b
        L16:
            yads.gx1 r0 = new yads.gx1
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.f111383c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f111385e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            yads.gi r9 = r0.f111382b
            kotlin.d.b(r11)
            goto L6d
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.d.b(r11)
            java.lang.Object r11 = r10.f111215c
            boolean r11 = r11 instanceof yads.am1
            if (r11 == 0) goto L47
            java.lang.String r11 = "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<R of com.monetization.ads.network.model.AssetKt.castGeneric>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)
            r11 = r10
            goto L48
        L47:
            r11 = r4
        L48:
            if (r11 != 0) goto L4b
            return r10
        L4b:
            yads.k62 r9 = r9.f112885b
            java.lang.Object r10 = r11.f111215c
            yads.am1 r10 = (yads.am1) r10
            yads.gb3 r10 = r10.f108720b
            r0.f111382b = r11
            r0.f111385e = r3
            r9.getClass()
            kotlinx.coroutines.CoroutineDispatcher r2 = eg.o0.b()
            yads.g62 r3 = new yads.g62
            r3.<init>(r10, r9, r4)
            java.lang.Object r9 = eg.g.g(r2, r3, r0)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            r8 = r11
            r11 = r9
            r9 = r8
        L6d:
            yads.gb3 r11 = (yads.gb3) r11
            if (r11 != 0) goto L7e
            java.lang.Object r10 = r9.f111215c
            yads.am1 r10 = (yads.am1) r10
            java.util.List r0 = r10.f108721c
            if (r0 != 0) goto L7e
            yads.ai1 r10 = r10.f108719a
            if (r10 != 0) goto L7e
            return r4
        L7e:
            java.lang.Object r10 = r9.f111215c
            yads.am1 r10 = (yads.am1) r10
            yads.ai1 r0 = r10.f108719a
            java.util.List r10 = r10.f108721c
            yads.am1 r4 = new yads.am1
            r4.<init>(r0, r11, r10)
            java.lang.String r2 = r9.f111213a
            java.lang.String r3 = r9.f111214b
            yads.td1 r5 = r9.f111216d
            boolean r6 = r9.f111217e
            boolean r7 = r9.f111218f
            yads.gi r1 = new yads.gi
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.kx1.a(yads.kx1, yads.gi, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public kx1(vt2 vt2Var, k62 k62Var, f62 f62Var) {
        this.f112884a = vt2Var;
        this.f112885b = k62Var;
        this.f112886c = f62Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r19, yads.dx1 r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof yads.hx1
            if (r3 == 0) goto L19
            r3 = r2
            yads.hx1 r3 = (yads.hx1) r3
            int r4 = r3.f111798e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f111798e = r4
            goto L1e
        L19:
            yads.hx1 r3 = new yads.hx1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f111796c
            java.lang.Object r4 = pf.b.g()
            int r5 = r3.f111798e
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L3a
            if (r5 != r7) goto L32
            yads.dx1 r1 = r3.f111795b
            kotlin.d.b(r2)
            goto L63
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            kotlin.d.b(r2)
            yads.vt2 r2 = r0.f112884a
            r5 = r19
            yads.hr2 r2 = r2.a(r5)
            if (r2 == 0) goto L90
            boolean r2 = r2.A0
            if (r2 != r7) goto L90
            yads.qz1 r2 = r1.f110104a
            java.util.List r2 = r2.f115232a
            r3.f111795b = r1
            r3.f111798e = r7
            kotlinx.coroutines.CoroutineDispatcher r5 = eg.o0.b()
            yads.jx1 r7 = new yads.jx1
            r7.<init>(r2, r0, r6)
            java.lang.Object r2 = eg.g.g(r5, r7, r3)
            if (r2 != r4) goto L63
            return r4
        L63:
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L69
            return r6
        L69:
            yads.qz1 r2 = r1.f110104a
            java.util.List r9 = r2.f115233b
            java.util.List r10 = r2.f115234c
            yads.i5 r11 = r2.f115235d
            java.util.Map r12 = r2.f115236e
            java.util.List r13 = r2.f115237f
            java.util.List r14 = r2.f115238g
            java.lang.String r15 = r2.f115239h
            yads.zv2 r3 = r2.f115240i
            yads.a7 r2 = r2.f115241j
            yads.qz1 r7 = new yads.qz1
            r17 = r2
            r16 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            yads.t9 r2 = r1.f110105b
            yads.c4 r1 = r1.f110106c
            yads.dx1 r3 = new yads.dx1
            r3.<init>(r2, r1, r7)
            return r3
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.kx1.a(android.content.Context, yads.dx1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
