package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.a6;
import k8.ep;
import k8.je;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ke implements JSONSerializable, JsonTemplate {
    public static final b Y = new b(null);
    private static final a6 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f88620a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f88621b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f88622c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Expression f88623d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final ep.e f88624e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Expression f88625f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Expression f88626g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Expression f88627h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Expression f88628i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final ep.d f88629j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Function2 f88630k0;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f88631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f88632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f88633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f88634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f88635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f88636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f88637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f88638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f88639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f88640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f88641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f88642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f88643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f88644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f88645o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f88646p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f88647q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f88648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f88649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f88650t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f88651u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f88652v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f88653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f88654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f88655y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f88656z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88657f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ke invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ke(parsingEnvironment, null, false, jSONObject, 6, null);
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
        Z = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f88620a0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f88621b0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f88622c0 = Expression.Companion.constant$default(companion, y5.CENTER, null, 2, null);
        f88623d0 = Expression.Companion.constant$default(companion, z5.CENTER, null, 2, null);
        Expression expression = null;
        f88624e0 = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        f88625f0 = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f88626g0 = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f88627h0 = Expression.Companion.constant$default(companion, df.FILL, null, 2, null);
        f88628i0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f88629j0 = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        f88630k0 = a.f88657f;
    }

    public ke(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47, Field field48, Field field49, Field field50) {
        this.f88631a = field;
        this.f88632b = field2;
        this.f88633c = field3;
        this.f88634d = field4;
        this.f88635e = field5;
        this.f88636f = field6;
        this.f88637g = field7;
        this.f88638h = field8;
        this.f88639i = field9;
        this.f88640j = field10;
        this.f88641k = field11;
        this.f88642l = field12;
        this.f88643m = field13;
        this.f88644n = field14;
        this.f88645o = field15;
        this.f88646p = field16;
        this.f88647q = field17;
        this.f88648r = field18;
        this.f88649s = field19;
        this.f88650t = field20;
        this.f88651u = field21;
        this.f88652v = field22;
        this.f88653w = field23;
        this.f88654x = field24;
        this.f88655y = field25;
        this.f88656z = field26;
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((je.i) BuiltInParserKt.getBuiltInParserComponent().P3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ ke(ParsingEnvironment parsingEnvironment, ke keVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : keVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ke(ParsingEnvironment parsingEnvironment, ke keVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
