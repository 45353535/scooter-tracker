package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.gk;
import k8.ik;
import k8.qj;
import k8.zj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class tj implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91400a;

    public tj(my myVar) {
        this.f91400a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qj resolve(ParsingContext parsingContext, ik ikVar, JSONObject jSONObject) {
        if (ikVar instanceof ik.d) {
            return new qj.d(((gk.e) this.f91400a.y5().getValue()).resolve(parsingContext, ((ik.d) ikVar).c(), jSONObject));
        }
        if (ikVar instanceof ik.c) {
            return new qj.c(((zj.e) this.f91400a.v5().getValue()).resolve(parsingContext, ((ik.c) ikVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
