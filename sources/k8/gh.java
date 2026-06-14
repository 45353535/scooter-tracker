package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.hh;
import k8.yf;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class gh implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87810a;

    public gh(my myVar) {
        this.f87810a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf.f resolve(ParsingContext parsingContext, hh.c cVar, JSONObject jSONObject) {
        return new yf.f(JsonFieldResolver.resolveExpression(parsingContext, cVar.f88067a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
