package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class h2 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87948a;

    public h2(my myVar) {
        this.f87948a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e2 resolve(ParsingContext parsingContext, i2 i2Var, JSONObject jSONObject) {
        return new e2(JsonFieldResolver.resolveExpression(parsingContext, i2Var.f88183a, jSONObject, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (fw) JsonFieldResolver.resolve(parsingContext, i2Var.f88184b, jSONObject, "value", this.f87948a.j9(), this.f87948a.h9()), JsonFieldResolver.resolveExpression(parsingContext, i2Var.f88185c, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
