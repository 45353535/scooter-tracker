package ie;

import eg.s;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.z;
import oe.c0;
import oe.g0;
import oe.q;
import oe.t;
import oe.v0;
import oe.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements CoroutineScope, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f74688o = AtomicIntegerFieldUpdater.newUpdater(c.class, "closed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final le.b f74689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f74690c;

    @NotNull
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f74691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f74692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CoroutineContext f74693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final re.g f74694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final se.f f74695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final re.i f74696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final se.b f74697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ze.b f74698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final le.j f74699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ue.b f74700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i f74701n;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74702r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f74703s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74704t;

        a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, Object obj, Continuation continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f74703s = eVar;
            aVar.f74704t = obj;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        
            if (r3.e(r1, r8) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r8.f74702r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r9)
                goto L66
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                java.lang.Object r1 = r8.f74704t
                java.lang.Object r3 = r8.f74703s
                ef.e r3 = (ef.e) r3
                kotlin.d.b(r9)
                goto L50
            L24:
                kotlin.d.b(r9)
                java.lang.Object r9 = r8.f74703s
                ef.e r9 = (ef.e) r9
                java.lang.Object r1 = r8.f74704t
                boolean r4 = r1 instanceof je.b
                if (r4 == 0) goto L69
                ie.c r4 = ie.c.this
                se.b r4 = r4.q()
                kotlin.Unit r5 = kotlin.Unit.f93236a
                r6 = r1
                je.b r6 = (je.b) r6
                se.c r6 = r6.e()
                r8.f74703s = r9
                r8.f74704t = r1
                r8.f74702r = r3
                java.lang.Object r3 = r4.d(r5, r6, r8)
                if (r3 != r0) goto L4d
                goto L65
            L4d:
                r7 = r3
                r3 = r9
                r9 = r7
            L50:
                se.c r9 = (se.c) r9
                r4 = r1
                je.b r4 = (je.b) r4
                r4.k(r9)
                r9 = 0
                r8.f74703s = r9
                r8.f74704t = r9
                r8.f74702r = r2
                java.lang.Object r9 = r3.e(r1, r8)
                if (r9 != r0) goto L66
            L65:
                return r0
            L66:
                kotlin.Unit r9 = kotlin.Unit.f93236a
                return r9
            L69:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Error: HttpClientCall expected, but found "
                r9.append(r0)
                r9.append(r1)
                r0 = 40
                r9.append(r0)
                java.lang.Class r0 = r1.getClass()
                kotlin.reflect.KClass r0 = kotlin.jvm.internal.v0.b(r0)
                r9.append(r0)
                java.lang.String r0 = ")."
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ie.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74706r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f74707s;

        b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, se.d dVar, Continuation continuation) {
            b bVar = c.this.new b(continuation);
            bVar.f74707s = eVar;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ef.e eVar;
            Throwable th2;
            Object objG = pf.b.g();
            int i10 = this.f74706r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ef.e eVar2 = (ef.e) this.f74707s;
                try {
                    this.f74707s = eVar2;
                    this.f74706r = 1;
                    Object objD = eVar2.d(this);
                    if (objD == objG) {
                        return objG;
                    }
                    eVar = eVar2;
                    obj = objD;
                } catch (Throwable th3) {
                    eVar = eVar2;
                    th2 = th3;
                    c.this.o().a(te.a.d(), new te.e(((je.b) eVar.b()).e(), th2));
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (ef.e) this.f74707s;
                try {
                    kotlin.d.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    c.this.o().a(te.a.d(), new te.e(((je.b) eVar.b()).e(), th2));
                    throw th2;
                }
            }
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: ie.c$c, reason: collision with other inner class name */
    static final class C0922c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f74709r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f74711t;

        C0922c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f74709r = obj;
            this.f74711t |= Integer.MIN_VALUE;
            return c.this.f(null, this);
        }
    }

    public c(le.b engine, i userConfig) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.f74689b = engine;
        this.f74690c = userConfig;
        boolean z10 = false;
        this.closed = 0;
        s sVarA = z.a((Job) engine.getCoroutineContext().get(Job.N8));
        this.f74692e = sVarA;
        this.f74693f = engine.getCoroutineContext().plus(sVarA);
        int i10 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f74694g = new re.g(z10, i10, defaultConstructorMarker);
        se.f fVar = new se.f(z10, i10, defaultConstructorMarker);
        this.f74695h = fVar;
        re.i iVar = new re.i(z10, i10, defaultConstructorMarker);
        this.f74696i = iVar;
        this.f74697j = new se.b(z10, i10, defaultConstructorMarker);
        this.f74698k = ze.d.a(true);
        this.f74699l = engine.getConfig();
        this.f74700m = new ue.b();
        i iVar2 = new i();
        this.f74701n = iVar2;
        if (this.f74691d) {
            sVarA.q(new Function1() { // from class: ie.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.e(this.f74687b, (Throwable) obj);
                }
            });
        }
        engine.q0(this);
        iVar.l(re.i.f99454g.b(), new a(null));
        i.n(iVar2, g0.i(), null, 2, null);
        i.n(iVar2, oe.d.e(), null, 2, null);
        i.n(iVar2, q.k(), null, 2, null);
        if (userConfig.j()) {
            iVar2.l("DefaultTransformers", new Function1() { // from class: ie.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.d((c) obj);
                }
            });
        }
        i.n(iVar2, v0.f96923c, null, 2, null);
        i.n(iVar2, t.k(), null, 2, null);
        if (userConfig.i()) {
            i.n(iVar2, c0.f(), null, 2, null);
        }
        iVar2.s(userConfig);
        if (userConfig.j()) {
            i.n(iVar2, oe.z.i(), null, 2, null);
        }
        oe.j.d(iVar2);
        iVar2.k(this);
        fVar.l(se.f.f100026g.b(), new b(null));
    }

    public static Unit d(c install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        oe.k.b(install);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(c cVar, Throwable th2) {
        if (th2 != null) {
            kotlinx.coroutines.i.f(cVar.f74689b, null, 1, null);
        }
        return Unit.f93236a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        if (f74688o.compareAndSet(this, 0, 1)) {
            ze.b bVar = (ze.b) this.f74698k.b(w.a());
            for (ze.a aVar : bVar.c()) {
                Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objB = bVar.b(aVar);
                if (objB instanceof AutoCloseable) {
                    androidx.core.provider.c.a((AutoCloseable) objB);
                }
            }
            this.f74692e.complete();
            if (this.f74691d) {
                this.f74689b.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(re.d r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ie.c.C0922c
            if (r0 == 0) goto L13
            r0 = r6
            ie.c$c r0 = (ie.c.C0922c) r0
            int r1 = r0.f74711t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74711t = r1
            goto L18
        L13:
            ie.c$c r0 = new ie.c$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f74709r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f74711t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            ue.b r6 = r4.f74700m
            ue.a r2 = te.a.a()
            r6.a(r2, r5)
            re.g r6 = r4.f74694g
            java.lang.Object r2 = r5.d()
            r0.f74711t = r3
            java.lang.Object r6 = r6.d(r5, r2, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r5)
            je.b r6 = (je.b) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.c.f(re.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ze.b getAttributes() {
        return this.f74698k;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f74693f;
    }

    public final i n() {
        return this.f74701n;
    }

    public final ue.b o() {
        return this.f74700m;
    }

    public final se.b q() {
        return this.f74697j;
    }

    public final re.g s() {
        return this.f74694g;
    }

    public String toString() {
        return "HttpClient[" + this.f74689b + ']';
    }

    public final se.f w() {
        return this.f74695h;
    }

    public final re.i y() {
        return this.f74696i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(le.b engine, i userConfig, boolean z10) {
        this(engine, userConfig);
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.f74691d = z10;
    }
}
