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
public final class v1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91876a;

    public v1(my myVar) {
        this.f91876a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u1 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new u1(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (fw) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.f91876a.h9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, u1 u1Var) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, FirebaseAnalytics.Param.INDEX, u1Var.f91546a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_insert_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", u1Var.f91547b, this.f91876a.h9());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", u1Var.f91548c);
        return jSONObject;
    }
}
