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
import k8.w3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f92282a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f92283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f92284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f92285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f92286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TypeHelper f92287f;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92288f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof w3.c);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92289a;

        public c(my myVar) {
            this.f92289a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w3 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = x3.f92283b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animated", typeHelper, function1, expression);
            Expression expression2 = optionalExpression == null ? expression : optionalExpression;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression4 = x3.f92284c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_count", typeHelper2, function12, expression4);
            Expression expression5 = optionalExpression2 == null ? expression4 : optionalExpression2;
            Expression expression6 = x3.f92285d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "offset", typeHelper2, function12, expression6);
            Expression expression7 = optionalExpression3 == null ? expression6 : optionalExpression3;
            TypeHelper typeHelper3 = x3.f92287f;
            Function1 function13 = w3.c.f92094e;
            Expression expression8 = x3.f92286e;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "overflow", typeHelper3, function13, expression8);
            return new w3(expression2, expression3, expression5, expression7, optionalExpression4 == null ? expression8 : optionalExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, w3 w3Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animated", w3Var.f92085a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", w3Var.f92086b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_count", w3Var.f92087c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "offset", w3Var.f92088d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "overflow", w3Var.f92089e, w3.c.f92093d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_by");
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92290a;

        public d(my myVar) {
            this.f92290a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3 deserialize(ParsingContext parsingContext, y3 y3Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, y3Var != null ? y3Var.f92607a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, y3Var != null ? y3Var.f92608b : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = y3Var != null ? y3Var.f92609c : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new y3(optionalFieldWithExpression, fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "item_count", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "offset", typeHelper, allowPropertyOverride, y3Var != null ? y3Var.f92610d : null, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "overflow", x3.f92287f, allowPropertyOverride, y3Var != null ? y3Var.f92611e : null, w3.c.f92094e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, y3 y3Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animated", y3Var.f92607a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", y3Var.f92608b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_count", y3Var.f92609c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "offset", y3Var.f92610d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "overflow", y3Var.f92611e, w3.c.f92093d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_by");
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

    public static final class e implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92291a;

        public e(my myVar) {
            this.f92291a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w3 resolve(ParsingContext parsingContext, y3 y3Var, JSONObject jSONObject) {
            Field field = y3Var.f92607a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = x3.f92283b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "animated", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, y3Var.f92608b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field2 = y3Var.f92609c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression2 = x3.f92284c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "item_count", typeHelper2, function12, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field field3 = y3Var.f92610d;
            Expression expression3 = x3.f92285d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "offset", typeHelper2, function12, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            Field field4 = y3Var.f92611e;
            TypeHelper typeHelper3 = x3.f92287f;
            Function1 function13 = w3.c.f92094e;
            Expression expression4 = x3.f92286e;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "overflow", typeHelper3, function13, expression4);
            return new w3(expression, expressionResolveExpression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4 == null ? expression4 : expressionResolveOptionalExpression4);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92283b = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f92284c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92285d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        w3.c cVar = w3.c.CLAMP;
        f92286e = Expression.Companion.constant$default(companion, cVar, null, 2, null);
        f92287f = TypeHelper.INSTANCE.from(cVar, a.f92288f);
    }
}
