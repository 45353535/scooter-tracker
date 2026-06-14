package bd;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f6320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f6321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bd.a f6322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f6323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f6324e;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6325r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f6326s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f6327t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f6329v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6327t = obj;
            this.f6329v |= Integer.MIN_VALUE;
            return j.this.a(null, null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6330r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Bitmap f6332t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Rect f6333u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Bitmap bitmap, Rect rect, Continuation continuation) {
            super(1, continuation);
            this.f6332t = bitmap;
            this.f6333u = rect;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return j.this.new b(this.f6332t, this.f6333u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f6330r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.d(j.this.f6323d.a(this.f6332t, this.f6333u));
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6334r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Bitmap f6336t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bitmap bitmap, Continuation continuation) {
            super(1, continuation);
            this.f6336t = bitmap;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return j.this.new c(this.f6336t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f6334r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            bd.a aVar = j.this.f6322c;
            Bitmap bitmap = this.f6336t;
            this.f6334r = 1;
            Object objF = bd.a.f(aVar, bitmap, null, this, 2, null);
            return objF == objG ? objG : objF;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6337r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f6339t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view, Continuation continuation) {
            super(1, continuation);
            this.f6339t = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return j.this.new d(this.f6339t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f6337r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            o oVar = j.this.f6321b;
            View viewA = j.this.f6320a.a(this.f6339t);
            this.f6337r = 1;
            Object objE = oVar.e(viewA, this);
            return objE == objG ? objG : objE;
        }
    }

    public j(n viewExtractor, o viewScreenshot, bd.a contentBoundsScanner, i meanColorCalculator, l performanceMeasurer) {
        Intrinsics.checkNotNullParameter(viewExtractor, "viewExtractor");
        Intrinsics.checkNotNullParameter(viewScreenshot, "viewScreenshot");
        Intrinsics.checkNotNullParameter(contentBoundsScanner, "contentBoundsScanner");
        Intrinsics.checkNotNullParameter(meanColorCalculator, "meanColorCalculator");
        Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        this.f6320a = viewExtractor;
        this.f6321b = viewScreenshot;
        this.f6322c = contentBoundsScanner;
        this.f6323d = meanColorCalculator;
        this.f6324e = performanceMeasurer;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(kotlin.coroutines.CoroutineContext r9, android.view.View r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r9 = r11 instanceof bd.j.a
            if (r9 == 0) goto L13
            r9 = r11
            bd.j$a r9 = (bd.j.a) r9
            int r0 = r9.f6329v
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r9.f6329v = r0
            goto L18
        L13:
            bd.j$a r9 = new bd.j$a
            r9.<init>(r11)
        L18:
            java.lang.Object r11 = r9.f6327t
            java.lang.Object r0 = pf.b.g()
            int r1 = r9.f6329v
            r2 = 2
            r3 = 3
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L52
            if (r1 == r4) goto L49
            if (r1 == r2) goto L3d
            if (r1 != r3) goto L35
            java.lang.Object r9 = r9.f6325r
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            kotlin.d.b(r11)
            goto Lae
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r10 = r9.f6326s
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            java.lang.Object r1 = r9.f6325r
            bd.j r1 = (bd.j) r1
            kotlin.d.b(r11)
            goto L8d
        L49:
            java.lang.Object r10 = r9.f6325r
            bd.j r10 = (bd.j) r10
            kotlin.d.b(r11)
            r1 = r10
            goto L6a
        L52:
            kotlin.d.b(r11)
            bd.l r11 = r8.f6324e
            bd.j$d r1 = new bd.j$d
            r1.<init>(r10, r5)
            r9.f6325r = r8
            r9.f6329v = r4
            java.lang.String r10 = "Screenshot"
            java.lang.Object r11 = r11.a(r10, r1, r9)
            if (r11 != r0) goto L69
            goto Lac
        L69:
            r1 = r8
        L6a:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            if (r11 != 0) goto L74
            bd.f$a r9 = new bd.f$a
            r9.<init>(r5, r5, r3, r5)
            return r9
        L74:
            bd.l r10 = r1.f6324e
            bd.j$c r6 = new bd.j$c
            r6.<init>(r11, r5)
            r9.f6325r = r1
            r9.f6326s = r11
            r9.f6329v = r2
            java.lang.String r2 = "Scan bounds"
            java.lang.Object r10 = r10.a(r2, r6, r9)
            if (r10 != r0) goto L8a
            goto Lac
        L8a:
            r7 = r11
            r11 = r10
            r10 = r7
        L8d:
            android.graphics.Rect r11 = (android.graphics.Rect) r11
            if (r11 != 0) goto L97
            bd.f$a r9 = new bd.f$a
            r9.<init>(r5, r10, r4, r5)
            return r9
        L97:
            bd.l r2 = r1.f6324e
            bd.j$b r4 = new bd.j$b
            r4.<init>(r10, r11, r5)
            r9.f6325r = r10
            r9.f6326s = r5
            r9.f6329v = r3
            java.lang.String r11 = "Mean color"
            java.lang.Object r11 = r2.a(r11, r4, r9)
            if (r11 != r0) goto Lad
        Lac:
            return r0
        Lad:
            r9 = r10
        Lae:
            java.lang.Number r11 = (java.lang.Number) r11
            int r10 = r11.intValue()
            bd.f$a r11 = new bd.f$a
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.b.d(r10)
            r11.<init>(r10, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.j.a(kotlin.coroutines.CoroutineContext, android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
