package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.a6;
import k8.ep;
import k8.go;
import k8.ho;
import k8.mo;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class no implements JSONSerializable, JsonTemplate {
    public static final b R = new b(null);
    private static final a6 S;
    private static final Expression T;
    private static final Expression U;
    private static final ep.e V;
    private static final Expression W;
    private static final ep.d X;
    private static final Function2 Y;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f90063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f90064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f90065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f90066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f90067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f90068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f90069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f90070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f90071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f90072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f90073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f90074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f90075n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f90076o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f90077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f90078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f90079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f90080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f90081t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f90082u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f90083v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f90084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f90085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f90086y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f90087z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90088f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final no invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new no(parsingEnvironment, null, false, jSONObject, 6, null);
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
        S = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        T = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        U = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression expression = null;
        V = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        W = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        X = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        Y = a.f90088f;
    }

    public no(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43) {
        this.f90062a = field;
        this.f90063b = field2;
        this.f90064c = field3;
        this.f90065d = field4;
        this.f90066e = field5;
        this.f90067f = field6;
        this.f90068g = field7;
        this.f90069h = field8;
        this.f90070i = field9;
        this.f90071j = field10;
        this.f90072k = field11;
        this.f90073l = field12;
        this.f90074m = field13;
        this.f90075n = field14;
        this.f90076o = field15;
        this.f90077p = field16;
        this.f90078q = field17;
        this.f90079r = field18;
        this.f90080s = field19;
        this.f90081t = field20;
        this.f90082u = field21;
        this.f90083v = field22;
        this.f90084w = field23;
        this.f90085x = field24;
        this.f90086y = field25;
        this.f90087z = field26;
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((mo.f) BuiltInParserKt.getBuiltInParserComponent().N6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f90089c = new b(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Expression f90090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Expression f90091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Function2 f90092f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f90093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f90094b;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f90095f = new a();

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
            f90090d = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
            f90091e = Expression.Companion.constant$default(companion, go.c.EnumC1040c.HORIZONTAL, null, 2, null);
            f90092f = a.f90095f;
        }

        public c(Field field, Field field2) {
            this.f90093a = field;
            this.f90094b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((ho.d) BuiltInParserKt.getBuiltInParserComponent().K6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ParsingEnvironment parsingEnvironment, c cVar, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.INSTANCE;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ no(ParsingEnvironment parsingEnvironment, no noVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : noVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public no(ParsingEnvironment parsingEnvironment, no noVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
