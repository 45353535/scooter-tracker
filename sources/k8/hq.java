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
public final class hq implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88110a;

    public hq(my myVar) {
        this.f88110a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gq deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new gq(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, gq gqVar) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", gqVar.f87894a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
        return jSONObject;
    }
}
