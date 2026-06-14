package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xo implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92411a;

    public xo(my myVar) {
        this.f92411a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uo resolve(ParsingContext parsingContext, yo yoVar, JSONObject jSONObject) {
        return new uo(JsonFieldResolver.resolveExpression(parsingContext, yoVar.f92756a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (to) JsonFieldResolver.resolve(parsingContext, yoVar.f92757b, jSONObject, "shape", this.f92411a.X6(), this.f92411a.V6()), (ar) JsonFieldResolver.resolveOptional(parsingContext, yoVar.f92758c, jSONObject, "stroke", this.f92411a.E7(), this.f92411a.C7()));
    }
}
