package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class o3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90144a;

    public o3(my myVar) {
        this.f90144a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n3 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new n3(JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, n3 n3Var) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", n3Var.f89996a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "hide_tooltip");
        return jSONObject;
    }
}
