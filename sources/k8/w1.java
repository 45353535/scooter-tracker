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
public final class w1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92077a;

    public w1(my myVar) {
        this.f92077a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y1 deserialize(ParsingContext parsingContext, y1 y1Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new y1(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, y1Var != null ? y1Var.f92590a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value", allowPropertyOverride, y1Var != null ? y1Var.f92591b : null, this.f92077a.i9()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, y1Var != null ? y1Var.f92592c : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, y1 y1Var) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FirebaseAnalytics.Param.INDEX, y1Var.f92590a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_insert_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", y1Var.f92591b, this.f92077a.i9());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", y1Var.f92592c);
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
