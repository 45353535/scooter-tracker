package k8;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import k8.as;
import k8.ss;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88895a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xc f88896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xc f88897c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88898a;

        public b(my myVar) {
            this.f88898a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public as.d deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            xc xcVar = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f88898a.w3());
            if (xcVar == null) {
                xcVar = ls.f88896b;
            }
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            xc xcVar2 = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f88898a.w3());
            if (xcVar2 == null) {
                xcVar2 = ls.f88897c;
            }
            return new as.d(xcVar, expression, xcVar2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, as.d dVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "height", dVar.f86364a, this.f88898a.w3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, dVar.f86365b, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", dVar.f86366c, this.f88898a.w3());
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88899a;

        public c(my myVar) {
            this.f88899a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ss.d deserialize(ParsingContext parsingContext, ss.d dVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new ss.d(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, dVar != null ? dVar.f91152a : null, this.f88899a.x3()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, dVar != null ? dVar.f91153b : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, dVar != null ? dVar.f91154c : null, this.f88899a.x3()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ss.d dVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", dVar.f91152a, this.f88899a.x3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, dVar.f91153b, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", dVar.f91154c, this.f88899a.x3());
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
        private final my f88900a;

        public d(my myVar) {
            this.f88900a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public as.d resolve(ParsingContext parsingContext, ss.d dVar, JSONObject jSONObject) {
            xc xcVar = (xc) JsonFieldResolver.resolveOptional(parsingContext, dVar.f91152a, jSONObject, "height", this.f88900a.y3(), this.f88900a.w3());
            if (xcVar == null) {
                xcVar = ls.f88896b;
            }
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, dVar.f91153b, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            xc xcVar2 = (xc) JsonFieldResolver.resolveOptional(parsingContext, dVar.f91154c, jSONObject, "width", this.f88900a.y3(), this.f88900a.w3());
            if (xcVar2 == null) {
                xcVar2 = ls.f88897c;
            }
            return new as.d(xcVar, expressionResolveExpression, xcVar2);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f88896b = new xc(null, Expression.Companion.constant$default(companion, 12L, null, 2, null), 1, null);
        f88897c = new xc(null, Expression.Companion.constant$default(companion, 12L, null, 2, null), 1, null);
    }
}
