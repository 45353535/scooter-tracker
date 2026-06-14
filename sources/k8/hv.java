package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.gv;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hv implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88135a;

    public hv(my myVar) {
        this.f88135a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gv deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "non_modal")) {
            return new gv.d(((qv) this.f88135a.Y8().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "modal")) {
            return new gv.c(((lv) this.f88135a.V8().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        uv uvVar = orThrow instanceof uv ? (uv) orThrow : null;
        if (uvVar != null) {
            return ((jv) this.f88135a.U8().getValue()).resolve(parsingContext, uvVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, gv gvVar) {
        if (gvVar instanceof gv.d) {
            return ((qv) this.f88135a.Y8().getValue()).serialize(parsingContext, ((gv.d) gvVar).c());
        }
        if (gvVar instanceof gv.c) {
            return ((lv) this.f88135a.V8().getValue()).serialize(parsingContext, ((gv.c) gvVar).c());
        }
        throw new lf.m();
    }
}
