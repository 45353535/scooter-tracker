package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import k8.cq;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class aq implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86307a;

    public aq(my myVar) {
        this.f86307a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cq.c deserialize(ParsingContext parsingContext, cq.c cVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field field = cVar != null ? cVar.f86812a : null;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        return new cq.c(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, cVar != null ? cVar.f86813b : null, this.f86307a.Z2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", typeHelper, allowPropertyOverride, cVar != null ? cVar.f86814c : null, function1), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, cVar != null ? cVar.f86815d : null, this.f86307a.W2()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, cVar != null ? cVar.f86816e : null, this.f86307a.W2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, cq.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", cVar.f86812a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "margins", cVar.f86813b, this.f86307a.Z2());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", cVar.f86814c);
        JsonFieldParser.writeField(parsingContext, jSONObject, "track_active_style", cVar.f86815d, this.f86307a.W2());
        JsonFieldParser.writeField(parsingContext, jSONObject, "track_inactive_style", cVar.f86816e, this.f86307a.W2());
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
