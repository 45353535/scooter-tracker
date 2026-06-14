package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class zy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f93027a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ValueValidator f93028b = new ValueValidator() { // from class: k8.yy
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return zy.b(((Long) obj).longValue());
        }
    };

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f93029a;

        public b(my myVar) {
            this.f93029a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xy deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new xy(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, zy.f93028b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, xy xyVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "offset");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", xyVar.f92558a);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f93030a;

        public c(my myVar) {
            this.f93030a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public az deserialize(ParsingContext parsingContext, az azVar, JSONObject jSONObject) {
            return new az(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), azVar != null ? azVar.f86429a : null, ParsingConvertersKt.NUMBER_TO_INT, zy.f93028b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, az azVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "offset");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", azVar.f86429a);
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
        private final my f93031a;

        public d(my myVar) {
            this.f93031a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xy resolve(ParsingContext parsingContext, az azVar, JSONObject jSONObject) {
            return new xy(JsonFieldResolver.resolveExpression(parsingContext, azVar.f86429a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, zy.f93028b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
