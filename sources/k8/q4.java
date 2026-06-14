package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class q4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90508a;

    public q4(my myVar) {
        this.f90508a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p4 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new p4((fw) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f90508a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, p4 p4Var) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_variable");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", p4Var.f90307a, this.f90508a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", p4Var.f90308b);
        return jSONObject;
    }
}
