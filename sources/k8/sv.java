package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sv implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91201a;

    public sv(my myVar) {
        this.f91201a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public pv resolve(ParsingContext parsingContext, tv tvVar, JSONObject jSONObject) {
        return new pv();
    }
}
