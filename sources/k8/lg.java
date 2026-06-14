package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class lg implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88820a;

    public lg(my myVar) {
        this.f88820a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ig resolve(ParsingContext parsingContext, mg mgVar, JSONObject jSONObject) {
        return new ig(JsonFieldResolver.resolveExpression(parsingContext, mgVar.f88989a, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
