package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class jj implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88430a;

    public jj(my myVar) {
        this.f88430a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gj resolve(ParsingContext parsingContext, kj kjVar, JSONObject jSONObject) {
        return new gj();
    }
}
