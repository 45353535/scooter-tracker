package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class f2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87420a;

    public f2(my myVar) {
        this.f87420a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e2 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new e2(JsonExpressionParser.readExpression(parsingContext, jSONObject, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (fw) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f87420a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, e2 e2Var) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, FirebaseAnalytics.Param.INDEX, e2Var.f87157a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_set_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", e2Var.f87158b, this.f87420a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", e2Var.f87159c);
        return jSONObject;
    }
}
