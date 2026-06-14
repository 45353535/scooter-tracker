package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ej;
import k8.m6;
import k8.s8;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class k6 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88572a;

    public k6(my myVar) {
        this.f88572a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m6 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        m6 m6Var = entityTemplate instanceof m6 ? (m6) entityTemplate : null;
        if (m6Var != null && (strA = m6Var.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "color_animator")) {
            return new m6.a(((s8.e) this.f88572a.k2().getValue()).deserialize(parsingContext, (t8) (m6Var != null ? m6Var.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "number_animator")) {
            return new m6.d(((ej.e) this.f88572a.i5().getValue()).deserialize(parsingContext, (fj) (m6Var != null ? m6Var.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, m6 m6Var) {
        if (m6Var instanceof m6.a) {
            return ((s8.e) this.f88572a.k2().getValue()).serialize(parsingContext, ((m6.a) m6Var).c());
        }
        if (m6Var instanceof m6.d) {
            return ((ej.e) this.f88572a.i5().getValue()).serialize(parsingContext, ((m6.d) m6Var).c());
        }
        throw new lf.m();
    }
}
