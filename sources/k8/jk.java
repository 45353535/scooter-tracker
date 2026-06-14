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
import k8.pk;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class jk implements JSONSerializable, Hashable, f7 {
    public static final b T = new b(null);
    private static final Expression U;
    private static final Expression V;
    private static final Expression W;
    private static final ep.e X;
    private static final Expression Y;
    private static final xc Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f88431a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f88432b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f88433c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Expression f88434d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final ep.d f88435e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Function2 f88436f0;
    public final Expression A;
    private final Expression B;
    private final Expression C;
    public final Expression D;
    private final List E;
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
    private final g1 f88437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f88438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f88439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f88440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f88441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f88442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l7 f88443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Expression f88444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression f88445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression f88446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f88447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f88448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final bd f88449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f88450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ep f88451o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f88452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Expression f88453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k8 f88454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xc f88455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f88456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final qk f88457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final zh f88458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final hb f88459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression f88460x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final hb f88461y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final qj f88462z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88463f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jk invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return jk.T.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jk a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((pk.h) BuiltInParserKt.getBuiltInParserComponent().z5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public enum c {
        START("start"),
        CENTER("center"),
        END("end");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1044c f88464c = new C1044c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f88465d = b.f88473f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f88466e = a.f88472f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f88471b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f88472f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String str) {
                return c.f88464c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f88473f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c cVar) {
                return c.f88464c.b(cVar);
            }
        }

        /* JADX INFO: renamed from: k8.jk$c$c, reason: collision with other inner class name */
        public static final class C1044c {
            public /* synthetic */ C1044c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar = c.START;
                if (Intrinsics.areEqual(str, cVar.f88471b)) {
                    return cVar;
                }
                c cVar2 = c.CENTER;
                if (Intrinsics.areEqual(str, cVar2.f88471b)) {
                    return cVar2;
                }
                c cVar3 = c.END;
                if (Intrinsics.areEqual(str, cVar3.f88471b)) {
                    return cVar3;
                }
                return null;
            }

            public final String b(c cVar) {
                return cVar.f88471b;
            }

            private C1044c() {
            }
        }

        c(String str) {
            this.f88471b = str;
        }
    }

    public enum d {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f88474c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f88475d = b.f88482f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f88476e = a.f88481f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f88480b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f88481f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String str) {
                return d.f88474c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f88482f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d dVar) {
                return d.f88474c.b(dVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String str) {
                d dVar = d.HORIZONTAL;
                if (Intrinsics.areEqual(str, dVar.f88480b)) {
                    return dVar;
                }
                d dVar2 = d.VERTICAL;
                if (Intrinsics.areEqual(str, dVar2.f88480b)) {
                    return dVar2;
                }
                return null;
            }

            public final String b(d dVar) {
                return dVar.f88480b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f88480b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        V = Expression.Companion.constant$default(companion, c.START, null, 2, null);
        W = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        X = new ep.e(new nx(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        Y = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Z = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, 0 == true ? 1 : 0);
        f88431a0 = Expression.Companion.constant$default(companion, d.HORIZONTAL, null, 2, null);
        f88432b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f88433c0 = Expression.Companion.constant$default(companion, c.CENTER, null, 2, null);
        f88434d0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f88435e0 = new ep.d(new ni(null, null, null, 7, null));
        f88436f0 = a.f88463f;
    }

    public jk(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression7, k8 k8Var, xc xcVar, List list6, qk qkVar, zh zhVar, hb hbVar, Expression expression8, hb hbVar2, qj qjVar, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression13, hx hxVar, List list12, ep epVar2) {
        this.f88437a = g1Var;
        this.f88438b = expression;
        this.f88439c = expression2;
        this.f88440d = expression3;
        this.f88441e = list;
        this.f88442f = list2;
        this.f88443g = l7Var;
        this.f88444h = expression4;
        this.f88445i = expression5;
        this.f88446j = expression6;
        this.f88447k = list3;
        this.f88448l = list4;
        this.f88449m = bdVar;
        this.f88450n = list5;
        this.f88451o = epVar;
        this.f88452p = str;
        this.f88453q = expression7;
        this.f88454r = k8Var;
        this.f88455s = xcVar;
        this.f88456t = list6;
        this.f88457u = qkVar;
        this.f88458v = zhVar;
        this.f88459w = hbVar;
        this.f88460x = expression8;
        this.f88461y = hbVar2;
        this.f88462z = qjVar;
        this.A = expression9;
        this.B = expression10;
        this.C = expression11;
        this.D = expression12;
        this.E = list7;
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

    public static /* synthetic */ jk z(jk jkVar, g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression7, k8 k8Var, xc xcVar, List list6, qk qkVar, zh zhVar, hb hbVar, Expression expression8, hb hbVar2, qj qjVar, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression13, hx hxVar, List list12, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? jkVar.o() : g1Var;
        Expression expressionG = (i10 & 2) != 0 ? jkVar.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? jkVar.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? jkVar.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? jkVar.w() : list;
        List background = (i10 & 32) != 0 ? jkVar.getBackground() : list2;
        l7 l7VarX = (i10 & 64) != 0 ? jkVar.x() : l7Var;
        Expression expressionB = (i10 & 128) != 0 ? jkVar.b() : expression4;
        Expression expression14 = (i10 & 256) != 0 ? jkVar.f88445i : expression5;
        Expression expression15 = (i10 & 512) != 0 ? jkVar.f88446j : expression6;
        List listK = (i10 & 1024) != 0 ? jkVar.k() : list3;
        List extensions = (i10 & 2048) != 0 ? jkVar.getExtensions() : list4;
        bd bdVarN = (i10 & 4096) != 0 ? jkVar.n() : bdVar;
        g1 g1Var2 = g1VarO;
        List listU = (i10 & 8192) != 0 ? jkVar.u() : list5;
        ep height = (i10 & 16384) != 0 ? jkVar.getHeight() : epVar;
        String id2 = (i10 & 32768) != 0 ? jkVar.getId() : str;
        Expression expression16 = (i10 & 65536) != 0 ? jkVar.f88453q : expression7;
        k8 k8Var2 = (i10 & 131072) != 0 ? jkVar.f88454r : k8Var;
        xc xcVar2 = (i10 & 262144) != 0 ? jkVar.f88455s : xcVar;
        List list13 = (i10 & 524288) != 0 ? jkVar.f88456t : list6;
        qk qkVar2 = (i10 & 1048576) != 0 ? jkVar.f88457u : qkVar;
        zh zhVarR = (i10 & 2097152) != 0 ? jkVar.r() : zhVar;
        hb hbVarD = (i10 & 4194304) != 0 ? jkVar.d() : hbVar;
        qk qkVar3 = qkVar2;
        Expression expression17 = (i10 & 8388608) != 0 ? jkVar.f88460x : expression8;
        return jkVar.y(g1Var2, expressionG, expressionM, alpha, listW, background, l7VarX, expressionB, expression14, expression15, listK, extensions, bdVarN, listU, height, id2, expression16, k8Var2, xcVar2, list13, qkVar3, zhVarR, hbVarD, expression17, (i10 & 16777216) != 0 ? jkVar.p() : hbVar2, (i10 & 33554432) != 0 ? jkVar.f88462z : qjVar, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? jkVar.A : expression9, (i10 & 134217728) != 0 ? jkVar.f() : expression10, (i10 & 268435456) != 0 ? jkVar.e() : expression11, (i10 & 536870912) != 0 ? jkVar.D : expression12, (i10 & 1073741824) != 0 ? jkVar.q() : list7, (i10 & Integer.MIN_VALUE) != 0 ? jkVar.h() : list8, (i11 & 1) != 0 ? jkVar.getTransform() : wvVar, (i11 & 2) != 0 ? jkVar.j() : y7Var, (i11 & 4) != 0 ? jkVar.v() : r6Var, (i11 & 8) != 0 ? jkVar.i() : r6Var2, (i11 & 16) != 0 ? jkVar.l() : list9, (i11 & 32) != 0 ? jkVar.s() : list10, (i11 & 64) != 0 ? jkVar.c() : list11, (i11 & 128) != 0 ? jkVar.getVisibility() : expression13, (i11 & 256) != 0 ? jkVar.t() : hxVar, (i11 & 512) != 0 ? jkVar.a() : list12, (i11 & 1024) != 0 ? jkVar.getWidth() : epVar2);
    }

    public final boolean A(jk jkVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (jkVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(jkVar.o(), expressionResolver, expressionResolver2) : jkVar.o() == null) {
            Expression expressionG = g();
            y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
            Expression expressionG2 = jkVar.g();
            if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                Expression expressionM = m();
                z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                Expression expressionM2 = jkVar.m();
                if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                    if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) jkVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                        List listW = w();
                        if (listW != null) {
                            List listW2 = jkVar.w();
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
                        if (jkVar.w() != null) {
                            z10 = false;
                            break;
                        }
                        z10 = true;
                        if (z10) {
                            List background = getBackground();
                            if (background != null) {
                                List background2 = jkVar.getBackground();
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
                            if (jkVar.getBackground() != null) {
                                z11 = false;
                                break;
                            }
                            z11 = true;
                            if (z11) {
                                l7 l7VarX = x();
                                if (l7VarX != null ? l7VarX.a(jkVar.x(), expressionResolver, expressionResolver2) : jkVar.x() == null) {
                                    Expression expressionB = b();
                                    Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                    Expression expressionB2 = jkVar.b();
                                    if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null) && this.f88445i.evaluate(expressionResolver) == jkVar.f88445i.evaluate(expressionResolver2) && ((Number) this.f88446j.evaluate(expressionResolver)).longValue() == ((Number) jkVar.f88446j.evaluate(expressionResolver2)).longValue()) {
                                        List listK = k();
                                        if (listK != null) {
                                            List listK2 = jkVar.k();
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
                                        if (jkVar.k() != null) {
                                            z12 = false;
                                            break;
                                        }
                                        z12 = true;
                                        if (z12) {
                                            List extensions = getExtensions();
                                            if (extensions != null) {
                                                List extensions2 = jkVar.getExtensions();
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
                                            if (jkVar.getExtensions() != null) {
                                                z13 = false;
                                                break;
                                            }
                                            z13 = true;
                                            if (z13) {
                                                bd bdVarN = n();
                                                if (bdVarN != null ? bdVarN.a(jkVar.n(), expressionResolver, expressionResolver2) : jkVar.n() == null) {
                                                    List listU = u();
                                                    if (listU != null) {
                                                        List listU2 = jkVar.u();
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
                                                    if (jkVar.u() != null) {
                                                        z14 = false;
                                                        break;
                                                    }
                                                    z14 = true;
                                                    if (z14 && getHeight().a(jkVar.getHeight(), expressionResolver, expressionResolver2) && Intrinsics.areEqual(getId(), jkVar.getId()) && ((Boolean) this.f88453q.evaluate(expressionResolver)).booleanValue() == ((Boolean) jkVar.f88453q.evaluate(expressionResolver2)).booleanValue()) {
                                                        k8 k8Var = this.f88454r;
                                                        if ((k8Var != null ? k8Var.a(jkVar.f88454r, expressionResolver, expressionResolver2) : jkVar.f88454r == null) && this.f88455s.a(jkVar.f88455s, expressionResolver, expressionResolver2)) {
                                                            List list = this.f88456t;
                                                            if (list != null) {
                                                                List list2 = jkVar.f88456t;
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
                                                            if (jkVar.f88456t != null) {
                                                                z15 = false;
                                                                break;
                                                            }
                                                            z15 = true;
                                                            if (z15 && this.f88457u.a(jkVar.f88457u, expressionResolver, expressionResolver2)) {
                                                                zh zhVarR = r();
                                                                if (zhVarR != null ? zhVarR.a(jkVar.r(), expressionResolver, expressionResolver2) : jkVar.r() == null) {
                                                                    hb hbVarD = d();
                                                                    if ((hbVarD != null ? hbVarD.a(jkVar.d(), expressionResolver, expressionResolver2) : jkVar.d() == null) && this.f88460x.evaluate(expressionResolver) == jkVar.f88460x.evaluate(expressionResolver2)) {
                                                                        hb hbVarP = p();
                                                                        if (hbVarP != null ? hbVarP.a(jkVar.p(), expressionResolver, expressionResolver2) : jkVar.p() == null) {
                                                                            qj qjVar = this.f88462z;
                                                                            if ((qjVar != null ? qjVar.a(jkVar.f88462z, expressionResolver, expressionResolver2) : jkVar.f88462z == null) && ((Boolean) this.A.evaluate(expressionResolver)).booleanValue() == ((Boolean) jkVar.A.evaluate(expressionResolver2)).booleanValue()) {
                                                                                Expression expressionF = f();
                                                                                String str = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                                Expression expressionF2 = jkVar.f();
                                                                                if (Intrinsics.areEqual(str, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                                    Expression expressionE = e();
                                                                                    Long l11 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                                    Expression expressionE2 = jkVar.e();
                                                                                    if (Intrinsics.areEqual(l11, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null) && this.D.evaluate(expressionResolver) == jkVar.D.evaluate(expressionResolver2)) {
                                                                                        List listQ = q();
                                                                                        if (listQ != null) {
                                                                                            List listQ2 = jkVar.q();
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
                                                                                        if (jkVar.q() != null) {
                                                                                            z16 = false;
                                                                                            break;
                                                                                        }
                                                                                        z16 = true;
                                                                                        if (z16) {
                                                                                            List listH = h();
                                                                                            if (listH != null) {
                                                                                                List listH2 = jkVar.h();
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
                                                                                            if (jkVar.h() != null) {
                                                                                                z17 = false;
                                                                                                break;
                                                                                            }
                                                                                            z17 = true;
                                                                                            if (z17) {
                                                                                                wv transform = getTransform();
                                                                                                if (transform != null ? transform.a(jkVar.getTransform(), expressionResolver, expressionResolver2) : jkVar.getTransform() == null) {
                                                                                                    y7 y7VarJ = j();
                                                                                                    if (y7VarJ != null ? y7VarJ.a(jkVar.j(), expressionResolver, expressionResolver2) : jkVar.j() == null) {
                                                                                                        r6 r6VarV = v();
                                                                                                        if (r6VarV != null ? r6VarV.a(jkVar.v(), expressionResolver, expressionResolver2) : jkVar.v() == null) {
                                                                                                            r6 r6VarI = i();
                                                                                                            if (r6VarI != null ? r6VarI.a(jkVar.i(), expressionResolver, expressionResolver2) : jkVar.i() == null) {
                                                                                                                List listL = l();
                                                                                                                if (listL != null) {
                                                                                                                    List listL2 = jkVar.l();
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
                                                                                                                if (jkVar.l() != null) {
                                                                                                                    z18 = false;
                                                                                                                    break;
                                                                                                                }
                                                                                                                z18 = true;
                                                                                                                if (z18) {
                                                                                                                    List listS = s();
                                                                                                                    if (listS != null) {
                                                                                                                        List listS2 = jkVar.s();
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
                                                                                                                    if (jkVar.s() != null) {
                                                                                                                        z19 = false;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    z19 = true;
                                                                                                                    if (z19) {
                                                                                                                        List listC = c();
                                                                                                                        if (listC != null) {
                                                                                                                            List listC2 = jkVar.c();
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
                                                                                                                        if (jkVar.c() != null) {
                                                                                                                            z20 = false;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        z20 = true;
                                                                                                                        if (z20 && getVisibility().evaluate(expressionResolver) == jkVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                            hx hxVarT = t();
                                                                                                                            if (hxVarT != null ? hxVarT.g(jkVar.t(), expressionResolver, expressionResolver2) : jkVar.t() == null) {
                                                                                                                                List listA = a();
                                                                                                                                if (listA != null) {
                                                                                                                                    List listA2 = jkVar.a();
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
                                                                                                                                if (jkVar.a() != null) {
                                                                                                                                    z21 = false;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                z21 = true;
                                                                                                                                if (z21 && getWidth().a(jkVar.getWidth(), expressionResolver, expressionResolver2)) {
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
        Integer num = this.R;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(jk.class).hashCode();
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
        int iHashCode4 = iHash12 + (expressionB != null ? expressionB.hashCode() : 0) + this.f88445i.hashCode() + this.f88446j.hashCode();
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
        int iHashCode5 = iHash14 + (id2 != null ? id2.hashCode() : 0) + this.f88453q.hashCode();
        k8 k8Var = this.f88454r;
        int iHash15 = iHashCode5 + (k8Var != null ? k8Var.hash() : 0) + this.f88455s.hash() + this.f88457u.hash();
        zh zhVarR = r();
        int iHash16 = iHash15 + (zhVarR != null ? zhVarR.hash() : 0);
        hb hbVarD = d();
        int iHash17 = iHash16 + (hbVarD != null ? hbVarD.hash() : 0) + this.f88460x.hashCode();
        hb hbVarP = p();
        int iHash18 = iHash17 + (hbVarP != null ? hbVarP.hash() : 0);
        qj qjVar = this.f88462z;
        int iHash19 = iHash18 + (qjVar != null ? qjVar.hash() : 0) + this.A.hashCode();
        Expression expressionF = f();
        int iHashCode6 = iHash19 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode7 = iHashCode6 + (expressionE != null ? expressionE.hashCode() : 0) + this.D.hashCode();
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
        int i14 = iHashCode7 + iHash6;
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
        int iHash20 = i15 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash21 = iHash20 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash22 = iHash21 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash23 = iHash22 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode8 = iHash23 + (listL != null ? listL.hashCode() : 0);
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
        int i16 = iHashCode8 + iHash8;
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
        int iHashCode9 = i16 + iHash9 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash24 = iHashCode9 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it10 = listA.iterator();
            while (it10.hasNext()) {
                iHash10 += ((hx) it10.next()).hash();
            }
        }
        int iHash25 = iHash24 + iHash10 + getWidth().hash();
        this.R = Integer.valueOf(iHash25);
        return iHash25;
    }

    @Override // k8.f7
    public List a() {
        return this.P;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f88444h;
    }

    @Override // k8.f7
    public List c() {
        return this.M;
    }

    @Override // k8.f7
    public hb d() {
        return this.f88459w;
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
        return this.f88438b;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f88440d;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f88442f;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f88448l;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f88451o;
    }

    @Override // k8.f7
    public String getId() {
        return this.f88452p;
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
        List list = this.f88456t;
        int iHash = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iHash += ((y0) it.next()).hash();
            }
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
        return this.f88447k;
    }

    @Override // k8.f7
    public List l() {
        return this.K;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f88439c;
    }

    @Override // k8.f7
    public bd n() {
        return this.f88449m;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f88437a;
    }

    @Override // k8.f7
    public hb p() {
        return this.f88461y;
    }

    @Override // k8.f7
    public List q() {
        return this.E;
    }

    @Override // k8.f7
    public zh r() {
        return this.f88458v;
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
        return this.f88450n;
    }

    @Override // k8.f7
    public r6 v() {
        return this.I;
    }

    @Override // k8.f7
    public List w() {
        return this.f88441e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((pk.h) BuiltInParserKt.getBuiltInParserComponent().z5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f88443g;
    }

    public final jk y(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, Expression expression5, Expression expression6, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression7, k8 k8Var, xc xcVar, List list6, qk qkVar, zh zhVar, hb hbVar, Expression expression8, hb hbVar2, qj qjVar, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, List list8, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression13, hx hxVar, List list12, ep epVar2) {
        return new jk(g1Var, expression, expression2, expression3, list, list2, l7Var, expression4, expression5, expression6, list3, list4, bdVar, list5, epVar, str, expression7, k8Var, xcVar, list6, qkVar, zhVar, hbVar, expression8, hbVar2, qjVar, expression9, expression10, expression11, expression12, list7, list8, wvVar, y7Var, r6Var, r6Var2, list9, list10, list11, expression13, hxVar, list12, epVar2);
    }
}
