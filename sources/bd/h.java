package bd;

import android.graphics.Bitmap;
import android.view.View;
import bd.f;
import eg.x1;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends wd.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f6292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f6293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function0 f6294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function1 f6295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WeakReference f6296h;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6297r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f6298s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ h f6299t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, h hVar, Continuation continuation) {
            super(2, continuation);
            this.f6298s = obj;
            this.f6299t = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f6298s, this.f6299t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            pf.b.g();
            if (this.f6297r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            Object obj2 = this.f6298s;
            if (obj2 != null) {
                this.f6299t.f6295g.invoke(obj2);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f6299t.f6294f.invoke();
            }
            return Unit.f93236a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6300r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f6301s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f6302t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f6304v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6302t = obj;
            this.f6304v |= Integer.MIN_VALUE;
            return h.this.e(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6305r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f6306s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ h f6307t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f6308u;

        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6309r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ h f6310s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f6311t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, CoroutineContext coroutineContext, Continuation continuation) {
                super(2, continuation);
                this.f6310s = hVar;
                this.f6311t = coroutineContext;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f6310s, this.f6311t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f6309r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    View view = (View) this.f6310s.f6296h.get();
                    if (view == null) {
                        return null;
                    }
                    h hVar = this.f6310s;
                    CoroutineContext coroutineContext = this.f6311t;
                    f fVar = hVar.f6292d;
                    this.f6309r = 1;
                    obj = fVar.a(coroutineContext, view, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                return (f.a) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, h hVar, CoroutineContext coroutineContext, Continuation continuation) {
            super(1, continuation);
            this.f6306s = j10;
            this.f6307t = hVar;
            this.f6308u = coroutineContext;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return new c(this.f6306s, this.f6307t, this.f6308u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f6305r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            long j10 = this.f6306s;
            a aVar = new a(this.f6307t, this.f6308u, null);
            this.f6305r = 1;
            Object objE = x1.e(j10, aVar, this);
            return objE == objG ? objG : objE;
        }
    }

    public h(View view, long j10, f meanBackgroundExtractor, l performanceMeasurer, Function0 onFallback, Function1 onFinished) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(meanBackgroundExtractor, "meanBackgroundExtractor");
        Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        Intrinsics.checkNotNullParameter(onFallback, "onFallback");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        this.f6291c = j10;
        this.f6292d = meanBackgroundExtractor;
        this.f6293e = performanceMeasurer;
        this.f6294f = onFallback;
        this.f6295g = onFinished;
        this.f6296h = new WeakReference(view);
    }

    private final Object g(CoroutineContext coroutineContext, long j10, Continuation continuation) {
        return this.f6293e.a("Mean background extraction", new c(j10, this, coroutineContext, null), continuation);
    }

    private final Object h(CoroutineContext coroutineContext, Object obj, Bitmap bitmap, Continuation continuation) {
        if (bitmap != null) {
            pd.j.g(bitmap);
        }
        Object objG = eg.g.g(coroutineContext.plus(ic.j.f74267i.a().i()), new a(obj, this, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9.h(r10, r5, r2, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof bd.h.b
            if (r0 == 0) goto L13
            r0 = r10
            bd.h$b r0 = (bd.h.b) r0
            int r1 = r0.f6304v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6304v = r1
            goto L18
        L13:
            bd.h$b r0 = new bd.h$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6302t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f6304v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f6300r
            bd.h r9 = (bd.h) r9
            kotlin.d.b(r10)
            goto L77
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f6301s
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            java.lang.Object r2 = r0.f6300r
            bd.h r2 = (bd.h) r2
            kotlin.d.b(r10)
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L5d
        L48:
            kotlin.d.b(r10)
            long r5 = r8.f6291c
            r0.f6300r = r8
            r0.f6301s = r9
            r0.f6304v = r4
            java.lang.Object r10 = r8.g(r9, r5, r0)
            if (r10 != r1) goto L5a
            goto L76
        L5a:
            r2 = r10
            r10 = r9
            r9 = r8
        L5d:
            bd.f$a r2 = (bd.f.a) r2
            if (r2 == 0) goto L77
            java.lang.Object r5 = r2.b()
            android.graphics.Bitmap r2 = r2.a()
            r0.f6300r = r9
            r6 = 0
            r0.f6301s = r6
            r0.f6304v = r3
            java.lang.Object r10 = r9.h(r10, r5, r2, r0)
            if (r10 != r1) goto L77
        L76:
            return r1
        L77:
            r9.a(r4)
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h.e(kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
