package k8;

import com.ironsource.C4240b4;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b3 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86435a;

    public b3(my myVar) {
        this.f86435a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y2 resolve(ParsingContext parsingContext, c3 c3Var, JSONObject jSONObject) {
        Field field = c3Var.f86607a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new y2(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, C4240b4.i.W, typeHelper), (fw) JsonFieldResolver.resolveOptional(parsingContext, c3Var.f86608b, jSONObject, "value", this.f86435a.j9(), this.f86435a.h9()), JsonFieldResolver.resolveExpression(parsingContext, c3Var.f86609c, jSONObject, "variable_name", typeHelper));
    }
}
