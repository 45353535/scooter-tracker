package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import k8.ka;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ia implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88223a;

    public ia(my myVar) {
        this.f88223a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ka.c deserialize(ParsingContext parsingContext, ka.c cVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new ka.c(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, cVar != null ? cVar.f88606a : null, this.f88223a.N4()), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "state_id", allowPropertyOverride, cVar != null ? cVar.f88607b : null, ParsingConvertersKt.NUMBER_TO_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ka.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", cVar.f88606a, this.f88223a.N4());
        JsonFieldParser.writeField(parsingContext, jSONObject, "state_id", cVar.f88607b);
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
