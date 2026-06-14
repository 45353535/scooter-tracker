package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.ea;
import k8.ka;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ja implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88376a;

    public ja(my myVar) {
        this.f88376a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ea.c resolve(ParsingContext parsingContext, ka.c cVar, JSONObject jSONObject) {
        return new ea.c((y0) JsonFieldResolver.resolve(parsingContext, cVar.f88606a, jSONObject, "div", this.f88376a.O4(), this.f88376a.M4()), ((Number) JsonFieldResolver.resolve(parsingContext, cVar.f88607b, jSONObject, "state_id", ParsingConvertersKt.NUMBER_TO_INT)).longValue());
    }
}
