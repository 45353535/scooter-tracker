package k8;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
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
public final class f3 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87421a;

    public f3(my myVar) {
        this.f87421a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h3 deserialize(ParsingContext parsingContext, h3 h3Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new h3(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, h3Var != null ? h3Var.f87951a : null, this.f87421a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, h3Var != null ? h3Var.f87952b : null, this.f87421a.v0()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, h3Var != null ? h3Var.f87953c : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, h3 h3Var) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", h3Var.f87951a, this.f87421a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", h3Var.f87952b, this.f87421a.v0());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", NativeAdPresenter.DOWNLOAD);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", h3Var.f87953c, ParsingConvertersKt.URI_TO_STRING);
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
