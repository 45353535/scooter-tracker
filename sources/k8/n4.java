package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class n4 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f89999a;

    public n4(my myVar) {
        this.f89999a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k4 resolve(ParsingContext parsingContext, o4 o4Var, JSONObject jSONObject) {
        return new k4(JsonFieldResolver.resolveExpression(parsingContext, o4Var.f90147a, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, o4Var.f90148b, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING), (fw) JsonFieldResolver.resolve(parsingContext, o4Var.f90149c, jSONObject, "value", this.f89999a.j9(), this.f89999a.h9()));
    }
}
