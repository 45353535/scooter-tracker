package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.dn;
import k8.wm;
import k8.zc;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class um implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91700a;

    public um(my myVar) {
        this.f91700a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wm deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        wm wmVar = entityTemplate instanceof wm ? (wm) entityTemplate : null;
        if (wmVar != null && (strA = wmVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "fixed")) {
            return new wm.c(((zc.d) this.f91700a.x3().getValue()).deserialize(parsingContext, (ad) (wmVar != null ? wmVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "relative")) {
            return new wm.d(((dn.d) this.f91700a.v6().getValue()).deserialize(parsingContext, (en) (wmVar != null ? wmVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, wm wmVar) {
        if (wmVar instanceof wm.c) {
            return ((zc.d) this.f91700a.x3().getValue()).serialize(parsingContext, ((wm.c) wmVar).c());
        }
        if (wmVar instanceof wm.d) {
            return ((dn.d) this.f91700a.v6().getValue()).serialize(parsingContext, ((wm.d) wmVar).c());
        }
        throw new lf.m();
    }
}
