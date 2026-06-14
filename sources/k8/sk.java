package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.uk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sk implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91069a;

    public sk(my myVar) {
        this.f91069a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uk deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        uk ukVar = entityTemplate instanceof uk ? (uk) entityTemplate : null;
        if (ukVar != null && (strA = ukVar.a()) != null) {
            string = strA;
        }
        int iHashCode = string.hashCode();
        if (iHashCode != -921832806) {
            if (iHashCode != 97445748) {
                if (iHashCode == 343327108 && string.equals("wrap_content")) {
                    return new uk.d(((ij) this.f91069a.l5().getValue()).deserialize(parsingContext, (kj) (ukVar != null ? ukVar.b() : null), jSONObject));
                }
            } else if (string.equals("fixed")) {
                return new uk.c(((ti) this.f91069a.c5().getValue()).deserialize(parsingContext, (vi) (ukVar != null ? ukVar.b() : null), jSONObject));
            }
        } else if (string.equals("percentage")) {
            return new uk.e(((nj) this.f91069a.o5().getValue()).deserialize(parsingContext, (pj) (ukVar != null ? ukVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, uk ukVar) {
        if (ukVar instanceof uk.e) {
            return ((nj) this.f91069a.o5().getValue()).serialize(parsingContext, ((uk.e) ukVar).c());
        }
        if (ukVar instanceof uk.c) {
            return ((ti) this.f91069a.c5().getValue()).serialize(parsingContext, ((uk.c) ukVar).c());
        }
        if (ukVar instanceof uk.d) {
            return ((ij) this.f91069a.l5().getValue()).serialize(parsingContext, ((uk.d) ukVar).c());
        }
        throw new lf.m();
    }
}
