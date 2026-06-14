package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ac;
import k8.p6;
import k8.pn;
import k8.rp;
import k8.v6;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class t6 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91244a;

    public t6(my myVar) {
        this.f91244a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v6 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        v6 v6Var = entityTemplate instanceof v6 ? (v6) entityTemplate : null;
        if (v6Var != null && (strA = v6Var.a()) != null) {
            string = strA;
        }
        switch (string.hashCode()) {
            case 113762:
                if (string.equals("set")) {
                    return new v6.e(((p6.c) this.f91244a.x1().getValue()).deserialize(parsingContext, (q6) (v6Var != null ? v6Var.b() : null), jSONObject));
                }
                break;
            case 3135100:
                if (string.equals("fade")) {
                    return new v6.c(((ac.d) this.f91244a.f3().getValue()).deserialize(parsingContext, (bc) (v6Var != null ? v6Var.b() : null), jSONObject));
                }
                break;
            case 109250890:
                if (string.equals("scale")) {
                    return new v6.d(((pn.d) this.f91244a.B6().getValue()).deserialize(parsingContext, (qn) (v6Var != null ? v6Var.b() : null), jSONObject));
                }
                break;
            case 109526449:
                if (string.equals("slide")) {
                    return new v6.f(((rp.e) this.f91244a.f7().getValue()).deserialize(parsingContext, (sp) (v6Var != null ? v6Var.b() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, v6 v6Var) {
        if (v6Var instanceof v6.e) {
            return ((p6.c) this.f91244a.x1().getValue()).serialize(parsingContext, ((v6.e) v6Var).c());
        }
        if (v6Var instanceof v6.c) {
            return ((ac.d) this.f91244a.f3().getValue()).serialize(parsingContext, ((v6.c) v6Var).c());
        }
        if (v6Var instanceof v6.d) {
            return ((pn.d) this.f91244a.B6().getValue()).serialize(parsingContext, ((v6.d) v6Var).c());
        }
        if (v6Var instanceof v6.f) {
            return ((rp.e) this.f91244a.f7().getValue()).serialize(parsingContext, ((v6.f) v6Var).c());
        }
        throw new lf.m();
    }
}
