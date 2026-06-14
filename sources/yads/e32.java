package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes4.dex */
public final class e32 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Deferred f110171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f110173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f110174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tx1 f110175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vx1 f110176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f32 f110177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c4 f110178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ dx1 f110179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m30 f110180k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e32(Context context, tx1 tx1Var, vx1 vx1Var, f32 f32Var, c4 c4Var, dx1 dx1Var, m30 m30Var, Continuation continuation) {
        super(2, continuation);
        this.f110174e = context;
        this.f110175f = tx1Var;
        this.f110176g = vx1Var;
        this.f110177h = f32Var;
        this.f110178i = c4Var;
        this.f110179j = dx1Var;
        this.f110180k = m30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        e32 e32Var = new e32(this.f110174e, this.f110175f, this.f110176g, this.f110177h, this.f110178i, this.f110179j, this.f110180k, continuation);
        e32Var.f110173d = obj;
        return e32Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e32) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r14.f110172c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r14.f110173d
            yads.hg2 r0 = (yads.hg2) r0
            kotlin.d.b(r15)
            r3 = r0
            goto L7c
        L18:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L20:
            kotlinx.coroutines.Deferred r1 = r14.f110171b
            java.lang.Object r4 = r14.f110173d
            yads.hg2 r4 = (yads.hg2) r4
            kotlin.d.b(r15)
            goto L6e
        L2a:
            kotlin.d.b(r15)
            java.lang.Object r15 = r14.f110173d
            r5 = r15
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            yads.hg2 r11 = new yads.hg2
            android.content.Context r15 = r14.f110174e
            r11.<init>(r15)
            yads.d32 r6 = new yads.d32
            yads.f32 r7 = r14.f110177h
            yads.c4 r8 = r14.f110178i
            android.content.Context r9 = r14.f110174e
            yads.dx1 r10 = r14.f110179j
            yads.m30 r12 = r14.f110180k
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r9 = 3
            r10 = 0
            r8 = r6
            r6 = 0
            r7 = 0
            kotlinx.coroutines.Deferred r1 = eg.g.b(r5, r6, r7, r8, r9, r10)
            yads.c32 r8 = new yads.c32
            yads.f32 r15 = r14.f110177h
            yads.dx1 r6 = r14.f110179j
            r8.<init>(r15, r6, r2)
            r6 = 0
            kotlinx.coroutines.Job r15 = eg.g.d(r5, r6, r7, r8, r9, r10)
            r14.f110173d = r11
            r14.f110171b = r1
            r14.f110172c = r4
            java.lang.Object r15 = r15.i0(r14)
            if (r15 != r0) goto L6d
            goto L7a
        L6d:
            r4 = r11
        L6e:
            r14.f110173d = r4
            r14.f110171b = r2
            r14.f110172c = r3
            java.lang.Object r15 = r1.await(r14)
            if (r15 != r0) goto L7b
        L7a:
            return r0
        L7b:
            r3 = r4
        L7c:
            r2 = r15
            yads.dx1 r2 = (yads.dx1) r2
            if (r2 != 0) goto L89
            yads.tx1 r15 = r14.f110175f
            yads.k4 r0 = yads.f9.f110661v
            r15.a(r0)
            goto La7
        L89:
            yads.vx1 r5 = r14.f110176g
            yads.v5 r15 = r5.f117224b
            yads.u5 r0 = yads.u5.f116510n
            r15.a(r0)
            yads.wx1 r4 = r5.f117225c
            yads.yx1 r1 = r4.f117631g
            kotlinx.coroutines.CoroutineScope r15 = r1.f118430d
            yads.ux1 r0 = new yads.ux1
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            r6 = r15
            r9 = r0
            eg.g.d(r6, r7, r8, r9, r10, r11)
        La7:
            kotlin.Unit r15 = kotlin.Unit.f93236a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e32.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
