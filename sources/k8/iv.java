package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.uv;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class iv implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88288a;

    public iv(my myVar) {
        this.f88288a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uv deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        uv uvVar = entityTemplate instanceof uv ? (uv) entityTemplate : null;
        if (uvVar != null && (strA = uvVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "non_modal")) {
            return new uv.d(((rv) this.f88288a.Z8().getValue()).deserialize(parsingContext, (tv) (uvVar != null ? uvVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "modal")) {
            return new uv.c(((mv) this.f88288a.W8().getValue()).deserialize(parsingContext, (ov) (uvVar != null ? uvVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, uv uvVar) {
        if (uvVar instanceof uv.d) {
            return ((rv) this.f88288a.Z8().getValue()).serialize(parsingContext, ((uv.d) uvVar).c());
        }
        if (uvVar instanceof uv.c) {
            return ((mv) this.f88288a.W8().getValue()).serialize(parsingContext, ((uv.c) uvVar).c());
        }
        throw new lf.m();
    }
}
