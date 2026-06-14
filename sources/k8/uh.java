package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.th;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class uh implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f91668e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f91669f = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f91670g = a.f91675f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91674d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91675f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uh invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new uh(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public uh(Field field, Field field2, Field field3, Field field4) {
        this.f91671a = field;
        this.f91672b = field2;
        this.f91673c = field3;
        this.f91674d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((th.c) BuiltInParserKt.getBuiltInParserComponent().K4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ uh(ParsingEnvironment parsingEnvironment, uh uhVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : uhVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uh(ParsingEnvironment parsingEnvironment, uh uhVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
