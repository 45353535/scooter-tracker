package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class t9 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91272a;

    public t9(my myVar) {
        this.f91272a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s9 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new s9(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable"));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, s9 s9Var) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, CommonUrlParts.LOCALE, s9Var.f90977a);
        JsonPropertyParser.write(parsingContext, jSONObject, "raw_text_variable", s9Var.a());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "currency");
        return jSONObject;
    }
}
