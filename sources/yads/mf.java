package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class mf extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ of f113453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(of ofVar, Continuation continuation) {
        super(2, continuation);
        this.f113453c = ofVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new mf(this.f113453c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new mf(this.f113453c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[PHI: r9
  0x0035: PHI (r9v4 java.lang.Object) = (r9v3 java.lang.Object), (r9v0 java.lang.Object) binds: [B:12:0x0032, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0047 -> B:11:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r8.f113452b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L1b
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            kotlin.d.b(r9)
            goto L35
        L1b:
            kotlin.d.b(r9)
        L1e:
            yads.of r9 = r8.f113453c
            yads.cf r1 = r9.f114292e
            long r4 = r9.f114289b
            r8.f113452b = r3
            kotlin.coroutines.CoroutineContext r9 = r1.f109382a
            yads.bf r6 = new yads.bf
            r7 = 0
            r6.<init>(r1, r4, r7)
            java.lang.Object r9 = eg.g.g(r9, r6, r8)
            if (r9 != r0) goto L35
            goto L49
        L35:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4a
            yads.of r9 = r8.f113453c
            long r4 = r9.f114288a
            r8.f113452b = r2
            java.lang.Object r9 = eg.k0.a(r4, r8)
            if (r9 != r0) goto L1e
        L49:
            return r0
        L4a:
            yads.of r9 = r8.f113453c
            yads.of.a(r9)
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
