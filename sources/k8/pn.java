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
public abstract class pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f90426a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f90430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f90431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f90432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TypeHelper f90433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f90434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ValueValidator f90435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ValueValidator f90436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ValueValidator f90437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ValueValidator f90438m;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90439f = new a();

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
        private final my f90440a;

        public c(my myVar) {
            this.f90440a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public jn deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = pn.f90434i;
            Expression expression = pn.f90427b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, function1, valueValidator, expression);
            Expression expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper typeHelper2 = pn.f90433h;
            Function1 function12 = c6.f86615e;
            Expression expression3 = pn.f90428c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper2, function12, expression3);
            Expression expression4 = optionalExpression2 == null ? expression3 : optionalExpression2;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator2 = pn.f90435j;
            Expression expression5 = pn.f90429d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "pivot_x", typeHelper3, function13, valueValidator2, expression5);
            Expression expression6 = optionalExpression3 == null ? expression5 : optionalExpression3;
            ValueValidator valueValidator3 = pn.f90436k;
            Expression expression7 = pn.f90430e;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "pivot_y", typeHelper3, function13, valueValidator3, expression7);
            Expression expression8 = optionalExpression4 == null ? expression7 : optionalExpression4;
            ValueValidator valueValidator4 = pn.f90437l;
            Expression expression9 = pn.f90431f;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper3, function13, valueValidator4, expression9);
            if (optionalExpression5 != null) {
                expression9 = optionalExpression5;
            }
            ValueValidator valueValidator5 = pn.f90438m;
            Expression expression10 = pn.f90432g;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, valueValidator5, expression10);
            return new jn(expression2, expression4, expression6, expression8, expression9, optionalExpression6 == null ? expression10 : optionalExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, jn jnVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", jnVar.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", jnVar.c(), c6.f86614d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pivot_x", jnVar.f88499c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pivot_y", jnVar.f88500d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", jnVar.f88501e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", jnVar.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scale");
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90441a;

        public d(my myVar) {
            this.f90441a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qn deserialize(ParsingContext parsingContext, qn qnVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = qnVar != null ? qnVar.f90606a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, function1, pn.f90434i);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", pn.f90433h, allowPropertyOverride, qnVar != null ? qnVar.f90607b : null, c6.f86615e);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = qnVar != null ? qnVar.f90608c : null;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new qn(optionalFieldWithExpression, optionalFieldWithExpression2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pivot_x", typeHelper2, allowPropertyOverride, field2, function12, pn.f90435j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pivot_y", typeHelper2, allowPropertyOverride, qnVar != null ? qnVar.f90609d : null, function12, pn.f90436k), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", typeHelper2, allowPropertyOverride, qnVar != null ? qnVar.f90610e : null, function12, pn.f90437l), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, qnVar != null ? qnVar.f90611f : null, function1, pn.f90438m));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, qn qnVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", qnVar.f90606a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", qnVar.f90607b, c6.f86614d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pivot_x", qnVar.f90608c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pivot_y", qnVar.f90609d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", qnVar.f90610e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", qnVar.f90611f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scale");
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
        private final my f90442a;

        public e(my myVar) {
            this.f90442a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public jn resolve(ParsingContext parsingContext, qn qnVar, JSONObject jSONObject) {
            Field field = qnVar.f90606a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = pn.f90434i;
            Expression expression = pn.f90427b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Field field2 = qnVar.f90607b;
            TypeHelper typeHelper2 = pn.f90433h;
            Function1 function12 = c6.f86615e;
            Expression expression2 = pn.f90428c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "interpolator", typeHelper2, function12, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field field3 = qnVar.f90608c;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator2 = pn.f90435j;
            Expression expression3 = pn.f90429d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "pivot_x", typeHelper3, function13, valueValidator2, expression3);
            Expression expression4 = expressionResolveOptionalExpression3 == null ? expression3 : expressionResolveOptionalExpression3;
            Field field4 = qnVar.f90609d;
            ValueValidator valueValidator3 = pn.f90436k;
            Expression expression5 = pn.f90430e;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "pivot_y", typeHelper3, function13, valueValidator3, expression5);
            Expression expression6 = expressionResolveOptionalExpression4 == null ? expression5 : expressionResolveOptionalExpression4;
            Field field5 = qnVar.f90610e;
            ValueValidator valueValidator4 = pn.f90437l;
            Expression expression7 = pn.f90431f;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "scale", typeHelper3, function13, valueValidator4, expression7);
            if (expressionResolveOptionalExpression5 != null) {
                expression7 = expressionResolveOptionalExpression5;
            }
            Field field6 = qnVar.f90611f;
            ValueValidator valueValidator5 = pn.f90438m;
            Expression expression8 = pn.f90432g;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "start_delay", typeHelper, function1, valueValidator5, expression8);
            return new jn(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression4, expression6, expression7, expressionResolveOptionalExpression6 == null ? expression8 : expressionResolveOptionalExpression6);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90427b = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        c6 c6Var = c6.EASE_IN_OUT;
        f90428c = Expression.Companion.constant$default(companion, c6Var, null, 2, null);
        Double dValueOf = Double.valueOf(0.5d);
        f90429d = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f90430e = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f90431f = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f90432g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90433h = TypeHelper.INSTANCE.from(c6Var, a.f90439f);
        f90434i = new ValueValidator() { // from class: k8.kn
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return pn.f(((Long) obj).longValue());
            }
        };
        f90435j = new ValueValidator() { // from class: k8.ln
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return pn.g(((Double) obj).doubleValue());
            }
        };
        f90436k = new ValueValidator() { // from class: k8.mn
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return pn.h(((Double) obj).doubleValue());
            }
        };
        f90437l = new ValueValidator() { // from class: k8.nn
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return pn.i(((Double) obj).doubleValue());
            }
        };
        f90438m = new ValueValidator() { // from class: k8.on
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return pn.j(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(double d10) {
        return d10 >= 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(long j10) {
        return j10 >= 0;
    }
}
