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
import k8.ep;
import k8.fq;
import k8.yp;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class tp implements JSONSerializable, Hashable, f7 {
    public static final b W = new b(null);
    private static final Expression X;
    private static final ep.e Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f91414a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f91415b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f91416c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final ep.d f91417d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Function2 f91418e0;
    public final d A;
    public final String B;
    public final cb C;
    public final d D;
    public final String E;
    public final cb F;
    public final cb G;
    private final List H;
    public final cb I;
    public final cb J;
    private final wv K;
    private final y7 L;
    private final r6 M;
    private final r6 N;
    private final List O;
    private final List P;
    private final List Q;
    private final Expression R;
    private final hx S;
    private final List T;
    private final ep U;
    private Integer V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f91419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f91420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f91421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f91422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f91423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f91424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l7 f91425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Expression f91426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f91427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f91428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bd f91429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f91430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ep f91431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f91432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Expression f91433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final zh f91434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final hb f91435q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Expression f91436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Expression f91437s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final hb f91438t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f91439u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Expression f91440v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Expression f91441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g1 f91442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f91443y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final cb f91444z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91445f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tp invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return tp.W.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final tp a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((yp.e) BuiltInParserKt.getBuiltInParserComponent().h7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f91446g = new b(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Function2 f91447h = a.f91454f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f91448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hb f91449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression f91450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final cb f91451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final cb f91452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f91453f;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91454f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f91446g.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((zp) BuiltInParserKt.getBuiltInParserComponent().k7().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(Expression expression, hb hbVar, Expression expression2, cb cbVar, cb cbVar2) {
            this.f91448a = expression;
            this.f91449b = hbVar;
            this.f91450c = expression2;
            this.f91451d = cbVar;
            this.f91452e = cbVar2;
        }

        public final boolean a(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (cVar == null) {
                return false;
            }
            Expression expression = this.f91448a;
            Long l10 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
            Expression expression2 = cVar.f91448a;
            if (Intrinsics.areEqual(l10, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
                hb hbVar = this.f91449b;
                if (hbVar != null ? hbVar.a(cVar.f91449b, expressionResolver, expressionResolver2) : cVar.f91449b == null) {
                    Expression expression3 = this.f91450c;
                    Long l11 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
                    Expression expression4 = cVar.f91450c;
                    if (Intrinsics.areEqual(l11, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null)) {
                        cb cbVar = this.f91451d;
                        if (cbVar != null ? cbVar.a(cVar.f91451d, expressionResolver, expressionResolver2) : cVar.f91451d == null) {
                            cb cbVar2 = this.f91452e;
                            cb cbVar3 = cVar.f91452e;
                            if (cbVar2 != null ? cbVar2.a(cbVar3, expressionResolver, expressionResolver2) : cbVar3 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f91453f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode();
            Expression expression = this.f91448a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            hb hbVar = this.f91449b;
            int iHash = iHashCode2 + (hbVar != null ? hbVar.hash() : 0);
            Expression expression2 = this.f91450c;
            int iHashCode3 = iHash + (expression2 != null ? expression2.hashCode() : 0);
            cb cbVar = this.f91451d;
            int iHash2 = iHashCode3 + (cbVar != null ? cbVar.hash() : 0);
            cb cbVar2 = this.f91452e;
            int iHash3 = iHash2 + (cbVar2 != null ? cbVar2.hash() : 0);
            this.f91453f = Integer.valueOf(iHash3);
            return iHash3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((zp) BuiltInParserKt.getBuiltInParserComponent().k7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public static final class d implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f91455k = new b(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Expression f91456l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Expression f91457m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Expression f91458n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final Expression f91459o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final Function2 f91460p;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f91461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f91462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression f91463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression f91464d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Expression f91465e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Expression f91466f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Expression f91467g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final zl f91468h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Expression f91469i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Integer f91470j;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91471f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return d.f91455k.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((fq.d) BuiltInParserKt.getBuiltInParserComponent().n7().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            f91456l = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            f91457m = Expression.Companion.constant$default(companion, jp.SP, null, 2, null);
            f91458n = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f91459o = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
            f91460p = a.f91471f;
        }

        public d(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, zl zlVar, Expression expression8) {
            this.f91461a = expression;
            this.f91462b = expression2;
            this.f91463c = expression3;
            this.f91464d = expression4;
            this.f91465e = expression5;
            this.f91466f = expression6;
            this.f91467g = expression7;
            this.f91468h = zlVar;
            this.f91469i = expression8;
        }

        public final boolean a(d dVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (dVar == null) {
                return false;
            }
            Expression expression = this.f91461a;
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            Expression expression2 = dVar.f91461a;
            if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && ((Number) this.f91462b.evaluate(expressionResolver)).longValue() == ((Number) dVar.f91462b.evaluate(expressionResolver2)).longValue() && this.f91463c.evaluate(expressionResolver) == dVar.f91463c.evaluate(expressionResolver2)) {
                Expression expression3 = this.f91464d;
                JSONObject jSONObject = expression3 != null ? (JSONObject) expression3.evaluate(expressionResolver) : null;
                Expression expression4 = dVar.f91464d;
                if (Intrinsics.areEqual(jSONObject, expression4 != null ? (JSONObject) expression4.evaluate(expressionResolver2) : null)) {
                    Expression expression5 = this.f91465e;
                    jd jdVar = expression5 != null ? (jd) expression5.evaluate(expressionResolver) : null;
                    Expression expression6 = dVar.f91465e;
                    if (jdVar == (expression6 != null ? (jd) expression6.evaluate(expressionResolver2) : null)) {
                        Expression expression7 = this.f91466f;
                        Long l10 = expression7 != null ? (Long) expression7.evaluate(expressionResolver) : null;
                        Expression expression8 = dVar.f91466f;
                        if (Intrinsics.areEqual(l10, expression8 != null ? (Long) expression8.evaluate(expressionResolver2) : null) && ((Number) this.f91467g.evaluate(expressionResolver)).doubleValue() == ((Number) dVar.f91467g.evaluate(expressionResolver2)).doubleValue()) {
                            zl zlVar = this.f91468h;
                            if ((zlVar != null ? zlVar.a(dVar.f91468h, expressionResolver, expressionResolver2) : dVar.f91468h == null) && ((Number) this.f91469i.evaluate(expressionResolver)).intValue() == ((Number) dVar.f91469i.evaluate(expressionResolver2)).intValue()) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f91470j;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(d.class).hashCode();
            Expression expression = this.f91461a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f91462b.hashCode() + this.f91463c.hashCode();
            Expression expression2 = this.f91464d;
            int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression expression3 = this.f91465e;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression expression4 = this.f91466f;
            int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0) + this.f91467g.hashCode();
            zl zlVar = this.f91468h;
            int iHash = iHashCode5 + (zlVar != null ? zlVar.hash() : 0) + this.f91469i.hashCode();
            this.f91470j = Integer.valueOf(iHash);
            return iHash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((fq.d) BuiltInParserKt.getBuiltInParserComponent().n7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        X = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Y = new ep.e(new nx(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f91414a0 = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        f91415b0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f91416c0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f91417d0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f91418e0 = a.f91445f;
    }

    public tp(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression5, zh zhVar, hb hbVar, Expression expression6, Expression expression7, hb hbVar2, List list6, Expression expression8, Expression expression9, g1 g1Var2, List list7, cb cbVar, d dVar, String str2, cb cbVar2, d dVar2, String str3, cb cbVar3, cb cbVar4, List list8, cb cbVar5, cb cbVar6, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression10, hx hxVar, List list12, ep epVar2) {
        this.f91419a = g1Var;
        this.f91420b = expression;
        this.f91421c = expression2;
        this.f91422d = expression3;
        this.f91423e = list;
        this.f91424f = list2;
        this.f91425g = l7Var;
        this.f91426h = expression4;
        this.f91427i = list3;
        this.f91428j = list4;
        this.f91429k = bdVar;
        this.f91430l = list5;
        this.f91431m = epVar;
        this.f91432n = str;
        this.f91433o = expression5;
        this.f91434p = zhVar;
        this.f91435q = hbVar;
        this.f91436r = expression6;
        this.f91437s = expression7;
        this.f91438t = hbVar2;
        this.f91439u = list6;
        this.f91440v = expression8;
        this.f91441w = expression9;
        this.f91442x = g1Var2;
        this.f91443y = list7;
        this.f91444z = cbVar;
        this.A = dVar;
        this.B = str2;
        this.C = cbVar2;
        this.D = dVar2;
        this.E = str3;
        this.F = cbVar3;
        this.G = cbVar4;
        this.H = list8;
        this.I = cbVar5;
        this.J = cbVar6;
        this.K = wvVar;
        this.L = y7Var;
        this.M = r6Var;
        this.N = r6Var2;
        this.O = list9;
        this.P = list10;
        this.Q = list11;
        this.R = expression10;
        this.S = hxVar;
        this.T = list12;
        this.U = epVar2;
    }

    public static /* synthetic */ tp z(tp tpVar, g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression5, zh zhVar, hb hbVar, Expression expression6, Expression expression7, hb hbVar2, List list6, Expression expression8, Expression expression9, g1 g1Var2, List list7, cb cbVar, d dVar, String str2, cb cbVar2, d dVar2, String str3, cb cbVar3, cb cbVar4, List list8, cb cbVar5, cb cbVar6, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression10, hx hxVar, List list12, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? tpVar.o() : g1Var;
        Expression expressionG = (i10 & 2) != 0 ? tpVar.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? tpVar.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? tpVar.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? tpVar.w() : list;
        List background = (i10 & 32) != 0 ? tpVar.getBackground() : list2;
        l7 l7VarX = (i10 & 64) != 0 ? tpVar.x() : l7Var;
        Expression expressionB = (i10 & 128) != 0 ? tpVar.b() : expression4;
        List listK = (i10 & 256) != 0 ? tpVar.k() : list3;
        List extensions = (i10 & 512) != 0 ? tpVar.getExtensions() : list4;
        bd bdVarN = (i10 & 1024) != 0 ? tpVar.n() : bdVar;
        List listU = (i10 & 2048) != 0 ? tpVar.u() : list5;
        ep height = (i10 & 4096) != 0 ? tpVar.getHeight() : epVar;
        g1 g1Var3 = g1VarO;
        String id2 = (i10 & 8192) != 0 ? tpVar.getId() : str;
        Expression expression11 = (i10 & 16384) != 0 ? tpVar.f91433o : expression5;
        zh zhVarR = (i10 & 32768) != 0 ? tpVar.r() : zhVar;
        hb hbVarD = (i10 & 65536) != 0 ? tpVar.d() : hbVar;
        Expression expression12 = (i10 & 131072) != 0 ? tpVar.f91436r : expression6;
        Expression expression13 = (i10 & 262144) != 0 ? tpVar.f91437s : expression7;
        hb hbVarP = (i10 & 524288) != 0 ? tpVar.p() : hbVar2;
        Expression expression14 = expression13;
        List list13 = (i10 & 1048576) != 0 ? tpVar.f91439u : list6;
        Expression expressionF = (i10 & 2097152) != 0 ? tpVar.f() : expression8;
        Expression expressionE = (i10 & 4194304) != 0 ? tpVar.e() : expression9;
        List list14 = list13;
        g1 g1Var4 = (i10 & 8388608) != 0 ? tpVar.f91442x : g1Var2;
        return tpVar.y(g1Var3, expressionG, expressionM, alpha, listW, background, l7VarX, expressionB, listK, extensions, bdVarN, listU, height, id2, expression11, zhVarR, hbVarD, expression12, expression14, hbVarP, list14, expressionF, expressionE, g1Var4, (i10 & 16777216) != 0 ? tpVar.q() : list7, (i10 & 33554432) != 0 ? tpVar.f91444z : cbVar, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? tpVar.A : dVar, (i10 & 134217728) != 0 ? tpVar.B : str2, (i10 & 268435456) != 0 ? tpVar.C : cbVar2, (i10 & 536870912) != 0 ? tpVar.D : dVar2, (i10 & 1073741824) != 0 ? tpVar.E : str3, (i10 & Integer.MIN_VALUE) != 0 ? tpVar.F : cbVar3, (i11 & 1) != 0 ? tpVar.G : cbVar4, (i11 & 2) != 0 ? tpVar.h() : list8, (i11 & 4) != 0 ? tpVar.I : cbVar5, (i11 & 8) != 0 ? tpVar.J : cbVar6, (i11 & 16) != 0 ? tpVar.getTransform() : wvVar, (i11 & 32) != 0 ? tpVar.j() : y7Var, (i11 & 64) != 0 ? tpVar.v() : r6Var, (i11 & 128) != 0 ? tpVar.i() : r6Var2, (i11 & 256) != 0 ? tpVar.l() : list9, (i11 & 512) != 0 ? tpVar.s() : list10, (i11 & 1024) != 0 ? tpVar.c() : list11, (i11 & 2048) != 0 ? tpVar.getVisibility() : expression10, (i11 & 4096) != 0 ? tpVar.t() : hxVar, (i11 & 8192) != 0 ? tpVar.a() : list12, (i11 & 16384) != 0 ? tpVar.getWidth() : epVar2);
    }

    public final boolean A(tp tpVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (tpVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(tpVar.o(), expressionResolver, expressionResolver2) : tpVar.o() == null) {
            Expression expressionG = g();
            y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
            Expression expressionG2 = tpVar.g();
            if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                Expression expressionM = m();
                z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                Expression expressionM2 = tpVar.m();
                if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                    if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) tpVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                        List listW = w();
                        if (listW != null) {
                            List listW2 = tpVar.w();
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
                        if (tpVar.w() != null) {
                            z10 = false;
                            break;
                        }
                        z10 = true;
                        if (z10) {
                            List background = getBackground();
                            if (background != null) {
                                List background2 = tpVar.getBackground();
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
                            if (tpVar.getBackground() != null) {
                                z11 = false;
                                break;
                            }
                            z11 = true;
                            if (z11) {
                                l7 l7VarX = x();
                                if (l7VarX != null ? l7VarX.a(tpVar.x(), expressionResolver, expressionResolver2) : tpVar.x() == null) {
                                    Expression expressionB = b();
                                    Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                    Expression expressionB2 = tpVar.b();
                                    if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null)) {
                                        List listK = k();
                                        if (listK != null) {
                                            List listK2 = tpVar.k();
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
                                        if (tpVar.k() != null) {
                                            z12 = false;
                                            break;
                                        }
                                        z12 = true;
                                        if (z12) {
                                            List extensions = getExtensions();
                                            if (extensions != null) {
                                                List extensions2 = tpVar.getExtensions();
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
                                            if (tpVar.getExtensions() != null) {
                                                z13 = false;
                                                break;
                                            }
                                            z13 = true;
                                            if (z13) {
                                                bd bdVarN = n();
                                                if (bdVarN != null ? bdVarN.a(tpVar.n(), expressionResolver, expressionResolver2) : tpVar.n() == null) {
                                                    List listU = u();
                                                    if (listU != null) {
                                                        List listU2 = tpVar.u();
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
                                                    if (tpVar.u() != null) {
                                                        z14 = false;
                                                        break;
                                                    }
                                                    z14 = true;
                                                    if (z14 && getHeight().a(tpVar.getHeight(), expressionResolver, expressionResolver2) && Intrinsics.areEqual(getId(), tpVar.getId()) && ((Boolean) this.f91433o.evaluate(expressionResolver)).booleanValue() == ((Boolean) tpVar.f91433o.evaluate(expressionResolver2)).booleanValue()) {
                                                        zh zhVarR = r();
                                                        if (zhVarR != null ? zhVarR.a(tpVar.r(), expressionResolver, expressionResolver2) : tpVar.r() == null) {
                                                            hb hbVarD = d();
                                                            if ((hbVarD != null ? hbVarD.a(tpVar.d(), expressionResolver, expressionResolver2) : tpVar.d() == null) && ((Number) this.f91436r.evaluate(expressionResolver)).longValue() == ((Number) tpVar.f91436r.evaluate(expressionResolver2)).longValue() && ((Number) this.f91437s.evaluate(expressionResolver)).longValue() == ((Number) tpVar.f91437s.evaluate(expressionResolver2)).longValue()) {
                                                                hb hbVarP = p();
                                                                if (hbVarP != null ? hbVarP.a(tpVar.p(), expressionResolver, expressionResolver2) : tpVar.p() == null) {
                                                                    List list = this.f91439u;
                                                                    if (list != null) {
                                                                        List list2 = tpVar.f91439u;
                                                                        if (list2 != null) {
                                                                            if (list.size() == list2.size()) {
                                                                                int i20 = 0;
                                                                                for (Object obj6 : list) {
                                                                                    int i21 = i20 + 1;
                                                                                    if (i20 < 0) {
                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                    }
                                                                                    if (((c) obj6).a((c) list2.get(i20), expressionResolver, expressionResolver2)) {
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
                                                                    if (tpVar.f91439u != null) {
                                                                        z15 = false;
                                                                        break;
                                                                    }
                                                                    z15 = true;
                                                                    if (z15) {
                                                                        Expression expressionF = f();
                                                                        String str = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                        Expression expressionF2 = tpVar.f();
                                                                        if (Intrinsics.areEqual(str, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                            Expression expressionE = e();
                                                                            Long l11 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                            Expression expressionE2 = tpVar.e();
                                                                            if (Intrinsics.areEqual(l11, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null)) {
                                                                                g1 g1Var = this.f91442x;
                                                                                if (g1Var != null ? g1Var.a(tpVar.f91442x, expressionResolver, expressionResolver2) : tpVar.f91442x == null) {
                                                                                    List listQ = q();
                                                                                    if (listQ != null) {
                                                                                        List listQ2 = tpVar.q();
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
                                                                                    if (tpVar.q() != null) {
                                                                                        z16 = false;
                                                                                        break;
                                                                                    }
                                                                                    z16 = true;
                                                                                    if (z16) {
                                                                                        cb cbVar = this.f91444z;
                                                                                        if (cbVar != null ? cbVar.a(tpVar.f91444z, expressionResolver, expressionResolver2) : tpVar.f91444z == null) {
                                                                                            d dVar = this.A;
                                                                                            if ((dVar != null ? dVar.a(tpVar.A, expressionResolver, expressionResolver2) : tpVar.A == null) && Intrinsics.areEqual(this.B, tpVar.B) && this.C.a(tpVar.C, expressionResolver, expressionResolver2)) {
                                                                                                d dVar2 = this.D;
                                                                                                if ((dVar2 != null ? dVar2.a(tpVar.D, expressionResolver, expressionResolver2) : tpVar.D == null) && Intrinsics.areEqual(this.E, tpVar.E)) {
                                                                                                    cb cbVar2 = this.F;
                                                                                                    if (cbVar2 != null ? cbVar2.a(tpVar.F, expressionResolver, expressionResolver2) : tpVar.F == null) {
                                                                                                        cb cbVar3 = this.G;
                                                                                                        if (cbVar3 != null ? cbVar3.a(tpVar.G, expressionResolver, expressionResolver2) : tpVar.G == null) {
                                                                                                            List listH = h();
                                                                                                            if (listH != null) {
                                                                                                                List listH2 = tpVar.h();
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
                                                                                                            if (tpVar.h() != null) {
                                                                                                                z17 = false;
                                                                                                                break;
                                                                                                            }
                                                                                                            z17 = true;
                                                                                                            if (z17 && this.I.a(tpVar.I, expressionResolver, expressionResolver2) && this.J.a(tpVar.J, expressionResolver, expressionResolver2)) {
                                                                                                                wv transform = getTransform();
                                                                                                                if (transform != null ? transform.a(tpVar.getTransform(), expressionResolver, expressionResolver2) : tpVar.getTransform() == null) {
                                                                                                                    y7 y7VarJ = j();
                                                                                                                    if (y7VarJ != null ? y7VarJ.a(tpVar.j(), expressionResolver, expressionResolver2) : tpVar.j() == null) {
                                                                                                                        r6 r6VarV = v();
                                                                                                                        if (r6VarV != null ? r6VarV.a(tpVar.v(), expressionResolver, expressionResolver2) : tpVar.v() == null) {
                                                                                                                            r6 r6VarI = i();
                                                                                                                            if (r6VarI != null ? r6VarI.a(tpVar.i(), expressionResolver, expressionResolver2) : tpVar.i() == null) {
                                                                                                                                List listL = l();
                                                                                                                                if (listL != null) {
                                                                                                                                    List listL2 = tpVar.l();
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
                                                                                                                                if (tpVar.l() != null) {
                                                                                                                                    z18 = false;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                z18 = true;
                                                                                                                                if (z18) {
                                                                                                                                    List listS = s();
                                                                                                                                    if (listS != null) {
                                                                                                                                        List listS2 = tpVar.s();
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
                                                                                                                                    if (tpVar.s() != null) {
                                                                                                                                        z19 = false;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    z19 = true;
                                                                                                                                    if (z19) {
                                                                                                                                        List listC = c();
                                                                                                                                        if (listC != null) {
                                                                                                                                            List listC2 = tpVar.c();
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
                                                                                                                                        if (tpVar.c() != null) {
                                                                                                                                            z20 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        z20 = true;
                                                                                                                                        if (z20 && getVisibility().evaluate(expressionResolver) == tpVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                                            hx hxVarT = t();
                                                                                                                                            if (hxVarT != null ? hxVarT.g(tpVar.t(), expressionResolver, expressionResolver2) : tpVar.t() == null) {
                                                                                                                                                List listA = a();
                                                                                                                                                if (listA != null) {
                                                                                                                                                    List listA2 = tpVar.a();
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
                                                                                                                                                if (tpVar.a() != null) {
                                                                                                                                                    z21 = false;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                z21 = true;
                                                                                                                                                if (z21 && getWidth().a(tpVar.getWidth(), expressionResolver, expressionResolver2)) {
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
        return false;
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
        return this.f91426h;
    }

    @Override // k8.f7
    public List c() {
        return this.Q;
    }

    @Override // k8.f7
    public hb d() {
        return this.f91435q;
    }

    @Override // k8.f7
    public Expression e() {
        return this.f91441w;
    }

    @Override // k8.f7
    public Expression f() {
        return this.f91440v;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f91420b;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f91422d;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f91424f;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f91428j;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f91431m;
    }

    @Override // k8.f7
    public String getId() {
        return this.f91432n;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.K;
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
        return this.H;
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
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(tp.class).hashCode();
        g1 g1VarO = o();
        int iHash11 = 0;
        int iHash12 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        Expression expressionG = g();
        int iHashCode2 = iHash12 + (expressionG != null ? expressionG.hashCode() : 0);
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
        int iHashCode5 = iHash15 + (id2 != null ? id2.hashCode() : 0) + this.f91433o.hashCode();
        zh zhVarR = r();
        int iHash16 = iHashCode5 + (zhVarR != null ? zhVarR.hash() : 0);
        hb hbVarD = d();
        int iHash17 = iHash16 + (hbVarD != null ? hbVarD.hash() : 0) + this.f91436r.hashCode() + this.f91437s.hashCode();
        hb hbVarP = p();
        int iHash18 = iHash17 + (hbVarP != null ? hbVarP.hash() : 0);
        List list = this.f91439u;
        if (list != null) {
            Iterator it6 = list.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((c) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i14 = iHash18 + iHash6;
        Expression expressionF = f();
        int iHashCode6 = i14 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode7 = iHashCode6 + (expressionE != null ? expressionE.hashCode() : 0);
        g1 g1Var = this.f91442x;
        int iHash19 = iHashCode7 + (g1Var != null ? g1Var.hash() : 0);
        List listQ = q();
        if (listQ != null) {
            Iterator it7 = listQ.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((j1) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int i15 = iHash19 + iHash7;
        cb cbVar = this.f91444z;
        int iHash20 = i15 + (cbVar != null ? cbVar.hash() : 0);
        d dVar = this.A;
        int iHash21 = iHash20 + (dVar != null ? dVar.hash() : 0);
        String str = this.B;
        int iHashCode8 = iHash21 + (str != null ? str.hashCode() : 0) + this.C.hash();
        d dVar2 = this.D;
        int iHash22 = iHashCode8 + (dVar2 != null ? dVar2.hash() : 0);
        String str2 = this.E;
        int iHashCode9 = iHash22 + (str2 != null ? str2.hashCode() : 0);
        cb cbVar2 = this.F;
        int iHash23 = iHashCode9 + (cbVar2 != null ? cbVar2.hash() : 0);
        cb cbVar3 = this.G;
        int iHash24 = iHash23 + (cbVar3 != null ? cbVar3.hash() : 0);
        List listH = h();
        if (listH != null) {
            Iterator it8 = listH.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((dv) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int iHash25 = iHash24 + iHash8 + this.I.hash() + this.J.hash();
        wv transform = getTransform();
        int iHash26 = iHash25 + (transform != null ? transform.hash() : 0);
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
            Iterator it9 = listS.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((bw) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i16 = iHashCode10 + iHash9;
        List listC = c();
        if (listC != null) {
            Iterator it10 = listC.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((kw) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int iHashCode11 = i16 + iHash10 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash30 = iHashCode11 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it11 = listA.iterator();
            while (it11.hasNext()) {
                iHash11 += ((hx) it11.next()).hash();
            }
        }
        int iHash31 = iHash30 + iHash11 + getWidth().hash();
        this.V = Integer.valueOf(iHash31);
        return iHash31;
    }

    @Override // k8.f7
    public r6 i() {
        return this.N;
    }

    @Override // k8.f7
    public y7 j() {
        return this.L;
    }

    @Override // k8.f7
    public List k() {
        return this.f91427i;
    }

    @Override // k8.f7
    public List l() {
        return this.O;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f91421c;
    }

    @Override // k8.f7
    public bd n() {
        return this.f91429k;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f91419a;
    }

    @Override // k8.f7
    public hb p() {
        return this.f91438t;
    }

    @Override // k8.f7
    public List q() {
        return this.f91443y;
    }

    @Override // k8.f7
    public zh r() {
        return this.f91434p;
    }

    @Override // k8.f7
    public List s() {
        return this.P;
    }

    @Override // k8.f7
    public hx t() {
        return this.S;
    }

    @Override // k8.f7
    public List u() {
        return this.f91430l;
    }

    @Override // k8.f7
    public r6 v() {
        return this.M;
    }

    @Override // k8.f7
    public List w() {
        return this.f91423e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((yp.e) BuiltInParserKt.getBuiltInParserComponent().h7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f91425g;
    }

    public final tp y(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, List list2, l7 l7Var, Expression expression4, List list3, List list4, bd bdVar, List list5, ep epVar, String str, Expression expression5, zh zhVar, hb hbVar, Expression expression6, Expression expression7, hb hbVar2, List list6, Expression expression8, Expression expression9, g1 g1Var2, List list7, cb cbVar, d dVar, String str2, cb cbVar2, d dVar2, String str3, cb cbVar3, cb cbVar4, List list8, cb cbVar5, cb cbVar6, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list9, List list10, List list11, Expression expression10, hx hxVar, List list12, ep epVar2) {
        return new tp(g1Var, expression, expression2, expression3, list, list2, l7Var, expression4, list3, list4, bdVar, list5, epVar, str, expression5, zhVar, hbVar, expression6, expression7, hbVar2, list6, expression8, expression9, g1Var2, list7, cbVar, dVar, str2, cbVar2, dVar2, str3, cbVar3, cbVar4, list8, cbVar5, cbVar6, wvVar, y7Var, r6Var, r6Var2, list9, list10, list11, expression10, hxVar, list12, epVar2);
    }
}
