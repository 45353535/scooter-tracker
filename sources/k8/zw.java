package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class zw implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f93021a;

    public zw(my myVar) {
        this.f93021a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ex deserialize(ParsingContext parsingContext, ex exVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new ex(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, com.taurusx.tax.f.a.f65992s, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, exVar != null ? exVar.f87382a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, exVar != null ? exVar.f87383b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "resolution", allowPropertyOverride, exVar != null ? exVar.f87384c : null, this.f93021a.u9()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, exVar != null ? exVar.f87385d : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ex exVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, com.taurusx.tax.f.a.f65992s, exVar.f87382a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "mime_type", exVar.f87383b);
        JsonFieldParser.writeField(parsingContext, jSONObject, "resolution", exVar.f87384c, this.f93021a.u9());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "video_source");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", exVar.f87385d, ParsingConvertersKt.URI_TO_STRING);
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
