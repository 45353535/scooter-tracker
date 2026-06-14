package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.i8;
import k8.st;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class tt implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91520a;

    public tt(my myVar) {
        this.f91520a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public st deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "solid")) {
            return new st.d(((hq) this.f91520a.q7().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "cloud")) {
            return new st.a(((i8.b) this.f91520a.a2().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        wt wtVar = orThrow instanceof wt ? (wt) orThrow : null;
        if (wtVar != null) {
            return ((vt) this.f91520a.u8().getValue()).resolve(parsingContext, wtVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, st stVar) {
        if (stVar instanceof st.d) {
            return ((hq) this.f91520a.q7().getValue()).serialize(parsingContext, ((st.d) stVar).c());
        }
        if (stVar instanceof st.a) {
            return ((i8.b) this.f91520a.a2().getValue()).serialize(parsingContext, ((st.a) stVar).c());
        }
        throw new lf.m();
    }
}
