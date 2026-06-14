package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import k8.us;
import k8.xu;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class et {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f87368a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final us.d.a.c f87369b = us.d.a.c.AUTO;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87370a;

        public b(my myVar) {
            this.f87370a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public us.d.a deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "description", TypeHelpersKt.TYPE_HELPER_STRING);
            us.d.a.c cVar = (us.d.a.c) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", us.d.a.c.f91798e);
            if (cVar == null) {
                cVar = et.f87369b;
            }
            return new us.d.a(optionalExpression, cVar);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, us.d.a aVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "description", aVar.f91792a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", aVar.f91793b, (Function1<us.d.a.c, R>) us.d.a.c.f91797d);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87371a;

        public c(my myVar) {
            this.f87371a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xu.d.a deserialize(ParsingContext parsingContext, xu.d.a aVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new xu.d.a(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, aVar != null ? aVar.f92500a : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "type", allowPropertyOverride, aVar != null ? aVar.f92501b : null, us.d.a.c.f91798e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, xu.d.a aVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "description", aVar.f92500a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "type", aVar.f92501b, us.d.a.c.f91797d);
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
        private final my f87372a;

        public d(my myVar) {
            this.f87372a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public us.d.a resolve(ParsingContext parsingContext, xu.d.a aVar, JSONObject jSONObject) {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, aVar.f92500a, jSONObject, "description", TypeHelpersKt.TYPE_HELPER_STRING);
            us.d.a.c cVar = (us.d.a.c) JsonFieldResolver.resolveOptional(parsingContext, aVar.f92501b, jSONObject, "type", us.d.a.c.f91798e);
            if (cVar == null) {
                cVar = et.f87369b;
            }
            return new us.d.a(expressionResolveOptionalExpression, cVar);
        }
    }
}
