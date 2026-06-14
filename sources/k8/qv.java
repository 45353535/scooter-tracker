package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class qv implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90616a;

    public qv(my myVar) {
        this.f90616a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public pv deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new pv();
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, pv pvVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "non_modal");
        return jSONObject;
    }
}
