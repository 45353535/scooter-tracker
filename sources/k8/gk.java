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
public abstract class gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f87815a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f87817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f87818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f87819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f87820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f87821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f87822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f87823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ValueValidator f87824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ValueValidator f87825k;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87826f = new a();

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
        private final my f87827a;

        public c(my myVar) {
            this.f87827a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bk deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper typeHelper = gk.f87821g;
            Function1 function1 = c6.f86615e;
            Expression expression = gk.f87816b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper, function1, expression);
            Expression expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = gk.f87822h;
            Expression expression3 = gk.f87817c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_alpha", typeHelper2, function12, valueValidator, expression3);
            if (optionalExpression2 == null) {
                optionalExpression2 = expression3;
            }
            ValueValidator valueValidator2 = gk.f87823i;
            Expression expression4 = gk.f87818d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_scale", typeHelper2, function12, valueValidator2, expression4);
            if (optionalExpression3 == null) {
                optionalExpression3 = expression4;
            }
            ValueValidator valueValidator3 = gk.f87824j;
            Expression expression5 = gk.f87819e;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_alpha", typeHelper2, function12, valueValidator3, expression5);
            if (optionalExpression4 == null) {
                optionalExpression4 = expression5;
            }
            ValueValidator valueValidator4 = gk.f87825k;
            Expression expression6 = gk.f87820f;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_scale", typeHelper2, function12, valueValidator4, expression6);
            return new bk(expression2, optionalExpression2, optionalExpression3, optionalExpression4, optionalExpression5 == null ? expression6 : optionalExpression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, bk bkVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", bkVar.f86550a, c6.f86614d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_alpha", bkVar.f86551b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_scale", bkVar.f86552c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_alpha", bkVar.f86553d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_scale", bkVar.f86554e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87828a;

        public d(my myVar) {
            this.f87828a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hk deserialize(ParsingContext parsingContext, hk hkVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", gk.f87821g, allowPropertyOverride, hkVar != null ? hkVar.f88082a : null, c6.f86615e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = hkVar != null ? hkVar.f88083b : null;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new hk(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_alpha", typeHelper, allowPropertyOverride, field, function1, gk.f87822h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_scale", typeHelper, allowPropertyOverride, hkVar != null ? hkVar.f88084c : null, function1, gk.f87823i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_alpha", typeHelper, allowPropertyOverride, hkVar != null ? hkVar.f88085d : null, function1, gk.f87824j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_scale", typeHelper, allowPropertyOverride, hkVar != null ? hkVar.f88086e : null, function1, gk.f87825k));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, hk hkVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", hkVar.f88082a, c6.f86614d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_alpha", hkVar.f88083b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_scale", hkVar.f88084c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_alpha", hkVar.f88085d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_scale", hkVar.f88086e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
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
        private final my f87829a;

        public e(my myVar) {
            this.f87829a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bk resolve(ParsingContext parsingContext, hk hkVar, JSONObject jSONObject) {
            Field field = hkVar.f88082a;
            TypeHelper typeHelper = gk.f87821g;
            Function1 function1 = c6.f86615e;
            Expression expression = gk.f87816b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "interpolator", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field field2 = hkVar.f88083b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = gk.f87822h;
            Expression expression2 = gk.f87817c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "next_page_alpha", typeHelper2, function12, valueValidator, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field field3 = hkVar.f88084c;
            ValueValidator valueValidator2 = gk.f87823i;
            Expression expression3 = gk.f87818d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "next_page_scale", typeHelper2, function12, valueValidator2, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            Field field4 = hkVar.f88085d;
            ValueValidator valueValidator3 = gk.f87824j;
            Expression expression4 = gk.f87819e;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "previous_page_alpha", typeHelper2, function12, valueValidator3, expression4);
            if (expressionResolveOptionalExpression4 == null) {
                expressionResolveOptionalExpression4 = expression4;
            }
            Field field5 = hkVar.f88086e;
            ValueValidator valueValidator4 = gk.f87825k;
            Expression expression5 = gk.f87820f;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "previous_page_scale", typeHelper2, function12, valueValidator4, expression5);
            return new bk(expression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4, expressionResolveOptionalExpression5 == null ? expression5 : expressionResolveOptionalExpression5);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        c6 c6Var = c6.EASE_IN_OUT;
        f87816b = Expression.Companion.constant$default(companion, c6Var, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f87817c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f87818d = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f87819e = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f87820f = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f87821g = TypeHelper.INSTANCE.from(c6Var, a.f87826f);
        f87822h = new ValueValidator() { // from class: k8.ck
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return gk.e(((Double) obj).doubleValue());
            }
        };
        f87823i = new ValueValidator() { // from class: k8.dk
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return gk.f(((Double) obj).doubleValue());
            }
        };
        f87824j = new ValueValidator() { // from class: k8.ek
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return gk.g(((Double) obj).doubleValue());
            }
        };
        f87825k = new ValueValidator() { // from class: k8.fk
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return gk.h(((Double) obj).doubleValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(double d10) {
        return d10 >= 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(double d10) {
        return d10 >= 0.0d;
    }
}
