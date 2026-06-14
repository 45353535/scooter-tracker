package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88976a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xc f88977b = new xc(null, Expression.Companion.constant$default(Expression.INSTANCE, 15L, null, 2, null), 1, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88978a;

        public b(my myVar) {
            this.f88978a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public la deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            xc xcVar = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", this.f88978a.w3());
            if (xcVar == null) {
                xcVar = ma.f88977b;
            }
            return new la(xcVar);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, la laVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "space_between_centers", laVar.f88773a, this.f88978a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "default");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88979a;

        public c(my myVar) {
            this.f88979a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public na deserialize(ParsingContext parsingContext, na naVar, JSONObject jSONObject) {
            return new na(JsonFieldParser.readOptionalField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "space_between_centers", parsingContext.getAllowPropertyOverride(), naVar != null ? naVar.f90027a : null, this.f88979a.x3()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, na naVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "space_between_centers", naVar.f90027a, this.f88979a.x3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "default");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer, com.yandex.div.serialization.Deserializer
        public /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, Object obj) {
            return h8.b.a(this, parsingContext, obj);
        }

        @Override // com.yandex.div.serialization.Deserializer
        public /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return deserialize(parsingContext, obj);
        }
    }

    public static final class d implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88980a;

        public d(my myVar) {
            this.f88980a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public la resolve(ParsingContext parsingContext, na naVar, JSONObject jSONObject) {
            xc xcVar = (xc) JsonFieldResolver.resolveOptional(parsingContext, naVar.f90027a, jSONObject, "space_between_centers", this.f88980a.y3(), this.f88980a.w3());
            if (xcVar == null) {
                xcVar = ma.f88977b;
            }
            return new la(xcVar);
        }
    }
}
