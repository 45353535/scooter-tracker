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
public abstract class ru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f90913a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xc f90917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ValueValidator f90918f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90919a;

        public b(my myVar) {
            this.f90919a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public pu deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ru.f90918f;
            Expression expression2 = ru.f90914b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "density", typeHelper, function1, valueValidator, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = ru.f90915c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_animated", typeHelper2, function12, expression3);
            if (optionalExpression2 == null) {
                optionalExpression2 = expression3;
            }
            Expression expression4 = ru.f90916d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper2, function12, expression4);
            Expression expression5 = optionalExpression3 == null ? expression4 : optionalExpression3;
            xc xcVar = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "particle_size", this.f90919a.w3());
            if (xcVar == null) {
                xcVar = ru.f90917e;
            }
            return new pu(expression, expression2, optionalExpression2, expression5, xcVar);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, pu puVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", puVar.f90450a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "density", puVar.f90451b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_animated", puVar.f90452c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", puVar.f90453d);
            JsonPropertyParser.write(parsingContext, jSONObject, "particle_size", puVar.f90454e, this.f90919a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90920a;

        public c(my myVar) {
            this.f90920a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public su deserialize(ParsingContext parsingContext, su suVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, suVar != null ? suVar.f91195a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "density", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, suVar != null ? suVar.f91196b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, ru.f90918f);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = suVar != null ? suVar.f91197c : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new su(fieldWithExpression, optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_animated", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", typeHelper, allowPropertyOverride, suVar != null ? suVar.f91198d : null, function1), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "particle_size", allowPropertyOverride, suVar != null ? suVar.f91199e : null, this.f90920a.x3()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, su suVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", suVar.f91195a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "density", suVar.f91196b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_animated", suVar.f91197c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", suVar.f91198d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "particle_size", suVar.f91199e, this.f90920a.x3());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "particles");
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
        private final my f90921a;

        public d(my myVar) {
            this.f90921a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public pu resolve(ParsingContext parsingContext, su suVar, JSONObject jSONObject) {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, suVar.f91195a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field field = suVar.f91196b;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ru.f90918f;
            Expression expression = ru.f90914b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "density", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field field2 = suVar.f91197c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = ru.f90915c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "is_animated", typeHelper2, function12, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field field3 = suVar.f91198d;
            Expression expression3 = ru.f90916d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper2, function12, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            xc xcVar = (xc) JsonFieldResolver.resolveOptional(parsingContext, suVar.f91199e, jSONObject, "particle_size", this.f90921a.y3(), this.f90921a.w3());
            if (xcVar == null) {
                xcVar = ru.f90917e;
            }
            return new pu(expressionResolveExpression, expression, expressionResolveOptionalExpression2, expression3, xcVar);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90914b = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        f90915c = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f90916d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f90917e = new xc(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        f90918f = new ValueValidator() { // from class: k8.qu
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ru.b(((Double) obj).doubleValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(double d10) {
        return d10 > 0.0d && d10 <= 1.0d;
    }
}
