package k8;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.d4;
import k8.z3;
import k8.zx;
import k8.zy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c4 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86611a;

    public c4(my myVar) {
        this.f86611a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3 resolve(ParsingContext parsingContext, d4 d4Var, JSONObject jSONObject) {
        if (d4Var instanceof d4.e) {
            return new z3.e(((zy.d) this.f86611a.W9().getValue()).resolve(parsingContext, ((d4.e) d4Var).c(), jSONObject));
        }
        if (d4Var instanceof d4.d) {
            return new z3.d(((zx.d) this.f86611a.H9().getValue()).resolve(parsingContext, ((d4.d) d4Var).c(), jSONObject));
        }
        if (d4Var instanceof d4.f) {
            return new z3.f(((iz) this.f86611a.ca().getValue()).resolve(parsingContext, ((d4.f) d4Var).c(), jSONObject));
        }
        if (d4Var instanceof d4.c) {
            return new z3.c(((vx) this.f86611a.E9().getValue()).resolve(parsingContext, ((d4.c) d4Var).c(), jSONObject));
        }
        throw new lf.m();
    }
}
