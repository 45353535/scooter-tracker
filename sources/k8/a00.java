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
public final class a00 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86181a;

    public a00(my myVar) {
        this.f86181a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zz deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new zz((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, zz zzVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", zzVar.f93034a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "url");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", zzVar.f93035b, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
