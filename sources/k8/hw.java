package k8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.jw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hw implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88136a;

    public hw(my myVar) {
        this.f88136a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jw deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        jw jwVar = entityTemplate instanceof jw ? (jw) entityTemplate : null;
        if (jwVar != null && (strA = jwVar.a()) != null) {
            string = strA;
        }
        switch (string.hashCode()) {
            case -1034364087:
                if (string.equals("number")) {
                    return new jw.h(((py) this.f88136a.P9().getValue()).deserialize(parsingContext, (ry) (jwVar != null ? jwVar.b() : null), jSONObject));
                }
                break;
            case -891985903:
                if (string.equals(TypedValues.Custom.S_STRING)) {
                    return new jw.i(((mz) this.f88136a.ea().getValue()).deserialize(parsingContext, (oz) (jwVar != null ? jwVar.b() : null), jSONObject));
                }
                break;
            case 116079:
                if (string.equals("url")) {
                    return new jw.j(((wz) this.f88136a.ka().getValue()).deserialize(parsingContext, (yz) (jwVar != null ? jwVar.b() : null), jSONObject));
                }
                break;
            case 3083190:
                if (string.equals("dict")) {
                    return new jw.f(((q0) this.f88136a.z().getValue()).deserialize(parsingContext, (s0) (jwVar != null ? jwVar.b() : null), jSONObject));
                }
                break;
            case 64711720:
                if (string.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return new jw.b(((m) this.f88136a.h().getValue()).deserialize(parsingContext, (o) (jwVar != null ? jwVar.b() : null), jSONObject));
                }
                break;
            case 93090393:
                if (string.equals("array")) {
                    return new jw.a(((c) this.f88136a.b().getValue()).deserialize(parsingContext, (e) (jwVar != null ? jwVar.b() : null), jSONObject));
                }
                break;
            case 94842723:
                if (string.equals("color")) {
                    return new jw.c(((w) this.f88136a.n().getValue()).deserialize(parsingContext, (y) (jwVar != null ? jwVar.b() : null), jSONObject));
                }
                break;
            case 1958052158:
                if (string.equals(TypedValues.Custom.S_INT)) {
                    return new jw.g(((ey) this.f88136a.J9().getValue()).deserialize(parsingContext, (gy) (jwVar != null ? jwVar.b() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, jw jwVar) {
        if (jwVar instanceof jw.i) {
            return ((mz) this.f88136a.ea().getValue()).serialize(parsingContext, ((jw.i) jwVar).c());
        }
        if (jwVar instanceof jw.g) {
            return ((ey) this.f88136a.J9().getValue()).serialize(parsingContext, ((jw.g) jwVar).c());
        }
        if (jwVar instanceof jw.h) {
            return ((py) this.f88136a.P9().getValue()).serialize(parsingContext, ((jw.h) jwVar).c());
        }
        if (jwVar instanceof jw.c) {
            return ((w) this.f88136a.n().getValue()).serialize(parsingContext, ((jw.c) jwVar).c());
        }
        if (jwVar instanceof jw.b) {
            return ((m) this.f88136a.h().getValue()).serialize(parsingContext, ((jw.b) jwVar).c());
        }
        if (jwVar instanceof jw.j) {
            return ((wz) this.f88136a.ka().getValue()).serialize(parsingContext, ((jw.j) jwVar).c());
        }
        if (jwVar instanceof jw.f) {
            return ((q0) this.f88136a.z().getValue()).serialize(parsingContext, ((jw.f) jwVar).c());
        }
        if (jwVar instanceof jw.a) {
            return ((c) this.f88136a.b().getValue()).serialize(parsingContext, ((jw.a) jwVar).c());
        }
        throw new lf.m();
    }
}
