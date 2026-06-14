package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.z4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c5 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86612a;

    public c5(my myVar) {
        this.f86612a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z4 resolve(ParsingContext parsingContext, h5 h5Var, JSONObject jSONObject) {
        return new z4(JsonFieldResolver.resolveExpression(parsingContext, h5Var.f87964a, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalList(parsingContext, h5Var.f87965b, jSONObject, "on_fail_actions", this.f86612a.w0(), this.f86612a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, h5Var.f87966c, jSONObject, "on_success_actions", this.f86612a.w0(), this.f86612a.u0()), (z4.c) JsonFieldResolver.resolve(parsingContext, h5Var.f87967d, jSONObject, "request", this.f86612a.d1(), this.f86612a.b1()));
    }
}
