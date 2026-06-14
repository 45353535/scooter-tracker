package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.d4;
import k8.zx;
import k8.zy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86436a;

    public b4(my myVar) {
        this.f86436a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d4 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        d4 d4Var = entityTemplate instanceof d4 ? (d4) entityTemplate : null;
        if (d4Var != null && (strA = d4Var.a()) != null) {
            string = strA;
        }
        switch (string.hashCode()) {
            case -1019779949:
                if (string.equals("offset")) {
                    return new d4.e(((zy.c) this.f86436a.V9().getValue()).deserialize(parsingContext, (az) (d4Var != null ? d4Var.b() : null), jSONObject));
                }
                break;
            case 100571:
                if (string.equals("end")) {
                    return new d4.c(((ux) this.f86436a.D9().getValue()).deserialize(parsingContext, (wx) (d4Var != null ? d4Var.b() : null), jSONObject));
                }
                break;
            case 100346066:
                if (string.equals(FirebaseAnalytics.Param.INDEX)) {
                    return new d4.d(((zx.c) this.f86436a.G9().getValue()).deserialize(parsingContext, (ay) (d4Var != null ? d4Var.b() : null), jSONObject));
                }
                break;
            case 109757538:
                if (string.equals("start")) {
                    return new d4.f(((hz) this.f86436a.ba().getValue()).deserialize(parsingContext, (jz) (d4Var != null ? d4Var.b() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, d4 d4Var) {
        if (d4Var instanceof d4.e) {
            return ((zy.c) this.f86436a.V9().getValue()).serialize(parsingContext, ((d4.e) d4Var).c());
        }
        if (d4Var instanceof d4.d) {
            return ((zx.c) this.f86436a.G9().getValue()).serialize(parsingContext, ((d4.d) d4Var).c());
        }
        if (d4Var instanceof d4.f) {
            return ((hz) this.f86436a.ba().getValue()).serialize(parsingContext, ((d4.f) d4Var).c());
        }
        if (d4Var instanceof d4.c) {
            return ((ux) this.f86436a.D9().getValue()).serialize(parsingContext, ((d4.c) d4Var).c());
        }
        throw new lf.m();
    }
}
