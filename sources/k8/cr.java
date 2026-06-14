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
import k8.dr;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f86834a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dr.d f86835b = new dr.d(new mr());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f86836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f86837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeHelper f86838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ValueValidator f86839f;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86840f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jp);
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
        private final my f86841a;

        public c(my myVar) {
            this.f86841a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ar deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            dr drVar = (dr) JsonPropertyParser.readOptional(parsingContext, jSONObject, "style", this.f86841a.I7());
            if (drVar == null) {
                drVar = cr.f86835b;
            }
            dr drVar2 = drVar;
            TypeHelper typeHelper = cr.f86838e;
            Function1 function1 = jp.f88507e;
            Expression expression2 = cr.f86836c;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, function1, expression2);
            Expression expression3 = optionalExpression == null ? expression2 : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = cr.f86839f;
            Expression expression4 = cr.f86837d;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "width", typeHelper2, function12, valueValidator, expression4);
            if (optionalExpression2 != null) {
                expression4 = optionalExpression2;
            }
            return new ar(expression, drVar2, expression3, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ar arVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", arVar.f86313a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "style", arVar.f86314b, this.f86841a.I7());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", arVar.f86315c, jp.f88506d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "width", arVar.f86316d);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86842a;

        public d(my myVar) {
            this.f86842a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public sr deserialize(ParsingContext parsingContext, sr srVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new sr(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, srVar != null ? srVar.f91105a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "style", allowPropertyOverride, srVar != null ? srVar.f91106b : null, this.f86842a.J7()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "unit", cr.f86838e, allowPropertyOverride, srVar != null ? srVar.f91107c : null, jp.f88507e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "width", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, srVar != null ? srVar.f91108d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, cr.f86839f));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, sr srVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", srVar.f91105a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "style", srVar.f91106b, this.f86842a.J7());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", srVar.f91107c, jp.f88506d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "width", srVar.f91108d);
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
        private final my f86843a;

        public e(my myVar) {
            this.f86843a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ar resolve(ParsingContext parsingContext, sr srVar, JSONObject jSONObject) {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, srVar.f91105a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            dr drVar = (dr) JsonFieldResolver.resolveOptional(parsingContext, srVar.f91106b, jSONObject, "style", this.f86843a.K7(), this.f86843a.I7());
            if (drVar == null) {
                drVar = cr.f86835b;
            }
            Field field = srVar.f91107c;
            TypeHelper typeHelper = cr.f86838e;
            Function1 function1 = jp.f88507e;
            Expression expression = cr.f86836c;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, function1, expression);
            Expression expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field field2 = srVar.f91108d;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = cr.f86839f;
            Expression expression3 = cr.f86837d;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "width", typeHelper2, function12, valueValidator, expression3);
            if (expressionResolveOptionalExpression2 != null) {
                expression3 = expressionResolveOptionalExpression2;
            }
            return new ar(expressionResolveExpression, drVar, expression2, expression3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        jp jpVar = jp.DP;
        f86836c = Expression.Companion.constant$default(companion, jpVar, null, 2, null);
        f86837d = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f86838e = TypeHelper.INSTANCE.from(jpVar, a.f86840f);
        f86839f = new ValueValidator() { // from class: k8.br
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return cr.b(((Double) obj).doubleValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(double d10) {
        return d10 >= 0.0d;
    }
}
