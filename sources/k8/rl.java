package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ol;
import k8.yl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class rl implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90743a;

    public rl(my myVar) {
        this.f90743a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yl deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String optionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject, "type");
        if (optionalString == null) {
            optionalString = "pivot-fixed";
        }
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(optionalString);
        yl ylVar = entityTemplate instanceof yl ? (yl) entityTemplate : null;
        if (ylVar != null && (strA = ylVar.a()) != null) {
            optionalString = strA;
        }
        if (Intrinsics.areEqual(optionalString, "pivot-fixed")) {
            return new yl.c(((ol.d) this.f90743a.R5().getValue()).deserialize(parsingContext, (pl) (ylVar != null ? ylVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(optionalString, "pivot-percentage")) {
            return new yl.d(((vl) this.f90743a.X5().getValue()).deserialize(parsingContext, (xl) (ylVar != null ? ylVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", optionalString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, yl ylVar) {
        if (ylVar instanceof yl.c) {
            return ((ol.d) this.f90743a.R5().getValue()).serialize(parsingContext, ((yl.c) ylVar).c());
        }
        if (ylVar instanceof yl.d) {
            return ((vl) this.f90743a.X5().getValue()).serialize(parsingContext, ((yl.d) ylVar).c());
        }
        throw new lf.m();
    }
}
