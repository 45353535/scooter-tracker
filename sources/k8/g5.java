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
import java.util.List;
import k8.h5;
import k8.z4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f87736a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeHelper f87738c;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87739f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof z4.c.d);
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
        private final my f87740a;

        public c(my myVar) {
            this.f87740a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z4.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "headers", this.f87740a.Y0());
            TypeHelper typeHelper = g5.f87738c;
            Function1 function1 = z4.c.d.f92889e;
            Expression expression = g5.f87737b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "method", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new z4.c(optionalList, expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, z4.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "headers", cVar.f92876a, this.f87740a.Y0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "method", cVar.f92877b, z4.c.d.f92888d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", cVar.f92878c, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87741a;

        public d(my myVar) {
            this.f87741a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h5.c deserialize(ParsingContext parsingContext, h5.c cVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new h5.c(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "headers", allowPropertyOverride, cVar != null ? cVar.f87972a : null, this.f87741a.Z0()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "method", g5.f87738c, allowPropertyOverride, cVar != null ? cVar.f87973b : null, z4.c.d.f92889e), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, cVar != null ? cVar.f87974c : null, ParsingConvertersKt.ANY_TO_URI));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, h5.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "headers", cVar.f87972a, this.f87741a.Z0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "method", cVar.f87973b, z4.c.d.f92888d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", cVar.f87974c, ParsingConvertersKt.URI_TO_STRING);
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
        private final my f87742a;

        public e(my myVar) {
            this.f87742a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z4.c resolve(ParsingContext parsingContext, h5.c cVar, JSONObject jSONObject) {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, cVar.f87972a, jSONObject, "headers", this.f87742a.a1(), this.f87742a.Y0());
            Field field = cVar.f87973b;
            TypeHelper typeHelper = g5.f87738c;
            Function1 function1 = z4.c.d.f92889e;
            Expression expression = g5.f87737b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "method", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new z4.c(listResolveOptionalList, expression, JsonFieldResolver.resolveExpression(parsingContext, cVar.f87974c, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        z4.c.d dVar = z4.c.d.POST;
        f87737b = Expression.Companion.constant$default(companion, dVar, null, 2, null);
        f87738c = TypeHelper.INSTANCE.from(dVar, a.f87739f);
    }
}
