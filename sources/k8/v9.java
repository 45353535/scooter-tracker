package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class v9 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91902a;

    public v9(my myVar) {
        this.f91902a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s9 resolve(ParsingContext parsingContext, w9 w9Var, JSONObject jSONObject) {
        return new s9(JsonFieldResolver.resolveOptionalExpression(parsingContext, w9Var.f92120a, jSONObject, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, w9Var.f92121b, jSONObject, "raw_text_variable"));
    }
}
