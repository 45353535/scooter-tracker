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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class yq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f92781a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xc f92782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f92783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ValueValidator f92784d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92785a;

        public b(my myVar) {
            this.f92785a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wq deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            xc xcVar = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", this.f92785a.w3());
            if (xcVar == null) {
                xcVar = yq.f92782b;
            }
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = yq.f92784d;
            Expression expression = yq.f92783c;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_items", typeHelper, function1, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new wq(xcVar, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, wq wqVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "item_spacing", wqVar.f92228a, this.f92785a.w3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_visible_items", wqVar.f92229b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92786a;

        public c(my myVar) {
            this.f92786a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public zq deserialize(ParsingContext parsingContext, zq zqVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new zq(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, zqVar != null ? zqVar.f92969a : null, this.f92786a.x3()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_visible_items", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, zqVar != null ? zqVar.f92970b : null, ParsingConvertersKt.NUMBER_TO_INT, yq.f92784d));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, zq zqVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_spacing", zqVar.f92969a, this.f92786a.x3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_visible_items", zqVar.f92970b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "stretch");
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
        private final my f92787a;

        public d(my myVar) {
            this.f92787a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wq resolve(ParsingContext parsingContext, zq zqVar, JSONObject jSONObject) {
            xc xcVar = (xc) JsonFieldResolver.resolveOptional(parsingContext, zqVar.f92969a, jSONObject, "item_spacing", this.f92787a.y3(), this.f92787a.w3());
            if (xcVar == null) {
                xcVar = yq.f92782b;
            }
            Field field = zqVar.f92970b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = yq.f92784d;
            Expression expression = yq.f92783c;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "max_visible_items", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new wq(xcVar, expression);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92782b = new xc(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f92783c = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        f92784d = new ValueValidator() { // from class: k8.xq
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return yq.b(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j10) {
        return j10 > 0;
    }
}
