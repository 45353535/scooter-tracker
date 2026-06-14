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
public final class ym implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92753a;

    public ym(my myVar) {
        this.f92753a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xm deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new xm(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, xm xmVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "relative");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", xmVar.f92408a);
        return jSONObject;
    }
}
