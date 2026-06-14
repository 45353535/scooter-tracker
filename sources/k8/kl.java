package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class kl implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88672a;

    public kl(my myVar) {
        this.f88672a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hl resolve(ParsingContext parsingContext, ll llVar, JSONObject jSONObject) {
        return new hl((String) JsonFieldResolver.resolve(parsingContext, llVar.f88843a, jSONObject, "raw_text_variable"));
    }
}
