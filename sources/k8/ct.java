package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.dt;
import k8.li;
import k8.rm;
import k8.zs;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ct implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86845a;

    public ct(my myVar) {
        this.f86845a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zs resolve(ParsingContext parsingContext, dt dtVar, JSONObject jSONObject) {
        if (dtVar instanceof dt.c) {
            return new zs.c(((li.d) this.f86845a.X4().getValue()).resolve(parsingContext, ((dt.c) dtVar).c(), jSONObject));
        }
        if (dtVar instanceof dt.d) {
            return new zs.d(((rm.d) this.f86845a.n6().getValue()).resolve(parsingContext, ((dt.d) dtVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
