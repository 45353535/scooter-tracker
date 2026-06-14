package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bm implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86565a;

    public bm(my myVar) {
        this.f86565a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dm deserialize(ParsingContext parsingContext, dm dmVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new dm(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "x", allowPropertyOverride, dmVar != null ? dmVar.f87057a : null, this.f86565a.N2()), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "y", allowPropertyOverride, dmVar != null ? dmVar.f87058b : null, this.f86565a.N2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, dm dmVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "x", dmVar.f87057a, this.f86565a.N2());
        JsonFieldParser.writeField(parsingContext, jSONObject, "y", dmVar.f87058b, this.f86565a.N2());
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
