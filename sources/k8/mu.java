package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.iu;
import k8.ru;
import k8.uu;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class mu implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f89058a;

    public mu(my myVar) {
        this.f89058a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public iu deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "particles")) {
            return new iu.c(((ru.b) this.f89058a.G8().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "solid")) {
            return new iu.d(((uu.b) this.f89058a.J8().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        wu wuVar = orThrow instanceof wu ? (wu) orThrow : null;
        if (wuVar != null) {
            return ((ou) this.f89058a.F8().getValue()).resolve(parsingContext, wuVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, iu iuVar) {
        if (iuVar instanceof iu.c) {
            return ((ru.b) this.f89058a.G8().getValue()).serialize(parsingContext, ((iu.c) iuVar).c());
        }
        if (iuVar instanceof iu.d) {
            return ((uu.b) this.f89058a.J8().getValue()).serialize(parsingContext, ((iu.d) iuVar).c());
        }
        throw new lf.m();
    }
}
