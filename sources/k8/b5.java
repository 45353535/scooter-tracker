package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b5 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86437a;

    public b5(my myVar) {
        this.f86437a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h5 deserialize(ParsingContext parsingContext, h5 h5Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new h5(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, h5Var != null ? h5Var.f87964a : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, h5Var != null ? h5Var.f87965b : null, this.f86437a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, h5Var != null ? h5Var.f87966c : null, this.f86437a.v0()), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "request", allowPropertyOverride, h5Var != null ? h5Var.f87967d : null, this.f86437a.c1()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, h5 h5Var) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "container_id", h5Var.f87964a);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", h5Var.f87965b, this.f86437a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", h5Var.f87966c, this.f86437a.v0());
        JsonFieldParser.writeField(parsingContext, jSONObject, "request", h5Var.f87967d, this.f86437a.c1());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "submit");
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
