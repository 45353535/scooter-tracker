package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wl implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92217a;

    public wl(my myVar) {
        this.f92217a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tl resolve(ParsingContext parsingContext, xl xlVar, JSONObject jSONObject) {
        return new tl(JsonFieldResolver.resolveExpression(parsingContext, xlVar.f92404a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
