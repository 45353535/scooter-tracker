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
public final class o implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f90119b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f90120c = a.f90122f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f90121a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90122f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new o(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public o(Field field) {
        this.f90121a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((m) BuiltInParserKt.getBuiltInParserComponent().h().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ o(ParsingEnvironment parsingEnvironment, o oVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : oVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public o(ParsingEnvironment parsingEnvironment, o oVar, boolean z10, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
