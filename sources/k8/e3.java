package k8;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class e3 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87162a;

    public e3(my myVar) {
        this.f87162a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d3 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new d3(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.f87162a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.f87162a.u0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, d3 d3Var) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", d3Var.f86889a, this.f87162a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", d3Var.f86890b, this.f87162a.u0());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", NativeAdPresenter.DOWNLOAD);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", d3Var.f86891c, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
