package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ui implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91676a;

    public ui(my myVar) {
        this.f91676a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ri resolve(ParsingContext parsingContext, vi viVar, JSONObject jSONObject) {
        return new ri((xc) JsonFieldResolver.resolve(parsingContext, viVar.f91934a, jSONObject, "neighbour_page_width", this.f91676a.y3(), this.f91676a.w3()));
    }
}
