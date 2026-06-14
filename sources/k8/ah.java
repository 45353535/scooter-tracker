package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.sc;
import k8.yg;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ah implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86251a;

    public ah(my myVar) {
        this.f86251a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yg deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        if (iHashCode != 106642798) {
            if (iHashCode != 393594385) {
                if (iHashCode == 575402001 && string.equals("currency")) {
                    return new yg.c(((t9) this.f86251a.y2().getValue()).deserialize(parsingContext, jSONObject));
                }
            } else if (string.equals("fixed_length")) {
                return new yg.d(((sc.b) this.f86251a.q3().getValue()).deserialize(parsingContext, jSONObject));
            }
        } else if (string.equals("phone")) {
            return new yg.e(((il) this.f86251a.N5().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        dh dhVar = orThrow instanceof dh ? (dh) orThrow : null;
        if (dhVar != null) {
            return ((ch) this.f86251a.x4().getValue()).resolve(parsingContext, dhVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, yg ygVar) {
        if (ygVar instanceof yg.d) {
            return ((sc.b) this.f86251a.q3().getValue()).serialize(parsingContext, ((yg.d) ygVar).c());
        }
        if (ygVar instanceof yg.c) {
            return ((t9) this.f86251a.y2().getValue()).serialize(parsingContext, ((yg.c) ygVar).c());
        }
        if (ygVar instanceof yg.e) {
            return ((il) this.f86251a.N5().getValue()).serialize(parsingContext, ((yg.e) ygVar).c());
        }
        throw new lf.m();
    }
}
