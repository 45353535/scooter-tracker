package k8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.dz;
import k8.ow;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class mw implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f89060a;

    public mw(my myVar) {
        this.f89060a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ow deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        ow owVar = entityTemplate instanceof ow ? (ow) entityTemplate : null;
        if (owVar != null && (strA = owVar.a()) != null) {
            string = strA;
        }
        switch (string.hashCode()) {
            case -1034364087:
                if (string.equals("number")) {
                    return new ow.h(((uy) this.f89060a.S9().getValue()).deserialize(parsingContext, (wy) (owVar != null ? owVar.b() : null), jSONObject));
                }
                break;
            case -993141291:
                if (string.equals("property")) {
                    return new ow.i(((dz.d) this.f89060a.Y9().getValue()).deserialize(parsingContext, (ez) (owVar != null ? owVar.b() : null), jSONObject));
                }
                break;
            case -891985903:
                if (string.equals(TypedValues.Custom.S_STRING)) {
                    return new ow.j(((rz) this.f89060a.ha().getValue()).deserialize(parsingContext, (tz) (owVar != null ? owVar.b() : null), jSONObject));
                }
                break;
            case 116079:
                if (string.equals("url")) {
                    return new ow.k(((b00) this.f89060a.na().getValue()).deserialize(parsingContext, (d00) (owVar != null ? owVar.b() : null), jSONObject));
                }
                break;
            case 3083190:
                if (string.equals("dict")) {
                    return new ow.f(((v0) this.f89060a.C().getValue()).deserialize(parsingContext, (x0) (owVar != null ? owVar.b() : null), jSONObject));
                }
                break;
            case 64711720:
                if (string.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return new ow.b(((r) this.f89060a.k().getValue()).deserialize(parsingContext, (t) (owVar != null ? owVar.b() : null), jSONObject));
                }
                break;
            case 93090393:
                if (string.equals("array")) {
                    return new ow.a(((h) this.f89060a.e().getValue()).deserialize(parsingContext, (j) (owVar != null ? owVar.b() : null), jSONObject));
                }
                break;
            case 94842723:
                if (string.equals("color")) {
                    return new ow.c(((b0) this.f89060a.q().getValue()).deserialize(parsingContext, (d0) (owVar != null ? owVar.b() : null), jSONObject));
                }
                break;
            case 1958052158:
                if (string.equals(TypedValues.Custom.S_INT)) {
                    return new ow.g(((jy) this.f89060a.M9().getValue()).deserialize(parsingContext, (ly) (owVar != null ? owVar.b() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ow owVar) {
        if (owVar instanceof ow.j) {
            return ((rz) this.f89060a.ha().getValue()).serialize(parsingContext, ((ow.j) owVar).c());
        }
        if (owVar instanceof ow.h) {
            return ((uy) this.f89060a.S9().getValue()).serialize(parsingContext, ((ow.h) owVar).c());
        }
        if (owVar instanceof ow.g) {
            return ((jy) this.f89060a.M9().getValue()).serialize(parsingContext, ((ow.g) owVar).c());
        }
        if (owVar instanceof ow.b) {
            return ((r) this.f89060a.k().getValue()).serialize(parsingContext, ((ow.b) owVar).c());
        }
        if (owVar instanceof ow.c) {
            return ((b0) this.f89060a.q().getValue()).serialize(parsingContext, ((ow.c) owVar).c());
        }
        if (owVar instanceof ow.k) {
            return ((b00) this.f89060a.na().getValue()).serialize(parsingContext, ((ow.k) owVar).c());
        }
        if (owVar instanceof ow.f) {
            return ((v0) this.f89060a.C().getValue()).serialize(parsingContext, ((ow.f) owVar).c());
        }
        if (owVar instanceof ow.a) {
            return ((h) this.f89060a.e().getValue()).serialize(parsingContext, ((ow.a) owVar).c());
        }
        if (owVar instanceof ow.i) {
            return ((dz.d) this.f89060a.Y9().getValue()).serialize(parsingContext, ((ow.i) owVar).c());
        }
        throw new lf.m();
    }
}
