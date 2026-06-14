package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class cg implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86740a;

    public cg(my myVar) {
        this.f86740a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public eg deserialize(ParsingContext parsingContext, eg egVar, JSONObject jSONObject) {
        return new eg(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, parsingContext.getAllowPropertyOverride(), egVar != null ? egVar.f87308a : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, eg egVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "condition", egVar.f87308a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer, com.yandex.div.serialization.Deserializer
    public /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, Object obj) {
        return h8.b.a(this, parsingContext, obj);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
        return deserialize(parsingContext, obj);
    }
}
