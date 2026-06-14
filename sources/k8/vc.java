package k8;

import com.ironsource.C4240b4;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import k8.qc;
import k8.wc;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f91919a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f91920b = Expression.Companion.constant$default(Expression.INSTANCE, "_", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ValueValidator f91921c = new ValueValidator() { // from class: k8.tc
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return vc.c((String) obj);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ValueValidator f91922d = new ValueValidator() { // from class: k8.uc
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return vc.d((String) obj);
        }
    };

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f91923a;

        public b(my myVar) {
            this.f91923a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qc.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, C4240b4.i.W, typeHelper, vc.f91921c);
            ValueValidator valueValidator = vc.f91922d;
            Expression expression2 = vc.f91920b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder", typeHelper, valueValidator, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            return new qc.c(expression, expression2, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "regex", typeHelper));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, qc.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.i.W, cVar.f90572a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder", cVar.f90573b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "regex", cVar.f90574c);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f91924a;

        public c(my myVar) {
            this.f91924a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wc.c deserialize(ParsingContext parsingContext, wc.c cVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new wc.c(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.i.W, typeHelper, allowPropertyOverride, cVar != null ? cVar.f92164a : null, vc.f91921c), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "placeholder", typeHelper, allowPropertyOverride, cVar != null ? cVar.f92165b : null, vc.f91922d), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "regex", typeHelper, allowPropertyOverride, cVar != null ? cVar.f92166c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, wc.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.i.W, cVar.f92164a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder", cVar.f92165b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "regex", cVar.f92166c);
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
        private final my f91925a;

        public d(my myVar) {
            this.f91925a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qc.c resolve(ParsingContext parsingContext, wc.c cVar, JSONObject jSONObject) {
            Field field = cVar.f92164a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, C4240b4.i.W, typeHelper, vc.f91921c);
            Field field2 = cVar.f92165b;
            ValueValidator valueValidator = vc.f91922d;
            Expression expression = vc.f91920b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "placeholder", typeHelper, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new qc.c(expressionResolveExpression, expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar.f92166c, jSONObject, "regex", typeHelper));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(String str) {
        return str.length() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(String str) {
        return str.length() >= 1;
    }
}
