package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.z4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class d5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86901a;

    public d5(my myVar) {
        this.f86901a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z4.c.C1058c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new z4.c.C1058c(JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", typeHelper), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, z4.c.C1058c c1058c) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", c1058c.f92883a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", c1058c.f92884b);
        return jSONObject;
    }
}
