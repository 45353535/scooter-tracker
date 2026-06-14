package k8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.dz;
import k8.kw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class lw implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88907a;

    public lw(my myVar) {
        this.f88907a = myVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1034364087:
                if (string.equals("number")) {
                    return new kw.h(((ty) this.f88907a.R9().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -993141291:
                if (string.equals("property")) {
                    return new kw.i(((dz.c) this.f88907a.X9().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -891985903:
                if (string.equals(TypedValues.Custom.S_STRING)) {
                    return new kw.j(((qz) this.f88907a.ga().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 116079:
                if (string.equals("url")) {
                    return new kw.k(((a00) this.f88907a.ma().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3083190:
                if (string.equals("dict")) {
                    return new kw.f(((u0) this.f88907a.B().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 64711720:
                if (string.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return new kw.b(((q) this.f88907a.j().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 93090393:
                if (string.equals("array")) {
                    return new kw.a(((g) this.f88907a.d().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 94842723:
                if (string.equals("color")) {
                    return new kw.c(((a0) this.f88907a.p().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1958052158:
                if (string.equals(TypedValues.Custom.S_INT)) {
                    return new kw.g(((iy) this.f88907a.L9().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        ow owVar = orThrow instanceof ow ? (ow) orThrow : null;
        if (owVar != null) {
            return ((nw) this.f88907a.m9().getValue()).resolve(parsingContext, owVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, kw kwVar) {
        if (kwVar instanceof kw.j) {
            return ((qz) this.f88907a.ga().getValue()).serialize(parsingContext, ((kw.j) kwVar).c());
        }
        if (kwVar instanceof kw.h) {
            return ((ty) this.f88907a.R9().getValue()).serialize(parsingContext, ((kw.h) kwVar).c());
        }
        if (kwVar instanceof kw.g) {
            return ((iy) this.f88907a.L9().getValue()).serialize(parsingContext, ((kw.g) kwVar).c());
        }
        if (kwVar instanceof kw.b) {
            return ((q) this.f88907a.j().getValue()).serialize(parsingContext, ((kw.b) kwVar).c());
        }
        if (kwVar instanceof kw.c) {
            return ((a0) this.f88907a.p().getValue()).serialize(parsingContext, ((kw.c) kwVar).c());
        }
        if (kwVar instanceof kw.k) {
            return ((a00) this.f88907a.ma().getValue()).serialize(parsingContext, ((kw.k) kwVar).c());
        }
        if (kwVar instanceof kw.f) {
            return ((u0) this.f88907a.B().getValue()).serialize(parsingContext, ((kw.f) kwVar).c());
        }
        if (kwVar instanceof kw.a) {
            return ((g) this.f88907a.d().getValue()).serialize(parsingContext, ((kw.a) kwVar).c());
        }
        if (kwVar instanceof kw.i) {
            return ((dz.c) this.f88907a.X9().getValue()).serialize(parsingContext, ((kw.i) kwVar).c());
        }
        throw new lf.m();
    }
}
