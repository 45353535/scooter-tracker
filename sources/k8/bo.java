package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.rn;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bo implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86570a;

    public bo(my myVar) {
        this.f86570a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rn.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new rn.c(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text", typeHelper), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, rn.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", cVar.f90787a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", cVar.f90788b);
        return jSONObject;
    }
}
