package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.s7;
import k8.w7;
import k8.y7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class z7 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92916a;

    public z7(my myVar) {
        this.f92916a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y7 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "set")) {
            return new y7.d(((w7.b) this.f92916a.R1().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "change_bounds")) {
            return new y7.a(((s7.c) this.f92916a.O1().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        c8 c8Var = orThrow instanceof c8 ? (c8) orThrow : null;
        if (c8Var != null) {
            return ((b8) this.f92916a.W1().getValue()).resolve(parsingContext, c8Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, y7 y7Var) {
        if (y7Var instanceof y7.d) {
            return ((w7.b) this.f92916a.R1().getValue()).serialize(parsingContext, ((y7.d) y7Var).c());
        }
        if (y7Var instanceof y7.a) {
            return ((s7.c) this.f92916a.O1().getValue()).serialize(parsingContext, ((y7.a) y7Var).c());
        }
        throw new lf.m();
    }
}
