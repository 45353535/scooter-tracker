package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
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
public final class b2 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86434a;

    public b2(my myVar) {
        this.f86434a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d2 deserialize(ParsingContext parsingContext, d2 d2Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new d2(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, d2Var != null ? d2Var.f86884a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, d2Var != null ? d2Var.f86885b : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, d2 d2Var) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FirebaseAnalytics.Param.INDEX, d2Var.f86884a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_remove_value");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", d2Var.f86885b);
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
