package hg;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes3.dex */
final class o0 implements SharedFlow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedFlow f73282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function2 f73283c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f73284r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f73286t;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73284r = obj;
            this.f73286t |= Integer.MIN_VALUE;
            return o0.this.collect(null, this);
        }
    }

    public o0(SharedFlow sharedFlow, Function2 function2) {
        this.f73282b = sharedFlow;
        this.f73283c = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof hg.o0.a
            if (r0 == 0) goto L13
            r0 = r7
            hg.o0$a r0 = (hg.o0.a) r0
            int r1 = r0.f73286t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73286t = r1
            goto L18
        L13:
            hg.o0$a r0 = new hg.o0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f73284r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73286t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.d.b(r7)
            goto L46
        L31:
            kotlin.d.b(r7)
            kotlinx.coroutines.flow.SharedFlow r7 = r5.f73282b
            hg.n0 r2 = new hg.n0
            kotlin.jvm.functions.Function2 r4 = r5.f73283c
            r2.<init>(r6, r4)
            r0.f73286t = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            lf.g r6 = new lf.g
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.o0.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
