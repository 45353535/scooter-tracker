package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ej;
import k8.h6;
import k8.s8;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class j6 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88364a;

    public j6(my myVar) {
        this.f88364a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h6 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "color_animator")) {
            return new h6.a(((s8.d) this.f88364a.j2().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "number_animator")) {
            return new h6.d(((ej.d) this.f88364a.h5().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        m6 m6Var = orThrow instanceof m6 ? (m6) orThrow : null;
        if (m6Var != null) {
            return ((l6) this.f88364a.v1().getValue()).resolve(parsingContext, m6Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, h6 h6Var) {
        if (h6Var instanceof h6.a) {
            return ((s8.d) this.f88364a.j2().getValue()).serialize(parsingContext, ((h6.a) h6Var).c());
        }
        if (h6Var instanceof h6.d) {
            return ((ej.d) this.f88364a.h5().getValue()).serialize(parsingContext, ((h6.d) h6Var).c());
        }
        throw new lf.m();
    }
}
