package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.qk;
import k8.uk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class tk implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91401a;

    public tk(my myVar) {
        this.f91401a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qk resolve(ParsingContext parsingContext, uk ukVar, JSONObject jSONObject) {
        if (ukVar instanceof uk.e) {
            return new qk.e(((oj) this.f91401a.p5().getValue()).resolve(parsingContext, ((uk.e) ukVar).c(), jSONObject));
        }
        if (ukVar instanceof uk.c) {
            return new qk.c(((ui) this.f91401a.d5().getValue()).resolve(parsingContext, ((uk.c) ukVar).c(), jSONObject));
        }
        if (ukVar instanceof uk.d) {
            return new qk.d(((jj) this.f91401a.m5().getValue()).resolve(parsingContext, ((uk.d) ukVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
