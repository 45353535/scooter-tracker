package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import k8.i5;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91552a;

    public u3(my myVar) {
        this.f91552a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i5.c deserialize(ParsingContext parsingContext, i5.c cVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new i5.c(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, cVar != null ? cVar.f88214a : null, this.f91552a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, cVar != null ? cVar.f88215b : null, this.f91552a.v0()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, cVar != null ? cVar.f88216c : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, i5.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "action", cVar.f88214a, this.f91552a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", cVar.f88215b, this.f91552a.v0());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", cVar.f88216c);
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
