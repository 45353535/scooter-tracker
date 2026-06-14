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
public abstract class kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88664a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f88665b = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88666a;

        public b(my myVar) {
            this.f88666a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public jh deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = kh.f88665b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new jh(expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, jh jhVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", jhVar.f88425a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", jhVar.f88426b);
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", jhVar.f88427c);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88667a;

        public c(my myVar) {
            this.f88667a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public lh deserialize(ParsingContext parsingContext, lh lhVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new lh(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, lhVar != null ? lhVar.f88824a : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, lhVar != null ? lhVar.f88825b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, lhVar != null ? lhVar.f88826c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, lh lhVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", lhVar.f88824a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", lhVar.f88825b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", lhVar.f88826c);
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
        private final my f88668a;

        public d(my myVar) {
            this.f88668a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public jh resolve(ParsingContext parsingContext, lh lhVar, JSONObject jSONObject) {
            Field field = lhVar.f88824a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = kh.f88665b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new jh(expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, lhVar.f88825b, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolveOptional(parsingContext, lhVar.f88826c, jSONObject, "variable"));
        }
    }
}
