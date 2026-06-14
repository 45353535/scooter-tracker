package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import k8.cl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class yk implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92747a;

    public yk(my myVar) {
        this.f92747a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cl.a deserialize(ParsingContext parsingContext, cl.a aVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new cl.a(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, aVar != null ? aVar.f86752a : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, aVar != null ? aVar.f86753b : null, this.f92747a.N4()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, cl.a aVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "id", aVar.f86752a);
        JsonFieldParser.writeListField(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, aVar.f86753b, this.f92747a.N4());
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
