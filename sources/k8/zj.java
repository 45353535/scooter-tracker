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
public abstract class zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f92939a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f92940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f92941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f92942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f92943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f92944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f92945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TypeHelper f92946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f92947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ValueValidator f92948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ValueValidator f92949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ValueValidator f92950l;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92951f = new a();

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
        private final my f92952a;

        public c(my myVar) {
            this.f92952a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public uj deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper typeHelper = zj.f92946h;
            Function1 function1 = c6.f86615e;
            Expression expression = zj.f92940b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper, function1, expression);
            Expression expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = zj.f92947i;
            Expression expression3 = zj.f92941c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_alpha", typeHelper2, function12, valueValidator, expression3);
            if (optionalExpression2 == null) {
                optionalExpression2 = expression3;
            }
            ValueValidator valueValidator2 = zj.f92948j;
            Expression expression4 = zj.f92942d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_scale", typeHelper2, function12, valueValidator2, expression4);
            if (optionalExpression3 == null) {
                optionalExpression3 = expression4;
            }
            ValueValidator valueValidator3 = zj.f92949k;
            Expression expression5 = zj.f92943e;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_alpha", typeHelper2, function12, valueValidator3, expression5);
            if (optionalExpression4 == null) {
                optionalExpression4 = expression5;
            }
            ValueValidator valueValidator4 = zj.f92950l;
            Expression expression6 = zj.f92944f;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_scale", typeHelper2, function12, valueValidator4, expression6);
            if (optionalExpression5 == null) {
                optionalExpression5 = expression6;
            }
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression7 = zj.f92945g;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reversed_stacking_order", typeHelper3, function13, expression7);
            return new uj(expression2, optionalExpression2, optionalExpression3, optionalExpression4, optionalExpression5, optionalExpression6 == null ? expression7 : optionalExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, uj ujVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", ujVar.f91685a, c6.f86614d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_alpha", ujVar.f91686b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_scale", ujVar.f91687c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_alpha", ujVar.f91688d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_scale", ujVar.f91689e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reversed_stacking_order", ujVar.f91690f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "overlap");
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92953a;

        public d(my myVar) {
            this.f92953a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ak deserialize(ParsingContext parsingContext, ak akVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", zj.f92946h, allowPropertyOverride, akVar != null ? akVar.f86266a : null, c6.f86615e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = akVar != null ? akVar.f86267b : null;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new ak(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_alpha", typeHelper, allowPropertyOverride, field, function1, zj.f92947i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "next_page_scale", typeHelper, allowPropertyOverride, akVar != null ? akVar.f86268c : null, function1, zj.f92948j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_alpha", typeHelper, allowPropertyOverride, akVar != null ? akVar.f86269d : null, function1, zj.f92949k), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "previous_page_scale", typeHelper, allowPropertyOverride, akVar != null ? akVar.f86270e : null, function1, zj.f92950l), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reversed_stacking_order", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, akVar != null ? akVar.f86271f : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ak akVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", akVar.f86266a, c6.f86614d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_alpha", akVar.f86267b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_scale", akVar.f86268c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_alpha", akVar.f86269d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_scale", akVar.f86270e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reversed_stacking_order", akVar.f86271f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "overlap");
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
        private final my f92954a;

        public e(my myVar) {
            this.f92954a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public uj resolve(ParsingContext parsingContext, ak akVar, JSONObject jSONObject) {
            Field field = akVar.f86266a;
            TypeHelper typeHelper = zj.f92946h;
            Function1 function1 = c6.f86615e;
            Expression expression = zj.f92940b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "interpolator", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field field2 = akVar.f86267b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = zj.f92947i;
            Expression expression2 = zj.f92941c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "next_page_alpha", typeHelper2, function12, valueValidator, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field field3 = akVar.f86268c;
            ValueValidator valueValidator2 = zj.f92948j;
            Expression expression3 = zj.f92942d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "next_page_scale", typeHelper2, function12, valueValidator2, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            Field field4 = akVar.f86269d;
            ValueValidator valueValidator3 = zj.f92949k;
            Expression expression4 = zj.f92943e;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "previous_page_alpha", typeHelper2, function12, valueValidator3, expression4);
            if (expressionResolveOptionalExpression4 == null) {
                expressionResolveOptionalExpression4 = expression4;
            }
            Field field5 = akVar.f86270e;
            ValueValidator valueValidator4 = zj.f92950l;
            Expression expression5 = zj.f92944f;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "previous_page_scale", typeHelper2, function12, valueValidator4, expression5);
            if (expressionResolveOptionalExpression5 == null) {
                expressionResolveOptionalExpression5 = expression5;
            }
            Field field6 = akVar.f86271f;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression6 = zj.f92945g;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "reversed_stacking_order", typeHelper3, function13, expression6);
            return new uj(expression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6 == null ? expression6 : expressionResolveOptionalExpression6);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        c6 c6Var = c6.EASE_IN_OUT;
        f92940b = Expression.Companion.constant$default(companion, c6Var, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f92941c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f92942d = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f92943e = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f92944f = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f92945g = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f92946h = TypeHelper.INSTANCE.from(c6Var, a.f92951f);
        f92947i = new ValueValidator() { // from class: k8.vj
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return zj.e(((Double) obj).doubleValue());
            }
        };
        f92948j = new ValueValidator() { // from class: k8.wj
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return zj.f(((Double) obj).doubleValue());
            }
        };
        f92949k = new ValueValidator() { // from class: k8.xj
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return zj.g(((Double) obj).doubleValue());
            }
        };
        f92950l = new ValueValidator() { // from class: k8.yj
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return zj.h(((Double) obj).doubleValue());
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
