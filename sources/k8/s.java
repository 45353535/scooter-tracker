package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90934a;

    public s(my myVar) {
        this.f90934a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p resolve(ParsingContext parsingContext, t tVar, JSONObject jSONObject) {
        return new p((String) JsonFieldResolver.resolve(parsingContext, tVar.f91215a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, tVar.f91216b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}
