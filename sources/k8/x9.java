package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.ca;
import k8.ep;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class x9 implements JSONSerializable, Hashable, f7 {
    public static final b L = new b(null);
    private static final Expression M;
    private static final ep.e N;
    private static final Expression O;
    private static final ep.d P;
    private static final Function2 Q;
    private final r6 A;
    private final r6 B;
    private final List C;
    private final List D;
    private final List E;
    private final Expression F;
    private final hx G;
    private final List H;
    private final ep I;
    private Integer J;
    private Integer K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f92302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f92303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f92304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f92305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f92306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f92307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l7 f92308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Expression f92309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final JSONObject f92310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f92311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f92312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f92313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final bd f92314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f92315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ep f92316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f92317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f92318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final zh f92319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final hb f92320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final hb f92321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Expression f92322u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Expression f92323v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f92324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f92325x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final wv f92326y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final y7 f92327z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92328f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x9 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return x9.L.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x9 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ca.e) BuiltInParserKt.getBuiltInParserComponent().B2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        M = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        N = new ep.e(new nx(null, null, null, 7, null));
        O = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        P = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        Q = a.f92328f;
    }

    public x9(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, JSONObject jSONObject, String str, List list3, List list4, bd bdVar, List list5, ep epVar, String str2, List list6, zh zhVar, hb hbVar, hb hbVar2, Expression expression5, Expression expression6, List list7, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression7, hx hxVar, List list12, ep epVar2) {
        this.f92302a = g1Var;
        this.f92303b = expression;
        this.f92304c = expression2;
        this.f92305d = expression3;
        this.f92306e = list;
        this.f92307f = list2;
        this.f92308g = l7Var;
        this.f92309h = expression4;
        this.f92310i = jSONObject;
        this.f92311j = str;
        this.f92312k = list3;
        this.f92313l = list4;
        this.f92314m = bdVar;
        this.f92315n = list5;
        this.f92316o = epVar;
        this.f92317p = str2;
        this.f92318q = list6;
        this.f92319r = zhVar;
        this.f92320s = hbVar;
        this.f92321t = hbVar2;
        this.f92322u = expression5;
        this.f92323v = expression6;
        this.f92324w = list7;
        this.f92325x = list8;
        this.f92326y = wvVar;
        this.f92327z = y7Var;
        this.A = r6Var;
        this.B = r6Var2;
        this.C = list9;
        this.D = list10;
        this.E = list11;
        this.F = expression7;
        this.G = hxVar;
        this.H = list12;
        this.I = epVar2;
    }

    public final boolean A(x9 x9Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (x9Var == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(x9Var.o(), expressionResolver, expressionResolver2) : x9Var.o() == null) {
            Expression expressionG = g();
            y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
            Expression expressionG2 = x9Var.g();
            if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                Expression expressionM = m();
                z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                Expression expressionM2 = x9Var.m();
                if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                    if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) x9Var.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                        List listW = w();
                        if (listW != null) {
                            List listW2 = x9Var.w();
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
                        if (x9Var.w() != null) {
                            z10 = false;
                            break;
                        }
                        z10 = true;
                        if (z10) {
                            List background = getBackground();
                            if (background != null) {
                                List background2 = x9Var.getBackground();
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
                            if (x9Var.getBackground() != null) {
                                z11 = false;
                                break;
                            }
                            z11 = true;
                            if (z11) {
                                l7 l7VarX = x();
                                if (l7VarX != null ? l7VarX.a(x9Var.x(), expressionResolver, expressionResolver2) : x9Var.x() == null) {
                                    Expression expressionB = b();
                                    Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                    Expression expressionB2 = x9Var.b();
                                    if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(this.f92310i, x9Var.f92310i) && Intrinsics.areEqual(this.f92311j, x9Var.f92311j)) {
                                        List listK = k();
                                        if (listK != null) {
                                            List listK2 = x9Var.k();
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
                                        if (x9Var.k() != null) {
                                            z12 = false;
                                            break;
                                        }
                                        z12 = true;
                                        if (z12) {
                                            List extensions = getExtensions();
                                            if (extensions != null) {
                                                List extensions2 = x9Var.getExtensions();
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
                                            if (x9Var.getExtensions() != null) {
                                                z13 = false;
                                                break;
                                            }
                                            z13 = true;
                                            if (z13) {
                                                bd bdVarN = n();
                                                if (bdVarN != null ? bdVarN.a(x9Var.n(), expressionResolver, expressionResolver2) : x9Var.n() == null) {
                                                    List listU = u();
                                                    if (listU != null) {
                                                        List listU2 = x9Var.u();
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
                                                    if (x9Var.u() != null) {
                                                        z14 = false;
                                                        break;
                                                    }
                                                    z14 = true;
                                                    if (z14 && getHeight().a(x9Var.getHeight(), expressionResolver, expressionResolver2) && Intrinsics.areEqual(getId(), x9Var.getId())) {
                                                        List list = this.f92318q;
                                                        if (list != null) {
                                                            List list2 = x9Var.f92318q;
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
                                                        if (x9Var.f92318q != null) {
                                                            z15 = false;
                                                            break;
                                                        }
                                                        z15 = true;
                                                        if (z15) {
                                                            zh zhVarR = r();
                                                            if (zhVarR != null ? zhVarR.a(x9Var.r(), expressionResolver, expressionResolver2) : x9Var.r() == null) {
                                                                hb hbVarD = d();
                                                                if (hbVarD != null ? hbVarD.a(x9Var.d(), expressionResolver, expressionResolver2) : x9Var.d() == null) {
                                                                    hb hbVarP = p();
                                                                    if (hbVarP != null ? hbVarP.a(x9Var.p(), expressionResolver, expressionResolver2) : x9Var.p() == null) {
                                                                        Expression expressionF = f();
                                                                        String str = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                        Expression expressionF2 = x9Var.f();
                                                                        if (Intrinsics.areEqual(str, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                            Expression expressionE = e();
                                                                            Long l11 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                            Expression expressionE2 = x9Var.e();
                                                                            if (Intrinsics.areEqual(l11, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null)) {
                                                                                List listQ = q();
                                                                                if (listQ != null) {
                                                                                    List listQ2 = x9Var.q();
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
                                                                                if (x9Var.q() != null) {
                                                                                    z16 = false;
                                                                                    break;
                                                                                }
                                                                                z16 = true;
                                                                                if (z16) {
                                                                                    List listH = h();
                                                                                    if (listH != null) {
                                                                                        List listH2 = x9Var.h();
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
                                                                                    if (x9Var.h() != null) {
                                                                                        z17 = false;
                                                                                        break;
                                                                                    }
                                                                                    z17 = true;
                                                                                    if (z17) {
                                                                                        wv transform = getTransform();
                                                                                        if (transform != null ? transform.a(x9Var.getTransform(), expressionResolver, expressionResolver2) : x9Var.getTransform() == null) {
                                                                                            y7 y7VarJ = j();
                                                                                            if (y7VarJ != null ? y7VarJ.a(x9Var.j(), expressionResolver, expressionResolver2) : x9Var.j() == null) {
                                                                                                r6 r6VarV = v();
                                                                                                if (r6VarV != null ? r6VarV.a(x9Var.v(), expressionResolver, expressionResolver2) : x9Var.v() == null) {
                                                                                                    r6 r6VarI = i();
                                                                                                    if (r6VarI != null ? r6VarI.a(x9Var.i(), expressionResolver, expressionResolver2) : x9Var.i() == null) {
                                                                                                        List listL = l();
                                                                                                        if (listL != null) {
                                                                                                            List listL2 = x9Var.l();
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
                                                                                                        if (x9Var.l() != null) {
                                                                                                            z18 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        z18 = true;
                                                                                                        if (z18) {
                                                                                                            List listS = s();
                                                                                                            if (listS != null) {
                                                                                                                List listS2 = x9Var.s();
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
                                                                                                            if (x9Var.s() != null) {
                                                                                                                z19 = false;
                                                                                                                break;
                                                                                                            }
                                                                                                            z19 = true;
                                                                                                            if (z19) {
                                                                                                                List listC = c();
                                                                                                                if (listC != null) {
                                                                                                                    List listC2 = x9Var.c();
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
                                                                                                                if (x9Var.c() != null) {
                                                                                                                    z20 = false;
                                                                                                                    break;
                                                                                                                }
                                                                                                                z20 = true;
                                                                                                                if (z20 && getVisibility().evaluate(expressionResolver) == x9Var.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                    hx hxVarT = t();
                                                                                                                    if (hxVarT != null ? hxVarT.g(x9Var.t(), expressionResolver, expressionResolver2) : x9Var.t() == null) {
                                                                                                                        List listA = a();
                                                                                                                        if (listA != null) {
                                                                                                                            List listA2 = x9Var.a();
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
                                                                                                                        if (x9Var.a() != null) {
                                                                                                                            z21 = false;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        z21 = true;
                                                                                                                        if (z21 && getWidth().a(x9Var.getWidth(), expressionResolver, expressionResolver2)) {
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
        Integer num = this.J;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(x9.class).hashCode();
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
        Expression expressionB = b();
        int iHashCode4 = iHash12 + (expressionB != null ? expressionB.hashCode() : 0);
        JSONObject jSONObject = this.f92310i;
        int iHashCode5 = iHashCode4 + (jSONObject != null ? jSONObject.hashCode() : 0) + this.f92311j.hashCode();
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
        int i12 = iHashCode5 + iHash3;
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
        int iHashCode6 = iHash14 + (id2 != null ? id2.hashCode() : 0);
        zh zhVarR = r();
        int iHash15 = iHashCode6 + (zhVarR != null ? zhVarR.hash() : 0);
        hb hbVarD = d();
        int iHash16 = iHash15 + (hbVarD != null ? hbVarD.hash() : 0);
        hb hbVarP = p();
        int iHash17 = iHash16 + (hbVarP != null ? hbVarP.hash() : 0);
        Expression expressionF = f();
        int iHashCode7 = iHash17 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode8 = iHashCode7 + (expressionE != null ? expressionE.hashCode() : 0);
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
        int i14 = iHashCode8 + iHash6;
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
        int iHash18 = i15 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash19 = iHash18 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash20 = iHash19 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash21 = iHash20 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode9 = iHash21 + (listL != null ? listL.hashCode() : 0);
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
        int i16 = iHashCode9 + iHash8;
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
        int iHashCode10 = i16 + iHash9 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash22 = iHashCode10 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((hx) it10.next()).hash();
            }
        }
        int iHash23 = iHash22 + iHash10 + getWidth().hash();
        this.J = Integer.valueOf(iHash23);
        return iHash23;
    }

    @Override // k8.f7
    public List a() {
        return this.H;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f92309h;
    }

    @Override // k8.f7
    public List c() {
        return this.E;
    }

    @Override // k8.f7
    public hb d() {
        return this.f92320s;
    }

    @Override // k8.f7
    public Expression e() {
        return this.f92323v;
    }

    @Override // k8.f7
    public Expression f() {
        return this.f92322u;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f92303b;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f92305d;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f92307f;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f92313l;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f92316o;
    }

    @Override // k8.f7
    public String getId() {
        return this.f92317p;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.f92326y;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.F;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.I;
    }

    @Override // k8.f7
    public List h() {
        return this.f92325x;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.K;
        if (num != null) {
            return num.intValue();
        }
        int iB = B();
        List list = this.f92318q;
        int iHash = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iHash += ((y0) it.next()).hash();
            }
        }
        int i10 = iB + iHash;
        this.K = Integer.valueOf(i10);
        return i10;
    }

    @Override // k8.f7
    public r6 i() {
        return this.B;
    }

    @Override // k8.f7
    public y7 j() {
        return this.f92327z;
    }

    @Override // k8.f7
    public List k() {
        return this.f92312k;
    }

    @Override // k8.f7
    public List l() {
        return this.C;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f92304c;
    }

    @Override // k8.f7
    public bd n() {
        return this.f92314m;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f92302a;
    }

    @Override // k8.f7
    public hb p() {
        return this.f92321t;
    }

    @Override // k8.f7
    public List q() {
        return this.f92324w;
    }

    @Override // k8.f7
    public zh r() {
        return this.f92319r;
    }

    @Override // k8.f7
    public List s() {
        return this.D;
    }

    @Override // k8.f7
    public hx t() {
        return this.G;
    }

    @Override // k8.f7
    public List u() {
        return this.f92315n;
    }

    @Override // k8.f7
    public r6 v() {
        return this.A;
    }

    @Override // k8.f7
    public List w() {
        return this.f92306e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ca.e) BuiltInParserKt.getBuiltInParserComponent().B2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f92308g;
    }

    public final x9 y(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, JSONObject jSONObject, String str, List list3, List list4, bd bdVar, List list5, ep epVar, String str2, List list6, zh zhVar, hb hbVar, hb hbVar2, Expression expression5, Expression expression6, List list7, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression7, hx hxVar, List list12, ep epVar2) {
        return new x9(g1Var, expression, expression2, expression3, list, list2, l7Var, expression4, jSONObject, str, list3, list4, bdVar, list5, epVar, str2, list6, zhVar, hbVar, hbVar2, expression5, expression6, list7, list8, wvVar, y7Var, r6Var, r6Var2, list9, list10, list11, expression7, hxVar, list12, epVar2);
    }
}
