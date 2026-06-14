package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.ih;
import k8.nh;
import k8.th;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ph implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f90378a;

    public ph(my myVar) {
        this.f90378a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ih deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(string, "regex")) {
            return new ih.d(((th.b) this.f90378a.J4().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(string, "expression")) {
            return new ih.c(((nh.b) this.f90378a.D4().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        vh vhVar = orThrow instanceof vh ? (vh) orThrow : null;
        if (vhVar != null) {
            return ((rh) this.f90378a.I4().getValue()).resolve(parsingContext, vhVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, ih ihVar) {
        if (ihVar instanceof ih.d) {
            return ((th.b) this.f90378a.J4().getValue()).serialize(parsingContext, ((ih.d) ihVar).c());
        }
        if (ihVar instanceof ih.c) {
            return ((nh.b) this.f90378a.D4().getValue()).serialize(parsingContext, ((ih.c) ihVar).c());
        }
        throw new lf.m();
    }
}
