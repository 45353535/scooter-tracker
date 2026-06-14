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
import k8.a6;
import k8.b9;
import k8.c9;
import k8.ep;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u8 implements JSONSerializable, Hashable, f7 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final b f91572e0 = new b(null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final a6 f91573f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Expression f91574g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Expression f91575h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Expression f91576i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Expression f91577j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Expression f91578k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final ep.e f91579l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Expression f91580m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Expression f91581n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Expression f91582o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Expression f91583p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Expression f91584q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final ep.d f91585r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Function2 f91586s0;
    public final Expression A;
    public final List B;
    public final Expression C;
    private final zh D;
    public final e E;
    public final Expression F;
    public final List G;
    private final hb H;
    public final Expression I;
    private final hb J;
    public final List K;
    public final List L;
    private final Expression M;
    private final Expression N;
    private final List O;
    public final e P;
    private final List Q;
    private final wv R;
    private final y7 S;
    private final r6 T;
    private final r6 U;
    private final List V;
    private final List W;
    private final List X;
    private final Expression Y;
    private final hx Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f91587a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final List f91588a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f91589b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final ep f91590b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6 f91591c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Integer f91592c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f91593d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Integer f91594d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Expression f91595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Expression f91596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f91597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f91598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w6 f91599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f91600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l7 f91601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression f91602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Expression f91603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Expression f91604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression f91605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Expression f91606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f91607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f91608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f91609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final bd f91610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List f91611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ep f91612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f91613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f91614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f91615y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k8 f91616z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91617f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u8 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return u8.f91572e0.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u8 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((b9.i) BuiltInParserKt.getBuiltInParserComponent().m2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public enum c {
        NO_WRAP("no_wrap"),
        WRAP("wrap");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1048c f91618c = new C1048c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f91619d = b.f91626f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f91620e = a.f91625f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f91624b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91625f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String str) {
                return c.f91618c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f91626f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c cVar) {
                return c.f91618c.b(cVar);
            }
        }

        /* JADX INFO: renamed from: k8.u8$c$c, reason: collision with other inner class name */
        public static final class C1048c {
            public /* synthetic */ C1048c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar = c.NO_WRAP;
                if (Intrinsics.areEqual(str, cVar.f91624b)) {
                    return cVar;
                }
                c cVar2 = c.WRAP;
                if (Intrinsics.areEqual(str, cVar2.f91624b)) {
                    return cVar2;
                }
                return null;
            }

            public final String b(c cVar) {
                return cVar.f91624b;
            }

            private C1048c() {
            }
        }

        c(String str) {
            this.f91624b = str;
        }
    }

    public enum d {
        VERTICAL("vertical"),
        HORIZONTAL("horizontal"),
        OVERLAP("overlap");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f91627c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f91628d = b.f91636f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f91629e = a.f91635f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f91634b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91635f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String str) {
                return d.f91627c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f91636f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d dVar) {
                return d.f91627c.b(dVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String str) {
                d dVar = d.VERTICAL;
                if (Intrinsics.areEqual(str, dVar.f91634b)) {
                    return dVar;
                }
                d dVar2 = d.HORIZONTAL;
                if (Intrinsics.areEqual(str, dVar2.f91634b)) {
                    return dVar2;
                }
                d dVar3 = d.OVERLAP;
                if (Intrinsics.areEqual(str, dVar3.f91634b)) {
                    return dVar3;
                }
                return null;
            }

            public final String b(d dVar) {
                return dVar.f91634b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f91634b = str;
        }
    }

    public static final class e implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f91637g = new b(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Expression f91638h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Expression f91639i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Expression f91640j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Function2 f91641k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hb f91642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f91643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression f91644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression f91645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final cb f91646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f91647f;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91648f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return e.f91637g.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((c9.b) BuiltInParserKt.getBuiltInParserComponent().p2().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            Boolean bool = Boolean.FALSE;
            f91638h = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f91639i = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f91640j = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
            f91641k = a.f91648f;
        }

        public e(hb hbVar, Expression expression, Expression expression2, Expression expression3, cb cbVar) {
            this.f91642a = hbVar;
            this.f91643b = expression;
            this.f91644c = expression2;
            this.f91645d = expression3;
            this.f91646e = cbVar;
        }

        public final boolean a(e eVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (eVar == null) {
                return false;
            }
            hb hbVar = this.f91642a;
            return (hbVar != null ? hbVar.a(eVar.f91642a, expressionResolver, expressionResolver2) : eVar.f91642a == null) && ((Boolean) this.f91643b.evaluate(expressionResolver)).booleanValue() == ((Boolean) eVar.f91643b.evaluate(expressionResolver2)).booleanValue() && ((Boolean) this.f91644c.evaluate(expressionResolver)).booleanValue() == ((Boolean) eVar.f91644c.evaluate(expressionResolver2)).booleanValue() && ((Boolean) this.f91645d.evaluate(expressionResolver)).booleanValue() == ((Boolean) eVar.f91645d.evaluate(expressionResolver2)).booleanValue() && this.f91646e.a(eVar.f91646e, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f91647f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(e.class).hashCode();
            hb hbVar = this.f91642a;
            int iHash = iHashCode + (hbVar != null ? hbVar.hash() : 0) + this.f91643b.hashCode() + this.f91644c.hashCode() + this.f91645d.hashCode() + this.f91646e.hash();
            this.f91647f = Integer.valueOf(iHash);
            return iHash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((c9.b) BuiltInParserKt.getBuiltInParserComponent().p2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f91573f0 = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f91574g0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f91575h0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f91576i0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f91577j0 = Expression.Companion.constant$default(companion, e9.START, null, 2, null);
        f91578k0 = Expression.Companion.constant$default(companion, f9.TOP, null, 2, null);
        Expression expression = null;
        f91579l0 = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        f91580m0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f91581n0 = Expression.Companion.constant$default(companion, c.NO_WRAP, null, 2, null);
        f91582o0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f91583p0 = Expression.Companion.constant$default(companion, d.VERTICAL, null, 2, null);
        f91584q0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f91585r0 = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        f91586s0 = a.f91617f;
    }

    public u8(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, w6 w6Var, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str, k8 k8Var, Expression expression9, List list10, Expression expression10, zh zhVar, e eVar, Expression expression11, List list11, hb hbVar, Expression expression12, hb hbVar2, List list12, List list13, Expression expression13, Expression expression14, List list14, e eVar2, List list15, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression15, hx hxVar, List list19, ep epVar2) {
        this.f91587a = g1Var;
        this.f91589b = j1Var;
        this.f91591c = a6Var;
        this.f91593d = list;
        this.f91595e = expression;
        this.f91596f = expression2;
        this.f91597g = expression3;
        this.f91598h = list2;
        this.f91599i = w6Var;
        this.f91600j = list3;
        this.f91601k = l7Var;
        this.f91602l = expression4;
        this.f91603m = expression5;
        this.f91604n = expression6;
        this.f91605o = expression7;
        this.f91606p = expression8;
        this.f91607q = list4;
        this.f91608r = list5;
        this.f91609s = list6;
        this.f91610t = bdVar;
        this.f91611u = list7;
        this.f91612v = epVar;
        this.f91613w = list8;
        this.f91614x = list9;
        this.f91615y = str;
        this.f91616z = k8Var;
        this.A = expression9;
        this.B = list10;
        this.C = expression10;
        this.D = zhVar;
        this.E = eVar;
        this.F = expression11;
        this.G = list11;
        this.H = hbVar;
        this.I = expression12;
        this.J = hbVar2;
        this.K = list12;
        this.L = list13;
        this.M = expression13;
        this.N = expression14;
        this.O = list14;
        this.P = eVar2;
        this.Q = list15;
        this.R = wvVar;
        this.S = y7Var;
        this.T = r6Var;
        this.U = r6Var2;
        this.V = list16;
        this.W = list17;
        this.X = list18;
        this.Y = expression15;
        this.Z = hxVar;
        this.f91588a0 = list19;
        this.f91590b0 = epVar2;
    }

    public static /* synthetic */ u8 z(u8 u8Var, g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, w6 w6Var, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str, k8 k8Var, Expression expression9, List list10, Expression expression10, zh zhVar, e eVar, Expression expression11, List list11, hb hbVar, Expression expression12, hb hbVar2, List list12, List list13, Expression expression13, Expression expression14, List list14, e eVar2, List list15, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression15, hx hxVar, List list19, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? u8Var.o() : g1Var;
        j1 j1Var2 = (i10 & 2) != 0 ? u8Var.f91589b : j1Var;
        a6 a6Var2 = (i10 & 4) != 0 ? u8Var.f91591c : a6Var;
        List list20 = (i10 & 8) != 0 ? u8Var.f91593d : list;
        Expression expressionG = (i10 & 16) != 0 ? u8Var.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? u8Var.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? u8Var.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? u8Var.w() : list2;
        w6 w6Var2 = (i10 & 256) != 0 ? u8Var.f91599i : w6Var;
        List background = (i10 & 512) != 0 ? u8Var.getBackground() : list3;
        l7 l7VarX = (i10 & 1024) != 0 ? u8Var.x() : l7Var;
        Expression expression16 = (i10 & 2048) != 0 ? u8Var.f91602l : expression4;
        Expression expression17 = (i10 & 4096) != 0 ? u8Var.f91603m : expression5;
        g1 g1Var2 = g1VarO;
        Expression expressionB = (i10 & 8192) != 0 ? u8Var.b() : expression6;
        Expression expression18 = (i10 & 16384) != 0 ? u8Var.f91605o : expression7;
        Expression expression19 = (i10 & 32768) != 0 ? u8Var.f91606p : expression8;
        List listK = (i10 & 65536) != 0 ? u8Var.k() : list4;
        Expression expression20 = expression19;
        List list21 = (i10 & 131072) != 0 ? u8Var.f91608r : list5;
        List extensions = (i10 & 262144) != 0 ? u8Var.getExtensions() : list6;
        bd bdVarN = (i10 & 524288) != 0 ? u8Var.n() : bdVar;
        List listU = (i10 & 1048576) != 0 ? u8Var.u() : list7;
        ep height = (i10 & 2097152) != 0 ? u8Var.getHeight() : epVar;
        List list22 = list21;
        List list23 = (i10 & 4194304) != 0 ? u8Var.f91613w : list8;
        List list24 = (i10 & 8388608) != 0 ? u8Var.f91614x : list9;
        String id2 = (i10 & 16777216) != 0 ? u8Var.getId() : str;
        List list25 = list24;
        k8 k8Var2 = (i10 & 33554432) != 0 ? u8Var.f91616z : k8Var;
        Expression expression21 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? u8Var.A : expression9;
        List list26 = (i10 & 134217728) != 0 ? u8Var.B : list10;
        Expression expression22 = (i10 & 268435456) != 0 ? u8Var.C : expression10;
        zh zhVarR = (i10 & 536870912) != 0 ? u8Var.r() : zhVar;
        Expression expression23 = expression22;
        e eVar3 = (i10 & 1073741824) != 0 ? u8Var.E : eVar;
        Expression expression24 = (i10 & Integer.MIN_VALUE) != 0 ? u8Var.F : expression11;
        List list27 = (i11 & 1) != 0 ? u8Var.G : list11;
        hb hbVarD = (i11 & 2) != 0 ? u8Var.d() : hbVar;
        List list28 = list27;
        Expression expression25 = (i11 & 4) != 0 ? u8Var.I : expression12;
        return u8Var.y(g1Var2, j1Var2, a6Var2, list20, expressionG, expressionM, alpha, listW, w6Var2, background, l7VarX, expression16, expression17, expressionB, expression18, expression20, listK, list22, extensions, bdVarN, listU, height, list23, list25, id2, k8Var2, expression21, list26, expression23, zhVarR, eVar3, expression24, list28, hbVarD, expression25, (i11 & 8) != 0 ? u8Var.p() : hbVar2, (i11 & 16) != 0 ? u8Var.K : list12, (i11 & 32) != 0 ? u8Var.L : list13, (i11 & 64) != 0 ? u8Var.f() : expression13, (i11 & 128) != 0 ? u8Var.e() : expression14, (i11 & 256) != 0 ? u8Var.q() : list14, (i11 & 512) != 0 ? u8Var.P : eVar2, (i11 & 1024) != 0 ? u8Var.h() : list15, (i11 & 2048) != 0 ? u8Var.getTransform() : wvVar, (i11 & 4096) != 0 ? u8Var.j() : y7Var, (i11 & 8192) != 0 ? u8Var.v() : r6Var, (i11 & 16384) != 0 ? u8Var.i() : r6Var2, (i11 & 32768) != 0 ? u8Var.l() : list16, (i11 & 65536) != 0 ? u8Var.s() : list17, (i11 & 131072) != 0 ? u8Var.c() : list18, (i11 & 262144) != 0 ? u8Var.getVisibility() : expression15, (i11 & 524288) != 0 ? u8Var.t() : hxVar, (i11 & 1048576) != 0 ? u8Var.a() : list19, (i11 & 2097152) != 0 ? u8Var.getWidth() : epVar2);
    }

    public final boolean A(u8 u8Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        if (u8Var == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(u8Var.o(), expressionResolver, expressionResolver2) : u8Var.o() == null) {
            j1 j1Var = this.f91589b;
            if ((j1Var != null ? j1Var.a(u8Var.f91589b, expressionResolver, expressionResolver2) : u8Var.f91589b == null) && this.f91591c.a(u8Var.f91591c, expressionResolver, expressionResolver2)) {
                List list = this.f91593d;
                if (list != null) {
                    List list2 = u8Var.f91593d;
                    if (list2 != null) {
                        if (list.size() == list2.size()) {
                            int i10 = 0;
                            for (Object obj : list) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((j1) obj).a((j1) list2.get(i10), expressionResolver, expressionResolver2)) {
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
                if (u8Var.f91593d != null) {
                    z10 = false;
                    break;
                }
                z10 = true;
                if (z10) {
                    Expression expressionG = g();
                    y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
                    Expression expressionG2 = u8Var.g();
                    if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                        Expression expressionM = m();
                        z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                        Expression expressionM2 = u8Var.m();
                        if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                            if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) u8Var.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                                List listW = w();
                                if (listW != null) {
                                    List listW2 = u8Var.w();
                                    if (listW2 != null) {
                                        if (listW.size() == listW2.size()) {
                                            int i12 = 0;
                                            for (Object obj2 : listW) {
                                                int i13 = i12 + 1;
                                                if (i12 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                if (((h6) obj2).a((h6) listW2.get(i12), expressionResolver, expressionResolver2)) {
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
                                if (u8Var.w() != null) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                if (z11) {
                                    w6 w6Var = this.f91599i;
                                    if (w6Var != null ? w6Var.a(u8Var.f91599i, expressionResolver, expressionResolver2) : u8Var.f91599i == null) {
                                        List background = getBackground();
                                        if (background != null) {
                                            List background2 = u8Var.getBackground();
                                            if (background2 != null) {
                                                if (background.size() == background2.size()) {
                                                    int i14 = 0;
                                                    for (Object obj3 : background) {
                                                        int i15 = i14 + 1;
                                                        if (i14 < 0) {
                                                            CollectionsKt.throwIndexOverflow();
                                                        }
                                                        if (((a7) obj3).a((a7) background2.get(i14), expressionResolver, expressionResolver2)) {
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
                                        if (u8Var.getBackground() != null) {
                                            z12 = false;
                                            break;
                                        }
                                        z12 = true;
                                        if (z12) {
                                            l7 l7VarX = x();
                                            if ((l7VarX != null ? l7VarX.a(u8Var.x(), expressionResolver, expressionResolver2) : u8Var.x() == null) && ((Boolean) this.f91602l.evaluate(expressionResolver)).booleanValue() == ((Boolean) u8Var.f91602l.evaluate(expressionResolver2)).booleanValue() && ((Boolean) this.f91603m.evaluate(expressionResolver)).booleanValue() == ((Boolean) u8Var.f91603m.evaluate(expressionResolver2)).booleanValue()) {
                                                Expression expressionB = b();
                                                Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                                Expression expressionB2 = u8Var.b();
                                                if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null) && this.f91605o.evaluate(expressionResolver) == u8Var.f91605o.evaluate(expressionResolver2) && this.f91606p.evaluate(expressionResolver) == u8Var.f91606p.evaluate(expressionResolver2)) {
                                                    List listK = k();
                                                    if (listK != null) {
                                                        List listK2 = u8Var.k();
                                                        if (listK2 != null) {
                                                            if (listK.size() == listK2.size()) {
                                                                int i16 = 0;
                                                                for (Object obj4 : listK) {
                                                                    int i17 = i16 + 1;
                                                                    if (i16 < 0) {
                                                                        CollectionsKt.throwIndexOverflow();
                                                                    }
                                                                    if (((ra) obj4).g((ra) listK2.get(i16), expressionResolver, expressionResolver2)) {
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
                                                    if (u8Var.k() != null) {
                                                        z13 = false;
                                                        break;
                                                    }
                                                    z13 = true;
                                                    if (z13) {
                                                        List list3 = this.f91608r;
                                                        if (list3 != null) {
                                                            List list4 = u8Var.f91608r;
                                                            if (list4 != null) {
                                                                if (list3.size() == list4.size()) {
                                                                    int i18 = 0;
                                                                    for (Object obj5 : list3) {
                                                                        int i19 = i18 + 1;
                                                                        if (i18 < 0) {
                                                                            CollectionsKt.throwIndexOverflow();
                                                                        }
                                                                        if (((j1) obj5).a((j1) list4.get(i18), expressionResolver, expressionResolver2)) {
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
                                                        if (u8Var.f91608r != null) {
                                                            z14 = false;
                                                            break;
                                                        }
                                                        z14 = true;
                                                        if (z14) {
                                                            List extensions = getExtensions();
                                                            if (extensions != null) {
                                                                List extensions2 = u8Var.getExtensions();
                                                                if (extensions2 != null) {
                                                                    if (extensions.size() == extensions2.size()) {
                                                                        int i20 = 0;
                                                                        for (Object obj6 : extensions) {
                                                                            int i21 = i20 + 1;
                                                                            if (i20 < 0) {
                                                                                CollectionsKt.throwIndexOverflow();
                                                                            }
                                                                            if (((rb) obj6).a((rb) extensions2.get(i20), expressionResolver, expressionResolver2)) {
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
                                                            if (u8Var.getExtensions() != null) {
                                                                z15 = false;
                                                                break;
                                                            }
                                                            z15 = true;
                                                            if (z15) {
                                                                bd bdVarN = n();
                                                                if (bdVarN != null ? bdVarN.a(u8Var.n(), expressionResolver, expressionResolver2) : u8Var.n() == null) {
                                                                    List listU = u();
                                                                    if (listU != null) {
                                                                        List listU2 = u8Var.u();
                                                                        if (listU2 != null) {
                                                                            if (listU.size() == listU2.size()) {
                                                                                int i22 = 0;
                                                                                for (Object obj7 : listU) {
                                                                                    int i23 = i22 + 1;
                                                                                    if (i22 < 0) {
                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                    }
                                                                                    if (((kd) obj7).a((kd) listU2.get(i22), expressionResolver, expressionResolver2)) {
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
                                                                    if (u8Var.u() != null) {
                                                                        z16 = false;
                                                                        break;
                                                                    }
                                                                    z16 = true;
                                                                    if (z16 && getHeight().a(u8Var.getHeight(), expressionResolver, expressionResolver2)) {
                                                                        List list5 = this.f91613w;
                                                                        if (list5 != null) {
                                                                            List list6 = u8Var.f91613w;
                                                                            if (list6 != null) {
                                                                                if (list5.size() == list6.size()) {
                                                                                    int i24 = 0;
                                                                                    for (Object obj8 : list5) {
                                                                                        int i25 = i24 + 1;
                                                                                        if (i24 < 0) {
                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                        }
                                                                                        if (((j1) obj8).a((j1) list6.get(i24), expressionResolver, expressionResolver2)) {
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
                                                                        if (u8Var.f91613w != null) {
                                                                            z17 = false;
                                                                            break;
                                                                        }
                                                                        z17 = true;
                                                                        if (z17) {
                                                                            List list7 = this.f91614x;
                                                                            if (list7 != null) {
                                                                                List list8 = u8Var.f91614x;
                                                                                if (list8 != null) {
                                                                                    if (list7.size() == list8.size()) {
                                                                                        int i26 = 0;
                                                                                        for (Object obj9 : list7) {
                                                                                            int i27 = i26 + 1;
                                                                                            if (i26 < 0) {
                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                            }
                                                                                            if (((j1) obj9).a((j1) list8.get(i26), expressionResolver, expressionResolver2)) {
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
                                                                            if (u8Var.f91614x != null) {
                                                                                z18 = false;
                                                                                break;
                                                                            }
                                                                            z18 = true;
                                                                            if (z18 && Intrinsics.areEqual(getId(), u8Var.getId())) {
                                                                                k8 k8Var = this.f91616z;
                                                                                if ((k8Var != null ? k8Var.a(u8Var.f91616z, expressionResolver, expressionResolver2) : u8Var.f91616z == null) && ((Number) this.A.evaluate(expressionResolver)).longValue() == ((Number) u8Var.A.evaluate(expressionResolver2)).longValue()) {
                                                                                    List list9 = this.B;
                                                                                    if (list9 != null) {
                                                                                        List list10 = u8Var.B;
                                                                                        if (list10 != null) {
                                                                                            if (list9.size() == list10.size()) {
                                                                                                int i28 = 0;
                                                                                                for (Object obj10 : list9) {
                                                                                                    int i29 = i28 + 1;
                                                                                                    if (i28 < 0) {
                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                    }
                                                                                                    if (((y0) obj10).a((y0) list10.get(i28), expressionResolver, expressionResolver2)) {
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
                                                                                    if (u8Var.B != null) {
                                                                                        z19 = false;
                                                                                        break;
                                                                                    }
                                                                                    z19 = true;
                                                                                    if (z19 && this.C.evaluate(expressionResolver) == u8Var.C.evaluate(expressionResolver2)) {
                                                                                        zh zhVarR = r();
                                                                                        if (zhVarR != null ? zhVarR.a(u8Var.r(), expressionResolver, expressionResolver2) : u8Var.r() == null) {
                                                                                            e eVar = this.E;
                                                                                            if ((eVar != null ? eVar.a(u8Var.E, expressionResolver, expressionResolver2) : u8Var.E == null) && ((Number) this.F.evaluate(expressionResolver)).longValue() == ((Number) u8Var.F.evaluate(expressionResolver2)).longValue()) {
                                                                                                List list11 = this.G;
                                                                                                if (list11 != null) {
                                                                                                    List list12 = u8Var.G;
                                                                                                    if (list12 != null) {
                                                                                                        if (list11.size() == list12.size()) {
                                                                                                            int i30 = 0;
                                                                                                            for (Object obj11 : list11) {
                                                                                                                int i31 = i30 + 1;
                                                                                                                if (i30 < 0) {
                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                }
                                                                                                                if (((j1) obj11).a((j1) list12.get(i30), expressionResolver, expressionResolver2)) {
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
                                                                                                if (u8Var.G != null) {
                                                                                                    z20 = false;
                                                                                                    break;
                                                                                                }
                                                                                                z20 = true;
                                                                                                if (z20) {
                                                                                                    hb hbVarD = d();
                                                                                                    if ((hbVarD != null ? hbVarD.a(u8Var.d(), expressionResolver, expressionResolver2) : u8Var.d() == null) && this.I.evaluate(expressionResolver) == u8Var.I.evaluate(expressionResolver2)) {
                                                                                                        hb hbVarP = p();
                                                                                                        if (hbVarP != null ? hbVarP.a(u8Var.p(), expressionResolver, expressionResolver2) : u8Var.p() == null) {
                                                                                                            List list13 = this.K;
                                                                                                            if (list13 != null) {
                                                                                                                List list14 = u8Var.K;
                                                                                                                if (list14 != null) {
                                                                                                                    if (list13.size() == list14.size()) {
                                                                                                                        int i32 = 0;
                                                                                                                        for (Object obj12 : list13) {
                                                                                                                            int i33 = i32 + 1;
                                                                                                                            if (i32 < 0) {
                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                            }
                                                                                                                            if (((j1) obj12).a((j1) list14.get(i32), expressionResolver, expressionResolver2)) {
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
                                                                                                            if (u8Var.K != null) {
                                                                                                                z21 = false;
                                                                                                                break;
                                                                                                            }
                                                                                                            z21 = true;
                                                                                                            if (z21) {
                                                                                                                List list15 = this.L;
                                                                                                                if (list15 != null) {
                                                                                                                    List list16 = u8Var.L;
                                                                                                                    if (list16 != null) {
                                                                                                                        if (list15.size() == list16.size()) {
                                                                                                                            int i34 = 0;
                                                                                                                            for (Object obj13 : list15) {
                                                                                                                                int i35 = i34 + 1;
                                                                                                                                if (i34 < 0) {
                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                }
                                                                                                                                if (((j1) obj13).a((j1) list16.get(i34), expressionResolver, expressionResolver2)) {
                                                                                                                                    i34 = i35;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            z22 = true;
                                                                                                                        }
                                                                                                                        z22 = false;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    return false;
                                                                                                                }
                                                                                                                if (u8Var.L != null) {
                                                                                                                    z22 = false;
                                                                                                                    break;
                                                                                                                }
                                                                                                                z22 = true;
                                                                                                                if (z22) {
                                                                                                                    Expression expressionF = f();
                                                                                                                    String str = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                                                                    Expression expressionF2 = u8Var.f();
                                                                                                                    if (Intrinsics.areEqual(str, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                                                                        Expression expressionE = e();
                                                                                                                        Long l11 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                                                                        Expression expressionE2 = u8Var.e();
                                                                                                                        if (Intrinsics.areEqual(l11, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null)) {
                                                                                                                            List listQ = q();
                                                                                                                            if (listQ != null) {
                                                                                                                                List listQ2 = u8Var.q();
                                                                                                                                if (listQ2 != null) {
                                                                                                                                    if (listQ.size() == listQ2.size()) {
                                                                                                                                        int i36 = 0;
                                                                                                                                        for (Object obj14 : listQ) {
                                                                                                                                            int i37 = i36 + 1;
                                                                                                                                            if (i36 < 0) {
                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                            }
                                                                                                                                            if (((j1) obj14).a((j1) listQ2.get(i36), expressionResolver, expressionResolver2)) {
                                                                                                                                                i36 = i37;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        z23 = true;
                                                                                                                                    }
                                                                                                                                    z23 = false;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            if (u8Var.q() != null) {
                                                                                                                                z23 = false;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            z23 = true;
                                                                                                                            if (z23) {
                                                                                                                                e eVar2 = this.P;
                                                                                                                                if (eVar2 != null ? eVar2.a(u8Var.P, expressionResolver, expressionResolver2) : u8Var.P == null) {
                                                                                                                                    List listH = h();
                                                                                                                                    if (listH != null) {
                                                                                                                                        List listH2 = u8Var.h();
                                                                                                                                        if (listH2 != null) {
                                                                                                                                            if (listH.size() == listH2.size()) {
                                                                                                                                                int i38 = 0;
                                                                                                                                                for (Object obj15 : listH) {
                                                                                                                                                    int i39 = i38 + 1;
                                                                                                                                                    if (i38 < 0) {
                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                    }
                                                                                                                                                    if (((dv) obj15).a((dv) listH2.get(i38), expressionResolver, expressionResolver2)) {
                                                                                                                                                        i38 = i39;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                z24 = true;
                                                                                                                                            }
                                                                                                                                            z24 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        return false;
                                                                                                                                    }
                                                                                                                                    if (u8Var.h() != null) {
                                                                                                                                        z24 = false;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    z24 = true;
                                                                                                                                    if (z24) {
                                                                                                                                        wv transform = getTransform();
                                                                                                                                        if (transform != null ? transform.a(u8Var.getTransform(), expressionResolver, expressionResolver2) : u8Var.getTransform() == null) {
                                                                                                                                            y7 y7VarJ = j();
                                                                                                                                            if (y7VarJ != null ? y7VarJ.a(u8Var.j(), expressionResolver, expressionResolver2) : u8Var.j() == null) {
                                                                                                                                                r6 r6VarV = v();
                                                                                                                                                if (r6VarV != null ? r6VarV.a(u8Var.v(), expressionResolver, expressionResolver2) : u8Var.v() == null) {
                                                                                                                                                    r6 r6VarI = i();
                                                                                                                                                    if (r6VarI != null ? r6VarI.a(u8Var.i(), expressionResolver, expressionResolver2) : u8Var.i() == null) {
                                                                                                                                                        List listL = l();
                                                                                                                                                        if (listL != null) {
                                                                                                                                                            List listL2 = u8Var.l();
                                                                                                                                                            if (listL2 != null) {
                                                                                                                                                                if (listL.size() == listL2.size()) {
                                                                                                                                                                    int i40 = 0;
                                                                                                                                                                    for (Object obj16 : listL) {
                                                                                                                                                                        int i41 = i40 + 1;
                                                                                                                                                                        if (i40 < 0) {
                                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                                        }
                                                                                                                                                                        if (((aw) obj16) == ((aw) listL2.get(i40))) {
                                                                                                                                                                            i40 = i41;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    z25 = true;
                                                                                                                                                                }
                                                                                                                                                                z25 = false;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            return false;
                                                                                                                                                        }
                                                                                                                                                        if (u8Var.l() != null) {
                                                                                                                                                            z25 = false;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        z25 = true;
                                                                                                                                                        if (z25) {
                                                                                                                                                            List listS = s();
                                                                                                                                                            if (listS != null) {
                                                                                                                                                                List listS2 = u8Var.s();
                                                                                                                                                                if (listS2 != null) {
                                                                                                                                                                    if (listS.size() == listS2.size()) {
                                                                                                                                                                        int i42 = 0;
                                                                                                                                                                        for (Object obj17 : listS) {
                                                                                                                                                                            int i43 = i42 + 1;
                                                                                                                                                                            if (i42 < 0) {
                                                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                                                            }
                                                                                                                                                                            if (((bw) obj17).a((bw) listS2.get(i42), expressionResolver, expressionResolver2)) {
                                                                                                                                                                                i42 = i43;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        z26 = true;
                                                                                                                                                                    }
                                                                                                                                                                    z26 = false;
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                return false;
                                                                                                                                                            }
                                                                                                                                                            if (u8Var.s() != null) {
                                                                                                                                                                z26 = false;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            z26 = true;
                                                                                                                                                            if (z26) {
                                                                                                                                                                List listC = c();
                                                                                                                                                                if (listC != null) {
                                                                                                                                                                    List listC2 = u8Var.c();
                                                                                                                                                                    if (listC2 != null) {
                                                                                                                                                                        if (listC.size() == listC2.size()) {
                                                                                                                                                                            int i44 = 0;
                                                                                                                                                                            for (Object obj18 : listC) {
                                                                                                                                                                                int i45 = i44 + 1;
                                                                                                                                                                                if (i44 < 0) {
                                                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                }
                                                                                                                                                                                if (((kw) obj18).a((kw) listC2.get(i44), expressionResolver, expressionResolver2)) {
                                                                                                                                                                                    i44 = i45;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            z27 = true;
                                                                                                                                                                        }
                                                                                                                                                                        z27 = false;
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    return false;
                                                                                                                                                                }
                                                                                                                                                                if (u8Var.c() != null) {
                                                                                                                                                                    z27 = false;
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                z27 = true;
                                                                                                                                                                if (z27 && getVisibility().evaluate(expressionResolver) == u8Var.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                                                                    hx hxVarT = t();
                                                                                                                                                                    if (hxVarT != null ? hxVarT.g(u8Var.t(), expressionResolver, expressionResolver2) : u8Var.t() == null) {
                                                                                                                                                                        List listA = a();
                                                                                                                                                                        if (listA != null) {
                                                                                                                                                                            List listA2 = u8Var.a();
                                                                                                                                                                            if (listA2 != null) {
                                                                                                                                                                                if (listA.size() == listA2.size()) {
                                                                                                                                                                                    int i46 = 0;
                                                                                                                                                                                    for (Object obj19 : listA) {
                                                                                                                                                                                        int i47 = i46 + 1;
                                                                                                                                                                                        if (i46 < 0) {
                                                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                        }
                                                                                                                                                                                        if (((hx) obj19).g((hx) listA2.get(i46), expressionResolver, expressionResolver2)) {
                                                                                                                                                                                            i46 = i47;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    z28 = true;
                                                                                                                                                                                }
                                                                                                                                                                                z28 = false;
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                            return false;
                                                                                                                                                                        }
                                                                                                                                                                        if (u8Var.a() != null) {
                                                                                                                                                                            z28 = false;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        z28 = true;
                                                                                                                                                                        if (z28 && getWidth().a(u8Var.getWidth(), expressionResolver, expressionResolver2)) {
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
        int iHash10;
        int iHash11;
        int iHash12;
        int iHash13;
        int iHash14;
        int iHash15;
        int iHash16;
        Integer num = this.f91592c0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(u8.class).hashCode();
        g1 g1VarO = o();
        int iHash17 = 0;
        int iHash18 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        j1 j1Var = this.f91589b;
        int iHash19 = iHash18 + (j1Var != null ? j1Var.hash() : 0) + this.f91591c.hash();
        List list = this.f91593d;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((j1) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHash19 + iHash;
        Expression expressionG = g();
        int iHashCode2 = i10 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression expressionM = m();
        int iHashCode3 = iHashCode2 + (expressionM != null ? expressionM.hashCode() : 0) + getAlpha().hashCode();
        List listW = w();
        if (listW != null) {
            Iterator it2 = listW.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((h6) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = iHashCode3 + iHash2;
        w6 w6Var = this.f91599i;
        int iHash20 = i11 + (w6Var != null ? w6Var.hash() : 0);
        List background = getBackground();
        if (background != null) {
            Iterator it3 = background.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((a7) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHash20 + iHash3;
        l7 l7VarX = x();
        int iHash21 = i12 + (l7VarX != null ? l7VarX.hash() : 0) + this.f91602l.hashCode() + this.f91603m.hashCode();
        Expression expressionB = b();
        int iHashCode4 = iHash21 + (expressionB != null ? expressionB.hashCode() : 0) + this.f91605o.hashCode() + this.f91606p.hashCode();
        List listK = k();
        if (listK != null) {
            Iterator it4 = listK.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((ra) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int i13 = iHashCode4 + iHash4;
        List list2 = this.f91608r;
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((j1) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = i13 + iHash5;
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it6 = extensions.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((rb) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i15 = i14 + iHash6;
        bd bdVarN = n();
        int iHash22 = i15 + (bdVarN != null ? bdVarN.hash() : 0);
        List listU = u();
        if (listU != null) {
            Iterator it7 = listU.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((kd) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int iHash23 = iHash22 + iHash7 + getHeight().hash();
        List list3 = this.f91613w;
        if (list3 != null) {
            Iterator it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((j1) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHash23 + iHash8;
        List list4 = this.f91614x;
        if (list4 != null) {
            Iterator it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((j1) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = i16 + iHash9;
        String id2 = getId();
        int iHashCode5 = i17 + (id2 != null ? id2.hashCode() : 0);
        k8 k8Var = this.f91616z;
        int iHash24 = iHashCode5 + (k8Var != null ? k8Var.hash() : 0) + this.A.hashCode() + this.C.hashCode();
        zh zhVarR = r();
        int iHash25 = iHash24 + (zhVarR != null ? zhVarR.hash() : 0);
        e eVar = this.E;
        int iHash26 = iHash25 + (eVar != null ? eVar.hash() : 0) + this.F.hashCode();
        List list5 = this.G;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((j1) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHash26 + iHash10;
        hb hbVarD = d();
        int iHash27 = i18 + (hbVarD != null ? hbVarD.hash() : 0) + this.I.hashCode();
        hb hbVarP = p();
        int iHash28 = iHash27 + (hbVarP != null ? hbVarP.hash() : 0);
        List list6 = this.K;
        if (list6 != null) {
            Iterator it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((j1) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHash28 + iHash11;
        List list7 = this.L;
        if (list7 != null) {
            Iterator it12 = list7.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((j1) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = i19 + iHash12;
        Expression expressionF = f();
        int iHashCode6 = i20 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode7 = iHashCode6 + (expressionE != null ? expressionE.hashCode() : 0);
        List listQ = q();
        if (listQ != null) {
            Iterator it13 = listQ.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((j1) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = iHashCode7 + iHash13;
        e eVar2 = this.P;
        int iHash29 = i21 + (eVar2 != null ? eVar2.hash() : 0);
        List listH = h();
        if (listH != null) {
            Iterator it14 = listH.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((dv) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = iHash29 + iHash14;
        wv transform = getTransform();
        int iHash30 = i22 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash31 = iHash30 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash32 = iHash31 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash33 = iHash32 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode8 = iHash33 + (listL != null ? listL.hashCode() : 0);
        List listS = s();
        if (listS != null) {
            Iterator it15 = listS.iterator();
            iHash15 = 0;
            while (it15.hasNext()) {
                iHash15 += ((bw) it15.next()).hash();
            }
        } else {
            iHash15 = 0;
        }
        int i23 = iHashCode8 + iHash15;
        List listC = c();
        if (listC != null) {
            Iterator it16 = listC.iterator();
            iHash16 = 0;
            while (it16.hasNext()) {
                iHash16 += ((kw) it16.next()).hash();
            }
        } else {
            iHash16 = 0;
        }
        int iHashCode9 = i23 + iHash16 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash34 = iHashCode9 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((hx) it17.next()).hash();
            }
        }
        int iHash35 = iHash34 + iHash17 + getWidth().hash();
        this.f91592c0 = Integer.valueOf(iHash35);
        return iHash35;
    }

    @Override // k8.f7
    public List a() {
        return this.f91588a0;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f91604n;
    }

    @Override // k8.f7
    public List c() {
        return this.X;
    }

    @Override // k8.f7
    public hb d() {
        return this.H;
    }

    @Override // k8.f7
    public Expression e() {
        return this.N;
    }

    @Override // k8.f7
    public Expression f() {
        return this.M;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f91595e;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f91597g;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f91600j;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f91609s;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f91612v;
    }

    @Override // k8.f7
    public String getId() {
        return this.f91615y;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.R;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.Y;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.f91590b0;
    }

    @Override // k8.f7
    public List h() {
        return this.Q;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91594d0;
        if (num != null) {
            return num.intValue();
        }
        int iB = B();
        List list = this.B;
        int iHash = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iHash += ((y0) it.next()).hash();
            }
        }
        int i10 = iB + iHash;
        this.f91594d0 = Integer.valueOf(i10);
        return i10;
    }

    @Override // k8.f7
    public r6 i() {
        return this.U;
    }

    @Override // k8.f7
    public y7 j() {
        return this.S;
    }

    @Override // k8.f7
    public List k() {
        return this.f91607q;
    }

    @Override // k8.f7
    public List l() {
        return this.V;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f91596f;
    }

    @Override // k8.f7
    public bd n() {
        return this.f91610t;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f91587a;
    }

    @Override // k8.f7
    public hb p() {
        return this.J;
    }

    @Override // k8.f7
    public List q() {
        return this.O;
    }

    @Override // k8.f7
    public zh r() {
        return this.D;
    }

    @Override // k8.f7
    public List s() {
        return this.W;
    }

    @Override // k8.f7
    public hx t() {
        return this.Z;
    }

    @Override // k8.f7
    public List u() {
        return this.f91611u;
    }

    @Override // k8.f7
    public r6 v() {
        return this.T;
    }

    @Override // k8.f7
    public List w() {
        return this.f91598h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((b9.i) BuiltInParserKt.getBuiltInParserComponent().m2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f91601k;
    }

    public final u8 y(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, w6 w6Var, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str, k8 k8Var, Expression expression9, List list10, Expression expression10, zh zhVar, e eVar, Expression expression11, List list11, hb hbVar, Expression expression12, hb hbVar2, List list12, List list13, Expression expression13, Expression expression14, List list14, e eVar2, List list15, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression15, hx hxVar, List list19, ep epVar2) {
        return new u8(g1Var, j1Var, a6Var, list, expression, expression2, expression3, list2, w6Var, list3, l7Var, expression4, expression5, expression6, expression7, expression8, list4, list5, list6, bdVar, list7, epVar, list8, list9, str, k8Var, expression9, list10, expression10, zhVar, eVar, expression11, list11, hbVar, expression12, hbVar2, list12, list13, expression13, expression14, list14, eVar2, list15, wvVar, y7Var, r6Var, r6Var2, list16, list17, list18, expression15, hxVar, list19, epVar2);
    }
}
