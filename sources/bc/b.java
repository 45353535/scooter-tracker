package bc;

import android.content.Context;
import android.net.Uri;
import bc.d;
import e9.n;
import eg.m1;
import io.bidmachine.iab.vast.processor.VastAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
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
import pd.g0;
import pd.x;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ec.b f6170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f6171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f6173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CoroutineScope f6174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WeakReference f6175h;

    public interface a {
        void a(b bVar, Uri uri, c9.g gVar);

        void b(b bVar);
    }

    /* JADX INFO: renamed from: bc.b$b, reason: collision with other inner class name */
    static final class C0133b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6176r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6178t;

        C0133b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6176r = obj;
            this.f6178t |= Integer.MIN_VALUE;
            Object objI = b.this.i(this);
            return objI == pf.b.g() ? objI : Result.a(objI);
        }
    }

    static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6179r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f6180s;

        public static final class a implements d.a {
            a() {
            }

            @Override // bc.d.a
            public /* synthetic */ void a(bc.d dVar, Uri uri) {
                bc.c.a(this, dVar, uri);
            }

            @Override // bc.d.a
            public /* synthetic */ void b(bc.d dVar) {
                bc.c.b(this, dVar);
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF;
            Pair pair;
            Object objB;
            Object objG = pf.b.g();
            int i10 = this.f6180s;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Object objJ = b.this.j();
                Pair pair2 = (Pair) (Result.i(objJ) ? null : objJ);
                if (pair2 == null) {
                    Throwable thG = Result.g(objJ);
                    if (thG == null) {
                        thG = new Exception("Unknown error");
                    }
                    objB = Result.b(kotlin.d.a(thG));
                    return Result.a(objB);
                }
                bc.d dVar = new bc.d(b.this.f6169b, b.this.f6170c, new a(), (String) pair2.getFirst(), b.this.f6173f);
                this.f6179r = pair2;
                this.f6180s = 1;
                objF = dVar.f(this);
                if (objF == objG) {
                    return objG;
                }
                pair = pair2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pair = (Pair) this.f6179r;
                kotlin.d.b(obj);
                objF = ((Result) obj).l();
            }
            Uri uri = (Uri) (Result.i(objF) ? null : objF);
            if (uri != null) {
                objB = Result.b(new Pair(uri, pair.getSecond()));
            } else {
                Throwable thG2 = Result.g(objF);
                if (thG2 == null) {
                    thG2 = new Exception("Unknown error");
                }
                objB = Result.b(kotlin.d.a(thG2));
            }
            return Result.a(objB);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class d extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6182r;

        static final class a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6184r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f6185s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Continuation continuation) {
                super(2, continuation);
                this.f6185s = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f6185s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objI;
                Object objG = pf.b.g();
                int i10 = this.f6184r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    b bVar = this.f6185s;
                    this.f6184r = 1;
                    objI = bVar.i(this);
                    if (objI == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    objI = ((Result) obj).l();
                }
                if (Result.i(objI)) {
                    return null;
                }
                return objI;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new d(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            if (r1.l(r2, r8, r7) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            if (r8.k(r7) == r0) goto L22;
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
                int r1 = r7.f6182r
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
                goto L66
            L1e:
                kotlin.d.b(r8)
                goto L40
            L22:
                kotlin.d.b(r8)
                bc.b r8 = bc.b.this
                pd.x r8 = bc.b.b(r8)
                kotlinx.coroutines.CoroutineDispatcher r8 = r8.e()
                bc.b$d$a r1 = new bc.b$d$a
                bc.b r5 = bc.b.this
                r6 = 0
                r1.<init>(r5, r6)
                r7.f6182r = r4
                java.lang.Object r8 = eg.g.g(r8, r1, r7)
                if (r8 != r0) goto L40
                goto L65
            L40:
                kotlin.Pair r8 = (kotlin.Pair) r8
                if (r8 == 0) goto L5b
                bc.b r1 = bc.b.this
                java.lang.Object r2 = r8.getFirst()
                android.net.Uri r2 = (android.net.Uri) r2
                java.lang.Object r8 = r8.getSecond()
                c9.g r8 = (c9.g) r8
                r7.f6182r = r3
                java.lang.Object r8 = bc.b.h(r1, r2, r8, r7)
                if (r8 != r0) goto L66
                goto L65
            L5b:
                bc.b r8 = bc.b.this
                r7.f6182r = r2
                java.lang.Object r8 = bc.b.g(r8, r7)
                if (r8 != r0) goto L66
            L65:
                return r0
            L66:
                kotlin.Unit r8 = kotlin.Unit.f93236a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: bc.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f6186f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CountDownLatch countDownLatch) {
            super(1);
            this.f6186f = countDownLatch;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f93236a;
        }

        public final void invoke(Throwable th2) {
            this.f6186f.countDown();
        }
    }

    static final class f extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6187r;

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f6187r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            b.this.f6171d.b(b.this);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class g extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6189r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Uri f6191t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ c9.g f6192u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Uri uri, c9.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f6191t = uri;
            this.f6192u = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new g(this.f6191t, this.f6192u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f6189r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            b.this.f6171d.a(b.this, this.f6191t, this.f6192u);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public b(Context context, Object assetsHolder, ec.b repository, a listener, String videoTag, x dispatchers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(videoTag, "videoTag");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f6169b = assetsHolder;
        this.f6170c = repository;
        this.f6171d = listener;
        this.f6172e = videoTag;
        this.f6173f = dispatchers;
        this.f6174g = i.a(m1.b(null, 1, null).plus(dispatchers.f()));
        this.f6175h = new WeakReference(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j() {
        n nVarQ;
        Context context = (Context) this.f6175h.get();
        if (context == null) {
            Result.Companion companion = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("Context is detached")));
        }
        try {
            c9.g gVarA = c9.g.V().d(y8.a.Stream).a();
            Intrinsics.checkNotNullExpressionValue(gVarA, "newBuilder()\n           …\n                .build()");
            String strO = null;
            gVarA.U(context, this.f6172e, null);
            VastAd vastAdM = gVarA.M();
            if (vastAdM != null && (nVarQ = vastAdM.q()) != null) {
                strO = nVarQ.O();
            }
            String strZ = g0.z(strO);
            if (strZ != null) {
                Result.Companion companion2 = Result.f93230c;
                return Result.b(new Pair(strZ, gVarA));
            }
            Result.Companion companion3 = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("Vast video url is empty")));
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
            Result.Companion companion4 = Result.f93230c;
            return Result.b(kotlin.d.a(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(Continuation continuation) {
        Object objG = eg.g.g(this.f6173f.f(), new f(null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(Uri uri, c9.g gVar, Continuation continuation) {
        Object objG = eg.g.g(this.f6173f.f(), new g(uri, gVar, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bc.b.C0133b
            if (r0 == 0) goto L13
            r0 = r6
            bc.b$b r0 = (bc.b.C0133b) r0
            int r1 = r0.f6178t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6178t = r1
            goto L18
        L13:
            bc.b$b r0 = new bc.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6176r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6178t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.d.b(r6)
            pd.x r6 = r5.f6173f
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.e()
            bc.b$c r2 = new bc.b$c
            r4 = 0
            r2.<init>(r4)
            r0.f6178t = r3
            java.lang.Object r6 = eg.g.g(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.b.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.lang.Runnable
    public void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        eg.i.d(this.f6174g, null, null, new d(null), 3, null).q(new e(countDownLatch));
        try {
            countDownLatch.await();
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ b(Context context, Object obj, ec.b bVar, a aVar, String str, x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, bVar, aVar, str, (i10 & 32) != 0 ? x.f98252g.a() : xVar);
    }
}
