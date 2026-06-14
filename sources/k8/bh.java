package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.dh;
import k8.sc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bh implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86522a;

    public bh(my myVar) {
        this.f86522a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dh deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        dh dhVar = entityTemplate instanceof dh ? (dh) entityTemplate : null;
        if (dhVar != null && (strA = dhVar.a()) != null) {
            string = strA;
        }
        int iHashCode = string.hashCode();
        if (iHashCode != 106642798) {
            if (iHashCode != 393594385) {
                if (iHashCode == 575402001 && string.equals("currency")) {
                    return new dh.c(((u9) this.f86522a.z2().getValue()).deserialize(parsingContext, (w9) (dhVar != null ? dhVar.b() : null), jSONObject));
                }
            } else if (string.equals("fixed_length")) {
                return new dh.d(((sc.c) this.f86522a.r3().getValue()).deserialize(parsingContext, (wc) (dhVar != null ? dhVar.b() : null), jSONObject));
            }
        } else if (string.equals("phone")) {
            return new dh.e(((jl) this.f86522a.O5().getValue()).deserialize(parsingContext, (ll) (dhVar != null ? dhVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, dh dhVar) {
        if (dhVar instanceof dh.d) {
            return ((sc.c) this.f86522a.r3().getValue()).serialize(parsingContext, ((dh.d) dhVar).c());
        }
        if (dhVar instanceof dh.c) {
            return ((u9) this.f86522a.z2().getValue()).serialize(parsingContext, ((dh.c) dhVar).c());
        }
        if (dhVar instanceof dh.e) {
            return ((jl) this.f86522a.O5().getValue()).serialize(parsingContext, ((dh.e) dhVar).c());
        }
        throw new lf.m();
    }
}
