package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.lq;
import k8.vq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class uq implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91708a;

    public uq(my myVar) {
        this.f91708a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lq.c resolve(ParsingContext parsingContext, vq.c cVar, JSONObject jSONObject) {
        return new lq.c((a6) JsonFieldResolver.resolveOptional(parsingContext, cVar.f92005a, jSONObject, "animation_in", this.f91708a.s1(), this.f91708a.q1()), (a6) JsonFieldResolver.resolveOptional(parsingContext, cVar.f92006b, jSONObject, "animation_out", this.f91708a.s1(), this.f91708a.q1()), (y0) JsonFieldResolver.resolveOptional(parsingContext, cVar.f92007c, jSONObject, "div", this.f91708a.O4(), this.f91708a.M4()), (String) JsonFieldResolver.resolve(parsingContext, cVar.f92008d, jSONObject, "state_id"), JsonFieldResolver.resolveOptionalList(parsingContext, cVar.f92009e, jSONObject, "swipe_out_actions", this.f91708a.w0(), this.f91708a.u0()));
    }
}
