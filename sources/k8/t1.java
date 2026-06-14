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
public final class t1 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f91224b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f91225c = a.f91227f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91226a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91227f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t1 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new t1(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public t1(Field field) {
        this.f91226a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((r1) BuiltInParserKt.getBuiltInParserComponent().O().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ t1(ParsingEnvironment parsingEnvironment, t1 t1Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : t1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public t1(ParsingEnvironment parsingEnvironment, t1 t1Var, boolean z10, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
