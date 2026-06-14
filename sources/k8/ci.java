package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ci implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86742a;

    public ci(my myVar) {
        this.f86742a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zh resolve(ParsingContext parsingContext, di diVar, JSONObject jSONObject) {
        return new zh((String) JsonFieldResolver.resolveOptional(parsingContext, diVar.f87047a, jSONObject, "height_variable_name"), (String) JsonFieldResolver.resolveOptional(parsingContext, diVar.f87048b, jSONObject, "width_variable_name"));
    }
}
