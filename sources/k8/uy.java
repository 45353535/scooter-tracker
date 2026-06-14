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
public final class uy implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91868a;

    public uy(my myVar) {
        this.f91868a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wy deserialize(ParsingContext parsingContext, wy wyVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new wy(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, wyVar != null ? wyVar.f92267a : null), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, wyVar != null ? wyVar.f92268b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, wy wyVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", wyVar.f92267a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "number");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", wyVar.f92268b);
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
