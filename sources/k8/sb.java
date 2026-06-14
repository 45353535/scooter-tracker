package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sb implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90981a;

    public sb(my myVar) {
        this.f90981a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rb deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new rb((String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "params"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, rb rbVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "id", rbVar.f90670a);
        JsonPropertyParser.write(parsingContext, jSONObject, "params", rbVar.f90671b);
        return jSONObject;
    }
}
