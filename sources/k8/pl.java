package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ol;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class pl implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f90420c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Expression f90421d = Expression.Companion.constant$default(Expression.INSTANCE, jp.DP, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f90422e = a.f90425f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f90424b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90425f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pl invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new pl(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public pl(Field field, Field field2) {
        this.f90423a = field;
        this.f90424b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ol.d) BuiltInParserKt.getBuiltInParserComponent().R5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ pl(ParsingEnvironment parsingEnvironment, pl plVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : plVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pl(ParsingEnvironment parsingEnvironment, pl plVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
