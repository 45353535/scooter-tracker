package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87938a;

    public h0(my myVar) {
        this.f87938a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e0 resolve(ParsingContext parsingContext, i0 i0Var, JSONObject jSONObject) {
        return new e0(JsonFieldResolver.resolveExpression(parsingContext, i0Var.f88166a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
