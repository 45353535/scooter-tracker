package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f87143a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f87145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f87146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f87147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ValueValidator f87148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ValueValidator f87149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f87150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f87151i;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87152a;

        public b(my myVar) {
            this.f87152a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z0 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = e1.f87148f;
            Expression expression = e1.f87144b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, function1, valueValidator, expression);
            if (optionalExpression == null) {
                optionalExpression = expression;
            }
            ValueValidator valueValidator2 = e1.f87149g;
            Expression expression2 = e1.f87145c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper, function1, valueValidator2, expression2);
            if (optionalExpression2 == null) {
                optionalExpression2 = expression2;
            }
            ValueValidator valueValidator3 = e1.f87150h;
            Expression expression3 = e1.f87146d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper, function1, valueValidator3, expression3);
            Expression expression4 = optionalExpression3 == null ? expression3 : optionalExpression3;
            ValueValidator valueValidator4 = e1.f87151i;
            Expression expression5 = e1.f87147e;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top", typeHelper, function1, valueValidator4, expression5);
            if (optionalExpression4 != null) {
                expression5 = optionalExpression4;
            }
            return new z0(optionalExpression, optionalExpression2, expression4, expression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, z0 z0Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "bottom", z0Var.f92844a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", z0Var.f92845b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", z0Var.f92846c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top", z0Var.f92847d);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87153a;

        public c(my myVar) {
            this.f87153a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f1 deserialize(ParsingContext parsingContext, f1 f1Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = f1Var != null ? f1Var.f87415a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new f1(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, function1, e1.f87148f), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, f1Var != null ? f1Var.f87416b : null, function1, e1.f87149g), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, f1Var != null ? f1Var.f87417c : null, function1, e1.f87150h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "top", typeHelper, allowPropertyOverride, f1Var != null ? f1Var.f87418d : null, function1, e1.f87151i));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, f1 f1Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "bottom", f1Var.f87415a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", f1Var.f87416b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", f1Var.f87417c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top", f1Var.f87418d);
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
        private final my f87154a;

        public d(my myVar) {
            this.f87154a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z0 resolve(ParsingContext parsingContext, f1 f1Var, JSONObject jSONObject) {
            Field field = f1Var.f87415a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = e1.f87148f;
            Expression expression = e1.f87144b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "bottom", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Field field2 = f1Var.f87416b;
            ValueValidator valueValidator2 = e1.f87149g;
            Expression expression2 = e1.f87145c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "left", typeHelper, function1, valueValidator2, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field field3 = f1Var.f87417c;
            ValueValidator valueValidator3 = e1.f87150h;
            Expression expression3 = e1.f87146d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "right", typeHelper, function1, valueValidator3, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            Field field4 = f1Var.f87418d;
            ValueValidator valueValidator4 = e1.f87151i;
            Expression expression4 = e1.f87147e;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "top", typeHelper, function1, valueValidator4, expression4);
            if (expressionResolveOptionalExpression4 != null) {
                expression4 = expressionResolveOptionalExpression4;
            }
            return new z0(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expression4);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f87144b = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87145c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87146d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87147e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87148f = new ValueValidator() { // from class: k8.a1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return e1.e(((Long) obj).longValue());
            }
        };
        f87149g = new ValueValidator() { // from class: k8.b1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return e1.f(((Long) obj).longValue());
            }
        };
        f87150h = new ValueValidator() { // from class: k8.c1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return e1.g(((Long) obj).longValue());
            }
        };
        f87151i = new ValueValidator() { // from class: k8.d1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return e1.h(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j10) {
        return j10 >= 0;
    }
}
