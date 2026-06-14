package k8;

import androidx.compose.material.OutlinedTextFieldKt;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import io.appmetrica.analytics.impl.H2;
import k8.bd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class cd implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f86668a;

    public cd(my myVar) {
        this.f86668a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bd deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new bd(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f86668a.F1()), (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f86668a.L1()), (bd.c) JsonPropertyParser.readOptional(parsingContext, jSONObject, "next_focus_ids", this.f86668a.C3()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_blur", this.f86668a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_focus", this.f86668a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, bd bdVar) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, bdVar.f86505a, this.f86668a.F1());
        JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, bdVar.f86506b, this.f86668a.L1());
        JsonPropertyParser.write(parsingContext, jSONObject, "next_focus_ids", bdVar.f86507c, this.f86668a.C3());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_blur", bdVar.f86508d, this.f86668a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_focus", bdVar.f86509e, this.f86668a.u0());
        return jSONObject;
    }
}
