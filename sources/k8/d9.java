package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.a6;
import k8.b9;
import k8.c9;
import k8.ep;
import k8.u8;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class d9 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final b f86911c0 = new b(null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final a6 f86912d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Expression f86913e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Expression f86914f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Expression f86915g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Expression f86916h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Expression f86917i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final ep.e f86918j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Expression f86919k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Expression f86920l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Expression f86921m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Expression f86922n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Expression f86923o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final ep.d f86924p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Function2 f86925q0;
    public final Field A;
    public final Field B;
    public final Field C;
    public final Field D;
    public final Field E;
    public final Field F;
    public final Field G;
    public final Field H;
    public final Field I;
    public final Field J;
    public final Field K;
    public final Field L;
    public final Field M;
    public final Field N;
    public final Field O;
    public final Field P;
    public final Field Q;
    public final Field R;
    public final Field S;
    public final Field T;
    public final Field U;
    public final Field V;
    public final Field W;
    public final Field X;
    public final Field Y;
    public final Field Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f86926a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Field f86927a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f86928b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Field f86929b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f86930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f86931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f86932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f86933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f86934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f86935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f86936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f86937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f86938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f86939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f86940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f86941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f86942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f86943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f86944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f86945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f86946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f86947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f86948u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f86949v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f86950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f86951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f86952y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f86953z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86954f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d9 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new d9(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f86912d0 = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f86913e0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f86914f0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f86915g0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f86916h0 = Expression.Companion.constant$default(companion, e9.START, null, 2, null);
        f86917i0 = Expression.Companion.constant$default(companion, f9.TOP, null, 2, null);
        Expression expression = null;
        f86918j0 = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        f86919k0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f86920l0 = Expression.Companion.constant$default(companion, u8.c.NO_WRAP, null, 2, null);
        f86921m0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f86922n0 = Expression.Companion.constant$default(companion, u8.d.VERTICAL, null, 2, null);
        f86923o0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f86924p0 = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        f86925q0 = a.f86954f;
    }

    public d9(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47, Field field48, Field field49, Field field50, Field field51, Field field52, Field field53, Field field54) {
        this.f86926a = field;
        this.f86928b = field2;
        this.f86930c = field3;
        this.f86931d = field4;
        this.f86932e = field5;
        this.f86933f = field6;
        this.f86934g = field7;
        this.f86935h = field8;
        this.f86936i = field9;
        this.f86937j = field10;
        this.f86938k = field11;
        this.f86939l = field12;
        this.f86940m = field13;
        this.f86941n = field14;
        this.f86942o = field15;
        this.f86943p = field16;
        this.f86944q = field17;
        this.f86945r = field18;
        this.f86946s = field19;
        this.f86947t = field20;
        this.f86948u = field21;
        this.f86949v = field22;
        this.f86950w = field23;
        this.f86951x = field24;
        this.f86952y = field25;
        this.f86953z = field26;
        this.A = field27;
        this.B = field28;
        this.C = field29;
        this.D = field30;
        this.E = field31;
        this.F = field32;
        this.G = field33;
        this.H = field34;
        this.I = field35;
        this.J = field36;
        this.K = field37;
        this.L = field38;
        this.M = field39;
        this.N = field40;
        this.O = field41;
        this.P = field42;
        this.Q = field43;
        this.R = field44;
        this.S = field45;
        this.T = field46;
        this.U = field47;
        this.V = field48;
        this.W = field49;
        this.X = field50;
        this.Y = field51;
        this.Z = field52;
        this.f86927a0 = field53;
        this.f86929b0 = field54;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((b9.j) BuiltInParserKt.getBuiltInParserComponent().n2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f86955f = new b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Expression f86956g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Expression f86957h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Expression f86958i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Function2 f86959j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f86960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f86961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f86962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field f86963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field f86964e;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f86965f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new c(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            Boolean bool = Boolean.FALSE;
            f86956g = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f86957h = Expression.Companion.constant$default(companion, bool, null, 2, null);
            f86958i = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
            f86959j = a.f86965f;
        }

        public c(Field field, Field field2, Field field3, Field field4, Field field5) {
            this.f86960a = field;
            this.f86961b = field2;
            this.f86962c = field3;
            this.f86963d = field4;
            this.f86964e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((c9.c) BuiltInParserKt.getBuiltInParserComponent().q2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ d9(ParsingEnvironment parsingEnvironment, d9 d9Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : d9Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d9(ParsingEnvironment parsingEnvironment, d9 d9Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
