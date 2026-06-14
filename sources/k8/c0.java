package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86602a;

    public c0(my myVar) {
        this.f86602a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z resolve(ParsingContext parsingContext, d0 d0Var, JSONObject jSONObject) {
        return new z((String) JsonFieldResolver.resolve(parsingContext, d0Var.f86874a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, d0Var.f86875b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
