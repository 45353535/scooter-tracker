package k8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class qz implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90619a;

    public qz(my myVar) {
        this.f90619a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public pz deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new pz((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, pz pzVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", pzVar.f90499a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.Custom.S_STRING);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", pzVar.f90500b);
        return jSONObject;
    }
}
