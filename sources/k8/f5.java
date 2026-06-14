package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.h5;
import k8.z4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class f5 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87427a;

    public f5(my myVar) {
        this.f87427a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z4.c.C1058c resolve(ParsingContext parsingContext, h5.c.C1042c c1042c, JSONObject jSONObject) {
        Field field = c1042c.f87978a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new z4.c.C1058c(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "name", typeHelper), JsonFieldResolver.resolveExpression(parsingContext, c1042c.f87979b, jSONObject, "value", typeHelper));
    }
}
