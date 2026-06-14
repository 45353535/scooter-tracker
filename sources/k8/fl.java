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
public abstract class fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f87543a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ValueValidator f87544b = new ValueValidator() { // from class: k8.el
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return fl.b(((Double) obj).doubleValue());
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
        private final my f87545a;

        public b(my myVar) {
            this.f87545a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public dl deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new dl(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, fl.f87544b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, dl dlVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", dlVar.f87052a);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87546a;

        public c(my myVar) {
            this.f87546a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public gl deserialize(ParsingContext parsingContext, gl glVar, JSONObject jSONObject) {
            return new gl(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), glVar != null ? glVar.f87832a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, fl.f87544b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, gl glVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", glVar.f87832a);
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
        private final my f87547a;

        public d(my myVar) {
            this.f87547a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public dl resolve(ParsingContext parsingContext, gl glVar, JSONObject jSONObject) {
            return new dl(JsonFieldResolver.resolveExpression(parsingContext, glVar.f87832a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, fl.f87544b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(double d10) {
        return d10 > 0.0d;
    }
}
