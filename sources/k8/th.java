package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class th {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f91394a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f91395b = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f91396a;

        public b(my myVar) {
            this.f91396a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public sh deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = th.f91395b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new sh(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", typeHelper2), JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", typeHelper2), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, sh shVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", shVar.f91061a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", shVar.f91062b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", shVar.f91063c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", shVar.f91064d);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f91397a;

        public c(my myVar) {
            this.f91397a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public uh deserialize(ParsingContext parsingContext, uh uhVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, uhVar != null ? uhVar.f91671a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new uh(optionalFieldWithExpression, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "label_id", typeHelper, allowPropertyOverride, uhVar != null ? uhVar.f91672b : null), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pattern", typeHelper, allowPropertyOverride, uhVar != null ? uhVar.f91673c : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, uhVar != null ? uhVar.f91674d : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, uh uhVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", uhVar.f91671a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", uhVar.f91672b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", uhVar.f91673c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", uhVar.f91674d);
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
        private final my f91398a;

        public d(my myVar) {
            this.f91398a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public sh resolve(ParsingContext parsingContext, uh uhVar, JSONObject jSONObject) {
            Field field = uhVar.f91671a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = th.f91395b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field field2 = uhVar.f91672b;
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new sh(expression, JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "label_id", typeHelper2), JsonFieldResolver.resolveExpression(parsingContext, uhVar.f91673c, jSONObject, "pattern", typeHelper2), (String) JsonFieldResolver.resolve(parsingContext, uhVar.f91674d, jSONObject, "variable"));
        }
    }
}
