package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class si implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91067a;

    public si(my myVar) {
        this.f91067a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ri deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ri((xc) JsonPropertyParser.read(parsingContext, jSONObject, "neighbour_page_width", this.f91067a.w3()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ri riVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "neighbour_page_width", riVar.f90738a, this.f91067a.w3());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
