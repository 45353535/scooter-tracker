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
public final class r4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90628a;

    public r4(my myVar) {
        this.f90628a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t4 deserialize(ParsingContext parsingContext, t4 t4Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new t4(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, t4Var != null ? t4Var.f91236a : null, this.f90628a.i9()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, t4Var != null ? t4Var.f91237b : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, t4 t4Var) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_variable");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", t4Var.f91236a, this.f90628a.i9());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", t4Var.f91237b);
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
