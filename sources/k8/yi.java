package k8;

import com.mbridge.msdk.foundation.entity.CampaignEx;
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
public final class yi implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92746a;

    public yi(my myVar) {
        this.f92746a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aj deserialize(ParsingContext parsingContext, aj ajVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new aj(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, ajVar != null ? ajVar.f86255a : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "insets", allowPropertyOverride, ajVar != null ? ajVar.f86256b : null, this.f92746a.F()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, aj ajVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, ajVar.f86255a, ParsingConvertersKt.URI_TO_STRING);
        JsonFieldParser.writeField(parsingContext, jSONObject, "insets", ajVar.f86256b, this.f92746a.F());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "nine_patch_image");
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
