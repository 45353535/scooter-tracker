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
public abstract class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88192a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f88193b = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88194a;

        public b(my myVar) {
            this.f88194a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h4 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "state_id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = i4.f88193b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "temporary", typeHelper, function1, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            return new h4(expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, h4 h4Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "state_id", h4Var.f87958a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "temporary", h4Var.f87959b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_state");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88195a;

        public c(my myVar) {
            this.f88195a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j4 deserialize(ParsingContext parsingContext, j4 j4Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new j4(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "state_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, j4Var != null ? j4Var.f88342a : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "temporary", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, j4Var != null ? j4Var.f88343b : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, j4 j4Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "state_id", j4Var.f88342a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "temporary", j4Var.f88343b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_state");
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
        private final my f88196a;

        public d(my myVar) {
            this.f88196a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h4 resolve(ParsingContext parsingContext, j4 j4Var, JSONObject jSONObject) {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, j4Var.f88342a, jSONObject, "state_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field = j4Var.f88343b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = i4.f88193b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "temporary", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new h4(expressionResolveExpression, expression);
        }
    }
}
