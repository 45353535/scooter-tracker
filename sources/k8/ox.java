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
public final class ox implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90280a;

    public ox(my myVar) {
        this.f90280a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public nx deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new nx(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (kp) JsonPropertyParser.readOptional(parsingContext, jSONObject, "max_size", this.f90280a.b7()), (kp) JsonPropertyParser.readOptional(parsingContext, jSONObject, "min_size", this.f90280a.b7()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, nx nxVar) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "constrained", nxVar.f90108a);
        JsonPropertyParser.write(parsingContext, jSONObject, "max_size", nxVar.f90109b, this.f90280a.b7());
        JsonPropertyParser.write(parsingContext, jSONObject, "min_size", nxVar.f90110c, this.f90280a.b7());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
