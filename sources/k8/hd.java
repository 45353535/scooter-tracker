package k8;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.bd;
import k8.id;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hd implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88010a;

    public hd(my myVar) {
        this.f88010a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bd.c resolve(ParsingContext parsingContext, id.c cVar, JSONObject jSONObject) {
        Field field = cVar.f88235a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new bd.c(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "down", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar.f88236b, jSONObject, ToolBar.FORWARD, typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar.f88237c, jSONObject, "left", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar.f88238d, jSONObject, "right", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar.f88239e, jSONObject, "up", typeHelper));
    }
}
