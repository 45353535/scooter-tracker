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
import k8.rq;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class lq implements JSONSerializable, Hashable, f7 {
    public static final b Y = new b(null);
    private static final a6 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f88850a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f88851b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f88852c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final ep.e f88853d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Expression f88854e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Expression f88855f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final ep.d f88856g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Function2 f88857h0;
    private final hb A;
    private final hb B;
    public final List C;
    public final List D;
    private final Expression E;
    private final Expression F;
    private final List G;
    public final String H;
    public final List I;
    private final List J;
    private final wv K;
    public final Expression L;
    private final y7 M;
    private final r6 N;
    private final r6 O;
    private final List P;
    private final List Q;
    private final List R;
    private final Expression S;
    private final hx T;
    private final List U;
    private final ep V;
    private Integer W;
    private Integer X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f88858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f88859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6 f88860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f88861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Expression f88862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Expression f88863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f88864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f88865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f88866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l7 f88867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression f88868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression f88869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Expression f88870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression f88871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f88872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f88873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f88874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f88875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final bd f88876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f88877t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ep f88878u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f88879v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f88880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f88881x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final zh f88882y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f88883z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88884f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lq invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return lq.Y.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final lq a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((rq.f) BuiltInParserKt.getBuiltInParserComponent().t7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f88885g = new b(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Function2 f88886h = a.f88893f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a6 f88887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a6 f88888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y0 f88889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f88890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f88891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f88892f;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f88893f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f88885g.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((sq) BuiltInParserKt.getBuiltInParserComponent().w7().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(a6 a6Var, a6 a6Var2, y0 y0Var, String str, List list) {
            this.f88887a = a6Var;
            this.f88888b = a6Var2;
            this.f88889c = y0Var;
            this.f88890d = str;
            this.f88891e = list;
        }

        public static /* synthetic */ c b(c cVar, a6 a6Var, a6 a6Var2, y0 y0Var, String str, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                a6Var = cVar.f88887a;
            }
            if ((i10 & 2) != 0) {
                a6Var2 = cVar.f88888b;
            }
            if ((i10 & 4) != 0) {
                y0Var = cVar.f88889c;
            }
            if ((i10 & 8) != 0) {
                str = cVar.f88890d;
            }
            if ((i10 & 16) != 0) {
                list = cVar.f88891e;
            }
            List list2 = list;
            y0 y0Var2 = y0Var;
            return cVar.a(a6Var, a6Var2, y0Var2, str, list2);
        }

        public final c a(a6 a6Var, a6 a6Var2, y0 y0Var, String str, List list) {
            return new c(a6Var, a6Var2, y0Var, str, list);
        }

        public final boolean c(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean z10;
            if (cVar == null) {
                return false;
            }
            a6 a6Var = this.f88887a;
            if (a6Var != null ? a6Var.a(cVar.f88887a, expressionResolver, expressionResolver2) : cVar.f88887a == null) {
                a6 a6Var2 = this.f88888b;
                if (a6Var2 != null ? a6Var2.a(cVar.f88888b, expressionResolver, expressionResolver2) : cVar.f88888b == null) {
                    y0 y0Var = this.f88889c;
                    if ((y0Var != null ? y0Var.a(cVar.f88889c, expressionResolver, expressionResolver2) : cVar.f88889c == null) && Intrinsics.areEqual(this.f88890d, cVar.f88890d)) {
                        List list = this.f88891e;
                        List list2 = cVar.f88891e;
                        if (list != null) {
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
                        if (list2 != null) {
                            z10 = false;
                            break;
                        }
                        z10 = true;
                        if (z10) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f88892f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode();
            a6 a6Var = this.f88887a;
            int iHash = 0;
            int iHash2 = iHashCode + (a6Var != null ? a6Var.hash() : 0);
            a6 a6Var2 = this.f88888b;
            int iHash3 = iHash2 + (a6Var2 != null ? a6Var2.hash() : 0);
            y0 y0Var = this.f88889c;
            int iHash4 = iHash3 + (y0Var != null ? y0Var.hash() : 0) + this.f88890d.hashCode();
            List list = this.f88891e;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((j1) it.next()).hash();
                }
            }
            int i10 = iHash4 + iHash;
            this.f88892f = Integer.valueOf(i10);
            return i10;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((sq) BuiltInParserKt.getBuiltInParserComponent().w7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        Z = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f88850a0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f88851b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f88852c0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression expression = null;
        f88853d0 = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        f88854e0 = Expression.Companion.constant$default(companion, zv.STATE_CHANGE, null, 2, null);
        f88855f0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f88856g0 = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        f88857h0 = a.f88884f;
    }

    public lq(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, String str, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str2, zh zhVar, List list10, hb hbVar, hb hbVar2, List list11, List list12, Expression expression8, Expression expression9, List list13, String str3, List list14, List list15, wv wvVar, Expression expression10, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression11, hx hxVar, List list19, ep epVar2) {
        this.f88858a = g1Var;
        this.f88859b = j1Var;
        this.f88860c = a6Var;
        this.f88861d = list;
        this.f88862e = expression;
        this.f88863f = expression2;
        this.f88864g = expression3;
        this.f88865h = list2;
        this.f88866i = list3;
        this.f88867j = l7Var;
        this.f88868k = expression4;
        this.f88869l = expression5;
        this.f88870m = expression6;
        this.f88871n = expression7;
        this.f88872o = list4;
        this.f88873p = str;
        this.f88874q = list5;
        this.f88875r = list6;
        this.f88876s = bdVar;
        this.f88877t = list7;
        this.f88878u = epVar;
        this.f88879v = list8;
        this.f88880w = list9;
        this.f88881x = str2;
        this.f88882y = zhVar;
        this.f88883z = list10;
        this.A = hbVar;
        this.B = hbVar2;
        this.C = list11;
        this.D = list12;
        this.E = expression8;
        this.F = expression9;
        this.G = list13;
        this.H = str3;
        this.I = list14;
        this.J = list15;
        this.K = wvVar;
        this.L = expression10;
        this.M = y7Var;
        this.N = r6Var;
        this.O = r6Var2;
        this.P = list16;
        this.Q = list17;
        this.R = list18;
        this.S = expression11;
        this.T = hxVar;
        this.U = list19;
        this.V = epVar2;
    }

    public static /* synthetic */ lq z(lq lqVar, g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, String str, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str2, zh zhVar, List list10, hb hbVar, hb hbVar2, List list11, List list12, Expression expression8, Expression expression9, List list13, String str3, List list14, List list15, wv wvVar, Expression expression10, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression11, hx hxVar, List list19, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? lqVar.o() : g1Var;
        j1 j1Var2 = (i10 & 2) != 0 ? lqVar.f88859b : j1Var;
        a6 a6Var2 = (i10 & 4) != 0 ? lqVar.f88860c : a6Var;
        List list20 = (i10 & 8) != 0 ? lqVar.f88861d : list;
        Expression expressionG = (i10 & 16) != 0 ? lqVar.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? lqVar.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? lqVar.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? lqVar.w() : list2;
        List background = (i10 & 256) != 0 ? lqVar.getBackground() : list3;
        l7 l7VarX = (i10 & 512) != 0 ? lqVar.x() : l7Var;
        Expression expression12 = (i10 & 1024) != 0 ? lqVar.f88868k : expression4;
        Expression expression13 = (i10 & 2048) != 0 ? lqVar.f88869l : expression5;
        Expression expressionB = (i10 & 4096) != 0 ? lqVar.b() : expression6;
        g1 g1Var2 = g1VarO;
        Expression expression14 = (i10 & 8192) != 0 ? lqVar.f88871n : expression7;
        List listK = (i10 & 16384) != 0 ? lqVar.k() : list4;
        String str4 = (i10 & 32768) != 0 ? lqVar.f88873p : str;
        List list21 = (i10 & 65536) != 0 ? lqVar.f88874q : list5;
        List extensions = (i10 & 131072) != 0 ? lqVar.getExtensions() : list6;
        bd bdVarN = (i10 & 262144) != 0 ? lqVar.n() : bdVar;
        List listU = (i10 & 524288) != 0 ? lqVar.u() : list7;
        ep height = (i10 & 1048576) != 0 ? lqVar.getHeight() : epVar;
        List list22 = list21;
        List list23 = (i10 & 2097152) != 0 ? lqVar.f88879v : list8;
        List list24 = (i10 & 4194304) != 0 ? lqVar.f88880w : list9;
        String id2 = (i10 & 8388608) != 0 ? lqVar.getId() : str2;
        zh zhVarR = (i10 & 16777216) != 0 ? lqVar.r() : zhVar;
        List list25 = list24;
        List list26 = (i10 & 33554432) != 0 ? lqVar.f88883z : list10;
        hb hbVarD = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? lqVar.d() : hbVar;
        hb hbVarP = (i10 & 134217728) != 0 ? lqVar.p() : hbVar2;
        List list27 = list26;
        List list28 = (i10 & 268435456) != 0 ? lqVar.C : list11;
        List list29 = (i10 & 536870912) != 0 ? lqVar.D : list12;
        return lqVar.y(g1Var2, j1Var2, a6Var2, list20, expressionG, expressionM, alpha, listW, background, l7VarX, expression12, expression13, expressionB, expression14, listK, str4, list22, extensions, bdVarN, listU, height, list23, list25, id2, zhVarR, list27, hbVarD, hbVarP, list28, list29, (i10 & 1073741824) != 0 ? lqVar.f() : expression8, (i10 & Integer.MIN_VALUE) != 0 ? lqVar.e() : expression9, (i11 & 1) != 0 ? lqVar.q() : list13, (i11 & 2) != 0 ? lqVar.H : str3, (i11 & 4) != 0 ? lqVar.I : list14, (i11 & 8) != 0 ? lqVar.h() : list15, (i11 & 16) != 0 ? lqVar.getTransform() : wvVar, (i11 & 32) != 0 ? lqVar.L : expression10, (i11 & 64) != 0 ? lqVar.j() : y7Var, (i11 & 128) != 0 ? lqVar.v() : r6Var, (i11 & 256) != 0 ? lqVar.i() : r6Var2, (i11 & 512) != 0 ? lqVar.l() : list16, (i11 & 1024) != 0 ? lqVar.s() : list17, (i11 & 2048) != 0 ? lqVar.c() : list18, (i11 & 4096) != 0 ? lqVar.getVisibility() : expression11, (i11 & 8192) != 0 ? lqVar.t() : hxVar, (i11 & 16384) != 0 ? lqVar.a() : list19, (i11 & 32768) != 0 ? lqVar.getWidth() : epVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:451:0x05f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(k8.lq r9, com.yandex.div.json.expressions.ExpressionResolver r10, com.yandex.div.json.expressions.ExpressionResolver r11) {
        /*
            Method dump skipped, instruction units count: 2084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.lq.A(k8.lq, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
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
        Integer num = this.W;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(lq.class).hashCode();
        g1 g1VarO = o();
        int iHash17 = 0;
        int iHash18 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        j1 j1Var = this.f88859b;
        int iHash19 = iHash18 + (j1Var != null ? j1Var.hash() : 0) + this.f88860c.hash();
        List list = this.f88861d;
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
        int iHash20 = i12 + (l7VarX != null ? l7VarX.hash() : 0) + this.f88868k.hashCode() + this.f88869l.hashCode();
        Expression expressionB = b();
        int iHashCode4 = iHash20 + (expressionB != null ? expressionB.hashCode() : 0);
        Expression expression = this.f88871n;
        int iHashCode5 = iHashCode4 + (expression != null ? expression.hashCode() : 0);
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
        int i13 = iHashCode5 + iHash4;
        String str = this.f88873p;
        int iHashCode6 = i13 + (str != null ? str.hashCode() : 0);
        List list2 = this.f88874q;
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((j1) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = iHashCode6 + iHash5;
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
        List list3 = this.f88879v;
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
        List list4 = this.f88880w;
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
        int iHashCode7 = i17 + (id2 != null ? id2.hashCode() : 0);
        zh zhVarR = r();
        int iHash23 = iHashCode7 + (zhVarR != null ? zhVarR.hash() : 0);
        List list5 = this.f88883z;
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
        List list6 = this.C;
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
        List list7 = this.D;
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
        int iHashCode8 = i20 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0);
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
        String str2 = this.H;
        int iHashCode10 = i21 + (str2 != null ? str2.hashCode() : 0);
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
        int i22 = iHashCode10 + iHash14;
        wv transform = getTransform();
        int iHash26 = i22 + (transform != null ? transform.hash() : 0) + this.L.hashCode();
        y7 y7VarJ = j();
        int iHash27 = iHash26 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash28 = iHash27 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash29 = iHash28 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode11 = iHash29 + (listL != null ? listL.hashCode() : 0);
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
        int i23 = iHashCode11 + iHash15;
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
        int iHashCode12 = i23 + iHash16 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash30 = iHashCode12 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it17 = listA.iterator();
            while (it17.hasNext()) {
                iHash17 += ((hx) it17.next()).hash();
            }
        }
        int iHash31 = iHash30 + iHash17 + getWidth().hash();
        this.W = Integer.valueOf(iHash31);
        return iHash31;
    }

    @Override // k8.f7
    public List a() {
        return this.U;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f88870m;
    }

    @Override // k8.f7
    public List c() {
        return this.R;
    }

    @Override // k8.f7
    public hb d() {
        return this.A;
    }

    @Override // k8.f7
    public Expression e() {
        return this.F;
    }

    @Override // k8.f7
    public Expression f() {
        return this.E;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f88862e;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f88864g;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f88866i;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f88875r;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f88878u;
    }

    @Override // k8.f7
    public String getId() {
        return this.f88881x;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.K;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.S;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.V;
    }

    @Override // k8.f7
    public List h() {
        return this.J;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.X;
        if (num != null) {
            return num.intValue();
        }
        int iB = B();
        Iterator it = this.I.iterator();
        int iHash = 0;
        while (it.hasNext()) {
            iHash += ((c) it.next()).hash();
        }
        int i10 = iB + iHash;
        this.X = Integer.valueOf(i10);
        return i10;
    }

    @Override // k8.f7
    public r6 i() {
        return this.O;
    }

    @Override // k8.f7
    public y7 j() {
        return this.M;
    }

    @Override // k8.f7
    public List k() {
        return this.f88872o;
    }

    @Override // k8.f7
    public List l() {
        return this.P;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f88863f;
    }

    @Override // k8.f7
    public bd n() {
        return this.f88876s;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f88858a;
    }

    @Override // k8.f7
    public hb p() {
        return this.B;
    }

    @Override // k8.f7
    public List q() {
        return this.G;
    }

    @Override // k8.f7
    public zh r() {
        return this.f88882y;
    }

    @Override // k8.f7
    public List s() {
        return this.Q;
    }

    @Override // k8.f7
    public hx t() {
        return this.T;
    }

    @Override // k8.f7
    public List u() {
        return this.f88877t;
    }

    @Override // k8.f7
    public r6 v() {
        return this.N;
    }

    @Override // k8.f7
    public List w() {
        return this.f88865h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rq.f) BuiltInParserKt.getBuiltInParserComponent().t7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f88867j;
    }

    public final lq y(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, String str, List list5, List list6, bd bdVar, List list7, ep epVar, List list8, List list9, String str2, zh zhVar, List list10, hb hbVar, hb hbVar2, List list11, List list12, Expression expression8, Expression expression9, List list13, String str3, List list14, List list15, wv wvVar, Expression expression10, y7 y7Var, r6 r6Var, r6 r6Var2, List list16, List list17, List list18, Expression expression11, hx hxVar, List list19, ep epVar2) {
        return new lq(g1Var, j1Var, a6Var, list, expression, expression2, expression3, list2, list3, l7Var, expression4, expression5, expression6, expression7, list4, str, list5, list6, bdVar, list7, epVar, list8, list9, str2, zhVar, list10, hbVar, hbVar2, list11, list12, expression8, expression9, list13, str3, list14, list15, wvVar, expression10, y7Var, r6Var, r6Var2, list16, list17, list18, expression11, hxVar, list19, epVar2);
    }
}
