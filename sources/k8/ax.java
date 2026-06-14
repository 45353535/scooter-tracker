package k8;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import k8.xw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ax implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86422a;

    public ax(my myVar) {
        this.f86422a = myVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xw resolve(ParsingContext parsingContext, ex exVar, JSONObject jSONObject) {
        return new xw(JsonFieldResolver.resolveOptionalExpression(parsingContext, exVar.f87382a, jSONObject, com.taurusx.tax.f.a.f65992s, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, exVar.f87383b, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING), (xw.c) JsonFieldResolver.resolveOptional(parsingContext, exVar.f87384c, jSONObject, "resolution", this.f86422a.v9(), this.f86422a.t9()), JsonFieldResolver.resolveExpression(parsingContext, exVar.f87385d, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
