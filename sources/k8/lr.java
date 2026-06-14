package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.dr;
import k8.rr;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class lr implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88894a;

    public lr(my myVar) {
        this.f88894a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dr resolve(ParsingContext parsingContext, rr rrVar, JSONObject jSONObject) {
        if (rrVar instanceof rr.d) {
            return new dr.d(((pr) this.f88894a.N7().getValue()).resolve(parsingContext, ((rr.d) rrVar).c(), jSONObject));
        }
        if (rrVar instanceof rr.c) {
            return new dr.c(((hr) this.f88894a.H7().getValue()).resolve(parsingContext, ((rr.c) rrVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
