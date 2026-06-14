package k8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.fw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class gw implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87921a;

    public gw(my myVar) {
        this.f87921a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fw deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1034364087:
                if (string.equals("number")) {
                    return new fw.h(((oy) this.f87921a.O9().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -891985903:
                if (string.equals(TypedValues.Custom.S_STRING)) {
                    return new fw.i(((lz) this.f87921a.da().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 116079:
                if (string.equals("url")) {
                    return new fw.j(((vz) this.f87921a.ja().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3083190:
                if (string.equals("dict")) {
                    return new fw.f(((p0) this.f87921a.y().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 64711720:
                if (string.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return new fw.b(((l) this.f87921a.g().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 93090393:
                if (string.equals("array")) {
                    return new fw.a(((b) this.f87921a.a().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 94842723:
                if (string.equals("color")) {
                    return new fw.c(((v) this.f87921a.m().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1958052158:
                if (string.equals(TypedValues.Custom.S_INT)) {
                    return new fw.g(((dy) this.f87921a.I9().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        jw jwVar = orThrow instanceof jw ? (jw) orThrow : null;
        if (jwVar != null) {
            return ((iw) this.f87921a.j9().getValue()).resolve(parsingContext, jwVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, fw fwVar) {
        if (fwVar instanceof fw.i) {
            return ((lz) this.f87921a.da().getValue()).serialize(parsingContext, ((fw.i) fwVar).c());
        }
        if (fwVar instanceof fw.g) {
            return ((dy) this.f87921a.I9().getValue()).serialize(parsingContext, ((fw.g) fwVar).c());
        }
        if (fwVar instanceof fw.h) {
            return ((oy) this.f87921a.O9().getValue()).serialize(parsingContext, ((fw.h) fwVar).c());
        }
        if (fwVar instanceof fw.c) {
            return ((v) this.f87921a.m().getValue()).serialize(parsingContext, ((fw.c) fwVar).c());
        }
        if (fwVar instanceof fw.b) {
            return ((l) this.f87921a.g().getValue()).serialize(parsingContext, ((fw.b) fwVar).c());
        }
        if (fwVar instanceof fw.j) {
            return ((vz) this.f87921a.ja().getValue()).serialize(parsingContext, ((fw.j) fwVar).c());
        }
        if (fwVar instanceof fw.f) {
            return ((p0) this.f87921a.y().getValue()).serialize(parsingContext, ((fw.f) fwVar).c());
        }
        if (fwVar instanceof fw.a) {
            return ((b) this.f87921a.a().getValue()).serialize(parsingContext, ((fw.a) fwVar).c());
        }
        throw new lf.m();
    }
}
