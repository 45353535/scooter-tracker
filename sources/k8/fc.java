package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.cc;
import k8.j7;
import k8.lc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class fc implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87464a;

    public fc(my myVar) {
        this.f87464a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cc resolve(ParsingContext parsingContext, lc lcVar, JSONObject jSONObject) {
        if (lcVar instanceof lc.a) {
            return new cc.a(((j7.d) this.f87464a.K1().getValue()).resolve(parsingContext, ((lc.a) lcVar).c(), jSONObject));
        }
        if (lcVar instanceof lc.d) {
            return new cc.d(((jc) this.f87464a.m3().getValue()).resolve(parsingContext, ((lc.d) lcVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
