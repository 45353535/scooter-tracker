package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.e8;
import k8.hn;
import k8.to;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class zo implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92963a;

    public zo(my myVar) {
        this.f92963a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public to deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "rounded_rectangle")) {
            return new to.d(((hn.b) this.f92963a.x6().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "circle")) {
            return new to.a(((e8.b) this.f92963a.X1().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        cp cpVar = orThrow instanceof cp ? (cp) orThrow : null;
        if (cpVar != null) {
            return ((bp) this.f92963a.X6().getValue()).resolve(parsingContext, cpVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, to toVar) {
        if (toVar instanceof to.d) {
            return ((hn.b) this.f92963a.x6().getValue()).serialize(parsingContext, ((to.d) toVar).c());
        }
        if (toVar instanceof to.a) {
            return ((e8.b) this.f92963a.X1().getValue()).serialize(parsingContext, ((to.a) toVar).c());
        }
        throw new lf.m();
    }
}
