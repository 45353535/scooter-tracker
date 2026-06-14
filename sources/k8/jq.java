package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class jq implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88515a;

    public jq(my myVar) {
        this.f88515a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gq resolve(ParsingContext parsingContext, kq kqVar, JSONObject jSONObject) {
        return new gq(JsonFieldResolver.resolveExpression(parsingContext, kqVar.f88682a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
