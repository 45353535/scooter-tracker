package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.c8;
import k8.s7;
import k8.w7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a8 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86225a;

    public a8(my myVar) {
        this.f86225a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c8 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        c8 c8Var = entityTemplate instanceof c8 ? (c8) entityTemplate : null;
        if (c8Var != null && (strA = c8Var.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "set")) {
            return new c8.d(((w7.c) this.f86225a.S1().getValue()).deserialize(parsingContext, (x7) (c8Var != null ? c8Var.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "change_bounds")) {
            return new c8.a(((s7.d) this.f86225a.P1().getValue()).deserialize(parsingContext, (t7) (c8Var != null ? c8Var.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, c8 c8Var) {
        if (c8Var instanceof c8.d) {
            return ((w7.c) this.f86225a.S1().getValue()).serialize(parsingContext, ((c8.d) c8Var).c());
        }
        if (c8Var instanceof c8.a) {
            return ((s7.d) this.f86225a.P1().getValue()).serialize(parsingContext, ((c8.a) c8Var).c());
        }
        throw new lf.m();
    }
}
