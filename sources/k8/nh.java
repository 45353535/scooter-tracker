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
public abstract class nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f90035a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90036b = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90037a;

        public b(my myVar) {
            this.f90037a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public mh deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = nh.f90036b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new mh(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "condition", typeHelper, function1), JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, mh mhVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", mhVar.f88994a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "condition", mhVar.f88995b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", mhVar.f88996c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", mhVar.f88997d);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90038a;

        public c(my myVar) {
            this.f90038a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public oh deserialize(ParsingContext parsingContext, oh ohVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = ohVar != null ? ohVar.f90209a : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new oh(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "allow_empty", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "condition", typeHelper, allowPropertyOverride, ohVar != null ? ohVar.f90210b : null, function1), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, ohVar != null ? ohVar.f90211c : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, ohVar != null ? ohVar.f90212d : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, oh ohVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", ohVar.f90209a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "condition", ohVar.f90210b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", ohVar.f90211c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", ohVar.f90212d);
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
        private final my f90039a;

        public d(my myVar) {
            this.f90039a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public mh resolve(ParsingContext parsingContext, oh ohVar, JSONObject jSONObject) {
            Field field = ohVar.f90209a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = nh.f90036b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            return new mh(expressionResolveOptionalExpression, JsonFieldResolver.resolveExpression(parsingContext, ohVar.f90210b, jSONObject, "condition", typeHelper, function1), JsonFieldResolver.resolveExpression(parsingContext, ohVar.f90211c, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, ohVar.f90212d, jSONObject, "variable"));
        }
    }
}
