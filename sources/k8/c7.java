package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.e7;
import k8.li;
import k8.rm;
import k8.we;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c7 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86626a;

    public c7(my myVar) {
        this.f86626a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e7 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        e7 e7Var = entityTemplate instanceof e7 ? (e7) entityTemplate : null;
        if (e7Var != null && (strA = e7Var.a()) != null) {
            string = strA;
        }
        switch (string.hashCode()) {
            case -30518633:
                if (string.equals("nine_patch_image")) {
                    return new e7.e(((yi) this.f86626a.f5().getValue()).deserialize(parsingContext, (aj) (e7Var != null ? e7Var.b() : null), jSONObject));
                }
                break;
            case 89650992:
                if (string.equals("gradient")) {
                    return new e7.d(((li.c) this.f86626a.W4().getValue()).deserialize(parsingContext, (mi) (e7Var != null ? e7Var.b() : null), jSONObject));
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    return new e7.c(((we.f) this.f86626a.V3().getValue()).deserialize(parsingContext, (xe) (e7Var != null ? e7Var.b() : null), jSONObject));
                }
                break;
            case 109618859:
                if (string.equals("solid")) {
                    return new e7.g(((iq) this.f86626a.r7().getValue()).deserialize(parsingContext, (kq) (e7Var != null ? e7Var.b() : null), jSONObject));
                }
                break;
            case 1881846096:
                if (string.equals("radial_gradient")) {
                    return new e7.f(((rm.c) this.f86626a.m6().getValue()).deserialize(parsingContext, (fn) (e7Var != null ? e7Var.b() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, e7 e7Var) {
        if (e7Var instanceof e7.d) {
            return ((li.c) this.f86626a.W4().getValue()).serialize(parsingContext, ((e7.d) e7Var).c());
        }
        if (e7Var instanceof e7.f) {
            return ((rm.c) this.f86626a.m6().getValue()).serialize(parsingContext, ((e7.f) e7Var).c());
        }
        if (e7Var instanceof e7.c) {
            return ((we.f) this.f86626a.V3().getValue()).serialize(parsingContext, ((e7.c) e7Var).c());
        }
        if (e7Var instanceof e7.g) {
            return ((iq) this.f86626a.r7().getValue()).serialize(parsingContext, ((e7.g) e7Var).c());
        }
        if (e7Var instanceof e7.e) {
            return ((yi) this.f86626a.f5().getValue()).serialize(parsingContext, ((e7.e) e7Var).c());
        }
        throw new lf.m();
    }
}
