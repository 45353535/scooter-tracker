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
public final class w4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92101a;

    public w4(my myVar) {
        this.f92101a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y4 deserialize(ParsingContext parsingContext, y4 y4Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new y4(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, y4Var != null ? y4Var.f92615a : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, y4Var != null ? y4Var.f92616b : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, y4 y4Var) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", y4Var.f92615a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "multiple", y4Var.f92616b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "show_tooltip");
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
