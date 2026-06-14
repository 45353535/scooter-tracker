package k8;

import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f92168a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f92169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f92170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f92171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f92172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f92173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f92174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TypeHelper f92175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final TypeHelper f92176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ValueValidator f92177j;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92178f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof y5);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f92179f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof z5);
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f92180f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof df);
        }
    }

    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public static final class e implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92181a;

        public e(my myVar) {
            this.f92181a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression expression;
            Expression expression2;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = we.f92177j;
            Expression expression3 = we.f92169b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression3);
            if (optionalExpression != null) {
                expression3 = optionalExpression;
            }
            TypeHelper typeHelper2 = we.f92174g;
            Function1 function12 = y5.f92620e;
            Expression expression4 = we.f92170c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper2, function12, expression4);
            if (optionalExpression2 == null) {
                optionalExpression2 = expression4;
            }
            TypeHelper typeHelper3 = we.f92175h;
            Function1 function13 = z5.f92903e;
            Expression expression5 = we.f92171d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper3, function13, expression5);
            if (optionalExpression3 == null) {
                optionalExpression3 = expression5;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.f92181a.h3());
            Expression expression6 = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression7 = we.f92172e;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, function14, expression7);
            Expression expression8 = optionalExpression4 == null ? expression7 : optionalExpression4;
            TypeHelper typeHelper5 = we.f92176i;
            Function1 function15 = df.f87029e;
            Expression expression9 = we.f92173f;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper5, function15, expression9);
            if (optionalExpression5 == null) {
                expression2 = expression3;
                expression = expression9;
            } else {
                Expression expression10 = expression3;
                expression = optionalExpression5;
                expression2 = expression10;
            }
            return new ue(expression2, optionalExpression2, optionalExpression3, optionalList, expression6, expression8, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ue ueVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", ueVar.f91658a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", ueVar.f91659b, y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", ueVar.f91660c, z5.f92902d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", ueVar.f91661d, this.f92181a.h3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, ueVar.f91662e, ParsingConvertersKt.URI_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", ueVar.f91663f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", ueVar.f91664g, df.f87028d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92182a;

        public f(my myVar) {
            this.f92182a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xe deserialize(ParsingContext parsingContext, xe xeVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new xe(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, xeVar != null ? xeVar.f92349a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, we.f92177j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", we.f92174g, allowPropertyOverride, xeVar != null ? xeVar.f92350b : null, y5.f92620e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", we.f92175h, allowPropertyOverride, xeVar != null ? xeVar.f92351c : null, z5.f92903e), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, xeVar != null ? xeVar.f92352d : null, this.f92182a.i3()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, xeVar != null ? xeVar.f92353e : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, xeVar != null ? xeVar.f92354f : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", we.f92176i, allowPropertyOverride, xeVar != null ? xeVar.f92355g : null, df.f87029e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, xe xeVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", xeVar.f92349a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", xeVar.f92350b, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", xeVar.f92351c, z5.f92902d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", xeVar.f92352d, this.f92182a.i3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, xeVar.f92353e, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", xeVar.f92354f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", xeVar.f92355g, df.f87028d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
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

    public static final class g implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92183a;

        public g(my myVar) {
            this.f92183a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ue resolve(ParsingContext parsingContext, xe xeVar, JSONObject jSONObject) {
            Field field = xeVar.f92349a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = we.f92177j;
            Expression expression = we.f92169b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field field2 = xeVar.f92350b;
            TypeHelper typeHelper2 = we.f92174g;
            Function1 function12 = y5.f92620e;
            Expression expression2 = we.f92170c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "content_alignment_horizontal", typeHelper2, function12, expression2);
            if (expressionResolveOptionalExpression2 == null) {
                expressionResolveOptionalExpression2 = expression2;
            }
            Field field3 = xeVar.f92351c;
            TypeHelper typeHelper3 = we.f92175h;
            Function1 function13 = z5.f92903e;
            Expression expression3 = we.f92171d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "content_alignment_vertical", typeHelper3, function13, expression3);
            if (expressionResolveOptionalExpression3 == null) {
                expressionResolveOptionalExpression3 = expression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, xeVar.f92352d, jSONObject, "filters", this.f92183a.j3(), this.f92183a.h3());
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, xeVar.f92353e, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Field field4 = xeVar.f92354f;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression4 = we.f92172e;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "preload_required", typeHelper4, function14, expression4);
            Expression expression5 = expressionResolveOptionalExpression4 == null ? expression4 : expressionResolveOptionalExpression4;
            Field field5 = xeVar.f92355g;
            TypeHelper typeHelper5 = we.f92176i;
            Function1 function15 = df.f87029e;
            Expression expression6 = we.f92173f;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "scale", typeHelper5, function15, expression6);
            if (expressionResolveOptionalExpression5 != null) {
                expression6 = expressionResolveOptionalExpression5;
            }
            return new ue(expression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, listResolveOptionalList, expressionResolveExpression, expression5, expression6);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92169b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        y5 y5Var = y5.CENTER;
        f92170c = Expression.Companion.constant$default(companion, y5Var, null, 2, null);
        z5 z5Var = z5.CENTER;
        f92171d = Expression.Companion.constant$default(companion, z5Var, null, 2, null);
        f92172e = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        df dfVar = df.FILL;
        f92173f = Expression.Companion.constant$default(companion, dfVar, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f92174g = companion2.from(y5Var, a.f92178f);
        f92175h = companion2.from(z5Var, b.f92179f);
        f92176i = companion2.from(dfVar, c.f92180f);
        f92177j = new ValueValidator() { // from class: k8.ve
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return we.b(((Double) obj).doubleValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }
}
