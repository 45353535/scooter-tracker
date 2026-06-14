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
public final class l4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88745a;

    public l4(my myVar) {
        this.f88745a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k4 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new k4(JsonExpressionParser.readExpression(parsingContext, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING), (fw) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f88745a.h9()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, k4 k4Var) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "lifetime", k4Var.f88561a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", k4Var.f88562b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_stored_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", k4Var.f88563c, this.f88745a.h9());
        return jSONObject;
    }
}
