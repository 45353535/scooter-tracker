package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.nh;
import k8.th;
import k8.vh;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class qh implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90577a;

    public qh(my myVar) {
        this.f90577a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vh deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        vh vhVar = entityTemplate instanceof vh ? (vh) entityTemplate : null;
        if (vhVar != null && (strA = vhVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "regex")) {
            return new vh.d(((th.c) this.f90577a.K4().getValue()).deserialize(parsingContext, (uh) (vhVar != null ? vhVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "expression")) {
            return new vh.c(((nh.c) this.f90577a.E4().getValue()).deserialize(parsingContext, (oh) (vhVar != null ? vhVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, vh vhVar) {
        if (vhVar instanceof vh.d) {
            return ((th.c) this.f90577a.K4().getValue()).serialize(parsingContext, ((vh.d) vhVar).c());
        }
        if (vhVar instanceof vh.c) {
            return ((nh.c) this.f90577a.E4().getValue()).serialize(parsingContext, ((vh.c) vhVar).c());
        }
        throw new lf.m();
    }
}
