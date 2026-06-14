package bd;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import pd.k0;
import pd.q;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ic.j f6384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f6385c;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6392a;

        public b(int i10) {
            this.f6392a = i10;
        }

        private final Object b(Bitmap bitmap) {
            try {
                Result.Companion companion = Result.f93230c;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i10 = this.f6392a;
                if (width <= i10 && height <= i10) {
                    return Result.b(bitmap);
                }
                float f10 = i10;
                float f11 = width;
                float f12 = height;
                float fMin = Math.min(f10 / f11, f10 / f12);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f11 * fMin), (int) (f12 * fMin), true);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(bitma…idth, scaledHeight, true)");
                if (bitmapCreateScaledBitmap != bitmap) {
                    pd.j.g(bitmap);
                }
                return Result.b(bitmapCreateScaledBitmap);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                return Result.b(kotlin.d.a(th2));
            }
        }

        public final Bitmap a(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Object objB = b(bitmap);
            if (Result.i(objB)) {
                objB = null;
            }
            Bitmap bitmap2 = (Bitmap) objB;
            return bitmap2 == null ? bitmap : bitmap2;
        }
    }

    public static final class c implements dd.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f6393a;

        c(CancellableContinuation cancellableContinuation) {
            this.f6393a = cancellableContinuation;
        }

        @Override // dd.b
        public void a(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f6393a.resumeWith(Result.b(bitmap));
        }

        @Override // dd.b
        public void a() {
            this.f6393a.resumeWith(Result.b(null));
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6395r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f6397t;

        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6398r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ View f6399s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, Continuation continuation) {
                super(2, continuation);
                this.f6399s = view;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f6399s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f6398r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return obj;
                }
                kotlin.d.b(obj);
                View view = this.f6399s;
                this.f6398r = 1;
                Object objE = k0.e(view, this);
                return objE == objG ? objG : objE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view, Continuation continuation) {
            super(2, continuation);
            this.f6397t = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new e(this.f6397t, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r7 == r0) goto L15;
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
                int r1 = r6.f6395r
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.d.b(r7)
                goto L49
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                kotlin.d.b(r7)
                goto L3c
            L1f:
                kotlin.d.b(r7)
                bd.o r7 = bd.o.this
                ic.j r7 = bd.o.d(r7)
                kotlinx.coroutines.CoroutineDispatcher r7 = r7.h()
                bd.o$e$a r1 = new bd.o$e$a
                android.view.View r5 = r6.f6397t
                r1.<init>(r5, r2)
                r6.f6395r = r4
                java.lang.Object r7 = eg.g.g(r7, r1, r6)
                if (r7 != r0) goto L3c
                goto L48
            L3c:
                bd.o r7 = bd.o.this
                android.view.View r1 = r6.f6397t
                r6.f6395r = r3
                java.lang.Object r7 = bd.o.c(r7, r1, r6)
                if (r7 != r0) goto L49
            L48:
                return r0
            L49:
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                if (r7 == 0) goto L63
                bd.o r0 = bd.o.this
                android.view.View r1 = r6.f6397t
                bd.o$b r2 = new bd.o$b
                bd.o$a r0 = bd.o.a(r0)
                int r0 = r0.b(r1)
                r2.<init>(r0)
                android.graphics.Bitmap r7 = r2.a(r7)
                return r7
            L63:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: bd.o.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o(a config, ic.j coroutineDispatchers, Handler handler) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6383a = config;
        this.f6384b = coroutineDispatchers;
        this.f6385c = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(View view, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        dd.a.f68657a.a(view, this.f6385c, this.f6383a.c(), new c(eVar));
        eVar.v(d.f6394f);
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }

    public final Object e(View view, Continuation continuation) {
        return eg.g.g(this.f6384b.f(), new e(view, null), continuation);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap.Config f6386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC0142a f6389d;

        /* JADX INFO: renamed from: bd.o$a$a, reason: collision with other inner class name */
        public interface InterfaceC0142a {

            /* JADX INFO: renamed from: bd.o$a$a$a, reason: collision with other inner class name */
            public static final class C0143a implements InterfaceC0142a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0143a f6390a = new C0143a();

                private C0143a() {
                }

                @Override // bd.o.a.InterfaceC0142a
                public int a(Context context, int i10, int i11, int i12, int i13) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    return i12;
                }
            }

            /* JADX INFO: renamed from: bd.o$a$a$b */
            public static final class b implements InterfaceC0142a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f6391a = new b();

                private b() {
                }

                @Override // bd.o.a.InterfaceC0142a
                public int a(Context context, int i10, int i11, int i12, int i13) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    float f10 = i13;
                    return (int) kotlin.ranges.g.d(q.a(i12, f10, f10 / Math.max(i10, i11)), 0.0f);
                }
            }

            int a(Context context, int i10, int i11, int i12, int i13);
        }

        public a(Bitmap.Config bitmapConfig, int i10, int i11, InterfaceC0142a scalingStrategy) {
            Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
            Intrinsics.checkNotNullParameter(scalingStrategy, "scalingStrategy");
            this.f6386a = bitmapConfig;
            this.f6387b = i10;
            this.f6388c = i11;
            this.f6389d = scalingStrategy;
        }

        public final int a(Context context, int i10, int i11) {
            Intrinsics.checkNotNullParameter(context, "context");
            return this.f6389d.a(context, i10, i11, this.f6387b, this.f6388c);
        }

        public final int b(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            return a(context, view.getWidth(), view.getHeight());
        }

        public final Bitmap.Config c() {
            return this.f6386a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6386a == aVar.f6386a && this.f6387b == aVar.f6387b && this.f6388c == aVar.f6388c && Intrinsics.areEqual(this.f6389d, aVar.f6389d);
        }

        public int hashCode() {
            return (((((this.f6386a.hashCode() * 31) + this.f6387b) * 31) + this.f6388c) * 31) + this.f6389d.hashCode();
        }

        public String toString() {
            return "Config(bitmapConfig=" + this.f6386a + ", minDimensionPx=" + this.f6387b + ", maxDimensionPx=" + this.f6388c + ", scalingStrategy=" + this.f6389d + ')';
        }

        public /* synthetic */ a(Bitmap.Config config, int i10, int i11, InterfaceC0142a interfaceC0142a, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? Bitmap.Config.RGB_565 : config, i10, i11, (i12 & 8) != 0 ? InterfaceC0142a.C0143a.f6390a : interfaceC0142a);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f6394f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f93236a;
        }

        public final void a(Throwable th2) {
        }
    }
}
