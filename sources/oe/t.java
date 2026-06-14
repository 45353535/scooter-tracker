package oe;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import oe.t;
import pe.m;
import re.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yh.d f96884a = df.a.a("io.ktor.client.plugins.HttpCallValidator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final pe.b f96885b = pe.i.b("HttpResponseValidator", a.f96887b, new Function1() { // from class: oe.s
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return t.b((pe.d) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ze.a f96886c;

    /* synthetic */ class a extends kotlin.jvm.internal.y implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f96887b = new a();

        a() {
            super(0, r.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            return new r();
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96891r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f96892s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96893t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ List f96894u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, Continuation continuation) {
            super(3, continuation);
            this.f96894u = list;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m.a aVar, re.d dVar, Continuation continuation) {
            c cVar = new c(this.f96894u, continuation);
            cVar.f96892s = aVar;
            cVar.f96893t = dVar;
            return cVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96891r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                m.a aVar = (m.a) this.f96892s;
                re.d dVar = (re.d) this.f96893t;
                this.f96892s = null;
                this.f96891r = 1;
                obj = aVar.a(dVar, this);
                if (obj != objG) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                je.b bVar = (je.b) this.f96892s;
                kotlin.d.b(obj);
                return bVar;
            }
            kotlin.d.b(obj);
            je.b bVar2 = (je.b) obj;
            List list = this.f96894u;
            se.c cVarE = bVar2.e();
            this.f96892s = bVar2;
            this.f96891r = 2;
            return t.d(list, cVarE, this) == objG ? objG : bVar2;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96895r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f96896s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96897t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ List f96898u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, Continuation continuation) {
            super(3, continuation);
            this.f96898u = list;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(re.b bVar, Throwable th2, Continuation continuation) {
            d dVar = new d(this.f96898u, continuation);
            dVar.f96896s = bVar;
            dVar.f96897t = th2;
            return dVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96895r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.f96896s;
                kotlin.d.b(obj);
                return th2;
            }
            kotlin.d.b(obj);
            re.b bVar = (re.b) this.f96896s;
            Throwable thA = te.c.a((Throwable) this.f96897t);
            List list = this.f96898u;
            this.f96896s = thA;
            this.f96895r = 1;
            return t.c(list, thA, bVar, this) == objG ? objG : thA;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96899r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f96900s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96901t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ List f96902u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, Continuation continuation) {
            super(3, continuation);
            this.f96902u = list;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(re.b bVar, Throwable th2, Continuation continuation) {
            e eVar = new e(this.f96902u, continuation);
            eVar.f96900s = bVar;
            eVar.f96901t = th2;
            return eVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96899r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.f96900s;
                kotlin.d.b(obj);
                return th2;
            }
            kotlin.d.b(obj);
            re.b bVar = (re.b) this.f96900s;
            Throwable thA = te.c.a((Throwable) this.f96901t);
            List list = this.f96902u;
            this.f96900s = thA;
            this.f96899r = 1;
            return t.c(list, thA, bVar, this) == objG ? objG : thA;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f96903r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f96904s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f96905t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f96906u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f96907v;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f96906u = obj;
            this.f96907v |= Integer.MIN_VALUE;
            return t.c(null, null, null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f96908r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f96909s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96910t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f96911u;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f96910t = obj;
            this.f96911u |= Integer.MIN_VALUE;
            return t.d(null, null, this);
        }
    }

    public static final class h implements re.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ve.z f96912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ve.f1 f96913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ze.b f96914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ve.o f96915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ re.d f96916f;

        h(re.d dVar) {
            this.f96916f = dVar;
            this.f96912b = dVar.h();
            this.f96913c = dVar.i().b();
            this.f96914d = dVar.c();
            this.f96915e = dVar.getHeaders().p();
        }

        @Override // re.b
        public ze.b getAttributes() {
            return this.f96914d;
        }

        @Override // re.b, kotlinx.coroutines.CoroutineScope
        public CoroutineContext getCoroutineContext() {
            return b.a.a(this);
        }

        @Override // ve.w
        public ve.o getHeaders() {
            return this.f96915e;
        }

        @Override // re.b
        public ve.z getMethod() {
            return this.f96912b;
        }

        @Override // re.b
        public ve.f1 getUrl() {
            return this.f96913c;
        }

        @Override // re.b
        public je.b p() {
            throw new IllegalStateException("Call is not initialized");
        }
    }

    static {
        KType kTypeO;
        KClass kClassB = kotlin.jvm.internal.v0.b(Boolean.class);
        try {
            kTypeO = kotlin.jvm.internal.v0.o(Boolean.TYPE);
        } catch (Throwable unused) {
            kTypeO = null;
        }
        f96886c = new ze.a("ExpectSuccessAttributeKey", new ff.a(kClassB, kTypeO));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(pe.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        List listReversed = CollectionsKt.reversed(((r) createClientPlugin.e()).c());
        List listReversed2 = CollectionsKt.reversed(((r) createClientPlugin.e()).b());
        createClientPlugin.f(pe.n.f98295a, new b(((r) createClientPlugin.e()).a(), null));
        createClientPlugin.f(pe.m.f98287a, new c(listReversed, null));
        createClientPlugin.f(e1.f96756a, new d(listReversed2, null));
        createClientPlugin.f(b1.f96716a, new e(listReversed2, null));
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(java.util.List r4, java.lang.Throwable r5, re.b r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof oe.t.f
            if (r0 == 0) goto L13
            r0 = r7
            oe.t$f r0 = (oe.t.f) r0
            int r1 = r0.f96907v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96907v = r1
            goto L18
        L13:
            oe.t$f r0 = new oe.t$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f96906u
            pf.b.g()
            int r1 = r0.f96907v
            if (r1 == 0) goto L3f
            r4 = 1
            if (r1 == r4) goto L27
            r4 = 2
            if (r1 != r4) goto L37
        L27:
            java.lang.Object r4 = r0.f96905t
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.f96904s
            re.b r5 = (re.b) r5
            java.lang.Object r5 = r0.f96903r
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlin.d.b(r7)
            goto L6a
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.d.b(r7)
            yh.d r7 = oe.t.f96884a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Processing exception "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " for request "
            r0.append(r5)
            ve.f1 r5 = r6.getUrl()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.i(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L6a:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L73
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        L73:
            java.lang.Object r4 = r4.next()
            androidx.privacysandbox.ads.adservices.topics.a.a(r4)
            lf.m r4 = new lf.m
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.t.c(java.util.List, java.lang.Throwable, re.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(java.util.List r5, se.c r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof oe.t.g
            if (r0 == 0) goto L13
            r0 = r7
            oe.t$g r0 = (oe.t.g) r0
            int r1 = r0.f96911u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96911u = r1
            goto L18
        L13:
            oe.t$g r0 = new oe.t$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f96910t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f96911u
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f96909s
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f96908r
            se.c r6 = (se.c) r6
            kotlin.d.b(r7)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.d.b(r7)
            yh.d r7 = oe.t.f96884a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Validating response for request "
            r2.append(r4)
            je.b r4 = r6.p()
            re.b r4 = r4.d()
            ve.f1 r4 = r4.getUrl()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r7.i(r2)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L64:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r5.next()
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r0.f96908r = r6
            r0.f96909s = r5
            r0.f96911u = r3
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L64
            return r1
        L7d:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.t.d(java.util.List, se.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final re.b e(re.d dVar) {
        return new h(dVar);
    }

    public static final void f(ie.i iVar, Function1 block) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        iVar.m(f96885b, block);
    }

    public static final ze.a j() {
        return f96886c;
    }

    public static final pe.b k() {
        return f96885b;
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96888r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f96889s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f96890t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f96890t = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f96890t, continuation);
            bVar.f96889s = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(re.d dVar, Continuation continuation) {
            return ((b) create(dVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f96888r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ze.b bVarC = ((re.d) this.f96889s).c();
            ze.a aVarJ = t.j();
            final boolean z10 = this.f96890t;
            bVarC.d(aVarJ, new Function0() { // from class: oe.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(t.b.j(z10));
                }
            });
            return Unit.f93236a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(boolean z10) {
            return z10;
        }
    }
}
