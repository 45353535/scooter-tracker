package y;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import b0.b;
import coil.memory.MemoryCache;
import hh.t;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import q.i;
import y.n;

/* JADX INFO: loaded from: classes5.dex */
public final class h {
    private final Lifecycle A;
    private final z.j B;
    private final z.h C;
    private final n D;
    private final MemoryCache.Key E;
    private final Integer F;
    private final Drawable G;
    private final Integer H;
    private final Drawable I;
    private final Integer J;
    private final Drawable K;
    private final c L;
    private final y.b M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f108245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f108246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0.a f108247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f108248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MemoryCache.Key f108249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f108250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bitmap.Config f108251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ColorSpace f108252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z.e f108253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Pair f108254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i.a f108255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f108256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b.a f108257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t f108258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final q f108259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f108260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f108261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f108262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f108263s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final y.a f108264t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final y.a f108265u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final y.a f108266v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final CoroutineDispatcher f108267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final CoroutineDispatcher f108268x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final CoroutineDispatcher f108269y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final CoroutineDispatcher f108270z;

    public interface b {
        void a(h hVar, p pVar);

        void b(h hVar, e eVar);

        void c(h hVar);

        void d(h hVar);
    }

    public /* synthetic */ h(Context context, Object obj, a0.a aVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, z.e eVar, Pair pair, i.a aVar2, List list, b.a aVar3, t tVar, q qVar, boolean z10, boolean z11, boolean z12, boolean z13, y.a aVar4, y.a aVar5, y.a aVar6, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, z.j jVar, z.h hVar, n nVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, c cVar, y.b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, aVar, bVar, key, str, config, colorSpace, eVar, pair, aVar2, list, aVar3, tVar, qVar, z10, z11, z12, z13, aVar4, aVar5, aVar6, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, jVar, hVar, nVar, key2, num, drawable, num2, drawable2, num3, drawable3, cVar, bVar2);
    }

    public static /* synthetic */ a R(h hVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = hVar.f108245a;
        }
        return hVar.Q(context);
    }

    public final b A() {
        return this.f108248d;
    }

    public final MemoryCache.Key B() {
        return this.f108249e;
    }

    public final y.a C() {
        return this.f108264t;
    }

    public final y.a D() {
        return this.f108266v;
    }

    public final n E() {
        return this.D;
    }

    public final Drawable F() {
        return c0.h.c(this, this.G, this.F, this.M.l());
    }

    public final MemoryCache.Key G() {
        return this.E;
    }

    public final z.e H() {
        return this.f108253i;
    }

    public final boolean I() {
        return this.f108263s;
    }

    public final z.h J() {
        return this.C;
    }

    public final z.j K() {
        return this.B;
    }

    public final q L() {
        return this.f108259o;
    }

    public final a0.a M() {
        return this.f108247c;
    }

    public final CoroutineDispatcher N() {
        return this.f108270z;
    }

    public final List O() {
        return this.f108256l;
    }

    public final b.a P() {
        return this.f108257m;
    }

    public final a Q(Context context) {
        return new a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (Intrinsics.areEqual(this.f108245a, hVar.f108245a) && Intrinsics.areEqual(this.f108246b, hVar.f108246b) && Intrinsics.areEqual(this.f108247c, hVar.f108247c) && Intrinsics.areEqual(this.f108248d, hVar.f108248d) && Intrinsics.areEqual(this.f108249e, hVar.f108249e) && Intrinsics.areEqual(this.f108250f, hVar.f108250f) && this.f108251g == hVar.f108251g) {
            return (Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f108252h, hVar.f108252h)) && this.f108253i == hVar.f108253i && Intrinsics.areEqual(this.f108254j, hVar.f108254j) && Intrinsics.areEqual(this.f108255k, hVar.f108255k) && Intrinsics.areEqual(this.f108256l, hVar.f108256l) && Intrinsics.areEqual(this.f108257m, hVar.f108257m) && Intrinsics.areEqual(this.f108258n, hVar.f108258n) && Intrinsics.areEqual(this.f108259o, hVar.f108259o) && this.f108260p == hVar.f108260p && this.f108261q == hVar.f108261q && this.f108262r == hVar.f108262r && this.f108263s == hVar.f108263s && this.f108264t == hVar.f108264t && this.f108265u == hVar.f108265u && this.f108266v == hVar.f108266v && Intrinsics.areEqual(this.f108267w, hVar.f108267w) && Intrinsics.areEqual(this.f108268x, hVar.f108268x) && Intrinsics.areEqual(this.f108269y, hVar.f108269y) && Intrinsics.areEqual(this.f108270z, hVar.f108270z) && Intrinsics.areEqual(this.E, hVar.E) && Intrinsics.areEqual(this.F, hVar.F) && Intrinsics.areEqual(this.G, hVar.G) && Intrinsics.areEqual(this.H, hVar.H) && Intrinsics.areEqual(this.I, hVar.I) && Intrinsics.areEqual(this.J, hVar.J) && Intrinsics.areEqual(this.K, hVar.K) && Intrinsics.areEqual(this.A, hVar.A) && Intrinsics.areEqual(this.B, hVar.B) && this.C == hVar.C && Intrinsics.areEqual(this.D, hVar.D) && Intrinsics.areEqual(this.L, hVar.L) && Intrinsics.areEqual(this.M, hVar.M);
        }
        return false;
    }

    public final boolean g() {
        return this.f108260p;
    }

    public final boolean h() {
        return this.f108261q;
    }

    public int hashCode() {
        int iHashCode = ((this.f108245a.hashCode() * 31) + this.f108246b.hashCode()) * 31;
        a0.a aVar = this.f108247c;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.f108248d;
        int iHashCode3 = (iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.f108249e;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f108250f;
        int iHashCode5 = (((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.f108251g.hashCode()) * 31;
        ColorSpace colorSpace = this.f108252h;
        int iHashCode6 = (((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f108253i.hashCode()) * 31;
        Pair pair = this.f108254j;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        i.a aVar2 = this.f108255k;
        int iHashCode8 = (((((((((((((((((((((((((((((((((((((((iHashCode7 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + this.f108256l.hashCode()) * 31) + this.f108257m.hashCode()) * 31) + this.f108258n.hashCode()) * 31) + this.f108259o.hashCode()) * 31) + androidx.compose.foundation.c.a(this.f108260p)) * 31) + androidx.compose.foundation.c.a(this.f108261q)) * 31) + androidx.compose.foundation.c.a(this.f108262r)) * 31) + androidx.compose.foundation.c.a(this.f108263s)) * 31) + this.f108264t.hashCode()) * 31) + this.f108265u.hashCode()) * 31) + this.f108266v.hashCode()) * 31) + this.f108267w.hashCode()) * 31) + this.f108268x.hashCode()) * 31) + this.f108269y.hashCode()) * 31) + this.f108270z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        MemoryCache.Key key2 = this.E;
        int iHashCode9 = (iHashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.F;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.G;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.H;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.I;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.J;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.K;
        return ((((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }

    public final boolean i() {
        return this.f108262r;
    }

    public final Bitmap.Config j() {
        return this.f108251g;
    }

    public final ColorSpace k() {
        return this.f108252h;
    }

    public final Context l() {
        return this.f108245a;
    }

    public final Object m() {
        return this.f108246b;
    }

    public final CoroutineDispatcher n() {
        return this.f108269y;
    }

    public final i.a o() {
        return this.f108255k;
    }

    public final y.b p() {
        return this.M;
    }

    public final c q() {
        return this.L;
    }

    public final String r() {
        return this.f108250f;
    }

    public final y.a s() {
        return this.f108265u;
    }

    public final Drawable t() {
        return c0.h.c(this, this.I, this.H, this.M.f());
    }

    public final Drawable u() {
        return c0.h.c(this, this.K, this.J, this.M.g());
    }

    public final CoroutineDispatcher v() {
        return this.f108268x;
    }

    public final Pair w() {
        return this.f108254j;
    }

    public final t x() {
        return this.f108258n;
    }

    public final CoroutineDispatcher y() {
        return this.f108267w;
    }

    public final Lifecycle z() {
        return this.A;
    }

    private h(Context context, Object obj, a0.a aVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, z.e eVar, Pair pair, i.a aVar2, List list, b.a aVar3, t tVar, q qVar, boolean z10, boolean z11, boolean z12, boolean z13, y.a aVar4, y.a aVar5, y.a aVar6, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, z.j jVar, z.h hVar, n nVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, c cVar, y.b bVar2) {
        this.f108245a = context;
        this.f108246b = obj;
        this.f108247c = aVar;
        this.f108248d = bVar;
        this.f108249e = key;
        this.f108250f = str;
        this.f108251g = config;
        this.f108252h = colorSpace;
        this.f108253i = eVar;
        this.f108254j = pair;
        this.f108255k = aVar2;
        this.f108256l = list;
        this.f108257m = aVar3;
        this.f108258n = tVar;
        this.f108259o = qVar;
        this.f108260p = z10;
        this.f108261q = z11;
        this.f108262r = z12;
        this.f108263s = z13;
        this.f108264t = aVar4;
        this.f108265u = aVar5;
        this.f108266v = aVar6;
        this.f108267w = coroutineDispatcher;
        this.f108268x = coroutineDispatcher2;
        this.f108269y = coroutineDispatcher3;
        this.f108270z = coroutineDispatcher4;
        this.A = lifecycle;
        this.B = jVar;
        this.C = hVar;
        this.D = nVar;
        this.E = key2;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = cVar;
        this.M = bVar2;
    }

    public static final class a {
        private CoroutineDispatcher A;
        private n.a B;
        private MemoryCache.Key C;
        private Integer D;
        private Drawable E;
        private Integer F;
        private Drawable G;
        private Integer H;
        private Drawable I;
        private Lifecycle J;
        private z.j K;
        private z.h L;
        private Lifecycle M;
        private z.j N;
        private z.h O;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f108271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y.b f108272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f108273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a0.a f108274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b f108275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MemoryCache.Key f108276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f108277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Bitmap.Config f108278h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ColorSpace f108279i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private z.e f108280j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Pair f108281k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private i.a f108282l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List f108283m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private b.a f108284n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private t.a f108285o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Map f108286p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f108287q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Boolean f108288r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Boolean f108289s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f108290t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private y.a f108291u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private y.a f108292v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private y.a f108293w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private CoroutineDispatcher f108294x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private CoroutineDispatcher f108295y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private CoroutineDispatcher f108296z;

        public a(Context context) {
            this.f108271a = context;
            this.f108272b = c0.h.b();
            this.f108273c = null;
            this.f108274d = null;
            this.f108275e = null;
            this.f108276f = null;
            this.f108277g = null;
            this.f108278h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f108279i = null;
            }
            this.f108280j = null;
            this.f108281k = null;
            this.f108282l = null;
            this.f108283m = CollectionsKt.emptyList();
            this.f108284n = null;
            this.f108285o = null;
            this.f108286p = null;
            this.f108287q = true;
            this.f108288r = null;
            this.f108289s = null;
            this.f108290t = true;
            this.f108291u = null;
            this.f108292v = null;
            this.f108293w = null;
            this.f108294x = null;
            this.f108295y = null;
            this.f108296z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }

        private final void e() {
            this.O = null;
        }

        private final void f() {
            this.M = null;
            this.N = null;
            this.O = null;
        }

        private final Lifecycle g() {
            a0.a aVar = this.f108274d;
            Lifecycle lifecycleC = c0.d.c(aVar instanceof a0.b ? ((a0.b) aVar).getView().getContext() : this.f108271a);
            return lifecycleC == null ? g.f108243b : lifecycleC;
        }

        private final z.h h() {
            View view;
            z.j jVar = this.K;
            View view2 = null;
            z.l lVar = jVar instanceof z.l ? (z.l) jVar : null;
            if (lVar == null || (view = lVar.getView()) == null) {
                a0.a aVar = this.f108274d;
                a0.b bVar = aVar instanceof a0.b ? (a0.b) aVar : null;
                if (bVar != null) {
                    view2 = bVar.getView();
                }
            } else {
                view2 = view;
            }
            return view2 instanceof ImageView ? c0.i.n((ImageView) view2) : z.h.FIT;
        }

        private final z.j i() {
            ImageView.ScaleType scaleType;
            a0.a aVar = this.f108274d;
            if (!(aVar instanceof a0.b)) {
                return new z.d(this.f108271a);
            }
            View view = ((a0.b) aVar).getView();
            return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? z.k.a(z.i.f119134d) : z.m.b(view, false, 2, null);
        }

        public final h a() {
            Context context = this.f108271a;
            Object obj = this.f108273c;
            if (obj == null) {
                obj = j.f108297a;
            }
            Object obj2 = obj;
            a0.a aVar = this.f108274d;
            b bVar = this.f108275e;
            MemoryCache.Key key = this.f108276f;
            String str = this.f108277g;
            Bitmap.Config configC = this.f108278h;
            if (configC == null) {
                configC = this.f108272b.c();
            }
            Bitmap.Config config = configC;
            ColorSpace colorSpace = this.f108279i;
            z.e eVarM = this.f108280j;
            if (eVarM == null) {
                eVarM = this.f108272b.m();
            }
            z.e eVar = eVarM;
            Pair pair = this.f108281k;
            i.a aVar2 = this.f108282l;
            List list = this.f108283m;
            b.a aVarO = this.f108284n;
            if (aVarO == null) {
                aVarO = this.f108272b.o();
            }
            b.a aVar3 = aVarO;
            t.a aVar4 = this.f108285o;
            t tVarV = c0.i.v(aVar4 != null ? aVar4.e() : null);
            Map map = this.f108286p;
            q qVarX = c0.i.x(map != null ? q.f108328b.a(map) : null);
            boolean z10 = this.f108287q;
            Boolean bool = this.f108288r;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f108272b.a();
            Boolean bool2 = this.f108289s;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.f108272b.b();
            boolean z11 = this.f108290t;
            y.a aVarJ = this.f108291u;
            if (aVarJ == null) {
                aVarJ = this.f108272b.j();
            }
            y.a aVar5 = aVarJ;
            y.a aVarE = this.f108292v;
            if (aVarE == null) {
                aVarE = this.f108272b.e();
            }
            y.a aVar6 = aVarE;
            y.a aVarK = this.f108293w;
            if (aVarK == null) {
                aVarK = this.f108272b.k();
            }
            y.a aVar7 = aVarK;
            CoroutineDispatcher coroutineDispatcherI = this.f108294x;
            if (coroutineDispatcherI == null) {
                coroutineDispatcherI = this.f108272b.i();
            }
            CoroutineDispatcher coroutineDispatcher = coroutineDispatcherI;
            CoroutineDispatcher coroutineDispatcherH = this.f108295y;
            if (coroutineDispatcherH == null) {
                coroutineDispatcherH = this.f108272b.h();
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcherH;
            CoroutineDispatcher coroutineDispatcherD = this.f108296z;
            if (coroutineDispatcherD == null) {
                coroutineDispatcherD = this.f108272b.d();
            }
            CoroutineDispatcher coroutineDispatcher3 = coroutineDispatcherD;
            CoroutineDispatcher coroutineDispatcherN = this.A;
            if (coroutineDispatcherN == null) {
                coroutineDispatcherN = this.f108272b.n();
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcherN;
            Lifecycle lifecycleG = this.J;
            if (lifecycleG == null && (lifecycleG = this.M) == null) {
                lifecycleG = g();
            }
            Lifecycle lifecycle = lifecycleG;
            z.j jVarI = this.K;
            if (jVarI == null && (jVarI = this.N) == null) {
                jVarI = i();
            }
            z.j jVar = jVarI;
            z.h hVarH = this.L;
            if (hVarH == null && (hVarH = this.O) == null) {
                hVarH = h();
            }
            z.h hVar = hVarH;
            n.a aVar8 = this.B;
            return new h(context, obj2, aVar, bVar, key, str, config, colorSpace, eVar, pair, aVar2, list, aVar3, tVarV, qVarX, z10, zBooleanValue, zBooleanValue2, z11, aVar5, aVar6, aVar7, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, jVar, hVar, c0.i.w(aVar8 != null ? aVar8.a() : null), this.C, this.D, this.E, this.F, this.G, this.H, this.I, new c(this.J, this.K, this.L, this.f108294x, this.f108295y, this.f108296z, this.A, this.f108284n, this.f108280j, this.f108278h, this.f108288r, this.f108289s, this.f108291u, this.f108292v, this.f108293w), this.f108272b, null);
        }

        public final a b(Object obj) {
            this.f108273c = obj;
            return this;
        }

        public final a c(y.b bVar) {
            this.f108272b = bVar;
            e();
            return this;
        }

        public final a d(z.e eVar) {
            this.f108280j = eVar;
            return this;
        }

        public final a j(z.h hVar) {
            this.L = hVar;
            return this;
        }

        public final a k(z.j jVar) {
            this.K = jVar;
            f();
            return this;
        }

        public final a l(a0.a aVar) {
            this.f108274d = aVar;
            f();
            return this;
        }

        public a(h hVar, Context context) {
            this.f108271a = context;
            this.f108272b = hVar.p();
            this.f108273c = hVar.m();
            this.f108274d = hVar.M();
            this.f108275e = hVar.A();
            this.f108276f = hVar.B();
            this.f108277g = hVar.r();
            this.f108278h = hVar.q().c();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f108279i = hVar.k();
            }
            this.f108280j = hVar.q().k();
            this.f108281k = hVar.w();
            this.f108282l = hVar.o();
            this.f108283m = hVar.O();
            this.f108284n = hVar.q().o();
            this.f108285o = hVar.x().f();
            this.f108286p = MapsKt.toMutableMap(hVar.L().a());
            this.f108287q = hVar.g();
            this.f108288r = hVar.q().a();
            this.f108289s = hVar.q().b();
            this.f108290t = hVar.I();
            this.f108291u = hVar.q().i();
            this.f108292v = hVar.q().e();
            this.f108293w = hVar.q().j();
            this.f108294x = hVar.q().g();
            this.f108295y = hVar.q().f();
            this.f108296z = hVar.q().d();
            this.A = hVar.q().n();
            this.B = hVar.E().f();
            this.C = hVar.G();
            this.D = hVar.F;
            this.E = hVar.G;
            this.F = hVar.H;
            this.G = hVar.I;
            this.H = hVar.J;
            this.I = hVar.K;
            this.J = hVar.q().h();
            this.K = hVar.q().m();
            this.L = hVar.q().l();
            if (hVar.l() == context) {
                this.M = hVar.z();
                this.N = hVar.K();
                this.O = hVar.J();
            } else {
                this.M = null;
                this.N = null;
                this.O = null;
            }
        }
    }
}
