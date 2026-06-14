package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.i8;
import k8.wt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ut implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f91856a;

    public ut(my myVar) {
        this.f91856a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wt deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        wt wtVar = entityTemplate instanceof wt ? (wt) entityTemplate : null;
        if (wtVar != null && (strA = wtVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "solid")) {
            return new wt.d(((iq) this.f91856a.r7().getValue()).deserialize(parsingContext, (kq) (wtVar != null ? wtVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "cloud")) {
            return new wt.a(((i8.c) this.f91856a.b2().getValue()).deserialize(parsingContext, (j8) (wtVar != null ? wtVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, wt wtVar) {
        if (wtVar instanceof wt.d) {
            return ((iq) this.f91856a.r7().getValue()).serialize(parsingContext, ((wt.d) wtVar).c());
        }
        if (wtVar instanceof wt.a) {
            return ((i8.c) this.f91856a.b2().getValue()).serialize(parsingContext, ((wt.a) wtVar).c());
        }
        throw new lf.m();
    }
}
