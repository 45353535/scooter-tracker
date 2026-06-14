package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ip;
import k8.pi;
import k8.zc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class gp implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87891a;

    public gp(my myVar) {
        this.f87891a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ip deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        ip ipVar = entityTemplate instanceof ip ? (ip) entityTemplate : null;
        if (ipVar != null && (strA = ipVar.a()) != null) {
            string = strA;
        }
        int iHashCode = string.hashCode();
        if (iHashCode != 97445748) {
            if (iHashCode != 343327108) {
                if (iHashCode == 1386124388 && string.equals("match_parent")) {
                    return new ip.d(((pi.c) this.f87891a.Z4().getValue()).deserialize(parsingContext, (qi) (ipVar != null ? ipVar.b() : null), jSONObject));
                }
            } else if (string.equals("wrap_content")) {
                return new ip.e(((px) this.f87891a.A9().getValue()).deserialize(parsingContext, (rx) (ipVar != null ? ipVar.b() : null), jSONObject));
            }
        } else if (string.equals("fixed")) {
            return new ip.c(((zc.d) this.f87891a.x3().getValue()).deserialize(parsingContext, (ad) (ipVar != null ? ipVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ip ipVar) {
        if (ipVar instanceof ip.c) {
            return ((zc.d) this.f87891a.x3().getValue()).serialize(parsingContext, ((ip.c) ipVar).c());
        }
        if (ipVar instanceof ip.d) {
            return ((pi.c) this.f87891a.Z4().getValue()).serialize(parsingContext, ((ip.d) ipVar).c());
        }
        if (ipVar instanceof ip.e) {
            return ((px) this.f87891a.A9().getValue()).serialize(parsingContext, ((ip.e) ipVar).c());
        }
        throw new lf.m();
    }
}
