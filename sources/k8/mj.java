package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class mj implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f89012a;

    public mj(my myVar) {
        this.f89012a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lj deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new lj((dl) JsonPropertyParser.read(parsingContext, jSONObject, "page_width", this.f89012a.K5()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, lj ljVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "page_width", ljVar.f88838a, this.f89012a.K5());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
