package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.as;
import k8.ss;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ds implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87072a;

    public ds(my myVar) {
        this.f87072a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public as.c resolve(ParsingContext parsingContext, ss.c cVar, JSONObject jSONObject) {
        return new as.c((y0) JsonFieldResolver.resolve(parsingContext, cVar.f91144a, jSONObject, "div", this.f87072a.O4(), this.f87072a.M4()), JsonFieldResolver.resolveExpression(parsingContext, cVar.f91145b, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING), (j1) JsonFieldResolver.resolveOptional(parsingContext, cVar.f91146c, jSONObject, "title_click_action", this.f87072a.w0(), this.f87072a.u0()));
    }
}
