package k8;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.ep;
import k8.vw;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class pw implements JSONSerializable, Hashable, f7 {
    public static final b W = new b(null);
    private static final Expression X;
    private static final Expression Y;
    private static final ep.e Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f90461a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f90462b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f90463c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Expression f90464d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Expression f90465e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final ep.d f90466f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Function2 f90467g0;
    public final Expression A;
    public final Expression B;
    public final Expression C;
    public final List D;
    private final Expression E;
    private final Expression F;
    public final Expression G;
    private final List H;
    private final List I;
    private final wv J;
    private final y7 K;
    private final r6 L;
    private final r6 M;
    private final List N;
    private final List O;
    private final List P;
    public final List Q;
    private final Expression R;
    private final hx S;
    private final List T;
    private final ep U;
    private Integer V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f90468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f90469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f90470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f90471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f90472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w6 f90473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression f90474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f90475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l7 f90476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f90477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Expression f90478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f90479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f90480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f90481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f90482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f90483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final bd f90484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f90485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ep f90486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f90487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final zh f90488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final hb f90489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Expression f90490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final hb f90491x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f90492y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final JSONObject f90493z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90494f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pw invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return pw.W.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pw a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((vw.f) BuiltInParserKt.getBuiltInParserComponent().n9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        X = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        Y = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Z = new ep.e(new nx(null, null, null, 7, null));
        f90461a0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f90462b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f90463c0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f90464d0 = Expression.Companion.constant$default(companion, ww.FIT, null, 2, null);
        f90465e0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f90466f0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f90467g0 = a.f90494f;
    }

    public pw(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, w6 w6Var, Expression expression4, List list2, l7 l7Var, List list3, Expression expression5, List list4, String str, List list5, List list6, List list7, bd bdVar, List list8, ep epVar, String str2, zh zhVar, hb hbVar, Expression expression6, hb hbVar2, List list9, JSONObject jSONObject, Expression expression7, Expression expression8, Expression expression9, List list10, Expression expression10, Expression expression11, Expression expression12, List list11, List list12, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list13, List list14, List list15, List list16, Expression expression13, hx hxVar, List list17, ep epVar2) {
        this.f90468a = g1Var;
        this.f90469b = expression;
        this.f90470c = expression2;
        this.f90471d = expression3;
        this.f90472e = list;
        this.f90473f = w6Var;
        this.f90474g = expression4;
        this.f90475h = list2;
        this.f90476i = l7Var;
        this.f90477j = list3;
        this.f90478k = expression5;
        this.f90479l = list4;
        this.f90480m = str;
        this.f90481n = list5;
        this.f90482o = list6;
        this.f90483p = list7;
        this.f90484q = bdVar;
        this.f90485r = list8;
        this.f90486s = epVar;
        this.f90487t = str2;
        this.f90488u = zhVar;
        this.f90489v = hbVar;
        this.f90490w = expression6;
        this.f90491x = hbVar2;
        this.f90492y = list9;
        this.f90493z = jSONObject;
        this.A = expression7;
        this.B = expression8;
        this.C = expression9;
        this.D = list10;
        this.E = expression10;
        this.F = expression11;
        this.G = expression12;
        this.H = list11;
        this.I = list12;
        this.J = wvVar;
        this.K = y7Var;
        this.L = r6Var;
        this.M = r6Var2;
        this.N = list13;
        this.O = list14;
        this.P = list15;
        this.Q = list16;
        this.R = expression13;
        this.S = hxVar;
        this.T = list17;
        this.U = epVar2;
    }

    public static /* synthetic */ pw z(pw pwVar, g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, w6 w6Var, Expression expression4, List list2, l7 l7Var, List list3, Expression expression5, List list4, String str, List list5, List list6, List list7, bd bdVar, List list8, ep epVar, String str2, zh zhVar, hb hbVar, Expression expression6, hb hbVar2, List list9, JSONObject jSONObject, Expression expression7, Expression expression8, Expression expression9, List list10, Expression expression10, Expression expression11, Expression expression12, List list11, List list12, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list13, List list14, List list15, List list16, Expression expression13, hx hxVar, List list17, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? pwVar.o() : g1Var;
        Expression expressionG = (i10 & 2) != 0 ? pwVar.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? pwVar.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? pwVar.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? pwVar.w() : list;
        w6 w6Var2 = (i10 & 32) != 0 ? pwVar.f90473f : w6Var;
        Expression expression14 = (i10 & 64) != 0 ? pwVar.f90474g : expression4;
        List background = (i10 & 128) != 0 ? pwVar.getBackground() : list2;
        l7 l7VarX = (i10 & 256) != 0 ? pwVar.x() : l7Var;
        List list18 = (i10 & 512) != 0 ? pwVar.f90477j : list3;
        Expression expressionB = (i10 & 1024) != 0 ? pwVar.b() : expression5;
        List listK = (i10 & 2048) != 0 ? pwVar.k() : list4;
        String str3 = (i10 & 4096) != 0 ? pwVar.f90480m : str;
        g1 g1Var2 = g1VarO;
        List list19 = (i10 & 8192) != 0 ? pwVar.f90481n : list5;
        List extensions = (i10 & 16384) != 0 ? pwVar.getExtensions() : list6;
        List list20 = (i10 & 32768) != 0 ? pwVar.f90483p : list7;
        bd bdVarN = (i10 & 65536) != 0 ? pwVar.n() : bdVar;
        List listU = (i10 & 131072) != 0 ? pwVar.u() : list8;
        ep height = (i10 & 262144) != 0 ? pwVar.getHeight() : epVar;
        String id2 = (i10 & 524288) != 0 ? pwVar.getId() : str2;
        zh zhVarR = (i10 & 1048576) != 0 ? pwVar.r() : zhVar;
        hb hbVarD = (i10 & 2097152) != 0 ? pwVar.d() : hbVar;
        List list21 = list20;
        Expression expression15 = (i10 & 4194304) != 0 ? pwVar.f90490w : expression6;
        hb hbVarP = (i10 & 8388608) != 0 ? pwVar.p() : hbVar2;
        Expression expression16 = expression15;
        List list22 = (i10 & 16777216) != 0 ? pwVar.f90492y : list9;
        JSONObject jSONObject2 = (i10 & 33554432) != 0 ? pwVar.f90493z : jSONObject;
        Expression expression17 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? pwVar.A : expression7;
        Expression expression18 = (i10 & 134217728) != 0 ? pwVar.B : expression8;
        Expression expression19 = (i10 & 268435456) != 0 ? pwVar.C : expression9;
        List list23 = (i10 & 536870912) != 0 ? pwVar.D : list10;
        return pwVar.y(g1Var2, expressionG, expressionM, alpha, listW, w6Var2, expression14, background, l7VarX, list18, expressionB, listK, str3, list19, extensions, list21, bdVarN, listU, height, id2, zhVarR, hbVarD, expression16, hbVarP, list22, jSONObject2, expression17, expression18, expression19, list23, (i10 & 1073741824) != 0 ? pwVar.f() : expression10, (i10 & Integer.MIN_VALUE) != 0 ? pwVar.e() : expression11, (i11 & 1) != 0 ? pwVar.G : expression12, (i11 & 2) != 0 ? pwVar.q() : list11, (i11 & 4) != 0 ? pwVar.h() : list12, (i11 & 8) != 0 ? pwVar.getTransform() : wvVar, (i11 & 16) != 0 ? pwVar.j() : y7Var, (i11 & 32) != 0 ? pwVar.v() : r6Var, (i11 & 64) != 0 ? pwVar.i() : r6Var2, (i11 & 128) != 0 ? pwVar.l() : list13, (i11 & 256) != 0 ? pwVar.s() : list14, (i11 & 512) != 0 ? pwVar.c() : list15, (i11 & 1024) != 0 ? pwVar.Q : list16, (i11 & 2048) != 0 ? pwVar.getVisibility() : expression13, (i11 & 4096) != 0 ? pwVar.t() : hxVar, (i11 & 8192) != 0 ? pwVar.a() : list17, (i11 & 16384) != 0 ? pwVar.getWidth() : epVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:540:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0766  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(k8.pw r9, com.yandex.div.json.expressions.ExpressionResolver r10, com.yandex.div.json.expressions.ExpressionResolver r11) {
        /*
            Method dump skipped, instruction units count: 1986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.pw.A(k8.pw, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    public /* synthetic */ int B() {
        return v7.b.a(this);
    }

    @Override // k8.f7
    public List a() {
        return this.T;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f90478k;
    }

    @Override // k8.f7
    public List c() {
        return this.P;
    }

    @Override // k8.f7
    public hb d() {
        return this.f90489v;
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
        return this.f90469b;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f90471d;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f90475h;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f90482o;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f90486s;
    }

    @Override // k8.f7
    public String getId() {
        return this.f90487t;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.J;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.R;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.U;
    }

    @Override // k8.f7
    public List h() {
        return this.I;
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
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(pw.class).hashCode();
        g1 g1VarO = o();
        int iHash15 = 0;
        int iHash16 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        Expression expressionG = g();
        int iHashCode2 = iHash16 + (expressionG != null ? expressionG.hashCode() : 0);
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
        w6 w6Var = this.f90473f;
        int iHash17 = i10 + (w6Var != null ? w6Var.hash() : 0) + this.f90474g.hashCode();
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
        int i11 = iHash17 + iHash2;
        l7 l7VarX = x();
        int iHash18 = i11 + (l7VarX != null ? l7VarX.hash() : 0);
        List list = this.f90477j;
        if (list != null) {
            Iterator it3 = list.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((j1) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHash18 + iHash3;
        Expression expressionB = b();
        int iHashCode4 = i12 + (expressionB != null ? expressionB.hashCode() : 0);
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
        String str = this.f90480m;
        int iHashCode5 = i13 + (str != null ? str.hashCode() : 0);
        List list2 = this.f90481n;
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((j1) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = iHashCode5 + iHash5;
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
        List list3 = this.f90483p;
        if (list3 != null) {
            Iterator it7 = list3.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((j1) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i16 = i15 + iHash7;
        bd bdVarN = n();
        int iHash19 = i16 + (bdVarN != null ? bdVarN.hash() : 0);
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
        int iHash20 = iHash19 + iHash8 + getHeight().hash();
        String id2 = getId();
        int iHashCode6 = iHash20 + (id2 != null ? id2.hashCode() : 0);
        zh zhVarR = r();
        int iHash21 = iHashCode6 + (zhVarR != null ? zhVarR.hash() : 0);
        hb hbVarD = d();
        int iHash22 = iHash21 + (hbVarD != null ? hbVarD.hash() : 0) + this.f90490w.hashCode();
        hb hbVarP = p();
        int iHash23 = iHash22 + (hbVarP != null ? hbVarP.hash() : 0);
        List list4 = this.f90492y;
        if (list4 != null) {
            Iterator it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((j1) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = iHash23 + iHash9;
        JSONObject jSONObject = this.f90493z;
        int iHashCode7 = i17 + (jSONObject != null ? jSONObject.hashCode() : 0) + this.A.hashCode();
        Expression expression = this.B;
        int iHashCode8 = iHashCode7 + (expression != null ? expression.hashCode() : 0) + this.C.hashCode();
        List list5 = this.D;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((j1) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHashCode8 + iHash10;
        Expression expressionF = f();
        int iHashCode9 = i18 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode10 = iHashCode9 + (expressionE != null ? expressionE.hashCode() : 0) + this.G.hashCode();
        List listQ = q();
        if (listQ != null) {
            Iterator it11 = listQ.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((j1) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHashCode10 + iHash11;
        List listH = h();
        if (listH != null) {
            Iterator it12 = listH.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((dv) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = i19 + iHash12;
        wv transform = getTransform();
        int iHash24 = i20 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash25 = iHash24 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash26 = iHash25 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash27 = iHash26 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode11 = iHash27 + (listL != null ? listL.hashCode() : 0);
        List listS = s();
        if (listS != null) {
            Iterator it13 = listS.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((bw) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = iHashCode11 + iHash13;
        List listC = c();
        if (listC != null) {
            Iterator it14 = listC.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((kw) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = i21 + iHash14;
        Iterator it15 = this.Q.iterator();
        int iHash28 = 0;
        while (it15.hasNext()) {
            iHash28 += ((xw) it15.next()).hash();
        }
        int iHashCode12 = i22 + iHash28 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash29 = iHashCode12 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it16 = listA.iterator();
            while (it16.hasNext()) {
                iHash15 += ((hx) it16.next()).hash();
            }
        }
        int iHash30 = iHash29 + iHash15 + getWidth().hash();
        this.V = Integer.valueOf(iHash30);
        return iHash30;
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
        return this.f90479l;
    }

    @Override // k8.f7
    public List l() {
        return this.N;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f90470c;
    }

    @Override // k8.f7
    public bd n() {
        return this.f90484q;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f90468a;
    }

    @Override // k8.f7
    public hb p() {
        return this.f90491x;
    }

    @Override // k8.f7
    public List q() {
        return this.H;
    }

    @Override // k8.f7
    public zh r() {
        return this.f90488u;
    }

    @Override // k8.f7
    public List s() {
        return this.O;
    }

    @Override // k8.f7
    public hx t() {
        return this.S;
    }

    @Override // k8.f7
    public List u() {
        return this.f90485r;
    }

    @Override // k8.f7
    public r6 v() {
        return this.L;
    }

    @Override // k8.f7
    public List w() {
        return this.f90472e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((vw.f) BuiltInParserKt.getBuiltInParserComponent().n9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f90476i;
    }

    public final pw y(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, w6 w6Var, Expression expression4, List list2, l7 l7Var, List list3, Expression expression5, List list4, String str, List list5, List list6, List list7, bd bdVar, List list8, ep epVar, String str2, zh zhVar, hb hbVar, Expression expression6, hb hbVar2, List list9, JSONObject jSONObject, Expression expression7, Expression expression8, Expression expression9, List list10, Expression expression10, Expression expression11, Expression expression12, List list11, List list12, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list13, List list14, List list15, List list16, Expression expression13, hx hxVar, List list17, ep epVar2) {
        return new pw(g1Var, expression, expression2, expression3, list, w6Var, expression4, list2, l7Var, list3, expression5, list4, str, list5, list6, list7, bdVar, list8, epVar, str2, zhVar, hbVar, expression6, hbVar2, list9, jSONObject, expression7, expression8, expression9, list10, expression10, expression11, expression12, list11, list12, wvVar, y7Var, r6Var, r6Var2, list13, list14, list15, list16, expression13, hxVar, list17, epVar2);
    }
}
