package io.ktor.utils.io;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f82189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f82190c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f82191r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f82193t;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82191r = obj;
            this.f82193t |= Integer.MIN_VALUE;
            return p.this.e(this);
        }
    }

    public p(k delegate, Function1 onClose) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f82189b = delegate;
        this.f82190c = onClose;
    }

    @Override // io.ktor.utils.io.k
    public void a(Throwable th2) {
        this.f82189b.a(th2);
    }

    @Override // io.ktor.utils.io.k
    public Throwable b() {
        return this.f82189b.b();
    }

    @Override // io.ktor.utils.io.k
    public Object c(Continuation continuation) {
        return this.f82189b.c(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r6.invoke(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.p.a
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.p$a r0 = (io.ktor.utils.io.p.a) r0
            int r1 = r0.f82193t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82193t = r1
            goto L18
        L13:
            io.ktor.utils.io.p$a r0 = new io.ktor.utils.io.p$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f82191r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f82193t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.d.b(r6)
            goto L46
        L38:
            kotlin.d.b(r6)
            io.ktor.utils.io.k r6 = r5.f82189b
            r0.f82193t = r4
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            kotlin.jvm.functions.Function1 r6 = r5.f82190c
            r0.f82193t = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.p.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.utils.io.k
    public pg.r f() {
        return this.f82189b.f();
    }
}
