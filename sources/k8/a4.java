package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.z3;
import k8.zx;
import k8.zy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86184a;

    public a4(my myVar) {
        this.f86184a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1019779949:
                if (string.equals("offset")) {
                    return new z3.e(((zy.b) this.f86184a.U9().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100571:
                if (string.equals("end")) {
                    return new z3.c(((tx) this.f86184a.C9().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100346066:
                if (string.equals(FirebaseAnalytics.Param.INDEX)) {
                    return new z3.d(((zx.b) this.f86184a.F9().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109757538:
                if (string.equals("start")) {
                    return new z3.f(((gz) this.f86184a.aa().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        d4 d4Var = orThrow instanceof d4 ? (d4) orThrow : null;
        if (d4Var != null) {
            return ((c4) this.f86184a.F0().getValue()).resolve(parsingContext, d4Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, z3 z3Var) {
        if (z3Var instanceof z3.e) {
            return ((zy.b) this.f86184a.U9().getValue()).serialize(parsingContext, ((z3.e) z3Var).c());
        }
        if (z3Var instanceof z3.d) {
            return ((zx.b) this.f86184a.F9().getValue()).serialize(parsingContext, ((z3.d) z3Var).c());
        }
        if (z3Var instanceof z3.f) {
            return ((gz) this.f86184a.aa().getValue()).serialize(parsingContext, ((z3.f) z3Var).c());
        }
        if (z3Var instanceof z3.c) {
            return ((tx) this.f86184a.C9().getValue()).serialize(parsingContext, ((z3.c) z3Var).c());
        }
        throw new lf.m();
    }
}
