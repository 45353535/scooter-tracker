package bd;

import android.view.View;
import androidx.core.view.ViewCompat;
import bd.a;
import bd.b;
import bd.c;
import bd.d;
import bd.i;
import bd.o;
import eg.m1;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f6266l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext f6267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f6268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f6269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f6270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f6271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f6272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f6273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f6274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m f6275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final bd.b f6276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a.C0135a f6277k;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f6285f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final yd.a invoke() {
            return new yd.a();
        }
    }

    static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f6286f = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final jd.e invoke() {
            return new jd.e();
        }
    }

    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final l invoke() {
            return new l(g.this.g());
        }
    }

    static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f6288f = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return new n();
        }
    }

    /* JADX INFO: renamed from: bd.g$g, reason: collision with other inner class name */
    static final class C0138g extends Lambda implements Function0 {
        C0138g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return new o(new o.a(null, g.this.f6268b.d().e(), g.this.f6268b.d().f(), o.a.InterfaceC0142a.b.f6391a, 1, null), ic.j.f74267i.a(), g.this.c().f());
        }
    }

    static final class h extends Lambda implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final xd.a invoke() {
            return new xd.a(g.this.f6267a);
        }
    }

    public g(CoroutineContext coroutineContext, b config) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f6267a = coroutineContext;
        this.f6268b = config;
        this.f6269c = lf.i.a(new h());
        this.f6270d = lf.i.a(c.f6285f);
        this.f6271e = lf.i.a(d.f6286f);
        this.f6272f = lf.i.a(new e());
        this.f6273g = lf.i.a(f.f6288f);
        this.f6274h = lf.i.a(new C0138g());
        this.f6275i = new bd.e();
        this.f6276j = new bd.b(new b.a(config.e(), config.f(), new d.a(config.d().f())));
        this.f6277k = new a.C0135a(35, new d.a(config.d().f()));
    }

    private final bd.a a(Integer num) {
        return new bd.a(this.f6267a, this.f6277k, new bd.c(new c.a(num, this.f6268b.a(), this.f6268b.c(), this.f6268b.b())), this.f6275i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yd.b c() {
        return (yd.b) this.f6270d.getValue();
    }

    private final i e(Integer num) {
        return new i(new i.a(num != null ? num.intValue() : ViewCompat.MEASURED_STATE_MASK, this.f6268b.d().f(), this.f6268b.g().e(), this.f6268b.g().f(), i.a.InterfaceC0139a.C0140a.f6319a), this.f6275i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ud.b g() {
        return (ud.b) this.f6271e.getValue();
    }

    private final l i() {
        return (l) this.f6272f.getValue();
    }

    private final n k() {
        return (n) this.f6273g.getValue();
    }

    private final o m() {
        return (o) this.f6274h.getValue();
    }

    private final wd.e n() {
        return (wd.e) this.f6269c.getValue();
    }

    public final void d(View view, Integer num, Function0 onFallback, Function1 onFinished) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onFallback, "onFallback");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        n().b(new bd.h(view, 1000L, new j(k(), m(), a(num), e(num), i()), i(), onFallback, onFinished));
    }

    public final void h(View view, Integer num, Function0 onFallback, Function1 onFinished) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onFallback, "onFallback");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        n().b(new bd.h(view, 1000L, new k(k(), m(), a(num), this.f6276j, e(num), i()), i(), onFallback, onFinished));
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IntRange f6278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final IntRange f6281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f6282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f6283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f6284g;

        public b(IntRange dimensionsRangePx, int i10, int i11, IntRange sampleStepRangePx, float f10, float f11, float f12) {
            Intrinsics.checkNotNullParameter(dimensionsRangePx, "dimensionsRangePx");
            Intrinsics.checkNotNullParameter(sampleStepRangePx, "sampleStepRangePx");
            this.f6278a = dimensionsRangePx;
            this.f6279b = i10;
            this.f6280c = i11;
            this.f6281d = sampleStepRangePx;
            this.f6282e = f10;
            this.f6283f = f11;
            this.f6284g = f12;
        }

        public final float a() {
            return this.f6282e;
        }

        public final float b() {
            return this.f6284g;
        }

        public final float c() {
            return this.f6283f;
        }

        public final IntRange d() {
            return this.f6278a;
        }

        public final int e() {
            return this.f6279b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f6278a, bVar.f6278a) && this.f6279b == bVar.f6279b && this.f6280c == bVar.f6280c && Intrinsics.areEqual(this.f6281d, bVar.f6281d) && Float.compare(this.f6282e, bVar.f6282e) == 0 && Float.compare(this.f6283f, bVar.f6283f) == 0 && Float.compare(this.f6284g, bVar.f6284g) == 0;
        }

        public final int f() {
            return this.f6280c;
        }

        public final IntRange g() {
            return this.f6281d;
        }

        public int hashCode() {
            return (((((((((((this.f6278a.hashCode() * 31) + this.f6279b) * 31) + this.f6280c) * 31) + this.f6281d.hashCode()) * 31) + Float.floatToIntBits(this.f6282e)) * 31) + Float.floatToIntBits(this.f6283f)) * 31) + Float.floatToIntBits(this.f6284g);
        }

        public String toString() {
            return "Config(dimensionsRangePx=" + this.f6278a + ", maxOffsetPx=" + this.f6279b + ", maxSampleSizePx=" + this.f6280c + ", sampleStepRangePx=" + this.f6281d + ", detectorAlphaThreshold=" + this.f6282e + ", detectorTolerance=" + this.f6283f + ", detectorBrightnessThreshold=" + this.f6284g + ')';
        }

        public /* synthetic */ b(IntRange intRange, int i10, int i11, IntRange intRange2, float f10, float f11, float f12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? new IntRange(200, 512) : intRange, (i12 & 2) != 0 ? 5 : i10, (i12 & 4) != 0 ? 25 : i11, (i12 & 8) != 0 ? new IntRange(1, 8) : intRange2, (i12 & 16) != 0 ? 0.01f : f10, (i12 & 32) != 0 ? 0.02f : f11, (i12 & 64) != 0 ? 0.04f : f12);
        }
    }

    public /* synthetic */ g(CoroutineContext coroutineContext, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? m1.b(null, 1, null).plus(ic.j.f74267i.a().d()) : coroutineContext, (i10 & 2) != 0 ? new b(null, 0, 0, null, 0.0f, 0.0f, 0.0f, 127, null) : bVar);
    }
}
