package cd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import ec.b;
import id.a0;
import id.h1;
import id.q0;
import java.io.File;
import java.util.List;
import jd.c;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import pd.f0;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ec.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f6691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineScope f6692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ic.j f6693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f6694d;

    /* JADX INFO: renamed from: cd.a$a, reason: collision with other inner class name */
    static final class C0150a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6695r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f6697t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0150a(Object obj, Continuation continuation) {
            super(2, continuation);
            this.f6697t = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0150a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new C0150a(this.f6697t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f6695r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            qd.a aVarW = a.this.w();
            if (aVarW != null) {
                aVarW.J(this.f6697t);
            }
            return Unit.f93236a;
        }
    }

    public static abstract class b implements c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.a f6698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CoroutineScope f6699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ic.j f6700c;

        /* JADX INFO: renamed from: cd.a$b$a, reason: collision with other inner class name */
        static final class C0151a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6701r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ a0 f6703t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0151a(a0 a0Var, Continuation continuation) {
                super(2, continuation);
                this.f6703t = a0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0151a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return b.this.new C0151a(this.f6703t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f6701r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                b.this.f6698a.onError(this.f6703t);
                return Unit.f93236a;
            }
        }

        /* JADX INFO: renamed from: cd.a$b$b, reason: collision with other inner class name */
        static final class C0152b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6704r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Object f6706t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0152b(Object obj, Continuation continuation) {
                super(2, continuation);
                this.f6706t = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0152b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return b.this.new C0152b(this.f6706t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f6704r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                b.this.f6698a.onSuccess(this.f6706t);
                return Unit.f93236a;
            }
        }

        public b(b.a resultCallback, CoroutineScope coroutineScope, ic.j coroutineDispatchers) {
            Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
            this.f6698a = resultCallback;
            this.f6699b = coroutineScope;
            this.f6700c = coroutineDispatchers;
        }

        public abstract a0 b();

        @Override // jd.c.d
        public void onError(a0 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            eg.i.d(this.f6699b, this.f6700c.h(), null, new C0151a(error, null), 2, null);
        }

        @Override // jd.c.d
        public void onSuccess(Object obj) {
            if (obj != null) {
                eg.i.d(this.f6699b, this.f6700c.h(), null, new C0152b(obj, null), 2, null);
            } else {
                onError(b());
            }
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6707a;

        static {
            int[] iArr = new int[q0.b.values().length];
            try {
                iArr[q0.b.PRELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.b.STREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6707a = iArr;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6708r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ b.a f6709s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ a0 f6710t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b.a aVar, a0 a0Var, Continuation continuation) {
            super(2, continuation);
            this.f6709s = aVar;
            this.f6710t = a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f6709s, this.f6710t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f6708r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.f6709s.onError(this.f6710t);
            return Unit.f93236a;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6711r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ b.a f6712s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f6713t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b.a aVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f6712s = aVar;
            this.f6713t = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f6712s, this.f6713t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f6711r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.f6712s.onSuccess(this.f6713t);
            return Unit.f93236a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6714r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ q0 f6716t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f6717u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ b.a f6718v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(q0 q0Var, Object obj, b.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f6716t = q0Var;
            this.f6717u = obj;
            this.f6718v = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new f(this.f6716t, this.f6717u, this.f6718v, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        
            if (r7.m(r2, r1, r6) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        
            if (r1.l(r3, r7, r6) == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r6.f6714r
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.d.b(r7)
                goto L73
            L1e:
                kotlin.d.b(r7)
                kotlin.Result r7 = (kotlin.Result) r7
                java.lang.Object r7 = r7.l()
                goto L3a
            L28:
                kotlin.d.b(r7)
                cd.a r7 = cd.a.this
                id.q0 r1 = r6.f6716t
                java.lang.Object r5 = r6.f6717u
                r6.f6714r = r4
                java.lang.Object r7 = r7.z(r1, r5, r6)
                if (r7 != r0) goto L3a
                goto L72
            L3a:
                boolean r1 = kotlin.Result.i(r7)
                if (r1 == 0) goto L42
                r1 = 0
                goto L43
            L42:
                r1 = r7
            L43:
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                if (r1 == 0) goto L54
                cd.a r7 = cd.a.this
                ec.b$a r2 = r6.f6718v
                r6.f6714r = r3
                java.lang.Object r7 = cd.a.k(r7, r2, r1, r6)
                if (r7 != r0) goto L73
                goto L72
            L54:
                cd.a r1 = cd.a.this
                ec.b$a r3 = r6.f6718v
                id.a0$a r4 = id.a0.f74366b
                java.lang.Throwable r7 = kotlin.Result.g(r7)
                if (r7 != 0) goto L66
                cd.a r7 = cd.a.this
                java.lang.Exception r7 = cd.a.i(r7)
            L66:
                id.a0 r7 = r4.a(r7)
                r6.f6714r = r2
                java.lang.Object r7 = cd.a.j(r1, r3, r7, r6)
                if (r7 != r0) goto L73
            L72:
                return r0
            L73:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: cd.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6719r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6721t;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6719r = obj;
            this.f6721t |= Integer.MIN_VALUE;
            Object objZ = a.this.z(null, null, this);
            return objZ == pf.b.g() ? objZ : Result.a(objZ);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6722r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ q0 f6723s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ a f6724t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f6725u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(q0 q0Var, a aVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f6723s = q0Var;
            this.f6724t = aVar;
            this.f6725u = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f6723s, this.f6724t, this.f6725u, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r6 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            if (r6 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f6722r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.d.b(r6)
                kotlin.Result r6 = (kotlin.Result) r6
                java.lang.Object r6 = r6.l()
                goto L51
            L21:
                kotlin.d.b(r6)
                android.graphics.BitmapFactory$Options r6 = pd.i.a()
                r1 = 0
                r6.inJustDecodeBounds = r1
                id.q0 r1 = r5.f6723s
                boolean r4 = r1 instanceof id.h1
                if (r4 == 0) goto L40
                cd.a r2 = r5.f6724t
                id.h1 r1 = (id.h1) r1
                java.lang.Object r4 = r5.f6725u
                r5.f6722r = r3
                java.lang.Object r6 = r2.p(r1, r4, r6, r5)
                if (r6 != r0) goto L51
                goto L50
            L40:
                boolean r3 = r1 instanceof id.m
                if (r3 == 0) goto L56
                cd.a r3 = r5.f6724t
                id.m r1 = (id.m) r1
                r5.f6722r = r2
                java.lang.Object r6 = r3.n(r1, r6, r5)
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                kotlin.Result r6 = kotlin.Result.a(r6)
                return r6
            L56:
                lf.m r6 = new lf.m
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: cd.a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6726r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6728t;

        i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6726r = obj;
            this.f6728t |= Integer.MIN_VALUE;
            Object objR = a.this.r(null, this);
            return objR == pf.b.g() ? objR : Result.a(objR);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6729r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ h1 f6731t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(h1 h1Var, Continuation continuation) {
            super(2, continuation);
            this.f6731t = h1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new j(this.f6731t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objU;
            Object objG = pf.b.g();
            int i10 = this.f6729r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                qd.a aVarW = a.this.w();
                if (aVarW == null) {
                    Result.Companion companion = Result.f93230c;
                    objU = Result.b(kotlin.d.a(new IllegalStateException("`MediaFileCacheManager` not found, check initialization")));
                } else {
                    List listB = this.f6731t.b();
                    this.f6729r = 1;
                    objU = aVarW.u(listB, this);
                    if (objU == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objU = ((Result) obj).l();
            }
            return Result.a(objU);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6732r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6734t;

        k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6732r = obj;
            this.f6734t |= Integer.MIN_VALUE;
            Object objN = a.this.n(null, null, this);
            return objN == pf.b.g() ? objN : Result.a(objN);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6735r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ id.m f6737t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f6738u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(id.m mVar, BitmapFactory.Options options, Continuation continuation) {
            super(2, continuation);
            this.f6737t = mVar;
            this.f6738u = options;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new l(this.f6737t, this.f6738u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            pf.b.g();
            if (this.f6735r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            Bitmap bitmapG = a.this.g(this.f6737t.b(), this.f6738u);
            if (bitmapG != null) {
                objB = Result.b(bitmapG);
            } else {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(kotlin.d.a(new Exception("Can't decode image from base64")));
            }
            return Result.a(objB);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6739r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6741t;

        m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6739r = obj;
            this.f6741t |= Integer.MIN_VALUE;
            Object objP = a.this.p(null, null, null, this);
            return objP == pf.b.g() ? objP : Result.a(objP);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6742r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f6743s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6744t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ h1 f6746v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Object f6747w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f6748x;

        /* JADX INFO: renamed from: cd.a$n$a, reason: collision with other inner class name */
        static final class C0153a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6749r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ File f6750s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ BitmapFactory.Options f6751t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0153a(File file, BitmapFactory.Options options, Continuation continuation) {
                super(2, continuation);
                this.f6750s = file;
                this.f6751t = options;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0153a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0153a(this.f6750s, this.f6751t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f6749r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                File file = this.f6750s;
                if (file != null) {
                    return pd.j.f(file, this.f6751t);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(h1 h1Var, Object obj, BitmapFactory.Options options, Continuation continuation) {
            super(2, continuation);
            this.f6746v = h1Var;
            this.f6747w = obj;
            this.f6748x = options;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new n(this.f6746v, this.f6747w, this.f6748x, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r7.f6744t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r7.f6743s
                java.io.File r0 = (java.io.File) r0
                java.lang.Object r1 = r7.f6742r
                kotlin.d.b(r8)
                goto L67
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                kotlin.d.b(r8)
                kotlin.Result r8 = (kotlin.Result) r8
                java.lang.Object r8 = r8.l()
            L29:
                r1 = r8
                goto L3b
            L2b:
                kotlin.d.b(r8)
                cd.a r8 = cd.a.this
                id.h1 r1 = r7.f6746v
                r7.f6744t = r3
                java.lang.Object r8 = r8.r(r1, r7)
                if (r8 != r0) goto L29
                goto L64
            L3b:
                boolean r8 = kotlin.Result.i(r1)
                r3 = 0
                if (r8 == 0) goto L44
                r8 = r3
                goto L45
            L44:
                r8 = r1
            L45:
                java.io.File r8 = (java.io.File) r8
                cd.a r4 = cd.a.this
                ic.j r4 = cd.a.v(r4)
                kotlinx.coroutines.CoroutineDispatcher r4 = r4.d()
                cd.a$n$a r5 = new cd.a$n$a
                android.graphics.BitmapFactory$Options r6 = r7.f6748x
                r5.<init>(r8, r6, r3)
                r7.f6742r = r1
                r7.f6743s = r8
                r7.f6744t = r2
                java.lang.Object r2 = eg.g.g(r4, r5, r7)
                if (r2 != r0) goto L65
            L64:
                return r0
            L65:
                r0 = r8
                r8 = r2
            L67:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                if (r0 == 0) goto L7f
                if (r8 == 0) goto L7f
                cd.a r1 = cd.a.this
                qd.a r1 = cd.a.x(r1)
                if (r1 == 0) goto L7a
                java.lang.Object r2 = r7.f6747w
                r1.B(r0, r2)
            L7a:
                java.lang.Object r8 = kotlin.Result.b(r8)
                goto L93
            L7f:
                java.lang.Throwable r8 = kotlin.Result.g(r1)
                if (r8 != 0) goto L8b
                cd.a r8 = cd.a.this
                java.lang.Exception r8 = cd.a.i(r8)
            L8b:
                java.lang.Object r8 = kotlin.d.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            L93:
                kotlin.Result r8 = kotlin.Result.a(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: cd.a.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6752r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6754t;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6752r = obj;
            this.f6754t |= Integer.MIN_VALUE;
            Object objD = a.this.d(null, null, this);
            return objD == pf.b.g() ? objD : Result.a(objD);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6755r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ h1 f6757t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f6758u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(h1 h1Var, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f6757t = h1Var;
            this.f6758u = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new p(this.f6757t, this.f6758u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objR;
            Object objB;
            Object objG = pf.b.g();
            int i10 = this.f6755r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                a aVar = a.this;
                h1 h1Var = this.f6757t;
                this.f6755r = 1;
                objR = aVar.r(h1Var, this);
                if (objR == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objR = ((Result) obj).l();
            }
            File file = (File) (Result.i(objR) ? null : objR);
            if (file != null) {
                qd.a aVarW = a.this.w();
                if (aVarW != null) {
                    aVarW.B(file, this.f6758u);
                }
                objB = Result.b(td.b.k(file));
            } else {
                Throwable thG = Result.g(objR);
                if (thG == null) {
                    thG = a.this.h();
                }
                objB = Result.b(kotlin.d.a(thG));
            }
            return Result.a(objB);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6759r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ q0 f6761t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ b.a f6762u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(q0 q0Var, b.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f6761t = q0Var;
            this.f6762u = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new q(this.f6761t, this.f6762u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f6759r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                a aVar = a.this;
                q0 q0Var = this.f6761t;
                b.a aVar2 = this.f6762u;
                this.f6759r = 1;
                if (aVar.o(q0Var, aVar2, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6763r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ q0 f6764s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ a f6765t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ b.a f6766u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(q0 q0Var, a aVar, b.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f6764s = q0Var;
            this.f6765t = aVar;
            this.f6766u = aVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new r(this.f6764s, this.f6765t, this.f6766u, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
        
            if (r1.m(r3, r6, r5) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
        
            if (r6.l(r1, r2, r5) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f6763r
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1b
                if (r1 == r2) goto L17
                if (r1 != r3) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.d.b(r6)
                goto L77
            L1b:
                kotlin.d.b(r6)
                id.q0 r6 = r5.f6764s
                boolean r1 = r6 instanceof id.h1
                if (r1 == 0) goto L44
                cd.a r0 = r5.f6765t
                id.h1 r6 = (id.h1) r6
                java.util.List r6 = r6.b()
                java.lang.Object r6 = kotlin.collections.CollectionsKt.first(r6)
                java.lang.String r6 = (java.lang.String) r6
                jd.c$h r1 = new jd.c$h
                r1.<init>()
                ec.b$a r2 = r5.f6766u
                id.a0 r3 = new id.a0
                java.lang.String r4 = "Uri is null"
                r3.<init>(r4)
                r0.u(r6, r1, r2, r3)
                goto L77
            L44:
                boolean r1 = r6 instanceof id.m
                if (r1 == 0) goto L77
                id.m r6 = (id.m) r6
                java.lang.String r6 = r6.b()
                r1 = 0
                r4 = 0
                java.lang.String r6 = pd.f0.f(r6, r1, r3, r4)
                if (r6 == 0) goto L63
                cd.a r1 = r5.f6765t
                ec.b$a r3 = r5.f6766u
                r5.f6763r = r2
                java.lang.Object r6 = cd.a.k(r1, r3, r6, r5)
                if (r6 != r0) goto L77
                goto L76
            L63:
                cd.a r6 = r5.f6765t
                ec.b$a r1 = r5.f6766u
                id.a0 r2 = new id.a0
                java.lang.String r4 = "Can't decode string from base64"
                r2.<init>(r4)
                r5.f6763r = r3
                java.lang.Object r6 = cd.a.j(r6, r1, r2, r5)
                if (r6 != r0) goto L77
            L76:
                return r0
            L77:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: cd.a.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6767r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ q0 f6769t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f6770u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ b.a f6771v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(q0 q0Var, Object obj, b.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f6769t = q0Var;
            this.f6770u = obj;
            this.f6771v = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new s(this.f6769t, this.f6770u, this.f6771v, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        
            if (r7.m(r2, r1, r6) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        
            if (r1.l(r3, r7, r6) == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r6.f6767r
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.d.b(r7)
                goto L73
            L1e:
                kotlin.d.b(r7)
                kotlin.Result r7 = (kotlin.Result) r7
                java.lang.Object r7 = r7.l()
                goto L3a
            L28:
                kotlin.d.b(r7)
                cd.a r7 = cd.a.this
                id.q0 r1 = r6.f6769t
                java.lang.Object r5 = r6.f6770u
                r6.f6767r = r4
                java.lang.Object r7 = r7.e(r1, r5, r6)
                if (r7 != r0) goto L3a
                goto L72
            L3a:
                boolean r1 = kotlin.Result.i(r7)
                if (r1 == 0) goto L42
                r1 = 0
                goto L43
            L42:
                r1 = r7
            L43:
                android.net.Uri r1 = (android.net.Uri) r1
                if (r1 == 0) goto L54
                cd.a r7 = cd.a.this
                ec.b$a r2 = r6.f6771v
                r6.f6767r = r3
                java.lang.Object r7 = cd.a.k(r7, r2, r1, r6)
                if (r7 != r0) goto L73
                goto L72
            L54:
                cd.a r1 = cd.a.this
                ec.b$a r3 = r6.f6771v
                id.a0$a r4 = id.a0.f74366b
                java.lang.Throwable r7 = kotlin.Result.g(r7)
                if (r7 != 0) goto L66
                cd.a r7 = cd.a.this
                java.lang.Exception r7 = cd.a.i(r7)
            L66:
                id.a0 r7 = r4.a(r7)
                r6.f6767r = r2
                java.lang.Object r7 = cd.a.j(r1, r3, r7, r6)
                if (r7 != r0) goto L73
            L72:
                return r0
            L73:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: cd.a.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6772r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6774t;

        t(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6772r = obj;
            this.f6774t |= Integer.MIN_VALUE;
            Object objE = a.this.e(null, null, this);
            return objE == pf.b.g() ? objE : Result.a(objE);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6775r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ q0 f6776s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ a f6777t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f6778u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(q0 q0Var, a aVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f6776s = q0Var;
            this.f6777t = aVar;
            this.f6778u = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new u(this.f6776s, this.f6777t, this.f6778u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objG = pf.b.g();
            int i10 = this.f6775r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                q0 q0Var = this.f6776s;
                if (q0Var instanceof h1) {
                    Object obj2 = this.f6778u;
                    this.f6775r = 1;
                    objB = this.f6777t.q((h1) q0Var, obj2, this);
                    if (objB == objG) {
                        return objG;
                    }
                } else {
                    Result.Companion companion = Result.f93230c;
                    objB = Result.b(kotlin.d.a(new Exception("Unsupported media source type: " + this.f6776s)));
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objB = ((Result) obj).l();
            }
            return Result.a(objB);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6779r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6781t;

        v(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6779r = obj;
            this.f6781t |= Integer.MIN_VALUE;
            Object objT = a.this.t(null, null, this);
            return objT == pf.b.g() ? objT : Result.a(objT);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6782r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f6783s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ List f6785u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Object f6786v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(List list, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f6785u = list;
            this.f6786v = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new w(this.f6785u, this.f6786v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            qd.a aVar;
            Object objL;
            Object objB;
            Object objG = pf.b.g();
            int i10 = this.f6783s;
            if (i10 == 0) {
                kotlin.d.b(obj);
                qd.a aVarW = a.this.w();
                if (aVarW == null) {
                    Result.Companion companion = Result.f93230c;
                    return Result.a(Result.b(kotlin.d.a(new Exception("`MediaFileCacheManager` not found, check initialization"))));
                }
                List list = this.f6785u;
                this.f6782r = aVarW;
                this.f6783s = 1;
                Object objU = aVarW.u(list, this);
                if (objU == objG) {
                    return objG;
                }
                aVar = aVarW;
                objL = objU;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (qd.a) this.f6782r;
                kotlin.d.b(obj);
                objL = ((Result) obj).l();
            }
            File file = (File) (Result.i(objL) ? null : objL);
            Uri uriL = file != null ? td.b.l(file) : null;
            if (uriL != null) {
                aVar.B(file, this.f6786v);
                objB = Result.b(uriL);
            } else {
                Throwable thG = Result.g(objL);
                if (thG == null) {
                    thG = a.this.h();
                }
                objB = Result.b(kotlin.d.a(thG));
            }
            return Result.a(objB);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6787r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6789t;

        x(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6787r = obj;
            this.f6789t |= Integer.MIN_VALUE;
            Object objQ = a.this.q(null, null, this);
            return objQ == pf.b.g() ? objQ : Result.a(objQ);
        }
    }

    static final class y extends Lambda implements Function0 {
        y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final qd.a invoke() {
            return (qd.a) a.this.f6691a.invoke();
        }
    }

    public static final class z extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a0 f6791d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(b.a aVar, a0 a0Var, CoroutineScope coroutineScope, ic.j jVar) {
            super(aVar, coroutineScope, jVar);
            this.f6791d = a0Var;
        }

        @Override // cd.a.b
        public a0 b() {
            return this.f6791d;
        }
    }

    public a(Function0 mediaFileCacheManagerProvider, CoroutineScope coroutineScope, ic.j coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(mediaFileCacheManagerProvider, "mediaFileCacheManagerProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f6691a = mediaFileCacheManagerProvider;
        this.f6692b = coroutineScope;
        this.f6693c = coroutineDispatchers;
        this.f6694d = lf.i.a(new y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Exception h() {
        return new Exception("Unknown error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(b.a aVar, a0 a0Var, Continuation continuation) {
        Object objG = eg.g.g(this.f6693c.h(), new d(aVar, a0Var, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(b.a aVar, Object obj, Continuation continuation) {
        Object objG = eg.g.g(this.f6693c.h(), new e(aVar, obj, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qd.a w() {
        return (qd.a) this.f6694d.getValue();
    }

    @Override // ec.b
    public void a(q0 mediaSource, Object mediaSourceHolder, b.a resultCallback) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        Intrinsics.checkNotNullParameter(mediaSourceHolder, "mediaSourceHolder");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        eg.i.d(this.f6692b, null, null, new s(mediaSource, mediaSourceHolder, resultCallback, null), 3, null);
    }

    @Override // ec.b
    public void b(Object mediaSourceHolder) {
        Intrinsics.checkNotNullParameter(mediaSourceHolder, "mediaSourceHolder");
        eg.i.d(this.f6692b, null, null, new C0150a(mediaSourceHolder, null), 3, null);
    }

    @Override // ec.b
    public void c(q0 mediaSource, Object mediaSourceHolder, b.a resultCallback) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        Intrinsics.checkNotNullParameter(mediaSourceHolder, "mediaSourceHolder");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        eg.i.d(this.f6692b, null, null, new q(mediaSource, resultCallback, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ec.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(id.h1 r6, java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof cd.a.o
            if (r0 == 0) goto L13
            r0 = r8
            cd.a$o r0 = (cd.a.o) r0
            int r1 = r0.f6754t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6754t = r1
            goto L18
        L13:
            cd.a$o r0 = new cd.a$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6752r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6754t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r8)
            ic.j r8 = r5.f6693c
            kotlinx.coroutines.CoroutineDispatcher r8 = r8.f()
            cd.a$p r2 = new cd.a$p
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f6754t = r3
            java.lang.Object r8 = eg.g.g(r8, r2, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a.d(id.h1, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ec.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(id.q0 r6, java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof cd.a.t
            if (r0 == 0) goto L13
            r0 = r8
            cd.a$t r0 = (cd.a.t) r0
            int r1 = r0.f6774t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6774t = r1
            goto L18
        L13:
            cd.a$t r0 = new cd.a$t
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6772r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6774t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r8)
            ic.j r8 = r5.f6693c
            kotlinx.coroutines.CoroutineDispatcher r8 = r8.f()
            cd.a$u r2 = new cd.a$u
            r4 = 0
            r2.<init>(r6, r5, r7, r4)
            r0.f6774t = r3
            java.lang.Object r8 = eg.g.g(r8, r2, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a.e(id.q0, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ec.b
    public void f(q0 mediaSource, Object mediaSourceHolder, b.a resultCallback) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        Intrinsics.checkNotNullParameter(mediaSourceHolder, "mediaSourceHolder");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        eg.i.d(this.f6692b, null, null, new f(mediaSource, mediaSourceHolder, resultCallback, null), 3, null);
    }

    public final Bitmap g(String base64, BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        Intrinsics.checkNotNullParameter(options, "options");
        byte[] bArrG = g0.g(base64, 0, 1, null);
        if (bArrG != null) {
            return pd.i.b(bArrG, options);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(id.m r6, android.graphics.BitmapFactory.Options r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof cd.a.k
            if (r0 == 0) goto L13
            r0 = r8
            cd.a$k r0 = (cd.a.k) r0
            int r1 = r0.f6734t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6734t = r1
            goto L18
        L13:
            cd.a$k r0 = new cd.a$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6732r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6734t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r8)
            ic.j r8 = r5.f6693c
            kotlinx.coroutines.CoroutineDispatcher r8 = r8.d()
            cd.a$l r2 = new cd.a$l
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f6734t = r3
            java.lang.Object r8 = eg.g.g(r8, r2, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a.n(id.m, android.graphics.BitmapFactory$Options, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object o(q0 q0Var, b.a aVar, Continuation continuation) {
        Object objG = eg.g.g(this.f6693c.f(), new r(q0Var, this, aVar, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(id.h1 r11, java.lang.Object r12, android.graphics.BitmapFactory.Options r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof cd.a.m
            if (r0 == 0) goto L13
            r0 = r14
            cd.a$m r0 = (cd.a.m) r0
            int r1 = r0.f6741t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6741t = r1
            goto L18
        L13:
            cd.a$m r0 = new cd.a$m
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f6739r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6741t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r14)
            goto L4d
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.d.b(r14)
            ic.j r14 = r10.f6693c
            kotlinx.coroutines.CoroutineDispatcher r14 = r14.f()
            cd.a$n r4 = new cd.a$n
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r6, r7, r8, r9)
            r0.f6741t = r3
            java.lang.Object r14 = eg.g.g(r14, r4, r0)
            if (r14 != r1) goto L4d
            return r1
        L4d:
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.l()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a.p(id.h1, java.lang.Object, android.graphics.BitmapFactory$Options, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(id.h1 r5, java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof cd.a.x
            if (r0 == 0) goto L13
            r0 = r7
            cd.a$x r0 = (cd.a.x) r0
            int r1 = r0.f6789t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6789t = r1
            goto L18
        L13:
            cd.a$x r0 = new cd.a$x
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6787r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6789t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.d.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.l()
            return r5
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.d.b(r7)
            java.util.List r7 = r5.b()
            id.q0$b r5 = r5.a()
            int[] r2 = cd.a.c.f6707a
            int r5 = r5.ordinal()
            r5 = r2[r5]
            if (r5 == r3) goto L60
            r6 = 2
            if (r5 != r6) goto L5a
            java.lang.Object r5 = kotlin.collections.CollectionsKt.first(r7)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r4.s(r5)
            return r5
        L5a:
            lf.m r5 = new lf.m
            r5.<init>()
            throw r5
        L60:
            r0.f6789t = r3
            java.lang.Object r5 = r4.t(r7, r6, r0)
            if (r5 != r1) goto L69
            return r1
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a.q(id.h1, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(id.h1 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof cd.a.i
            if (r0 == 0) goto L13
            r0 = r7
            cd.a$i r0 = (cd.a.i) r0
            int r1 = r0.f6728t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6728t = r1
            goto L18
        L13:
            cd.a$i r0 = new cd.a$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6726r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6728t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r7)
            ic.j r7 = r5.f6693c
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.f()
            cd.a$j r2 = new cd.a$j
            r4 = 0
            r2.<init>(r6, r4)
            r0.f6728t = r3
            java.lang.Object r7 = eg.g.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a.r(id.h1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object s(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.f93230c;
            Uri uriM = f0.m(url);
            if (uriM != null) {
                return Result.b(uriM);
            }
            throw new Exception("Can't parse video stream url - " + url);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.util.List r6, java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof cd.a.v
            if (r0 == 0) goto L13
            r0 = r8
            cd.a$v r0 = (cd.a.v) r0
            int r1 = r0.f6781t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6781t = r1
            goto L18
        L13:
            cd.a$v r0 = new cd.a$v
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6779r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6781t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r8)
            ic.j r8 = r5.f6693c
            kotlinx.coroutines.CoroutineDispatcher r8 = r8.f()
            cd.a$w r2 = new cd.a$w
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f6781t = r3
            java.lang.Object r8 = eg.g.g(r8, r2, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a.t(java.util.List, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void u(String url, c.f processor, b.a resultCallback, a0 error) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        Intrinsics.checkNotNullParameter(error, "error");
        new c.a(url, c.e.Get).e(processor).d(new z(resultCallback, error, this.f6692b, this.f6693c)).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object z(id.q0 r6, java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof cd.a.g
            if (r0 == 0) goto L13
            r0 = r8
            cd.a$g r0 = (cd.a.g) r0
            int r1 = r0.f6721t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6721t = r1
            goto L18
        L13:
            cd.a$g r0 = new cd.a$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6719r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6721t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r8)
            ic.j r8 = r5.f6693c
            kotlinx.coroutines.CoroutineDispatcher r8 = r8.f()
            cd.a$h r2 = new cd.a$h
            r4 = 0
            r2.<init>(r6, r5, r7, r4)
            r0.f6721t = r3
            java.lang.Object r8 = eg.g.g(r8, r2, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a.z(id.q0, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
