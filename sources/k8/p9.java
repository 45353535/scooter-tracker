package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.oc;
import k8.r9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class p9 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90346a;

    public p9(my myVar) {
        this.f90346a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r9 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        r9 r9Var = entityTemplate instanceof r9 ? (r9) entityTemplate : null;
        if (r9Var != null && (strA = r9Var.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "infinity")) {
            return new r9.d(((vf) this.f90346a.h4().getValue()).deserialize(parsingContext, (xf) (r9Var != null ? r9Var.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "fixed")) {
            return new r9.c(((oc.c) this.f90346a.o3().getValue()).deserialize(parsingContext, (pc) (r9Var != null ? r9Var.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, r9 r9Var) {
        if (r9Var instanceof r9.d) {
            return ((vf) this.f90346a.h4().getValue()).serialize(parsingContext, ((r9.d) r9Var).c());
        }
        if (r9Var instanceof r9.c) {
            return ((oc.c) this.f90346a.o3().getValue()).serialize(parsingContext, ((r9.c) r9Var).c());
        }
        throw new lf.m();
    }
}
