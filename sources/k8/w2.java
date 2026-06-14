package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class w2 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92078a;

    public w2(my myVar) {
        this.f92078a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o2 resolve(ParsingContext parsingContext, x2 x2Var, JSONObject jSONObject) {
        return new o2((p2) JsonFieldResolver.resolve(parsingContext, x2Var.f92280a, jSONObject, "content", this.f92078a.e0(), this.f92078a.c0()));
    }
}
