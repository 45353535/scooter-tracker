package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.dn;
import k8.sm;
import k8.wm;
import k8.zc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class vm implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91968a;

    public vm(my myVar) {
        this.f91968a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sm resolve(ParsingContext parsingContext, wm wmVar, JSONObject jSONObject) {
        if (wmVar instanceof wm.c) {
            return new sm.c(((zc.e) this.f91968a.y3().getValue()).resolve(parsingContext, ((wm.c) wmVar).c(), jSONObject));
        }
        if (wmVar instanceof wm.d) {
            return new sm.d(((dn.e) this.f91968a.w6().getValue()).resolve(parsingContext, ((wm.d) wmVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
