package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.n9;
import k8.oc;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class o9 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90175a;

    public o9(my myVar) {
        this.f90175a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n9 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "infinity")) {
            return new n9.d(((uf) this.f90175a.g4().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "fixed")) {
            return new n9.c(((oc.b) this.f90175a.n3().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        r9 r9Var = orThrow instanceof r9 ? (r9) orThrow : null;
        if (r9Var != null) {
            return ((q9) this.f90175a.x2().getValue()).resolve(parsingContext, r9Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, n9 n9Var) {
        if (n9Var instanceof n9.d) {
            return ((uf) this.f90175a.g4().getValue()).serialize(parsingContext, ((n9.d) n9Var).c());
        }
        if (n9Var instanceof n9.c) {
            return ((oc.b) this.f90175a.n3().getValue()).serialize(parsingContext, ((n9.c) n9Var).c());
        }
        throw new lf.m();
    }
}
