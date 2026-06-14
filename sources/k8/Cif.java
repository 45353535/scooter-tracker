package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.kf;
import k8.ma;
import k8.yq;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: k8.if, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class Cif implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88241a;

    public Cif(my myVar) {
        this.f88241a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kf deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        kf kfVar = entityTemplate instanceof kf ? (kf) entityTemplate : null;
        if (kfVar != null && (strA = kfVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "default")) {
            return new kf.c(((ma.c) this.f88241a.K2().getValue()).deserialize(parsingContext, (na) (kfVar != null ? kfVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "stretch")) {
            return new kf.d(((yq.c) this.f88241a.A7().getValue()).deserialize(parsingContext, (zq) (kfVar != null ? kfVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, kf kfVar) {
        if (kfVar instanceof kf.c) {
            return ((ma.c) this.f88241a.K2().getValue()).serialize(parsingContext, ((kf.c) kfVar).c());
        }
        if (kfVar instanceof kf.d) {
            return ((yq.c) this.f88241a.A7().getValue()).serialize(parsingContext, ((kf.d) kfVar).c());
        }
        throw new lf.m();
    }
}
