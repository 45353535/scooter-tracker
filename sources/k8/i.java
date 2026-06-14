package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88163a;

    public i(my myVar) {
        this.f88163a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f resolve(ParsingContext parsingContext, j jVar, JSONObject jSONObject) {
        return new f((String) JsonFieldResolver.resolve(parsingContext, jVar.f88294a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, jVar.f88295b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }
}
