package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.n9;
import k8.s8;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class t8 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f91254l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f91255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f91256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final n9.c f91257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Expression f91258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Function2 f91259q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f91264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f91265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f91266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field f91267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field f91268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f91269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field f91270k;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91271f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t8 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new t8(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f91255m = Expression.Companion.constant$default(companion, b6.NORMAL, null, 2, null);
        f91256n = Expression.Companion.constant$default(companion, c6.LINEAR, null, 2, null);
        f91257o = new n9.c(new mc(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f91258p = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f91259q = a.f91271f;
    }

    public t8(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11) {
        this.f91260a = field;
        this.f91261b = field2;
        this.f91262c = field3;
        this.f91263d = field4;
        this.f91264e = field5;
        this.f91265f = field6;
        this.f91266g = field7;
        this.f91267h = field8;
        this.f91268i = field9;
        this.f91269j = field10;
        this.f91270k = field11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((s8.e) BuiltInParserKt.getBuiltInParserComponent().k2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ t8(ParsingEnvironment parsingEnvironment, t8 t8Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : t8Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t8(ParsingEnvironment parsingEnvironment, t8 t8Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
