package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c00 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86603a;

    public c00(my myVar) {
        this.f86603a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zz resolve(ParsingContext parsingContext, d00 d00Var, JSONObject jSONObject) {
        return new zz((String) JsonFieldResolver.resolve(parsingContext, d00Var.f86879a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, d00Var.f86880b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
