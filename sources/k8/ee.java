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
import k8.je;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ee implements JSONSerializable, Hashable, f7 {
    public static final b Z = new b(null);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final a6 f87222a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f87223b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f87224c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Expression f87225d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Expression f87226e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final ep.e f87227f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Expression f87228g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Expression f87229h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Expression f87230i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Expression f87231j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final ep.d f87232k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Function2 f87233l0;
    public final List A;
    private final hb B;
    private final hb C;
    public final Expression D;
    public final Expression E;
    public final List F;
    public final List G;
    public final Expression H;
    private final Expression I;
    private final Expression J;
    public final Expression K;
    private final List L;
    private final List M;
    private final wv N;
    private final y7 O;
    private final r6 P;
    private final r6 Q;
    private final List R;
    private final List S;
    private final List T;
    private final Expression U;
    private final hx V;
    private final List W;
    private final ep X;
    private Integer Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f87234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f87235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6 f87236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f87237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Expression f87238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Expression f87239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f87240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f87241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w6 f87242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f87243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l7 f87244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression f87245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Expression f87246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression f87247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression f87248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f87249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f87250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f87251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final bd f87252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f87253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression f87254u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ep f87255v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f87256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f87257x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f87258y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final zh f87259z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87260f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ee invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ee.Z.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ee a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((je.h) BuiltInParserKt.getBuiltInParserComponent().O3().getValue()).deserialize(parsingEnvironment, jSONObject);
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
        f87222a0 = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f87223b0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f87224c0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f87225d0 = Expression.Companion.constant$default(companion, y5.CENTER, null, 2, null);
        f87226e0 = Expression.Companion.constant$default(companion, z5.CENTER, null, 2, null);
        Expression expression = null;
        f87227f0 = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        f87228g0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f87229h0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f87230i0 = Expression.Companion.constant$default(companion, df.FILL, null, 2, null);
        f87231j0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f87232k0 = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        f87233l0 = a.f87260f;
    }

    public ee(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, w6 w6Var, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, bd bdVar, List list7, Expression expression8, ep epVar, List list8, List list9, String str, zh zhVar, List list10, hb hbVar, hb hbVar2, Expression expression9, Expression expression10, List list11, List list12, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list13, List list14, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list15, List list16, List list17, Expression expression15, hx hxVar, List list18, ep epVar2) {
        this.f87234a = g1Var;
        this.f87235b = j1Var;
        this.f87236c = a6Var;
        this.f87237d = list;
        this.f87238e = expression;
        this.f87239f = expression2;
        this.f87240g = expression3;
        this.f87241h = list2;
        this.f87242i = w6Var;
        this.f87243j = list3;
        this.f87244k = l7Var;
        this.f87245l = expression4;
        this.f87246m = expression5;
        this.f87247n = expression6;
        this.f87248o = expression7;
        this.f87249p = list4;
        this.f87250q = list5;
        this.f87251r = list6;
        this.f87252s = bdVar;
        this.f87253t = list7;
        this.f87254u = expression8;
        this.f87255v = epVar;
        this.f87256w = list8;
        this.f87257x = list9;
        this.f87258y = str;
        this.f87259z = zhVar;
        this.A = list10;
        this.B = hbVar;
        this.C = hbVar2;
        this.D = expression9;
        this.E = expression10;
        this.F = list11;
        this.G = list12;
        this.H = expression11;
        this.I = expression12;
        this.J = expression13;
        this.K = expression14;
        this.L = list13;
        this.M = list14;
        this.N = wvVar;
        this.O = y7Var;
        this.P = r6Var;
        this.Q = r6Var2;
        this.R = list15;
        this.S = list16;
        this.T = list17;
        this.U = expression15;
        this.V = hxVar;
        this.W = list18;
        this.X = epVar2;
    }

    public static /* synthetic */ ee z(ee eeVar, g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, w6 w6Var, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, bd bdVar, List list7, Expression expression8, ep epVar, List list8, List list9, String str, zh zhVar, List list10, hb hbVar, hb hbVar2, Expression expression9, Expression expression10, List list11, List list12, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list13, List list14, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list15, List list16, List list17, Expression expression15, hx hxVar, List list18, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? eeVar.o() : g1Var;
        j1 j1Var2 = (i10 & 2) != 0 ? eeVar.f87235b : j1Var;
        a6 a6Var2 = (i10 & 4) != 0 ? eeVar.f87236c : a6Var;
        List list19 = (i10 & 8) != 0 ? eeVar.f87237d : list;
        Expression expressionG = (i10 & 16) != 0 ? eeVar.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? eeVar.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? eeVar.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? eeVar.w() : list2;
        w6 w6Var2 = (i10 & 256) != 0 ? eeVar.f87242i : w6Var;
        List background = (i10 & 512) != 0 ? eeVar.getBackground() : list3;
        l7 l7VarX = (i10 & 1024) != 0 ? eeVar.x() : l7Var;
        Expression expression16 = (i10 & 2048) != 0 ? eeVar.f87245l : expression4;
        Expression expressionB = (i10 & 4096) != 0 ? eeVar.b() : expression5;
        g1 g1Var2 = g1VarO;
        Expression expression17 = (i10 & 8192) != 0 ? eeVar.f87247n : expression6;
        Expression expression18 = (i10 & 16384) != 0 ? eeVar.f87248o : expression7;
        List listK = (i10 & 32768) != 0 ? eeVar.k() : list4;
        List list20 = (i10 & 65536) != 0 ? eeVar.f87250q : list5;
        List extensions = (i10 & 131072) != 0 ? eeVar.getExtensions() : list6;
        bd bdVarN = (i10 & 262144) != 0 ? eeVar.n() : bdVar;
        List listU = (i10 & 524288) != 0 ? eeVar.u() : list7;
        List list21 = list20;
        Expression expression19 = (i10 & 1048576) != 0 ? eeVar.f87254u : expression8;
        ep height = (i10 & 2097152) != 0 ? eeVar.getHeight() : epVar;
        Expression expression20 = expression19;
        List list22 = (i10 & 4194304) != 0 ? eeVar.f87256w : list8;
        List list23 = (i10 & 8388608) != 0 ? eeVar.f87257x : list9;
        String id2 = (i10 & 16777216) != 0 ? eeVar.getId() : str;
        zh zhVarR = (i10 & 33554432) != 0 ? eeVar.r() : zhVar;
        List list24 = list23;
        List list25 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? eeVar.A : list10;
        return eeVar.y(g1Var2, j1Var2, a6Var2, list19, expressionG, expressionM, alpha, listW, w6Var2, background, l7VarX, expression16, expressionB, expression17, expression18, listK, list21, extensions, bdVarN, listU, expression20, height, list22, list24, id2, zhVarR, list25, (i10 & 134217728) != 0 ? eeVar.d() : hbVar, (i10 & 268435456) != 0 ? eeVar.p() : hbVar2, (i10 & 536870912) != 0 ? eeVar.D : expression9, (i10 & 1073741824) != 0 ? eeVar.E : expression10, (i10 & Integer.MIN_VALUE) != 0 ? eeVar.F : list11, (i11 & 1) != 0 ? eeVar.G : list12, (i11 & 2) != 0 ? eeVar.H : expression11, (i11 & 4) != 0 ? eeVar.f() : expression12, (i11 & 8) != 0 ? eeVar.e() : expression13, (i11 & 16) != 0 ? eeVar.K : expression14, (i11 & 32) != 0 ? eeVar.q() : list13, (i11 & 64) != 0 ? eeVar.h() : list14, (i11 & 128) != 0 ? eeVar.getTransform() : wvVar, (i11 & 256) != 0 ? eeVar.j() : y7Var, (i11 & 512) != 0 ? eeVar.v() : r6Var, (i11 & 1024) != 0 ? eeVar.i() : r6Var2, (i11 & 2048) != 0 ? eeVar.l() : list15, (i11 & 4096) != 0 ? eeVar.s() : list16, (i11 & 8192) != 0 ? eeVar.c() : list17, (i11 & 16384) != 0 ? eeVar.getVisibility() : expression15, (i11 & 32768) != 0 ? eeVar.t() : hxVar, (i11 & 65536) != 0 ? eeVar.a() : list18, (i11 & 131072) != 0 ? eeVar.getWidth() : epVar2);
    }

    public final boolean A(ee eeVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (eeVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(eeVar.o(), expressionResolver, expressionResolver2) : eeVar.o() == null) {
            j1 j1Var = this.f87235b;
            if ((j1Var != null ? j1Var.a(eeVar.f87235b, expressionResolver, expressionResolver2) : eeVar.f87235b == null) && this.f87236c.a(eeVar.f87236c, expressionResolver, expressionResolver2)) {
                List list = this.f87237d;
                if (list != null) {
                    List list2 = eeVar.f87237d;
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
                if (eeVar.f87237d != null) {
                    z10 = false;
                    break;
                }
                z10 = true;
                if (z10) {
                    Expression expressionG = g();
                    y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
                    Expression expressionG2 = eeVar.g();
                    if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                        Expression expressionM = m();
                        z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                        Expression expressionM2 = eeVar.m();
                        if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                            if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) eeVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                                List listW = w();
                                if (listW != null) {
                                    List listW2 = eeVar.w();
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
                                if (eeVar.w() != null) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                if (z11) {
                                    w6 w6Var = this.f87242i;
                                    if (w6Var != null ? w6Var.a(eeVar.f87242i, expressionResolver, expressionResolver2) : eeVar.f87242i == null) {
                                        List background = getBackground();
                                        if (background != null) {
                                            List background2 = eeVar.getBackground();
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
                                        if (eeVar.getBackground() != null) {
                                            z12 = false;
                                            break;
                                        }
                                        z12 = true;
                                        if (z12) {
                                            l7 l7VarX = x();
                                            if ((l7VarX != null ? l7VarX.a(eeVar.x(), expressionResolver, expressionResolver2) : eeVar.x() == null) && ((Boolean) this.f87245l.evaluate(expressionResolver)).booleanValue() == ((Boolean) eeVar.f87245l.evaluate(expressionResolver2)).booleanValue()) {
                                                Expression expressionB = b();
                                                Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                                Expression expressionB2 = eeVar.b();
                                                if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null) && this.f87247n.evaluate(expressionResolver) == eeVar.f87247n.evaluate(expressionResolver2) && this.f87248o.evaluate(expressionResolver) == eeVar.f87248o.evaluate(expressionResolver2)) {
                                                    List listK = k();
                                                    if (listK != null) {
                                                        List listK2 = eeVar.k();
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
                                                    if (eeVar.k() != null) {
                                                        z13 = false;
                                                        break;
                                                    }
                                                    z13 = true;
                                                    if (z13) {
                                                        List list3 = this.f87250q;
                                                        if (list3 != null) {
                                                            List list4 = eeVar.f87250q;
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
                                                        if (eeVar.f87250q != null) {
                                                            z14 = false;
                                                            break;
                                                        }
                                                        z14 = true;
                                                        if (z14) {
                                                            List extensions = getExtensions();
                                                            if (extensions != null) {
                                                                List extensions2 = eeVar.getExtensions();
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
                                                            if (eeVar.getExtensions() != null) {
                                                                z15 = false;
                                                                break;
                                                            }
                                                            z15 = true;
                                                            if (z15) {
                                                                bd bdVarN = n();
                                                                if (bdVarN != null ? bdVarN.a(eeVar.n(), expressionResolver, expressionResolver2) : eeVar.n() == null) {
                                                                    List listU = u();
                                                                    if (listU != null) {
                                                                        List listU2 = eeVar.u();
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
                                                                    if (eeVar.u() != null) {
                                                                        z16 = false;
                                                                        break;
                                                                    }
                                                                    z16 = true;
                                                                    if (z16 && Intrinsics.areEqual(this.f87254u.evaluate(expressionResolver), eeVar.f87254u.evaluate(expressionResolver2)) && getHeight().a(eeVar.getHeight(), expressionResolver, expressionResolver2)) {
                                                                        List list5 = this.f87256w;
                                                                        if (list5 != null) {
                                                                            List list6 = eeVar.f87256w;
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
                                                                        if (eeVar.f87256w != null) {
                                                                            z17 = false;
                                                                            break;
                                                                        }
                                                                        z17 = true;
                                                                        if (z17) {
                                                                            List list7 = this.f87257x;
                                                                            if (list7 != null) {
                                                                                List list8 = eeVar.f87257x;
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
                                                                            if (eeVar.f87257x != null) {
                                                                                z18 = false;
                                                                                break;
                                                                            }
                                                                            z18 = true;
                                                                            if (z18 && Intrinsics.areEqual(getId(), eeVar.getId())) {
                                                                                zh zhVarR = r();
                                                                                if (zhVarR != null ? zhVarR.a(eeVar.r(), expressionResolver, expressionResolver2) : eeVar.r() == null) {
                                                                                    List list9 = this.A;
                                                                                    if (list9 != null) {
                                                                                        List list10 = eeVar.A;
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
                                                                                    if (eeVar.A != null) {
                                                                                        z19 = false;
                                                                                        break;
                                                                                    }
                                                                                    z19 = true;
                                                                                    if (z19) {
                                                                                        hb hbVarD = d();
                                                                                        if (hbVarD != null ? hbVarD.a(eeVar.d(), expressionResolver, expressionResolver2) : eeVar.d() == null) {
                                                                                            hb hbVarP = p();
                                                                                            if ((hbVarP != null ? hbVarP.a(eeVar.p(), expressionResolver, expressionResolver2) : eeVar.p() == null) && ((Number) this.D.evaluate(expressionResolver)).intValue() == ((Number) eeVar.D.evaluate(expressionResolver2)).intValue() && ((Boolean) this.E.evaluate(expressionResolver)).booleanValue() == ((Boolean) eeVar.E.evaluate(expressionResolver2)).booleanValue()) {
                                                                                                List list11 = this.F;
                                                                                                if (list11 != null) {
                                                                                                    List list12 = eeVar.F;
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
                                                                                                if (eeVar.F != null) {
                                                                                                    z20 = false;
                                                                                                    break;
                                                                                                }
                                                                                                z20 = true;
                                                                                                if (z20) {
                                                                                                    List list13 = this.G;
                                                                                                    if (list13 != null) {
                                                                                                        List list14 = eeVar.G;
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
                                                                                                    if (eeVar.G != null) {
                                                                                                        z21 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    z21 = true;
                                                                                                    if (z21) {
                                                                                                        Expression expression = this.H;
                                                                                                        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
                                                                                                        Expression expression2 = eeVar.H;
                                                                                                        if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null)) {
                                                                                                            Expression expressionF = f();
                                                                                                            String str2 = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                                                            Expression expressionF2 = eeVar.f();
                                                                                                            if (Intrinsics.areEqual(str2, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                                                                Expression expressionE = e();
                                                                                                                Long l11 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                                                                Expression expressionE2 = eeVar.e();
                                                                                                                if (Intrinsics.areEqual(l11, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null) && this.K.evaluate(expressionResolver) == eeVar.K.evaluate(expressionResolver2)) {
                                                                                                                    List listQ = q();
                                                                                                                    if (listQ != null) {
                                                                                                                        List listQ2 = eeVar.q();
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
                                                                                                                    if (eeVar.q() != null) {
                                                                                                                        z22 = false;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    z22 = true;
                                                                                                                    if (z22) {
                                                                                                                        List listH = h();
                                                                                                                        if (listH != null) {
                                                                                                                            List listH2 = eeVar.h();
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
                                                                                                                        if (eeVar.h() != null) {
                                                                                                                            z23 = false;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        z23 = true;
                                                                                                                        if (z23) {
                                                                                                                            wv transform = getTransform();
                                                                                                                            if (transform != null ? transform.a(eeVar.getTransform(), expressionResolver, expressionResolver2) : eeVar.getTransform() == null) {
                                                                                                                                y7 y7VarJ = j();
                                                                                                                                if (y7VarJ != null ? y7VarJ.a(eeVar.j(), expressionResolver, expressionResolver2) : eeVar.j() == null) {
                                                                                                                                    r6 r6VarV = v();
                                                                                                                                    if (r6VarV != null ? r6VarV.a(eeVar.v(), expressionResolver, expressionResolver2) : eeVar.v() == null) {
                                                                                                                                        r6 r6VarI = i();
                                                                                                                                        if (r6VarI != null ? r6VarI.a(eeVar.i(), expressionResolver, expressionResolver2) : eeVar.i() == null) {
                                                                                                                                            List listL = l();
                                                                                                                                            if (listL != null) {
                                                                                                                                                List listL2 = eeVar.l();
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
                                                                                                                                            if (eeVar.l() != null) {
                                                                                                                                                z24 = false;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            z24 = true;
                                                                                                                                            if (z24) {
                                                                                                                                                List listS = s();
                                                                                                                                                if (listS != null) {
                                                                                                                                                    List listS2 = eeVar.s();
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
                                                                                                                                                if (eeVar.s() != null) {
                                                                                                                                                    z25 = false;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                z25 = true;
                                                                                                                                                if (z25) {
                                                                                                                                                    List listC = c();
                                                                                                                                                    if (listC != null) {
                                                                                                                                                        List listC2 = eeVar.c();
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
                                                                                                                                                    if (eeVar.c() != null) {
                                                                                                                                                        z26 = false;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    z26 = true;
                                                                                                                                                    if (z26 && getVisibility().evaluate(expressionResolver) == eeVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                                                        hx hxVarT = t();
                                                                                                                                                        if (hxVarT != null ? hxVarT.g(eeVar.t(), expressionResolver, expressionResolver2) : eeVar.t() == null) {
                                                                                                                                                            List listA = a();
                                                                                                                                                            if (listA != null) {
                                                                                                                                                                List listA2 = eeVar.a();
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
                                                                                                                                                            if (eeVar.a() != null) {
                                                                                                                                                                z27 = false;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            z27 = true;
                                                                                                                                                            if (z27 && getWidth().a(eeVar.getWidth(), expressionResolver, expressionResolver2)) {
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
        return false;
    }

    public /* synthetic */ int B() {
        return v7.b.a(this);
    }

    @Override // k8.f7
    public List a() {
        return this.W;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f87246m;
    }

    @Override // k8.f7
    public List c() {
        return this.T;
    }

    @Override // k8.f7
    public hb d() {
        return this.B;
    }

    @Override // k8.f7
    public Expression e() {
        return this.J;
    }

    @Override // k8.f7
    public Expression f() {
        return this.I;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f87238e;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f87240g;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f87243j;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f87251r;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f87255v;
    }

    @Override // k8.f7
    public String getId() {
        return this.f87258y;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.N;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.U;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.X;
    }

    @Override // k8.f7
    public List h() {
        return this.M;
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
        Integer num = this.Y;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ee.class).hashCode();
        g1 g1VarO = o();
        int iHash17 = 0;
        int iHash18 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        j1 j1Var = this.f87235b;
        int iHash19 = iHash18 + (j1Var != null ? j1Var.hash() : 0) + this.f87236c.hash();
        List list = this.f87237d;
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
        w6 w6Var = this.f87242i;
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
        int iHash21 = i12 + (l7VarX != null ? l7VarX.hash() : 0) + this.f87245l.hashCode();
        Expression expressionB = b();
        int iHashCode4 = iHash21 + (expressionB != null ? expressionB.hashCode() : 0) + this.f87247n.hashCode() + this.f87248o.hashCode();
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
        List list2 = this.f87250q;
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
        int iHashCode5 = iHash22 + iHash7 + this.f87254u.hashCode() + getHeight().hash();
        List list3 = this.f87256w;
        if (list3 != null) {
            Iterator it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((j1) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHashCode5 + iHash8;
        List list4 = this.f87257x;
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
        int iHashCode6 = i17 + (id2 != null ? id2.hashCode() : 0);
        zh zhVarR = r();
        int iHash23 = iHashCode6 + (zhVarR != null ? zhVarR.hash() : 0);
        List list5 = this.A;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((j1) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHash23 + iHash10;
        hb hbVarD = d();
        int iHash24 = i18 + (hbVarD != null ? hbVarD.hash() : 0);
        hb hbVarP = p();
        int iHash25 = iHash24 + (hbVarP != null ? hbVarP.hash() : 0) + this.D.hashCode() + this.E.hashCode();
        List list6 = this.F;
        if (list6 != null) {
            Iterator it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((j1) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHash25 + iHash11;
        List list7 = this.G;
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
        Expression expression = this.H;
        int iHashCode7 = i20 + (expression != null ? expression.hashCode() : 0);
        Expression expressionF = f();
        int iHashCode8 = iHashCode7 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0) + this.K.hashCode();
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
        int i21 = iHashCode9 + iHash13;
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
        int iHash26 = i22 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash27 = iHash26 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash28 = iHash27 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash29 = iHash28 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode10 = iHash29 + (listL != null ? listL.hashCode() : 0);
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
        int i23 = iHashCode10 + iHash15;
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
        int iHashCode11 = i23 + iHash16 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash30 = iHashCode11 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((hx) it17.next()).hash();
            }
        }
        int iHash31 = iHash30 + iHash17 + getWidth().hash();
        this.Y = Integer.valueOf(iHash31);
        return iHash31;
    }

    @Override // k8.f7
    public r6 i() {
        return this.Q;
    }

    @Override // k8.f7
    public y7 j() {
        return this.O;
    }

    @Override // k8.f7
    public List k() {
        return this.f87249p;
    }

    @Override // k8.f7
    public List l() {
        return this.R;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f87239f;
    }

    @Override // k8.f7
    public bd n() {
        return this.f87252s;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f87234a;
    }

    @Override // k8.f7
    public hb p() {
        return this.C;
    }

    @Override // k8.f7
    public List q() {
        return this.L;
    }

    @Override // k8.f7
    public zh r() {
        return this.f87259z;
    }

    @Override // k8.f7
    public List s() {
        return this.S;
    }

    @Override // k8.f7
    public hx t() {
        return this.V;
    }

    @Override // k8.f7
    public List u() {
        return this.f87253t;
    }

    @Override // k8.f7
    public r6 v() {
        return this.P;
    }

    @Override // k8.f7
    public List w() {
        return this.f87241h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((je.h) BuiltInParserKt.getBuiltInParserComponent().O3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f87244k;
    }

    public final ee y(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, w6 w6Var, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, bd bdVar, List list7, Expression expression8, ep epVar, List list8, List list9, String str, zh zhVar, List list10, hb hbVar, hb hbVar2, Expression expression9, Expression expression10, List list11, List list12, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list13, List list14, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list15, List list16, List list17, Expression expression15, hx hxVar, List list18, ep epVar2) {
        return new ee(g1Var, j1Var, a6Var, list, expression, expression2, expression3, list2, w6Var, list3, l7Var, expression4, expression5, expression6, expression7, list4, list5, list6, bdVar, list7, expression8, epVar, list8, list9, str, zhVar, list10, hbVar, hbVar2, expression9, expression10, list11, list12, expression11, expression12, expression13, expression14, list13, list14, wvVar, y7Var, r6Var, r6Var2, list15, list16, list17, expression15, hxVar, list18, epVar2);
    }
}
