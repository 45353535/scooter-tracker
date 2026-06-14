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
import k8.cf;
import k8.ep;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class te implements JSONSerializable, Hashable, f7 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final b f91344e0 = new b(null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final a6 f91345f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Expression f91346g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Expression f91347h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Expression f91348i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Expression f91349j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final ep.e f91350k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Expression f91351l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Expression f91352m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Expression f91353n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Expression f91354o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Expression f91355p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Expression f91356q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final ep.d f91357r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Function2 f91358s0;
    private final String A;
    public final Expression B;
    private final zh C;
    public final List D;
    private final hb E;
    private final hb F;
    public final Expression G;
    public final Expression H;
    public final List I;
    public final List J;
    public final Expression K;
    private final Expression L;
    private final Expression M;
    public final Expression N;
    private final List O;
    public final Expression P;
    public final Expression Q;
    private final List R;
    private final wv S;
    private final y7 T;
    private final r6 U;
    private final r6 V;
    private final List W;
    private final List X;
    private final List Y;
    private final Expression Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f91359a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final hx f91360a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f91361b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final List f91362b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6 f91363c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ep f91364c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f91365d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Integer f91366d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Expression f91367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Expression f91368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f91369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f91370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wb f91371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w6 f91372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f91373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final l7 f91374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Expression f91375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Expression f91376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression f91377o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Expression f91378p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f91379q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f91380r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f91381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f91382t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final bd f91383u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f91384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ep f91385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression f91386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f91387y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f91388z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91389f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final te invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return te.f91344e0.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final te a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((cf.i) BuiltInParserKt.getBuiltInParserComponent().X3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f91345f0 = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f91346g0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f91347h0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f91348i0 = Expression.Companion.constant$default(companion, y5.CENTER, null, 2, null);
        f91349j0 = Expression.Companion.constant$default(companion, z5.CENTER, null, 2, null);
        Expression expression = null;
        f91350k0 = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        Boolean bool = Boolean.FALSE;
        f91351l0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f91352m0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f91353n0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f91354o0 = Expression.Companion.constant$default(companion, df.FILL, null, 2, null);
        f91355p0 = Expression.Companion.constant$default(companion, g7.SOURCE_IN, null, 2, null);
        f91356q0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f91357r0 = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        f91358s0 = a.f91389f;
    }

    public te(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, wb wbVar, w6 w6Var, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, List list7, bd bdVar, List list8, ep epVar, Expression expression8, List list9, List list10, String str, Expression expression9, zh zhVar, List list11, hb hbVar, hb hbVar2, Expression expression10, Expression expression11, List list12, List list13, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list14, Expression expression16, Expression expression17, List list15, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression18, hx hxVar, List list19, ep epVar2) {
        this.f91359a = g1Var;
        this.f91361b = j1Var;
        this.f91363c = a6Var;
        this.f91365d = list;
        this.f91367e = expression;
        this.f91368f = expression2;
        this.f91369g = expression3;
        this.f91370h = list2;
        this.f91371i = wbVar;
        this.f91372j = w6Var;
        this.f91373k = list3;
        this.f91374l = l7Var;
        this.f91375m = expression4;
        this.f91376n = expression5;
        this.f91377o = expression6;
        this.f91378p = expression7;
        this.f91379q = list4;
        this.f91380r = list5;
        this.f91381s = list6;
        this.f91382t = list7;
        this.f91383u = bdVar;
        this.f91384v = list8;
        this.f91385w = epVar;
        this.f91386x = expression8;
        this.f91387y = list9;
        this.f91388z = list10;
        this.A = str;
        this.B = expression9;
        this.C = zhVar;
        this.D = list11;
        this.E = hbVar;
        this.F = hbVar2;
        this.G = expression10;
        this.H = expression11;
        this.I = list12;
        this.J = list13;
        this.K = expression12;
        this.L = expression13;
        this.M = expression14;
        this.N = expression15;
        this.O = list14;
        this.P = expression16;
        this.Q = expression17;
        this.R = list15;
        this.S = wvVar;
        this.T = y7Var;
        this.U = r6Var;
        this.V = r6Var2;
        this.W = list16;
        this.X = list17;
        this.Y = list18;
        this.Z = expression18;
        this.f91360a0 = hxVar;
        this.f91362b0 = list19;
        this.f91364c0 = epVar2;
    }

    public static /* synthetic */ te z(te teVar, g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, wb wbVar, w6 w6Var, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, List list7, bd bdVar, List list8, ep epVar, Expression expression8, List list9, List list10, String str, Expression expression9, zh zhVar, List list11, hb hbVar, hb hbVar2, Expression expression10, Expression expression11, List list12, List list13, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list14, Expression expression16, Expression expression17, List list15, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression18, hx hxVar, List list19, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? teVar.o() : g1Var;
        j1 j1Var2 = (i10 & 2) != 0 ? teVar.f91361b : j1Var;
        a6 a6Var2 = (i10 & 4) != 0 ? teVar.f91363c : a6Var;
        List list20 = (i10 & 8) != 0 ? teVar.f91365d : list;
        Expression expressionG = (i10 & 16) != 0 ? teVar.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? teVar.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? teVar.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? teVar.w() : list2;
        wb wbVar2 = (i10 & 256) != 0 ? teVar.f91371i : wbVar;
        w6 w6Var2 = (i10 & 512) != 0 ? teVar.f91372j : w6Var;
        List background = (i10 & 1024) != 0 ? teVar.getBackground() : list3;
        l7 l7VarX = (i10 & 2048) != 0 ? teVar.x() : l7Var;
        Expression expression19 = (i10 & 4096) != 0 ? teVar.f91375m : expression4;
        g1 g1Var2 = g1VarO;
        Expression expressionB = (i10 & 8192) != 0 ? teVar.b() : expression5;
        Expression expression20 = (i10 & 16384) != 0 ? teVar.f91377o : expression6;
        Expression expression21 = (i10 & 32768) != 0 ? teVar.f91378p : expression7;
        List listK = (i10 & 65536) != 0 ? teVar.k() : list4;
        Expression expression22 = expression21;
        List list21 = (i10 & 131072) != 0 ? teVar.f91380r : list5;
        List extensions = (i10 & 262144) != 0 ? teVar.getExtensions() : list6;
        List list22 = list21;
        List list23 = (i10 & 524288) != 0 ? teVar.f91382t : list7;
        bd bdVarN = (i10 & 1048576) != 0 ? teVar.n() : bdVar;
        List listU = (i10 & 2097152) != 0 ? teVar.u() : list8;
        ep height = (i10 & 4194304) != 0 ? teVar.getHeight() : epVar;
        List list24 = list23;
        Expression expression23 = (i10 & 8388608) != 0 ? teVar.f91386x : expression8;
        List list25 = (i10 & 16777216) != 0 ? teVar.f91387y : list9;
        List list26 = (i10 & 33554432) != 0 ? teVar.f91388z : list10;
        String id2 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? teVar.getId() : str;
        List list27 = list26;
        Expression expression24 = (i10 & 134217728) != 0 ? teVar.B : expression9;
        zh zhVarR = (i10 & 268435456) != 0 ? teVar.r() : zhVar;
        Expression expression25 = expression24;
        List list28 = (i10 & 536870912) != 0 ? teVar.D : list11;
        return teVar.y(g1Var2, j1Var2, a6Var2, list20, expressionG, expressionM, alpha, listW, wbVar2, w6Var2, background, l7VarX, expression19, expressionB, expression20, expression22, listK, list22, extensions, list24, bdVarN, listU, height, expression23, list25, list27, id2, expression25, zhVarR, list28, (i10 & 1073741824) != 0 ? teVar.d() : hbVar, (i10 & Integer.MIN_VALUE) != 0 ? teVar.p() : hbVar2, (i11 & 1) != 0 ? teVar.G : expression10, (i11 & 2) != 0 ? teVar.H : expression11, (i11 & 4) != 0 ? teVar.I : list12, (i11 & 8) != 0 ? teVar.J : list13, (i11 & 16) != 0 ? teVar.K : expression12, (i11 & 32) != 0 ? teVar.f() : expression13, (i11 & 64) != 0 ? teVar.e() : expression14, (i11 & 128) != 0 ? teVar.N : expression15, (i11 & 256) != 0 ? teVar.q() : list14, (i11 & 512) != 0 ? teVar.P : expression16, (i11 & 1024) != 0 ? teVar.Q : expression17, (i11 & 2048) != 0 ? teVar.h() : list15, (i11 & 4096) != 0 ? teVar.getTransform() : wvVar, (i11 & 8192) != 0 ? teVar.j() : y7Var, (i11 & 16384) != 0 ? teVar.v() : r6Var, (i11 & 32768) != 0 ? teVar.i() : r6Var2, (i11 & 65536) != 0 ? teVar.l() : list16, (i11 & 131072) != 0 ? teVar.s() : list17, (i11 & 262144) != 0 ? teVar.c() : list18, (i11 & 524288) != 0 ? teVar.getVisibility() : expression18, (i11 & 1048576) != 0 ? teVar.t() : hxVar, (i11 & 2097152) != 0 ? teVar.a() : list19, (i11 & 4194304) != 0 ? teVar.getWidth() : epVar2);
    }

    public final boolean A(te teVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (teVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(teVar.o(), expressionResolver, expressionResolver2) : teVar.o() == null) {
            j1 j1Var = this.f91361b;
            if ((j1Var != null ? j1Var.a(teVar.f91361b, expressionResolver, expressionResolver2) : teVar.f91361b == null) && this.f91363c.a(teVar.f91363c, expressionResolver, expressionResolver2)) {
                List list = this.f91365d;
                if (list != null) {
                    List list2 = teVar.f91365d;
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
                if (teVar.f91365d != null) {
                    z10 = false;
                    break;
                }
                z10 = true;
                if (z10) {
                    Expression expressionG = g();
                    y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
                    Expression expressionG2 = teVar.g();
                    if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                        Expression expressionM = m();
                        z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                        Expression expressionM2 = teVar.m();
                        if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                            if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) teVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                                List listW = w();
                                if (listW != null) {
                                    List listW2 = teVar.w();
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
                                if (teVar.w() != null) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                if (z11) {
                                    wb wbVar = this.f91371i;
                                    if (wbVar != null ? wbVar.a(teVar.f91371i, expressionResolver, expressionResolver2) : teVar.f91371i == null) {
                                        w6 w6Var = this.f91372j;
                                        if (w6Var != null ? w6Var.a(teVar.f91372j, expressionResolver, expressionResolver2) : teVar.f91372j == null) {
                                            List background = getBackground();
                                            if (background != null) {
                                                List background2 = teVar.getBackground();
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
                                            if (teVar.getBackground() != null) {
                                                z12 = false;
                                                break;
                                            }
                                            z12 = true;
                                            if (z12) {
                                                l7 l7VarX = x();
                                                if ((l7VarX != null ? l7VarX.a(teVar.x(), expressionResolver, expressionResolver2) : teVar.x() == null) && ((Boolean) this.f91375m.evaluate(expressionResolver)).booleanValue() == ((Boolean) teVar.f91375m.evaluate(expressionResolver2)).booleanValue()) {
                                                    Expression expressionB = b();
                                                    Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                                    Expression expressionB2 = teVar.b();
                                                    if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null) && this.f91377o.evaluate(expressionResolver) == teVar.f91377o.evaluate(expressionResolver2) && this.f91378p.evaluate(expressionResolver) == teVar.f91378p.evaluate(expressionResolver2)) {
                                                        List listK = k();
                                                        if (listK != null) {
                                                            List listK2 = teVar.k();
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
                                                        if (teVar.k() != null) {
                                                            z13 = false;
                                                            break;
                                                        }
                                                        z13 = true;
                                                        if (z13) {
                                                            List list3 = this.f91380r;
                                                            if (list3 != null) {
                                                                List list4 = teVar.f91380r;
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
                                                            if (teVar.f91380r != null) {
                                                                z14 = false;
                                                                break;
                                                            }
                                                            z14 = true;
                                                            if (z14) {
                                                                List extensions = getExtensions();
                                                                if (extensions != null) {
                                                                    List extensions2 = teVar.getExtensions();
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
                                                                if (teVar.getExtensions() != null) {
                                                                    z15 = false;
                                                                    break;
                                                                }
                                                                z15 = true;
                                                                if (z15) {
                                                                    List list5 = this.f91382t;
                                                                    if (list5 != null) {
                                                                        List list6 = teVar.f91382t;
                                                                        if (list6 != null) {
                                                                            if (list5.size() == list6.size()) {
                                                                                int i22 = 0;
                                                                                for (Object obj7 : list5) {
                                                                                    int i23 = i22 + 1;
                                                                                    if (i22 < 0) {
                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                    }
                                                                                    if (((cc) obj7).a((cc) list6.get(i22), expressionResolver, expressionResolver2)) {
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
                                                                    if (teVar.f91382t != null) {
                                                                        z16 = false;
                                                                        break;
                                                                    }
                                                                    z16 = true;
                                                                    if (z16) {
                                                                        bd bdVarN = n();
                                                                        if (bdVarN != null ? bdVarN.a(teVar.n(), expressionResolver, expressionResolver2) : teVar.n() == null) {
                                                                            List listU = u();
                                                                            if (listU != null) {
                                                                                List listU2 = teVar.u();
                                                                                if (listU2 != null) {
                                                                                    if (listU.size() == listU2.size()) {
                                                                                        int i24 = 0;
                                                                                        for (Object obj8 : listU) {
                                                                                            int i25 = i24 + 1;
                                                                                            if (i24 < 0) {
                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                            }
                                                                                            if (((kd) obj8).a((kd) listU2.get(i24), expressionResolver, expressionResolver2)) {
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
                                                                            if (teVar.u() != null) {
                                                                                z17 = false;
                                                                                break;
                                                                            }
                                                                            z17 = true;
                                                                            if (z17 && getHeight().a(teVar.getHeight(), expressionResolver, expressionResolver2) && ((Boolean) this.f91386x.evaluate(expressionResolver)).booleanValue() == ((Boolean) teVar.f91386x.evaluate(expressionResolver2)).booleanValue()) {
                                                                                List list7 = this.f91387y;
                                                                                if (list7 != null) {
                                                                                    List list8 = teVar.f91387y;
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
                                                                                if (teVar.f91387y != null) {
                                                                                    z18 = false;
                                                                                    break;
                                                                                }
                                                                                z18 = true;
                                                                                if (z18) {
                                                                                    List list9 = this.f91388z;
                                                                                    if (list9 != null) {
                                                                                        List list10 = teVar.f91388z;
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
                                                                                    if (teVar.f91388z != null) {
                                                                                        z19 = false;
                                                                                        break;
                                                                                    }
                                                                                    z19 = true;
                                                                                    if (z19 && Intrinsics.areEqual(getId(), teVar.getId()) && Intrinsics.areEqual(this.B.evaluate(expressionResolver), teVar.B.evaluate(expressionResolver2))) {
                                                                                        zh zhVarR = r();
                                                                                        if (zhVarR != null ? zhVarR.a(teVar.r(), expressionResolver, expressionResolver2) : teVar.r() == null) {
                                                                                            List list11 = this.D;
                                                                                            if (list11 != null) {
                                                                                                List list12 = teVar.D;
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
                                                                                            if (teVar.D != null) {
                                                                                                z20 = false;
                                                                                                break;
                                                                                            }
                                                                                            z20 = true;
                                                                                            if (z20) {
                                                                                                hb hbVarD = d();
                                                                                                if (hbVarD != null ? hbVarD.a(teVar.d(), expressionResolver, expressionResolver2) : teVar.d() == null) {
                                                                                                    hb hbVarP = p();
                                                                                                    if ((hbVarP != null ? hbVarP.a(teVar.p(), expressionResolver, expressionResolver2) : teVar.p() == null) && ((Number) this.G.evaluate(expressionResolver)).intValue() == ((Number) teVar.G.evaluate(expressionResolver2)).intValue() && ((Boolean) this.H.evaluate(expressionResolver)).booleanValue() == ((Boolean) teVar.H.evaluate(expressionResolver2)).booleanValue()) {
                                                                                                        List list13 = this.I;
                                                                                                        if (list13 != null) {
                                                                                                            List list14 = teVar.I;
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
                                                                                                        if (teVar.I != null) {
                                                                                                            z21 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        z21 = true;
                                                                                                        if (z21) {
                                                                                                            List list15 = this.J;
                                                                                                            if (list15 != null) {
                                                                                                                List list16 = teVar.J;
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
                                                                                                            if (teVar.J != null) {
                                                                                                                z22 = false;
                                                                                                                break;
                                                                                                            }
                                                                                                            z22 = true;
                                                                                                            if (z22) {
                                                                                                                Expression expression = this.K;
                                                                                                                String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
                                                                                                                Expression expression2 = teVar.K;
                                                                                                                if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null)) {
                                                                                                                    Expression expressionF = f();
                                                                                                                    String str2 = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                                                                    Expression expressionF2 = teVar.f();
                                                                                                                    if (Intrinsics.areEqual(str2, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                                                                        Expression expressionE = e();
                                                                                                                        Long l11 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                                                                        Expression expressionE2 = teVar.e();
                                                                                                                        if (Intrinsics.areEqual(l11, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null) && this.N.evaluate(expressionResolver) == teVar.N.evaluate(expressionResolver2)) {
                                                                                                                            List listQ = q();
                                                                                                                            if (listQ != null) {
                                                                                                                                List listQ2 = teVar.q();
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
                                                                                                                            if (teVar.q() != null) {
                                                                                                                                z23 = false;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            z23 = true;
                                                                                                                            if (z23) {
                                                                                                                                Expression expression3 = this.P;
                                                                                                                                Integer num = expression3 != null ? (Integer) expression3.evaluate(expressionResolver) : null;
                                                                                                                                Expression expression4 = teVar.P;
                                                                                                                                if (Intrinsics.areEqual(num, expression4 != null ? (Integer) expression4.evaluate(expressionResolver2) : null) && this.Q.evaluate(expressionResolver) == teVar.Q.evaluate(expressionResolver2)) {
                                                                                                                                    List listH = h();
                                                                                                                                    if (listH != null) {
                                                                                                                                        List listH2 = teVar.h();
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
                                                                                                                                    if (teVar.h() != null) {
                                                                                                                                        z24 = false;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    z24 = true;
                                                                                                                                    if (z24) {
                                                                                                                                        wv transform = getTransform();
                                                                                                                                        if (transform != null ? transform.a(teVar.getTransform(), expressionResolver, expressionResolver2) : teVar.getTransform() == null) {
                                                                                                                                            y7 y7VarJ = j();
                                                                                                                                            if (y7VarJ != null ? y7VarJ.a(teVar.j(), expressionResolver, expressionResolver2) : teVar.j() == null) {
                                                                                                                                                r6 r6VarV = v();
                                                                                                                                                if (r6VarV != null ? r6VarV.a(teVar.v(), expressionResolver, expressionResolver2) : teVar.v() == null) {
                                                                                                                                                    r6 r6VarI = i();
                                                                                                                                                    if (r6VarI != null ? r6VarI.a(teVar.i(), expressionResolver, expressionResolver2) : teVar.i() == null) {
                                                                                                                                                        List listL = l();
                                                                                                                                                        if (listL != null) {
                                                                                                                                                            List listL2 = teVar.l();
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
                                                                                                                                                        if (teVar.l() != null) {
                                                                                                                                                            z25 = false;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        z25 = true;
                                                                                                                                                        if (z25) {
                                                                                                                                                            List listS = s();
                                                                                                                                                            if (listS != null) {
                                                                                                                                                                List listS2 = teVar.s();
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
                                                                                                                                                            if (teVar.s() != null) {
                                                                                                                                                                z26 = false;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            z26 = true;
                                                                                                                                                            if (z26) {
                                                                                                                                                                List listC = c();
                                                                                                                                                                if (listC != null) {
                                                                                                                                                                    List listC2 = teVar.c();
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
                                                                                                                                                                if (teVar.c() != null) {
                                                                                                                                                                    z27 = false;
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                z27 = true;
                                                                                                                                                                if (z27 && getVisibility().evaluate(expressionResolver) == teVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                                                                    hx hxVarT = t();
                                                                                                                                                                    if (hxVarT != null ? hxVarT.g(teVar.t(), expressionResolver, expressionResolver2) : teVar.t() == null) {
                                                                                                                                                                        List listA = a();
                                                                                                                                                                        if (listA != null) {
                                                                                                                                                                            List listA2 = teVar.a();
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
                                                                                                                                                                        if (teVar.a() != null) {
                                                                                                                                                                            z28 = false;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        z28 = true;
                                                                                                                                                                        if (z28 && getWidth().a(teVar.getWidth(), expressionResolver, expressionResolver2)) {
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

    public /* synthetic */ int B() {
        return v7.b.a(this);
    }

    @Override // k8.f7
    public List a() {
        return this.f91362b0;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f91376n;
    }

    @Override // k8.f7
    public List c() {
        return this.Y;
    }

    @Override // k8.f7
    public hb d() {
        return this.E;
    }

    @Override // k8.f7
    public Expression e() {
        return this.M;
    }

    @Override // k8.f7
    public Expression f() {
        return this.L;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f91367e;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f91369g;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f91373k;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f91381s;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f91385w;
    }

    @Override // k8.f7
    public String getId() {
        return this.A;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.S;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.Z;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.f91364c0;
    }

    @Override // k8.f7
    public List h() {
        return this.R;
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
        int iHash17;
        Integer num = this.f91366d0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(te.class).hashCode();
        g1 g1VarO = o();
        int iHash18 = 0;
        int iHash19 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        j1 j1Var = this.f91361b;
        int iHash20 = iHash19 + (j1Var != null ? j1Var.hash() : 0) + this.f91363c.hash();
        List list = this.f91365d;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((j1) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHash20 + iHash;
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
        wb wbVar = this.f91371i;
        int iHash21 = i11 + (wbVar != null ? wbVar.hash() : 0);
        w6 w6Var = this.f91372j;
        int iHash22 = iHash21 + (w6Var != null ? w6Var.hash() : 0);
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
        int i12 = iHash22 + iHash3;
        l7 l7VarX = x();
        int iHash23 = i12 + (l7VarX != null ? l7VarX.hash() : 0) + this.f91375m.hashCode();
        Expression expressionB = b();
        int iHashCode4 = iHash23 + (expressionB != null ? expressionB.hashCode() : 0) + this.f91377o.hashCode() + this.f91378p.hashCode();
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
        List list2 = this.f91380r;
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
        List list3 = this.f91382t;
        if (list3 != null) {
            Iterator it7 = list3.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((cc) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i16 = i15 + iHash7;
        bd bdVarN = n();
        int iHash24 = i16 + (bdVarN != null ? bdVarN.hash() : 0);
        List listU = u();
        if (listU != null) {
            Iterator it8 = listU.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((kd) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int iHash25 = iHash24 + iHash8 + getHeight().hash() + this.f91386x.hashCode();
        List list4 = this.f91387y;
        if (list4 != null) {
            Iterator it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((j1) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = iHash25 + iHash9;
        List list5 = this.f91388z;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((j1) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = i17 + iHash10;
        String id2 = getId();
        int iHashCode5 = i18 + (id2 != null ? id2.hashCode() : 0) + this.B.hashCode();
        zh zhVarR = r();
        int iHash26 = iHashCode5 + (zhVarR != null ? zhVarR.hash() : 0);
        List list6 = this.D;
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
        hb hbVarD = d();
        int iHash27 = i19 + (hbVarD != null ? hbVarD.hash() : 0);
        hb hbVarP = p();
        int iHash28 = iHash27 + (hbVarP != null ? hbVarP.hash() : 0) + this.G.hashCode() + this.H.hashCode();
        List list7 = this.I;
        if (list7 != null) {
            Iterator it12 = list7.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((j1) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = iHash28 + iHash12;
        List list8 = this.J;
        if (list8 != null) {
            Iterator it13 = list8.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((j1) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = i20 + iHash13;
        Expression expression = this.K;
        int iHashCode6 = i21 + (expression != null ? expression.hashCode() : 0);
        Expression expressionF = f();
        int iHashCode7 = iHashCode6 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode8 = iHashCode7 + (expressionE != null ? expressionE.hashCode() : 0) + this.N.hashCode();
        List listQ = q();
        if (listQ != null) {
            Iterator it14 = listQ.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((j1) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = iHashCode8 + iHash14;
        Expression expression2 = this.P;
        int iHashCode9 = i22 + (expression2 != null ? expression2.hashCode() : 0) + this.Q.hashCode();
        List listH = h();
        if (listH != null) {
            Iterator it15 = listH.iterator();
            iHash15 = 0;
            while (it15.hasNext()) {
                iHash15 += ((dv) it15.next()).hash();
            }
        } else {
            iHash15 = 0;
        }
        int i23 = iHashCode9 + iHash15;
        wv transform = getTransform();
        int iHash29 = i23 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash30 = iHash29 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash31 = iHash30 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash32 = iHash31 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode10 = iHash32 + (listL != null ? listL.hashCode() : 0);
        List listS = s();
        if (listS != null) {
            Iterator it16 = listS.iterator();
            iHash16 = 0;
            while (it16.hasNext()) {
                iHash16 += ((bw) it16.next()).hash();
            }
        } else {
            iHash16 = 0;
        }
        int i24 = iHashCode10 + iHash16;
        List listC = c();
        if (listC != null) {
            Iterator it17 = listC.iterator();
            iHash17 = 0;
            while (it17.hasNext()) {
                iHash17 += ((kw) it17.next()).hash();
            }
        } else {
            iHash17 = 0;
        }
        int iHashCode11 = i24 + iHash17 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash33 = iHashCode11 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it18 = listA.iterator();
            while (it18.hasNext()) {
                iHash18 += ((hx) it18.next()).hash();
            }
        }
        int iHash34 = iHash33 + iHash18 + getWidth().hash();
        this.f91366d0 = Integer.valueOf(iHash34);
        return iHash34;
    }

    @Override // k8.f7
    public r6 i() {
        return this.V;
    }

    @Override // k8.f7
    public y7 j() {
        return this.T;
    }

    @Override // k8.f7
    public List k() {
        return this.f91379q;
    }

    @Override // k8.f7
    public List l() {
        return this.W;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f91368f;
    }

    @Override // k8.f7
    public bd n() {
        return this.f91383u;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f91359a;
    }

    @Override // k8.f7
    public hb p() {
        return this.F;
    }

    @Override // k8.f7
    public List q() {
        return this.O;
    }

    @Override // k8.f7
    public zh r() {
        return this.C;
    }

    @Override // k8.f7
    public List s() {
        return this.X;
    }

    @Override // k8.f7
    public hx t() {
        return this.f91360a0;
    }

    @Override // k8.f7
    public List u() {
        return this.f91384v;
    }

    @Override // k8.f7
    public r6 v() {
        return this.U;
    }

    @Override // k8.f7
    public List w() {
        return this.f91370h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((cf.i) BuiltInParserKt.getBuiltInParserComponent().X3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f91374l;
    }

    public final te y(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, wb wbVar, w6 w6Var, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, List list7, bd bdVar, List list8, ep epVar, Expression expression8, List list9, List list10, String str, Expression expression9, zh zhVar, List list11, hb hbVar, hb hbVar2, Expression expression10, Expression expression11, List list12, List list13, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list14, Expression expression16, Expression expression17, List list15, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression18, hx hxVar, List list19, ep epVar2) {
        return new te(g1Var, j1Var, a6Var, list, expression, expression2, expression3, list2, wbVar, w6Var, list3, l7Var, expression4, expression5, expression6, expression7, list4, list5, list6, list7, bdVar, list8, epVar, expression8, list9, list10, str, expression9, zhVar, list11, hbVar, hbVar2, expression10, expression11, list12, list13, expression12, expression13, expression14, expression15, list14, expression16, expression17, list15, wvVar, y7Var, r6Var, r6Var2, list16, list17, list18, expression18, hxVar, list19, epVar2);
    }
}
