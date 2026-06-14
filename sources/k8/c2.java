package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c2 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86604a;

    public c2(my myVar) {
        this.f86604a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z1 resolve(ParsingContext parsingContext, d2 d2Var, JSONObject jSONObject) {
        return new z1(JsonFieldResolver.resolveExpression(parsingContext, d2Var.f86884a, jSONObject, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, d2Var.f86885b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
