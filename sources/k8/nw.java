package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.dz;
import k8.kw;
import k8.ow;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class nw implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90105a;

    public nw(my myVar) {
        this.f90105a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw resolve(ParsingContext parsingContext, ow owVar, JSONObject jSONObject) {
        if (owVar instanceof ow.j) {
            return new kw.j(((sz) this.f90105a.ia().getValue()).resolve(parsingContext, ((ow.j) owVar).c(), jSONObject));
        }
        if (owVar instanceof ow.h) {
            return new kw.h(((vy) this.f90105a.T9().getValue()).resolve(parsingContext, ((ow.h) owVar).c(), jSONObject));
        }
        if (owVar instanceof ow.g) {
            return new kw.g(((ky) this.f90105a.N9().getValue()).resolve(parsingContext, ((ow.g) owVar).c(), jSONObject));
        }
        if (owVar instanceof ow.b) {
            return new kw.b(((s) this.f90105a.l().getValue()).resolve(parsingContext, ((ow.b) owVar).c(), jSONObject));
        }
        if (owVar instanceof ow.c) {
            return new kw.c(((c0) this.f90105a.r().getValue()).resolve(parsingContext, ((ow.c) owVar).c(), jSONObject));
        }
        if (owVar instanceof ow.k) {
            return new kw.k(((c00) this.f90105a.oa().getValue()).resolve(parsingContext, ((ow.k) owVar).c(), jSONObject));
        }
        if (owVar instanceof ow.f) {
            return new kw.f(((w0) this.f90105a.D().getValue()).resolve(parsingContext, ((ow.f) owVar).c(), jSONObject));
        }
        if (owVar instanceof ow.a) {
            return new kw.a(((i) this.f90105a.f().getValue()).resolve(parsingContext, ((ow.a) owVar).c(), jSONObject));
        }
        if (owVar instanceof ow.i) {
            return new kw.i(((dz.e) this.f90105a.Z9().getValue()).resolve(parsingContext, ((ow.i) owVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
