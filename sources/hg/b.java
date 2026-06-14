package hg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
final class b extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function2 f73172f;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73173r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f73174s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f73176u;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73174s = obj;
            this.f73176u |= Integer.MIN_VALUE;
            return b.this.f(null, this);
        }
    }

    public /* synthetic */ b(Function2 function2, CoroutineContext coroutineContext, int i10, gg.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? kotlin.coroutines.e.f93267b : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? gg.a.f72765b : aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hg.f, ig.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object f(gg.v r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof hg.b.a
            if (r0 == 0) goto L13
            r0 = r6
            hg.b$a r0 = (hg.b.a) r0
            int r1 = r0.f73176u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73176u = r1
            goto L18
        L13:
            hg.b$a r0 = new hg.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f73174s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73176u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f73173r
            gg.v r5 = (gg.v) r5
            kotlin.d.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            r0.f73173r = r5
            r0.f73176u = r3
            java.lang.Object r6 = super.f(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.j()
            if (r5 == 0) goto L4c
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.b.f(gg.v, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // hg.f, ig.e
    protected ig.e i(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return new b(this.f73172f, coroutineContext, i10, aVar);
    }

    public b(Function2 function2, CoroutineContext coroutineContext, int i10, gg.a aVar) {
        super(function2, coroutineContext, i10, aVar);
        this.f73172f = function2;
    }
}
