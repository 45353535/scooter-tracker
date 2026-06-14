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
public final class vo implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91969a;

    public vo(my myVar) {
        this.f91969a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uo deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new uo(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (to) JsonPropertyParser.read(parsingContext, jSONObject, "shape", this.f91969a.V6()), (ar) JsonPropertyParser.readOptional(parsingContext, jSONObject, "stroke", this.f91969a.C7()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, uo uoVar) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", uoVar.f91703a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonPropertyParser.write(parsingContext, jSONObject, "shape", uoVar.f91704b, this.f91969a.V6());
        JsonPropertyParser.write(parsingContext, jSONObject, "stroke", uoVar.f91705c, this.f91969a.C7());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
