package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91551a;

    public u2(my myVar) {
        this.f91551a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o2 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new o2((p2) JsonPropertyParser.read(parsingContext, jSONObject, "content", this.f91551a.c0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, o2 o2Var) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "content", o2Var.f90141a, this.f91551a.c0());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
