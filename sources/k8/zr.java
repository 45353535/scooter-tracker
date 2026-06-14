package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ep;
import k8.yr;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class zr implements JSONSerializable, JsonTemplate {
    public static final b J = new b(null);
    private static final Expression K;
    private static final ep.e L;
    private static final Expression M;
    private static final Expression N;
    private static final ep.d O;
    private static final Function2 P;
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
    public final Field f92972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f92973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f92974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f92975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f92976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f92977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f92978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f92979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f92980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f92981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f92982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Field f92983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Field f92984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Field f92985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Field f92986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Field f92987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f92988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Field f92989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Field f92990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Field f92991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Field f92992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Field f92993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Field f92994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Field f92995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Field f92996y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Field f92997z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92998f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zr invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new zr(parsingEnvironment, null, false, jSONObject, 6, null);
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
        M = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        N = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        O = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        P = a.f92998f;
    }

    public zr(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35) {
        this.f92972a = field;
        this.f92973b = field2;
        this.f92974c = field3;
        this.f92975d = field4;
        this.f92976e = field5;
        this.f92977f = field6;
        this.f92978g = field7;
        this.f92979h = field8;
        this.f92980i = field9;
        this.f92981j = field10;
        this.f92982k = field11;
        this.f92983l = field12;
        this.f92984m = field13;
        this.f92985n = field14;
        this.f92986o = field15;
        this.f92987p = field16;
        this.f92988q = field17;
        this.f92989r = field18;
        this.f92990s = field19;
        this.f92991t = field20;
        this.f92992u = field21;
        this.f92993v = field22;
        this.f92994w = field23;
        this.f92995x = field24;
        this.f92996y = field25;
        this.f92997z = field26;
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
        return ((yr.f) BuiltInParserKt.getBuiltInParserComponent().P7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ zr(ParsingEnvironment parsingEnvironment, zr zrVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : zrVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zr(ParsingEnvironment parsingEnvironment, zr zrVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
