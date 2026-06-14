package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
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
public abstract class bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f86575a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f86576b = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ValueValidator f86577c = new ValueValidator() { // from class: k8.zu
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return bv.c(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ValueValidator f86578d = new ValueValidator() { // from class: k8.av
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return bv.d(((Long) obj).longValue());
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
        private final my f86579a;

        public b(my myVar) {
            this.f86579a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public yu deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = bv.f86577c;
            Expression expression = bv.f86576b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, function1, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new yu(expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f86579a.u0()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tick_actions", this.f86579a.u0()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tick_interval", typeHelper, function1, bv.f86578d), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "value_variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, yu yuVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", yuVar.f92811a);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", yuVar.f92812b, this.f86579a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", yuVar.f92813c);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tick_actions", yuVar.f92814d, this.f86579a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tick_interval", yuVar.f92815e);
            JsonPropertyParser.write(parsingContext, jSONObject, "value_variable", yuVar.f92816f);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86580a;

        public c(my myVar) {
            this.f86580a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cv deserialize(ParsingContext parsingContext, cv cvVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = cvVar != null ? cvVar.f86849a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new cv(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, function1, bv.f86577c), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, cvVar != null ? cvVar.f86850b : null, this.f86580a.v0()), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, cvVar != null ? cvVar.f86851c : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tick_actions", allowPropertyOverride, cvVar != null ? cvVar.f86852d : null, this.f86580a.v0()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tick_interval", typeHelper, allowPropertyOverride, cvVar != null ? cvVar.f86853e : null, function1, bv.f86578d), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, cvVar != null ? cvVar.f86854f : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, cv cvVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", cvVar.f86849a);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", cvVar.f86850b, this.f86580a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", cvVar.f86851c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tick_actions", cvVar.f86852d, this.f86580a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tick_interval", cvVar.f86853e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "value_variable", cvVar.f86854f);
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
        private final my f86581a;

        public d(my myVar) {
            this.f86581a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public yu resolve(ParsingContext parsingContext, cv cvVar, JSONObject jSONObject) {
            Field field = cvVar.f86849a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = bv.f86577c;
            Expression expression = bv.f86576b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            return new yu(expressionResolveOptionalExpression, JsonFieldResolver.resolveOptionalList(parsingContext, cvVar.f86850b, jSONObject, "end_actions", this.f86581a.w0(), this.f86581a.u0()), (String) JsonFieldResolver.resolve(parsingContext, cvVar.f86851c, jSONObject, "id"), JsonFieldResolver.resolveOptionalList(parsingContext, cvVar.f86852d, jSONObject, "tick_actions", this.f86581a.w0(), this.f86581a.u0()), JsonFieldResolver.resolveOptionalExpression(parsingContext, cvVar.f86853e, jSONObject, "tick_interval", typeHelper, function1, bv.f86578d), (String) JsonFieldResolver.resolveOptional(parsingContext, cvVar.f86854f, jSONObject, "value_variable"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j10) {
        return j10 > 0;
    }
}
