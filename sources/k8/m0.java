package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88926a;

    public m0(my myVar) {
        this.f88926a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j0 resolve(ParsingContext parsingContext, n0 n0Var, JSONObject jSONObject) {
        return new j0(JsonFieldResolver.resolveExpression(parsingContext, n0Var.f89979a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
