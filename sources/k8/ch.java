package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.dh;
import k8.sc;
import k8.yg;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ch implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86741a;

    public ch(my myVar) {
        this.f86741a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yg resolve(ParsingContext parsingContext, dh dhVar, JSONObject jSONObject) {
        if (dhVar instanceof dh.d) {
            return new yg.d(((sc.d) this.f86741a.s3().getValue()).resolve(parsingContext, ((dh.d) dhVar).c(), jSONObject));
        }
        if (dhVar instanceof dh.c) {
            return new yg.c(((v9) this.f86741a.A2().getValue()).resolve(parsingContext, ((dh.c) dhVar).c(), jSONObject));
        }
        if (dhVar instanceof dh.e) {
            return new yg.e(((kl) this.f86741a.P5().getValue()).resolve(parsingContext, ((dh.e) dhVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
