package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87682a;

    public g(my myVar) {
        this.f87682a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new f((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, f fVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", fVar.f87404a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", fVar.f87405b);
        return jSONObject;
    }
}
