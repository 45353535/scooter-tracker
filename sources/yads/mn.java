package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class mn extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c4 f113554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f113556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn f113557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e83 f113558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zo f113559g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(rn rnVar, e83 e83Var, zo zoVar, Continuation continuation) {
        super(2, continuation);
        this.f113557e = rnVar;
        this.f113558f = e83Var;
        this.f113559g = zoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        mn mnVar = new mn(this.f113557e, this.f113558f, this.f113559g, continuation);
        mnVar.f113556d = obj;
        return mnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mn) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r11.f113555c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r11.f113556d
            yads.c4 r0 = (yads.c4) r0
            kotlin.d.b(r12)
            goto L7b
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            yads.c4 r1 = r11.f113554b
            java.lang.Object r3 = r11.f113556d
            kotlinx.coroutines.Deferred r3 = (kotlinx.coroutines.Deferred) r3
            kotlin.d.b(r12)
            goto L64
        L29:
            kotlin.d.b(r12)
            java.lang.Object r12 = r11.f113556d
            r5 = r12
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            yads.ln r8 = new yads.ln
            yads.rn r12 = r11.f113557e
            yads.zo r1 = r11.f113559g
            r8.<init>(r12, r1, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.Deferred r12 = eg.g.b(r5, r6, r7, r8, r9, r10)
            yads.kn r8 = new yads.kn
            yads.rn r1 = r11.f113557e
            yads.zo r6 = r11.f113559g
            r8.<init>(r1, r6, r4)
            r6 = 0
            kotlinx.coroutines.Deferred r1 = eg.g.b(r5, r6, r7, r8, r9, r10)
            yads.rn r5 = r11.f113557e
            yads.c4 r5 = r5.f115507c
            r11.f113556d = r12
            r11.f113554b = r5
            r11.f113555c = r3
            java.lang.Object r1 = r1.await(r11)
            if (r1 != r0) goto L61
            goto L78
        L61:
            r3 = r12
            r12 = r1
            r1 = r5
        L64:
            java.lang.String r12 = (java.lang.String) r12
            r1.f109202i = r12
            yads.rn r12 = r11.f113557e
            yads.c4 r12 = r12.f115507c
            r11.f113556d = r12
            r11.f113554b = r4
            r11.f113555c = r2
            java.lang.Object r1 = r3.await(r11)
            if (r1 != r0) goto L79
        L78:
            return r0
        L79:
            r0 = r12
            r12 = r1
        L7b:
            java.lang.String r12 = (java.lang.String) r12
            r0.f109203j = r12
            yads.rn r12 = r11.f113557e
            yads.v5 r12 = r12.f115506b
            yads.u5 r0 = yads.u5.f116503g
            r12.a(r0)
            yads.rn r12 = r11.f113557e
            yads.e83 r0 = r11.f113558f
            monitor-enter(r12)
            kotlinx.coroutines.CoroutineScope r5 = r12.f115509e     // Catch: java.lang.Throwable -> L9f
            yads.in r8 = new yads.in     // Catch: java.lang.Throwable -> L9f
            r8.<init>(r12, r0, r4)     // Catch: java.lang.Throwable -> L9f
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            eg.g.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r12)
            kotlin.Unit r12 = kotlin.Unit.f93236a
            return r12
        L9f:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
