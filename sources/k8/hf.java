package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.gf;
import k8.ma;
import k8.yq;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hf implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88011a;

    public hf(my myVar) {
        this.f88011a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gf deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "default")) {
            return new gf.c(((ma.b) this.f88011a.J2().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "stretch")) {
            return new gf.d(((yq.b) this.f88011a.z7().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        kf kfVar = orThrow instanceof kf ? (kf) orThrow : null;
        if (kfVar != null) {
            return ((jf) this.f88011a.c4().getValue()).resolve(parsingContext, kfVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, gf gfVar) {
        if (gfVar instanceof gf.c) {
            return ((ma.b) this.f88011a.J2().getValue()).serialize(parsingContext, ((gf.c) gfVar).c());
        }
        if (gfVar instanceof gf.d) {
            return ((yq.b) this.f88011a.z7().getValue()).serialize(parsingContext, ((gf.d) gfVar).c());
        }
        throw new lf.m();
    }
}
