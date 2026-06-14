package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.j1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class t3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91233a;

    public t3(my myVar) {
        this.f91233a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j1.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new j1.c((j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f91233a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f91233a.u0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, j1.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "action", cVar.f88320a, this.f91233a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", cVar.f88321b, this.f91233a.u0());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", cVar.f88322c);
        return jSONObject;
    }
}
