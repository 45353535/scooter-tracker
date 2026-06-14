package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class yo implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92754d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f92755e = a.f92759f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f92756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f92757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f92758c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92759f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yo invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new yo(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public yo(Field field, Field field2, Field field3) {
        this.f92756a = field;
        this.f92757b = field2;
        this.f92758c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((wo) BuiltInParserKt.getBuiltInParserComponent().T6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ yo(ParsingEnvironment parsingEnvironment, yo yoVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : yoVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yo(ParsingEnvironment parsingEnvironment, yo yoVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
