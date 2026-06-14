package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.ng;
import k8.zf;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hg implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88012a;

    public hg(my myVar) {
        this.f88012a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zf resolve(ParsingContext parsingContext, ng ngVar, JSONObject jSONObject) {
        if (ngVar instanceof ng.d) {
            return new zf.d(((lg) this.f88012a.r4().getValue()).resolve(parsingContext, ((ng.d) ngVar).c(), jSONObject));
        }
        if (ngVar instanceof ng.c) {
            return new zf.c(((dg) this.f88012a.l4().getValue()).resolve(parsingContext, ((ng.c) ngVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
