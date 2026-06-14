package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90621a;

    public r0(my myVar) {
        this.f90621a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o0 resolve(ParsingContext parsingContext, s0 s0Var, JSONObject jSONObject) {
        return new o0(JsonFieldResolver.resolveExpression(parsingContext, s0Var.f90937a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }
}
