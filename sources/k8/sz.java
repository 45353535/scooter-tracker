package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sz implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91212a;

    public sz(my myVar) {
        this.f91212a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public pz resolve(ParsingContext parsingContext, tz tzVar, JSONObject jSONObject) {
        return new pz((String) JsonFieldResolver.resolve(parsingContext, tzVar.f91535a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, tzVar.f91536b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
