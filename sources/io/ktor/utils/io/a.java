package io.ktor.utils.io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements io.ktor.utils.io.e, k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f82039g = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "suspensionSlot");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f82040h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_closedCause");

    @NotNull
    volatile /* synthetic */ Object _closedCause;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f82041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pg.a f82042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f82043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pg.a f82044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final pg.a f82045f;
    private volatile int flushBufferSize;

    @NotNull
    volatile /* synthetic */ Object suspensionSlot;

    /* JADX INFO: renamed from: io.ktor.utils.io.a$a, reason: collision with other inner class name */
    private interface InterfaceC0986a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f82046a = b.f82048a;

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$a, reason: collision with other inner class name */
        public static final class C0987a implements InterfaceC0986a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f82047b;

            public C0987a(Throwable th2) {
                this.f82047b = th2;
            }

            public final Throwable d() {
                return this.f82047b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0987a) && Intrinsics.areEqual(this.f82047b, ((C0987a) obj).f82047b);
            }

            public int hashCode() {
                Throwable th2 = this.f82047b;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            public String toString() {
                return "Closed(cause=" + this.f82047b + ')';
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ b f82048a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final C0987a f82049b = new C0987a(null);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final Object f82050c;

            static {
                Result.Companion companion = Result.f93230c;
                f82050c = Result.b(Unit.f93236a);
            }

            private b() {
            }

            public final C0987a a() {
                return f82049b;
            }

            public final Object b() {
                return f82050c;
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$c */
        public static final class c implements InterfaceC0986a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f82051b = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -231472095;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$d */
        public static final class d implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Continuation f82052b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Throwable f82053c;

            public d(Continuation continuation) {
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                this.f82052b = continuation;
                if (io.ktor.utils.io.d.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ReadTask 0x");
                    String string = Integer.toString(c().hashCode(), CharsKt.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    sb2.append(string);
                    Throwable th2 = new Throwable(sb2.toString());
                    lf.c.b(th2);
                    d(th2);
                }
            }

            @Override // io.ktor.utils.io.a.InterfaceC0986a.e
            public String a() {
                return "read";
            }

            @Override // io.ktor.utils.io.a.InterfaceC0986a.e
            public void b(Throwable th2) {
                e.C0988a.b(this, th2);
            }

            @Override // io.ktor.utils.io.a.InterfaceC0986a.e
            public Continuation c() {
                return this.f82052b;
            }

            public void d(Throwable th2) {
                this.f82053c = th2;
            }

            @Override // io.ktor.utils.io.a.InterfaceC0986a.e
            public Throwable getCreated() {
                return this.f82053c;
            }

            @Override // io.ktor.utils.io.a.InterfaceC0986a.e
            public void resume() {
                e.C0988a.a(this);
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$e */
        public interface e extends InterfaceC0986a {

            /* JADX INFO: renamed from: io.ktor.utils.io.a$a$e$a, reason: collision with other inner class name */
            public static final class C0988a {
                public static void a(e eVar) {
                    eVar.c().resumeWith(InterfaceC0986a.f82046a.b());
                }

                public static void b(e eVar, Throwable th2) {
                    Object objB;
                    Continuation continuationC = eVar.c();
                    if (th2 != null) {
                        Result.Companion companion = Result.f93230c;
                        objB = Result.b(kotlin.d.a(th2));
                    } else {
                        objB = InterfaceC0986a.f82046a.b();
                    }
                    continuationC.resumeWith(objB);
                }
            }

            String a();

            void b(Throwable th2);

            Continuation c();

            Throwable getCreated();

            void resume();
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$f */
        public static final class f implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Continuation f82054b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Throwable f82055c;

            public f(Continuation continuation) {
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                this.f82054b = continuation;
                if (io.ktor.utils.io.d.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WriteTask 0x");
                    String string = Integer.toString(c().hashCode(), CharsKt.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    sb2.append(string);
                    Throwable th2 = new Throwable(sb2.toString());
                    lf.c.b(th2);
                    d(th2);
                }
            }

            @Override // io.ktor.utils.io.a.InterfaceC0986a.e
            public String a() {
                return "write";
            }

            @Override // io.ktor.utils.io.a.InterfaceC0986a.e
            public void b(Throwable th2) {
                e.C0988a.b(this, th2);
            }

            @Override // io.ktor.utils.io.a.InterfaceC0986a.e
            public Continuation c() {
                return this.f82054b;
            }

            public void d(Throwable th2) {
                this.f82055c = th2;
            }

            @Override // io.ktor.utils.io.a.InterfaceC0986a.e
            public Throwable getCreated() {
                return this.f82055c;
            }

            @Override // io.ktor.utils.io.a.InterfaceC0986a.e
            public void resume() {
                e.C0988a.a(this);
            }
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f82056r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f82057s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f82058t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f82060v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82058t = obj;
            this.f82060v |= Integer.MIN_VALUE;
            return a.this.d(0, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82061r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f82062s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f82064u;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82062s = obj;
            this.f82064u |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f82065r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f82067t;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82065r = obj;
            this.f82067t |= Integer.MIN_VALUE;
            return a.this.e(this);
        }
    }

    /* synthetic */ class e extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f82068b = new e();

        e() {
            super(1, u.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke(Throwable th2) {
            return new u(th2);
        }
    }

    /* synthetic */ class f extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f82069b = new f();

        f() {
            super(1, v.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v invoke(Throwable th2) {
            return new v(th2);
        }
    }

    public a(boolean z10) {
        this.f82041b = z10;
        this.f82042c = new pg.a();
        this.f82043d = new Object();
        this.suspensionSlot = InterfaceC0986a.c.f82051b;
        this.f82044e = new pg.a();
        this.f82045f = new pg.a();
        this._closedCause = null;
    }

    private final void l(Throwable th2) {
        InterfaceC0986a interfaceC0986a = (InterfaceC0986a) f82039g.getAndSet(this, th2 != null ? new InterfaceC0986a.C0987a(th2) : InterfaceC0986a.f82046a.a());
        if (interfaceC0986a instanceof InterfaceC0986a.e) {
            ((InterfaceC0986a.e) interfaceC0986a).b(th2);
        }
    }

    private final void p() {
        synchronized (this.f82043d) {
            this.f82042c.Q(this.f82044e);
            this.flushBufferSize = 0;
            Unit unit = Unit.f93236a;
        }
        InterfaceC0986a interfaceC0986a = (InterfaceC0986a) this.suspensionSlot;
        if ((interfaceC0986a instanceof InterfaceC0986a.f) && androidx.concurrent.futures.a.a(f82039g, this, interfaceC0986a, InterfaceC0986a.c.f82051b)) {
            ((InterfaceC0986a.e) interfaceC0986a).resume();
        }
    }

    @Override // io.ktor.utils.io.e
    public void a(Throwable th2) {
        if (this._closedCause != null) {
            return;
        }
        r rVar = new r(th2);
        androidx.concurrent.futures.a.a(f82040h, this, null, rVar);
        l(r.c(rVar, null, 1, null));
    }

    @Override // io.ktor.utils.io.e
    public Throwable b() {
        r rVar = (r) this._closedCause;
        if (rVar != null) {
            return r.c(rVar, null, 1, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(int r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.d(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.a.d
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.a$d r0 = (io.ktor.utils.io.a.d) r0
            int r1 = r0.f82067t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82067t = r1
            goto L18
        L13:
            io.ktor.utils.io.a$d r0 = new io.ktor.utils.io.a$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f82065r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f82067t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.d.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.d.b(r5)
            kotlin.Result$Companion r5 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L29
            r0.f82067t = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r4.c(r0)     // Catch: java.lang.Throwable -> L29
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.Unit r5 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L29
            kotlin.Result.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L50
        L47:
            kotlin.Result$Companion r0 = kotlin.Result.f93230c
            java.lang.Object r5 = kotlin.d.a(r5)
            kotlin.Result.b(r5)
        L50:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.utils.io.a.f82040h
            io.ktor.utils.io.r r0 = io.ktor.utils.io.s.a()
            r1 = 0
            boolean r5 = androidx.concurrent.futures.a.a(r5, r4, r1, r0)
            if (r5 != 0) goto L60
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        L60:
            r4.l(r1)
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.utils.io.k
    public pg.r f() throws v {
        r rVar;
        if (o() && ((rVar = (r) this._closedCause) == null || rVar.a(f.f82069b) == null)) {
            throw new v(null, 1, null);
        }
        return this.f82045f;
    }

    @Override // io.ktor.utils.io.e
    public pg.s g() throws Throwable {
        r rVar = (r) this._closedCause;
        if (rVar != null) {
            rVar.a(e.f82068b);
        }
        if (this.f82044e.exhausted()) {
            p();
        }
        return this.f82044e;
    }

    @Override // io.ktor.utils.io.e
    public boolean h() {
        if (b() == null) {
            return o() && this.flushBufferSize == 0 && this.f82044e.exhausted();
        }
        return true;
    }

    public void k() {
        m();
        if (androidx.concurrent.futures.a.a(f82040h, this, null, s.a())) {
            l(null);
        }
    }

    public void m() {
        if (this.f82045f.exhausted()) {
            return;
        }
        synchronized (this.f82043d) {
            int iS = (int) this.f82045f.s();
            this.f82042c.f0(this.f82045f);
            this.flushBufferSize += iS;
            Unit unit = Unit.f93236a;
        }
        InterfaceC0986a interfaceC0986a = (InterfaceC0986a) this.suspensionSlot;
        if ((interfaceC0986a instanceof InterfaceC0986a.d) && androidx.concurrent.futures.a.a(f82039g, this, interfaceC0986a, InterfaceC0986a.c.f82051b)) {
            ((InterfaceC0986a.e) interfaceC0986a).resume();
        }
    }

    public final boolean n() {
        return this.f82041b;
    }

    public boolean o() {
        return this._closedCause != null;
    }

    public String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    public /* synthetic */ a(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
