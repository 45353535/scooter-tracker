package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class x4 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92292a;

    public x4(my myVar) {
        this.f92292a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u4 resolve(ParsingContext parsingContext, y4 y4Var, JSONObject jSONObject) {
        return new u4(JsonFieldResolver.resolveExpression(parsingContext, y4Var.f92615a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalExpression(parsingContext, y4Var.f92616b, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}
