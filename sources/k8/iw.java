package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.fw;
import k8.jw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class iw implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88289a;

    public iw(my myVar) {
        this.f88289a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fw resolve(ParsingContext parsingContext, jw jwVar, JSONObject jSONObject) {
        if (jwVar instanceof jw.i) {
            return new fw.i(((nz) this.f88289a.fa().getValue()).resolve(parsingContext, ((jw.i) jwVar).c(), jSONObject));
        }
        if (jwVar instanceof jw.g) {
            return new fw.g(((fy) this.f88289a.K9().getValue()).resolve(parsingContext, ((jw.g) jwVar).c(), jSONObject));
        }
        if (jwVar instanceof jw.h) {
            return new fw.h(((qy) this.f88289a.Q9().getValue()).resolve(parsingContext, ((jw.h) jwVar).c(), jSONObject));
        }
        if (jwVar instanceof jw.c) {
            return new fw.c(((x) this.f88289a.o().getValue()).resolve(parsingContext, ((jw.c) jwVar).c(), jSONObject));
        }
        if (jwVar instanceof jw.b) {
            return new fw.b(((n) this.f88289a.i().getValue()).resolve(parsingContext, ((jw.b) jwVar).c(), jSONObject));
        }
        if (jwVar instanceof jw.j) {
            return new fw.j(((xz) this.f88289a.la().getValue()).resolve(parsingContext, ((jw.j) jwVar).c(), jSONObject));
        }
        if (jwVar instanceof jw.f) {
            return new fw.f(((r0) this.f88289a.A().getValue()).resolve(parsingContext, ((jw.f) jwVar).c(), jSONObject));
        }
        if (jwVar instanceof jw.a) {
            return new fw.a(((d) this.f88289a.c().getValue()).resolve(parsingContext, ((jw.a) jwVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
