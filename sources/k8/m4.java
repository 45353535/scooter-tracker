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
public final class m4 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88932a;

    public m4(my myVar) {
        this.f88932a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o4 deserialize(ParsingContext parsingContext, o4 o4Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new o4(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, o4Var != null ? o4Var.f90147a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, o4Var != null ? o4Var.f90148b : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, o4Var != null ? o4Var.f90149c : null, this.f88932a.i9()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, o4 o4Var) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "lifetime", o4Var.f90147a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", o4Var.f90148b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_stored_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", o4Var.f90149c, this.f88932a.i9());
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
