package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class l3 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88744a;

    public l3(my myVar) {
        this.f88744a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i3 resolve(ParsingContext parsingContext, m3 m3Var, JSONObject jSONObject) {
        return new i3(JsonFieldResolver.resolveExpression(parsingContext, m3Var.f88930a, jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
