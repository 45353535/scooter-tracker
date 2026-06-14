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
public final class bg implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86521a;

    public bg(my myVar) {
        this.f86521a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ag deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ag(JsonExpressionParser.readExpression(parsingContext, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ag agVar) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "condition", agVar.f86248a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
        return jSONObject;
    }
}
