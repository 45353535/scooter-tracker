package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.us;
import k8.xu;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ys implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92807a;

    public ys(my myVar) {
        this.f92807a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public us.c resolve(ParsingContext parsingContext, xu.c cVar, JSONObject jSONObject) {
        return new us.c(JsonFieldResolver.resolveOptionalList(parsingContext, cVar.f92474a, jSONObject, "actions", this.f92807a.w0(), this.f92807a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, cVar.f92475b, jSONObject, "images", this.f92807a.o8(), this.f92807a.m8()), JsonFieldResolver.resolveOptionalList(parsingContext, cVar.f92476c, jSONObject, "ranges", this.f92807a.A8(), this.f92807a.y8()), JsonFieldResolver.resolveExpression(parsingContext, cVar.f92477d, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
