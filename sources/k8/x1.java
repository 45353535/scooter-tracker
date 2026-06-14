package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class x1 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92277a;

    public x1(my myVar) {
        this.f92277a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u1 resolve(ParsingContext parsingContext, y1 y1Var, JSONObject jSONObject) {
        return new u1(JsonFieldResolver.resolveOptionalExpression(parsingContext, y1Var.f92590a, jSONObject, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (fw) JsonFieldResolver.resolve(parsingContext, y1Var.f92591b, jSONObject, "value", this.f92277a.j9(), this.f92277a.h9()), JsonFieldResolver.resolveExpression(parsingContext, y1Var.f92592c, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
