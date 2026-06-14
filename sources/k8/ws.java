package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.us;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ws implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92232a;

    public ws(my myVar) {
        this.f92232a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public us.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new us.c(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f92232a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "images", this.f92232a.m8()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.f92232a.y8()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, us.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", cVar.f91764a, this.f92232a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "images", cVar.f91765b, this.f92232a.m8());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", cVar.f91766c, this.f92232a.y8());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", cVar.f91767d);
        return jSONObject;
    }
}
