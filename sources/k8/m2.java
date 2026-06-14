package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class m2 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88927a;

    public m2(my myVar) {
        this.f88927a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j2 resolve(ParsingContext parsingContext, n2 n2Var, JSONObject jSONObject) {
        return new j2();
    }
}
