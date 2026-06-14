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
public abstract class ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f90791a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ValueValidator f90795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ValueValidator f90796f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90797a;

        public b(my myVar) {
            this.f90797a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public oo deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ro.f90795e;
            Expression expression = ro.f90792b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = ro.f90796f;
            Expression expression2 = ro.f90793c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "blur", typeHelper2, function12, valueValidator2, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression3 = ro.f90794d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", typeHelper3, function13, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            return new oo(expression, expression2, expression3, (zl) JsonPropertyParser.read(parsingContext, jSONObject, "offset", this.f90797a.Z5()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, oo ooVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", ooVar.f90233a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "blur", ooVar.f90234b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", ooVar.f90235c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "offset", ooVar.f90236d, this.f90797a.Z5());
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90798a;

        public c(my myVar) {
            this.f90798a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public so deserialize(ParsingContext parsingContext, so soVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new so(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, soVar != null ? soVar.f91082a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, ro.f90795e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "blur", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, soVar != null ? soVar.f91083b : null, ParsingConvertersKt.NUMBER_TO_INT, ro.f90796f), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, soVar != null ? soVar.f91084c : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "offset", allowPropertyOverride, soVar != null ? soVar.f91085d : null, this.f90798a.a6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, so soVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", soVar.f91082a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "blur", soVar.f91083b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", soVar.f91084c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "offset", soVar.f91085d, this.f90798a.a6());
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
        private final my f90799a;

        public d(my myVar) {
            this.f90799a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public oo resolve(ParsingContext parsingContext, so soVar, JSONObject jSONObject) {
            Field field = soVar.f91082a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ro.f90795e;
            Expression expression = ro.f90792b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field field2 = soVar.f91083b;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = ro.f90796f;
            Expression expression2 = ro.f90793c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "blur", typeHelper2, function12, valueValidator2, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field field3 = soVar.f91084c;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression3 = ro.f90794d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "color", typeHelper3, function13, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            return new oo(expression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, (zl) JsonFieldResolver.resolve(parsingContext, soVar.f91085d, jSONObject, "offset", this.f90799a.b6(), this.f90799a.Z5()));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90792b = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        f90793c = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        f90794d = Expression.Companion.constant$default(companion, 0, null, 2, null);
        f90795e = new ValueValidator() { // from class: k8.po
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ro.c(((Double) obj).doubleValue());
            }
        };
        f90796f = new ValueValidator() { // from class: k8.qo
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ro.d(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j10) {
        return j10 >= 0;
    }
}
