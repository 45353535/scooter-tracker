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
import k8.ep;
import k8.ho;
import k8.mo;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class go implements JSONSerializable, Hashable, f7 {
    public static final b S = new b(null);
    private static final a6 T;
    private static final Expression U;
    private static final Expression V;
    private static final ep.e W;
    private static final Expression X;
    private static final ep.d Y;
    private static final Function2 Z;
    public final List A;
    public final List B;
    private final Expression C;
    private final Expression D;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f87847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f87848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6 f87849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f87850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Expression f87851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Expression f87852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f87853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f87854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f87855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l7 f87856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression f87857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Expression f87858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f87859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f87860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f87861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f87862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final bd f87863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f87864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ep f87865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f87866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f87867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f87868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final zh f87869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f87870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final hb f87871y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final hb f87872z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87873f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final go invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return go.S.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final go a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((mo.e) BuiltInParserKt.getBuiltInParserComponent().M6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f87874d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Expression f87875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Expression f87876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Function2 f87877g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f87878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f87879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f87880c;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f87881f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f87874d.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((ho.c) BuiltInParserKt.getBuiltInParserComponent().J6().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        /* JADX INFO: renamed from: k8.go$c$c, reason: collision with other inner class name */
        public enum EnumC1040c {
            VERTICAL("vertical"),
            HORIZONTAL("horizontal");


            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1041c f87882c = new C1041c(null);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final Function1 f87883d = b.f87890f;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final Function1 f87884e = a.f87889f;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f87888b;

            /* JADX INFO: renamed from: k8.go$c$c$a */
            static final class a extends Lambda implements Function1 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final a f87889f = new a();

                a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final EnumC1040c invoke(String str) {
                    return EnumC1040c.f87882c.a(str);
                }
            }

            /* JADX INFO: renamed from: k8.go$c$c$b */
            static final class b extends Lambda implements Function1 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final b f87890f = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(EnumC1040c enumC1040c) {
                    return EnumC1040c.f87882c.b(enumC1040c);
                }
            }

            /* JADX INFO: renamed from: k8.go$c$c$c, reason: collision with other inner class name */
            public static final class C1041c {
                public /* synthetic */ C1041c(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final EnumC1040c a(String str) {
                    EnumC1040c enumC1040c = EnumC1040c.VERTICAL;
                    if (Intrinsics.areEqual(str, enumC1040c.f87888b)) {
                        return enumC1040c;
                    }
                    EnumC1040c enumC1040c2 = EnumC1040c.HORIZONTAL;
                    if (Intrinsics.areEqual(str, enumC1040c2.f87888b)) {
                        return enumC1040c2;
                    }
                    return null;
                }

                public final String b(EnumC1040c enumC1040c) {
                    return enumC1040c.f87888b;
                }

                private C1041c() {
                }
            }

            EnumC1040c(String str) {
                this.f87888b = str;
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            f87875e = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
            f87876f = Expression.Companion.constant$default(companion, EnumC1040c.HORIZONTAL, null, 2, null);
            f87877g = a.f87881f;
        }

        public c(Expression expression, Expression expression2) {
            this.f87878a = expression;
            this.f87879b = expression2;
        }

        public final boolean a(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return cVar != null && ((Number) this.f87878a.evaluate(expressionResolver)).intValue() == ((Number) cVar.f87878a.evaluate(expressionResolver2)).intValue() && this.f87879b.evaluate(expressionResolver) == cVar.f87879b.evaluate(expressionResolver2);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f87880c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode() + this.f87878a.hashCode() + this.f87879b.hashCode();
            this.f87880c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((ho.c) BuiltInParserKt.getBuiltInParserComponent().J6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        T = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        U = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        V = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression expression = null;
        W = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        X = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        Y = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        Z = a.f87873f;
    }

    public go(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, l7 l7Var, Expression expression4, Expression expression5, c cVar, List list4, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str, zh zhVar, List list10, hb hbVar, hb hbVar2, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list15, List list16, List list17, Expression expression8, hx hxVar, List list18, ep epVar2) {
        this.f87847a = g1Var;
        this.f87848b = j1Var;
        this.f87849c = a6Var;
        this.f87850d = list;
        this.f87851e = expression;
        this.f87852f = expression2;
        this.f87853g = expression3;
        this.f87854h = list2;
        this.f87855i = list3;
        this.f87856j = l7Var;
        this.f87857k = expression4;
        this.f87858l = expression5;
        this.f87859m = cVar;
        this.f87860n = list4;
        this.f87861o = list5;
        this.f87862p = list6;
        this.f87863q = bdVar;
        this.f87864r = list7;
        this.f87865s = epVar;
        this.f87866t = list8;
        this.f87867u = list9;
        this.f87868v = str;
        this.f87869w = zhVar;
        this.f87870x = list10;
        this.f87871y = hbVar;
        this.f87872z = hbVar2;
        this.A = list11;
        this.B = list12;
        this.C = expression6;
        this.D = expression7;
        this.E = list13;
        this.F = list14;
        this.G = wvVar;
        this.H = y7Var;
        this.I = r6Var;
        this.J = r6Var2;
        this.K = list15;
        this.L = list16;
        this.M = list17;
        this.N = expression8;
        this.O = hxVar;
        this.P = list18;
        this.Q = epVar2;
    }

    public static /* synthetic */ go z(go goVar, g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, l7 l7Var, Expression expression4, Expression expression5, c cVar, List list4, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str, zh zhVar, List list10, hb hbVar, hb hbVar2, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list15, List list16, List list17, Expression expression8, hx hxVar, List list18, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? goVar.o() : g1Var;
        j1 j1Var2 = (i10 & 2) != 0 ? goVar.f87848b : j1Var;
        a6 a6Var2 = (i10 & 4) != 0 ? goVar.f87849c : a6Var;
        List list19 = (i10 & 8) != 0 ? goVar.f87850d : list;
        Expression expressionG = (i10 & 16) != 0 ? goVar.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? goVar.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? goVar.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? goVar.w() : list2;
        List background = (i10 & 256) != 0 ? goVar.getBackground() : list3;
        l7 l7VarX = (i10 & 512) != 0 ? goVar.x() : l7Var;
        Expression expression9 = (i10 & 1024) != 0 ? goVar.f87857k : expression4;
        Expression expressionB = (i10 & 2048) != 0 ? goVar.b() : expression5;
        c cVar2 = (i10 & 4096) != 0 ? goVar.f87859m : cVar;
        g1 g1Var2 = g1VarO;
        List listK = (i10 & 8192) != 0 ? goVar.k() : list4;
        List list20 = (i10 & 16384) != 0 ? goVar.f87861o : list5;
        List extensions = (i10 & 32768) != 0 ? goVar.getExtensions() : list6;
        bd bdVarN = (i10 & 65536) != 0 ? goVar.n() : bdVar;
        List listU = (i10 & 131072) != 0 ? goVar.u() : list7;
        ep height = (i10 & 262144) != 0 ? goVar.getHeight() : epVar;
        List list21 = (i10 & 524288) != 0 ? goVar.f87866t : list8;
        List list22 = (i10 & 1048576) != 0 ? goVar.f87867u : list9;
        return goVar.y(g1Var2, j1Var2, a6Var2, list19, expressionG, expressionM, alpha, listW, background, l7VarX, expression9, expressionB, cVar2, listK, list20, extensions, bdVarN, listU, height, list21, list22, (i10 & 2097152) != 0 ? goVar.getId() : str, (i10 & 4194304) != 0 ? goVar.r() : zhVar, (i10 & 8388608) != 0 ? goVar.f87870x : list10, (i10 & 16777216) != 0 ? goVar.d() : hbVar, (i10 & 33554432) != 0 ? goVar.p() : hbVar2, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? goVar.A : list11, (i10 & 134217728) != 0 ? goVar.B : list12, (i10 & 268435456) != 0 ? goVar.f() : expression6, (i10 & 536870912) != 0 ? goVar.e() : expression7, (i10 & 1073741824) != 0 ? goVar.q() : list13, (i10 & Integer.MIN_VALUE) != 0 ? goVar.h() : list14, (i11 & 1) != 0 ? goVar.getTransform() : wvVar, (i11 & 2) != 0 ? goVar.j() : y7Var, (i11 & 4) != 0 ? goVar.v() : r6Var, (i11 & 8) != 0 ? goVar.i() : r6Var2, (i11 & 16) != 0 ? goVar.l() : list15, (i11 & 32) != 0 ? goVar.s() : list16, (i11 & 64) != 0 ? goVar.c() : list17, (i11 & 128) != 0 ? goVar.getVisibility() : expression8, (i11 & 256) != 0 ? goVar.t() : hxVar, (i11 & 512) != 0 ? goVar.a() : list18, (i11 & 1024) != 0 ? goVar.getWidth() : epVar2);
    }

    public final boolean A(go goVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (goVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(goVar.o(), expressionResolver, expressionResolver2) : goVar.o() == null) {
            j1 j1Var = this.f87848b;
            if ((j1Var != null ? j1Var.a(goVar.f87848b, expressionResolver, expressionResolver2) : goVar.f87848b == null) && this.f87849c.a(goVar.f87849c, expressionResolver, expressionResolver2)) {
                List list = this.f87850d;
                if (list != null) {
                    List list2 = goVar.f87850d;
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
                if (goVar.f87850d != null) {
                    z10 = false;
                    break;
                }
                z10 = true;
                if (z10) {
                    Expression expressionG = g();
                    y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
                    Expression expressionG2 = goVar.g();
                    if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                        Expression expressionM = m();
                        z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                        Expression expressionM2 = goVar.m();
                        if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                            if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) goVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                                List listW = w();
                                if (listW != null) {
                                    List listW2 = goVar.w();
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
                                if (goVar.w() != null) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                if (z11) {
                                    List background = getBackground();
                                    if (background != null) {
                                        List background2 = goVar.getBackground();
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
                                    if (goVar.getBackground() != null) {
                                        z12 = false;
                                        break;
                                    }
                                    z12 = true;
                                    if (z12) {
                                        l7 l7VarX = x();
                                        if ((l7VarX != null ? l7VarX.a(goVar.x(), expressionResolver, expressionResolver2) : goVar.x() == null) && ((Boolean) this.f87857k.evaluate(expressionResolver)).booleanValue() == ((Boolean) goVar.f87857k.evaluate(expressionResolver2)).booleanValue()) {
                                            Expression expressionB = b();
                                            Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                            Expression expressionB2 = goVar.b();
                                            if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null)) {
                                                c cVar = this.f87859m;
                                                if (cVar != null ? cVar.a(goVar.f87859m, expressionResolver, expressionResolver2) : goVar.f87859m == null) {
                                                    List listK = k();
                                                    if (listK != null) {
                                                        List listK2 = goVar.k();
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
                                                    if (goVar.k() != null) {
                                                        z13 = false;
                                                        break;
                                                    }
                                                    z13 = true;
                                                    if (z13) {
                                                        List list3 = this.f87861o;
                                                        if (list3 != null) {
                                                            List list4 = goVar.f87861o;
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
                                                        if (goVar.f87861o != null) {
                                                            z14 = false;
                                                            break;
                                                        }
                                                        z14 = true;
                                                        if (z14) {
                                                            List extensions = getExtensions();
                                                            if (extensions != null) {
                                                                List extensions2 = goVar.getExtensions();
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
                                                            if (goVar.getExtensions() != null) {
                                                                z15 = false;
                                                                break;
                                                            }
                                                            z15 = true;
                                                            if (z15) {
                                                                bd bdVarN = n();
                                                                if (bdVarN != null ? bdVarN.a(goVar.n(), expressionResolver, expressionResolver2) : goVar.n() == null) {
                                                                    List listU = u();
                                                                    if (listU != null) {
                                                                        List listU2 = goVar.u();
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
                                                                    if (goVar.u() != null) {
                                                                        z16 = false;
                                                                        break;
                                                                    }
                                                                    z16 = true;
                                                                    if (z16 && getHeight().a(goVar.getHeight(), expressionResolver, expressionResolver2)) {
                                                                        List list5 = this.f87866t;
                                                                        if (list5 != null) {
                                                                            List list6 = goVar.f87866t;
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
                                                                        if (goVar.f87866t != null) {
                                                                            z17 = false;
                                                                            break;
                                                                        }
                                                                        z17 = true;
                                                                        if (z17) {
                                                                            List list7 = this.f87867u;
                                                                            if (list7 != null) {
                                                                                List list8 = goVar.f87867u;
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
                                                                            if (goVar.f87867u != null) {
                                                                                z18 = false;
                                                                                break;
                                                                            }
                                                                            z18 = true;
                                                                            if (z18 && Intrinsics.areEqual(getId(), goVar.getId())) {
                                                                                zh zhVarR = r();
                                                                                if (zhVarR != null ? zhVarR.a(goVar.r(), expressionResolver, expressionResolver2) : goVar.r() == null) {
                                                                                    List list9 = this.f87870x;
                                                                                    if (list9 != null) {
                                                                                        List list10 = goVar.f87870x;
                                                                                        if (list10 != null) {
                                                                                            if (list9.size() == list10.size()) {
                                                                                                int i28 = 0;
                                                                                                for (Object obj10 : list9) {
                                                                                                    int i29 = i28 + 1;
                                                                                                    if (i28 < 0) {
                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                    }
                                                                                                    if (((j1) obj10).a((j1) list10.get(i28), expressionResolver, expressionResolver2)) {
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
                                                                                    if (goVar.f87870x != null) {
                                                                                        z19 = false;
                                                                                        break;
                                                                                    }
                                                                                    z19 = true;
                                                                                    if (z19) {
                                                                                        hb hbVarD = d();
                                                                                        if (hbVarD != null ? hbVarD.a(goVar.d(), expressionResolver, expressionResolver2) : goVar.d() == null) {
                                                                                            hb hbVarP = p();
                                                                                            if (hbVarP != null ? hbVarP.a(goVar.p(), expressionResolver, expressionResolver2) : goVar.p() == null) {
                                                                                                List list11 = this.A;
                                                                                                if (list11 != null) {
                                                                                                    List list12 = goVar.A;
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
                                                                                                if (goVar.A != null) {
                                                                                                    z20 = false;
                                                                                                    break;
                                                                                                }
                                                                                                z20 = true;
                                                                                                if (z20) {
                                                                                                    List list13 = this.B;
                                                                                                    if (list13 != null) {
                                                                                                        List list14 = goVar.B;
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
                                                                                                    if (goVar.B != null) {
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    z21 = true;
                                                                                                    if (z21) {
                                                                                                        Expression expressionF = f();
                                                                                                        String str = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                                                        Expression expressionF2 = goVar.f();
                                                                                                        if (Intrinsics.areEqual(str, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                                                            Expression expressionE = e();
                                                                                                            Long l11 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                                                            Expression expressionE2 = goVar.e();
                                                                                                            if (Intrinsics.areEqual(l11, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null)) {
                                                                                                                List listQ = q();
                                                                                                                if (listQ != null) {
                                                                                                                    List listQ2 = goVar.q();
                                                                                                                    if (listQ2 != null) {
                                                                                                                        if (listQ.size() == listQ2.size()) {
                                                                                                                            int i34 = 0;
                                                                                                                            for (Object obj13 : listQ) {
                                                                                                                                int i35 = i34 + 1;
                                                                                                                                if (i34 < 0) {
                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                }
                                                                                                                                if (((j1) obj13).a((j1) listQ2.get(i34), expressionResolver, expressionResolver2)) {
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
                                                                                                                if (goVar.q() != null) {
                                                                                                                    z22 = false;
                                                                                                                    break;
                                                                                                                }
                                                                                                                z22 = true;
                                                                                                                if (z22) {
                                                                                                                    List listH = h();
                                                                                                                    if (listH != null) {
                                                                                                                        List listH2 = goVar.h();
                                                                                                                        if (listH2 != null) {
                                                                                                                            if (listH.size() == listH2.size()) {
                                                                                                                                int i36 = 0;
                                                                                                                                for (Object obj14 : listH) {
                                                                                                                                    int i37 = i36 + 1;
                                                                                                                                    if (i36 < 0) {
                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                    }
                                                                                                                                    if (((dv) obj14).a((dv) listH2.get(i36), expressionResolver, expressionResolver2)) {
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
                                                                                                                    if (goVar.h() != null) {
                                                                                                                        z23 = false;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    z23 = true;
                                                                                                                    if (z23) {
                                                                                                                        wv transform = getTransform();
                                                                                                                        if (transform != null ? transform.a(goVar.getTransform(), expressionResolver, expressionResolver2) : goVar.getTransform() == null) {
                                                                                                                            y7 y7VarJ = j();
                                                                                                                            if (y7VarJ != null ? y7VarJ.a(goVar.j(), expressionResolver, expressionResolver2) : goVar.j() == null) {
                                                                                                                                r6 r6VarV = v();
                                                                                                                                if (r6VarV != null ? r6VarV.a(goVar.v(), expressionResolver, expressionResolver2) : goVar.v() == null) {
                                                                                                                                    r6 r6VarI = i();
                                                                                                                                    if (r6VarI != null ? r6VarI.a(goVar.i(), expressionResolver, expressionResolver2) : goVar.i() == null) {
                                                                                                                                        List listL = l();
                                                                                                                                        if (listL != null) {
                                                                                                                                            List listL2 = goVar.l();
                                                                                                                                            if (listL2 != null) {
                                                                                                                                                if (listL.size() == listL2.size()) {
                                                                                                                                                    int i38 = 0;
                                                                                                                                                    for (Object obj15 : listL) {
                                                                                                                                                        int i39 = i38 + 1;
                                                                                                                                                        if (i38 < 0) {
                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                        }
                                                                                                                                                        if (((aw) obj15) == ((aw) listL2.get(i38))) {
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
                                                                                                                                        if (goVar.l() != null) {
                                                                                                                                            z24 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        z24 = true;
                                                                                                                                        if (z24) {
                                                                                                                                            List listS = s();
                                                                                                                                            if (listS != null) {
                                                                                                                                                List listS2 = goVar.s();
                                                                                                                                                if (listS2 != null) {
                                                                                                                                                    if (listS.size() == listS2.size()) {
                                                                                                                                                        int i40 = 0;
                                                                                                                                                        for (Object obj16 : listS) {
                                                                                                                                                            int i41 = i40 + 1;
                                                                                                                                                            if (i40 < 0) {
                                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                                            }
                                                                                                                                                            if (((bw) obj16).a((bw) listS2.get(i40), expressionResolver, expressionResolver2)) {
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
                                                                                                                                            if (goVar.s() != null) {
                                                                                                                                                z25 = false;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            z25 = true;
                                                                                                                                            if (z25) {
                                                                                                                                                List listC = c();
                                                                                                                                                if (listC != null) {
                                                                                                                                                    List listC2 = goVar.c();
                                                                                                                                                    if (listC2 != null) {
                                                                                                                                                        if (listC.size() == listC2.size()) {
                                                                                                                                                            int i42 = 0;
                                                                                                                                                            for (Object obj17 : listC) {
                                                                                                                                                                int i43 = i42 + 1;
                                                                                                                                                                if (i42 < 0) {
                                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                                }
                                                                                                                                                                if (((kw) obj17).a((kw) listC2.get(i42), expressionResolver, expressionResolver2)) {
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
                                                                                                                                                if (goVar.c() != null) {
                                                                                                                                                    z26 = false;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                z26 = true;
                                                                                                                                                if (z26 && getVisibility().evaluate(expressionResolver) == goVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                                                    hx hxVarT = t();
                                                                                                                                                    if (hxVarT != null ? hxVarT.g(goVar.t(), expressionResolver, expressionResolver2) : goVar.t() == null) {
                                                                                                                                                        List listA = a();
                                                                                                                                                        if (listA != null) {
                                                                                                                                                            List listA2 = goVar.a();
                                                                                                                                                            if (listA2 != null) {
                                                                                                                                                                if (listA.size() == listA2.size()) {
                                                                                                                                                                    int i44 = 0;
                                                                                                                                                                    for (Object obj18 : listA) {
                                                                                                                                                                        int i45 = i44 + 1;
                                                                                                                                                                        if (i44 < 0) {
                                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                                        }
                                                                                                                                                                        if (((hx) obj18).g((hx) listA2.get(i44), expressionResolver, expressionResolver2)) {
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
                                                                                                                                                        if (goVar.a() != null) {
                                                                                                                                                            z27 = false;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        z27 = true;
                                                                                                                                                        if (z27 && getWidth().a(goVar.getWidth(), expressionResolver, expressionResolver2)) {
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
        return false;
    }

    public /* synthetic */ int B() {
        return v7.b.a(this);
    }

    @Override // k8.f7
    public List a() {
        return this.P;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f87858l;
    }

    @Override // k8.f7
    public List c() {
        return this.M;
    }

    @Override // k8.f7
    public hb d() {
        return this.f87871y;
    }

    @Override // k8.f7
    public Expression e() {
        return this.D;
    }

    @Override // k8.f7
    public Expression f() {
        return this.C;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f87851e;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f87853g;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f87855i;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f87862p;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f87865s;
    }

    @Override // k8.f7
    public String getId() {
        return this.f87868v;
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
        Integer num = this.R;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(go.class).hashCode();
        g1 g1VarO = o();
        int iHash17 = 0;
        int iHash18 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        j1 j1Var = this.f87848b;
        int iHash19 = iHash18 + (j1Var != null ? j1Var.hash() : 0) + this.f87849c.hash();
        List list = this.f87850d;
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
        int i12 = i11 + iHash3;
        l7 l7VarX = x();
        int iHash20 = i12 + (l7VarX != null ? l7VarX.hash() : 0) + this.f87857k.hashCode();
        Expression expressionB = b();
        int iHashCode4 = iHash20 + (expressionB != null ? expressionB.hashCode() : 0);
        c cVar = this.f87859m;
        int iHash21 = iHashCode4 + (cVar != null ? cVar.hash() : 0);
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
        int i13 = iHash21 + iHash4;
        List list2 = this.f87861o;
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
        List list3 = this.f87866t;
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
        List list4 = this.f87867u;
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
        zh zhVarR = r();
        int iHash24 = iHashCode5 + (zhVarR != null ? zhVarR.hash() : 0);
        List list5 = this.f87870x;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((j1) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHash24 + iHash10;
        hb hbVarD = d();
        int iHash25 = i18 + (hbVarD != null ? hbVarD.hash() : 0);
        hb hbVarP = p();
        int iHash26 = iHash25 + (hbVarP != null ? hbVarP.hash() : 0);
        List list6 = this.A;
        if (list6 != null) {
            Iterator it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((j1) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHash26 + iHash11;
        List list7 = this.B;
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
        int i22 = i21 + iHash14;
        wv transform = getTransform();
        int iHash27 = i22 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash28 = iHash27 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash29 = iHash28 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash30 = iHash29 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode8 = iHash30 + (listL != null ? listL.hashCode() : 0);
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
        int iHash31 = iHashCode9 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((hx) it17.next()).hash();
            }
        }
        int iHash32 = iHash31 + iHash17 + getWidth().hash();
        this.R = Integer.valueOf(iHash32);
        return iHash32;
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
        return this.f87860n;
    }

    @Override // k8.f7
    public List l() {
        return this.K;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f87852f;
    }

    @Override // k8.f7
    public bd n() {
        return this.f87863q;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f87847a;
    }

    @Override // k8.f7
    public hb p() {
        return this.f87872z;
    }

    @Override // k8.f7
    public List q() {
        return this.E;
    }

    @Override // k8.f7
    public zh r() {
        return this.f87869w;
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
        return this.f87864r;
    }

    @Override // k8.f7
    public r6 v() {
        return this.I;
    }

    @Override // k8.f7
    public List w() {
        return this.f87854h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((mo.e) BuiltInParserKt.getBuiltInParserComponent().M6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f87856j;
    }

    public final go y(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, l7 l7Var, Expression expression4, Expression expression5, c cVar, List list4, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str, zh zhVar, List list10, hb hbVar, hb hbVar2, List list11, List list12, Expression expression6, Expression expression7, List list13, List list14, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list15, List list16, List list17, Expression expression8, hx hxVar, List list18, ep epVar2) {
        return new go(g1Var, j1Var, a6Var, list, expression, expression2, expression3, list2, list3, l7Var, expression4, expression5, cVar, list4, list5, list6, bdVar, list7, epVar, list8, list9, str, zhVar, list10, hbVar, hbVar2, list11, list12, expression6, expression7, list13, list14, wvVar, y7Var, r6Var, r6Var2, list15, list16, list17, expression8, hxVar, list18, epVar2);
    }
}
