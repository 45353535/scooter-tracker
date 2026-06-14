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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f90215a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeHelper f90217c;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90218f = new a();

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
        private final my f90219a;

        public c(my myVar) {
            this.f90219a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public nl deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper typeHelper = ol.f90217c;
            Function1 function1 = jp.f88507e;
            Expression expression = ol.f90216b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new nl(expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, nl nlVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pivot-fixed");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", nlVar.f90051a, jp.f88506d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", nlVar.f90052b);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90220a;

        public d(my myVar) {
            this.f90220a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public pl deserialize(ParsingContext parsingContext, pl plVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new pl(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "unit", ol.f90217c, allowPropertyOverride, plVar != null ? plVar.f90423a : null, jp.f88507e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, plVar != null ? plVar.f90424b : null, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, pl plVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pivot-fixed");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", plVar.f90423a, jp.f88506d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", plVar.f90424b);
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
        private final my f90221a;

        public e(my myVar) {
            this.f90221a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public nl resolve(ParsingContext parsingContext, pl plVar, JSONObject jSONObject) {
            Field field = plVar.f90423a;
            TypeHelper typeHelper = ol.f90217c;
            Function1 function1 = jp.f88507e;
            Expression expression = ol.f90216b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new nl(expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, plVar.f90424b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        jp jpVar = jp.DP;
        f90216b = Expression.Companion.constant$default(companion, jpVar, null, 2, null);
        f90217c = TypeHelper.INSTANCE.from(jpVar, a.f90218f);
    }
}
