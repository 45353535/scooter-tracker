package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.ac;
import k8.p6;
import k8.pn;
import k8.r6;
import k8.rp;
import k8.v6;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u6 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91565a;

    public u6(my myVar) {
        this.f91565a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r6 resolve(ParsingContext parsingContext, v6 v6Var, JSONObject jSONObject) {
        if (v6Var instanceof v6.e) {
            return new r6.e(((p6.d) this.f91565a.y1().getValue()).resolve(parsingContext, ((v6.e) v6Var).c(), jSONObject));
        }
        if (v6Var instanceof v6.c) {
            return new r6.c(((ac.e) this.f91565a.g3().getValue()).resolve(parsingContext, ((v6.c) v6Var).c(), jSONObject));
        }
        if (v6Var instanceof v6.d) {
            return new r6.d(((pn.e) this.f91565a.C6().getValue()).resolve(parsingContext, ((v6.d) v6Var).c(), jSONObject));
        }
        if (v6Var instanceof v6.f) {
            return new r6.f(((rp.f) this.f91565a.g7().getValue()).resolve(parsingContext, ((v6.f) v6Var).c(), jSONObject));
        }
        throw new lf.m();
    }
}
