package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ng;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class gg implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87809a;

    public gg(my myVar) {
        this.f87809a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ng deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        ng ngVar = entityTemplate instanceof ng ? (ng) entityTemplate : null;
        if (ngVar != null && (strA = ngVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "regex")) {
            return new ng.d(((kg) this.f87809a.q4().getValue()).deserialize(parsingContext, (mg) (ngVar != null ? ngVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "expression")) {
            return new ng.c(((cg) this.f87809a.k4().getValue()).deserialize(parsingContext, (eg) (ngVar != null ? ngVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ng ngVar) {
        if (ngVar instanceof ng.d) {
            return ((kg) this.f87809a.q4().getValue()).serialize(parsingContext, ((ng.d) ngVar).c());
        }
        if (ngVar instanceof ng.c) {
            return ((cg) this.f87809a.k4().getValue()).serialize(parsingContext, ((ng.c) ngVar).c());
        }
        throw new lf.m();
    }
}
