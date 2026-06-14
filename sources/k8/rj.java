package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.gk;
import k8.qj;
import k8.zj;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class rj implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90741a;

    public rj(my myVar) {
        this.f90741a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qj deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "slide")) {
            return new qj.d(((gk.c) this.f90741a.w5().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "overlap")) {
            return new qj.c(((zj.c) this.f90741a.t5().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        ik ikVar = orThrow instanceof ik ? (ik) orThrow : null;
        if (ikVar != null) {
            return ((tj) this.f90741a.s5().getValue()).resolve(parsingContext, ikVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, qj qjVar) {
        if (qjVar instanceof qj.d) {
            return ((gk.c) this.f90741a.w5().getValue()).serialize(parsingContext, ((qj.d) qjVar).c());
        }
        if (qjVar instanceof qj.c) {
            return ((zj.c) this.f90741a.t5().getValue()).serialize(parsingContext, ((qj.c) qjVar).c());
        }
        throw new lf.m();
    }
}
