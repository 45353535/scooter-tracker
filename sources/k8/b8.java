package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.c8;
import k8.s7;
import k8.w7;
import k8.y7;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b8 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86450a;

    public b8(my myVar) {
        this.f86450a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y7 resolve(ParsingContext parsingContext, c8 c8Var, JSONObject jSONObject) {
        if (c8Var instanceof c8.d) {
            return new y7.d(((w7.d) this.f86450a.T1().getValue()).resolve(parsingContext, ((c8.d) c8Var).c(), jSONObject));
        }
        if (c8Var instanceof c8.a) {
            return new y7.a(((s7.e) this.f86450a.Q1().getValue()).resolve(parsingContext, ((c8.a) c8Var).c(), jSONObject));
        }
        throw new lf.m();
    }
}
