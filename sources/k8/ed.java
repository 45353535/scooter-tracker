package k8;

import androidx.compose.material.OutlinedTextFieldKt;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.impl.H2;
import k8.bd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ed implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87221a;

    public ed(my myVar) {
        this.f87221a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bd resolve(ParsingContext parsingContext, id idVar, JSONObject jSONObject) {
        return new bd(JsonFieldResolver.resolveOptionalList(parsingContext, idVar.f88227a, jSONObject, H2.f75840g, this.f87221a.H1(), this.f87221a.F1()), (l7) JsonFieldResolver.resolveOptional(parsingContext, idVar.f88228b, jSONObject, OutlinedTextFieldKt.BorderId, this.f87221a.N1(), this.f87221a.L1()), (bd.c) JsonFieldResolver.resolveOptional(parsingContext, idVar.f88229c, jSONObject, "next_focus_ids", this.f87221a.E3(), this.f87221a.C3()), JsonFieldResolver.resolveOptionalList(parsingContext, idVar.f88230d, jSONObject, "on_blur", this.f87221a.w0(), this.f87221a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, idVar.f88231e, jSONObject, "on_focus", this.f87221a.w0(), this.f87221a.u0()));
    }
}
