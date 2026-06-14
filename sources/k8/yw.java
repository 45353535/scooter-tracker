package k8;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.xw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class yw implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f92827a;

    public yw(my myVar) {
        this.f92827a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xw deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new xw(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, com.taurusx.tax.f.a.f65992s, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING), (xw.c) JsonPropertyParser.readOptional(parsingContext, jSONObject, "resolution", this.f92827a.t9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, xw xwVar) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, com.taurusx.tax.f.a.f65992s, xwVar.f92539a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "mime_type", xwVar.f92540b);
        JsonPropertyParser.write(parsingContext, jSONObject, "resolution", xwVar.f92541c, this.f92827a.t9());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "video_source");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", xwVar.f92542d, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
