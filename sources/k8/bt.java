package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.dt;
import k8.li;
import k8.rm;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bt implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86574a;

    public bt(my myVar) {
        this.f86574a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dt deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        dt dtVar = entityTemplate instanceof dt ? (dt) entityTemplate : null;
        if (dtVar != null && (strA = dtVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "gradient")) {
            return new dt.c(((li.c) this.f86574a.W4().getValue()).deserialize(parsingContext, (mi) (dtVar != null ? dtVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "radial_gradient")) {
            return new dt.d(((rm.c) this.f86574a.m6().getValue()).deserialize(parsingContext, (fn) (dtVar != null ? dtVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, dt dtVar) {
        if (dtVar instanceof dt.c) {
            return ((li.c) this.f86574a.W4().getValue()).serialize(parsingContext, ((dt.c) dtVar).c());
        }
        if (dtVar instanceof dt.d) {
            return ((rm.c) this.f86574a.m6().getValue()).serialize(parsingContext, ((dt.d) dtVar).c());
        }
        throw new lf.m();
    }
}
