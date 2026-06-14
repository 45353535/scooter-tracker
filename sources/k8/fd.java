package k8;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import k8.bd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class fd implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my f87465a;

    public fd(my myVar) {
        this.f87465a = myVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bd.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new bd.c(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "down", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ToolBar.FORWARD, typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "up", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext parsingContext, bd.c cVar) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "down", cVar.f86514a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, ToolBar.FORWARD, cVar.f86515b);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", cVar.f86516c);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", cVar.f86517d);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "up", cVar.f86518e);
        return jSONObject;
    }
}
