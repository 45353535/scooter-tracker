package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.ml;
import k8.ol;
import k8.yl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sl implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91070a;

    public sl(my myVar) {
        this.f91070a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ml resolve(ParsingContext parsingContext, yl ylVar, JSONObject jSONObject) {
        if (ylVar instanceof yl.c) {
            return new ml.c(((ol.e) this.f91070a.S5().getValue()).resolve(parsingContext, ((yl.c) ylVar).c(), jSONObject));
        }
        if (ylVar instanceof yl.d) {
            return new ml.d(((wl) this.f91070a.Y5().getValue()).resolve(parsingContext, ((yl.d) ylVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
