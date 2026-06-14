package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class od implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90205a;

    public od(my myVar) {
        this.f90205a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ld resolve(ParsingContext parsingContext, pd pdVar, JSONObject jSONObject) {
        return new ld((String) JsonFieldResolver.resolve(parsingContext, pdVar.f90375a, jSONObject, "name"), (qb) JsonFieldResolver.resolve(parsingContext, pdVar.f90376b, jSONObject, "type", qb.f90546e));
    }
}
