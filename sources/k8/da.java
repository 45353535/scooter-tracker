package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ca;
import k8.ep;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class da implements JSONSerializable, JsonTemplate {
    public static final b J = new b(null);
    private static final Expression K;
    private static final ep.e L;
    private static final Expression M;
    private static final ep.d N;
    private static final Function2 O;
    public final Field A;
    public final Field B;
    public final Field C;
    public final Field D;
    public final Field E;
    public final Field F;
    public final Field G;
    public final Field H;
    public final Field I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f86966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f86967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f86968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f86969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f86970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f86971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f86972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f86973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f86974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f86975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f86976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f86977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f86978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f86979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f86980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f86981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f86982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f86983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f86984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f86985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f86986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f86987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f86988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f86989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f86990y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f86991z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86992f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final da invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new da(parsingEnvironment, null, false, jSONObject, 6, null);
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
        K = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        L = new ep.e(new nx(null, null, null, 7, null));
        M = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        N = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        O = a.f86992f;
    }

    public da(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35) {
        this.f86966a = field;
        this.f86967b = field2;
        this.f86968c = field3;
        this.f86969d = field4;
        this.f86970e = field5;
        this.f86971f = field6;
        this.f86972g = field7;
        this.f86973h = field8;
        this.f86974i = field9;
        this.f86975j = field10;
        this.f86976k = field11;
        this.f86977l = field12;
        this.f86978m = field13;
        this.f86979n = field14;
        this.f86980o = field15;
        this.f86981p = field16;
        this.f86982q = field17;
        this.f86983r = field18;
        this.f86984s = field19;
        this.f86985t = field20;
        this.f86986u = field21;
        this.f86987v = field22;
        this.f86988w = field23;
        this.f86989x = field24;
        this.f86990y = field25;
        this.f86991z = field26;
        this.A = field27;
        this.B = field28;
        this.C = field29;
        this.D = field30;
        this.E = field31;
        this.F = field32;
        this.G = field33;
        this.H = field34;
        this.I = field35;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ca.f) BuiltInParserKt.getBuiltInParserComponent().C2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ da(ParsingEnvironment parsingEnvironment, da daVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : daVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public da(ParsingEnvironment parsingEnvironment, da daVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
