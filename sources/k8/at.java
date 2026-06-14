package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.li;
import k8.rm;
import k8.zs;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class at implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86406a;

    public at(my myVar) {
        this.f86406a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zs deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "gradient")) {
            return new zs.c(((li.b) this.f86406a.V4().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "radial_gradient")) {
            return new zs.d(((rm.b) this.f86406a.l6().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        dt dtVar = orThrow instanceof dt ? (dt) orThrow : null;
        if (dtVar != null) {
            return ((ct) this.f86406a.i8().getValue()).resolve(parsingContext, dtVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, zs zsVar) {
        if (zsVar instanceof zs.c) {
            return ((li.b) this.f86406a.V4().getValue()).serialize(parsingContext, ((zs.c) zsVar).c());
        }
        if (zsVar instanceof zs.d) {
            return ((rm.b) this.f86406a.l6().getValue()).serialize(parsingContext, ((zs.d) zsVar).c());
        }
        throw new lf.m();
    }
}
