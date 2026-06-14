package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class vx implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92072a;

    public vx(my myVar) {
        this.f92072a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sx resolve(ParsingContext parsingContext, wx wxVar, JSONObject jSONObject) {
        return new sx();
    }
}
