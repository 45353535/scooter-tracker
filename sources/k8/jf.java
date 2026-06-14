package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.gf;
import k8.kf;
import k8.ma;
import k8.yq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class jf implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88420a;

    public jf(my myVar) {
        this.f88420a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gf resolve(ParsingContext parsingContext, kf kfVar, JSONObject jSONObject) {
        if (kfVar instanceof kf.c) {
            return new gf.c(((ma.d) this.f88420a.L2().getValue()).resolve(parsingContext, ((kf.c) kfVar).c(), jSONObject));
        }
        if (kfVar instanceof kf.d) {
            return new gf.d(((yq.d) this.f88420a.B7().getValue()).resolve(parsingContext, ((kf.d) kfVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
