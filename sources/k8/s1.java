package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class s1 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90939a;

    public s1(my myVar) {
        this.f90939a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1 resolve(ParsingContext parsingContext, t1 t1Var, JSONObject jSONObject) {
        return new p1((String) JsonFieldResolver.resolve(parsingContext, t1Var.f91226a, jSONObject, "animator_id"));
    }
}
