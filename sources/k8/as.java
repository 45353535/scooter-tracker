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
import k8.ks;
import k8.ls;
import k8.rs;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class as implements JSONSerializable, Hashable, f7 {
    public static final b T = new b(null);
    private static final Expression U;
    private static final Expression V;
    private static final Expression W;
    private static final ep.e X;
    private static final Expression Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f86319a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final hb f86320b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f86321c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final hb f86322d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Expression f86323e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final ep.d f86324f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Function2 f86325g0;
    public final hb A;
    public final Expression B;
    public final d C;
    public final e D;
    public final hb E;
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
    private final g1 f86326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f86327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f86328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f86329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f86330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f86331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l7 f86332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Expression f86333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f86334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression f86335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f86336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final bd f86337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f86338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression f86339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ep f86340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f86341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f86342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final zh f86343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final hb f86344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final hb f86345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression f86346u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Expression f86347v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Expression f86348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f86349x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Expression f86350y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Expression f86351z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86352f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final as invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return as.T.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final as a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ks.e) BuiltInParserKt.getBuiltInParserComponent().U7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f86353e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Function2 f86354f = a.f86359f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y0 f86355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f86356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j1 f86357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f86358d;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f86359f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f86353e.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((bs) BuiltInParserKt.getBuiltInParserComponent().R7().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(y0 y0Var, Expression expression, j1 j1Var) {
            this.f86355a = y0Var;
            this.f86356b = expression;
            this.f86357c = j1Var;
        }

        public static /* synthetic */ c b(c cVar, y0 y0Var, Expression expression, j1 j1Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                y0Var = cVar.f86355a;
            }
            if ((i10 & 2) != 0) {
                expression = cVar.f86356b;
            }
            if ((i10 & 4) != 0) {
                j1Var = cVar.f86357c;
            }
            return cVar.a(y0Var, expression, j1Var);
        }

        public final c a(y0 y0Var, Expression expression, j1 j1Var) {
            return new c(y0Var, expression, j1Var);
        }

        public final boolean c(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (cVar != null && this.f86355a.a(cVar.f86355a, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.f86356b.evaluate(expressionResolver), cVar.f86356b.evaluate(expressionResolver2))) {
                j1 j1Var = this.f86357c;
                j1 j1Var2 = cVar.f86357c;
                if (j1Var != null ? j1Var.a(j1Var2, expressionResolver, expressionResolver2) : j1Var2 == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f86358d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode() + this.f86355a.hash() + this.f86356b.hashCode();
            j1 j1Var = this.f86357c;
            int iHash = iHashCode + (j1Var != null ? j1Var.hash() : 0);
            this.f86358d = Integer.valueOf(iHash);
            return iHash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((bs) BuiltInParserKt.getBuiltInParserComponent().R7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public static final class d implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f86360e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final xc f86361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final xc f86362g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Function2 f86363h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xc f86364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f86365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xc f86366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f86367d;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f86368f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return d.f86360e.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((ls.b) BuiltInParserKt.getBuiltInParserComponent().X7().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            int i10 = 1;
            f86361f = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, 0 == true ? 1 : 0);
            f86362g = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i10, 0 == true ? 1 : 0);
            f86363h = a.f86368f;
        }

        public d(xc xcVar, Expression expression, xc xcVar2) {
            this.f86364a = xcVar;
            this.f86365b = expression;
            this.f86366c = xcVar2;
        }

        public final boolean a(d dVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return dVar != null && this.f86364a.a(dVar.f86364a, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.f86365b.evaluate(expressionResolver), dVar.f86365b.evaluate(expressionResolver2)) && this.f86366c.a(dVar.f86366c, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f86367d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(d.class).hashCode() + this.f86364a.hash() + this.f86365b.hashCode() + this.f86366c.hash();
            this.f86367d = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((ls.b) BuiltInParserKt.getBuiltInParserComponent().X7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        V = Expression.Companion.constant$default(companion, bool, null, 2, null);
        W = Expression.Companion.constant$default(companion, bool, null, 2, null);
        X = new ep.e(new nx(null, null, null, 7, null));
        Y = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Z = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f86319a0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f86320b0 = new hb(Expression.Companion.constant$default(companion, 0L, null, 2, null), null, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), 0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), null, 82, null);
        f86321c0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f86322d0 = new hb(Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null, Expression.Companion.constant$default(companion, 0L, null, 2, null), null, 82, null);
        f86323e0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f86324f0 = new ep.d(new ni(null, null, null, 7, null));
        f86325g0 = a.f86352f;
    }

    public as(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, Expression expression5, List list4, bd bdVar, List list5, Expression expression6, ep epVar, String str, List list6, zh zhVar, hb hbVar, hb hbVar2, Expression expression7, Expression expression8, Expression expression9, List list7, Expression expression10, Expression expression11, hb hbVar3, Expression expression12, d dVar, e eVar, hb hbVar4, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression13, hx hxVar, List list12, ep epVar2) {
        this.f86326a = g1Var;
        this.f86327b = expression;
        this.f86328c = expression2;
        this.f86329d = expression3;
        this.f86330e = list;
        this.f86331f = list2;
        this.f86332g = l7Var;
        this.f86333h = expression4;
        this.f86334i = list3;
        this.f86335j = expression5;
        this.f86336k = list4;
        this.f86337l = bdVar;
        this.f86338m = list5;
        this.f86339n = expression6;
        this.f86340o = epVar;
        this.f86341p = str;
        this.f86342q = list6;
        this.f86343r = zhVar;
        this.f86344s = hbVar;
        this.f86345t = hbVar2;
        this.f86346u = expression7;
        this.f86347v = expression8;
        this.f86348w = expression9;
        this.f86349x = list7;
        this.f86350y = expression10;
        this.f86351z = expression11;
        this.A = hbVar3;
        this.B = expression12;
        this.C = dVar;
        this.D = eVar;
        this.E = hbVar4;
        this.F = list8;
        this.G = wvVar;
        this.H = y7Var;
        this.I = r6Var;
        this.J = r6Var2;
        this.K = list9;
        this.L = list10;
        this.M = list11;
        this.N = expression13;
        this.O = hxVar;
        this.P = list12;
        this.Q = epVar2;
    }

    public static /* synthetic */ as z(as asVar, g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, Expression expression5, List list4, bd bdVar, List list5, Expression expression6, ep epVar, String str, List list6, zh zhVar, hb hbVar, hb hbVar2, Expression expression7, Expression expression8, Expression expression9, List list7, Expression expression10, Expression expression11, hb hbVar3, Expression expression12, d dVar, e eVar, hb hbVar4, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression13, hx hxVar, List list12, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? asVar.o() : g1Var;
        Expression expressionG = (i10 & 2) != 0 ? asVar.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? asVar.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? asVar.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? asVar.w() : list;
        List background = (i10 & 32) != 0 ? asVar.getBackground() : list2;
        l7 l7VarX = (i10 & 64) != 0 ? asVar.x() : l7Var;
        Expression expressionB = (i10 & 128) != 0 ? asVar.b() : expression4;
        List listK = (i10 & 256) != 0 ? asVar.k() : list3;
        Expression expression14 = (i10 & 512) != 0 ? asVar.f86335j : expression5;
        List extensions = (i10 & 1024) != 0 ? asVar.getExtensions() : list4;
        bd bdVarN = (i10 & 2048) != 0 ? asVar.n() : bdVar;
        List listU = (i10 & 4096) != 0 ? asVar.u() : list5;
        g1 g1Var2 = g1VarO;
        Expression expression15 = (i10 & 8192) != 0 ? asVar.f86339n : expression6;
        ep height = (i10 & 16384) != 0 ? asVar.getHeight() : epVar;
        String id2 = (i10 & 32768) != 0 ? asVar.getId() : str;
        List list13 = (i10 & 65536) != 0 ? asVar.f86342q : list6;
        return asVar.y(g1Var2, expressionG, expressionM, alpha, listW, background, l7VarX, expressionB, listK, expression14, extensions, bdVarN, listU, expression15, height, id2, list13, (i10 & 131072) != 0 ? asVar.r() : zhVar, (i10 & 262144) != 0 ? asVar.d() : hbVar, (i10 & 524288) != 0 ? asVar.p() : hbVar2, (i10 & 1048576) != 0 ? asVar.f86346u : expression7, (i10 & 2097152) != 0 ? asVar.f() : expression8, (i10 & 4194304) != 0 ? asVar.e() : expression9, (i10 & 8388608) != 0 ? asVar.q() : list7, (i10 & 16777216) != 0 ? asVar.f86350y : expression10, (i10 & 33554432) != 0 ? asVar.f86351z : expression11, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? asVar.A : hbVar3, (i10 & 134217728) != 0 ? asVar.B : expression12, (i10 & 268435456) != 0 ? asVar.C : dVar, (i10 & 536870912) != 0 ? asVar.D : eVar, (i10 & 1073741824) != 0 ? asVar.E : hbVar4, (i10 & Integer.MIN_VALUE) != 0 ? asVar.h() : list8, (i11 & 1) != 0 ? asVar.getTransform() : wvVar, (i11 & 2) != 0 ? asVar.j() : y7Var, (i11 & 4) != 0 ? asVar.v() : r6Var, (i11 & 8) != 0 ? asVar.i() : r6Var2, (i11 & 16) != 0 ? asVar.l() : list9, (i11 & 32) != 0 ? asVar.s() : list10, (i11 & 64) != 0 ? asVar.c() : list11, (i11 & 128) != 0 ? asVar.getVisibility() : expression13, (i11 & 256) != 0 ? asVar.t() : hxVar, (i11 & 512) != 0 ? asVar.a() : list12, (i11 & 1024) != 0 ? asVar.getWidth() : epVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(k8.as r9, com.yandex.div.json.expressions.ExpressionResolver r10, com.yandex.div.json.expressions.ExpressionResolver r11) {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.as.A(k8.as, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
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
        int iHashCode = kotlin.jvm.internal.v0.b(as.class).hashCode();
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
        int iHashCode5 = iHashCode4 + iHash3 + this.f86335j.hashCode();
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
        int i12 = iHashCode5 + iHash4;
        bd bdVarN = n();
        int iHash13 = i12 + (bdVarN != null ? bdVarN.hash() : 0);
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
        int iHashCode6 = iHash13 + iHash5 + this.f86339n.hashCode() + getHeight().hash();
        String id2 = getId();
        int iHashCode7 = iHashCode6 + (id2 != null ? id2.hashCode() : 0);
        zh zhVarR = r();
        int iHash14 = iHashCode7 + (zhVarR != null ? zhVarR.hash() : 0);
        hb hbVarD = d();
        int iHash15 = iHash14 + (hbVarD != null ? hbVarD.hash() : 0);
        hb hbVarP = p();
        int iHash16 = iHash15 + (hbVarP != null ? hbVarP.hash() : 0) + this.f86346u.hashCode();
        Expression expressionF = f();
        int iHashCode8 = iHash16 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode9 = iHashCode8 + (expressionE != null ? expressionE.hashCode() : 0);
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
        int iHashCode10 = iHashCode9 + iHash6 + this.f86350y.hashCode() + this.f86351z.hashCode() + this.A.hash() + this.B.hashCode();
        d dVar = this.C;
        int iHash17 = iHashCode10 + (dVar != null ? dVar.hash() : 0);
        e eVar = this.D;
        int iHash18 = iHash17 + (eVar != null ? eVar.hash() : 0) + this.E.hash();
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
        int i13 = iHash18 + iHash7;
        wv transform = getTransform();
        int iHash19 = i13 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash20 = iHash19 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash21 = iHash20 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash22 = iHash21 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode11 = iHash22 + (listL != null ? listL.hashCode() : 0);
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
        int i14 = iHashCode11 + iHash8;
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
        int iHashCode12 = i14 + iHash9 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash23 = iHashCode12 + (hxVarT != null ? hxVarT.hash() : 0);
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
        return this.f86333h;
    }

    @Override // k8.f7
    public List c() {
        return this.M;
    }

    @Override // k8.f7
    public hb d() {
        return this.f86344s;
    }

    @Override // k8.f7
    public Expression e() {
        return this.f86348w;
    }

    @Override // k8.f7
    public Expression f() {
        return this.f86347v;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f86327b;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f86329d;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f86331f;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f86336k;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f86340o;
    }

    @Override // k8.f7
    public String getId() {
        return this.f86341p;
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
        Iterator it = this.f86342q.iterator();
        int iHash = 0;
        while (it.hasNext()) {
            iHash += ((c) it.next()).hash();
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
        return this.f86334i;
    }

    @Override // k8.f7
    public List l() {
        return this.K;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f86328c;
    }

    @Override // k8.f7
    public bd n() {
        return this.f86337l;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f86326a;
    }

    @Override // k8.f7
    public hb p() {
        return this.f86345t;
    }

    @Override // k8.f7
    public List q() {
        return this.f86349x;
    }

    @Override // k8.f7
    public zh r() {
        return this.f86343r;
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
        return this.f86338m;
    }

    @Override // k8.f7
    public r6 v() {
        return this.I;
    }

    @Override // k8.f7
    public List w() {
        return this.f86330e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ks.e) BuiltInParserKt.getBuiltInParserComponent().U7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f86332g;
    }

    public final as y(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, Expression expression5, List list4, bd bdVar, List list5, Expression expression6, ep epVar, String str, List list6, zh zhVar, hb hbVar, hb hbVar2, Expression expression7, Expression expression8, Expression expression9, List list7, Expression expression10, Expression expression11, hb hbVar3, Expression expression12, d dVar, e eVar, hb hbVar4, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression13, hx hxVar, List list12, ep epVar2) {
        return new as(g1Var, expression, expression2, expression3, list, list2, l7Var, expression4, list3, expression5, list4, bdVar, list5, expression6, epVar, str, list6, zhVar, hbVar, hbVar2, expression7, expression8, expression9, list7, expression10, expression11, hbVar3, expression12, dVar, eVar, hbVar4, list8, wvVar, y7Var, r6Var, r6Var2, list9, list10, list11, expression13, hxVar, list12, epVar2);
    }

    public static final class e implements JSONSerializable, Hashable {
        private static final Expression A;
        private static final Expression B;
        private static final Expression C;
        private static final Expression D;
        private static final Expression E;
        private static final Expression F;
        private static final hb G;
        private static final Function2 H;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final c f86369v = new c(null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final Expression f86370w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final Expression f86371x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final Expression f86372y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final Expression f86373z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f86374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f86375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression f86376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression f86377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Expression f86378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Expression f86379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Expression f86380g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g9 f86381h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Expression f86382i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Expression f86383j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Expression f86384k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Expression f86385l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Expression f86386m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Expression f86387n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Expression f86388o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Expression f86389p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Expression f86390q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Expression f86391r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Expression f86392s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final hb f86393t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f86394u;

        public enum a {
            SLIDE("slide"),
            FADE("fade"),
            NONE("none");


            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f86395c = new c(null);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final Function1 f86396d = b.f86404f;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final Function1 f86397e = C1030a.f86403f;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f86402b;

            /* JADX INFO: renamed from: k8.as$e$a$a, reason: collision with other inner class name */
            static final class C1030a extends Lambda implements Function1 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final C1030a f86403f = new C1030a();

                C1030a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a invoke(String str) {
                    return a.f86395c.a(str);
                }
            }

            static final class b extends Lambda implements Function1 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final b f86404f = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(a aVar) {
                    return a.f86395c.b(aVar);
                }
            }

            public static final class c {
                public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final a a(String str) {
                    a aVar = a.SLIDE;
                    if (Intrinsics.areEqual(str, aVar.f86402b)) {
                        return aVar;
                    }
                    a aVar2 = a.FADE;
                    if (Intrinsics.areEqual(str, aVar2.f86402b)) {
                        return aVar2;
                    }
                    a aVar3 = a.NONE;
                    if (Intrinsics.areEqual(str, aVar3.f86402b)) {
                        return aVar3;
                    }
                    return null;
                }

                public final String b(a aVar) {
                    return aVar.f86402b;
                }

                private c() {
                }
            }

            a(String str) {
                this.f86402b = str;
            }
        }

        static final class b extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f86405f = new b();

            b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return e.f86369v.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((rs.g) BuiltInParserKt.getBuiltInParserComponent().a8().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private c() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            f86370w = Expression.Companion.constant$default(companion, -9120, null, 2, null);
            f86371x = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
            f86372y = Expression.Companion.constant$default(companion, 300L, null, 2, null);
            f86373z = Expression.Companion.constant$default(companion, a.SLIDE, null, 2, null);
            A = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            B = Expression.Companion.constant$default(companion, jp.SP, null, 2, null);
            C = Expression.Companion.constant$default(companion, jd.REGULAR, null, 2, null);
            D = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
            E = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            F = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            G = new hb(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
            H = b.f86405f;
        }

        public e(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, g9 g9Var, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, Expression expression17, Expression expression18, hb hbVar) {
            this.f86374a = expression;
            this.f86375b = expression2;
            this.f86376c = expression3;
            this.f86377d = expression4;
            this.f86378e = expression5;
            this.f86379f = expression6;
            this.f86380g = expression7;
            this.f86381h = g9Var;
            this.f86382i = expression8;
            this.f86383j = expression9;
            this.f86384k = expression10;
            this.f86385l = expression11;
            this.f86386m = expression12;
            this.f86387n = expression13;
            this.f86388o = expression14;
            this.f86389p = expression15;
            this.f86390q = expression16;
            this.f86391r = expression17;
            this.f86392s = expression18;
            this.f86393t = hbVar;
        }

        public final boolean a(e eVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (eVar != null && ((Number) this.f86374a.evaluate(expressionResolver)).intValue() == ((Number) eVar.f86374a.evaluate(expressionResolver2)).intValue()) {
                Expression expression = this.f86375b;
                JSONObject jSONObject = expression != null ? (JSONObject) expression.evaluate(expressionResolver) : null;
                Expression expression2 = eVar.f86375b;
                if (Intrinsics.areEqual(jSONObject, expression2 != null ? (JSONObject) expression2.evaluate(expressionResolver2) : null)) {
                    Expression expression3 = this.f86376c;
                    jd jdVar = expression3 != null ? (jd) expression3.evaluate(expressionResolver) : null;
                    Expression expression4 = eVar.f86376c;
                    if (jdVar == (expression4 != null ? (jd) expression4.evaluate(expressionResolver2) : null) && ((Number) this.f86377d.evaluate(expressionResolver)).intValue() == ((Number) eVar.f86377d.evaluate(expressionResolver2)).intValue() && ((Number) this.f86378e.evaluate(expressionResolver)).longValue() == ((Number) eVar.f86378e.evaluate(expressionResolver2)).longValue() && this.f86379f.evaluate(expressionResolver) == eVar.f86379f.evaluate(expressionResolver2)) {
                        Expression expression5 = this.f86380g;
                        Long l10 = expression5 != null ? (Long) expression5.evaluate(expressionResolver) : null;
                        Expression expression6 = eVar.f86380g;
                        if (Intrinsics.areEqual(l10, expression6 != null ? (Long) expression6.evaluate(expressionResolver2) : null)) {
                            g9 g9Var = this.f86381h;
                            if (g9Var != null ? g9Var.a(eVar.f86381h, expressionResolver, expressionResolver2) : eVar.f86381h == null) {
                                Expression expression7 = this.f86382i;
                                String str = expression7 != null ? (String) expression7.evaluate(expressionResolver) : null;
                                Expression expression8 = eVar.f86382i;
                                if (Intrinsics.areEqual(str, expression8 != null ? (String) expression8.evaluate(expressionResolver2) : null) && ((Number) this.f86383j.evaluate(expressionResolver)).longValue() == ((Number) eVar.f86383j.evaluate(expressionResolver2)).longValue() && this.f86384k.evaluate(expressionResolver) == eVar.f86384k.evaluate(expressionResolver2) && this.f86385l.evaluate(expressionResolver) == eVar.f86385l.evaluate(expressionResolver2)) {
                                    Expression expression9 = this.f86386m;
                                    Integer num = expression9 != null ? (Integer) expression9.evaluate(expressionResolver) : null;
                                    Expression expression10 = eVar.f86386m;
                                    if (Intrinsics.areEqual(num, expression10 != null ? (Integer) expression10.evaluate(expressionResolver2) : null)) {
                                        Expression expression11 = this.f86387n;
                                        JSONObject jSONObject2 = expression11 != null ? (JSONObject) expression11.evaluate(expressionResolver) : null;
                                        Expression expression12 = eVar.f86387n;
                                        if (Intrinsics.areEqual(jSONObject2, expression12 != null ? (JSONObject) expression12.evaluate(expressionResolver2) : null)) {
                                            Expression expression13 = this.f86388o;
                                            jd jdVar2 = expression13 != null ? (jd) expression13.evaluate(expressionResolver) : null;
                                            Expression expression14 = eVar.f86388o;
                                            if (jdVar2 == (expression14 != null ? (jd) expression14.evaluate(expressionResolver2) : null) && ((Number) this.f86389p.evaluate(expressionResolver)).intValue() == ((Number) eVar.f86389p.evaluate(expressionResolver2)).intValue() && ((Number) this.f86390q.evaluate(expressionResolver)).longValue() == ((Number) eVar.f86390q.evaluate(expressionResolver2)).longValue()) {
                                                if (((Number) this.f86391r.evaluate(expressionResolver)).doubleValue() == ((Number) eVar.f86391r.evaluate(expressionResolver2)).doubleValue()) {
                                                    Expression expression15 = this.f86392s;
                                                    Long l11 = expression15 != null ? (Long) expression15.evaluate(expressionResolver) : null;
                                                    Expression expression16 = eVar.f86392s;
                                                    if (Intrinsics.areEqual(l11, expression16 != null ? (Long) expression16.evaluate(expressionResolver2) : null) && this.f86393t.a(eVar.f86393t, expressionResolver, expressionResolver2)) {
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
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f86394u;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(e.class).hashCode() + this.f86374a.hashCode();
            Expression expression = this.f86375b;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            Expression expression2 = this.f86376c;
            int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.f86377d.hashCode() + this.f86378e.hashCode() + this.f86379f.hashCode();
            Expression expression3 = this.f86380g;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            g9 g9Var = this.f86381h;
            int iHash = iHashCode4 + (g9Var != null ? g9Var.hash() : 0);
            Expression expression4 = this.f86382i;
            int iHashCode5 = iHash + (expression4 != null ? expression4.hashCode() : 0) + this.f86383j.hashCode() + this.f86384k.hashCode() + this.f86385l.hashCode();
            Expression expression5 = this.f86386m;
            int iHashCode6 = iHashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            Expression expression6 = this.f86387n;
            int iHashCode7 = iHashCode6 + (expression6 != null ? expression6.hashCode() : 0);
            Expression expression7 = this.f86388o;
            int iHashCode8 = iHashCode7 + (expression7 != null ? expression7.hashCode() : 0) + this.f86389p.hashCode() + this.f86390q.hashCode() + this.f86391r.hashCode();
            Expression expression8 = this.f86392s;
            int iHashCode9 = iHashCode8 + (expression8 != null ? expression8.hashCode() : 0) + this.f86393t.hash();
            this.f86394u = Integer.valueOf(iHashCode9);
            return iHashCode9;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((rs.g) BuiltInParserKt.getBuiltInParserComponent().a8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ e(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, g9 g9Var, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, Expression expression17, Expression expression18, hb hbVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? f86370w : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? null : expression3, (i10 & 8) != 0 ? f86371x : expression4, (i10 & 16) != 0 ? f86372y : expression5, (i10 & 32) != 0 ? f86373z : expression6, (i10 & 64) != 0 ? null : expression7, (i10 & 128) != 0 ? null : g9Var, (i10 & 256) != 0 ? null : expression8, (i10 & 512) != 0 ? A : expression9, (i10 & 1024) != 0 ? B : expression10, (i10 & 2048) != 0 ? C : expression11, (i10 & 4096) != 0 ? null : expression12, (i10 & 8192) != 0 ? null : expression13, (i10 & 16384) != 0 ? null : expression14, (i10 & 32768) != 0 ? D : expression15, (i10 & 65536) != 0 ? E : expression16, (i10 & 131072) != 0 ? F : expression17, (i10 & 262144) != 0 ? null : expression18, (i10 & 524288) != 0 ? G : hbVar);
        }
    }
}
