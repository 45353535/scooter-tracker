package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.fo;
import k8.rn;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class eo implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87356a;

    public eo(my myVar) {
        this.f87356a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rn.c resolve(ParsingContext parsingContext, fo.c cVar, JSONObject jSONObject) {
        Field field = cVar.f87603a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new rn.c(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "text", typeHelper), JsonFieldResolver.resolveExpression(parsingContext, cVar.f87604b, jSONObject, "value", typeHelper));
    }
}
