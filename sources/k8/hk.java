package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.gk;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hk implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f88075f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f88076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f88077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f88078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f88079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f88080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Function2 f88081l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f88082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f88083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f88084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f88085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f88086e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88087f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hk invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new hk(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f88076g = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f88077h = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f88078i = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f88079j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f88080k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f88081l = a.f88087f;
    }

    public hk(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f88082a = field;
        this.f88083b = field2;
        this.f88084c = field3;
        this.f88085d = field4;
        this.f88086e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((gk.d) BuiltInParserKt.getBuiltInParserComponent().x5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ hk(ParsingEnvironment parsingEnvironment, hk hkVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : hkVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hk(ParsingEnvironment parsingEnvironment, hk hkVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
