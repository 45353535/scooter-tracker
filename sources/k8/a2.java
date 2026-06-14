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
public final class a2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86182a;

    public a2(my myVar) {
        this.f86182a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z1 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new z1(JsonExpressionParser.readExpression(parsingContext, jSONObject, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, z1 z1Var) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, FirebaseAnalytics.Param.INDEX, z1Var.f92852a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_remove_value");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", z1Var.f92853b);
        return jSONObject;
    }
}
