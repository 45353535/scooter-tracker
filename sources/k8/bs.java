package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.as;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bs implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86573a;

    public bs(my myVar) {
        this.f86573a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public as.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new as.c((y0) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f86573a.M4()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING), (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "title_click_action", this.f86573a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, as.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "div", cVar.f86355a, this.f86573a.M4());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "title", cVar.f86356b);
        JsonPropertyParser.write(parsingContext, jSONObject, "title_click_action", cVar.f86357c, this.f86573a.u0());
        return jSONObject;
    }
}
