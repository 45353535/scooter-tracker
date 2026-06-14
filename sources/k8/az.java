package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.zy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class az implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f86427b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f86428c = a.f86430f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f86429a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86430f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final az invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new az(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public az(Field field) {
        this.f86429a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((zy.c) BuiltInParserKt.getBuiltInParserComponent().V9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ az(ParsingEnvironment parsingEnvironment, az azVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : azVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public az(ParsingEnvironment parsingEnvironment, az azVar, boolean z10, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
