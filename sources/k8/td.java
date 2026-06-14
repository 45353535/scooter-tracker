package k8;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.ce;
import k8.ep;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class td implements JSONSerializable, Hashable, f7 {
    public static final b T = new b(null);
    private static final Expression U;
    private static final Expression V;
    private static final Expression W;
    private static final ep.e X;
    private static final Expression Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f91274a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f91275b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f91276c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Expression f91277d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final ep.d f91278e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Function2 f91279f0;
    private final Expression A;
    private final Expression B;
    public final Expression C;
    public final Expression D;
    private final List E;
    private final List F;
    private final wv G;
    private final y7 H;
    private final r6 I;
    private final r6 J;
    private final List K;
    private final List L;
    private final List M;
    private final Expression N;
    private final hx O;
    private final List P;
    private final ep Q;
    private Integer R;
    private Integer S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f91280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f91281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f91282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f91283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f91284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f91285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l7 f91286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression f91287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Expression f91288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression f91289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression f91290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression f91291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f91292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f91293n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final bd f91294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f91295p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ep f91296q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f91297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k8 f91298s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Expression f91299t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f91300u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final zh f91301v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final hb f91302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression f91303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final hb f91304y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Expression f91305z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91306f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final td invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return td.T.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final td a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ce.i) BuiltInParserKt.getBuiltInParserComponent().L3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public enum c {
        START("start"),
        CENTER("center"),
        END("end");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1047c f91307c = new C1047c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f91308d = b.f91316f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f91309e = a.f91315f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f91314b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91315f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String str) {
                return c.f91307c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f91316f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c cVar) {
                return c.f91307c.b(cVar);
            }
        }

        /* JADX INFO: renamed from: k8.td$c$c, reason: collision with other inner class name */
        public static final class C1047c {
            public /* synthetic */ C1047c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar = c.START;
                if (Intrinsics.areEqual(str, cVar.f91314b)) {
                    return cVar;
                }
                c cVar2 = c.CENTER;
                if (Intrinsics.areEqual(str, cVar2.f91314b)) {
                    return cVar2;
                }
                c cVar3 = c.END;
                if (Intrinsics.areEqual(str, cVar3.f91314b)) {
                    return cVar3;
                }
                return null;
            }

            public final String b(c cVar) {
                return cVar.f91314b;
            }

            private C1047c() {
            }
        }

        c(String str) {
            this.f91314b = str;
        }
    }

    public enum d {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f91317c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f91318d = b.f91325f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f91319e = a.f91324f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f91323b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91324f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String str) {
                return d.f91317c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f91325f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d dVar) {
                return d.f91317c.b(dVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String str) {
                d dVar = d.HORIZONTAL;
                if (Intrinsics.areEqual(str, dVar.f91323b)) {
                    return dVar;
                }
                d dVar2 = d.VERTICAL;
                if (Intrinsics.areEqual(str, dVar2.f91323b)) {
                    return dVar2;
                }
                return null;
            }

            public final String b(d dVar) {
                return dVar.f91323b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f91323b = str;
        }
    }

    public enum e {
        PAGING("paging"),
        DEFAULT("default");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f91326c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f91327d = b.f91334f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f91328e = a.f91333f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f91332b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91333f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e invoke(String str) {
                return e.f91326c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f91334f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(e eVar) {
                return e.f91326c.b(eVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(String str) {
                e eVar = e.PAGING;
                if (Intrinsics.areEqual(str, eVar.f91332b)) {
                    return eVar;
                }
                e eVar2 = e.DEFAULT;
                if (Intrinsics.areEqual(str, eVar2.f91332b)) {
                    return eVar2;
                }
                return null;
            }

            public final String b(e eVar) {
                return eVar.f91332b;
            }

            private c() {
            }
        }

        e(String str) {
            this.f91332b = str;
        }
    }

    public enum f {
        NONE("none"),
        AUTO("auto");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f91335c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f91336d = b.f91343f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f91337e = a.f91342f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f91341b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91342f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f invoke(String str) {
                return f.f91335c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f91343f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(f fVar) {
                return f.f91335c.b(fVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(String str) {
                f fVar = f.NONE;
                if (Intrinsics.areEqual(str, fVar.f91341b)) {
                    return fVar;
                }
                f fVar2 = f.AUTO;
                if (Intrinsics.areEqual(str, fVar2.f91341b)) {
                    return fVar2;
                }
                return null;
            }

            public final String b(f fVar) {
                return fVar.f91341b;
            }

            private c() {
            }
        }

        f(String str) {
            this.f91341b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        V = Expression.Companion.constant$default(companion, c.START, null, 2, null);
        W = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        X = new ep.e(new nx(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        Z = Expression.Companion.constant$default(companion, d.HORIZONTAL, null, 2, null);
        f91274a0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f91275b0 = Expression.Companion.constant$default(companion, e.DEFAULT, null, 2, null);
        f91276c0 = Expression.Companion.constant$default(companion, f.NONE, null, 2, null);
        f91277d0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f91278e0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f91279f0 = a.f91306f;
    }

    public td(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, bd bdVar, List list5, ep epVar, String str, k8 k8Var, Expression expression9, List list6, zh zhVar, hb hbVar, Expression expression10, hb hbVar2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list7, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression16, hx hxVar, List list12, ep epVar2) {
        this.f91280a = g1Var;
        this.f91281b = expression;
        this.f91282c = expression2;
        this.f91283d = expression3;
        this.f91284e = list;
        this.f91285f = list2;
        this.f91286g = l7Var;
        this.f91287h = expression4;
        this.f91288i = expression5;
        this.f91289j = expression6;
        this.f91290k = expression7;
        this.f91291l = expression8;
        this.f91292m = list3;
        this.f91293n = list4;
        this.f91294o = bdVar;
        this.f91295p = list5;
        this.f91296q = epVar;
        this.f91297r = str;
        this.f91298s = k8Var;
        this.f91299t = expression9;
        this.f91300u = list6;
        this.f91301v = zhVar;
        this.f91302w = hbVar;
        this.f91303x = expression10;
        this.f91304y = hbVar2;
        this.f91305z = expression11;
        this.A = expression12;
        this.B = expression13;
        this.C = expression14;
        this.D = expression15;
        this.E = list7;
        this.F = list8;
        this.G = wvVar;
        this.H = y7Var;
        this.I = r6Var;
        this.J = r6Var2;
        this.K = list9;
        this.L = list10;
        this.M = list11;
        this.N = expression16;
        this.O = hxVar;
        this.P = list12;
        this.Q = epVar2;
    }

    public static /* synthetic */ td z(td tdVar, g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, bd bdVar, List list5, ep epVar, String str, k8 k8Var, Expression expression9, List list6, zh zhVar, hb hbVar, Expression expression10, hb hbVar2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list7, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression16, hx hxVar, List list12, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? tdVar.o() : g1Var;
        Expression expressionG = (i10 & 2) != 0 ? tdVar.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? tdVar.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? tdVar.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? tdVar.w() : list;
        List background = (i10 & 32) != 0 ? tdVar.getBackground() : list2;
        l7 l7VarX = (i10 & 64) != 0 ? tdVar.x() : l7Var;
        Expression expression17 = (i10 & 128) != 0 ? tdVar.f91287h : expression4;
        Expression expressionB = (i10 & 256) != 0 ? tdVar.b() : expression5;
        Expression expression18 = (i10 & 512) != 0 ? tdVar.f91289j : expression6;
        Expression expression19 = (i10 & 1024) != 0 ? tdVar.f91290k : expression7;
        Expression expression20 = (i10 & 2048) != 0 ? tdVar.f91291l : expression8;
        List listK = (i10 & 4096) != 0 ? tdVar.k() : list3;
        g1 g1Var2 = g1VarO;
        List extensions = (i10 & 8192) != 0 ? tdVar.getExtensions() : list4;
        bd bdVarN = (i10 & 16384) != 0 ? tdVar.n() : bdVar;
        List listU = (i10 & 32768) != 0 ? tdVar.u() : list5;
        ep height = (i10 & 65536) != 0 ? tdVar.getHeight() : epVar;
        String id2 = (i10 & 131072) != 0 ? tdVar.getId() : str;
        k8 k8Var2 = (i10 & 262144) != 0 ? tdVar.f91298s : k8Var;
        Expression expression21 = (i10 & 524288) != 0 ? tdVar.f91299t : expression9;
        List list13 = (i10 & 1048576) != 0 ? tdVar.f91300u : list6;
        zh zhVarR = (i10 & 2097152) != 0 ? tdVar.r() : zhVar;
        hb hbVarD = (i10 & 4194304) != 0 ? tdVar.d() : hbVar;
        List list14 = list13;
        Expression expression22 = (i10 & 8388608) != 0 ? tdVar.f91303x : expression10;
        return tdVar.y(g1Var2, expressionG, expressionM, alpha, listW, background, l7VarX, expression17, expressionB, expression18, expression19, expression20, listK, extensions, bdVarN, listU, height, id2, k8Var2, expression21, list14, zhVarR, hbVarD, expression22, (i10 & 16777216) != 0 ? tdVar.p() : hbVar2, (i10 & 33554432) != 0 ? tdVar.f91305z : expression11, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? tdVar.f() : expression12, (i10 & 134217728) != 0 ? tdVar.e() : expression13, (i10 & 268435456) != 0 ? tdVar.C : expression14, (i10 & 536870912) != 0 ? tdVar.D : expression15, (i10 & 1073741824) != 0 ? tdVar.q() : list7, (i10 & Integer.MIN_VALUE) != 0 ? tdVar.h() : list8, (i11 & 1) != 0 ? tdVar.getTransform() : wvVar, (i11 & 2) != 0 ? tdVar.j() : y7Var, (i11 & 4) != 0 ? tdVar.v() : r6Var, (i11 & 8) != 0 ? tdVar.i() : r6Var2, (i11 & 16) != 0 ? tdVar.l() : list9, (i11 & 32) != 0 ? tdVar.s() : list10, (i11 & 64) != 0 ? tdVar.c() : list11, (i11 & 128) != 0 ? tdVar.getVisibility() : expression16, (i11 & 256) != 0 ? tdVar.t() : hxVar, (i11 & 512) != 0 ? tdVar.a() : list12, (i11 & 1024) != 0 ? tdVar.getWidth() : epVar2);
    }

    public final boolean A(td tdVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        if (tdVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(tdVar.o(), expressionResolver, expressionResolver2) : tdVar.o() == null) {
            Expression expressionG = g();
            y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
            Expression expressionG2 = tdVar.g();
            if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                Expression expressionM = m();
                z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                Expression expressionM2 = tdVar.m();
                if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                    if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) tdVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                        List listW = w();
                        if (listW != null) {
                            List listW2 = tdVar.w();
                            if (listW2 != null) {
                                if (listW.size() == listW2.size()) {
                                    int i10 = 0;
                                    for (Object obj : listW) {
                                        int i11 = i10 + 1;
                                        if (i10 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        if (((h6) obj).a((h6) listW2.get(i10), expressionResolver, expressionResolver2)) {
                                            i10 = i11;
                                        }
                                    }
                                    z10 = true;
                                }
                                z10 = false;
                                break;
                            }
                            return false;
                        }
                        if (tdVar.w() != null) {
                            z10 = false;
                            break;
                        }
                        z10 = true;
                        if (z10) {
                            List background = getBackground();
                            if (background != null) {
                                List background2 = tdVar.getBackground();
                                if (background2 != null) {
                                    if (background.size() == background2.size()) {
                                        int i12 = 0;
                                        for (Object obj2 : background) {
                                            int i13 = i12 + 1;
                                            if (i12 < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            if (((a7) obj2).a((a7) background2.get(i12), expressionResolver, expressionResolver2)) {
                                                i12 = i13;
                                            }
                                        }
                                        z11 = true;
                                    }
                                    z11 = false;
                                    break;
                                }
                                return false;
                            }
                            if (tdVar.getBackground() != null) {
                                z11 = false;
                                break;
                            }
                            z11 = true;
                            if (z11) {
                                l7 l7VarX = x();
                                if (l7VarX != null ? l7VarX.a(tdVar.x(), expressionResolver, expressionResolver2) : tdVar.x() == null) {
                                    Expression expression = this.f91287h;
                                    Long l10 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
                                    Expression expression2 = tdVar.f91287h;
                                    if (Intrinsics.areEqual(l10, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
                                        Expression expressionB = b();
                                        Long l11 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                        Expression expressionB2 = tdVar.b();
                                        if (Intrinsics.areEqual(l11, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null) && this.f91289j.evaluate(expressionResolver) == tdVar.f91289j.evaluate(expressionResolver2)) {
                                            Expression expression3 = this.f91290k;
                                            Long l12 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
                                            Expression expression4 = tdVar.f91290k;
                                            if (Intrinsics.areEqual(l12, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null) && ((Number) this.f91291l.evaluate(expressionResolver)).longValue() == ((Number) tdVar.f91291l.evaluate(expressionResolver2)).longValue()) {
                                                List listK = k();
                                                if (listK != null) {
                                                    List listK2 = tdVar.k();
                                                    if (listK2 != null) {
                                                        if (listK.size() == listK2.size()) {
                                                            int i14 = 0;
                                                            for (Object obj3 : listK) {
                                                                int i15 = i14 + 1;
                                                                if (i14 < 0) {
                                                                    CollectionsKt.throwIndexOverflow();
                                                                }
                                                                if (((ra) obj3).g((ra) listK2.get(i14), expressionResolver, expressionResolver2)) {
                                                                    i14 = i15;
                                                                }
                                                            }
                                                            z12 = true;
                                                        }
                                                        z12 = false;
                                                        break;
                                                    }
                                                    return false;
                                                }
                                                if (tdVar.k() != null) {
                                                    z12 = false;
                                                    break;
                                                }
                                                z12 = true;
                                                if (z12) {
                                                    List extensions = getExtensions();
                                                    if (extensions != null) {
                                                        List extensions2 = tdVar.getExtensions();
                                                        if (extensions2 != null) {
                                                            if (extensions.size() == extensions2.size()) {
                                                                int i16 = 0;
                                                                for (Object obj4 : extensions) {
                                                                    int i17 = i16 + 1;
                                                                    if (i16 < 0) {
                                                                        CollectionsKt.throwIndexOverflow();
                                                                    }
                                                                    if (((rb) obj4).a((rb) extensions2.get(i16), expressionResolver, expressionResolver2)) {
                                                                        i16 = i17;
                                                                    }
                                                                }
                                                                z13 = true;
                                                            }
                                                            z13 = false;
                                                            break;
                                                        }
                                                        return false;
                                                    }
                                                    if (tdVar.getExtensions() != null) {
                                                        z13 = false;
                                                        break;
                                                    }
                                                    z13 = true;
                                                    if (z13) {
                                                        bd bdVarN = n();
                                                        if (bdVarN != null ? bdVarN.a(tdVar.n(), expressionResolver, expressionResolver2) : tdVar.n() == null) {
                                                            List listU = u();
                                                            if (listU != null) {
                                                                List listU2 = tdVar.u();
                                                                if (listU2 != null) {
                                                                    if (listU.size() == listU2.size()) {
                                                                        int i18 = 0;
                                                                        for (Object obj5 : listU) {
                                                                            int i19 = i18 + 1;
                                                                            if (i18 < 0) {
                                                                                CollectionsKt.throwIndexOverflow();
                                                                            }
                                                                            if (((kd) obj5).a((kd) listU2.get(i18), expressionResolver, expressionResolver2)) {
                                                                                i18 = i19;
                                                                            }
                                                                        }
                                                                        z14 = true;
                                                                    }
                                                                    z14 = false;
                                                                    break;
                                                                }
                                                                return false;
                                                            }
                                                            if (tdVar.u() != null) {
                                                                z14 = false;
                                                                break;
                                                            }
                                                            z14 = true;
                                                            if (z14 && getHeight().a(tdVar.getHeight(), expressionResolver, expressionResolver2) && Intrinsics.areEqual(getId(), tdVar.getId())) {
                                                                k8 k8Var = this.f91298s;
                                                                if ((k8Var != null ? k8Var.a(tdVar.f91298s, expressionResolver, expressionResolver2) : tdVar.f91298s == null) && ((Number) this.f91299t.evaluate(expressionResolver)).longValue() == ((Number) tdVar.f91299t.evaluate(expressionResolver2)).longValue()) {
                                                                    List list = this.f91300u;
                                                                    if (list != null) {
                                                                        List list2 = tdVar.f91300u;
                                                                        if (list2 != null) {
                                                                            if (list.size() == list2.size()) {
                                                                                int i20 = 0;
                                                                                for (Object obj6 : list) {
                                                                                    int i21 = i20 + 1;
                                                                                    if (i20 < 0) {
                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                    }
                                                                                    if (((y0) obj6).a((y0) list2.get(i20), expressionResolver, expressionResolver2)) {
                                                                                        i20 = i21;
                                                                                    }
                                                                                }
                                                                                z15 = true;
                                                                            }
                                                                            z15 = false;
                                                                            break;
                                                                        }
                                                                        return false;
                                                                    }
                                                                    if (tdVar.f91300u != null) {
                                                                        z15 = false;
                                                                        break;
                                                                    }
                                                                    z15 = true;
                                                                    if (z15) {
                                                                        zh zhVarR = r();
                                                                        if (zhVarR != null ? zhVarR.a(tdVar.r(), expressionResolver, expressionResolver2) : tdVar.r() == null) {
                                                                            hb hbVarD = d();
                                                                            if ((hbVarD != null ? hbVarD.a(tdVar.d(), expressionResolver, expressionResolver2) : tdVar.d() == null) && this.f91303x.evaluate(expressionResolver) == tdVar.f91303x.evaluate(expressionResolver2)) {
                                                                                hb hbVarP = p();
                                                                                if ((hbVarP != null ? hbVarP.a(tdVar.p(), expressionResolver, expressionResolver2) : tdVar.p() == null) && ((Boolean) this.f91305z.evaluate(expressionResolver)).booleanValue() == ((Boolean) tdVar.f91305z.evaluate(expressionResolver2)).booleanValue()) {
                                                                                    Expression expressionF = f();
                                                                                    String str = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                                    Expression expressionF2 = tdVar.f();
                                                                                    if (Intrinsics.areEqual(str, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                                        Expression expressionE = e();
                                                                                        Long l13 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                                        Expression expressionE2 = tdVar.e();
                                                                                        if (Intrinsics.areEqual(l13, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null) && this.C.evaluate(expressionResolver) == tdVar.C.evaluate(expressionResolver2) && this.D.evaluate(expressionResolver) == tdVar.D.evaluate(expressionResolver2)) {
                                                                                            List listQ = q();
                                                                                            if (listQ != null) {
                                                                                                List listQ2 = tdVar.q();
                                                                                                if (listQ2 != null) {
                                                                                                    if (listQ.size() == listQ2.size()) {
                                                                                                        int i22 = 0;
                                                                                                        for (Object obj7 : listQ) {
                                                                                                            int i23 = i22 + 1;
                                                                                                            if (i22 < 0) {
                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                            }
                                                                                                            if (((j1) obj7).a((j1) listQ2.get(i22), expressionResolver, expressionResolver2)) {
                                                                                                                i22 = i23;
                                                                                                            }
                                                                                                        }
                                                                                                        z16 = true;
                                                                                                    }
                                                                                                    z16 = false;
                                                                                                    break;
                                                                                                }
                                                                                                return false;
                                                                                            }
                                                                                            if (tdVar.q() != null) {
                                                                                                z16 = false;
                                                                                                break;
                                                                                            }
                                                                                            z16 = true;
                                                                                            if (z16) {
                                                                                                List listH = h();
                                                                                                if (listH != null) {
                                                                                                    List listH2 = tdVar.h();
                                                                                                    if (listH2 != null) {
                                                                                                        if (listH.size() == listH2.size()) {
                                                                                                            int i24 = 0;
                                                                                                            for (Object obj8 : listH) {
                                                                                                                int i25 = i24 + 1;
                                                                                                                if (i24 < 0) {
                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                }
                                                                                                                if (((dv) obj8).a((dv) listH2.get(i24), expressionResolver, expressionResolver2)) {
                                                                                                                    i24 = i25;
                                                                                                                }
                                                                                                            }
                                                                                                            z17 = true;
                                                                                                        }
                                                                                                        z17 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    return false;
                                                                                                }
                                                                                                if (tdVar.h() != null) {
                                                                                                    z17 = false;
                                                                                                    break;
                                                                                                }
                                                                                                z17 = true;
                                                                                                if (z17) {
                                                                                                    wv transform = getTransform();
                                                                                                    if (transform != null ? transform.a(tdVar.getTransform(), expressionResolver, expressionResolver2) : tdVar.getTransform() == null) {
                                                                                                        y7 y7VarJ = j();
                                                                                                        if (y7VarJ != null ? y7VarJ.a(tdVar.j(), expressionResolver, expressionResolver2) : tdVar.j() == null) {
                                                                                                            r6 r6VarV = v();
                                                                                                            if (r6VarV != null ? r6VarV.a(tdVar.v(), expressionResolver, expressionResolver2) : tdVar.v() == null) {
                                                                                                                r6 r6VarI = i();
                                                                                                                if (r6VarI != null ? r6VarI.a(tdVar.i(), expressionResolver, expressionResolver2) : tdVar.i() == null) {
                                                                                                                    List listL = l();
                                                                                                                    if (listL != null) {
                                                                                                                        List listL2 = tdVar.l();
                                                                                                                        if (listL2 != null) {
                                                                                                                            if (listL.size() == listL2.size()) {
                                                                                                                                int i26 = 0;
                                                                                                                                for (Object obj9 : listL) {
                                                                                                                                    int i27 = i26 + 1;
                                                                                                                                    if (i26 < 0) {
                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                    }
                                                                                                                                    if (((aw) obj9) == ((aw) listL2.get(i26))) {
                                                                                                                                        i26 = i27;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                z18 = true;
                                                                                                                            }
                                                                                                                            z18 = false;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        return false;
                                                                                                                    }
                                                                                                                    if (tdVar.l() != null) {
                                                                                                                        z18 = false;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    z18 = true;
                                                                                                                    if (z18) {
                                                                                                                        List listS = s();
                                                                                                                        if (listS != null) {
                                                                                                                            List listS2 = tdVar.s();
                                                                                                                            if (listS2 != null) {
                                                                                                                                if (listS.size() == listS2.size()) {
                                                                                                                                    int i28 = 0;
                                                                                                                                    for (Object obj10 : listS) {
                                                                                                                                        int i29 = i28 + 1;
                                                                                                                                        if (i28 < 0) {
                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                        }
                                                                                                                                        if (((bw) obj10).a((bw) listS2.get(i28), expressionResolver, expressionResolver2)) {
                                                                                                                                            i28 = i29;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    z19 = true;
                                                                                                                                }
                                                                                                                                z19 = false;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            return false;
                                                                                                                        }
                                                                                                                        if (tdVar.s() != null) {
                                                                                                                            z19 = false;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        z19 = true;
                                                                                                                        if (z19) {
                                                                                                                            List listC = c();
                                                                                                                            if (listC != null) {
                                                                                                                                List listC2 = tdVar.c();
                                                                                                                                if (listC2 != null) {
                                                                                                                                    if (listC.size() == listC2.size()) {
                                                                                                                                        int i30 = 0;
                                                                                                                                        for (Object obj11 : listC) {
                                                                                                                                            int i31 = i30 + 1;
                                                                                                                                            if (i30 < 0) {
                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                            }
                                                                                                                                            if (((kw) obj11).a((kw) listC2.get(i30), expressionResolver, expressionResolver2)) {
                                                                                                                                                i30 = i31;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        z20 = true;
                                                                                                                                    }
                                                                                                                                    z20 = false;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            if (tdVar.c() != null) {
                                                                                                                                z20 = false;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            z20 = true;
                                                                                                                            if (z20 && getVisibility().evaluate(expressionResolver) == tdVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                                hx hxVarT = t();
                                                                                                                                if (hxVarT != null ? hxVarT.g(tdVar.t(), expressionResolver, expressionResolver2) : tdVar.t() == null) {
                                                                                                                                    List listA = a();
                                                                                                                                    if (listA != null) {
                                                                                                                                        List listA2 = tdVar.a();
                                                                                                                                        if (listA2 != null) {
                                                                                                                                            if (listA.size() == listA2.size()) {
                                                                                                                                                int i32 = 0;
                                                                                                                                                for (Object obj12 : listA) {
                                                                                                                                                    int i33 = i32 + 1;
                                                                                                                                                    if (i32 < 0) {
                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                    }
                                                                                                                                                    if (((hx) obj12).g((hx) listA2.get(i32), expressionResolver, expressionResolver2)) {
                                                                                                                                                        i32 = i33;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                z21 = true;
                                                                                                                                            }
                                                                                                                                            z21 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        return false;
                                                                                                                                    }
                                                                                                                                    if (tdVar.a() != null) {
                                                                                                                                        z21 = false;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    z21 = true;
                                                                                                                                    if (z21 && getWidth().a(tdVar.getWidth(), expressionResolver, expressionResolver2)) {
                                                                                                                                        return true;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int B() {
        int iHash;
        int iHash2;
        int iHash3;
        int iHash4;
        int iHash5;
        int iHash6;
        int iHash7;
        int iHash8;
        int iHash9;
        Integer num = this.R;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(td.class).hashCode();
        g1 g1VarO = o();
        int iHash10 = 0;
        int iHash11 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        Expression expressionG = g();
        int iHashCode2 = iHash11 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression expressionM = m();
        int iHashCode3 = iHashCode2 + (expressionM != null ? expressionM.hashCode() : 0) + getAlpha().hashCode();
        List listW = w();
        if (listW != null) {
            Iterator it = listW.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((h6) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode3 + iHash;
        List background = getBackground();
        if (background != null) {
            Iterator it2 = background.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((a7) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = i10 + iHash2;
        l7 l7VarX = x();
        int iHash12 = i11 + (l7VarX != null ? l7VarX.hash() : 0);
        Expression expression = this.f91287h;
        int iHashCode4 = iHash12 + (expression != null ? expression.hashCode() : 0);
        Expression expressionB = b();
        int iHashCode5 = iHashCode4 + (expressionB != null ? expressionB.hashCode() : 0) + this.f91289j.hashCode();
        Expression expression2 = this.f91290k;
        int iHashCode6 = iHashCode5 + (expression2 != null ? expression2.hashCode() : 0) + this.f91291l.hashCode();
        List listK = k();
        if (listK != null) {
            Iterator it3 = listK.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((ra) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHashCode6 + iHash3;
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it4 = extensions.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((rb) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int i13 = i12 + iHash4;
        bd bdVarN = n();
        int iHash13 = i13 + (bdVarN != null ? bdVarN.hash() : 0);
        List listU = u();
        if (listU != null) {
            Iterator it5 = listU.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((kd) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int iHash14 = iHash13 + iHash5 + getHeight().hash();
        String id2 = getId();
        int iHashCode7 = iHash14 + (id2 != null ? id2.hashCode() : 0);
        k8 k8Var = this.f91298s;
        int iHash15 = iHashCode7 + (k8Var != null ? k8Var.hash() : 0) + this.f91299t.hashCode();
        zh zhVarR = r();
        int iHash16 = iHash15 + (zhVarR != null ? zhVarR.hash() : 0);
        hb hbVarD = d();
        int iHash17 = iHash16 + (hbVarD != null ? hbVarD.hash() : 0) + this.f91303x.hashCode();
        hb hbVarP = p();
        int iHash18 = iHash17 + (hbVarP != null ? hbVarP.hash() : 0) + this.f91305z.hashCode();
        Expression expressionF = f();
        int iHashCode8 = iHash18 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0) + this.C.hashCode() + this.D.hashCode();
        List listQ = q();
        if (listQ != null) {
            Iterator it6 = listQ.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((j1) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i14 = iHashCode9 + iHash6;
        List listH = h();
        if (listH != null) {
            Iterator it7 = listH.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((dv) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i15 = i14 + iHash7;
        wv transform = getTransform();
        int iHash19 = i15 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash20 = iHash19 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash21 = iHash20 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash22 = iHash21 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode10 = iHash22 + (listL != null ? listL.hashCode() : 0);
        List listS = s();
        if (listS != null) {
            Iterator it8 = listS.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((bw) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHashCode10 + iHash8;
        List listC = c();
        if (listC != null) {
            Iterator it9 = listC.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((kw) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int iHashCode11 = i16 + iHash9 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash23 = iHashCode11 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((hx) it10.next()).hash();
            }
        }
        int iHash24 = iHash23 + iHash10 + getWidth().hash();
        this.R = Integer.valueOf(iHash24);
        return iHash24;
    }

    @Override // k8.f7
    public List a() {
        return this.P;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f91288i;
    }

    @Override // k8.f7
    public List c() {
        return this.M;
    }

    @Override // k8.f7
    public hb d() {
        return this.f91302w;
    }

    @Override // k8.f7
    public Expression e() {
        return this.B;
    }

    @Override // k8.f7
    public Expression f() {
        return this.A;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f91281b;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f91283d;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f91285f;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f91293n;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f91296q;
    }

    @Override // k8.f7
    public String getId() {
        return this.f91297r;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.G;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.N;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.Q;
    }

    @Override // k8.f7
    public List h() {
        return this.F;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int iB = B();
        List list = this.f91300u;
        int iHash = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iHash += ((y0) it.next()).hash();
            }
        }
        int i10 = iB + iHash;
        this.S = Integer.valueOf(i10);
        return i10;
    }

    @Override // k8.f7
    public r6 i() {
        return this.J;
    }

    @Override // k8.f7
    public y7 j() {
        return this.H;
    }

    @Override // k8.f7
    public List k() {
        return this.f91292m;
    }

    @Override // k8.f7
    public List l() {
        return this.K;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f91282c;
    }

    @Override // k8.f7
    public bd n() {
        return this.f91294o;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f91280a;
    }

    @Override // k8.f7
    public hb p() {
        return this.f91304y;
    }

    @Override // k8.f7
    public List q() {
        return this.E;
    }

    @Override // k8.f7
    public zh r() {
        return this.f91301v;
    }

    @Override // k8.f7
    public List s() {
        return this.L;
    }

    @Override // k8.f7
    public hx t() {
        return this.O;
    }

    @Override // k8.f7
    public List u() {
        return this.f91295p;
    }

    @Override // k8.f7
    public r6 v() {
        return this.I;
    }

    @Override // k8.f7
    public List w() {
        return this.f91284e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ce.i) BuiltInParserKt.getBuiltInParserComponent().L3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f91286g;
    }

    public final td y(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, bd bdVar, List list5, ep epVar, String str, k8 k8Var, Expression expression9, List list6, zh zhVar, hb hbVar, Expression expression10, hb hbVar2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list7, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression16, hx hxVar, List list12, ep epVar2) {
        return new td(g1Var, expression, expression2, expression3, list, list2, l7Var, expression4, expression5, expression6, expression7, expression8, list3, list4, bdVar, list5, epVar, str, k8Var, expression9, list6, zhVar, hbVar, expression10, hbVar2, expression11, expression12, expression13, expression14, expression15, list7, list8, wvVar, y7Var, r6Var, r6Var2, list9, list10, list11, expression16, hxVar, list12, epVar2);
    }
}
