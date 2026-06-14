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
public final class wo implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92223a;

    public wo(my myVar) {
        this.f92223a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yo deserialize(ParsingContext parsingContext, yo yoVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new yo(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, yoVar != null ? yoVar.f92756a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, yoVar != null ? yoVar.f92757b : null, this.f92223a.W6()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "stroke", allowPropertyOverride, yoVar != null ? yoVar.f92758c : null, this.f92223a.D7()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, yo yoVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", yoVar.f92756a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonFieldParser.writeField(parsingContext, jSONObject, "shape", yoVar.f92757b, this.f92223a.W6());
        JsonFieldParser.writeField(parsingContext, jSONObject, "stroke", yoVar.f92758c, this.f92223a.D7());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "shape_drawable");
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
