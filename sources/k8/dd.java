package k8;

import androidx.compose.material.OutlinedTextFieldKt;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import io.appmetrica.analytics.impl.H2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class dd implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86995a;

    public dd(my myVar) {
        this.f86995a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public id deserialize(ParsingContext parsingContext, id idVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new id(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, idVar != null ? idVar.f88227a : null, this.f86995a.G1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, idVar != null ? idVar.f88228b : null, this.f86995a.M1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "next_focus_ids", allowPropertyOverride, idVar != null ? idVar.f88229c : null, this.f86995a.D3()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_blur", allowPropertyOverride, idVar != null ? idVar.f88230d : null, this.f86995a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_focus", allowPropertyOverride, idVar != null ? idVar.f88231e : null, this.f86995a.v0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, id idVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, idVar.f88227a, this.f86995a.G1());
        JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, idVar.f88228b, this.f86995a.M1());
        JsonFieldParser.writeField(parsingContext, jSONObject, "next_focus_ids", idVar.f88229c, this.f86995a.D3());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_blur", idVar.f88230d, this.f86995a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_focus", idVar.f88231e, this.f86995a.v0());
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
