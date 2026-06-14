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
import k8.rf;
import k8.to;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ff implements JSONSerializable, Hashable, f7 {
    public static final c T = new c(null);
    private static final Expression U;
    private static final Expression V;
    private static final Expression W;
    private static final Expression X;
    private static final ep.e Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f87466a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final to.d f87467b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final xc f87468c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Expression f87469d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final ep.d f87470e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Function2 f87471f0;
    public final String A;
    private final Expression B;
    private final Expression C;
    private final List D;
    public final to E;
    public final xc F;
    private final List G;
    private final wv H;
    private final y7 I;
    private final r6 J;
    private final r6 K;
    private final List L;
    private final List M;
    private final List N;
    private final Expression O;
    private final hx P;
    private final List Q;
    private final ep R;
    private Integer S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f87472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f87473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f87474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gn f87475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Expression f87476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Expression f87477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f87478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression f87479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f87480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f87481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l7 f87482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Expression f87483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f87484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f87485n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final bd f87486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f87487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ep f87488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f87489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Expression f87490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gn f87491t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final gn f87492u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final gf f87493v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final zh f87494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final hb f87495x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Expression f87496y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final hb f87497z;

    public enum a {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f87498c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f87499d = b.f87507f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f87500e = C1036a.f87506f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f87505b;

        /* JADX INFO: renamed from: k8.ff$a$a, reason: collision with other inner class name */
        static final class C1036a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1036a f87506f = new C1036a();

            C1036a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke(String str) {
                return a.f87498c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f87507f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(a aVar) {
                return a.f87498c.b(aVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                a aVar = a.SCALE;
                if (Intrinsics.areEqual(str, aVar.f87505b)) {
                    return aVar;
                }
                a aVar2 = a.WORM;
                if (Intrinsics.areEqual(str, aVar2.f87505b)) {
                    return aVar2;
                }
                a aVar3 = a.SLIDER;
                if (Intrinsics.areEqual(str, aVar3.f87505b)) {
                    return aVar3;
                }
                return null;
            }

            public final String b(a aVar) {
                return aVar.f87505b;
            }

            private c() {
            }
        }

        a(String str) {
            this.f87505b = str;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f87508f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ff invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ff.T.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ff a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((rf.f) BuiltInParserKt.getBuiltInParserComponent().d4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        U = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        V = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        W = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        X = Expression.Companion.constant$default(companion, a.SCALE, null, 2, null);
        Y = new ep.e(new nx(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        f87466a0 = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        byte b10 = 0 == true ? 1 : 0;
        f87467b0 = new to.d(new gn(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, b10, 31, null));
        f87468c0 = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, 0 == true ? 1 : 0);
        f87469d0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f87470e0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f87471f0 = b.f87508f;
    }

    public ff(g1 g1Var, Expression expression, Expression expression2, gn gnVar, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, l7 l7Var, Expression expression7, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression8, gn gnVar2, gn gnVar3, gf gfVar, zh zhVar, hb hbVar, Expression expression9, hb hbVar2, String str2, Expression expression10, Expression expression11, List list6, to toVar, xc xcVar, List list7, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list8, List list9, List list10, Expression expression12, hx hxVar, List list11, ep epVar2) {
        this.f87472a = g1Var;
        this.f87473b = expression;
        this.f87474c = expression2;
        this.f87475d = gnVar;
        this.f87476e = expression3;
        this.f87477f = expression4;
        this.f87478g = expression5;
        this.f87479h = expression6;
        this.f87480i = list;
        this.f87481j = list2;
        this.f87482k = l7Var;
        this.f87483l = expression7;
        this.f87484m = list3;
        this.f87485n = list4;
        this.f87486o = bdVar;
        this.f87487p = list5;
        this.f87488q = epVar;
        this.f87489r = str;
        this.f87490s = expression8;
        this.f87491t = gnVar2;
        this.f87492u = gnVar3;
        this.f87493v = gfVar;
        this.f87494w = zhVar;
        this.f87495x = hbVar;
        this.f87496y = expression9;
        this.f87497z = hbVar2;
        this.A = str2;
        this.B = expression10;
        this.C = expression11;
        this.D = list6;
        this.E = toVar;
        this.F = xcVar;
        this.G = list7;
        this.H = wvVar;
        this.I = y7Var;
        this.J = r6Var;
        this.K = r6Var2;
        this.L = list8;
        this.M = list9;
        this.N = list10;
        this.O = expression12;
        this.P = hxVar;
        this.Q = list11;
        this.R = epVar2;
    }

    public static /* synthetic */ ff z(ff ffVar, g1 g1Var, Expression expression, Expression expression2, gn gnVar, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, l7 l7Var, Expression expression7, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression8, gn gnVar2, gn gnVar3, gf gfVar, zh zhVar, hb hbVar, Expression expression9, hb hbVar2, String str2, Expression expression10, Expression expression11, List list6, to toVar, xc xcVar, List list7, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list8, List list9, List list10, Expression expression12, hx hxVar, List list11, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? ffVar.o() : g1Var;
        Expression expression13 = (i10 & 2) != 0 ? ffVar.f87473b : expression;
        Expression expression14 = (i10 & 4) != 0 ? ffVar.f87474c : expression2;
        gn gnVar4 = (i10 & 8) != 0 ? ffVar.f87475d : gnVar;
        Expression expressionG = (i10 & 16) != 0 ? ffVar.g() : expression3;
        Expression expressionM = (i10 & 32) != 0 ? ffVar.m() : expression4;
        Expression alpha = (i10 & 64) != 0 ? ffVar.getAlpha() : expression5;
        Expression expression15 = (i10 & 128) != 0 ? ffVar.f87479h : expression6;
        List listW = (i10 & 256) != 0 ? ffVar.w() : list;
        List background = (i10 & 512) != 0 ? ffVar.getBackground() : list2;
        l7 l7VarX = (i10 & 1024) != 0 ? ffVar.x() : l7Var;
        Expression expressionB = (i10 & 2048) != 0 ? ffVar.b() : expression7;
        List listK = (i10 & 4096) != 0 ? ffVar.k() : list3;
        g1 g1Var2 = g1VarO;
        List extensions = (i10 & 8192) != 0 ? ffVar.getExtensions() : list4;
        bd bdVarN = (i10 & 16384) != 0 ? ffVar.n() : bdVar;
        List listU = (i10 & 32768) != 0 ? ffVar.u() : list5;
        ep height = (i10 & 65536) != 0 ? ffVar.getHeight() : epVar;
        String id2 = (i10 & 131072) != 0 ? ffVar.getId() : str;
        Expression expression16 = (i10 & 262144) != 0 ? ffVar.f87490s : expression8;
        gn gnVar5 = (i10 & 524288) != 0 ? ffVar.f87491t : gnVar2;
        gn gnVar6 = (i10 & 1048576) != 0 ? ffVar.f87492u : gnVar3;
        gf gfVar2 = (i10 & 2097152) != 0 ? ffVar.f87493v : gfVar;
        zh zhVarR = (i10 & 4194304) != 0 ? ffVar.r() : zhVar;
        hb hbVarD = (i10 & 8388608) != 0 ? ffVar.d() : hbVar;
        gf gfVar3 = gfVar2;
        Expression expression17 = (i10 & 16777216) != 0 ? ffVar.f87496y : expression9;
        return ffVar.y(g1Var2, expression13, expression14, gnVar4, expressionG, expressionM, alpha, expression15, listW, background, l7VarX, expressionB, listK, extensions, bdVarN, listU, height, id2, expression16, gnVar5, gnVar6, gfVar3, zhVarR, hbVarD, expression17, (i10 & 33554432) != 0 ? ffVar.p() : hbVar2, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ffVar.A : str2, (i10 & 134217728) != 0 ? ffVar.f() : expression10, (i10 & 268435456) != 0 ? ffVar.e() : expression11, (i10 & 536870912) != 0 ? ffVar.q() : list6, (i10 & 1073741824) != 0 ? ffVar.E : toVar, (i10 & Integer.MIN_VALUE) != 0 ? ffVar.F : xcVar, (i11 & 1) != 0 ? ffVar.h() : list7, (i11 & 2) != 0 ? ffVar.getTransform() : wvVar, (i11 & 4) != 0 ? ffVar.j() : y7Var, (i11 & 8) != 0 ? ffVar.v() : r6Var, (i11 & 16) != 0 ? ffVar.i() : r6Var2, (i11 & 32) != 0 ? ffVar.l() : list8, (i11 & 64) != 0 ? ffVar.s() : list9, (i11 & 128) != 0 ? ffVar.c() : list10, (i11 & 256) != 0 ? ffVar.getVisibility() : expression12, (i11 & 512) != 0 ? ffVar.t() : hxVar, (i11 & 1024) != 0 ? ffVar.a() : list11, (i11 & 2048) != 0 ? ffVar.getWidth() : epVar2);
    }

    public final boolean A(ff ffVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (ffVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if ((g1VarO != null ? g1VarO.a(ffVar.o(), expressionResolver, expressionResolver2) : ffVar.o() == null) && ((Number) this.f87473b.evaluate(expressionResolver)).intValue() == ((Number) ffVar.f87473b.evaluate(expressionResolver2)).intValue()) {
            if (((Number) this.f87474c.evaluate(expressionResolver)).doubleValue() == ((Number) ffVar.f87474c.evaluate(expressionResolver2)).doubleValue()) {
                gn gnVar = this.f87475d;
                if (gnVar != null ? gnVar.a(ffVar.f87475d, expressionResolver, expressionResolver2) : ffVar.f87475d == null) {
                    Expression expressionG = g();
                    y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
                    Expression expressionG2 = ffVar.g();
                    if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                        Expression expressionM = m();
                        z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                        Expression expressionM2 = ffVar.m();
                        if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                            if ((((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) ffVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) && this.f87479h.evaluate(expressionResolver) == ffVar.f87479h.evaluate(expressionResolver2)) {
                                List listW = w();
                                if (listW != null) {
                                    List listW2 = ffVar.w();
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
                                if (ffVar.w() != null) {
                                    z10 = false;
                                    break;
                                }
                                z10 = true;
                                if (z10) {
                                    List background = getBackground();
                                    if (background != null) {
                                        List background2 = ffVar.getBackground();
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
                                    if (ffVar.getBackground() != null) {
                                        z11 = false;
                                        break;
                                    }
                                    z11 = true;
                                    if (z11) {
                                        l7 l7VarX = x();
                                        if (l7VarX != null ? l7VarX.a(ffVar.x(), expressionResolver, expressionResolver2) : ffVar.x() == null) {
                                            Expression expressionB = b();
                                            Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                            Expression expressionB2 = ffVar.b();
                                            if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null)) {
                                                List listK = k();
                                                if (listK != null) {
                                                    List listK2 = ffVar.k();
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
                                                if (ffVar.k() != null) {
                                                    z12 = false;
                                                    break;
                                                }
                                                z12 = true;
                                                if (z12) {
                                                    List extensions = getExtensions();
                                                    if (extensions != null) {
                                                        List extensions2 = ffVar.getExtensions();
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
                                                    if (ffVar.getExtensions() != null) {
                                                        z13 = false;
                                                        break;
                                                    }
                                                    z13 = true;
                                                    if (z13) {
                                                        bd bdVarN = n();
                                                        if (bdVarN != null ? bdVarN.a(ffVar.n(), expressionResolver, expressionResolver2) : ffVar.n() == null) {
                                                            List listU = u();
                                                            if (listU != null) {
                                                                List listU2 = ffVar.u();
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
                                                            if (ffVar.u() != null) {
                                                                z14 = false;
                                                                break;
                                                            }
                                                            z14 = true;
                                                            if (z14 && getHeight().a(ffVar.getHeight(), expressionResolver, expressionResolver2) && Intrinsics.areEqual(getId(), ffVar.getId()) && ((Number) this.f87490s.evaluate(expressionResolver)).intValue() == ((Number) ffVar.f87490s.evaluate(expressionResolver2)).intValue()) {
                                                                gn gnVar2 = this.f87491t;
                                                                if (gnVar2 != null ? gnVar2.a(ffVar.f87491t, expressionResolver, expressionResolver2) : ffVar.f87491t == null) {
                                                                    gn gnVar3 = this.f87492u;
                                                                    if (gnVar3 != null ? gnVar3.a(ffVar.f87492u, expressionResolver, expressionResolver2) : ffVar.f87492u == null) {
                                                                        gf gfVar = this.f87493v;
                                                                        if (gfVar != null ? gfVar.a(ffVar.f87493v, expressionResolver, expressionResolver2) : ffVar.f87493v == null) {
                                                                            zh zhVarR = r();
                                                                            if (zhVarR != null ? zhVarR.a(ffVar.r(), expressionResolver, expressionResolver2) : ffVar.r() == null) {
                                                                                hb hbVarD = d();
                                                                                if (hbVarD != null ? hbVarD.a(ffVar.d(), expressionResolver, expressionResolver2) : ffVar.d() == null) {
                                                                                    if (((Number) this.f87496y.evaluate(expressionResolver)).doubleValue() == ((Number) ffVar.f87496y.evaluate(expressionResolver2)).doubleValue()) {
                                                                                        hb hbVarP = p();
                                                                                        if ((hbVarP != null ? hbVarP.a(ffVar.p(), expressionResolver, expressionResolver2) : ffVar.p() == null) && Intrinsics.areEqual(this.A, ffVar.A)) {
                                                                                            Expression expressionF = f();
                                                                                            String str = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                                            Expression expressionF2 = ffVar.f();
                                                                                            if (Intrinsics.areEqual(str, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                                                Expression expressionE = e();
                                                                                                Long l11 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                                                Expression expressionE2 = ffVar.e();
                                                                                                if (Intrinsics.areEqual(l11, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null)) {
                                                                                                    List listQ = q();
                                                                                                    if (listQ != null) {
                                                                                                        List listQ2 = ffVar.q();
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
                                                                                                    if (ffVar.q() != null) {
                                                                                                        z15 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    z15 = true;
                                                                                                    if (z15 && this.E.a(ffVar.E, expressionResolver, expressionResolver2) && this.F.a(ffVar.F, expressionResolver, expressionResolver2)) {
                                                                                                        List listH = h();
                                                                                                        if (listH != null) {
                                                                                                            List listH2 = ffVar.h();
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
                                                                                                        if (ffVar.h() != null) {
                                                                                                            z16 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        z16 = true;
                                                                                                        if (z16) {
                                                                                                            wv transform = getTransform();
                                                                                                            if (transform != null ? transform.a(ffVar.getTransform(), expressionResolver, expressionResolver2) : ffVar.getTransform() == null) {
                                                                                                                y7 y7VarJ = j();
                                                                                                                if (y7VarJ != null ? y7VarJ.a(ffVar.j(), expressionResolver, expressionResolver2) : ffVar.j() == null) {
                                                                                                                    r6 r6VarV = v();
                                                                                                                    if (r6VarV != null ? r6VarV.a(ffVar.v(), expressionResolver, expressionResolver2) : ffVar.v() == null) {
                                                                                                                        r6 r6VarI = i();
                                                                                                                        if (r6VarI != null ? r6VarI.a(ffVar.i(), expressionResolver, expressionResolver2) : ffVar.i() == null) {
                                                                                                                            List listL = l();
                                                                                                                            if (listL != null) {
                                                                                                                                List listL2 = ffVar.l();
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
                                                                                                                            if (ffVar.l() != null) {
                                                                                                                                z17 = false;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            z17 = true;
                                                                                                                            if (z17) {
                                                                                                                                List listS = s();
                                                                                                                                if (listS != null) {
                                                                                                                                    List listS2 = ffVar.s();
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
                                                                                                                                if (ffVar.s() != null) {
                                                                                                                                    z18 = false;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                z18 = true;
                                                                                                                                if (z18) {
                                                                                                                                    List listC = c();
                                                                                                                                    if (listC != null) {
                                                                                                                                        List listC2 = ffVar.c();
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
                                                                                                                                    if (ffVar.c() != null) {
                                                                                                                                        z19 = false;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    z19 = true;
                                                                                                                                    if (z19 && getVisibility().evaluate(expressionResolver) == ffVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                                        hx hxVarT = t();
                                                                                                                                        if (hxVarT != null ? hxVarT.g(ffVar.t(), expressionResolver, expressionResolver2) : ffVar.t() == null) {
                                                                                                                                            List listA = a();
                                                                                                                                            if (listA != null) {
                                                                                                                                                List listA2 = ffVar.a();
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
                                                                                                                                            if (ffVar.a() != null) {
                                                                                                                                                z20 = false;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            z20 = true;
                                                                                                                                            if (z20 && getWidth().a(ffVar.getWidth(), expressionResolver, expressionResolver2)) {
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
        return false;
    }

    public /* synthetic */ int B() {
        return v7.b.a(this);
    }

    @Override // k8.f7
    public List a() {
        return this.Q;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f87483l;
    }

    @Override // k8.f7
    public List c() {
        return this.N;
    }

    @Override // k8.f7
    public hb d() {
        return this.f87495x;
    }

    @Override // k8.f7
    public Expression e() {
        return this.C;
    }

    @Override // k8.f7
    public Expression f() {
        return this.B;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f87476e;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f87478g;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f87481j;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f87485n;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f87488q;
    }

    @Override // k8.f7
    public String getId() {
        return this.f87489r;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.H;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.O;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.R;
    }

    @Override // k8.f7
    public List h() {
        return this.G;
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
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ff.class).hashCode();
        g1 g1VarO = o();
        int iHash10 = 0;
        int iHash11 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0) + this.f87473b.hashCode() + this.f87474c.hashCode();
        gn gnVar = this.f87475d;
        int iHash12 = iHash11 + (gnVar != null ? gnVar.hash() : 0);
        Expression expressionG = g();
        int iHashCode2 = iHash12 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression expressionM = m();
        int iHashCode3 = iHashCode2 + (expressionM != null ? expressionM.hashCode() : 0) + getAlpha().hashCode() + this.f87479h.hashCode();
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
        int iHash13 = i11 + (l7VarX != null ? l7VarX.hash() : 0);
        Expression expressionB = b();
        int iHashCode4 = iHash13 + (expressionB != null ? expressionB.hashCode() : 0);
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
        int iHash14 = i13 + (bdVarN != null ? bdVarN.hash() : 0);
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
        int iHash15 = iHash14 + iHash5 + getHeight().hash();
        String id2 = getId();
        int iHashCode5 = iHash15 + (id2 != null ? id2.hashCode() : 0) + this.f87490s.hashCode();
        gn gnVar2 = this.f87491t;
        int iHash16 = iHashCode5 + (gnVar2 != null ? gnVar2.hash() : 0);
        gn gnVar3 = this.f87492u;
        int iHash17 = iHash16 + (gnVar3 != null ? gnVar3.hash() : 0);
        gf gfVar = this.f87493v;
        int iHash18 = iHash17 + (gfVar != null ? gfVar.hash() : 0);
        zh zhVarR = r();
        int iHash19 = iHash18 + (zhVarR != null ? zhVarR.hash() : 0);
        hb hbVarD = d();
        int iHash20 = iHash19 + (hbVarD != null ? hbVarD.hash() : 0) + this.f87496y.hashCode();
        hb hbVarP = p();
        int iHash21 = iHash20 + (hbVarP != null ? hbVarP.hash() : 0);
        String str = this.A;
        int iHashCode6 = iHash21 + (str != null ? str.hashCode() : 0);
        Expression expressionF = f();
        int iHashCode7 = iHashCode6 + (expressionF != null ? expressionF.hashCode() : 0);
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
        int iHash22 = iHashCode8 + iHash6 + this.E.hash() + this.F.hash();
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
        int i14 = iHash22 + iHash7;
        wv transform = getTransform();
        int iHash23 = i14 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash24 = iHash23 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash25 = iHash24 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash26 = iHash25 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode9 = iHash26 + (listL != null ? listL.hashCode() : 0);
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
        int i15 = iHashCode9 + iHash8;
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
        int iHashCode10 = i15 + iHash9 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash27 = iHashCode10 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((hx) it10.next()).hash();
            }
        }
        int iHash28 = iHash27 + iHash10 + getWidth().hash();
        this.S = Integer.valueOf(iHash28);
        return iHash28;
    }

    @Override // k8.f7
    public r6 i() {
        return this.K;
    }

    @Override // k8.f7
    public y7 j() {
        return this.I;
    }

    @Override // k8.f7
    public List k() {
        return this.f87484m;
    }

    @Override // k8.f7
    public List l() {
        return this.L;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f87477f;
    }

    @Override // k8.f7
    public bd n() {
        return this.f87486o;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f87472a;
    }

    @Override // k8.f7
    public hb p() {
        return this.f87497z;
    }

    @Override // k8.f7
    public List q() {
        return this.D;
    }

    @Override // k8.f7
    public zh r() {
        return this.f87494w;
    }

    @Override // k8.f7
    public List s() {
        return this.M;
    }

    @Override // k8.f7
    public hx t() {
        return this.P;
    }

    @Override // k8.f7
    public List u() {
        return this.f87487p;
    }

    @Override // k8.f7
    public r6 v() {
        return this.J;
    }

    @Override // k8.f7
    public List w() {
        return this.f87480i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rf.f) BuiltInParserKt.getBuiltInParserComponent().d4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f87482k;
    }

    public final ff y(g1 g1Var, Expression expression, Expression expression2, gn gnVar, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, l7 l7Var, Expression expression7, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression8, gn gnVar2, gn gnVar3, gf gfVar, zh zhVar, hb hbVar, Expression expression9, hb hbVar2, String str2, Expression expression10, Expression expression11, List list6, to toVar, xc xcVar, List list7, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list8, List list9, List list10, Expression expression12, hx hxVar, List list11, ep epVar2) {
        return new ff(g1Var, expression, expression2, gnVar, expression3, expression4, expression5, expression6, list, list2, l7Var, expression7, list3, list4, bdVar, list5, epVar, str, expression8, gnVar2, gnVar3, gfVar, zhVar, hbVar, expression9, hbVar2, str2, expression10, expression11, list6, toVar, xcVar, list7, wvVar, y7Var, r6Var, r6Var2, list8, list9, list10, expression12, hxVar, list11, epVar2);
    }
}
