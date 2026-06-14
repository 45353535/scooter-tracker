package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.n9;
import k8.oc;
import k8.r9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class q9 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90537a;

    public q9(my myVar) {
        this.f90537a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n9 resolve(ParsingContext parsingContext, r9 r9Var, JSONObject jSONObject) {
        if (r9Var instanceof r9.d) {
            return new n9.d(((wf) this.f90537a.i4().getValue()).resolve(parsingContext, ((r9.d) r9Var).c(), jSONObject));
        }
        if (r9Var instanceof r9.c) {
            return new n9.c(((oc.d) this.f90537a.p3().getValue()).resolve(parsingContext, ((r9.c) r9Var).c(), jSONObject));
        }
        throw new lf.m();
    }
}
