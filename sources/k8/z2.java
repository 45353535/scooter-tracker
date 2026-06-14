package k8;

import com.ironsource.C4240b4;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class z2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92856a;

    public z2(my myVar) {
        this.f92856a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y2 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new y2(JsonExpressionParser.readExpression(parsingContext, jSONObject, C4240b4.i.W, typeHelper), (fw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "value", this.f92856a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, y2 y2Var) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.i.W, y2Var.f92596a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict_set_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", y2Var.f92597b, this.f92856a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", y2Var.f92598c);
        return jSONObject;
    }
}
