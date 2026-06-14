package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ml;
import k8.ol;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ql implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90597a;

    public ql(my myVar) {
        this.f90597a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ml deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String optionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject, "type");
        if (optionalString == null) {
            optionalString = "pivot-fixed";
        }
        if (Intrinsics.areEqual(optionalString, "pivot-fixed")) {
            return new ml.c(((ol.c) this.f90597a.Q5().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(optionalString, "pivot-percentage")) {
            return new ml.d(((ul) this.f90597a.W5().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(optionalString, jSONObject);
        yl ylVar = orThrow instanceof yl ? (yl) orThrow : null;
        if (ylVar != null) {
            return ((sl) this.f90597a.V5().getValue()).resolve(parsingContext, ylVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", optionalString);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ml mlVar) {
        if (mlVar instanceof ml.c) {
            return ((ol.c) this.f90597a.Q5().getValue()).serialize(parsingContext, ((ml.c) mlVar).c());
        }
        if (mlVar instanceof ml.d) {
            return ((ul) this.f90597a.W5().getValue()).serialize(parsingContext, ((ml.d) mlVar).c());
        }
        throw new lf.m();
    }
}
