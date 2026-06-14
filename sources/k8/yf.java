package k8;

import androidx.autofill.HintConstants;
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
import k8.xg;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class yf implements JSONSerializable, Hashable, f7 {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final c f92642i0 = new c(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Expression f92643j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Expression f92644k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Expression f92645l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Expression f92646m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Expression f92647n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final ep.e f92648o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Expression f92649p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Expression f92650q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Expression f92651r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Expression f92652s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Expression f92653t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Expression f92654u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Expression f92655v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final Expression f92656w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final Expression f92657x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final ep.d f92658y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final Function2 f92659z0;
    private final String A;
    public final Expression B;
    public final Expression C;
    private final zh D;
    public final Expression E;
    public final Expression F;
    private final hb G;
    public final yg H;
    public final Expression I;
    public final Expression J;
    public final f K;
    private final hb L;
    private final Expression M;
    private final Expression N;
    public final Expression O;
    private final List P;
    public final Expression Q;
    public final Expression R;
    public final Expression S;
    public final String T;
    private final List U;
    private final wv V;
    private final y7 W;
    private final r6 X;
    private final r6 Y;
    private final List Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f92660a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f92661a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f92662b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final List f92663b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f92664c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final List f92665c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f92666d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final Expression f92667d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f92668e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final hx f92669e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression f92670f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final List f92671f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f92672g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final ep f92673g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l7 f92674h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Integer f92675h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Expression f92676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f92677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f92678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression f92679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f92680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f92681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final bd f92682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Expression f92683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Expression f92684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Expression f92685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Expression f92686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Expression f92687t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression f92688u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f92689v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ep f92690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression f92691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Expression f92692y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Expression f92693z;

    public enum a {
        AUTO("auto"),
        NONE("none"),
        WORDS("words"),
        SENTENCES("sentences"),
        ALL_CHARACTERS("all_characters");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f92694c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f92695d = b.f92705f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f92696e = C1057a.f92704f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f92703b;

        /* JADX INFO: renamed from: k8.yf$a$a, reason: collision with other inner class name */
        static final class C1057a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1057a f92704f = new C1057a();

            C1057a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke(String str) {
                return a.f92694c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f92705f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(a aVar) {
                return a.f92694c.b(aVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                a aVar = a.AUTO;
                if (Intrinsics.areEqual(str, aVar.f92703b)) {
                    return aVar;
                }
                a aVar2 = a.NONE;
                if (Intrinsics.areEqual(str, aVar2.f92703b)) {
                    return aVar2;
                }
                a aVar3 = a.WORDS;
                if (Intrinsics.areEqual(str, aVar3.f92703b)) {
                    return aVar3;
                }
                a aVar4 = a.SENTENCES;
                if (Intrinsics.areEqual(str, aVar4.f92703b)) {
                    return aVar4;
                }
                a aVar5 = a.ALL_CHARACTERS;
                if (Intrinsics.areEqual(str, aVar5.f92703b)) {
                    return aVar5;
                }
                return null;
            }

            public final String b(a aVar) {
                return aVar.f92703b;
            }

            private c() {
            }
        }

        a(String str) {
            this.f92703b = str;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f92706f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yf invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return yf.f92642i0.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yf a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((xg.l) BuiltInParserKt.getBuiltInParserComponent().s4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public enum d {
        DEFAULT("default"),
        GO("go"),
        SEARCH("search"),
        SEND("send"),
        DONE("done");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f92707c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f92708d = b.f92718f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f92709e = a.f92717f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f92716b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f92717f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String str) {
                return d.f92707c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f92718f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d dVar) {
                return d.f92707c.b(dVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String str) {
                d dVar = d.DEFAULT;
                if (Intrinsics.areEqual(str, dVar.f92716b)) {
                    return dVar;
                }
                d dVar2 = d.GO;
                if (Intrinsics.areEqual(str, dVar2.f92716b)) {
                    return dVar2;
                }
                d dVar3 = d.SEARCH;
                if (Intrinsics.areEqual(str, dVar3.f92716b)) {
                    return dVar3;
                }
                d dVar4 = d.SEND;
                if (Intrinsics.areEqual(str, dVar4.f92716b)) {
                    return dVar4;
                }
                d dVar5 = d.DONE;
                if (Intrinsics.areEqual(str, dVar5.f92716b)) {
                    return dVar5;
                }
                return null;
            }

            public final String b(d dVar) {
                return dVar.f92716b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f92716b = str;
        }
    }

    public enum e {
        SINGLE_LINE_TEXT("single_line_text"),
        MULTI_LINE_TEXT("multi_line_text"),
        PHONE("phone"),
        NUMBER("number"),
        EMAIL("email"),
        URI(com.taurusx.tax.o.g.f66428y),
        PASSWORD(HintConstants.AUTOFILL_HINT_PASSWORD);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f92719c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f92720d = b.f92732f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f92721e = a.f92731f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f92730b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f92731f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e invoke(String str) {
                return e.f92719c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f92732f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(e eVar) {
                return e.f92719c.b(eVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(String str) {
                e eVar = e.SINGLE_LINE_TEXT;
                if (Intrinsics.areEqual(str, eVar.f92730b)) {
                    return eVar;
                }
                e eVar2 = e.MULTI_LINE_TEXT;
                if (Intrinsics.areEqual(str, eVar2.f92730b)) {
                    return eVar2;
                }
                e eVar3 = e.PHONE;
                if (Intrinsics.areEqual(str, eVar3.f92730b)) {
                    return eVar3;
                }
                e eVar4 = e.NUMBER;
                if (Intrinsics.areEqual(str, eVar4.f92730b)) {
                    return eVar4;
                }
                e eVar5 = e.EMAIL;
                if (Intrinsics.areEqual(str, eVar5.f92730b)) {
                    return eVar5;
                }
                e eVar6 = e.URI;
                if (Intrinsics.areEqual(str, eVar6.f92730b)) {
                    return eVar6;
                }
                e eVar7 = e.PASSWORD;
                if (Intrinsics.areEqual(str, eVar7.f92730b)) {
                    return eVar7;
                }
                return null;
            }

            public final String b(e eVar) {
                return eVar.f92730b;
            }

            private c() {
            }
        }

        e(String str) {
            this.f92730b = str;
        }
    }

    public static final class f implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f92733c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Function2 f92734d = a.f92737f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f92735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f92736b;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f92737f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return f.f92733c.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((eh) BuiltInParserKt.getBuiltInParserComponent().y4().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public f(Expression expression) {
            this.f92735a = expression;
        }

        public final boolean a(f fVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return fVar != null && ((Number) this.f92735a.evaluate(expressionResolver)).intValue() == ((Number) fVar.f92735a.evaluate(expressionResolver2)).intValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f92736b;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(f.class).hashCode() + this.f92735a.hashCode();
            this.f92736b = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((eh) BuiltInParserKt.getBuiltInParserComponent().y4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92643j0 = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f92644k0 = Expression.Companion.constant$default(companion, a.AUTO, null, 2, null);
        f92645l0 = Expression.Companion.constant$default(companion, d.DEFAULT, null, 2, null);
        f92646m0 = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        f92647n0 = Expression.Companion.constant$default(companion, jp.SP, null, 2, null);
        f92648o0 = new ep.e(new nx(null, null, null, 7, null));
        f92649p0 = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f92650q0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f92651r0 = Expression.Companion.constant$default(companion, e.MULTI_LINE_TEXT, null, 2, null);
        f92652s0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f92653t0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f92654u0 = Expression.Companion.constant$default(companion, y5.START, null, 2, null);
        f92655v0 = Expression.Companion.constant$default(companion, z5.CENTER, null, 2, null);
        f92656w0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f92657x0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f92658y0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f92659z0 = b.f92706f;
    }

    public yf(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, List list2, l7 l7Var, Expression expression5, List list3, List list4, Expression expression6, List list5, List list6, bd bdVar, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, ep epVar, Expression expression13, Expression expression14, Expression expression15, String str, Expression expression16, Expression expression17, zh zhVar, Expression expression18, Expression expression19, hb hbVar, yg ygVar, Expression expression20, Expression expression21, f fVar, hb hbVar2, Expression expression22, Expression expression23, Expression expression24, List list8, Expression expression25, Expression expression26, Expression expression27, String str2, List list9, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list10, List list11, List list12, List list13, Expression expression28, hx hxVar, List list14, ep epVar2) {
        this.f92660a = g1Var;
        this.f92662b = expression;
        this.f92664c = expression2;
        this.f92666d = expression3;
        this.f92668e = list;
        this.f92670f = expression4;
        this.f92672g = list2;
        this.f92674h = l7Var;
        this.f92676i = expression5;
        this.f92677j = list3;
        this.f92678k = list4;
        this.f92679l = expression6;
        this.f92680m = list5;
        this.f92681n = list6;
        this.f92682o = bdVar;
        this.f92683p = expression7;
        this.f92684q = expression8;
        this.f92685r = expression9;
        this.f92686s = expression10;
        this.f92687t = expression11;
        this.f92688u = expression12;
        this.f92689v = list7;
        this.f92690w = epVar;
        this.f92691x = expression13;
        this.f92692y = expression14;
        this.f92693z = expression15;
        this.A = str;
        this.B = expression16;
        this.C = expression17;
        this.D = zhVar;
        this.E = expression18;
        this.F = expression19;
        this.G = hbVar;
        this.H = ygVar;
        this.I = expression20;
        this.J = expression21;
        this.K = fVar;
        this.L = hbVar2;
        this.M = expression22;
        this.N = expression23;
        this.O = expression24;
        this.P = list8;
        this.Q = expression25;
        this.R = expression26;
        this.S = expression27;
        this.T = str2;
        this.U = list9;
        this.V = wvVar;
        this.W = y7Var;
        this.X = r6Var;
        this.Y = r6Var2;
        this.Z = list10;
        this.f92661a0 = list11;
        this.f92663b0 = list12;
        this.f92665c0 = list13;
        this.f92667d0 = expression28;
        this.f92669e0 = hxVar;
        this.f92671f0 = list14;
        this.f92673g0 = epVar2;
    }

    public static /* synthetic */ yf z(yf yfVar, g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, List list2, l7 l7Var, Expression expression5, List list3, List list4, Expression expression6, List list5, List list6, bd bdVar, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, ep epVar, Expression expression13, Expression expression14, Expression expression15, String str, Expression expression16, Expression expression17, zh zhVar, Expression expression18, Expression expression19, hb hbVar, yg ygVar, Expression expression20, Expression expression21, f fVar, hb hbVar2, Expression expression22, Expression expression23, Expression expression24, List list8, Expression expression25, Expression expression26, Expression expression27, String str2, List list9, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list10, List list11, List list12, List list13, Expression expression28, hx hxVar, List list14, ep epVar2, int i10, int i11, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? yfVar.o() : g1Var;
        Expression expressionG = (i10 & 2) != 0 ? yfVar.g() : expression;
        Expression expressionM = (i10 & 4) != 0 ? yfVar.m() : expression2;
        Expression alpha = (i10 & 8) != 0 ? yfVar.getAlpha() : expression3;
        List listW = (i10 & 16) != 0 ? yfVar.w() : list;
        Expression expression29 = (i10 & 32) != 0 ? yfVar.f92670f : expression4;
        List background = (i10 & 64) != 0 ? yfVar.getBackground() : list2;
        l7 l7VarX = (i10 & 128) != 0 ? yfVar.x() : l7Var;
        Expression expressionB = (i10 & 256) != 0 ? yfVar.b() : expression5;
        List listK = (i10 & 512) != 0 ? yfVar.k() : list3;
        List list15 = (i10 & 1024) != 0 ? yfVar.f92678k : list4;
        Expression expression30 = (i10 & 2048) != 0 ? yfVar.f92679l : expression6;
        List extensions = (i10 & 4096) != 0 ? yfVar.getExtensions() : list5;
        g1 g1Var2 = g1VarO;
        List list16 = (i10 & 8192) != 0 ? yfVar.f92681n : list6;
        bd bdVarN = (i10 & 16384) != 0 ? yfVar.n() : bdVar;
        Expression expression31 = (i10 & 32768) != 0 ? yfVar.f92683p : expression7;
        Expression expression32 = (i10 & 65536) != 0 ? yfVar.f92684q : expression8;
        Expression expression33 = (i10 & 131072) != 0 ? yfVar.f92685r : expression9;
        Expression expression34 = (i10 & 262144) != 0 ? yfVar.f92686s : expression10;
        Expression expression35 = (i10 & 524288) != 0 ? yfVar.f92687t : expression11;
        Expression expression36 = (i10 & 1048576) != 0 ? yfVar.f92688u : expression12;
        List listU = (i10 & 2097152) != 0 ? yfVar.u() : list7;
        ep height = (i10 & 4194304) != 0 ? yfVar.getHeight() : epVar;
        Expression expression37 = expression36;
        Expression expression38 = (i10 & 8388608) != 0 ? yfVar.f92691x : expression13;
        Expression expression39 = (i10 & 16777216) != 0 ? yfVar.f92692y : expression14;
        Expression expression40 = (i10 & 33554432) != 0 ? yfVar.f92693z : expression15;
        String id2 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? yfVar.getId() : str;
        Expression expression41 = expression40;
        Expression expression42 = (i10 & 134217728) != 0 ? yfVar.B : expression16;
        Expression expression43 = (i10 & 268435456) != 0 ? yfVar.C : expression17;
        zh zhVarR = (i10 & 536870912) != 0 ? yfVar.r() : zhVar;
        Expression expression44 = expression43;
        Expression expression45 = (i10 & 1073741824) != 0 ? yfVar.E : expression18;
        Expression expression46 = (i10 & Integer.MIN_VALUE) != 0 ? yfVar.F : expression19;
        hb hbVarD = (i11 & 1) != 0 ? yfVar.d() : hbVar;
        Expression expression47 = expression46;
        yg ygVar2 = (i11 & 2) != 0 ? yfVar.H : ygVar;
        Expression expression48 = (i11 & 4) != 0 ? yfVar.I : expression20;
        Expression expression49 = (i11 & 8) != 0 ? yfVar.J : expression21;
        f fVar2 = (i11 & 16) != 0 ? yfVar.K : fVar;
        return yfVar.y(g1Var2, expressionG, expressionM, alpha, listW, expression29, background, l7VarX, expressionB, listK, list15, expression30, extensions, list16, bdVarN, expression31, expression32, expression33, expression34, expression35, expression37, listU, height, expression38, expression39, expression41, id2, expression42, expression44, zhVarR, expression45, expression47, hbVarD, ygVar2, expression48, expression49, fVar2, (i11 & 32) != 0 ? yfVar.p() : hbVar2, (i11 & 64) != 0 ? yfVar.f() : expression22, (i11 & 128) != 0 ? yfVar.e() : expression23, (i11 & 256) != 0 ? yfVar.O : expression24, (i11 & 512) != 0 ? yfVar.q() : list8, (i11 & 1024) != 0 ? yfVar.Q : expression25, (i11 & 2048) != 0 ? yfVar.R : expression26, (i11 & 4096) != 0 ? yfVar.S : expression27, (i11 & 8192) != 0 ? yfVar.T : str2, (i11 & 16384) != 0 ? yfVar.h() : list9, (i11 & 32768) != 0 ? yfVar.getTransform() : wvVar, (i11 & 65536) != 0 ? yfVar.j() : y7Var, (i11 & 131072) != 0 ? yfVar.v() : r6Var, (i11 & 262144) != 0 ? yfVar.i() : r6Var2, (i11 & 524288) != 0 ? yfVar.l() : list10, (i11 & 1048576) != 0 ? yfVar.f92661a0 : list11, (i11 & 2097152) != 0 ? yfVar.s() : list12, (i11 & 4194304) != 0 ? yfVar.c() : list13, (i11 & 8388608) != 0 ? yfVar.getVisibility() : expression28, (i11 & 16777216) != 0 ? yfVar.t() : hxVar, (i11 & 33554432) != 0 ? yfVar.a() : list14, (i11 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? yfVar.getWidth() : epVar2);
    }

    public final boolean A(yf yfVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (yfVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(yfVar.o(), expressionResolver, expressionResolver2) : yfVar.o() == null) {
            Expression expressionG = g();
            y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
            Expression expressionG2 = yfVar.g();
            if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                Expression expressionM = m();
                z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                Expression expressionM2 = yfVar.m();
                if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                    if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) yfVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                        List listW = w();
                        if (listW != null) {
                            List listW2 = yfVar.w();
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
                        if (yfVar.w() != null) {
                            z10 = false;
                            break;
                        }
                        z10 = true;
                        if (z10 && this.f92670f.evaluate(expressionResolver) == yfVar.f92670f.evaluate(expressionResolver2)) {
                            List background = getBackground();
                            if (background != null) {
                                List background2 = yfVar.getBackground();
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
                            if (yfVar.getBackground() != null) {
                                z11 = false;
                                break;
                            }
                            z11 = true;
                            if (z11) {
                                l7 l7VarX = x();
                                if (l7VarX != null ? l7VarX.a(yfVar.x(), expressionResolver, expressionResolver2) : yfVar.x() == null) {
                                    Expression expressionB = b();
                                    Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                    Expression expressionB2 = yfVar.b();
                                    if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null)) {
                                        List listK = k();
                                        if (listK != null) {
                                            List listK2 = yfVar.k();
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
                                        if (yfVar.k() != null) {
                                            z12 = false;
                                            break;
                                        }
                                        z12 = true;
                                        if (z12) {
                                            List list = this.f92678k;
                                            if (list != null) {
                                                List list2 = yfVar.f92678k;
                                                if (list2 != null) {
                                                    if (list.size() == list2.size()) {
                                                        int i16 = 0;
                                                        for (Object obj4 : list) {
                                                            int i17 = i16 + 1;
                                                            if (i16 < 0) {
                                                                CollectionsKt.throwIndexOverflow();
                                                            }
                                                            if (((j1) obj4).a((j1) list2.get(i16), expressionResolver, expressionResolver2)) {
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
                                            if (yfVar.f92678k != null) {
                                                z13 = false;
                                                break;
                                            }
                                            z13 = true;
                                            if (z13 && this.f92679l.evaluate(expressionResolver) == yfVar.f92679l.evaluate(expressionResolver2)) {
                                                List extensions = getExtensions();
                                                if (extensions != null) {
                                                    List extensions2 = yfVar.getExtensions();
                                                    if (extensions2 != null) {
                                                        if (extensions.size() == extensions2.size()) {
                                                            int i18 = 0;
                                                            for (Object obj5 : extensions) {
                                                                int i19 = i18 + 1;
                                                                if (i18 < 0) {
                                                                    CollectionsKt.throwIndexOverflow();
                                                                }
                                                                if (((rb) obj5).a((rb) extensions2.get(i18), expressionResolver, expressionResolver2)) {
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
                                                if (yfVar.getExtensions() != null) {
                                                    z14 = false;
                                                    break;
                                                }
                                                z14 = true;
                                                if (z14) {
                                                    List list3 = this.f92681n;
                                                    if (list3 != null) {
                                                        List list4 = yfVar.f92681n;
                                                        if (list4 != null) {
                                                            if (list3.size() == list4.size()) {
                                                                int i20 = 0;
                                                                for (Object obj6 : list3) {
                                                                    int i21 = i20 + 1;
                                                                    if (i20 < 0) {
                                                                        CollectionsKt.throwIndexOverflow();
                                                                    }
                                                                    if (((zf) obj6).a((zf) list4.get(i20), expressionResolver, expressionResolver2)) {
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
                                                    if (yfVar.f92681n != null) {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    z15 = true;
                                                    if (z15) {
                                                        bd bdVarN = n();
                                                        if (bdVarN != null ? bdVarN.a(yfVar.n(), expressionResolver, expressionResolver2) : yfVar.n() == null) {
                                                            Expression expression = this.f92683p;
                                                            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
                                                            Expression expression2 = yfVar.f92683p;
                                                            if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && ((Number) this.f92684q.evaluate(expressionResolver)).longValue() == ((Number) yfVar.f92684q.evaluate(expressionResolver2)).longValue() && this.f92685r.evaluate(expressionResolver) == yfVar.f92685r.evaluate(expressionResolver2)) {
                                                                Expression expression3 = this.f92686s;
                                                                JSONObject jSONObject = expression3 != null ? (JSONObject) expression3.evaluate(expressionResolver) : null;
                                                                Expression expression4 = yfVar.f92686s;
                                                                if (Intrinsics.areEqual(jSONObject, expression4 != null ? (JSONObject) expression4.evaluate(expressionResolver2) : null)) {
                                                                    Expression expression5 = this.f92687t;
                                                                    jd jdVar = expression5 != null ? (jd) expression5.evaluate(expressionResolver) : null;
                                                                    Expression expression6 = yfVar.f92687t;
                                                                    if (jdVar == (expression6 != null ? (jd) expression6.evaluate(expressionResolver2) : null)) {
                                                                        Expression expression7 = this.f92688u;
                                                                        Long l11 = expression7 != null ? (Long) expression7.evaluate(expressionResolver) : null;
                                                                        Expression expression8 = yfVar.f92688u;
                                                                        if (Intrinsics.areEqual(l11, expression8 != null ? (Long) expression8.evaluate(expressionResolver2) : null)) {
                                                                            List listU = u();
                                                                            if (listU != null) {
                                                                                List listU2 = yfVar.u();
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
                                                                            if (yfVar.u() != null) {
                                                                                z16 = false;
                                                                                break;
                                                                            }
                                                                            z16 = true;
                                                                            if (z16 && getHeight().a(yfVar.getHeight(), expressionResolver, expressionResolver2)) {
                                                                                Expression expression9 = this.f92691x;
                                                                                Integer num = expression9 != null ? (Integer) expression9.evaluate(expressionResolver) : null;
                                                                                Expression expression10 = yfVar.f92691x;
                                                                                if (Intrinsics.areEqual(num, expression10 != null ? (Integer) expression10.evaluate(expressionResolver2) : null) && ((Number) this.f92692y.evaluate(expressionResolver)).intValue() == ((Number) yfVar.f92692y.evaluate(expressionResolver2)).intValue()) {
                                                                                    Expression expression11 = this.f92693z;
                                                                                    String str2 = expression11 != null ? (String) expression11.evaluate(expressionResolver) : null;
                                                                                    Expression expression12 = yfVar.f92693z;
                                                                                    if (Intrinsics.areEqual(str2, expression12 != null ? (String) expression12.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(getId(), yfVar.getId()) && ((Boolean) this.B.evaluate(expressionResolver)).booleanValue() == ((Boolean) yfVar.B.evaluate(expressionResolver2)).booleanValue() && this.C.evaluate(expressionResolver) == yfVar.C.evaluate(expressionResolver2)) {
                                                                                        zh zhVarR = r();
                                                                                        if (zhVarR != null ? zhVarR.a(yfVar.r(), expressionResolver, expressionResolver2) : yfVar.r() == null) {
                                                                                            if (((Number) this.E.evaluate(expressionResolver)).doubleValue() == ((Number) yfVar.E.evaluate(expressionResolver2)).doubleValue()) {
                                                                                                Expression expression13 = this.F;
                                                                                                Long l12 = expression13 != null ? (Long) expression13.evaluate(expressionResolver) : null;
                                                                                                Expression expression14 = yfVar.F;
                                                                                                if (Intrinsics.areEqual(l12, expression14 != null ? (Long) expression14.evaluate(expressionResolver2) : null)) {
                                                                                                    hb hbVarD = d();
                                                                                                    if (hbVarD != null ? hbVarD.a(yfVar.d(), expressionResolver, expressionResolver2) : yfVar.d() == null) {
                                                                                                        yg ygVar = this.H;
                                                                                                        if (ygVar != null ? ygVar.a(yfVar.H, expressionResolver, expressionResolver2) : yfVar.H == null) {
                                                                                                            Expression expression15 = this.I;
                                                                                                            Long l13 = expression15 != null ? (Long) expression15.evaluate(expressionResolver) : null;
                                                                                                            Expression expression16 = yfVar.I;
                                                                                                            if (Intrinsics.areEqual(l13, expression16 != null ? (Long) expression16.evaluate(expressionResolver2) : null)) {
                                                                                                                Expression expression17 = this.J;
                                                                                                                Long l14 = expression17 != null ? (Long) expression17.evaluate(expressionResolver) : null;
                                                                                                                Expression expression18 = yfVar.J;
                                                                                                                if (Intrinsics.areEqual(l14, expression18 != null ? (Long) expression18.evaluate(expressionResolver2) : null)) {
                                                                                                                    f fVar = this.K;
                                                                                                                    if (fVar != null ? fVar.a(yfVar.K, expressionResolver, expressionResolver2) : yfVar.K == null) {
                                                                                                                        hb hbVarP = p();
                                                                                                                        if (hbVarP != null ? hbVarP.a(yfVar.p(), expressionResolver, expressionResolver2) : yfVar.p() == null) {
                                                                                                                            Expression expressionF = f();
                                                                                                                            String str3 = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                                                                            Expression expressionF2 = yfVar.f();
                                                                                                                            if (Intrinsics.areEqual(str3, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                                                                                Expression expressionE = e();
                                                                                                                                Long l15 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                                                                                Expression expressionE2 = yfVar.e();
                                                                                                                                if (Intrinsics.areEqual(l15, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null) && ((Boolean) this.O.evaluate(expressionResolver)).booleanValue() == ((Boolean) yfVar.O.evaluate(expressionResolver2)).booleanValue()) {
                                                                                                                                    List listQ = q();
                                                                                                                                    if (listQ != null) {
                                                                                                                                        List listQ2 = yfVar.q();
                                                                                                                                        if (listQ2 != null) {
                                                                                                                                            if (listQ.size() == listQ2.size()) {
                                                                                                                                                int i24 = 0;
                                                                                                                                                for (Object obj8 : listQ) {
                                                                                                                                                    int i25 = i24 + 1;
                                                                                                                                                    if (i24 < 0) {
                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                    }
                                                                                                                                                    if (((j1) obj8).a((j1) listQ2.get(i24), expressionResolver, expressionResolver2)) {
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
                                                                                                                                    if (yfVar.q() != null) {
                                                                                                                                        z17 = false;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    z17 = true;
                                                                                                                                    if (z17 && this.Q.evaluate(expressionResolver) == yfVar.Q.evaluate(expressionResolver2) && this.R.evaluate(expressionResolver) == yfVar.R.evaluate(expressionResolver2) && ((Number) this.S.evaluate(expressionResolver)).intValue() == ((Number) yfVar.S.evaluate(expressionResolver2)).intValue() && Intrinsics.areEqual(this.T, yfVar.T)) {
                                                                                                                                        List listH = h();
                                                                                                                                        if (listH != null) {
                                                                                                                                            List listH2 = yfVar.h();
                                                                                                                                            if (listH2 != null) {
                                                                                                                                                if (listH.size() == listH2.size()) {
                                                                                                                                                    int i26 = 0;
                                                                                                                                                    for (Object obj9 : listH) {
                                                                                                                                                        int i27 = i26 + 1;
                                                                                                                                                        if (i26 < 0) {
                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                        }
                                                                                                                                                        if (((dv) obj9).a((dv) listH2.get(i26), expressionResolver, expressionResolver2)) {
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
                                                                                                                                        if (yfVar.h() != null) {
                                                                                                                                            z18 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        z18 = true;
                                                                                                                                        if (z18) {
                                                                                                                                            wv transform = getTransform();
                                                                                                                                            if (transform != null ? transform.a(yfVar.getTransform(), expressionResolver, expressionResolver2) : yfVar.getTransform() == null) {
                                                                                                                                                y7 y7VarJ = j();
                                                                                                                                                if (y7VarJ != null ? y7VarJ.a(yfVar.j(), expressionResolver, expressionResolver2) : yfVar.j() == null) {
                                                                                                                                                    r6 r6VarV = v();
                                                                                                                                                    if (r6VarV != null ? r6VarV.a(yfVar.v(), expressionResolver, expressionResolver2) : yfVar.v() == null) {
                                                                                                                                                        r6 r6VarI = i();
                                                                                                                                                        if (r6VarI != null ? r6VarI.a(yfVar.i(), expressionResolver, expressionResolver2) : yfVar.i() == null) {
                                                                                                                                                            List listL = l();
                                                                                                                                                            if (listL != null) {
                                                                                                                                                                List listL2 = yfVar.l();
                                                                                                                                                                if (listL2 != null) {
                                                                                                                                                                    if (listL.size() == listL2.size()) {
                                                                                                                                                                        int i28 = 0;
                                                                                                                                                                        for (Object obj10 : listL) {
                                                                                                                                                                            int i29 = i28 + 1;
                                                                                                                                                                            if (i28 < 0) {
                                                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                                                            }
                                                                                                                                                                            if (((aw) obj10) == ((aw) listL2.get(i28))) {
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
                                                                                                                                                            if (yfVar.l() != null) {
                                                                                                                                                                z19 = false;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            z19 = true;
                                                                                                                                                            if (z19) {
                                                                                                                                                                List list5 = this.f92661a0;
                                                                                                                                                                if (list5 != null) {
                                                                                                                                                                    List list6 = yfVar.f92661a0;
                                                                                                                                                                    if (list6 != null) {
                                                                                                                                                                        if (list5.size() == list6.size()) {
                                                                                                                                                                            int i30 = 0;
                                                                                                                                                                            for (Object obj11 : list5) {
                                                                                                                                                                                int i31 = i30 + 1;
                                                                                                                                                                                if (i30 < 0) {
                                                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                }
                                                                                                                                                                                if (((ih) obj11).a((ih) list6.get(i30), expressionResolver, expressionResolver2)) {
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
                                                                                                                                                                if (yfVar.f92661a0 != null) {
                                                                                                                                                                    z20 = false;
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                z20 = true;
                                                                                                                                                                if (z20) {
                                                                                                                                                                    List listS = s();
                                                                                                                                                                    if (listS != null) {
                                                                                                                                                                        List listS2 = yfVar.s();
                                                                                                                                                                        if (listS2 != null) {
                                                                                                                                                                            if (listS.size() == listS2.size()) {
                                                                                                                                                                                int i32 = 0;
                                                                                                                                                                                for (Object obj12 : listS) {
                                                                                                                                                                                    int i33 = i32 + 1;
                                                                                                                                                                                    if (i32 < 0) {
                                                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                    }
                                                                                                                                                                                    if (((bw) obj12).a((bw) listS2.get(i32), expressionResolver, expressionResolver2)) {
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
                                                                                                                                                                    if (yfVar.s() != null) {
                                                                                                                                                                        z21 = false;
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    z21 = true;
                                                                                                                                                                    if (z21) {
                                                                                                                                                                        List listC = c();
                                                                                                                                                                        if (listC != null) {
                                                                                                                                                                            List listC2 = yfVar.c();
                                                                                                                                                                            if (listC2 != null) {
                                                                                                                                                                                if (listC.size() == listC2.size()) {
                                                                                                                                                                                    int i34 = 0;
                                                                                                                                                                                    for (Object obj13 : listC) {
                                                                                                                                                                                        int i35 = i34 + 1;
                                                                                                                                                                                        if (i34 < 0) {
                                                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                        }
                                                                                                                                                                                        if (((kw) obj13).a((kw) listC2.get(i34), expressionResolver, expressionResolver2)) {
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
                                                                                                                                                                        if (yfVar.c() != null) {
                                                                                                                                                                            z22 = false;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        z22 = true;
                                                                                                                                                                        if (z22 && getVisibility().evaluate(expressionResolver) == yfVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                                                                            hx hxVarT = t();
                                                                                                                                                                            if (hxVarT != null ? hxVarT.g(yfVar.t(), expressionResolver, expressionResolver2) : yfVar.t() == null) {
                                                                                                                                                                                List listA = a();
                                                                                                                                                                                if (listA != null) {
                                                                                                                                                                                    List listA2 = yfVar.a();
                                                                                                                                                                                    if (listA2 != null) {
                                                                                                                                                                                        if (listA.size() == listA2.size()) {
                                                                                                                                                                                            int i36 = 0;
                                                                                                                                                                                            for (Object obj14 : listA) {
                                                                                                                                                                                                int i37 = i36 + 1;
                                                                                                                                                                                                if (i36 < 0) {
                                                                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                                }
                                                                                                                                                                                                if (((hx) obj14).g((hx) listA2.get(i36), expressionResolver, expressionResolver2)) {
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
                                                                                                                                                                                if (yfVar.a() != null) {
                                                                                                                                                                                    z23 = false;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                z23 = true;
                                                                                                                                                                                if (z23 && getWidth().a(yfVar.getWidth(), expressionResolver, expressionResolver2)) {
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
        return this.f92671f0;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f92676i;
    }

    @Override // k8.f7
    public List c() {
        return this.f92665c0;
    }

    @Override // k8.f7
    public hb d() {
        return this.G;
    }

    @Override // k8.f7
    public Expression e() {
        return this.N;
    }

    @Override // k8.f7
    public Expression f() {
        return this.M;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f92662b;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f92666d;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f92672g;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f92680m;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.f92690w;
    }

    @Override // k8.f7
    public String getId() {
        return this.A;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.V;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.f92667d0;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.f92673g0;
    }

    @Override // k8.f7
    public List h() {
        return this.U;
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
        Integer num = this.f92675h0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(yf.class).hashCode();
        g1 g1VarO = o();
        int iHash13 = 0;
        int iHash14 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        Expression expressionG = g();
        int iHashCode2 = iHash14 + (expressionG != null ? expressionG.hashCode() : 0);
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
        int iHashCode4 = iHashCode3 + iHash + this.f92670f.hashCode();
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
        int i10 = iHashCode4 + iHash2;
        l7 l7VarX = x();
        int iHash15 = i10 + (l7VarX != null ? l7VarX.hash() : 0);
        Expression expressionB = b();
        int iHashCode5 = iHash15 + (expressionB != null ? expressionB.hashCode() : 0);
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
        int i11 = iHashCode5 + iHash3;
        List list = this.f92678k;
        if (list != null) {
            Iterator it4 = list.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((j1) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int iHashCode6 = i11 + iHash4 + this.f92679l.hashCode();
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it5 = extensions.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((rb) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i12 = iHashCode6 + iHash5;
        List list2 = this.f92681n;
        if (list2 != null) {
            Iterator it6 = list2.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((zf) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i13 = i12 + iHash6;
        bd bdVarN = n();
        int iHash16 = i13 + (bdVarN != null ? bdVarN.hash() : 0);
        Expression expression = this.f92683p;
        int iHashCode7 = iHash16 + (expression != null ? expression.hashCode() : 0) + this.f92684q.hashCode() + this.f92685r.hashCode();
        Expression expression2 = this.f92686s;
        int iHashCode8 = iHashCode7 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.f92687t;
        int iHashCode9 = iHashCode8 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.f92688u;
        int iHashCode10 = iHashCode9 + (expression4 != null ? expression4.hashCode() : 0);
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
        int iHash17 = iHashCode10 + iHash7 + getHeight().hash();
        Expression expression5 = this.f92691x;
        int iHashCode11 = iHash17 + (expression5 != null ? expression5.hashCode() : 0) + this.f92692y.hashCode();
        Expression expression6 = this.f92693z;
        int iHashCode12 = iHashCode11 + (expression6 != null ? expression6.hashCode() : 0);
        String id2 = getId();
        int iHashCode13 = iHashCode12 + (id2 != null ? id2.hashCode() : 0) + this.B.hashCode() + this.C.hashCode();
        zh zhVarR = r();
        int iHash18 = iHashCode13 + (zhVarR != null ? zhVarR.hash() : 0) + this.E.hashCode();
        Expression expression7 = this.F;
        int iHashCode14 = iHash18 + (expression7 != null ? expression7.hashCode() : 0);
        hb hbVarD = d();
        int iHash19 = iHashCode14 + (hbVarD != null ? hbVarD.hash() : 0);
        yg ygVar = this.H;
        int iHash20 = iHash19 + (ygVar != null ? ygVar.hash() : 0);
        Expression expression8 = this.I;
        int iHashCode15 = iHash20 + (expression8 != null ? expression8.hashCode() : 0);
        Expression expression9 = this.J;
        int iHashCode16 = iHashCode15 + (expression9 != null ? expression9.hashCode() : 0);
        f fVar = this.K;
        int iHash21 = iHashCode16 + (fVar != null ? fVar.hash() : 0);
        hb hbVarP = p();
        int iHash22 = iHash21 + (hbVarP != null ? hbVarP.hash() : 0);
        Expression expressionF = f();
        int iHashCode17 = iHash22 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode18 = iHashCode17 + (expressionE != null ? expressionE.hashCode() : 0) + this.O.hashCode();
        List listQ = q();
        if (listQ != null) {
            Iterator it8 = listQ.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((j1) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int iHashCode19 = iHashCode18 + iHash8 + this.Q.hashCode() + this.R.hashCode() + this.S.hashCode() + this.T.hashCode();
        List listH = h();
        if (listH != null) {
            Iterator it9 = listH.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((dv) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i14 = iHashCode19 + iHash9;
        wv transform = getTransform();
        int iHash23 = i14 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash24 = iHash23 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash25 = iHash24 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash26 = iHash25 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode20 = iHash26 + (listL != null ? listL.hashCode() : 0);
        List list3 = this.f92661a0;
        if (list3 != null) {
            Iterator it10 = list3.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((ih) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i15 = iHashCode20 + iHash10;
        List listS = s();
        if (listS != null) {
            Iterator it11 = listS.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((bw) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i16 = i15 + iHash11;
        List listC = c();
        if (listC != null) {
            Iterator it12 = listC.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((kw) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int iHashCode21 = i16 + iHash12 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash27 = iHashCode21 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it13 = listA.iterator();
            while (it13.hasNext()) {
                iHash13 += ((hx) it13.next()).hash();
            }
        }
        int iHash28 = iHash27 + iHash13 + getWidth().hash();
        this.f92675h0 = Integer.valueOf(iHash28);
        return iHash28;
    }

    @Override // k8.f7
    public r6 i() {
        return this.Y;
    }

    @Override // k8.f7
    public y7 j() {
        return this.W;
    }

    @Override // k8.f7
    public List k() {
        return this.f92677j;
    }

    @Override // k8.f7
    public List l() {
        return this.Z;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f92664c;
    }

    @Override // k8.f7
    public bd n() {
        return this.f92682o;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f92660a;
    }

    @Override // k8.f7
    public hb p() {
        return this.L;
    }

    @Override // k8.f7
    public List q() {
        return this.P;
    }

    @Override // k8.f7
    public zh r() {
        return this.D;
    }

    @Override // k8.f7
    public List s() {
        return this.f92663b0;
    }

    @Override // k8.f7
    public hx t() {
        return this.f92669e0;
    }

    @Override // k8.f7
    public List u() {
        return this.f92689v;
    }

    @Override // k8.f7
    public r6 v() {
        return this.X;
    }

    @Override // k8.f7
    public List w() {
        return this.f92668e;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((xg.l) BuiltInParserKt.getBuiltInParserComponent().s4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f92674h;
    }

    public final yf y(g1 g1Var, Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, List list2, l7 l7Var, Expression expression5, List list3, List list4, Expression expression6, List list5, List list6, bd bdVar, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, ep epVar, Expression expression13, Expression expression14, Expression expression15, String str, Expression expression16, Expression expression17, zh zhVar, Expression expression18, Expression expression19, hb hbVar, yg ygVar, Expression expression20, Expression expression21, f fVar, hb hbVar2, Expression expression22, Expression expression23, Expression expression24, List list8, Expression expression25, Expression expression26, Expression expression27, String str2, List list9, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list10, List list11, List list12, List list13, Expression expression28, hx hxVar, List list14, ep epVar2) {
        return new yf(g1Var, expression, expression2, expression3, list, expression4, list2, l7Var, expression5, list3, list4, expression6, list5, list6, bdVar, expression7, expression8, expression9, expression10, expression11, expression12, list7, epVar, expression13, expression14, expression15, str, expression16, expression17, zhVar, expression18, expression19, hbVar, ygVar, expression20, expression21, fVar, hbVar2, expression22, expression23, expression24, list8, expression25, expression26, expression27, str2, list9, wvVar, y7Var, r6Var, r6Var2, list10, list11, list12, list13, expression28, hxVar, list14, epVar2);
    }
}
