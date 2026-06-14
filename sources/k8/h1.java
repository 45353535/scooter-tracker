package k8;

import com.ironsource.C4240b4;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import k8.g1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f87939a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f87941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1.d f87942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeHelper f87943e;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87944f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof g1.c);
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
        private final my f87945a;

        public c(my myVar) {
            this.f87945a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g1 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "description", typeHelper);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint", typeHelper);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_checked", typeHelper2, function1);
            TypeHelper typeHelper3 = h1.f87943e;
            Function1 function12 = g1.c.f87700e;
            Expression expression = h1.f87940b;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C4240b4.a.f42515t, typeHelper3, function12, expression);
            Expression expression2 = optionalExpression4 == null ? expression : optionalExpression4;
            Expression expression3 = h1.f87941c;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "mute_after_action", typeHelper2, function1, expression3);
            if (optionalExpression5 != null) {
                expression3 = optionalExpression5;
            }
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "state_description", typeHelper);
            g1.d dVar = (g1.d) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", g1.d.f87710e);
            if (dVar == null) {
                dVar = h1.f87942d;
            }
            return new g1(optionalExpression, optionalExpression2, optionalExpression3, expression2, expression3, optionalExpression6, dVar);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, g1 g1Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "description", g1Var.f87689a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint", g1Var.f87690b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_checked", g1Var.f87691c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.a.f42515t, g1Var.f87692d, g1.c.f87699d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "mute_after_action", g1Var.f87693e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "state_description", g1Var.f87694f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", g1Var.f87695g, (Function1<g1.d, R>) g1.d.f87709d);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87946a;

        public d(my myVar) {
            this.f87946a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i1 deserialize(ParsingContext parsingContext, i1 i1Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "description", typeHelper, allowPropertyOverride, i1Var != null ? i1Var.f88173a : null);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint", typeHelper, allowPropertyOverride, i1Var != null ? i1Var.f88174b : null);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = i1Var != null ? i1Var.f88175c : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new i1(optionalFieldWithExpression, optionalFieldWithExpression2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_checked", typeHelper2, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.a.f42515t, h1.f87943e, allowPropertyOverride, i1Var != null ? i1Var.f88176d : null, g1.c.f87700e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "mute_after_action", typeHelper2, allowPropertyOverride, i1Var != null ? i1Var.f88177e : null, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "state_description", typeHelper, allowPropertyOverride, i1Var != null ? i1Var.f88178f : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "type", allowPropertyOverride, i1Var != null ? i1Var.f88179g : null, g1.d.f87710e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, i1 i1Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "description", i1Var.f88173a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint", i1Var.f88174b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_checked", i1Var.f88175c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.a.f42515t, i1Var.f88176d, g1.c.f87699d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "mute_after_action", i1Var.f88177e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "state_description", i1Var.f88178f);
            JsonFieldParser.writeField(parsingContext, jSONObject, "type", i1Var.f88179g, g1.d.f87709d);
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
        private final my f87947a;

        public e(my myVar) {
            this.f87947a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g1 resolve(ParsingContext parsingContext, i1 i1Var, JSONObject jSONObject) {
            Field field = i1Var.f88173a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "description", typeHelper);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, i1Var.f88174b, jSONObject, "hint", typeHelper);
            Field field2 = i1Var.f88175c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "is_checked", typeHelper2, function1);
            Field field3 = i1Var.f88176d;
            TypeHelper typeHelper3 = h1.f87943e;
            Function1 function12 = g1.c.f87700e;
            Expression expression = h1.f87940b;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, C4240b4.a.f42515t, typeHelper3, function12, expression);
            Expression expression2 = expressionResolveOptionalExpression4 == null ? expression : expressionResolveOptionalExpression4;
            Field field4 = i1Var.f88177e;
            Expression expression3 = h1.f87941c;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "mute_after_action", typeHelper2, function1, expression3);
            Expression expression4 = expressionResolveOptionalExpression5 == null ? expression3 : expressionResolveOptionalExpression5;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, i1Var.f88178f, jSONObject, "state_description", typeHelper);
            g1.d dVar = (g1.d) JsonFieldResolver.resolveOptional(parsingContext, i1Var.f88179g, jSONObject, "type", g1.d.f87710e);
            if (dVar == null) {
                dVar = h1.f87942d;
            }
            return new g1(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expression2, expression4, expressionResolveOptionalExpression6, dVar);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        g1.c cVar = g1.c.DEFAULT;
        f87940b = Expression.Companion.constant$default(companion, cVar, null, 2, null);
        f87941c = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f87942d = g1.d.AUTO;
        f87943e = TypeHelper.INSTANCE.from(cVar, a.f87944f);
    }
}
