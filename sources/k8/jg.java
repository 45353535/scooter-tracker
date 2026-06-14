package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class jg implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88421a;

    public jg(my myVar) {
        this.f88421a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ig deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ig(JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ig igVar) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", igVar.f88244a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
        return jSONObject;
    }
}
