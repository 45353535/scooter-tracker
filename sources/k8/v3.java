package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.i5;
import k8.j1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class v3 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91878a;

    public v3(my myVar) {
        this.f91878a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j1.c resolve(ParsingContext parsingContext, i5.c cVar, JSONObject jSONObject) {
        return new j1.c((j1) JsonFieldResolver.resolveOptional(parsingContext, cVar.f88214a, jSONObject, "action", this.f91878a.w0(), this.f91878a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, cVar.f88215b, jSONObject, "actions", this.f91878a.w0(), this.f91878a.u0()), JsonFieldResolver.resolveExpression(parsingContext, cVar.f88216c, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
