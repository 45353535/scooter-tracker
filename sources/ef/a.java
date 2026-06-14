package ef;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f69091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineContext f69092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f69093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69094f;

    /* JADX INFO: renamed from: ef.a$a, reason: collision with other inner class name */
    static final class C0870a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f69095r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f69097t;

        C0870a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f69095r = obj;
            this.f69097t |= Integer.MIN_VALUE;
            return a.this.i(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object context, List interceptors, Object subject, CoroutineContext coroutineContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f69091c = interceptors;
        this.f69092d = coroutineContext;
        this.f69093e = subject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ef.a.C0870a
            if (r0 == 0) goto L13
            r0 = r6
            ef.a$a r0 = (ef.a.C0870a) r0
            int r1 = r0.f69097t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69097t = r1
            goto L18
        L13:
            ef.a$a r0 = new ef.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f69095r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f69097t
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L26
            goto L2e
        L26:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2e:
            kotlin.d.b(r6)
        L31:
            int r6 = r5.f69094f
            r2 = -1
            if (r6 != r2) goto L37
            goto L42
        L37:
            java.util.List r2 = r5.f69091c
            int r4 = r2.size()
            if (r6 < r4) goto L47
            r5.h()
        L42:
            java.lang.Object r6 = r5.c()
            return r6
        L47:
            java.lang.Object r2 = r2.get(r6)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            int r6 = r6 + 1
            r5.f69094f = r6
            java.lang.Object r6 = r5.c()
            r0.f69097t = r3
            java.lang.Object r6 = r2.invoke(r5, r6, r0)
            if (r6 != r1) goto L31
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.a.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ef.e
    public Object a(Object obj, Continuation continuation) {
        this.f69094f = 0;
        j(obj);
        return d(continuation);
    }

    @Override // ef.e
    public Object c() {
        return this.f69093e;
    }

    @Override // ef.e
    public Object d(Continuation continuation) {
        int i10 = this.f69094f;
        if (i10 < 0) {
            return c();
        }
        if (i10 < this.f69091c.size()) {
            return i(continuation);
        }
        h();
        return c();
    }

    @Override // ef.e
    public Object e(Object obj, Continuation continuation) {
        j(obj);
        return d(continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f69092d;
    }

    public void h() {
        this.f69094f = -1;
    }

    public void j(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f69093e = obj;
    }
}
