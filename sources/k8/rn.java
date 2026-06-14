package k8;

import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.ao;
import k8.ep;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class rn implements JSONSerializable, Hashable, f7 {
    public static final b U = new b(null);
    private static final Expression V;
    private static final Expression W;
    private static final Expression X;
    private static final ep.e Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f90753a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f90754b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f90755c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final ep.d f90756d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Function2 f90757e0;
    public final List A;
    private final hb B;
    private final Expression C;
    private final Expression D;
    private final List E;
    public final Expression F;
    private final List G;
    private final wv H;
    private final y7 I;
    private final r6 J;
    private final r6 K;
    private final List L;
    public final String M;
    private final List N;
    private final List O;
    private final Expression P;
    private final hx Q;
    private final List R;
    private final ep S;
    private Integer T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f90758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f90759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f90760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f90761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f90762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f90763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l7 f90764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Expression f90765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f90766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f90767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bd f90768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression f90769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Expression f90770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Expression f90771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression f90772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Expression f90773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Expression f90774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f90775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ep f90776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Expression f90777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression f90778u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f90779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final zh f90780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression f90781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Expression f90782y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final hb f90783z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90784f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rn invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return rn.U.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final rn a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ao.g) BuiltInParserKt.getBuiltInParserComponent().D6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f90785d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Function2 f90786e = a.f90790f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f90787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f90788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f90789c;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f90790f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f90785d.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((bo) BuiltInParserKt.getBuiltInParserComponent().G6().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(Expression expression, Expression expression2) {
            this.f90787a = expression;
            this.f90788b = expression2;
        }

        public final boolean a(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (cVar == null) {
                return false;
            }
            Expression expression = this.f90787a;
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            Expression expression2 = cVar.f90787a;
            return Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(this.f90788b.evaluate(expressionResolver), cVar.f90788b.evaluate(expressionResolver2));
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f90789c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode();
            Expression expression = this.f90787a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f90788b.hashCode();
            this.f90789c = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((bo) BuiltInParserKt.getBuiltInParserComponent().G6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        V = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        W = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        X = Expression.Companion.constant$default(companion, jp.SP, null, 2, null);
        Y = new ep.e(new nx(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f90753a0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f90754b0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f90755c0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f90756d0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f90757e0 = a.f90784f;
    }

    public rn(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, List list4, bd bdVar, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, List list5, ep epVar, Expression expression11, Expression expression12, String str, zh zhVar, Expression expression13, Expression expression14, hb hbVar, List list6, hb hbVar2, Expression expression15, Expression expression16, List list7, Expression expression17, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, String str2, List list10, List list11, Expression expression18, hx hxVar, List list12, ep epVar2) {
        this.f90758a = g1Var;
        this.f90759b = expression;
        this.f90760c = expression2;
        this.f90761d = expression3;
        this.f90762e = list;
        this.f90763f = list2;
        this.f90764g = l7Var;
        this.f90765h = expression4;
        this.f90766i = list3;
        this.f90767j = list4;
        this.f90768k = bdVar;
        this.f90769l = expression5;
        this.f90770m = expression6;
        this.f90771n = expression7;
        this.f90772o = expression8;
        this.f90773p = expression9;
        this.f90774q = expression10;
        this.f90775r = list5;
        this.f90776s = epVar;
        this.f90777t = expression11;
        this.f90778u = expression12;
        this.f90779v = str;
        this.f90780w = zhVar;
        this.f90781x = expression13;
        this.f90782y = expression14;
        this.f90783z = hbVar;
        this.A = list6;
        this.B = hbVar2;
        this.C = expression15;
        this.D = expression16;
        this.E = list7;
        this.F = expression17;
        this.G = list8;
        this.H = wvVar;
        this.I = y7Var;
        this.J = r6Var;
        this.K = r6Var2;
        this.L = list9;
        this.M = str2;
        this.N = list10;
        this.O = list11;
        this.P = expression18;
        this.Q = hxVar;
        this.R = list12;
        this.S = epVar2;
    }

    public static /* synthetic */ rn z(rn rnVar, g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, List list4, bd bdVar, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, List list5, ep epVar, Expression expression11, Expression expression12, String str, zh zhVar, Expression expression13, Expression expression14, hb hbVar, List list6, hb hbVar2, Expression expression15, Expression expression16, List list7, Expression expression17, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, String str2, List list10, List list11, Expression expression18, hx hxVar, List list12, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? rnVar.o() : g1Var;
        Expression expressionG = (i10 & 2) != 0 ? rnVar.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? rnVar.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? rnVar.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? rnVar.w() : list;
        List background = (i10 & 32) != 0 ? rnVar.getBackground() : list2;
        l7 l7VarX = (i10 & 64) != 0 ? rnVar.x() : l7Var;
        Expression expressionB = (i10 & 128) != 0 ? rnVar.b() : expression4;
        List listK = (i10 & 256) != 0 ? rnVar.k() : list3;
        List extensions = (i10 & 512) != 0 ? rnVar.getExtensions() : list4;
        bd bdVarN = (i10 & 1024) != 0 ? rnVar.n() : bdVar;
        Expression expression19 = (i10 & 2048) != 0 ? rnVar.f90769l : expression5;
        Expression expression20 = (i10 & 4096) != 0 ? rnVar.f90770m : expression6;
        g1 g1Var2 = g1VarO;
        Expression expression21 = (i10 & 8192) != 0 ? rnVar.f90771n : expression7;
        Expression expression22 = (i10 & 16384) != 0 ? rnVar.f90772o : expression8;
        Expression expression23 = (i10 & 32768) != 0 ? rnVar.f90773p : expression9;
        Expression expression24 = (i10 & 65536) != 0 ? rnVar.f90774q : expression10;
        List listU = (i10 & 131072) != 0 ? rnVar.u() : list5;
        ep height = (i10 & 262144) != 0 ? rnVar.getHeight() : epVar;
        Expression expression25 = expression24;
        Expression expression26 = (i10 & 524288) != 0 ? rnVar.f90777t : expression11;
        Expression expression27 = (i10 & 1048576) != 0 ? rnVar.f90778u : expression12;
        String id2 = (i10 & 2097152) != 0 ? rnVar.getId() : str;
        zh zhVarR = (i10 & 4194304) != 0 ? rnVar.r() : zhVar;
        Expression expression28 = expression27;
        Expression expression29 = (i10 & 8388608) != 0 ? rnVar.f90781x : expression13;
        Expression expression30 = (i10 & 16777216) != 0 ? rnVar.f90782y : expression14;
        hb hbVarD = (i10 & 33554432) != 0 ? rnVar.d() : hbVar;
        Expression expression31 = expression30;
        List list13 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? rnVar.A : list6;
        return rnVar.y(g1Var2, expressionG, expressionM, alpha, listW, background, l7VarX, expressionB, listK, extensions, bdVarN, expression19, expression20, expression21, expression22, expression23, expression25, listU, height, expression26, expression28, id2, zhVarR, expression29, expression31, hbVarD, list13, (i10 & 134217728) != 0 ? rnVar.p() : hbVar2, (i10 & 268435456) != 0 ? rnVar.f() : expression15, (i10 & 536870912) != 0 ? rnVar.e() : expression16, (i10 & 1073741824) != 0 ? rnVar.q() : list7, (i10 & Integer.MIN_VALUE) != 0 ? rnVar.F : expression17, (i11 & 1) != 0 ? rnVar.h() : list8, (i11 & 2) != 0 ? rnVar.getTransform() : wvVar, (i11 & 4) != 0 ? rnVar.j() : y7Var, (i11 & 8) != 0 ? rnVar.v() : r6Var, (i11 & 16) != 0 ? rnVar.i() : r6Var2, (i11 & 32) != 0 ? rnVar.l() : list9, (i11 & 64) != 0 ? rnVar.M : str2, (i11 & 128) != 0 ? rnVar.s() : list10, (i11 & 256) != 0 ? rnVar.c() : list11, (i11 & 512) != 0 ? rnVar.getVisibility() : expression18, (i11 & 1024) != 0 ? rnVar.t() : hxVar, (i11 & 2048) != 0 ? rnVar.a() : list12, (i11 & 4096) != 0 ? rnVar.getWidth() : epVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x03f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(k8.rn r9, com.yandex.div.json.expressions.ExpressionResolver r10, com.yandex.div.json.expressions.ExpressionResolver r11) {
        /*
            Method dump skipped, instruction units count: 1761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.rn.A(k8.rn, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    public /* synthetic */ int B() {
        return v7.b.a(this);
    }

    @Override // k8.f7
    public List a() {
        return this.R;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f90765h;
    }

    @Override // k8.f7
    public List c() {
        return this.O;
    }

    @Override // k8.f7
    public hb d() {
        return this.f90783z;
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
        return this.f90759b;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f90761d;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f90763f;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f90767j;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f90776s;
    }

    @Override // k8.f7
    public String getId() {
        return this.f90779v;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.H;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.P;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.S;
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
        Integer num = this.T;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(rn.class).hashCode();
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
        Expression expression = this.f90769l;
        int iHashCode5 = iHash13 + (expression != null ? expression.hashCode() : 0) + this.f90770m.hashCode() + this.f90771n.hashCode();
        Expression expression2 = this.f90772o;
        int iHashCode6 = iHashCode5 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.f90773p;
        int iHashCode7 = iHashCode6 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.f90774q;
        int iHashCode8 = iHashCode7 + (expression4 != null ? expression4.hashCode() : 0);
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
        int iHash14 = iHashCode8 + iHash5 + getHeight().hash() + this.f90777t.hashCode();
        Expression expression5 = this.f90778u;
        int iHashCode9 = iHash14 + (expression5 != null ? expression5.hashCode() : 0);
        String id2 = getId();
        int iHashCode10 = iHashCode9 + (id2 != null ? id2.hashCode() : 0);
        zh zhVarR = r();
        int iHash15 = iHashCode10 + (zhVarR != null ? zhVarR.hash() : 0) + this.f90781x.hashCode();
        Expression expression6 = this.f90782y;
        int iHashCode11 = iHash15 + (expression6 != null ? expression6.hashCode() : 0);
        hb hbVarD = d();
        int iHash16 = iHashCode11 + (hbVarD != null ? hbVarD.hash() : 0);
        Iterator it6 = this.A.iterator();
        int iHash17 = 0;
        while (it6.hasNext()) {
            iHash17 += ((c) it6.next()).hash();
        }
        int i14 = iHash16 + iHash17;
        hb hbVarP = p();
        int iHash18 = i14 + (hbVarP != null ? hbVarP.hash() : 0);
        Expression expressionF = f();
        int iHashCode12 = iHash18 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode13 = iHashCode12 + (expressionE != null ? expressionE.hashCode() : 0);
        List listQ = q();
        if (listQ != null) {
            Iterator it7 = listQ.iterator();
            iHash6 = 0;
            while (it7.hasNext()) {
                iHash6 += ((j1) it7.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int iHashCode14 = iHashCode13 + iHash6 + this.F.hashCode();
        List listH = h();
        if (listH != null) {
            Iterator it8 = listH.iterator();
            iHash7 = 0;
            while (it8.hasNext()) {
                iHash7 += ((dv) it8.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i15 = iHashCode14 + iHash7;
        wv transform = getTransform();
        int iHash19 = i15 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash20 = iHash19 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash21 = iHash20 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash22 = iHash21 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode15 = iHash22 + (listL != null ? listL.hashCode() : 0) + this.M.hashCode();
        List listS = s();
        if (listS != null) {
            Iterator it9 = listS.iterator();
            iHash8 = 0;
            while (it9.hasNext()) {
                iHash8 += ((bw) it9.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHashCode15 + iHash8;
        List listC = c();
        if (listC != null) {
            Iterator it10 = listC.iterator();
            iHash9 = 0;
            while (it10.hasNext()) {
                iHash9 += ((kw) it10.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int iHashCode16 = i16 + iHash9 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash23 = iHashCode16 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it11 = listA.iterator();
            while (it11.hasNext()) {
                iHash10 += ((hx) it11.next()).hash();
            }
        }
        int iHash24 = iHash23 + iHash10 + getWidth().hash();
        this.T = Integer.valueOf(iHash24);
        return iHash24;
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
        return this.f90766i;
    }

    @Override // k8.f7
    public List l() {
        return this.L;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f90760c;
    }

    @Override // k8.f7
    public bd n() {
        return this.f90768k;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f90758a;
    }

    @Override // k8.f7
    public hb p() {
        return this.B;
    }

    @Override // k8.f7
    public List q() {
        return this.E;
    }

    @Override // k8.f7
    public zh r() {
        return this.f90780w;
    }

    @Override // k8.f7
    public List s() {
        return this.N;
    }

    @Override // k8.f7
    public hx t() {
        return this.Q;
    }

    @Override // k8.f7
    public List u() {
        return this.f90775r;
    }

    @Override // k8.f7
    public r6 v() {
        return this.J;
    }

    @Override // k8.f7
    public List w() {
        return this.f90762e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ao.g) BuiltInParserKt.getBuiltInParserComponent().D6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f90764g;
    }

    public final rn y(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, List list4, bd bdVar, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, List list5, ep epVar, Expression expression11, Expression expression12, String str, zh zhVar, Expression expression13, Expression expression14, hb hbVar, List list6, hb hbVar2, Expression expression15, Expression expression16, List list7, Expression expression17, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, String str2, List list10, List list11, Expression expression18, hx hxVar, List list12, ep epVar2) {
        return new rn(g1Var, expression, expression2, expression3, list, list2, l7Var, expression4, list3, list4, bdVar, expression5, expression6, expression7, expression8, expression9, expression10, list5, epVar, expression11, expression12, str, zhVar, expression13, expression14, hbVar, list6, hbVar2, expression15, expression16, list7, expression17, list8, wvVar, y7Var, r6Var, r6Var2, list9, str2, list10, list11, expression18, hxVar, list12, epVar2);
    }
}
