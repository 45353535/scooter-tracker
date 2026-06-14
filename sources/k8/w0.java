package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class w0 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92076a;

    public w0(my myVar) {
        this.f92076a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t0 resolve(ParsingContext parsingContext, x0 x0Var, JSONObject jSONObject) {
        return new t0((String) JsonFieldResolver.resolve(parsingContext, x0Var.f92274a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, x0Var.f92275b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }
}
