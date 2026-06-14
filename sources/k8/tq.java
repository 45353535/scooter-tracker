package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import k8.vq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class tq implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91472a;

    public tq(my myVar) {
        this.f91472a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vq.c deserialize(ParsingContext parsingContext, vq.c cVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new vq.c(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, cVar != null ? cVar.f92005a : null, this.f91472a.r1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, cVar != null ? cVar.f92006b : null, this.f91472a.r1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, cVar != null ? cVar.f92007c : null, this.f91472a.N4()), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "state_id", allowPropertyOverride, cVar != null ? cVar.f92008d : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "swipe_out_actions", allowPropertyOverride, cVar != null ? cVar.f92009e : null, this.f91472a.v0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, vq.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "animation_in", cVar.f92005a, this.f91472a.r1());
        JsonFieldParser.writeField(parsingContext, jSONObject, "animation_out", cVar.f92006b, this.f91472a.r1());
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", cVar.f92007c, this.f91472a.N4());
        JsonFieldParser.writeField(parsingContext, jSONObject, "state_id", cVar.f92008d);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "swipe_out_actions", cVar.f92009e, this.f91472a.v0());
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
