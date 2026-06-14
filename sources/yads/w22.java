package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes4.dex */
public final class w22 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Deferred f117280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f117282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4 f117283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x22 f117284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f117285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dx1 f117286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m30 f117287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hg2 f117288j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(c4 c4Var, x22 x22Var, Context context, dx1 dx1Var, m30 m30Var, hg2 hg2Var, Continuation continuation) {
        super(2, continuation);
        this.f117283e = c4Var;
        this.f117284f = x22Var;
        this.f117285g = context;
        this.f117286h = dx1Var;
        this.f117287i = m30Var;
        this.f117288j = hg2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        w22 w22Var = new w22(this.f117283e, this.f117284f, this.f117285g, this.f117286h, this.f117287i, this.f117288j, continuation);
        w22Var.f117282d = obj;
        return w22Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w22) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r14.f117281c
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L37
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            kotlin.d.b(r15)
            return r15
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            kotlin.d.b(r15)
            return r15
        L25:
            java.lang.Object r1 = r14.f117282d
            kotlinx.coroutines.Deferred r1 = (kotlinx.coroutines.Deferred) r1
            kotlin.d.b(r15)
            goto L99
        L2d:
            kotlinx.coroutines.Deferred r1 = r14.f117280b
            java.lang.Object r2 = r14.f117282d
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlin.d.b(r15)
            goto L8c
        L37:
            kotlin.d.b(r15)
            java.lang.Object r15 = r14.f117282d
            r7 = r15
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            yads.c4 r15 = r14.f117283e
            boolean r15 = r15.f109207n
            if (r15 == 0) goto La5
            yads.t22 r10 = new yads.t22
            yads.x22 r15 = r14.f117284f
            yads.dx1 r1 = r14.f117286h
            yads.hg2 r2 = r14.f117288j
            r10.<init>(r15, r1, r2, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.Job r15 = eg.g.d(r7, r8, r9, r10, r11, r12)
            yads.v22 r10 = new yads.v22
            yads.x22 r1 = r14.f117284f
            android.content.Context r2 = r14.f117285g
            yads.dx1 r8 = r14.f117286h
            r10.<init>(r1, r2, r8, r6)
            r8 = 0
            kotlinx.coroutines.Job r2 = eg.g.d(r7, r8, r9, r10, r11, r12)
            yads.u22 r8 = new yads.u22
            yads.x22 r9 = r14.f117284f
            android.content.Context r10 = r14.f117285g
            yads.dx1 r11 = r14.f117286h
            yads.m30 r12 = r14.f117287i
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r11 = 3
            r12 = 0
            r10 = r8
            r8 = 0
            r9 = 0
            kotlinx.coroutines.Deferred r1 = eg.g.b(r7, r8, r9, r10, r11, r12)
            r14.f117282d = r2
            r14.f117280b = r1
            r14.f117281c = r5
            java.lang.Object r15 = r15.i0(r14)
            if (r15 != r0) goto L8c
            goto Lb9
        L8c:
            r14.f117282d = r1
            r14.f117280b = r6
            r14.f117281c = r4
            java.lang.Object r15 = r2.i0(r14)
            if (r15 != r0) goto L99
            goto Lb9
        L99:
            r14.f117282d = r6
            r14.f117281c = r3
            java.lang.Object r15 = r1.await(r14)
            if (r15 != r0) goto La4
            goto Lb9
        La4:
            return r15
        La5:
            yads.x22 r15 = r14.f117284f
            yads.u42 r3 = r15.f117691c
            android.content.Context r5 = r14.f117285g
            yads.dx1 r6 = r14.f117286h
            yads.m30 r7 = r14.f117287i
            r14.f117281c = r2
            r4 = 0
            r8 = r14
            java.lang.Object r15 = r3.a(r4, r5, r6, r7, r8)
            if (r15 != r0) goto Lba
        Lb9:
            return r0
        Lba:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.w22.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
