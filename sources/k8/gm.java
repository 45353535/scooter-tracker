package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.fm;
import k8.nm;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class gm implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87834a;

    public gm(my myVar) {
        this.f87834a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fm deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "fixed")) {
            return new fm.c(((nm.c) this.f87834a.i6().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "relative")) {
            return new fm.d(((ym) this.f87834a.r6().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        jm jmVar = orThrow instanceof jm ? (jm) orThrow : null;
        if (jmVar != null) {
            return ((im) this.f87834a.e6().getValue()).resolve(parsingContext, jmVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, fm fmVar) {
        if (fmVar instanceof fm.c) {
            return ((nm.c) this.f87834a.i6().getValue()).serialize(parsingContext, ((fm.c) fmVar).c());
        }
        if (fmVar instanceof fm.d) {
            return ((ym) this.f87834a.r6().getValue()).serialize(parsingContext, ((fm.d) fmVar).c());
        }
        throw new lf.m();
    }
}
