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
import k8.re;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class le implements JSONSerializable, Hashable, f7 {
    public static final b W = new b(null);
    private static final a6 X;
    private static final Expression Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f88787a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f88788b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final ep.e f88789c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Expression f88790d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final ep.d f88791e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Function2 f88792f0;
    public final List A;
    private final hb B;
    private final hb C;
    public final List D;
    public final List E;
    private final Expression F;
    private final Expression G;
    private final List H;
    private final List I;
    private final wv J;
    private final y7 K;
    private final r6 L;
    private final r6 M;
    private final List N;
    private final List O;
    private final List P;
    private final Expression Q;
    private final hx R;
    private final List S;
    private final ep T;
    private Integer U;
    private Integer V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f88793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f88794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6 f88795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f88796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Expression f88797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Expression f88798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f88799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f88800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f88801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l7 f88802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression f88803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression f88804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Expression f88805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression f88806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression f88807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f88808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f88809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f88810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final bd f88811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f88812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ep f88813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f88814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f88815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f88816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f88817y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final zh f88818z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88819f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final le invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return le.W.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final le a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((re.g) BuiltInParserKt.getBuiltInParserComponent().R3().getValue()).deserialize(parsingEnvironment, jSONObject);
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
        X = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        Y = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f88787a0 = Expression.Companion.constant$default(companion, y5.START, null, 2, null);
        f88788b0 = Expression.Companion.constant$default(companion, z5.TOP, null, 2, null);
        Expression expression = null;
        f88789c0 = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        f88790d0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f88791e0 = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        f88792f0 = a.f88819f;
    }

    public le(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str, List list10, zh zhVar, List list11, hb hbVar, hb hbVar2, List list12, List list13, Expression expression9, Expression expression10, List list14, List list15, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression11, hx hxVar, List list19, ep epVar2) {
        this.f88793a = g1Var;
        this.f88794b = j1Var;
        this.f88795c = a6Var;
        this.f88796d = list;
        this.f88797e = expression;
        this.f88798f = expression2;
        this.f88799g = expression3;
        this.f88800h = list2;
        this.f88801i = list3;
        this.f88802j = l7Var;
        this.f88803k = expression4;
        this.f88804l = expression5;
        this.f88805m = expression6;
        this.f88806n = expression7;
        this.f88807o = expression8;
        this.f88808p = list4;
        this.f88809q = list5;
        this.f88810r = list6;
        this.f88811s = bdVar;
        this.f88812t = list7;
        this.f88813u = epVar;
        this.f88814v = list8;
        this.f88815w = list9;
        this.f88816x = str;
        this.f88817y = list10;
        this.f88818z = zhVar;
        this.A = list11;
        this.B = hbVar;
        this.C = hbVar2;
        this.D = list12;
        this.E = list13;
        this.F = expression9;
        this.G = expression10;
        this.H = list14;
        this.I = list15;
        this.J = wvVar;
        this.K = y7Var;
        this.L = r6Var;
        this.M = r6Var2;
        this.N = list16;
        this.O = list17;
        this.P = list18;
        this.Q = expression11;
        this.R = hxVar;
        this.S = list19;
        this.T = epVar2;
    }

    public static /* synthetic */ le z(le leVar, g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str, List list10, zh zhVar, List list11, hb hbVar, hb hbVar2, List list12, List list13, Expression expression9, Expression expression10, List list14, List list15, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression11, hx hxVar, List list19, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? leVar.o() : g1Var;
        j1 j1Var2 = (i10 & 2) != 0 ? leVar.f88794b : j1Var;
        a6 a6Var2 = (i10 & 4) != 0 ? leVar.f88795c : a6Var;
        List list20 = (i10 & 8) != 0 ? leVar.f88796d : list;
        Expression expressionG = (i10 & 16) != 0 ? leVar.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? leVar.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? leVar.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? leVar.w() : list2;
        List background = (i10 & 256) != 0 ? leVar.getBackground() : list3;
        l7 l7VarX = (i10 & 512) != 0 ? leVar.x() : l7Var;
        Expression expression12 = (i10 & 1024) != 0 ? leVar.f88803k : expression4;
        Expression expression13 = (i10 & 2048) != 0 ? leVar.f88804l : expression5;
        Expression expressionB = (i10 & 4096) != 0 ? leVar.b() : expression6;
        g1 g1Var2 = g1VarO;
        Expression expression14 = (i10 & 8192) != 0 ? leVar.f88806n : expression7;
        Expression expression15 = (i10 & 16384) != 0 ? leVar.f88807o : expression8;
        List listK = (i10 & 32768) != 0 ? leVar.k() : list4;
        List list21 = (i10 & 65536) != 0 ? leVar.f88809q : list5;
        List extensions = (i10 & 131072) != 0 ? leVar.getExtensions() : list6;
        bd bdVarN = (i10 & 262144) != 0 ? leVar.n() : bdVar;
        List listU = (i10 & 524288) != 0 ? leVar.u() : list7;
        ep height = (i10 & 1048576) != 0 ? leVar.getHeight() : epVar;
        List list22 = list21;
        List list23 = (i10 & 2097152) != 0 ? leVar.f88814v : list8;
        List list24 = (i10 & 4194304) != 0 ? leVar.f88815w : list9;
        String id2 = (i10 & 8388608) != 0 ? leVar.getId() : str;
        List list25 = list24;
        List list26 = (i10 & 16777216) != 0 ? leVar.f88817y : list10;
        return leVar.y(g1Var2, j1Var2, a6Var2, list20, expressionG, expressionM, alpha, listW, background, l7VarX, expression12, expression13, expressionB, expression14, expression15, listK, list22, extensions, bdVarN, listU, height, list23, list25, id2, list26, (i10 & 33554432) != 0 ? leVar.r() : zhVar, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? leVar.A : list11, (i10 & 134217728) != 0 ? leVar.d() : hbVar, (i10 & 268435456) != 0 ? leVar.p() : hbVar2, (i10 & 536870912) != 0 ? leVar.D : list12, (i10 & 1073741824) != 0 ? leVar.E : list13, (i10 & Integer.MIN_VALUE) != 0 ? leVar.f() : expression9, (i11 & 1) != 0 ? leVar.e() : expression10, (i11 & 2) != 0 ? leVar.q() : list14, (i11 & 4) != 0 ? leVar.h() : list15, (i11 & 8) != 0 ? leVar.getTransform() : wvVar, (i11 & 16) != 0 ? leVar.j() : y7Var, (i11 & 32) != 0 ? leVar.v() : r6Var, (i11 & 64) != 0 ? leVar.i() : r6Var2, (i11 & 128) != 0 ? leVar.l() : list16, (i11 & 256) != 0 ? leVar.s() : list17, (i11 & 512) != 0 ? leVar.c() : list18, (i11 & 1024) != 0 ? leVar.getVisibility() : expression11, (i11 & 2048) != 0 ? leVar.t() : hxVar, (i11 & 4096) != 0 ? leVar.a() : list19, (i11 & 8192) != 0 ? leVar.getWidth() : epVar2);
    }

    public final boolean A(le leVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (leVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(leVar.o(), expressionResolver, expressionResolver2) : leVar.o() == null) {
            j1 j1Var = this.f88794b;
            if ((j1Var != null ? j1Var.a(leVar.f88794b, expressionResolver, expressionResolver2) : leVar.f88794b == null) && this.f88795c.a(leVar.f88795c, expressionResolver, expressionResolver2)) {
                List list = this.f88796d;
                if (list != null) {
                    List list2 = leVar.f88796d;
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
                if (leVar.f88796d != null) {
                    z10 = false;
                    break;
                }
                z10 = true;
                if (z10) {
                    Expression expressionG = g();
                    y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
                    Expression expressionG2 = leVar.g();
                    if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                        Expression expressionM = m();
                        z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                        Expression expressionM2 = leVar.m();
                        if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                            if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) leVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                                List listW = w();
                                if (listW != null) {
                                    List listW2 = leVar.w();
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
                                if (leVar.w() != null) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                if (z11) {
                                    List background = getBackground();
                                    if (background != null) {
                                        List background2 = leVar.getBackground();
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
                                    if (leVar.getBackground() != null) {
                                        z12 = false;
                                        break;
                                    }
                                    z12 = true;
                                    if (z12) {
                                        l7 l7VarX = x();
                                        if ((l7VarX != null ? l7VarX.a(leVar.x(), expressionResolver, expressionResolver2) : leVar.x() == null) && ((Boolean) this.f88803k.evaluate(expressionResolver)).booleanValue() == ((Boolean) leVar.f88803k.evaluate(expressionResolver2)).booleanValue() && ((Number) this.f88804l.evaluate(expressionResolver)).longValue() == ((Number) leVar.f88804l.evaluate(expressionResolver2)).longValue()) {
                                            Expression expressionB = b();
                                            Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                            Expression expressionB2 = leVar.b();
                                            if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null) && this.f88806n.evaluate(expressionResolver) == leVar.f88806n.evaluate(expressionResolver2) && this.f88807o.evaluate(expressionResolver) == leVar.f88807o.evaluate(expressionResolver2)) {
                                                List listK = k();
                                                if (listK != null) {
                                                    List listK2 = leVar.k();
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
                                                if (leVar.k() != null) {
                                                    z13 = false;
                                                    break;
                                                }
                                                z13 = true;
                                                if (z13) {
                                                    List list3 = this.f88809q;
                                                    if (list3 != null) {
                                                        List list4 = leVar.f88809q;
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
                                                    if (leVar.f88809q != null) {
                                                        z14 = false;
                                                        break;
                                                    }
                                                    z14 = true;
                                                    if (z14) {
                                                        List extensions = getExtensions();
                                                        if (extensions != null) {
                                                            List extensions2 = leVar.getExtensions();
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
                                                        if (leVar.getExtensions() != null) {
                                                            z15 = false;
                                                            break;
                                                        }
                                                        z15 = true;
                                                        if (z15) {
                                                            bd bdVarN = n();
                                                            if (bdVarN != null ? bdVarN.a(leVar.n(), expressionResolver, expressionResolver2) : leVar.n() == null) {
                                                                List listU = u();
                                                                if (listU != null) {
                                                                    List listU2 = leVar.u();
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
                                                                if (leVar.u() != null) {
                                                                    z16 = false;
                                                                    break;
                                                                }
                                                                z16 = true;
                                                                if (z16 && getHeight().a(leVar.getHeight(), expressionResolver, expressionResolver2)) {
                                                                    List list5 = this.f88814v;
                                                                    if (list5 != null) {
                                                                        List list6 = leVar.f88814v;
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
                                                                    if (leVar.f88814v != null) {
                                                                        z17 = false;
                                                                        break;
                                                                    }
                                                                    z17 = true;
                                                                    if (z17) {
                                                                        List list7 = this.f88815w;
                                                                        if (list7 != null) {
                                                                            List list8 = leVar.f88815w;
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
                                                                        if (leVar.f88815w != null) {
                                                                            z18 = false;
                                                                            break;
                                                                        }
                                                                        z18 = true;
                                                                        if (z18 && Intrinsics.areEqual(getId(), leVar.getId())) {
                                                                            List list9 = this.f88817y;
                                                                            if (list9 != null) {
                                                                                List list10 = leVar.f88817y;
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
                                                                            if (leVar.f88817y != null) {
                                                                                z19 = false;
                                                                                break;
                                                                            }
                                                                            z19 = true;
                                                                            if (z19) {
                                                                                zh zhVarR = r();
                                                                                if (zhVarR != null ? zhVarR.a(leVar.r(), expressionResolver, expressionResolver2) : leVar.r() == null) {
                                                                                    List list11 = this.A;
                                                                                    if (list11 != null) {
                                                                                        List list12 = leVar.A;
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
                                                                                    if (leVar.A != null) {
                                                                                        z20 = false;
                                                                                        break;
                                                                                    }
                                                                                    z20 = true;
                                                                                    if (z20) {
                                                                                        hb hbVarD = d();
                                                                                        if (hbVarD != null ? hbVarD.a(leVar.d(), expressionResolver, expressionResolver2) : leVar.d() == null) {
                                                                                            hb hbVarP = p();
                                                                                            if (hbVarP != null ? hbVarP.a(leVar.p(), expressionResolver, expressionResolver2) : leVar.p() == null) {
                                                                                                List list13 = this.D;
                                                                                                if (list13 != null) {
                                                                                                    List list14 = leVar.D;
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
                                                                                                if (leVar.D != null) {
                                                                                                    z21 = false;
                                                                                                    break;
                                                                                                }
                                                                                                z21 = true;
                                                                                                if (z21) {
                                                                                                    List list15 = this.E;
                                                                                                    if (list15 != null) {
                                                                                                        List list16 = leVar.E;
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
                                                                                                    if (leVar.E != null) {
                                                                                                        z22 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    z22 = true;
                                                                                                    if (z22) {
                                                                                                        Expression expressionF = f();
                                                                                                        String str = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                                                        Expression expressionF2 = leVar.f();
                                                                                                        if (Intrinsics.areEqual(str, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                                                            Expression expressionE = e();
                                                                                                            Long l11 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                                                            Expression expressionE2 = leVar.e();
                                                                                                            if (Intrinsics.areEqual(l11, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null)) {
                                                                                                                List listQ = q();
                                                                                                                if (listQ != null) {
                                                                                                                    List listQ2 = leVar.q();
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
                                                                                                                if (leVar.q() != null) {
                                                                                                                    z23 = false;
                                                                                                                    break;
                                                                                                                }
                                                                                                                z23 = true;
                                                                                                                if (z23) {
                                                                                                                    List listH = h();
                                                                                                                    if (listH != null) {
                                                                                                                        List listH2 = leVar.h();
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
                                                                                                                    if (leVar.h() != null) {
                                                                                                                        z24 = false;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    z24 = true;
                                                                                                                    if (z24) {
                                                                                                                        wv transform = getTransform();
                                                                                                                        if (transform != null ? transform.a(leVar.getTransform(), expressionResolver, expressionResolver2) : leVar.getTransform() == null) {
                                                                                                                            y7 y7VarJ = j();
                                                                                                                            if (y7VarJ != null ? y7VarJ.a(leVar.j(), expressionResolver, expressionResolver2) : leVar.j() == null) {
                                                                                                                                r6 r6VarV = v();
                                                                                                                                if (r6VarV != null ? r6VarV.a(leVar.v(), expressionResolver, expressionResolver2) : leVar.v() == null) {
                                                                                                                                    r6 r6VarI = i();
                                                                                                                                    if (r6VarI != null ? r6VarI.a(leVar.i(), expressionResolver, expressionResolver2) : leVar.i() == null) {
                                                                                                                                        List listL = l();
                                                                                                                                        if (listL != null) {
                                                                                                                                            List listL2 = leVar.l();
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
                                                                                                                                        if (leVar.l() != null) {
                                                                                                                                            z25 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        z25 = true;
                                                                                                                                        if (z25) {
                                                                                                                                            List listS = s();
                                                                                                                                            if (listS != null) {
                                                                                                                                                List listS2 = leVar.s();
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
                                                                                                                                            if (leVar.s() != null) {
                                                                                                                                                z26 = false;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            z26 = true;
                                                                                                                                            if (z26) {
                                                                                                                                                List listC = c();
                                                                                                                                                if (listC != null) {
                                                                                                                                                    List listC2 = leVar.c();
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
                                                                                                                                                if (leVar.c() != null) {
                                                                                                                                                    z27 = false;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                z27 = true;
                                                                                                                                                if (z27 && getVisibility().evaluate(expressionResolver) == leVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                                                    hx hxVarT = t();
                                                                                                                                                    if (hxVarT != null ? hxVarT.g(leVar.t(), expressionResolver, expressionResolver2) : leVar.t() == null) {
                                                                                                                                                        List listA = a();
                                                                                                                                                        if (listA != null) {
                                                                                                                                                            List listA2 = leVar.a();
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
                                                                                                                                                        if (leVar.a() != null) {
                                                                                                                                                            z28 = false;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        z28 = true;
                                                                                                                                                        if (z28 && getWidth().a(leVar.getWidth(), expressionResolver, expressionResolver2)) {
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
        Integer num = this.U;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(le.class).hashCode();
        g1 g1VarO = o();
        int iHash17 = 0;
        int iHash18 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        j1 j1Var = this.f88794b;
        int iHash19 = iHash18 + (j1Var != null ? j1Var.hash() : 0) + this.f88795c.hash();
        List list = this.f88796d;
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
        int iHash20 = i12 + (l7VarX != null ? l7VarX.hash() : 0) + this.f88803k.hashCode() + this.f88804l.hashCode();
        Expression expressionB = b();
        int iHashCode4 = iHash20 + (expressionB != null ? expressionB.hashCode() : 0) + this.f88806n.hashCode() + this.f88807o.hashCode();
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
        List list2 = this.f88809q;
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
        int iHash21 = i15 + (bdVarN != null ? bdVarN.hash() : 0);
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
        int iHash22 = iHash21 + iHash7 + getHeight().hash();
        List list3 = this.f88814v;
        if (list3 != null) {
            Iterator it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((j1) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHash22 + iHash8;
        List list4 = this.f88815w;
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
        int iHash23 = iHashCode5 + (zhVarR != null ? zhVarR.hash() : 0);
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
        int iHash25 = iHash24 + (hbVarP != null ? hbVarP.hash() : 0);
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
        int i19 = iHash25 + iHash11;
        List list7 = this.E;
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
        int iHash26 = i22 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash27 = iHash26 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash28 = iHash27 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash29 = iHash28 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode8 = iHash29 + (listL != null ? listL.hashCode() : 0);
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
        int iHash30 = iHashCode9 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((hx) it17.next()).hash();
            }
        }
        int iHash31 = iHash30 + iHash17 + getWidth().hash();
        this.U = Integer.valueOf(iHash31);
        return iHash31;
    }

    @Override // k8.f7
    public List a() {
        return this.S;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f88805m;
    }

    @Override // k8.f7
    public List c() {
        return this.P;
    }

    @Override // k8.f7
    public hb d() {
        return this.B;
    }

    @Override // k8.f7
    public Expression e() {
        return this.G;
    }

    @Override // k8.f7
    public Expression f() {
        return this.F;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f88797e;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f88799g;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f88801i;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f88810r;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f88813u;
    }

    @Override // k8.f7
    public String getId() {
        return this.f88816x;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.J;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.Q;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.T;
    }

    @Override // k8.f7
    public List h() {
        return this.I;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int iB = B();
        List list = this.f88817y;
        int iHash = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iHash += ((y0) it.next()).hash();
            }
        }
        int i10 = iB + iHash;
        this.V = Integer.valueOf(i10);
        return i10;
    }

    @Override // k8.f7
    public r6 i() {
        return this.M;
    }

    @Override // k8.f7
    public y7 j() {
        return this.K;
    }

    @Override // k8.f7
    public List k() {
        return this.f88808p;
    }

    @Override // k8.f7
    public List l() {
        return this.N;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f88798f;
    }

    @Override // k8.f7
    public bd n() {
        return this.f88811s;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f88793a;
    }

    @Override // k8.f7
    public hb p() {
        return this.C;
    }

    @Override // k8.f7
    public List q() {
        return this.H;
    }

    @Override // k8.f7
    public zh r() {
        return this.f88818z;
    }

    @Override // k8.f7
    public List s() {
        return this.O;
    }

    @Override // k8.f7
    public hx t() {
        return this.R;
    }

    @Override // k8.f7
    public List u() {
        return this.f88812t;
    }

    @Override // k8.f7
    public r6 v() {
        return this.L;
    }

    @Override // k8.f7
    public List w() {
        return this.f88800h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((re.g) BuiltInParserKt.getBuiltInParserComponent().R3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f88802j;
    }

    public final le y(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str, List list10, zh zhVar, List list11, hb hbVar, hb hbVar2, List list12, List list13, Expression expression9, Expression expression10, List list14, List list15, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression11, hx hxVar, List list19, ep epVar2) {
        return new le(g1Var, j1Var, a6Var, list, expression, expression2, expression3, list2, list3, l7Var, expression4, expression5, expression6, expression7, expression8, list4, list5, list6, bdVar, list7, epVar, list8, list9, str, list10, zhVar, list11, hbVar, hbVar2, list12, list13, expression9, expression10, list14, list15, wvVar, y7Var, r6Var, r6Var2, list16, list17, list18, expression11, hxVar, list19, epVar2);
    }
}
