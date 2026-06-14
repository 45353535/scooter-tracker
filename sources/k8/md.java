package k8;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class md implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88986a;

    public md(my myVar) {
        this.f88986a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ld deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ld((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), (qb) JsonPropertyParser.read(parsingContext, jSONObject, "type", qb.f90546e));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ld ldVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", ldVar.f88783a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", ldVar.f88784b, (Function1<qb, R>) qb.f90545d);
        return jSONObject;
    }
}
