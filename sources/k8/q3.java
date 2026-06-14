package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class q3 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90507a;

    public q3(my myVar) {
        this.f90507a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n3 resolve(ParsingContext parsingContext, r3 r3Var, JSONObject jSONObject) {
        return new n3(JsonFieldResolver.resolveExpression(parsingContext, r3Var.f90626a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
