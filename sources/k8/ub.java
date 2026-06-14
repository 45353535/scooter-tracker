package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ub implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91650a;

    public ub(my myVar) {
        this.f91650a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rb resolve(ParsingContext parsingContext, vb vbVar, JSONObject jSONObject) {
        return new rb((String) JsonFieldResolver.resolve(parsingContext, vbVar.f91916a, jSONObject, "id"), (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, vbVar.f91917b, jSONObject, "params"));
    }
}
