package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.z4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86185a;

    public a5(my myVar) {
        this.f86185a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z4 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new z4(JsonExpressionParser.readExpression(parsingContext, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.f86185a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.f86185a.u0()), (z4.c) JsonPropertyParser.read(parsingContext, jSONObject, "request", this.f86185a.b1()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, z4 z4Var) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "container_id", z4Var.f92867a);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", z4Var.f92868b, this.f86185a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", z4Var.f92869c, this.f86185a.u0());
        JsonPropertyParser.write(parsingContext, jSONObject, "request", z4Var.f92870d, this.f86185a.b1());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "submit");
        return jSONObject;
    }
}
