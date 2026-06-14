package k8;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xi implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92400a;

    public xi(my myVar) {
        this.f92400a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wi deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new wi(JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI), (z0) JsonPropertyParser.read(parsingContext, jSONObject, "insets", this.f92400a.E()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, wi wiVar) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, wiVar.f92188a, ParsingConvertersKt.URI_TO_STRING);
        JsonPropertyParser.write(parsingContext, jSONObject, "insets", wiVar.f92189b, this.f92400a.E());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
