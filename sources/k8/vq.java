package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.a6;
import k8.ep;
import k8.rq;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class vq implements JSONSerializable, JsonTemplate {
    public static final b W = new b(null);
    private static final a6 X;
    private static final Expression Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f91970a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final ep.e f91971b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f91972c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Expression f91973d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final ep.d f91974e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Function2 f91975f0;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f91980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f91981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f91982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f91983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f91984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f91985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f91986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f91987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f91988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f91989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f91990o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f91991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f91992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f91993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f91994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f91995t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f91996u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f91997v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f91998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f91999x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f92000y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f92001z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92002f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vq invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new vq(parsingEnvironment, null, false, jSONObject, 6, null);
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
        X = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        Y = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        Z = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f91970a0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression expression = null;
        f91971b0 = new ep.e(new nx(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        f91972c0 = Expression.Companion.constant$default(companion, zv.STATE_CHANGE, null, 2, null);
        f91973d0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f91974e0 = new ep.d(new ni(null, null, expression, 7, 0 == true ? 1 : 0));
        f91975f0 = a.f92002f;
    }

    public vq(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47, Field field48) {
        this.f91976a = field;
        this.f91977b = field2;
        this.f91978c = field3;
        this.f91979d = field4;
        this.f91980e = field5;
        this.f91981f = field6;
        this.f91982g = field7;
        this.f91983h = field8;
        this.f91984i = field9;
        this.f91985j = field10;
        this.f91986k = field11;
        this.f91987l = field12;
        this.f91988m = field13;
        this.f91989n = field14;
        this.f91990o = field15;
        this.f91991p = field16;
        this.f91992q = field17;
        this.f91993r = field18;
        this.f91994s = field19;
        this.f91995t = field20;
        this.f91996u = field21;
        this.f91997v = field22;
        this.f91998w = field23;
        this.f91999x = field24;
        this.f92000y = field25;
        this.f92001z = field26;
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rq.g) BuiltInParserKt.getBuiltInParserComponent().u7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f92003f = new b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Function2 f92004g = a.f92010f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f92005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f92006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field f92007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Field f92008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Field f92009e;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f92010f = new a();

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

        public c(Field field, Field field2, Field field3, Field field4, Field field5) {
            this.f92005a = field;
            this.f92006b = field2;
            this.f92007c = field3;
            this.f92008d = field4;
            this.f92009e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((tq) BuiltInParserKt.getBuiltInParserComponent().x7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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

    public /* synthetic */ vq(ParsingEnvironment parsingEnvironment, vq vqVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : vqVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vq(ParsingEnvironment parsingEnvironment, vq vqVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
