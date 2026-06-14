package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.cq;
import k8.tp;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bq implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86572a;

    public bq(my myVar) {
        this.f86572a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tp.c resolve(ParsingContext parsingContext, cq.c cVar, JSONObject jSONObject) {
        Field field = cVar.f86812a;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        return new tp.c(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "end", typeHelper, function1), (hb) JsonFieldResolver.resolveOptional(parsingContext, cVar.f86813b, jSONObject, "margins", this.f86572a.a3(), this.f86572a.Y2()), JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar.f86814c, jSONObject, "start", typeHelper, function1), (cb) JsonFieldResolver.resolveOptional(parsingContext, cVar.f86815d, jSONObject, "track_active_style", this.f86572a.X2(), this.f86572a.V2()), (cb) JsonFieldResolver.resolveOptional(parsingContext, cVar.f86816e, jSONObject, "track_inactive_style", this.f86572a.X2(), this.f86572a.V2()));
    }
}
