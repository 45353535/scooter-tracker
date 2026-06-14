package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.t2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class r2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90623a;

    public r2(my myVar) {
        this.f90623a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t2 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        t2 t2Var = entityTemplate instanceof t2 ? (t2) entityTemplate : null;
        if (t2Var != null && (strA = t2Var.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "text")) {
            return new t2.c(((g0) this.f90623a.t().getValue()).deserialize(parsingContext, (i0) (t2Var != null ? t2Var.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "url")) {
            return new t2.d(((l0) this.f90623a.w().getValue()).deserialize(parsingContext, (n0) (t2Var != null ? t2Var.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, t2 t2Var) {
        if (t2Var instanceof t2.c) {
            return ((g0) this.f90623a.t().getValue()).serialize(parsingContext, ((t2.c) t2Var).c());
        }
        if (t2Var instanceof t2.d) {
            return ((l0) this.f90623a.w().getValue()).serialize(parsingContext, ((t2.d) t2Var).c());
        }
        throw new lf.m();
    }
}
