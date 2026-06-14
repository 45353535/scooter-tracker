package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ep;
import k8.pi;
import k8.zc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class fp implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87606a;

    public fp(my myVar) {
        this.f87606a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ep deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        if (iHashCode != 97445748) {
            if (iHashCode != 343327108) {
                if (iHashCode == 1386124388 && string.equals("match_parent")) {
                    return new ep.d(((pi.b) this.f87606a.Y4().getValue()).deserialize(parsingContext, jSONObject));
                }
            } else if (string.equals("wrap_content")) {
                return new ep.e(((ox) this.f87606a.z9().getValue()).deserialize(parsingContext, jSONObject));
            }
        } else if (string.equals("fixed")) {
            return new ep.c(((zc.c) this.f87606a.w3().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        ip ipVar = orThrow instanceof ip ? (ip) orThrow : null;
        if (ipVar != null) {
            return ((hp) this.f87606a.a7().getValue()).resolve(parsingContext, ipVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ep epVar) {
        if (epVar instanceof ep.c) {
            return ((zc.c) this.f87606a.w3().getValue()).serialize(parsingContext, ((ep.c) epVar).c());
        }
        if (epVar instanceof ep.d) {
            return ((pi.b) this.f87606a.Y4().getValue()).serialize(parsingContext, ((ep.d) epVar).c());
        }
        if (epVar instanceof ep.e) {
            return ((ox) this.f87606a.z9().getValue()).serialize(parsingContext, ((ep.e) epVar).c());
        }
        throw new lf.m();
    }
}
