package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class v4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91879a;

    public v4(my myVar) {
        this.f91879a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u4 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new u4(JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, u4 u4Var) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", u4Var.f91555a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "multiple", u4Var.f91556b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }
}
