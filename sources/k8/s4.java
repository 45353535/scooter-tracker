package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class s4 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90948a;

    public s4(my myVar) {
        this.f90948a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p4 resolve(ParsingContext parsingContext, t4 t4Var, JSONObject jSONObject) {
        return new p4((fw) JsonFieldResolver.resolve(parsingContext, t4Var.f91236a, jSONObject, "value", this.f90948a.j9(), this.f90948a.h9()), JsonFieldResolver.resolveExpression(parsingContext, t4Var.f91237b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
