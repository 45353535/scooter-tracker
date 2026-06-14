package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import java.util.List;
import k8.a6;
import k8.n9;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f87428a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f87430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n9.d f87431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f87432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TypeHelper f87433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f87434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f87435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f87436i;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87437f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof c6);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f87438f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof a6.c);
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87439a;

        public d(my myVar) {
            this.f87439a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a6 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = f6.f87435h;
            Expression expression = f6.f87429b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, function1, valueValidator, expression);
            Expression expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end_value", typeHelper2, function12);
            TypeHelper typeHelper3 = f6.f87433f;
            Function1 function13 = c6.f86615e;
            Expression expression3 = f6.f87430c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, function13, expression3);
            Expression expression4 = optionalExpression3 == null ? expression3 : optionalExpression3;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f87439a.q1());
            Expression expression5 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", f6.f87434g, a6.c.f86205e);
            n9 n9Var = (n9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat", this.f87439a.v2());
            if (n9Var == null) {
                n9Var = f6.f87431d;
            }
            n9 n9Var2 = n9Var;
            ValueValidator valueValidator2 = f6.f87436i;
            Expression expression6 = f6.f87432e;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression6);
            if (optionalExpression4 != null) {
                expression6 = optionalExpression4;
            }
            return new a6(expression2, optionalExpression2, expression4, optionalList, expression5, n9Var2, expression6, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper2, function12));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, a6 a6Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", a6Var.f86192a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", a6Var.f86193b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", a6Var.f86194c, c6.f86614d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, a6Var.f86195d, this.f87439a.q1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", a6Var.f86196e, a6.c.f86204d);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat", a6Var.f86197f, this.f87439a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", a6Var.f86198g);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", a6Var.f86199h);
            return jSONObject;
        }
    }

    public static final class e implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87440a;

        public e(my myVar) {
            this.f87440a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g6 deserialize(ParsingContext parsingContext, g6 g6Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = g6Var != null ? g6Var.f87749a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, function1, f6.f87435h);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = g6Var != null ? g6Var.f87750b : null;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new g6(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, function12), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", f6.f87433f, allowPropertyOverride, g6Var != null ? g6Var.f87751c : null, c6.f86615e), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, g6Var != null ? g6Var.f87752d : null, this.f87440a.r1()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "name", f6.f87434g, allowPropertyOverride, g6Var != null ? g6Var.f87753e : null, a6.c.f86205e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat", allowPropertyOverride, g6Var != null ? g6Var.f87754f : null, this.f87440a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, g6Var != null ? g6Var.f87755g : null, function1, f6.f87436i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, g6Var != null ? g6Var.f87756h : null, function12));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, g6 g6Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", g6Var.f87749a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", g6Var.f87750b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", g6Var.f87751c, c6.f86614d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, g6Var.f87752d, this.f87440a.r1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", g6Var.f87753e, a6.c.f86204d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat", g6Var.f87754f, this.f87440a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", g6Var.f87755g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", g6Var.f87756h);
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

    public static final class f implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87441a;

        public f(my myVar) {
            this.f87441a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a6 resolve(ParsingContext parsingContext, g6 g6Var, JSONObject jSONObject) {
            Field field = g6Var.f87749a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = f6.f87435h;
            Expression expression = f6.f87429b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Field field2 = g6Var.f87750b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "end_value", typeHelper2, function12);
            Field field3 = g6Var.f87751c;
            TypeHelper typeHelper3 = f6.f87433f;
            Function1 function13 = c6.f86615e;
            Expression expression2 = f6.f87430c;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, function13, expression2);
            if (expressionResolveOptionalExpression3 != null) {
                expression2 = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, g6Var.f87752d, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f87441a.s1(), this.f87441a.q1());
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, g6Var.f87753e, jSONObject, "name", f6.f87434g, a6.c.f86205e);
            n9 n9Var = (n9) JsonFieldResolver.resolveOptional(parsingContext, g6Var.f87754f, jSONObject, "repeat", this.f87441a.x2(), this.f87441a.v2());
            if (n9Var == null) {
                n9Var = f6.f87431d;
            }
            n9 n9Var2 = n9Var;
            Field field4 = g6Var.f87755g;
            ValueValidator valueValidator2 = f6.f87436i;
            Expression expression3 = f6.f87432e;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression3);
            return new a6(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList, expressionResolveExpression, n9Var2, expressionResolveOptionalExpression4 == null ? expression3 : expressionResolveOptionalExpression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, g6Var.f87756h, jSONObject, "start_value", typeHelper2, function12));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f87429b = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        c6 c6Var = c6.SPRING;
        f87430c = Expression.Companion.constant$default(companion, c6Var, null, 2, null);
        f87431d = new n9.d(new tf());
        f87432e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f87433f = companion2.from(c6Var, a.f87437f);
        f87434g = companion2.from(ArraysKt.first(a6.c.values()), b.f87438f);
        f87435h = new ValueValidator() { // from class: k8.d6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return f6.c(((Long) obj).longValue());
            }
        };
        f87436i = new ValueValidator() { // from class: k8.e6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return f6.d(((Long) obj).longValue());
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
