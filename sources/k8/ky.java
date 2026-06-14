package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ky implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88735a;

    public ky(my myVar) {
        this.f88735a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hy resolve(ParsingContext parsingContext, ly lyVar, JSONObject jSONObject) {
        return new hy((String) JsonFieldResolver.resolve(parsingContext, lyVar.f88921a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, lyVar.f88922b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
    }
}
