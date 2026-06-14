package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.dr;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class jr implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88516a;

    public jr(my myVar) {
        this.f88516a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dr deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "solid")) {
            return new dr.d(((nr) this.f88516a.L7().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "dashed")) {
            return new dr.c(((fr) this.f88516a.F7().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        rr rrVar = orThrow instanceof rr ? (rr) orThrow : null;
        if (rrVar != null) {
            return ((lr) this.f88516a.K7().getValue()).resolve(parsingContext, rrVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, dr drVar) {
        if (drVar instanceof dr.d) {
            return ((nr) this.f88516a.L7().getValue()).serialize(parsingContext, ((dr.d) drVar).c());
        }
        if (drVar instanceof dr.c) {
            return ((fr) this.f88516a.F7().getValue()).serialize(parsingContext, ((dr.c) drVar).c());
        }
        throw new lf.m();
    }
}
