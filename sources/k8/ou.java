package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.iu;
import k8.ru;
import k8.uu;
import k8.wu;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ou implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90264a;

    public ou(my myVar) {
        this.f90264a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public iu resolve(ParsingContext parsingContext, wu wuVar, JSONObject jSONObject) {
        if (wuVar instanceof wu.c) {
            return new iu.c(((ru.d) this.f90264a.I8().getValue()).resolve(parsingContext, ((wu.c) wuVar).c(), jSONObject));
        }
        if (wuVar instanceof wu.d) {
            return new iu.d(((uu.d) this.f90264a.L8().getValue()).resolve(parsingContext, ((wu.d) wuVar).c(), jSONObject));
        }
        throw new lf.m();
    }
}
