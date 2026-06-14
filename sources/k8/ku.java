package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
public abstract class ku {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88713a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f88714b = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88715a;

        public b(my myVar) {
            this.f88715a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ju deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = ku.f88714b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new ju(expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ju juVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", juVar.f88520a);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88716a;

        public c(my myVar) {
            this.f88716a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public lu deserialize(ParsingContext parsingContext, lu luVar, JSONObject jSONObject) {
            return new lu(JsonFieldParser.readOptionalFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, parsingContext.getAllowPropertyOverride(), luVar != null ? luVar.f88904a : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, lu luVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", luVar.f88904a);
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
        private final my f88717a;

        public d(my myVar) {
            this.f88717a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ju resolve(ParsingContext parsingContext, lu luVar, JSONObject jSONObject) {
            Field field = luVar.f88904a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = ku.f88714b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new ju(expression);
        }
    }
}
