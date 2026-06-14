package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.tp;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class zp implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92964a;

    public zp(my myVar) {
        this.f92964a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tp.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        return new tp.c(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper, function1), (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f92964a.Y2()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, function1), (cb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "track_active_style", this.f92964a.V2()), (cb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "track_inactive_style", this.f92964a.V2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, tp.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", cVar.f91448a);
        JsonPropertyParser.write(parsingContext, jSONObject, "margins", cVar.f91449b, this.f92964a.Y2());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", cVar.f91450c);
        JsonPropertyParser.write(parsingContext, jSONObject, "track_active_style", cVar.f91451d, this.f92964a.V2());
        JsonPropertyParser.write(parsingContext, jSONObject, "track_inactive_style", cVar.f91452e, this.f92964a.V2());
        return jSONObject;
    }
}
