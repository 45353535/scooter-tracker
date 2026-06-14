package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.ej;
import k8.h6;
import k8.m6;
import k8.s8;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class l6 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88751a;

    public l6(my myVar) {
        this.f88751a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h6 resolve(ParsingContext parsingContext, m6 m6Var, JSONObject jSONObject) {
        if (m6Var instanceof m6.a) {
            return new h6.a(((s8.f) this.f88751a.l2().getValue()).resolve(parsingContext, ((m6.a) m6Var).c(), jSONObject));
        }
        if (m6Var instanceof m6.d) {
            return new h6.d(((ej.f) this.f88751a.j5().getValue()).resolve(parsingContext, ((m6.d) m6Var).c(), jSONObject));
        }
        throw new lf.m();
    }
}
