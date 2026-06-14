package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ya implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92641a;

    public ya(my myVar) {
        this.f92641a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xa deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new xa(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.f92641a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.f92641a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, xa xaVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", xaVar.f92331a, this.f92641a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", xaVar.f92332b, this.f92641a.u0());
        return jSONObject;
    }
}
