package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.gv;
import k8.uv;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class jv implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88523a;

    public jv(my myVar) {
        this.f88523a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gv resolve(ParsingContext parsingContext, uv uvVar, JSONObject jSONObject) {
        if (uvVar instanceof uv.d) {
            return new gv.d(((sv) this.f88523a.a9().getValue()).resolve(parsingContext, ((uv.d) uvVar).c(), jSONObject));
        }
        if (uvVar instanceof uv.c) {
            return new gv.c(((nv) this.f88523a.X8().getValue()).resolve(parsingContext, ((uv.c) uvVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
