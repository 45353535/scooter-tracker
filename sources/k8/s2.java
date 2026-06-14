package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.p2;
import k8.t2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class s2 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90940a;

    public s2(my myVar) {
        this.f90940a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p2 resolve(ParsingContext parsingContext, t2 t2Var, JSONObject jSONObject) {
        if (t2Var instanceof t2.c) {
            return new p2.c(((h0) this.f90940a.u().getValue()).resolve(parsingContext, ((t2.c) t2Var).c(), jSONObject));
        }
        if (t2Var instanceof t2.d) {
            return new p2.d(((m0) this.f90940a.x().getValue()).resolve(parsingContext, ((t2.d) t2Var).c(), jSONObject));
        }
        throw new lf.m();
    }
}
