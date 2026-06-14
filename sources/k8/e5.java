package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import k8.h5;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class e5 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87171a;

    public e5(my myVar) {
        this.f87171a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h5.c.C1042c deserialize(ParsingContext parsingContext, h5.c.C1042c c1042c, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new h5.c.C1042c(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "name", typeHelper, allowPropertyOverride, c1042c != null ? c1042c.f87978a : null), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, c1042c != null ? c1042c.f87979b : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, h5.c.C1042c c1042c) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", c1042c.f87978a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", c1042c.f87979b);
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
