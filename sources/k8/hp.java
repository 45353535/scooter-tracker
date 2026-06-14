package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.ep;
import k8.ip;
import k8.pi;
import k8.zc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hp implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88109a;

    public hp(my myVar) {
        this.f88109a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ep resolve(ParsingContext parsingContext, ip ipVar, JSONObject jSONObject) {
        if (ipVar instanceof ip.c) {
            return new ep.c(((zc.e) this.f88109a.y3().getValue()).resolve(parsingContext, ((ip.c) ipVar).c(), jSONObject));
        }
        if (ipVar instanceof ip.d) {
            return new ep.d(((pi.d) this.f88109a.a5().getValue()).resolve(parsingContext, ((ip.d) ipVar).c(), jSONObject));
        }
        if (ipVar instanceof ip.e) {
            return new ep.e(((qx) this.f88109a.B9().getValue()).resolve(parsingContext, ((ip.e) ipVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
