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
public final class g2 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87727a;

    public g2(my myVar) {
        this.f87727a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i2 deserialize(ParsingContext parsingContext, i2 i2Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new i2(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, i2Var != null ? i2Var.f88183a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, i2Var != null ? i2Var.f88184b : null, this.f87727a.i9()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, i2Var != null ? i2Var.f88185c : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, i2 i2Var) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FirebaseAnalytics.Param.INDEX, i2Var.f88183a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_set_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", i2Var.f88184b, this.f87727a.i9());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", i2Var.f88185c);
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
