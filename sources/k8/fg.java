package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.zf;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class fg implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87509a;

    public fg(my myVar) {
        this.f87509a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zf deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "regex")) {
            return new zf.d(((jg) this.f87509a.p4().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "expression")) {
            return new zf.c(((bg) this.f87509a.j4().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        ng ngVar = orThrow instanceof ng ? (ng) orThrow : null;
        if (ngVar != null) {
            return ((hg) this.f87509a.o4().getValue()).resolve(parsingContext, ngVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, zf zfVar) {
        if (zfVar instanceof zf.d) {
            return ((jg) this.f87509a.p4().getValue()).serialize(parsingContext, ((zf.d) zfVar).c());
        }
        if (zfVar instanceof zf.c) {
            return ((bg) this.f87509a.j4().getValue()).serialize(parsingContext, ((zf.c) zfVar).c());
        }
        throw new lf.m();
    }
}
