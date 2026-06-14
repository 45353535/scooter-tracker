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
public final class r3 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f90624b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f90625c = a.f90627f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90626a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90627f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r3 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new r3(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public r3(Field field) {
        this.f90626a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((p3) BuiltInParserKt.getBuiltInParserComponent().s0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ r3(ParsingEnvironment parsingEnvironment, r3 r3Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : r3Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public r3(ParsingEnvironment parsingEnvironment, r3 r3Var, boolean z10, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
