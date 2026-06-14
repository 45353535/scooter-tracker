package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.rr;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class kr implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f88684a;

    public kr(my myVar) {
        this.f88684a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rr deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        rr rrVar = entityTemplate instanceof rr ? (rr) entityTemplate : null;
        if (rrVar != null && (strA = rrVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "solid")) {
            return new rr.d(((or) this.f88684a.M7().getValue()).deserialize(parsingContext, (qr) (rrVar != null ? rrVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "dashed")) {
            return new rr.c(((gr) this.f88684a.G7().getValue()).deserialize(parsingContext, (ir) (rrVar != null ? rrVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, rr rrVar) {
        if (rrVar instanceof rr.d) {
            return ((or) this.f88684a.M7().getValue()).serialize(parsingContext, ((rr.d) rrVar).c());
        }
        if (rrVar instanceof rr.c) {
            return ((gr) this.f88684a.G7().getValue()).serialize(parsingContext, ((rr.c) rrVar).c());
        }
        throw new lf.m();
    }
}
