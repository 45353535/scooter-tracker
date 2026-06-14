package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92271a;

    public x(my myVar) {
        this.f92271a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u resolve(ParsingContext parsingContext, y yVar, JSONObject jSONObject) {
        return new u(JsonFieldResolver.resolveExpression(parsingContext, yVar.f92564a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
