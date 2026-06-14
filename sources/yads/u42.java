package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class u42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f116489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td0 f116490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tt0 f116491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f116492d;

    public u42(CoroutineScope coroutineScope, td0 td0Var, tt0 tt0Var, kx1 kx1Var) {
        this.f116489a = coroutineScope;
        this.f116490b = td0Var;
        this.f116491c = tt0Var;
        this.f116492d = kx1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r23, android.content.Context r24, yads.dx1 r25, yads.m30 r26, kotlin.coroutines.Continuation r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r27
            boolean r3 = r2 instanceof yads.r42
            if (r3 == 0) goto L1a
            r3 = r2
            yads.r42 r3 = (yads.r42) r3
            int r4 = r3.f115305h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f115305h = r4
        L18:
            r9 = r3
            goto L20
        L1a:
            yads.r42 r3 = new yads.r42
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r9.f115303f
            java.lang.Object r3 = pf.b.g()
            int r4 = r9.f115305h
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L51
            if (r4 == r6) goto L40
            if (r4 != r5) goto L38
            java.lang.Object r1 = r9.f115299b
            yads.dx1 r1 = (yads.dx1) r1
            kotlin.d.b(r2)
            return r1
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L40:
            boolean r1 = r9.f115302e
            yads.m30 r4 = r9.f115301d
            android.content.Context r6 = r9.f115300c
            java.lang.Object r7 = r9.f115299b
            yads.u42 r7 = (yads.u42) r7
            kotlin.d.b(r2)
            r12 = r6
            r11 = r7
        L4f:
            r15 = r4
            goto L71
        L51:
            kotlin.d.b(r2)
            yads.kx1 r2 = r0.f116492d
            r9.f115299b = r0
            r9.f115300c = r1
            r4 = r26
            r9.f115301d = r4
            r7 = r23
            r9.f115302e = r7
            r9.f115305h = r6
            r6 = r25
            java.lang.Object r2 = r2.a(r1, r6, r9)
            if (r2 != r3) goto L6d
            goto Lb1
        L6d:
            r11 = r0
            r12 = r1
            r1 = r7
            goto L4f
        L71:
            r14 = r2
            yads.dx1 r14 = (yads.dx1) r14
            r2 = 0
            if (r14 != 0) goto L78
            return r2
        L78:
            if (r1 != 0) goto L7b
            goto Lb2
        L7b:
            yads.t9 r13 = r14.f110105b
            boolean r1 = r13.E
            if (r1 == 0) goto L9a
            kotlinx.coroutines.CoroutineScope r1 = r11.f116489a
            yads.s42 r10 = new yads.s42
            r16 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r20 = 3
            r21 = 0
            r17 = 0
            r18 = 0
            r16 = r1
            r19 = r10
            eg.g.d(r16, r17, r18, r19, r20, r21)
            return r14
        L9a:
            boolean r1 = r13.f116131x
            if (r1 == 0) goto Lb2
            r9.f115299b = r14
            r9.f115300c = r2
            r9.f115301d = r2
            r9.f115305h = r5
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Object r1 = r4.a(r5, r6, r7, r8, r9)
            if (r1 != r3) goto Lb2
        Lb1:
            return r3
        Lb2:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u42.a(boolean, android.content.Context, yads.dx1, yads.m30, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ u42(c4 c4Var, es2 es2Var, Context context, v5 v5Var, CoroutineScope coroutineScope) {
        this(coroutineScope, new td0(context, v5Var), new tt0(context, v5Var), new kx1(context, c4Var, es2Var));
    }

    public final Object a(Context context, t9 t9Var, dx1 dx1Var, m30 m30Var, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        t42 t42Var = new t42(eVar);
        boolean zA = aq0.a(context, zp0.f118750c);
        c52[] c52VarArr = c52.f109225b;
        if (Intrinsics.areEqual("first_video_preloading_strategy", t9Var.f116129v) && zA) {
            tt0 tt0Var = this.f116491c;
            synchronized (tt0Var.f116375d) {
                try {
                    qz1 qz1Var = dx1Var.f110104a;
                    q52 q52Var = tt0Var.f116374c;
                    q52Var.getClass();
                    List listC0 = kotlin.sequences.k.c0(kotlin.sequences.k.Q(kotlin.sequences.k.Q(kotlin.sequences.k.R(kotlin.sequences.k.K(CollectionsKt.asSequence(qz1Var.f115232a), new n52(q52Var)), o52.f114204b), l52.f112974b), m52.f113323b));
                    if (listC0.isEmpty()) {
                        t42Var.a();
                    } else {
                        rt0 rt0Var = new rt0(tt0Var.f116372a, t42Var, tt0Var.f116373b, CollectionsKt.drop(listC0, 1).iterator(), m30Var);
                        tt0Var.f116372a.a(u5.f116512p, null);
                        Pair pair = (Pair) CollectionsKt.first(listC0);
                        tt0Var.f116373b.a((String) pair.component1(), rt0Var, (String) pair.component2());
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            this.f116490b.a(dx1Var, t42Var, m30Var);
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }
}
