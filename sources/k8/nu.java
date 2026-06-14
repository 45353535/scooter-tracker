package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ru;
import k8.uu;
import k8.wu;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class nu implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90103a;

    public nu(my myVar) {
        this.f90103a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wu deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        wu wuVar = entityTemplate instanceof wu ? (wu) entityTemplate : null;
        if (wuVar != null && (strA = wuVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "particles")) {
            return new wu.c(((ru.c) this.f90103a.H8().getValue()).deserialize(parsingContext, (su) (wuVar != null ? wuVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "solid")) {
            return new wu.d(((uu.c) this.f90103a.K8().getValue()).deserialize(parsingContext, (vu) (wuVar != null ? wuVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, wu wuVar) {
        if (wuVar instanceof wu.c) {
            return ((ru.c) this.f90103a.H8().getValue()).serialize(parsingContext, ((wu.c) wuVar).c());
        }
        if (wuVar instanceof wu.d) {
            return ((uu.c) this.f90103a.K8().getValue()).serialize(parsingContext, ((wu.d) wuVar).c());
        }
        throw new lf.m();
    }
}
