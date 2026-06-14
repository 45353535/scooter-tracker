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
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f86227a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f86228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f86229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f86230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f86231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TypeHelper f86232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ValueValidator f86233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f86234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f86235i;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86236f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof c6);
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
        private final my f86237a;

        public c(my myVar) {
            this.f86237a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wb deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ac.f86233g;
            Expression expression = ac.f86228b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = ac.f86234h;
            Expression expression2 = ac.f86229c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper2, function12, valueValidator2, expression2);
            if (optionalExpression2 == null) {
                optionalExpression2 = expression2;
            }
            TypeHelper typeHelper3 = ac.f86232f;
            Function1 function13 = c6.f86615e;
            Expression expression3 = ac.f86230d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, function13, expression3);
            if (optionalExpression3 == null) {
                optionalExpression3 = expression3;
            }
            ValueValidator valueValidator3 = ac.f86235i;
            Expression expression4 = ac.f86231e;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, function12, valueValidator3, expression4);
            if (optionalExpression4 != null) {
                expression4 = optionalExpression4;
            }
            return new wb(expression, optionalExpression2, optionalExpression3, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, wb wbVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", wbVar.f92147a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", wbVar.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", wbVar.c(), c6.f86614d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", wbVar.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fade");
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86238a;

        public d(my myVar) {
            this.f86238a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bc deserialize(ParsingContext parsingContext, bc bcVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, bcVar != null ? bcVar.f86498a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, ac.f86233g);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = bcVar != null ? bcVar.f86499b : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new bc(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, function1, ac.f86234h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", ac.f86232f, allowPropertyOverride, bcVar != null ? bcVar.f86500c : null, c6.f86615e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, bcVar != null ? bcVar.f86501d : null, function1, ac.f86235i));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, bc bcVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", bcVar.f86498a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", bcVar.f86499b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", bcVar.f86500c, c6.f86614d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", bcVar.f86501d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fade");
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
        private final my f86239a;

        public e(my myVar) {
            this.f86239a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wb resolve(ParsingContext parsingContext, bc bcVar, JSONObject jSONObject) {
            Field field = bcVar.f86498a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ac.f86233g;
            Expression expression = ac.f86228b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field field2 = bcVar.f86499b;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = ac.f86234h;
            Expression expression2 = ac.f86229c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, function12, valueValidator2, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field field3 = bcVar.f86500c;
            TypeHelper typeHelper3 = ac.f86232f;
            Function1 function13 = c6.f86615e;
            Expression expression3 = ac.f86230d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, function13, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            Field field4 = bcVar.f86501d;
            ValueValidator valueValidator3 = ac.f86235i;
            Expression expression4 = ac.f86231e;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper2, function12, valueValidator3, expression4);
            if (expressionResolveOptionalExpression4 == null) {
                expressionResolveOptionalExpression4 = expression4;
            }
            return new wb(expression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f86228b = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f86229c = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        c6 c6Var = c6.EASE_IN_OUT;
        f86230d = Expression.Companion.constant$default(companion, c6Var, null, 2, null);
        f86231e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f86232f = TypeHelper.INSTANCE.from(c6Var, a.f86236f);
        f86233g = new ValueValidator() { // from class: k8.xb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ac.d(((Double) obj).doubleValue());
            }
        };
        f86234h = new ValueValidator() { // from class: k8.yb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ac.e(((Long) obj).longValue());
            }
        };
        f86235i = new ValueValidator() { // from class: k8.zb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ac.f(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j10) {
        return j10 >= 0;
    }
}
