package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ep;
import k8.jk;
import k8.pk;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class vk implements JSONSerializable, JsonTemplate {
    public static final b R = new b(null);
    private static final Expression S;
    private static final Expression T;
    private static final Expression U;
    private static final ep.e V;
    private static final Expression W;
    private static final xc X;
    private static final Expression Y;
    private static final Expression Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Expression f91936a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Expression f91937b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final ep.d f91938c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Function2 f91939d0;
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
    public final Field f91940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f91944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f91945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f91946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f91947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f91948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f91949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f91950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f91951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f91952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f91953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f91954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f91955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f91956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f91957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f91958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f91959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f91960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f91961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f91962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f91963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f91964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f91965z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91966f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vk invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new vk(parsingEnvironment, null, false, jSONObject, 6, null);
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
        T = Expression.Companion.constant$default(companion, jk.c.START, null, 2, null);
        U = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        V = new ep.e(new nx(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        W = Expression.Companion.constant$default(companion, bool, null, 2, null);
        X = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, 0 == true ? 1 : 0);
        Y = Expression.Companion.constant$default(companion, jk.d.HORIZONTAL, null, 2, null);
        Z = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f91936a0 = Expression.Companion.constant$default(companion, jk.c.CENTER, null, 2, null);
        f91937b0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        f91938c0 = new ep.d(new ni(null, null, null, 7, null));
        f91939d0 = a.f91966f;
    }

    public vk(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43) {
        this.f91940a = field;
        this.f91941b = field2;
        this.f91942c = field3;
        this.f91943d = field4;
        this.f91944e = field5;
        this.f91945f = field6;
        this.f91946g = field7;
        this.f91947h = field8;
        this.f91948i = field9;
        this.f91949j = field10;
        this.f91950k = field11;
        this.f91951l = field12;
        this.f91952m = field13;
        this.f91953n = field14;
        this.f91954o = field15;
        this.f91955p = field16;
        this.f91956q = field17;
        this.f91957r = field18;
        this.f91958s = field19;
        this.f91959t = field20;
        this.f91960u = field21;
        this.f91961v = field22;
        this.f91962w = field23;
        this.f91963x = field24;
        this.f91964y = field25;
        this.f91965z = field26;
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
        return ((pk.i) BuiltInParserKt.getBuiltInParserComponent().A5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ vk(ParsingEnvironment parsingEnvironment, vk vkVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : vkVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vk(ParsingEnvironment parsingEnvironment, vk vkVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
