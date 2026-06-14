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
public abstract class s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f90950a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeHelper f90954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ValueValidator f90955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ValueValidator f90956g;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90957f = new a();

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
        private final my f90958a;

        public c(my myVar) {
            this.f90958a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p7 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = s7.f90955f;
            Expression expression = s7.f90951b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, function1, valueValidator, expression);
            if (optionalExpression == null) {
                optionalExpression = expression;
            }
            TypeHelper typeHelper2 = s7.f90954e;
            Function1 function12 = c6.f86615e;
            Expression expression2 = s7.f90952c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper2, function12, expression2);
            Expression expression3 = optionalExpression2 == null ? expression2 : optionalExpression2;
            ValueValidator valueValidator2 = s7.f90956g;
            Expression expression4 = s7.f90953d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression4);
            if (optionalExpression3 != null) {
                expression4 = optionalExpression3;
            }
            return new p7(optionalExpression, expression3, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, p7 p7Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", p7Var.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", p7Var.c(), c6.f86614d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", p7Var.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "change_bounds");
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90959a;

        public d(my myVar) {
            this.f90959a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t7 deserialize(ParsingContext parsingContext, t7 t7Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = t7Var != null ? t7Var.f91250a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new t7(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, function1, s7.f90955f), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", s7.f90954e, allowPropertyOverride, t7Var != null ? t7Var.f91251b : null, c6.f86615e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, t7Var != null ? t7Var.f91252c : null, function1, s7.f90956g));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, t7 t7Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", t7Var.f91250a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", t7Var.f91251b, c6.f86614d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", t7Var.f91252c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "change_bounds");
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
        private final my f90960a;

        public e(my myVar) {
            this.f90960a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p7 resolve(ParsingContext parsingContext, t7 t7Var, JSONObject jSONObject) {
            Field field = t7Var.f91250a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = s7.f90955f;
            Expression expression = s7.f90951b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Field field2 = t7Var.f91251b;
            TypeHelper typeHelper2 = s7.f90954e;
            Function1 function12 = c6.f86615e;
            Expression expression2 = s7.f90952c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "interpolator", typeHelper2, function12, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field field3 = t7Var.f91252c;
            ValueValidator valueValidator2 = s7.f90956g;
            Expression expression3 = s7.f90953d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression3);
            if (expressionResolveOptionalExpression3 != null) {
                expression3 = expressionResolveOptionalExpression3;
            }
            return new p7(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90951b = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        c6 c6Var = c6.EASE_IN_OUT;
        f90952c = Expression.Companion.constant$default(companion, c6Var, null, 2, null);
        f90953d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90954e = TypeHelper.INSTANCE.from(c6Var, a.f90957f);
        f90955f = new ValueValidator() { // from class: k8.q7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return s7.c(((Long) obj).longValue());
            }
        };
        f90956g = new ValueValidator() { // from class: k8.r7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return s7.d(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j10) {
        return j10 >= 0;
    }
}
