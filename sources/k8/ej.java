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
public abstract class ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f87320a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f87322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n9.c f87323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f87324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TypeHelper f87325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f87326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f87327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f87328i;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87329f = new a();

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
        public static final b f87330f = new b();

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
        private final my f87331a;

        public d(my myVar) {
            this.f87331a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bj deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", this.f87331a.u0());
            TypeHelper typeHelper = ej.f87325f;
            Function1 function1 = b6.f86440e;
            Expression expression = ej.f87321b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", typeHelper, function1, expression);
            Expression expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression3 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "duration", typeHelper2, function12, ej.f87327h);
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f87331a.u0());
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper3, function13);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            TypeHelper typeHelper4 = ej.f87326g;
            Function1 function14 = c6.f86615e;
            Expression expression5 = ej.f87322c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper4, function14, expression5);
            Expression expression6 = optionalExpression2 == null ? expression5 : optionalExpression2;
            n9 n9Var = (n9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.f87331a.v2());
            if (n9Var == null) {
                n9Var = ej.f87323d;
            }
            n9 n9Var2 = n9Var;
            ValueValidator valueValidator = ej.f87328i;
            Expression expression7 = ej.f87324e;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, function12, valueValidator, expression7);
            if (optionalExpression3 != null) {
                expression7 = optionalExpression3;
            }
            return new bj(optionalList, expression2, expression3, optionalList2, expression4, str, expression6, n9Var2, expression7, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper3, function13), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable_name"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, bj bjVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "cancel_actions", bjVar.a(), this.f87331a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", bjVar.getDirection(), b6.f86439d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", bjVar.getDuration());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", bjVar.d(), this.f87331a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", bjVar.f86534e);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", bjVar.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", bjVar.c(), c6.f86614d);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", bjVar.b(), this.f87331a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", bjVar.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", bjVar.f86539j);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "number_animator");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable_name", bjVar.g());
            return jSONObject;
        }
    }

    public static final class e implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87332a;

        public e(my myVar) {
            this.f87332a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public fj deserialize(ParsingContext parsingContext, fj fjVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, fjVar != null ? fjVar.f87531a : null, this.f87332a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", ej.f87325f, allowPropertyOverride, fjVar != null ? fjVar.f87532b : null, b6.f86440e);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = fjVar != null ? fjVar.f87533c : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, function1, ej.f87327h);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, fjVar != null ? fjVar.f87534d : null, this.f87332a.v0());
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = fjVar != null ? fjVar.f87535e : null;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new fj(optionalListField, optionalFieldWithExpression, fieldWithExpression, optionalListField2, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, function12), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, fjVar != null ? fjVar.f87536f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", ej.f87326g, allowPropertyOverride, fjVar != null ? fjVar.f87537g : null, c6.f86615e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, fjVar != null ? fjVar.f87538h : null, this.f87332a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, fjVar != null ? fjVar.f87539i : null, function1, ej.f87328i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, fjVar != null ? fjVar.f87540j : null, function12), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, fjVar != null ? fjVar.f87541k : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, fj fjVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "cancel_actions", fjVar.f87531a, this.f87332a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", fjVar.f87532b, b6.f86439d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", fjVar.f87533c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", fjVar.f87534d, this.f87332a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", fjVar.f87535e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", fjVar.f87536f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", fjVar.f87537g, c6.f86614d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", fjVar.f87538h, this.f87332a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", fjVar.f87539i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", fjVar.f87540j);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "number_animator");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable_name", fjVar.f87541k);
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
        private final my f87333a;

        public f(my myVar) {
            this.f87333a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bj resolve(ParsingContext parsingContext, fj fjVar, JSONObject jSONObject) {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, fjVar.f87531a, jSONObject, "cancel_actions", this.f87333a.w0(), this.f87333a.u0());
            Field field = fjVar.f87532b;
            TypeHelper typeHelper = ej.f87325f;
            Function1 function1 = b6.f86440e;
            Expression expression = ej.f87321b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "direction", typeHelper, function1, expression);
            Expression expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field field2 = fjVar.f87533c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, function12, ej.f87327h);
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, fjVar.f87534d, jSONObject, "end_actions", this.f87333a.w0(), this.f87333a.u0());
            Field field3 = fjVar.f87535e;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expressionResolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "end_value", typeHelper3, function13);
            String str = (String) JsonFieldResolver.resolve(parsingContext, fjVar.f87536f, jSONObject, "id");
            Field field4 = fjVar.f87537g;
            TypeHelper typeHelper4 = ej.f87326g;
            Function1 function14 = c6.f86615e;
            Expression expression3 = ej.f87322c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "interpolator", typeHelper4, function14, expression3);
            Expression expression4 = expressionResolveOptionalExpression2 == null ? expression3 : expressionResolveOptionalExpression2;
            n9 n9Var = (n9) JsonFieldResolver.resolveOptional(parsingContext, fjVar.f87538h, jSONObject, "repeat_count", this.f87333a.x2(), this.f87333a.v2());
            if (n9Var == null) {
                n9Var = ej.f87323d;
            }
            n9 n9Var2 = n9Var;
            Field field5 = fjVar.f87539i;
            ValueValidator valueValidator = ej.f87328i;
            Expression expression5 = ej.f87324e;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start_delay", typeHelper2, function12, valueValidator, expression5);
            if (expressionResolveOptionalExpression3 != null) {
                expression5 = expressionResolveOptionalExpression3;
            }
            return new bj(listResolveOptionalList, expression2, expressionResolveExpression, listResolveOptionalList2, expressionResolveExpression2, str, expression4, n9Var2, expression5, JsonFieldResolver.resolveOptionalExpression(parsingContext, fjVar.f87540j, jSONObject, "start_value", typeHelper3, function13), (String) JsonFieldResolver.resolve(parsingContext, fjVar.f87541k, jSONObject, "variable_name"));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        b6 b6Var = b6.NORMAL;
        f87321b = Expression.Companion.constant$default(companion, b6Var, null, 2, null);
        c6 c6Var = c6.LINEAR;
        f87322c = Expression.Companion.constant$default(companion, c6Var, null, 2, null);
        f87323d = new n9.c(new mc(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f87324e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f87325f = companion2.from(b6Var, a.f87329f);
        f87326g = companion2.from(c6Var, b.f87330f);
        f87327h = new ValueValidator() { // from class: k8.cj
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ej.c(((Long) obj).longValue());
            }
        };
        f87328i = new ValueValidator() { // from class: k8.dj
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ej.d(((Long) obj).longValue());
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
