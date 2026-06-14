package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class qx implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90617a;

    public qx(my myVar) {
        this.f90617a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public nx resolve(ParsingContext parsingContext, rx rxVar, JSONObject jSONObject) {
        return new nx(JsonFieldResolver.resolveOptionalExpression(parsingContext, rxVar.f90925a, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (kp) JsonFieldResolver.resolveOptional(parsingContext, rxVar.f90926b, jSONObject, "max_size", this.f90617a.d7(), this.f90617a.b7()), (kp) JsonFieldResolver.resolveOptional(parsingContext, rxVar.f90927c, jSONObject, "min_size", this.f90617a.d7(), this.f90617a.b7()));
    }
}
