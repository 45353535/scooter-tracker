package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.j7;
import k8.lc;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ec implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87220a;

    public ec(my myVar) {
        this.f87220a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lc deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        lc lcVar = entityTemplate instanceof lc ? (lc) entityTemplate : null;
        if (lcVar != null && (strA = lcVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "blur")) {
            return new lc.a(((j7.c) this.f87220a.J1().getValue()).deserialize(parsingContext, (k7) (lcVar != null ? lcVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "rtl_mirror")) {
            return new lc.d(((ic) this.f87220a.l3().getValue()).deserialize(parsingContext, (kc) (lcVar != null ? lcVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, lc lcVar) {
        if (lcVar instanceof lc.a) {
            return ((j7.c) this.f87220a.J1().getValue()).serialize(parsingContext, ((lc.a) lcVar).c());
        }
        if (lcVar instanceof lc.d) {
            return ((ic) this.f87220a.l3().getValue()).serialize(parsingContext, ((lc.d) lcVar).c());
        }
        throw new lf.m();
    }
}
