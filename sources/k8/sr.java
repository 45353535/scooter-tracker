package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.cr;
import k8.dr;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sr implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f91100e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dr.d f91101f = new dr.d(new mr());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f91102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f91103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Function2 f91104i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91108d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91109f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sr invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new sr(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f91102g = Expression.Companion.constant$default(companion, jp.DP, null, 2, null);
        f91103h = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f91104i = a.f91109f;
    }

    public sr(Field field, Field field2, Field field3, Field field4) {
        this.f91105a = field;
        this.f91106b = field2;
        this.f91107c = field3;
        this.f91108d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((cr.d) BuiltInParserKt.getBuiltInParserComponent().D7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ sr(ParsingEnvironment parsingEnvironment, sr srVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : srVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sr(ParsingEnvironment parsingEnvironment, sr srVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
