package bc;

import android.net.Uri;
import eg.g;
import eg.m1;
import java.util.concurrent.CountDownLatch;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import pd.x;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ec.b f6194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f6195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f6197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CoroutineScope f6198g;

    public interface a {
        void a(d dVar, Uri uri);

        void b(d dVar);
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6199r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6201t;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6199r = obj;
            this.f6201t |= Integer.MIN_VALUE;
            Object objF = d.this.f(this);
            return objF == pf.b.g() ? objF : Result.a(objF);
        }
    }

    static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6202r;

        static final class a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6204r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ d f6205s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, Continuation continuation) {
                super(2, continuation);
                this.f6205s = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f6205s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF;
                Object objG = pf.b.g();
                int i10 = this.f6204r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    d dVar = this.f6205s;
                    this.f6204r = 1;
                    objF = dVar.f(this);
                    if (objF == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    objF = ((Result) obj).l();
                }
                if (Result.i(objF)) {
                    return null;
                }
                return objF;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new c(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        
            if (r1.h(r8, r7) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r8.g(r7) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r7.f6202r
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlin.d.b(r8)
                goto L5a
            L1e:
                kotlin.d.b(r8)
                goto L40
            L22:
                kotlin.d.b(r8)
                bc.d r8 = bc.d.this
                pd.x r8 = bc.d.a(r8)
                kotlinx.coroutines.CoroutineDispatcher r8 = r8.e()
                bc.d$c$a r1 = new bc.d$c$a
                bc.d r5 = bc.d.this
                r6 = 0
                r1.<init>(r5, r6)
                r7.f6202r = r4
                java.lang.Object r8 = eg.g.g(r8, r1, r7)
                if (r8 != r0) goto L40
                goto L59
            L40:
                android.net.Uri r8 = (android.net.Uri) r8
                if (r8 == 0) goto L4f
                bc.d r1 = bc.d.this
                r7.f6202r = r3
                java.lang.Object r8 = bc.d.e(r1, r8, r7)
                if (r8 != r0) goto L5a
                goto L59
            L4f:
                bc.d r8 = bc.d.this
                r7.f6202r = r2
                java.lang.Object r8 = bc.d.d(r8, r7)
                if (r8 != r0) goto L5a
            L59:
                return r0
            L5a:
                kotlin.Unit r8 = kotlin.Unit.f93236a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: bc.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: bc.d$d, reason: collision with other inner class name */
    static final class C0134d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f6206f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0134d(CountDownLatch countDownLatch) {
            super(1);
            this.f6206f = countDownLatch;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f93236a;
        }

        public final void invoke(Throwable th2) {
            this.f6206f.countDown();
        }
    }

    static final class e extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6207r;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f6207r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            d.this.f6195d.b(d.this);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class f extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6209r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Uri f6211t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f6211t = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new f(this.f6211t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f6209r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            d.this.f6195d.a(d.this, this.f6211t);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public d(Object assetsHolder, ec.b repository, a listener, String url, x dispatchers) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f6193b = assetsHolder;
        this.f6194c = repository;
        this.f6195d = listener;
        this.f6196e = url;
        this.f6197f = dispatchers;
        this.f6198g = i.a(m1.b(null, 1, null).plus(dispatchers.f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(Continuation continuation) {
        Object objG = g.g(this.f6197f.f(), new e(null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(Uri uri, Continuation continuation) {
        Object objG = g.g(this.f6197f.f(), new f(uri, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof bc.d.b
            if (r0 == 0) goto L13
            r0 = r7
            bc.d$b r0 = (bc.d.b) r0
            int r1 = r0.f6201t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6201t = r1
            goto L18
        L13:
            bc.d$b r0 = new bc.d$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6199r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6201t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.d.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.l()
            return r7
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.d.b(r7)
            java.lang.String r7 = r6.f6196e
            boolean r7 = io.bidmachine.core.h.I(r7)
            if (r7 != 0) goto L65
            kotlin.Result$Companion r7 = kotlin.Result.f93230c
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid http url: "
            r0.append(r1)
            java.lang.String r1 = r6.f6196e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            java.lang.Object r7 = kotlin.d.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
            return r7
        L65:
            ec.b r7 = r6.f6194c
            id.h1 r2 = new id.h1
            java.lang.String r4 = r6.f6196e
            id.q0$b r5 = id.q0.b.PRELOAD
            r2.<init>(r4, r5)
            java.lang.Object r4 = r6.f6193b
            r0.f6201t = r3
            java.lang.Object r7 = r7.e(r2, r4, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.d.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.lang.Runnable
    public void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        eg.i.d(this.f6198g, null, null, new c(null), 3, null).q(new C0134d(countDownLatch));
        try {
            countDownLatch.await();
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ d(Object obj, ec.b bVar, a aVar, String str, x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, bVar, aVar, str, (i10 & 16) != 0 ? x.f98252g.a() : xVar);
    }
}
