package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class za implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92917a;

    public za(my myVar) {
        this.f92917a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bb deserialize(ParsingContext parsingContext, bb bbVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new bb(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, bbVar != null ? bbVar.f86489a : null, this.f92917a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, bbVar != null ? bbVar.f86490b : null, this.f92917a.v0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, bb bbVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", bbVar.f86489a, this.f92917a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", bbVar.f86490b, this.f92917a.v0());
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
