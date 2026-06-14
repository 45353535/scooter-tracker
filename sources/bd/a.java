package bd;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0135a f6212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bd.c f6213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f6214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineContext f6215d;

    /* JADX INFO: renamed from: bd.a$a, reason: collision with other inner class name */
    public static final class C0135a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bd.d f6217b;

        public C0135a(int i10, bd.d samplingStrategy) {
            Intrinsics.checkNotNullParameter(samplingStrategy, "samplingStrategy");
            this.f6216a = i10;
            this.f6217b = samplingStrategy;
        }

        public final int a(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            return this.f6217b.a(rect.width(), rect.height(), this.f6216a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0135a)) {
                return false;
            }
            C0135a c0135a = (C0135a) obj;
            return this.f6216a == c0135a.f6216a && Intrinsics.areEqual(this.f6217b, c0135a.f6217b);
        }

        public int hashCode() {
            return (this.f6216a * 31) + this.f6217b.hashCode();
        }

        public String toString() {
            return "Config(minContentDimensionPx=" + this.f6216a + ", samplingStrategy=" + this.f6217b + ')';
        }
    }

    public enum b {
        Horizontal,
        Vertical
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f6221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f6222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f6223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f6224f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ c[] f6225g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f6226b;

        static {
            b bVar = b.Horizontal;
            f6221c = new c("Left", 0, bVar);
            b bVar2 = b.Vertical;
            f6222d = new c("Top", 1, bVar2);
            f6223e = new c("Right", 2, bVar);
            f6224f = new c("Bottom", 3, bVar2);
            f6225g = d();
        }

        private c(String str, int i10, b bVar) {
            this.f6226b = bVar;
        }

        private static final /* synthetic */ c[] d() {
            return new c[]{f6221c, f6222d, f6223e, f6224f};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f6225g.clone();
        }

        public final b g() {
            return this.f6226b;
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6227a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f6222d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f6224f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f6221c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.f6223e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6227a = iArr;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6228r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f6229s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6230t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f6231u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Bitmap f6233w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Rect f6234x;

        /* JADX INFO: renamed from: bd.a$e$a, reason: collision with other inner class name */
        static final class C0136a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6235r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ a f6236s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ c f6237t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ Rect f6238u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ int[] f6239v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ boolean f6240w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ List f6241x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0136a(a aVar, c cVar, Rect rect, int[] iArr, boolean z10, List list, Continuation continuation) {
                super(2, continuation);
                this.f6236s = aVar;
                this.f6237t = cVar;
                this.f6238u = rect;
                this.f6239v = iArr;
                this.f6240w = z10;
                this.f6241x = list;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0136a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0136a(this.f6236s, this.f6237t, this.f6238u, this.f6239v, this.f6240w, this.f6241x, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f6235r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return this.f6236s.b(this.f6237t, this.f6238u, this.f6239v, this.f6240w, new IntRange(((Number) this.f6241x.get(0)).intValue(), ((Number) this.f6241x.get(1)).intValue()));
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f6242r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ a f6243s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ c f6244t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ Rect f6245u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ int[] f6246v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ boolean f6247w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, c cVar, Rect rect, int[] iArr, boolean z10, Continuation continuation) {
                super(2, continuation);
                this.f6243s = aVar;
                this.f6244t = cVar;
                this.f6245u = rect;
                this.f6246v = iArr;
                this.f6247w = z10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f6243s, this.f6244t, this.f6245u, this.f6246v, this.f6247w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f6242r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return a.d(this.f6243s, this.f6244t, this.f6245u, this.f6246v, this.f6247w, null, 16, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bitmap bitmap, Rect rect, Continuation continuation) {
            super(2, continuation);
            this.f6233w = bitmap;
            this.f6234x = rect;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = a.this.new e(this.f6233w, this.f6234x, continuation);
            eVar.f6231u = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x011c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 360
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: bd.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(CoroutineContext coroutineContext, C0135a config, bd.c detector, m pixelsExtractor) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(pixelsExtractor, "pixelsExtractor");
        this.f6212a = config;
        this.f6213b = detector;
        this.f6214c = pixelsExtractor;
        this.f6215d = coroutineContext.plus(ic.j.f74267i.a().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer b(c cVar, Rect rect, int[] iArr, boolean z10, kotlin.ranges.d dVar) {
        Integer numValueOf;
        Integer numValueOf2;
        Pair pairG = g(cVar, rect, dVar);
        kotlin.ranges.d dVar2 = (kotlin.ranges.d) pairG.component1();
        kotlin.ranges.d dVar3 = (kotlin.ranges.d) pairG.component2();
        int iWidth = rect.width();
        int iE = dVar2.e();
        int iF = dVar2.f();
        int iG = dVar2.g();
        if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
            return null;
        }
        while (true) {
            int iE2 = dVar3.e();
            int iF2 = dVar3.f();
            int iG2 = dVar3.g();
            if ((iG2 > 0 && iE2 <= iF2) || (iG2 < 0 && iF2 <= iE2)) {
                while (true) {
                    if (cVar.g() == b.Horizontal) {
                        numValueOf = Integer.valueOf(iE);
                        numValueOf2 = Integer.valueOf(iE2);
                    } else {
                        numValueOf = Integer.valueOf(iE2);
                        numValueOf2 = Integer.valueOf(iE);
                    }
                    Pair pair = TuplesKt.to(numValueOf, numValueOf2);
                    int iIntValue = ((Number) pair.component1()).intValue();
                    if (!this.f6213b.a(iArr[((((Number) pair.component2()).intValue() - rect.top) * iWidth) + (iIntValue - rect.left)], z10)) {
                        if (iE2 == iF2) {
                            break;
                        }
                        iE2 += iG2;
                    } else {
                        return Integer.valueOf(iE);
                    }
                }
            }
            if (iE == iF) {
                return null;
            }
            iE += iG;
        }
    }

    static /* synthetic */ Integer d(a aVar, c cVar, Rect rect, int[] iArr, boolean z10, kotlin.ranges.d dVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            dVar = null;
        }
        return aVar.b(cVar, rect, iArr, z10, dVar);
    }

    public static /* synthetic */ Object f(a aVar, Bitmap bitmap, Rect rect, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        }
        return aVar.e(bitmap, rect, continuation);
    }

    private final Pair g(c cVar, Rect rect, kotlin.ranges.d dVar) {
        int i10 = d.f6227a[cVar.ordinal()];
        if (i10 == 1) {
            return new Pair(kotlin.ranges.g.v(rect.top, rect.bottom), kotlin.ranges.g.v(rect.left, rect.right));
        }
        if (i10 == 2) {
            return new Pair(kotlin.ranges.g.r(rect.bottom - 1, rect.top), kotlin.ranges.g.v(rect.left, rect.right));
        }
        if (i10 == 3) {
            IntRange intRangeV = kotlin.ranges.g.v(rect.left, rect.right);
            if (dVar == null) {
                dVar = kotlin.ranges.g.v(rect.top, rect.bottom);
            }
            return new Pair(intRangeV, dVar);
        }
        if (i10 != 4) {
            throw new lf.m();
        }
        kotlin.ranges.d dVarR = kotlin.ranges.g.r(rect.right - 1, rect.left);
        if (dVar == null) {
            dVar = kotlin.ranges.g.v(rect.top, rect.bottom);
        }
        return new Pair(dVarR, dVar);
    }

    public final Object e(Bitmap bitmap, Rect rect, Continuation continuation) {
        return eg.g.g(this.f6215d, new e(bitmap, rect, null), continuation);
    }
}
