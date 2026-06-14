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
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ec.b f6151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0131a f6152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f6154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CoroutineScope f6155g;

    /* JADX INFO: renamed from: bc.a$a, reason: collision with other inner class name */
    public interface InterfaceC0131a {
        void a(a aVar, Uri uri);

        void b(a aVar);
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6156r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6158t;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6156r = obj;
            this.f6158t |= Integer.MIN_VALUE;
            Object objF = a.this.f(this);
            return objF == pf.b.g() ? objF : Result.a(objF);
        }
    }

    static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6159r;

        /* JADX INFO: renamed from: bc.a$c$a, reason: collision with other inner class name */
        static final class C0132a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6161r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ a f6162s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0132a(a aVar, Continuation continuation) {
                super(2, continuation);
                this.f6162s = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0132a(this.f6162s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF;
                Object objG = pf.b.g();
                int i10 = this.f6161r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    a aVar = this.f6162s;
                    this.f6161r = 1;
                    objF = aVar.f(this);
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
                return ((C0132a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new c(continuation);
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
                int r1 = r7.f6159r
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
                bc.a r8 = bc.a.this
                pd.x r8 = bc.a.a(r8)
                kotlinx.coroutines.CoroutineDispatcher r8 = r8.e()
                bc.a$c$a r1 = new bc.a$c$a
                bc.a r5 = bc.a.this
                r6 = 0
                r1.<init>(r5, r6)
                r7.f6159r = r4
                java.lang.Object r8 = eg.g.g(r8, r1, r7)
                if (r8 != r0) goto L40
                goto L59
            L40:
                android.net.Uri r8 = (android.net.Uri) r8
                if (r8 == 0) goto L4f
                bc.a r1 = bc.a.this
                r7.f6159r = r3
                java.lang.Object r8 = bc.a.e(r1, r8, r7)
                if (r8 != r0) goto L5a
                goto L59
            L4f:
                bc.a r8 = bc.a.this
                r7.f6159r = r2
                java.lang.Object r8 = bc.a.d(r8, r7)
                if (r8 != r0) goto L5a
            L59:
                return r0
            L5a:
                kotlin.Unit r8 = kotlin.Unit.f93236a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: bc.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f6163f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CountDownLatch countDownLatch) {
            super(1);
            this.f6163f = countDownLatch;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f93236a;
        }

        public final void invoke(Throwable th2) {
            this.f6163f.countDown();
        }
    }

    static final class e extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6164r;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f6164r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            a.this.f6152d.b(a.this);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class f extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6166r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Uri f6168t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f6168t = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new f(this.f6168t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f6166r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            a.this.f6152d.a(a.this, this.f6168t);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public a(Object assetsHolder, ec.b repository, InterfaceC0131a listener, String url, x dispatchers) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f6150b = assetsHolder;
        this.f6151c = repository;
        this.f6152d = listener;
        this.f6153e = url;
        this.f6154f = dispatchers;
        this.f6155g = i.a(m1.b(null, 1, null).plus(dispatchers.f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(Continuation continuation) {
        Object objG = g.g(this.f6154f.f(), new e(null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(Uri uri, Continuation continuation) {
        Object objG = g.g(this.f6154f.f(), new f(uri, null), continuation);
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
            boolean r0 = r7 instanceof bc.a.b
            if (r0 == 0) goto L13
            r0 = r7
            bc.a$b r0 = (bc.a.b) r0
            int r1 = r0.f6158t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6158t = r1
            goto L18
        L13:
            bc.a$b r0 = new bc.a$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6156r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6158t
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
            java.lang.String r7 = r6.f6153e
            boolean r7 = io.bidmachine.core.h.I(r7)
            if (r7 != 0) goto L65
            kotlin.Result$Companion r7 = kotlin.Result.f93230c
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid http url: "
            r0.append(r1)
            java.lang.String r1 = r6.f6153e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            java.lang.Object r7 = kotlin.d.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
            return r7
        L65:
            ec.b r7 = r6.f6151c
            id.h1 r2 = new id.h1
            java.lang.String r4 = r6.f6153e
            id.q0$b r5 = id.q0.b.PRELOAD
            r2.<init>(r4, r5)
            java.lang.Object r4 = r6.f6150b
            r0.f6158t = r3
            java.lang.Object r7 = r7.d(r2, r4, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.a.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.lang.Runnable
    public void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        eg.i.d(this.f6155g, null, null, new c(null), 3, null).q(new d(countDownLatch));
        try {
            countDownLatch.await();
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ a(Object obj, ec.b bVar, InterfaceC0131a interfaceC0131a, String str, x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, bVar, interfaceC0131a, str, (i10 & 16) != 0 ? x.f98252g.a() : xVar);
    }
}
