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
import k8.r6;
import k8.rp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class s6 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90949a;

    public s6(my myVar) {
        this.f90949a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r6 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case 113762:
                if (string.equals("set")) {
                    return new r6.e(((p6.b) this.f90949a.w1().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3135100:
                if (string.equals("fade")) {
                    return new r6.c(((ac.c) this.f90949a.e3().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109250890:
                if (string.equals("scale")) {
                    return new r6.d(((pn.c) this.f90949a.A6().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109526449:
                if (string.equals("slide")) {
                    return new r6.f(((rp.d) this.f90949a.e7().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        v6 v6Var = orThrow instanceof v6 ? (v6) orThrow : null;
        if (v6Var != null) {
            return ((u6) this.f90949a.B1().getValue()).resolve(parsingContext, v6Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, r6 r6Var) {
        if (r6Var instanceof r6.e) {
            return ((p6.b) this.f90949a.w1().getValue()).serialize(parsingContext, ((r6.e) r6Var).c());
        }
        if (r6Var instanceof r6.c) {
            return ((ac.c) this.f90949a.e3().getValue()).serialize(parsingContext, ((r6.c) r6Var).c());
        }
        if (r6Var instanceof r6.d) {
            return ((pn.c) this.f90949a.A6().getValue()).serialize(parsingContext, ((r6.d) r6Var).c());
        }
        if (r6Var instanceof r6.f) {
            return ((rp.d) this.f90949a.e7().getValue()).serialize(parsingContext, ((r6.f) r6Var).c());
        }
        throw new lf.m();
    }
}
