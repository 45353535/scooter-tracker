package k8;

import com.ironsource.C4240b4;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86183a;

    public a3(my myVar) {
        this.f86183a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c3 deserialize(ParsingContext parsingContext, c3 c3Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new c3(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.i.W, typeHelper, allowPropertyOverride, c3Var != null ? c3Var.f86607a : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, c3Var != null ? c3Var.f86608b : null, this.f86183a.i9()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, c3Var != null ? c3Var.f86609c : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, c3 c3Var) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.i.W, c3Var.f86607a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict_set_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", c3Var.f86608b, this.f86183a.i9());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", c3Var.f86609c);
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
