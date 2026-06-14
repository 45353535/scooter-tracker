package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class cm implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86756a;

    public cm(my myVar) {
        this.f86756a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zl resolve(ParsingContext parsingContext, dm dmVar, JSONObject jSONObject) {
        return new zl((oa) JsonFieldResolver.resolve(parsingContext, dmVar.f87057a, jSONObject, "x", this.f86756a.O2(), this.f86756a.M2()), (oa) JsonFieldResolver.resolve(parsingContext, dmVar.f87058b, jSONObject, "y", this.f86756a.O2(), this.f86756a.M2()));
    }
}
