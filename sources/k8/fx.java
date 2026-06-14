package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ep;
import k8.vw;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class fx implements JSONSerializable, JsonTemplate {
    public static final b V = new b(null);
    private static final Expression W;
    private static final Expression X;
    private static final ep.e Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f87644a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f87645b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Expression f87646c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Expression f87647d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final ep.d f87648e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Function2 f87649f0;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f87650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f87651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f87652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f87653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f87654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f87655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f87656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f87657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f87658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f87659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f87660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f87661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f87662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f87663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f87664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f87665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f87666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f87667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f87668s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f87669t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f87670u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f87671v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f87672w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f87673x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f87674y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f87675z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87676f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fx invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new fx(parsingEnvironment, null, false, jSONObject, 6, null);
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
        W = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        X = Expression.Companion.constant$default(companion, bool, null, 2, null);
        Y = new ep.e(new nx(null, null, null, 7, null));
        Z = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f87644a0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f87645b0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f87646c0 = Expression.Companion.constant$default(companion, ww.FIT, null, 2, null);
        f87647d0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f87648e0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        f87649f0 = a.f87676f;
    }

    public fx(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47) {
        this.f87650a = field;
        this.f87651b = field2;
        this.f87652c = field3;
        this.f87653d = field4;
        this.f87654e = field5;
        this.f87655f = field6;
        this.f87656g = field7;
        this.f87657h = field8;
        this.f87658i = field9;
        this.f87659j = field10;
        this.f87660k = field11;
        this.f87661l = field12;
        this.f87662m = field13;
        this.f87663n = field14;
        this.f87664o = field15;
        this.f87665p = field16;
        this.f87666q = field17;
        this.f87667r = field18;
        this.f87668s = field19;
        this.f87669t = field20;
        this.f87670u = field21;
        this.f87671v = field22;
        this.f87672w = field23;
        this.f87673x = field24;
        this.f87674y = field25;
        this.f87675z = field26;
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((vw.g) BuiltInParserKt.getBuiltInParserComponent().o9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ fx(ParsingEnvironment parsingEnvironment, fx fxVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : fxVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fx(ParsingEnvironment parsingEnvironment, fx fxVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
