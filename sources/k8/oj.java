package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class oj implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90214a;

    public oj(my myVar) {
        this.f90214a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lj resolve(ParsingContext parsingContext, pj pjVar, JSONObject jSONObject) {
        return new lj((dl) JsonFieldResolver.resolve(parsingContext, pjVar.f90386a, jSONObject, "page_width", this.f90214a.M5(), this.f90214a.K5()));
    }
}
