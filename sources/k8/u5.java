package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.t5;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u5 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f91559d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f91560e = a.f91564f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91563c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91564f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u5 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new u5(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public u5(Field field, Field field2, Field field3) {
        this.f91561a = field;
        this.f91562b = field2;
        this.f91563c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((t5.c) BuiltInParserKt.getBuiltInParserComponent().l1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ u5(ParsingEnvironment parsingEnvironment, u5 u5Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : u5Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u5(ParsingEnvironment parsingEnvironment, u5 u5Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
