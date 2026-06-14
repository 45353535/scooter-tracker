package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
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
public abstract class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f87422a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87423b = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87424a;

        public b(my myVar) {
            this.f87424a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e4 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = f4.f87423b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animated", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new e4(expression, (z3) JsonPropertyParser.read(parsingContext, jSONObject, FirebaseAnalytics.Param.DESTINATION, this.f87424a.D0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, e4 e4Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animated", e4Var.f87166a);
            JsonPropertyParser.write(parsingContext, jSONObject, FirebaseAnalytics.Param.DESTINATION, e4Var.f87167b, this.f87424a.D0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", e4Var.f87168c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87425a;

        public c(my myVar) {
            this.f87425a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g4 deserialize(ParsingContext parsingContext, g4 g4Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new g4(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, g4Var != null ? g4Var.f87732a : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.DESTINATION, allowPropertyOverride, g4Var != null ? g4Var.f87733b : null, this.f87425a.E0()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, g4Var != null ? g4Var.f87734c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, g4 g4Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animated", g4Var.f87732a);
            JsonFieldParser.writeField(parsingContext, jSONObject, FirebaseAnalytics.Param.DESTINATION, g4Var.f87733b, this.f87425a.E0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", g4Var.f87734c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_to");
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
        private final my f87426a;

        public d(my myVar) {
            this.f87426a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e4 resolve(ParsingContext parsingContext, g4 g4Var, JSONObject jSONObject) {
            Field field = g4Var.f87732a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = f4.f87423b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "animated", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new e4(expression, (z3) JsonFieldResolver.resolve(parsingContext, g4Var.f87733b, jSONObject, FirebaseAnalytics.Param.DESTINATION, this.f87426a.F0(), this.f87426a.D0()), JsonFieldResolver.resolveExpression(parsingContext, g4Var.f87734c, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }
}
