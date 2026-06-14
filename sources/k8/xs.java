package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import k8.xu;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xs implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92412a;

    public xs(my myVar) {
        this.f92412a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xu.c deserialize(ParsingContext parsingContext, xu.c cVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new xu.c(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, cVar != null ? cVar.f92474a : null, this.f92412a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "images", allowPropertyOverride, cVar != null ? cVar.f92475b : null, this.f92412a.n8()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, cVar != null ? cVar.f92476c : null, this.f92412a.z8()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, cVar != null ? cVar.f92477d : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, xu.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", cVar.f92474a, this.f92412a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "images", cVar.f92475b, this.f92412a.n8());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", cVar.f92476c, this.f92412a.z8());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", cVar.f92477d);
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
