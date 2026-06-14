package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.i8;
import k8.st;
import k8.wt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class vt implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92022a;

    public vt(my myVar) {
        this.f92022a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public st resolve(ParsingContext parsingContext, wt wtVar, JSONObject jSONObject) {
        if (wtVar instanceof wt.d) {
            return new st.d(((jq) this.f92022a.s7().getValue()).resolve(parsingContext, ((wt.d) wtVar).c(), jSONObject));
        }
        if (wtVar instanceof wt.a) {
            return new st.a(((i8.d) this.f92022a.c2().getValue()).resolve(parsingContext, ((wt.a) wtVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
