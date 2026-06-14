package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.fm;
import k8.jm;
import k8.nm;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class im implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88260a;

    public im(my myVar) {
        this.f88260a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fm resolve(ParsingContext parsingContext, jm jmVar, JSONObject jSONObject) {
        if (jmVar instanceof jm.c) {
            return new fm.c(((nm.e) this.f88260a.k6().getValue()).resolve(parsingContext, ((jm.c) jmVar).c(), jSONObject));
        }
        if (jmVar instanceof jm.d) {
            return new fm.d(((an) this.f88260a.t6().getValue()).resolve(parsingContext, ((jm.d) jmVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
