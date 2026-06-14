package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ab implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86226a;

    public ab(my myVar) {
        this.f86226a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xa resolve(ParsingContext parsingContext, bb bbVar, JSONObject jSONObject) {
        return new xa(JsonFieldResolver.resolveOptionalList(parsingContext, bbVar.f86489a, jSONObject, "on_fail_actions", this.f86226a.w0(), this.f86226a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, bbVar.f86490b, jSONObject, "on_success_actions", this.f86226a.w0(), this.f86226a.u0()));
    }
}
