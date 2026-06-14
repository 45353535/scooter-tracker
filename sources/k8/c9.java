package k8;

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
import k8.d9;
import k8.u8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f86632a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f86633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f86634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f86635d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86636a;

        public b(my myVar) {
            this.f86636a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u8.e deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f86636a.Y2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = c9.f86633b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_end", typeHelper, function1, expression);
            if (optionalExpression == null) {
                optionalExpression = expression;
            }
            Expression expression2 = c9.f86634c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_start", typeHelper, function1, expression2);
            if (optionalExpression2 == null) {
                optionalExpression2 = expression2;
            }
            Expression expression3 = c9.f86635d;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_between", typeHelper, function1, expression3);
            if (optionalExpression3 == null) {
                optionalExpression3 = expression3;
            }
            return new u8.e(hbVar, optionalExpression, optionalExpression2, optionalExpression3, (cb) JsonPropertyParser.read(parsingContext, jSONObject, "style", this.f86636a.V2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, u8.e eVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", eVar.f91642a, this.f86636a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_at_end", eVar.f91643b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_at_start", eVar.f91644c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_between", eVar.f91645d);
            JsonPropertyParser.write(parsingContext, jSONObject, "style", eVar.f91646e, this.f86636a.V2());
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86637a;

        public c(my myVar) {
            this.f86637a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d9.c deserialize(ParsingContext parsingContext, d9.c cVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, cVar != null ? cVar.f86960a : null, this.f86637a.Z2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = cVar != null ? cVar.f86961b : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new d9.c(optionalField, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "show_at_end", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "show_at_start", typeHelper, allowPropertyOverride, cVar != null ? cVar.f86962c : null, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "show_between", typeHelper, allowPropertyOverride, cVar != null ? cVar.f86963d : null, function1), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "style", allowPropertyOverride, cVar != null ? cVar.f86964e : null, this.f86637a.W2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, d9.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", cVar.f86960a, this.f86637a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_at_end", cVar.f86961b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_at_start", cVar.f86962c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_between", cVar.f86963d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "style", cVar.f86964e, this.f86637a.W2());
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
        private final my f86638a;

        public d(my myVar) {
            this.f86638a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u8.e resolve(ParsingContext parsingContext, d9.c cVar, JSONObject jSONObject) {
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, cVar.f86960a, jSONObject, "margins", this.f86638a.a3(), this.f86638a.Y2());
            Field field = cVar.f86961b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = c9.f86633b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "show_at_end", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Field field2 = cVar.f86962c;
            Expression expression2 = c9.f86634c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "show_at_start", typeHelper, function1, expression2);
            Expression expression3 = expressionResolveOptionalExpression2 == null ? expression2 : expressionResolveOptionalExpression2;
            Field field3 = cVar.f86963d;
            Expression expression4 = c9.f86635d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "show_between", typeHelper, function1, expression4);
            if (expressionResolveOptionalExpression3 != null) {
                expression4 = expressionResolveOptionalExpression3;
            }
            return new u8.e(hbVar, expressionResolveOptionalExpression, expression3, expression4, (cb) JsonFieldResolver.resolve(parsingContext, cVar.f86964e, jSONObject, "style", this.f86638a.X2(), this.f86638a.V2()));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Boolean bool = Boolean.FALSE;
        f86633b = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f86634c = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f86635d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
    }
}
