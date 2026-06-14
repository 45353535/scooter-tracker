package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.cb;
import k8.gb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class fb implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87463a;

    public fb(my myVar) {
        this.f87463a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cb resolve(ParsingContext parsingContext, gb gbVar, JSONObject jSONObject) {
        if (gbVar instanceof gb.c) {
            return new cb.c(((xo) this.f87463a.U6().getValue()).resolve(parsingContext, ((gb.c) gbVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
