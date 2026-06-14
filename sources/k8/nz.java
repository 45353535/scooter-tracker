package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class nz implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90118a;

    public nz(my myVar) {
        this.f90118a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kz resolve(ParsingContext parsingContext, oz ozVar, JSONObject jSONObject) {
        return new kz(JsonFieldResolver.resolveExpression(parsingContext, ozVar.f90284a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
