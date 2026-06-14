package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ac;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bc implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f86492e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f86493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f86494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f86495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f86496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Function2 f86497j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f86498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f86499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f86500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f86501d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86502f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bc invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new bc(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f86493f = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f86494g = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f86495h = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        f86496i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f86497j = a.f86502f;
    }

    public bc(Field field, Field field2, Field field3, Field field4) {
        this.f86498a = field;
        this.f86499b = field2;
        this.f86500c = field3;
        this.f86501d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ac.d) BuiltInParserKt.getBuiltInParserComponent().f3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ bc(ParsingEnvironment parsingEnvironment, bc bcVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : bcVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bc(ParsingEnvironment parsingEnvironment, bc bcVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
