package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.cp;
import k8.e8;
import k8.hn;
import k8.to;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bp implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86571a;

    public bp(my myVar) {
        this.f86571a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public to resolve(ParsingContext parsingContext, cp cpVar, JSONObject jSONObject) {
        if (cpVar instanceof cp.d) {
            return new to.d(((hn.d) this.f86571a.z6().getValue()).resolve(parsingContext, ((cp.d) cpVar).c(), jSONObject));
        }
        if (cpVar instanceof cp.a) {
            return new to.a(((e8.d) this.f86571a.Z1().getValue()).resolve(parsingContext, ((cp.a) cpVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
