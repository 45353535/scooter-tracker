package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.a7;
import k8.e7;
import k8.li;
import k8.rm;
import k8.we;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class d7 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86902a;

    public d7(my myVar) {
        this.f86902a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a7 resolve(ParsingContext parsingContext, e7 e7Var, JSONObject jSONObject) {
        if (e7Var instanceof e7.d) {
            return new a7.d(((li.d) this.f86902a.X4().getValue()).resolve(parsingContext, ((e7.d) e7Var).c(), jSONObject));
        }
        if (e7Var instanceof e7.f) {
            return new a7.f(((rm.d) this.f86902a.n6().getValue()).resolve(parsingContext, ((e7.f) e7Var).c(), jSONObject));
        }
        if (e7Var instanceof e7.c) {
            return new a7.c(((we.g) this.f86902a.W3().getValue()).resolve(parsingContext, ((e7.c) e7Var).c(), jSONObject));
        }
        if (e7Var instanceof e7.g) {
            return new a7.g(((jq) this.f86902a.s7().getValue()).resolve(parsingContext, ((e7.g) e7Var).c(), jSONObject));
        }
        if (e7Var instanceof e7.e) {
            return new a7.e(((zi) this.f86902a.g5().getValue()).resolve(parsingContext, ((e7.e) e7Var).c(), jSONObject));
        }
        throw new lf.m();
    }
}
