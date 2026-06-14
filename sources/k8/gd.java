package k8;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import k8.id;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class gd implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87802a;

    public gd(my myVar) {
        this.f87802a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public id.c deserialize(ParsingContext parsingContext, id.c cVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new id.c(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "down", typeHelper, allowPropertyOverride, cVar != null ? cVar.f88235a : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ToolBar.FORWARD, typeHelper, allowPropertyOverride, cVar != null ? cVar.f88236b : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, cVar != null ? cVar.f88237c : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, cVar != null ? cVar.f88238d : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "up", typeHelper, allowPropertyOverride, cVar != null ? cVar.f88239e : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, id.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "down", cVar.f88235a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ToolBar.FORWARD, cVar.f88236b);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", cVar.f88237c);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", cVar.f88238d);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "up", cVar.f88239e);
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
