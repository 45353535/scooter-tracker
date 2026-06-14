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
import k8.op;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class rp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f90800a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f90804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TypeHelper f90805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f90806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f90807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f90808i;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90809f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof op.c);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f90810f = new b();

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
        private final my f90811a;

        public d(my myVar) {
            this.f90811a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public op deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            oa oaVar = (oa) JsonPropertyParser.readOptional(parsingContext, jSONObject, "distance", this.f90811a.M2());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = rp.f90807h;
            Expression expression = rp.f90801b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, function1, valueValidator, expression);
            if (optionalExpression == null) {
                optionalExpression = expression;
            }
            TypeHelper typeHelper2 = rp.f90805f;
            Function1 function12 = op.c.f90254e;
            Expression expression2 = rp.f90802c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "edge", typeHelper2, function12, expression2);
            Expression expression3 = optionalExpression2 == null ? expression2 : optionalExpression2;
            TypeHelper typeHelper3 = rp.f90806g;
            Function1 function13 = c6.f86615e;
            Expression expression4 = rp.f90803d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, function13, expression4);
            Expression expression5 = optionalExpression3 == null ? expression4 : optionalExpression3;
            ValueValidator valueValidator2 = rp.f90808i;
            Expression expression6 = rp.f90804e;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression6);
            return new op(oaVar, optionalExpression, expression3, expression5, optionalExpression4 == null ? expression6 : optionalExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, op opVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "distance", opVar.f90245a, this.f90811a.M2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", opVar.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "edge", opVar.f90247c, op.c.f90253d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", opVar.c(), c6.f86614d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", opVar.d());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    public static final class e implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90812a;

        public e(my myVar) {
            this.f90812a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public sp deserialize(ParsingContext parsingContext, sp spVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "distance", allowPropertyOverride, spVar != null ? spVar.f91093a : null, this.f90812a.N2());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = spVar != null ? spVar.f91094b : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new sp(optionalField, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, function1, rp.f90807h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "edge", rp.f90805f, allowPropertyOverride, spVar != null ? spVar.f91095c : null, op.c.f90254e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", rp.f90806g, allowPropertyOverride, spVar != null ? spVar.f91096d : null, c6.f86615e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, spVar != null ? spVar.f91097e : null, function1, rp.f90808i));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, sp spVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "distance", spVar.f91093a, this.f90812a.N2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", spVar.f91094b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "edge", spVar.f91095c, op.c.f90253d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", spVar.f91096d, c6.f86614d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", spVar.f91097e);
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

    public static final class f implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90813a;

        public f(my myVar) {
            this.f90813a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public op resolve(ParsingContext parsingContext, sp spVar, JSONObject jSONObject) {
            oa oaVar = (oa) JsonFieldResolver.resolveOptional(parsingContext, spVar.f91093a, jSONObject, "distance", this.f90813a.O2(), this.f90813a.M2());
            Field field = spVar.f91094b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = rp.f90807h;
            Expression expression = rp.f90801b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Field field2 = spVar.f91095c;
            TypeHelper typeHelper2 = rp.f90805f;
            Function1 function12 = op.c.f90254e;
            Expression expression2 = rp.f90802c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "edge", typeHelper2, function12, expression2);
            Expression expression3 = expressionResolveOptionalExpression2 == null ? expression2 : expressionResolveOptionalExpression2;
            Field field3 = spVar.f91096d;
            TypeHelper typeHelper3 = rp.f90806g;
            Function1 function13 = c6.f86615e;
            Expression expression4 = rp.f90803d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, function13, expression4);
            Expression expression5 = expressionResolveOptionalExpression3 == null ? expression4 : expressionResolveOptionalExpression3;
            Field field4 = spVar.f91097e;
            ValueValidator valueValidator2 = rp.f90808i;
            Expression expression6 = rp.f90804e;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression6);
            return new op(oaVar, expressionResolveOptionalExpression, expression3, expression5, expressionResolveOptionalExpression4 == null ? expression6 : expressionResolveOptionalExpression4);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90801b = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        op.c cVar = op.c.BOTTOM;
        f90802c = Expression.Companion.constant$default(companion, cVar, null, 2, null);
        c6 c6Var = c6.EASE_IN_OUT;
        f90803d = Expression.Companion.constant$default(companion, c6Var, null, 2, null);
        f90804e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f90805f = companion2.from(cVar, a.f90809f);
        f90806g = companion2.from(c6Var, b.f90810f);
        f90807h = new ValueValidator() { // from class: k8.pp
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rp.c(((Long) obj).longValue());
            }
        };
        f90808i = new ValueValidator() { // from class: k8.qp
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rp.d(((Long) obj).longValue());
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
