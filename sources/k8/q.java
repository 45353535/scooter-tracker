package k8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90503a;

    public q(my myVar) {
        this.f90503a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new p((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, p pVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", pVar.f90288a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.Custom.S_BOOLEAN);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", pVar.f90289b);
        return jSONObject;
    }
}
