package k8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
public final class jy implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88535a;

    public jy(my myVar) {
        this.f88535a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ly deserialize(ParsingContext parsingContext, ly lyVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new ly(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, lyVar != null ? lyVar.f88921a : null), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, lyVar != null ? lyVar.f88922b : null, ParsingConvertersKt.NUMBER_TO_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ly lyVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", lyVar.f88921a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", TypedValues.Custom.S_INT);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", lyVar.f88922b);
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
