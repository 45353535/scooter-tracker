package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import k8.ss;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class cs implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86844a;

    public cs(my myVar) {
        this.f86844a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ss.c deserialize(ParsingContext parsingContext, ss.c cVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new ss.c(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, cVar != null ? cVar.f91144a : null, this.f86844a.N4()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, cVar != null ? cVar.f91145b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "title_click_action", allowPropertyOverride, cVar != null ? cVar.f91146c : null, this.f86844a.v0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ss.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", cVar.f91144a, this.f86844a.N4());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "title", cVar.f91145b);
        JsonFieldParser.writeField(parsingContext, jSONObject, "title_click_action", cVar.f91146c, this.f86844a.v0());
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
