package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.cc;
import k8.j7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class dc implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86994a;

    public dc(my myVar) {
        this.f86994a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cc deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "blur")) {
            return new cc.a(((j7.b) this.f86994a.I1().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "rtl_mirror")) {
            return new cc.d(((hc) this.f86994a.k3().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        lc lcVar = orThrow instanceof lc ? (lc) orThrow : null;
        if (lcVar != null) {
            return ((fc) this.f86994a.j3().getValue()).resolve(parsingContext, lcVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, cc ccVar) {
        if (ccVar instanceof cc.a) {
            return ((j7.b) this.f86994a.I1().getValue()).serialize(parsingContext, ((cc.a) ccVar).c());
        }
        if (ccVar instanceof cc.d) {
            return ((hc) this.f86994a.k3().getValue()).serialize(parsingContext, ((cc.d) ccVar).c());
        }
        throw new lf.m();
    }
}
