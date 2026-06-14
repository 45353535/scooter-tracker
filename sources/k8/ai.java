package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ai implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86252a;

    public ai(my myVar) {
        this.f86252a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zh deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new zh((String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height_variable_name"), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width_variable_name"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, zh zhVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "height_variable_name", zhVar.f92934a);
        JsonPropertyParser.write(parsingContext, jSONObject, "width_variable_name", zhVar.f92935b);
        return jSONObject;
    }
}
