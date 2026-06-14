package bd;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f6340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f6341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bd.a f6342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bd.b f6343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f6344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f6345f;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6346r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f6347s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f6348t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f6349u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f6351w;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6349u = obj;
            this.f6351w |= Integer.MIN_VALUE;
            return k.this.a(null, null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6352r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f6353s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ k f6354t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Rect f6355u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Bitmap f6356v;

        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6357r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f6358s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ k f6359t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ Rect f6360u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f6361v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ Bitmap f6362w;

            /* JADX INFO: renamed from: bd.k$b$a$a, reason: collision with other inner class name */
            static final class C0141a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f6363r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ k f6364s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Bitmap f6365t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ Rect f6366u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0141a(k kVar, Bitmap bitmap, Rect rect, Continuation continuation) {
                    super(2, continuation);
                    this.f6364s = kVar;
                    this.f6365t = bitmap;
                    this.f6366u = rect;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0141a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0141a(this.f6364s, this.f6365t, this.f6366u, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f6363r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return kotlin.coroutines.jvm.internal.b.d(this.f6364s.f6344e.a(this.f6365t, this.f6366u));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, Rect rect, CoroutineContext coroutineContext, Bitmap bitmap, Continuation continuation) {
                super(2, continuation);
                this.f6359t = kVar;
                this.f6360u = rect;
                this.f6361v = coroutineContext;
                this.f6362w = bitmap;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f6359t, this.f6360u, this.f6361v, this.f6362w, continuation);
                aVar.f6358s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f6357r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return obj;
                }
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f6358s;
                List listB = this.f6359t.f6343d.b(this.f6360u);
                CoroutineContext coroutineContext = this.f6361v;
                k kVar = this.f6359t;
                Bitmap bitmap = this.f6362w;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(eg.i.b(coroutineScope, coroutineContext.plus(ic.j.f74267i.a().d()), null, new C0141a(kVar, bitmap, (Rect) it.next(), null), 2, null));
                }
                this.f6357r = 1;
                Object objA = eg.d.a(arrayList, this);
                return objA == objG ? objG : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CoroutineContext coroutineContext, k kVar, Rect rect, Bitmap bitmap, Continuation continuation) {
            super(1, continuation);
            this.f6353s = coroutineContext;
            this.f6354t = kVar;
            this.f6355u = rect;
            this.f6356v = bitmap;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return new b(this.f6353s, this.f6354t, this.f6355u, this.f6356v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f6352r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            CoroutineContext coroutineContext = this.f6353s;
            a aVar = new a(this.f6354t, this.f6355u, coroutineContext, this.f6356v, null);
            this.f6352r = 1;
            Object objG2 = eg.g.g(coroutineContext, aVar, this);
            return objG2 == objG ? objG : objG2;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6367r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Bitmap f6369t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bitmap bitmap, Continuation continuation) {
            super(1, continuation);
            this.f6369t = bitmap;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return k.this.new c(this.f6369t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f6367r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            bd.a aVar = k.this.f6342c;
            Bitmap bitmap = this.f6369t;
            this.f6367r = 1;
            Object objF = bd.a.f(aVar, bitmap, null, this, 2, null);
            return objF == objG ? objG : objF;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6370r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f6372t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view, Continuation continuation) {
            super(1, continuation);
            this.f6372t = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return k.this.new d(this.f6372t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f6370r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            o oVar = k.this.f6341b;
            View viewA = k.this.f6340a.a(this.f6372t);
            this.f6370r = 1;
            Object objE = oVar.e(viewA, this);
            return objE == objG ? objG : objE;
        }
    }

    public k(n viewExtractor, o viewScreenshot, bd.a contentBoundsScanner, bd.b contentCornerExtractor, i meanColorCalculator, l performanceMeasurer) {
        Intrinsics.checkNotNullParameter(viewExtractor, "viewExtractor");
        Intrinsics.checkNotNullParameter(viewScreenshot, "viewScreenshot");
        Intrinsics.checkNotNullParameter(contentBoundsScanner, "contentBoundsScanner");
        Intrinsics.checkNotNullParameter(contentCornerExtractor, "contentCornerExtractor");
        Intrinsics.checkNotNullParameter(meanColorCalculator, "meanColorCalculator");
        Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        this.f6340a = viewExtractor;
        this.f6341b = viewScreenshot;
        this.f6342c = contentBoundsScanner;
        this.f6343d = contentCornerExtractor;
        this.f6344e = meanColorCalculator;
        this.f6345f = performanceMeasurer;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // bd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(kotlin.coroutines.CoroutineContext r15, android.view.View r16, kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.k.a(kotlin.coroutines.CoroutineContext, android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
