package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.p2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class q2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90506a;

    public q2(my myVar) {
        this.f90506a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p2 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "text")) {
            return new p2.c(((f0) this.f90506a.s().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "url")) {
            return new p2.d(((k0) this.f90506a.v().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        t2 t2Var = orThrow instanceof t2 ? (t2) orThrow : null;
        if (t2Var != null) {
            return ((s2) this.f90506a.e0().getValue()).resolve(parsingContext, t2Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, p2 p2Var) {
        if (p2Var instanceof p2.c) {
            return ((f0) this.f90506a.s().getValue()).serialize(parsingContext, ((p2.c) p2Var).c());
        }
        if (p2Var instanceof p2.d) {
            return ((k0) this.f90506a.v().getValue()).serialize(parsingContext, ((p2.d) p2Var).c());
        }
        throw new lf.m();
    }
}
