package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class q1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90505a;

    public q1(my myVar) {
        this.f90505a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new p1((String) JsonPropertyParser.read(parsingContext, jSONObject, "animator_id"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, p1 p1Var) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "animator_id", p1Var.f90295a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_stop");
        return jSONObject;
    }
}
