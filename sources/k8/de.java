package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ce;
import k8.ep;
import k8.td;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class de implements JSONSerializable, JsonTemplate {
    public static final b R = new b(null);
    private static final Expression S;
    private static final Expression T;
    private static final Expression U;
    private static final ep.e V;
    private static final Expression W;
    private static final Expression X;
    private static final Expression Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f86996a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f86997b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final ep.d f86998c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Function2 f86999d0;
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
    public final Field f87000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f87003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f87004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f87005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f87006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f87007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f87008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f87009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f87010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f87011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f87012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f87013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f87014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f87015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f87016q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f87017r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f87018s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f87019t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f87020u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f87021v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f87022w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f87023x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f87024y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f87025z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87026f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final de invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new de(parsingEnvironment, null, false, jSONObject, 6, null);
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
        S = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        T = Expression.Companion.constant$default(companion, td.c.START, null, 2, null);
        U = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        V = new ep.e(new nx(null, null, null, 7, null));
        W = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        X = Expression.Companion.constant$default(companion, td.d.HORIZONTAL, null, 2, null);
        Y = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Z = Expression.Companion.constant$default(companion, td.e.DEFAULT, null, 2, null);
        f86996a0 = Expression.Companion.constant$default(companion, td.f.NONE, null, 2, null);
        f86997b0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f86998c0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f86999d0 = a.f87026f;
    }

    public de(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43) {
        this.f87000a = field;
        this.f87001b = field2;
        this.f87002c = field3;
        this.f87003d = field4;
        this.f87004e = field5;
        this.f87005f = field6;
        this.f87006g = field7;
        this.f87007h = field8;
        this.f87008i = field9;
        this.f87009j = field10;
        this.f87010k = field11;
        this.f87011l = field12;
        this.f87012m = field13;
        this.f87013n = field14;
        this.f87014o = field15;
        this.f87015p = field16;
        this.f87016q = field17;
        this.f87017r = field18;
        this.f87018s = field19;
        this.f87019t = field20;
        this.f87020u = field21;
        this.f87021v = field22;
        this.f87022w = field23;
        this.f87023x = field24;
        this.f87024y = field25;
        this.f87025z = field26;
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
        return ((ce.j) BuiltInParserKt.getBuiltInParserComponent().M3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ de(ParsingEnvironment parsingEnvironment, de deVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : deVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public de(ParsingEnvironment parsingEnvironment, de deVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
