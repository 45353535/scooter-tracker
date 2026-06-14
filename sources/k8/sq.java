package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.lq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sq implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91099a;

    public sq(my myVar) {
        this.f91099a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lq.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new lq.c((a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_in", this.f91099a.q1()), (a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_out", this.f91099a.q1()), (y0) JsonPropertyParser.readOptional(parsingContext, jSONObject, "div", this.f91099a.M4()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "state_id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "swipe_out_actions", this.f91099a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, lq.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "animation_in", cVar.f88887a, this.f91099a.q1());
        JsonPropertyParser.write(parsingContext, jSONObject, "animation_out", cVar.f88888b, this.f91099a.q1());
        JsonPropertyParser.write(parsingContext, jSONObject, "div", cVar.f88889c, this.f91099a.M4());
        JsonPropertyParser.write(parsingContext, jSONObject, "state_id", cVar.f88890d);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "swipe_out_actions", cVar.f88891e, this.f91099a.u0());
        return jSONObject;
    }
}
