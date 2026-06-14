package k8;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class zi implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92938a;

    public zi(my myVar) {
        this.f92938a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wi resolve(ParsingContext parsingContext, aj ajVar, JSONObject jSONObject) {
        return new wi(JsonFieldResolver.resolveExpression(parsingContext, ajVar.f86255a, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI), (z0) JsonFieldResolver.resolve(parsingContext, ajVar.f86256b, jSONObject, "insets", this.f92938a.G(), this.f92938a.E()));
    }
}
