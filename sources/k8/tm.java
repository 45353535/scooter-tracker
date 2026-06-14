package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.dn;
import k8.sm;
import k8.zc;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class tm implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91407a;

    public tm(my myVar) {
        this.f91407a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sm deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "fixed")) {
            return new sm.c(((zc.c) this.f91407a.w3().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "relative")) {
            return new sm.d(((dn.c) this.f91407a.u6().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        wm wmVar = orThrow instanceof wm ? (wm) orThrow : null;
        if (wmVar != null) {
            return ((vm) this.f91407a.q6().getValue()).resolve(parsingContext, wmVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, sm smVar) {
        if (smVar instanceof sm.c) {
            return ((zc.c) this.f91407a.w3().getValue()).serialize(parsingContext, ((sm.c) smVar).c());
        }
        if (smVar instanceof sm.d) {
            return ((dn.c) this.f91407a.u6().getValue()).serialize(parsingContext, ((sm.d) smVar).c());
        }
        throw new lf.m();
    }
}
