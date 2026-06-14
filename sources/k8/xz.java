package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xz implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92561a;

    public xz(my myVar) {
        this.f92561a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uz resolve(ParsingContext parsingContext, yz yzVar, JSONObject jSONObject) {
        return new uz(JsonFieldResolver.resolveExpression(parsingContext, yzVar.f92830a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
