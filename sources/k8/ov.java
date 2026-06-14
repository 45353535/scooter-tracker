package k8;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ov implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f90265a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f90266b = a.f90267f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90267f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ov invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new ov(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public ov() {
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((mv) BuiltInParserKt.getBuiltInParserComponent().W8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ ov(ParsingEnvironment parsingEnvironment, ov ovVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : ovVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    public ov(ParsingEnvironment parsingEnvironment, ov ovVar, boolean z10, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
