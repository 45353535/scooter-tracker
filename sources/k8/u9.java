package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u9 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91649a;

    public u9(my myVar) {
        this.f91649a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w9 deserialize(ParsingContext parsingContext, w9 w9Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new w9(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, w9Var != null ? w9Var.f92120a : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "raw_text_variable", allowPropertyOverride, w9Var != null ? w9Var.f92121b : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, w9 w9Var) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CommonUrlParts.LOCALE, w9Var.f92120a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", w9Var.f92121b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "currency");
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
