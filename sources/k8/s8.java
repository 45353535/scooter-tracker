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
import java.util.List;
import k8.n9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f90961a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n9.c f90964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f90965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TypeHelper f90966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f90967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f90968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f90969i;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90970f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof b6);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f90971f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof c6);
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
        private final my f90972a;

        public d(my myVar) {
            this.f90972a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p8 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", this.f90972a.u0());
            TypeHelper typeHelper = s8.f90966f;
            Function1 function1 = b6.f86440e;
            Expression expression = s8.f90962b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", typeHelper, function1, expression);
            Expression expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "duration", typeHelper2, function12, s8.f90968h);
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f90972a.u0());
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper3, function13);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            TypeHelper typeHelper4 = s8.f90967g;
            Function1 function14 = c6.f86615e;
            Expression expression5 = s8.f90963c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper4, function14, expression5);
            Expression expression6 = optionalExpression2 == null ? expression5 : optionalExpression2;
            n9 n9Var = (n9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.f90972a.v2());
            if (n9Var == null) {
                n9Var = s8.f90964d;
            }
            n9 n9Var2 = n9Var;
            ValueValidator valueValidator = s8.f90969i;
            Expression expression7 = s8.f90965e;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, function12, valueValidator, expression7);
            if (optionalExpression3 != null) {
                expression7 = optionalExpression3;
            }
            return new p8(optionalList, expression2, expression3, optionalList2, expression4, str, expression6, n9Var2, expression7, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper3, function13), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable_name"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, p8 p8Var) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "cancel_actions", p8Var.a(), this.f90972a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", p8Var.getDirection(), b6.f86439d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", p8Var.getDuration());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", p8Var.d(), this.f90972a.u0());
            Expression expression = p8Var.f90337e;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", expression, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", p8Var.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", p8Var.c(), c6.f86614d);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", p8Var.b(), this.f90972a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", p8Var.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", p8Var.f90342j, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "color_animator");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable_name", p8Var.g());
            return jSONObject;
        }
    }

    public static final class e implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90973a;

        public e(my myVar) {
            this.f90973a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t8 deserialize(ParsingContext parsingContext, t8 t8Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, t8Var != null ? t8Var.f91260a : null, this.f90973a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", s8.f90966f, allowPropertyOverride, t8Var != null ? t8Var.f91261b : null, b6.f86440e);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = t8Var != null ? t8Var.f91262c : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, function1, s8.f90968h);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, t8Var != null ? t8Var.f91263d : null, this.f90973a.v0());
            TypeHelper<Integer> typeHelper2 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field2 = t8Var != null ? t8Var.f91264e : null;
            Function1<Object, Integer> function12 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            return new t8(optionalListField, optionalFieldWithExpression, fieldWithExpression, optionalListField2, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, function12), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, t8Var != null ? t8Var.f91265f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", s8.f90967g, allowPropertyOverride, t8Var != null ? t8Var.f91266g : null, c6.f86615e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, t8Var != null ? t8Var.f91267h : null, this.f90973a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, t8Var != null ? t8Var.f91268i : null, function1, s8.f90969i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, t8Var != null ? t8Var.f91269j : null, function12), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, t8Var != null ? t8Var.f91270k : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, t8 t8Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "cancel_actions", t8Var.f91260a, this.f90973a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", t8Var.f91261b, b6.f86439d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", t8Var.f91262c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", t8Var.f91263d, this.f90973a.v0());
            Field field = t8Var.f91264e;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", field, function1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", t8Var.f91265f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", t8Var.f91266g, c6.f86614d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", t8Var.f91267h, this.f90973a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", t8Var.f91268i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", t8Var.f91269j, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "color_animator");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable_name", t8Var.f91270k);
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
        private final my f90974a;

        public f(my myVar) {
            this.f90974a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p8 resolve(ParsingContext parsingContext, t8 t8Var, JSONObject jSONObject) {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, t8Var.f91260a, jSONObject, "cancel_actions", this.f90974a.w0(), this.f90974a.u0());
            Field field = t8Var.f91261b;
            TypeHelper typeHelper = s8.f90966f;
            Function1 function1 = b6.f86440e;
            Expression expression = s8.f90962b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "direction", typeHelper, function1, expression);
            Expression expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field field2 = t8Var.f91262c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, function12, s8.f90968h);
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, t8Var.f91263d, jSONObject, "end_actions", this.f90974a.w0(), this.f90974a.u0());
            Field field3 = t8Var.f91264e;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expressionResolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "end_value", typeHelper3, function13);
            String str = (String) JsonFieldResolver.resolve(parsingContext, t8Var.f91265f, jSONObject, "id");
            Field field4 = t8Var.f91266g;
            TypeHelper typeHelper4 = s8.f90967g;
            Function1 function14 = c6.f86615e;
            Expression expression3 = s8.f90963c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "interpolator", typeHelper4, function14, expression3);
            Expression expression4 = expressionResolveOptionalExpression2 == null ? expression3 : expressionResolveOptionalExpression2;
            n9 n9Var = (n9) JsonFieldResolver.resolveOptional(parsingContext, t8Var.f91267h, jSONObject, "repeat_count", this.f90974a.x2(), this.f90974a.v2());
            if (n9Var == null) {
                n9Var = s8.f90964d;
            }
            n9 n9Var2 = n9Var;
            Field field5 = t8Var.f91268i;
            ValueValidator valueValidator = s8.f90969i;
            Expression expression5 = s8.f90965e;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start_delay", typeHelper2, function12, valueValidator, expression5);
            if (expressionResolveOptionalExpression3 != null) {
                expression5 = expressionResolveOptionalExpression3;
            }
            return new p8(listResolveOptionalList, expression2, expressionResolveExpression, listResolveOptionalList2, expressionResolveExpression2, str, expression4, n9Var2, expression5, JsonFieldResolver.resolveOptionalExpression(parsingContext, t8Var.f91269j, jSONObject, "start_value", typeHelper3, function13), (String) JsonFieldResolver.resolve(parsingContext, t8Var.f91270k, jSONObject, "variable_name"));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        b6 b6Var = b6.NORMAL;
        f90962b = Expression.Companion.constant$default(companion, b6Var, null, 2, null);
        c6 c6Var = c6.LINEAR;
        f90963c = Expression.Companion.constant$default(companion, c6Var, null, 2, null);
        f90964d = new n9.c(new mc(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f90965e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f90966f = companion2.from(b6Var, a.f90970f);
        f90967g = companion2.from(c6Var, b.f90971f);
        f90968h = new ValueValidator() { // from class: k8.q8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return s8.c(((Long) obj).longValue());
            }
        };
        f90969i = new ValueValidator() { // from class: k8.r8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return s8.d(((Long) obj).longValue());
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
