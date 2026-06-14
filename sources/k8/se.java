package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.a6;
import k8.ep;
import k8.re;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class se implements JSONSerializable, JsonTemplate {
    public static final b U = new b(null);
    private static final a6 V;
    private static final Expression W;
    private static final Expression X;
    private static final Expression Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final ep.e f90995a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f90996b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final ep.d f90997c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Function2 f90998d0;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f91003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f91004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f91005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f91006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f91007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f91008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f91009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f91010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f91011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f91012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f91013o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f91014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f91015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f91016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f91017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f91018t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f91019u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f91020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f91021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f91022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f91023y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f91024z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91025f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final se invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new se(parsingEnvironment, null, false, jSONObject, 6, null);
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
        V = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        W = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        X = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Y = Expression.Companion.constant$default(companion, y5.START, null, 2, null);
        Z = Expression.Companion.constant$default(companion, z5.TOP, null, 2, null);
        Expression expression = null;
        f90995a0 = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        f90996b0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f90997c0 = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        f90998d0 = a.f91025f;
    }

    public se(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46) {
        this.f90999a = field;
        this.f91000b = field2;
        this.f91001c = field3;
        this.f91002d = field4;
        this.f91003e = field5;
        this.f91004f = field6;
        this.f91005g = field7;
        this.f91006h = field8;
        this.f91007i = field9;
        this.f91008j = field10;
        this.f91009k = field11;
        this.f91010l = field12;
        this.f91011m = field13;
        this.f91012n = field14;
        this.f91013o = field15;
        this.f91014p = field16;
        this.f91015q = field17;
        this.f91016r = field18;
        this.f91017s = field19;
        this.f91018t = field20;
        this.f91019u = field21;
        this.f91020v = field22;
        this.f91021w = field23;
        this.f91022x = field24;
        this.f91023y = field25;
        this.f91024z = field26;
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((re.h) BuiltInParserKt.getBuiltInParserComponent().S3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ se(ParsingEnvironment parsingEnvironment, se seVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : seVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public se(ParsingEnvironment parsingEnvironment, se seVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
