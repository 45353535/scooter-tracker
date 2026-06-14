package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.gb;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class eb implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87219a;

    public eb(my myVar) {
        this.f87219a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gb deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        gb gbVar = entityTemplate instanceof gb ? (gb) entityTemplate : null;
        if (gbVar != null && (strA = gbVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "shape_drawable")) {
            return new gb.c(((wo) this.f87219a.T6().getValue()).deserialize(parsingContext, (yo) (gbVar != null ? gbVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, gb gbVar) {
        if (gbVar instanceof gb.c) {
            return ((wo) this.f87219a.T6().getValue()).serialize(parsingContext, ((gb.c) gbVar).c());
        }
        throw new lf.m();
    }
}
