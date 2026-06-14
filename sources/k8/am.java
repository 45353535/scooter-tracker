package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class am implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86273a;

    public am(my myVar) {
        this.f86273a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zl deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new zl((oa) JsonPropertyParser.read(parsingContext, jSONObject, "x", this.f86273a.M2()), (oa) JsonPropertyParser.read(parsingContext, jSONObject, "y", this.f86273a.M2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, zl zlVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "x", zlVar.f92958a, this.f86273a.M2());
        JsonPropertyParser.write(parsingContext, jSONObject, "y", zlVar.f92959b, this.f86273a.M2());
        return jSONObject;
    }
}
