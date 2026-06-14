package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.gk;
import k8.ik;
import k8.zj;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sj implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91068a;

    public sj(my myVar) {
        this.f91068a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ik deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        ik ikVar = entityTemplate instanceof ik ? (ik) entityTemplate : null;
        if (ikVar != null && (strA = ikVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "slide")) {
            return new ik.d(((gk.d) this.f91068a.x5().getValue()).deserialize(parsingContext, (hk) (ikVar != null ? ikVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "overlap")) {
            return new ik.c(((zj.d) this.f91068a.u5().getValue()).deserialize(parsingContext, (ak) (ikVar != null ? ikVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ik ikVar) {
        if (ikVar instanceof ik.d) {
            return ((gk.d) this.f91068a.x5().getValue()).serialize(parsingContext, ((ik.d) ikVar).c());
        }
        if (ikVar instanceof ik.c) {
            return ((zj.d) this.f91068a.u5().getValue()).serialize(parsingContext, ((ik.c) ikVar).c());
        }
        throw new lf.m();
    }
}
