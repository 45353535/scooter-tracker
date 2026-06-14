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
import k8.ep;
import k8.yr;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class tr implements JSONSerializable, Hashable, f7 {
    public static final b K = new b(null);
    private static final Expression L;
    private static final ep.e M;
    private static final Expression N;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f91473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f91474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f91475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f91476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f91477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f91478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l7 f91479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Expression f91480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f91481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f91482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bd f91483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f91484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ep f91485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f91486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression f91487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f91488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final zh f91489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final hb f91490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Expression f91491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final hb f91492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Expression f91493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Expression f91494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f91495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f91496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final wv f91497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final y7 f91498z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91499f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tr invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return tr.K.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final tr a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((yr.e) BuiltInParserKt.getBuiltInParserComponent().O7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        L = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        M = new ep.e(new nx(null, null, null, 7, null));
        N = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        O = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        P = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        Q = a.f91499f;
    }

    public tr(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression5, String str2, zh zhVar, hb hbVar, Expression expression6, hb hbVar2, Expression expression7, Expression expression8, List list6, List list7, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list8, List list9, List list10, Expression expression9, hx hxVar, List list11, ep epVar2) {
        this.f91473a = g1Var;
        this.f91474b = expression;
        this.f91475c = expression2;
        this.f91476d = expression3;
        this.f91477e = list;
        this.f91478f = list2;
        this.f91479g = l7Var;
        this.f91480h = expression4;
        this.f91481i = list3;
        this.f91482j = list4;
        this.f91483k = bdVar;
        this.f91484l = list5;
        this.f91485m = epVar;
        this.f91486n = str;
        this.f91487o = expression5;
        this.f91488p = str2;
        this.f91489q = zhVar;
        this.f91490r = hbVar;
        this.f91491s = expression6;
        this.f91492t = hbVar2;
        this.f91493u = expression7;
        this.f91494v = expression8;
        this.f91495w = list6;
        this.f91496x = list7;
        this.f91497y = wvVar;
        this.f91498z = y7Var;
        this.A = r6Var;
        this.B = r6Var2;
        this.C = list8;
        this.D = list9;
        this.E = list10;
        this.F = expression9;
        this.G = hxVar;
        this.H = list11;
        this.I = epVar2;
    }

    public static /* synthetic */ tr z(tr trVar, g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression5, String str2, zh zhVar, hb hbVar, Expression expression6, hb hbVar2, Expression expression7, Expression expression8, List list6, List list7, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list8, List list9, List list10, Expression expression9, hx hxVar, List list11, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? trVar.o() : g1Var;
        return trVar.y(g1VarO, (i10 & 2) != 0 ? trVar.g() : expression, (i10 & 4) != 0 ? trVar.m() : expression2, (i10 & 8) != 0 ? trVar.getAlpha() : expression3, (i10 & 16) != 0 ? trVar.w() : list, (i10 & 32) != 0 ? trVar.getBackground() : list2, (i10 & 64) != 0 ? trVar.x() : l7Var, (i10 & 128) != 0 ? trVar.b() : expression4, (i10 & 256) != 0 ? trVar.k() : list3, (i10 & 512) != 0 ? trVar.getExtensions() : list4, (i10 & 1024) != 0 ? trVar.n() : bdVar, (i10 & 2048) != 0 ? trVar.u() : list5, (i10 & 4096) != 0 ? trVar.getHeight() : epVar, (i10 & 8192) != 0 ? trVar.getId() : str, (i10 & 16384) != 0 ? trVar.f91487o : expression5, (i10 & 32768) != 0 ? trVar.f91488p : str2, (i10 & 65536) != 0 ? trVar.r() : zhVar, (i10 & 131072) != 0 ? trVar.d() : hbVar, (i10 & 262144) != 0 ? trVar.f91491s : expression6, (i10 & 524288) != 0 ? trVar.p() : hbVar2, (i10 & 1048576) != 0 ? trVar.f() : expression7, (i10 & 2097152) != 0 ? trVar.e() : expression8, (i10 & 4194304) != 0 ? trVar.q() : list6, (i10 & 8388608) != 0 ? trVar.h() : list7, (i10 & 16777216) != 0 ? trVar.getTransform() : wvVar, (i10 & 33554432) != 0 ? trVar.j() : y7Var, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? trVar.v() : r6Var, (i10 & 134217728) != 0 ? trVar.i() : r6Var2, (i10 & 268435456) != 0 ? trVar.l() : list8, (i10 & 536870912) != 0 ? trVar.s() : list9, (i10 & 1073741824) != 0 ? trVar.c() : list10, (i10 & Integer.MIN_VALUE) != 0 ? trVar.getVisibility() : expression9, (i11 & 1) != 0 ? trVar.t() : hxVar, (i11 & 2) != 0 ? trVar.a() : list11, (i11 & 4) != 0 ? trVar.getWidth() : epVar2);
    }

    public final boolean A(tr trVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (trVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(trVar.o(), expressionResolver, expressionResolver2) : trVar.o() == null) {
            Expression expressionG = g();
            y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
            Expression expressionG2 = trVar.g();
            if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                Expression expressionM = m();
                z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                Expression expressionM2 = trVar.m();
                if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                    if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) trVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                        List listW = w();
                        if (listW != null) {
                            List listW2 = trVar.w();
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
                        if (trVar.w() != null) {
                            z10 = false;
                            break;
                        }
                        z10 = true;
                        if (z10) {
                            List background = getBackground();
                            if (background != null) {
                                List background2 = trVar.getBackground();
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
                            if (trVar.getBackground() != null) {
                                z11 = false;
                                break;
                            }
                            z11 = true;
                            if (z11) {
                                l7 l7VarX = x();
                                if (l7VarX != null ? l7VarX.a(trVar.x(), expressionResolver, expressionResolver2) : trVar.x() == null) {
                                    Expression expressionB = b();
                                    Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                    Expression expressionB2 = trVar.b();
                                    if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null)) {
                                        List listK = k();
                                        if (listK != null) {
                                            List listK2 = trVar.k();
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
                                        if (trVar.k() != null) {
                                            z12 = false;
                                            break;
                                        }
                                        z12 = true;
                                        if (z12) {
                                            List extensions = getExtensions();
                                            if (extensions != null) {
                                                List extensions2 = trVar.getExtensions();
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
                                            if (trVar.getExtensions() != null) {
                                                z13 = false;
                                                break;
                                            }
                                            z13 = true;
                                            if (z13) {
                                                bd bdVarN = n();
                                                if (bdVarN != null ? bdVarN.a(trVar.n(), expressionResolver, expressionResolver2) : trVar.n() == null) {
                                                    List listU = u();
                                                    if (listU != null) {
                                                        List listU2 = trVar.u();
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
                                                    if (trVar.u() != null) {
                                                        z14 = false;
                                                        break;
                                                    }
                                                    z14 = true;
                                                    if (z14 && getHeight().a(trVar.getHeight(), expressionResolver, expressionResolver2) && Intrinsics.areEqual(getId(), trVar.getId()) && ((Boolean) this.f91487o.evaluate(expressionResolver)).booleanValue() == ((Boolean) trVar.f91487o.evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(this.f91488p, trVar.f91488p)) {
                                                        zh zhVarR = r();
                                                        if (zhVarR != null ? zhVarR.a(trVar.r(), expressionResolver, expressionResolver2) : trVar.r() == null) {
                                                            hb hbVarD = d();
                                                            if (hbVarD != null ? hbVarD.a(trVar.d(), expressionResolver, expressionResolver2) : trVar.d() == null) {
                                                                Expression expression = this.f91491s;
                                                                Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
                                                                Expression expression2 = trVar.f91491s;
                                                                if (Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(expressionResolver2) : null)) {
                                                                    hb hbVarP = p();
                                                                    if (hbVarP != null ? hbVarP.a(trVar.p(), expressionResolver, expressionResolver2) : trVar.p() == null) {
                                                                        Expression expressionF = f();
                                                                        String str = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                        Expression expressionF2 = trVar.f();
                                                                        if (Intrinsics.areEqual(str, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                            Expression expressionE = e();
                                                                            Long l11 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                            Expression expressionE2 = trVar.e();
                                                                            if (Intrinsics.areEqual(l11, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null)) {
                                                                                List listQ = q();
                                                                                if (listQ != null) {
                                                                                    List listQ2 = trVar.q();
                                                                                    if (listQ2 != null) {
                                                                                        if (listQ.size() == listQ2.size()) {
                                                                                            int i20 = 0;
                                                                                            for (Object obj6 : listQ) {
                                                                                                int i21 = i20 + 1;
                                                                                                if (i20 < 0) {
                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                }
                                                                                                if (((j1) obj6).a((j1) listQ2.get(i20), expressionResolver, expressionResolver2)) {
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
                                                                                if (trVar.q() != null) {
                                                                                    z15 = false;
                                                                                    break;
                                                                                }
                                                                                z15 = true;
                                                                                if (z15) {
                                                                                    List listH = h();
                                                                                    if (listH != null) {
                                                                                        List listH2 = trVar.h();
                                                                                        if (listH2 != null) {
                                                                                            if (listH.size() == listH2.size()) {
                                                                                                int i22 = 0;
                                                                                                for (Object obj7 : listH) {
                                                                                                    int i23 = i22 + 1;
                                                                                                    if (i22 < 0) {
                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                    }
                                                                                                    if (((dv) obj7).a((dv) listH2.get(i22), expressionResolver, expressionResolver2)) {
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
                                                                                    if (trVar.h() != null) {
                                                                                        z16 = false;
                                                                                        break;
                                                                                    }
                                                                                    z16 = true;
                                                                                    if (z16) {
                                                                                        wv transform = getTransform();
                                                                                        if (transform != null ? transform.a(trVar.getTransform(), expressionResolver, expressionResolver2) : trVar.getTransform() == null) {
                                                                                            y7 y7VarJ = j();
                                                                                            if (y7VarJ != null ? y7VarJ.a(trVar.j(), expressionResolver, expressionResolver2) : trVar.j() == null) {
                                                                                                r6 r6VarV = v();
                                                                                                if (r6VarV != null ? r6VarV.a(trVar.v(), expressionResolver, expressionResolver2) : trVar.v() == null) {
                                                                                                    r6 r6VarI = i();
                                                                                                    if (r6VarI != null ? r6VarI.a(trVar.i(), expressionResolver, expressionResolver2) : trVar.i() == null) {
                                                                                                        List listL = l();
                                                                                                        if (listL != null) {
                                                                                                            List listL2 = trVar.l();
                                                                                                            if (listL2 != null) {
                                                                                                                if (listL.size() == listL2.size()) {
                                                                                                                    int i24 = 0;
                                                                                                                    for (Object obj8 : listL) {
                                                                                                                        int i25 = i24 + 1;
                                                                                                                        if (i24 < 0) {
                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                        }
                                                                                                                        if (((aw) obj8) == ((aw) listL2.get(i24))) {
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
                                                                                                        if (trVar.l() != null) {
                                                                                                            z17 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        z17 = true;
                                                                                                        if (z17) {
                                                                                                            List listS = s();
                                                                                                            if (listS != null) {
                                                                                                                List listS2 = trVar.s();
                                                                                                                if (listS2 != null) {
                                                                                                                    if (listS.size() == listS2.size()) {
                                                                                                                        int i26 = 0;
                                                                                                                        for (Object obj9 : listS) {
                                                                                                                            int i27 = i26 + 1;
                                                                                                                            if (i26 < 0) {
                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                            }
                                                                                                                            if (((bw) obj9).a((bw) listS2.get(i26), expressionResolver, expressionResolver2)) {
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
                                                                                                            if (trVar.s() != null) {
                                                                                                                z18 = false;
                                                                                                                break;
                                                                                                            }
                                                                                                            z18 = true;
                                                                                                            if (z18) {
                                                                                                                List listC = c();
                                                                                                                if (listC != null) {
                                                                                                                    List listC2 = trVar.c();
                                                                                                                    if (listC2 != null) {
                                                                                                                        if (listC.size() == listC2.size()) {
                                                                                                                            int i28 = 0;
                                                                                                                            for (Object obj10 : listC) {
                                                                                                                                int i29 = i28 + 1;
                                                                                                                                if (i28 < 0) {
                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                }
                                                                                                                                if (((kw) obj10).a((kw) listC2.get(i28), expressionResolver, expressionResolver2)) {
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
                                                                                                                if (trVar.c() != null) {
                                                                                                                    z19 = false;
                                                                                                                    break;
                                                                                                                }
                                                                                                                z19 = true;
                                                                                                                if (z19 && getVisibility().evaluate(expressionResolver) == trVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                    hx hxVarT = t();
                                                                                                                    if (hxVarT != null ? hxVarT.g(trVar.t(), expressionResolver, expressionResolver2) : trVar.t() == null) {
                                                                                                                        List listA = a();
                                                                                                                        if (listA != null) {
                                                                                                                            List listA2 = trVar.a();
                                                                                                                            if (listA2 != null) {
                                                                                                                                if (listA.size() == listA2.size()) {
                                                                                                                                    int i30 = 0;
                                                                                                                                    for (Object obj11 : listA) {
                                                                                                                                        int i31 = i30 + 1;
                                                                                                                                        if (i30 < 0) {
                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                        }
                                                                                                                                        if (((hx) obj11).g((hx) listA2.get(i30), expressionResolver, expressionResolver2)) {
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
                                                                                                                        if (trVar.a() != null) {
                                                                                                                            z20 = false;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        z20 = true;
                                                                                                                        if (z20 && getWidth().a(trVar.getWidth(), expressionResolver, expressionResolver2)) {
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

    public /* synthetic */ int B() {
        return v7.b.a(this);
    }

    @Override // k8.f7
    public List a() {
        return this.H;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f91480h;
    }

    @Override // k8.f7
    public List c() {
        return this.E;
    }

    @Override // k8.f7
    public hb d() {
        return this.f91490r;
    }

    @Override // k8.f7
    public Expression e() {
        return this.f91494v;
    }

    @Override // k8.f7
    public Expression f() {
        return this.f91493u;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f91474b;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f91476d;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f91478f;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f91482j;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f91485m;
    }

    @Override // k8.f7
    public String getId() {
        return this.f91486n;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.f91497y;
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
        return this.f91496x;
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
        Integer num = this.J;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(tr.class).hashCode();
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
        int i12 = iHashCode4 + iHash3;
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
        int iHashCode5 = iHash14 + (id2 != null ? id2.hashCode() : 0) + this.f91487o.hashCode() + this.f91488p.hashCode();
        zh zhVarR = r();
        int iHash15 = iHashCode5 + (zhVarR != null ? zhVarR.hash() : 0);
        hb hbVarD = d();
        int iHash16 = iHash15 + (hbVarD != null ? hbVarD.hash() : 0);
        Expression expression = this.f91491s;
        int iHashCode6 = iHash16 + (expression != null ? expression.hashCode() : 0);
        hb hbVarP = p();
        int iHash17 = iHashCode6 + (hbVarP != null ? hbVarP.hash() : 0);
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
    public r6 i() {
        return this.B;
    }

    @Override // k8.f7
    public y7 j() {
        return this.f91498z;
    }

    @Override // k8.f7
    public List k() {
        return this.f91481i;
    }

    @Override // k8.f7
    public List l() {
        return this.C;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f91475c;
    }

    @Override // k8.f7
    public bd n() {
        return this.f91483k;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f91473a;
    }

    @Override // k8.f7
    public hb p() {
        return this.f91492t;
    }

    @Override // k8.f7
    public List q() {
        return this.f91495w;
    }

    @Override // k8.f7
    public zh r() {
        return this.f91489q;
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
        return this.f91484l;
    }

    @Override // k8.f7
    public r6 v() {
        return this.A;
    }

    @Override // k8.f7
    public List w() {
        return this.f91477e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((yr.e) BuiltInParserKt.getBuiltInParserComponent().O7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f91479g;
    }

    public final tr y(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression5, String str2, zh zhVar, hb hbVar, Expression expression6, hb hbVar2, Expression expression7, Expression expression8, List list6, List list7, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list8, List list9, List list10, Expression expression9, hx hxVar, List list11, ep epVar2) {
        return new tr(g1Var, expression, expression2, expression3, list, list2, l7Var, expression4, list3, list4, bdVar, list5, epVar, str, expression5, str2, zhVar, hbVar, expression6, hbVar2, expression7, expression8, list6, list7, wvVar, y7Var, r6Var, r6Var2, list8, list9, list10, expression9, hxVar, list11, epVar2);
    }
}
