package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.qk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class rk implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90742a;

    public rk(my myVar) {
        this.f90742a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qk deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        if (iHashCode != -921832806) {
            if (iHashCode != 97445748) {
                if (iHashCode == 343327108 && string.equals("wrap_content")) {
                    return new qk.d(((hj) this.f90742a.k5().getValue()).deserialize(parsingContext, jSONObject));
                }
            } else if (string.equals("fixed")) {
                return new qk.c(((si) this.f90742a.b5().getValue()).deserialize(parsingContext, jSONObject));
            }
        } else if (string.equals("percentage")) {
            return new qk.e(((mj) this.f90742a.n5().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        uk ukVar = orThrow instanceof uk ? (uk) orThrow : null;
        if (ukVar != null) {
            return ((tk) this.f90742a.E5().getValue()).resolve(parsingContext, ukVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, qk qkVar) {
        if (qkVar instanceof qk.e) {
            return ((mj) this.f90742a.n5().getValue()).serialize(parsingContext, ((qk.e) qkVar).c());
        }
        if (qkVar instanceof qk.c) {
            return ((si) this.f90742a.b5().getValue()).serialize(parsingContext, ((qk.c) qkVar).c());
        }
        if (qkVar instanceof qk.d) {
            return ((hj) this.f90742a.k5().getValue()).serialize(parsingContext, ((qk.d) qkVar).c());
        }
        throw new lf.m();
    }
}
