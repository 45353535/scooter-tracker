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
import k8.k8;
import k8.o8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f90013a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90014b = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90015a;

        public b(my myVar) {
            this.f90015a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k8.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            y0 y0Var = (y0) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f90015a.M4());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = n8.f90014b;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selector", typeHelper, function1, expression);
            if (optionalExpression2 != null) {
                expression = optionalExpression2;
            }
            return new k8.c(y0Var, optionalExpression, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, k8.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "div", cVar.f88588a, this.f90015a.M4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", cVar.f88589b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selector", cVar.f88590c);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90016a;

        public c(my myVar) {
            this.f90016a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o8.c deserialize(ParsingContext parsingContext, o8.c cVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new o8.c(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, cVar != null ? cVar.f90171a : null, this.f90016a.N4()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, cVar != null ? cVar.f90172b : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selector", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, cVar != null ? cVar.f90173c : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, o8.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "div", cVar.f90171a, this.f90016a.N4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", cVar.f90172b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selector", cVar.f90173c);
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
        private final my f90017a;

        public d(my myVar) {
            this.f90017a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k8.c resolve(ParsingContext parsingContext, o8.c cVar, JSONObject jSONObject) {
            y0 y0Var = (y0) JsonFieldResolver.resolve(parsingContext, cVar.f90171a, jSONObject, "div", this.f90017a.O4(), this.f90017a.M4());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar.f90172b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field = cVar.f90173c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = n8.f90014b;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "selector", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression2 != null) {
                expression = expressionResolveOptionalExpression2;
            }
            return new k8.c(y0Var, expressionResolveOptionalExpression, expression);
        }
    }
}
