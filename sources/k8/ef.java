package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.a6;
import k8.cf;
import k8.ep;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ef implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final b f87261d0 = new b(null);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final a6 f87262e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Expression f87263f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Expression f87264g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Expression f87265h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Expression f87266i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final ep.e f87267j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Expression f87268k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Expression f87269l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Expression f87270m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Expression f87271n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Expression f87272o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Expression f87273p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final ep.d f87274q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Function2 f87275r0;
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
    public final Field f87276a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Field f87277a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87278b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Field f87279b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87280c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Field f87281c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f87282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f87283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f87284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f87285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f87286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f87287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f87288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f87289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f87290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f87291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f87292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f87293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f87294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f87295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f87296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f87297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f87298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f87299u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f87300v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f87301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f87302x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f87303y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f87304z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87305f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ef invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ef(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f87262e0 = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f87263f0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f87264g0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f87265h0 = Expression.Companion.constant$default(companion, y5.CENTER, null, 2, null);
        f87266i0 = Expression.Companion.constant$default(companion, z5.CENTER, null, 2, null);
        Expression expression = null;
        f87267j0 = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        Boolean bool = Boolean.FALSE;
        f87268k0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f87269l0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f87270m0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f87271n0 = Expression.Companion.constant$default(companion, df.FILL, null, 2, null);
        f87272o0 = Expression.Companion.constant$default(companion, g7.SOURCE_IN, null, 2, null);
        f87273p0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f87274q0 = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        f87275r0 = a.f87305f;
    }

    public ef(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47, Field field48, Field field49, Field field50, Field field51, Field field52, Field field53, Field field54, Field field55) {
        this.f87276a = field;
        this.f87278b = field2;
        this.f87280c = field3;
        this.f87282d = field4;
        this.f87283e = field5;
        this.f87284f = field6;
        this.f87285g = field7;
        this.f87286h = field8;
        this.f87287i = field9;
        this.f87288j = field10;
        this.f87289k = field11;
        this.f87290l = field12;
        this.f87291m = field13;
        this.f87292n = field14;
        this.f87293o = field15;
        this.f87294p = field16;
        this.f87295q = field17;
        this.f87296r = field18;
        this.f87297s = field19;
        this.f87298t = field20;
        this.f87299u = field21;
        this.f87300v = field22;
        this.f87301w = field23;
        this.f87302x = field24;
        this.f87303y = field25;
        this.f87304z = field26;
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
        this.f87277a0 = field53;
        this.f87279b0 = field54;
        this.f87281c0 = field55;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((cf.j) BuiltInParserKt.getBuiltInParserComponent().Y3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ ef(ParsingEnvironment parsingEnvironment, ef efVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : efVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ef(ParsingEnvironment parsingEnvironment, ef efVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
