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
public final class px implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90495a;

    public px(my myVar) {
        this.f90495a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx deserialize(ParsingContext parsingContext, rx rxVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new rx(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, rxVar != null ? rxVar.f90925a : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, rxVar != null ? rxVar.f90926b : null, this.f90495a.c7()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, rxVar != null ? rxVar.f90927c : null, this.f90495a.c7()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, rx rxVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "constrained", rxVar.f90925a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "max_size", rxVar.f90926b, this.f90495a.c7());
        JsonFieldParser.writeField(parsingContext, jSONObject, "min_size", rxVar.f90927c, this.f90495a.c7());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
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
