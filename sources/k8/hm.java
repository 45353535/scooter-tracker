package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.jm;
import k8.nm;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hm implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88093a;

    public hm(my myVar) {
        this.f88093a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jm deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        jm jmVar = entityTemplate instanceof jm ? (jm) entityTemplate : null;
        if (jmVar != null && (strA = jmVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "fixed")) {
            return new jm.c(((nm.d) this.f88093a.j6().getValue()).deserialize(parsingContext, (om) (jmVar != null ? jmVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "relative")) {
            return new jm.d(((zm) this.f88093a.s6().getValue()).deserialize(parsingContext, (bn) (jmVar != null ? jmVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, jm jmVar) {
        if (jmVar instanceof jm.c) {
            return ((nm.d) this.f88093a.j6().getValue()).serialize(parsingContext, ((jm.c) jmVar).c());
        }
        if (jmVar instanceof jm.d) {
            return ((zm) this.f88093a.s6().getValue()).serialize(parsingContext, ((jm.d) jmVar).c());
        }
        throw new lf.m();
    }
}
