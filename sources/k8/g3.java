package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g3 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87728a;

    public g3(my myVar) {
        this.f87728a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d3 resolve(ParsingContext parsingContext, h3 h3Var, JSONObject jSONObject) {
        return new d3(JsonFieldResolver.resolveOptionalList(parsingContext, h3Var.f87951a, jSONObject, "on_fail_actions", this.f87728a.w0(), this.f87728a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, h3Var.f87952b, jSONObject, "on_success_actions", this.f87728a.w0(), this.f87728a.u0()), JsonFieldResolver.resolveExpression(parsingContext, h3Var.f87953c, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
