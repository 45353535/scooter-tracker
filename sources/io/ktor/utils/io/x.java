package io.ktor.utils.io;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f82197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pg.a f82198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f82199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f82200e;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f82201r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f82203t;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82201r = obj;
            this.f82203t |= Integer.MIN_VALUE;
            return x.this.d(0, this);
        }
    }

    public x(e delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f82197b = delegate;
        this.f82198c = new pg.a();
    }

    private final void f() {
        i();
        this.f82199d += this.f82198c.f0(this.f82197b.g());
    }

    private final void i() {
        this.f82200e += this.f82199d - this.f82198c.s();
        this.f82199d = this.f82198c.s();
    }

    @Override // io.ktor.utils.io.e
    public void a(Throwable th2) {
        this.f82197b.a(th2);
        this.f82198c.close();
    }

    @Override // io.ktor.utils.io.e
    public Throwable b() {
        return this.f82197b.b();
    }

    @Override // io.ktor.utils.io.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public pg.a g() {
        f();
        return this.f82198c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(int r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.x.a
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.x$a r0 = (io.ktor.utils.io.x.a) r0
            int r1 = r0.f82203t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82203t = r1
            goto L18
        L13:
            io.ktor.utils.io.x$a r0 = new io.ktor.utils.io.x$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f82201r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f82203t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r10)
            goto L51
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            kotlin.d.b(r10)
            pg.a r10 = r8.g()
            long r4 = r10.s()
            long r6 = (long) r9
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L46
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r9
        L46:
            io.ktor.utils.io.e r10 = r8.f82197b
            r0.f82203t = r3
            java.lang.Object r10 = r10.d(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L61
            r8.f()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r9
        L61:
            r9 = 0
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.x.d(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long e() {
        i();
        return this.f82200e;
    }

    @Override // io.ktor.utils.io.e
    public boolean h() {
        return this.f82198c.exhausted() && this.f82197b.h();
    }
}
