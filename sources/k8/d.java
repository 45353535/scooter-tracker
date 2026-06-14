package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86871a;

    public d(my myVar) {
        this.f86871a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a resolve(ParsingContext parsingContext, e eVar, JSONObject jSONObject) {
        return new a(JsonFieldResolver.resolveExpression(parsingContext, eVar.f87136a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }
}
