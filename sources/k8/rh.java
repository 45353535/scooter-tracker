package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.ih;
import k8.nh;
import k8.th;
import k8.vh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class rh implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90735a;

    public rh(my myVar) {
        this.f90735a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ih resolve(ParsingContext parsingContext, vh vhVar, JSONObject jSONObject) {
        if (vhVar instanceof vh.d) {
            return new ih.d(((th.d) this.f90735a.L4().getValue()).resolve(parsingContext, ((vh.d) vhVar).c(), jSONObject));
        }
        if (vhVar instanceof vh.c) {
            return new ih.c(((nh.d) this.f90735a.F4().getValue()).resolve(parsingContext, ((vh.c) vhVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
