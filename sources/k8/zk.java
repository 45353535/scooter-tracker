package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.cl;
import k8.wk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class zk implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92955a;

    public zk(my myVar) {
        this.f92955a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wk.a resolve(ParsingContext parsingContext, cl.a aVar, JSONObject jSONObject) {
        return new wk.a((String) JsonFieldResolver.resolve(parsingContext, aVar.f86752a, jSONObject, "id"), JsonFieldResolver.resolveOptionalList(parsingContext, aVar.f86753b, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f92955a.O4(), this.f92955a.M4()));
    }
}
