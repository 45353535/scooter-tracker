package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ea;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ha implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87992a;

    public ha(my myVar) {
        this.f87992a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ea.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ea.c((y0) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f87992a.M4()), ((Number) JsonPropertyParser.read(parsingContext, jSONObject, "state_id", ParsingConvertersKt.NUMBER_TO_INT)).longValue());
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ea.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "div", cVar.f87215a, this.f87992a.M4());
        JsonPropertyParser.write(parsingContext, jSONObject, "state_id", Long.valueOf(cVar.f87216b));
        return jSONObject;
    }
}
