package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.cp;
import k8.e8;
import k8.hn;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ap implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86306a;

    public ap(my myVar) {
        this.f86306a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cp deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String strA;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        cp cpVar = entityTemplate instanceof cp ? (cp) entityTemplate : null;
        if (cpVar != null && (strA = cpVar.a()) != null) {
            string = strA;
        }
        if (Intrinsics.areEqual(string, "rounded_rectangle")) {
            return new cp.d(((hn.c) this.f86306a.y6().getValue()).deserialize(parsingContext, (in) (cpVar != null ? cpVar.b() : null), jSONObject));
        }
        if (Intrinsics.areEqual(string, "circle")) {
            return new cp.a(((e8.c) this.f86306a.Y1().getValue()).deserialize(parsingContext, (f8) (cpVar != null ? cpVar.b() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, cp cpVar) {
        if (cpVar instanceof cp.d) {
            return ((hn.c) this.f86306a.y6().getValue()).serialize(parsingContext, ((cp.d) cpVar).c());
        }
        if (cpVar instanceof cp.a) {
            return ((e8.c) this.f86306a.Y1().getValue()).serialize(parsingContext, ((cp.a) cpVar).c());
        }
        throw new lf.m();
    }
}
