package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.a7;
import k8.li;
import k8.rm;
import k8.we;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b7 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86449a;

    public b7(my myVar) {
        this.f86449a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a7 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -30518633:
                if (string.equals("nine_patch_image")) {
                    return new a7.e(((xi) this.f86449a.e5().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 89650992:
                if (string.equals("gradient")) {
                    return new a7.d(((li.b) this.f86449a.V4().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    return new a7.c(((we.e) this.f86449a.U3().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109618859:
                if (string.equals("solid")) {
                    return new a7.g(((hq) this.f86449a.q7().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1881846096:
                if (string.equals("radial_gradient")) {
                    return new a7.f(((rm.b) this.f86449a.l6().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        e7 e7Var = orThrow instanceof e7 ? (e7) orThrow : null;
        if (e7Var != null) {
            return ((d7) this.f86449a.H1().getValue()).resolve(parsingContext, e7Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, a7 a7Var) {
        if (a7Var instanceof a7.d) {
            return ((li.b) this.f86449a.V4().getValue()).serialize(parsingContext, ((a7.d) a7Var).c());
        }
        if (a7Var instanceof a7.f) {
            return ((rm.b) this.f86449a.l6().getValue()).serialize(parsingContext, ((a7.f) a7Var).c());
        }
        if (a7Var instanceof a7.c) {
            return ((we.e) this.f86449a.U3().getValue()).serialize(parsingContext, ((a7.c) a7Var).c());
        }
        if (a7Var instanceof a7.g) {
            return ((hq) this.f86449a.q7().getValue()).serialize(parsingContext, ((a7.g) a7Var).c());
        }
        if (a7Var instanceof a7.e) {
            return ((xi) this.f86449a.e5().getValue()).serialize(parsingContext, ((a7.e) a7Var).c());
        }
        throw new lf.m();
    }
}
