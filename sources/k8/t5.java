package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f91239a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ValueValidator f91240b = new ValueValidator() { // from class: k8.s5
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return t5.b((String) obj);
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
        private final my f91241a;

        public b(my myVar) {
            this.f91241a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r5 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new r5(JsonExpressionParser.readExpression(parsingContext, jSONObject, "path", typeHelper, t5.f91240b), (fw) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f91241a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", typeHelper));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, r5 r5Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "path", r5Var.f90631a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "update_structure");
            JsonPropertyParser.write(parsingContext, jSONObject, "value", r5Var.f90632b, this.f91241a.h9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", r5Var.f90633c);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f91242a;

        public c(my myVar) {
            this.f91242a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u5 deserialize(ParsingContext parsingContext, u5 u5Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new u5(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "path", typeHelper, allowPropertyOverride, u5Var != null ? u5Var.f91561a : null, t5.f91240b), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, u5Var != null ? u5Var.f91562b : null, this.f91242a.i9()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, u5Var != null ? u5Var.f91563c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, u5 u5Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "path", u5Var.f91561a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "update_structure");
            JsonFieldParser.writeField(parsingContext, jSONObject, "value", u5Var.f91562b, this.f91242a.i9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", u5Var.f91563c);
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
        private final my f91243a;

        public d(my myVar) {
            this.f91243a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r5 resolve(ParsingContext parsingContext, u5 u5Var, JSONObject jSONObject) {
            Field field = u5Var.f91561a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new r5(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "path", typeHelper, t5.f91240b), (fw) JsonFieldResolver.resolve(parsingContext, u5Var.f91562b, jSONObject, "value", this.f91243a.j9(), this.f91243a.h9()), JsonFieldResolver.resolveExpression(parsingContext, u5Var.f91563c, jSONObject, "variable_name", typeHelper));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String str) {
        return ParsingValidatorsKt.doesMatch(str, "^(?!/)(.+)(?<!/)$");
    }
}
