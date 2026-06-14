package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88094a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xc f88095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xc f88096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xc f88097d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88098a;

        public b(my myVar) {
            this.f88098a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public gn deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            xc xcVar = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corner_radius", this.f88098a.w3());
            if (xcVar == null) {
                xcVar = hn.f88095b;
            }
            xc xcVar2 = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_height", this.f88098a.w3());
            if (xcVar2 == null) {
                xcVar2 = hn.f88096c;
            }
            xc xcVar3 = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_width", this.f88098a.w3());
            if (xcVar3 == null) {
                xcVar3 = hn.f88097d;
            }
            return new gn(optionalExpression, xcVar, xcVar2, xcVar3, (ar) JsonPropertyParser.readOptional(parsingContext, jSONObject, "stroke", this.f88098a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, gn gnVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_color", gnVar.f87840a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "corner_radius", gnVar.f87841b, this.f88098a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_height", gnVar.f87842c, this.f88098a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_width", gnVar.f87843d, this.f88098a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "stroke", gnVar.f87844e, this.f88098a.C7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88099a;

        public c(my myVar) {
            this.f88099a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public in deserialize(ParsingContext parsingContext, in inVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new in(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, inVar != null ? inVar.f88266a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", allowPropertyOverride, inVar != null ? inVar.f88267b : null, this.f88099a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_height", allowPropertyOverride, inVar != null ? inVar.f88268c : null, this.f88099a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_width", allowPropertyOverride, inVar != null ? inVar.f88269d : null, this.f88099a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "stroke", allowPropertyOverride, inVar != null ? inVar.f88270e : null, this.f88099a.D7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, in inVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_color", inVar.f88266a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corner_radius", inVar.f88267b, this.f88099a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_height", inVar.f88268c, this.f88099a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_width", inVar.f88269d, this.f88099a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "stroke", inVar.f88270e, this.f88099a.D7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer, com.yandex.div.serialization.Deserializer
        public /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, Object obj) {
            return h8.b.a(this, parsingContext, obj);
        }

        @Override // com.yandex.div.serialization.Deserializer
        public /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return deserialize(parsingContext, obj);
        }
    }

    public static final class d implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88100a;

        public d(my myVar) {
            this.f88100a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public gn resolve(ParsingContext parsingContext, in inVar, JSONObject jSONObject) {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, inVar.f88266a, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            xc xcVar = (xc) JsonFieldResolver.resolveOptional(parsingContext, inVar.f88267b, jSONObject, "corner_radius", this.f88100a.y3(), this.f88100a.w3());
            if (xcVar == null) {
                xcVar = hn.f88095b;
            }
            xc xcVar2 = (xc) JsonFieldResolver.resolveOptional(parsingContext, inVar.f88268c, jSONObject, "item_height", this.f88100a.y3(), this.f88100a.w3());
            if (xcVar2 == null) {
                xcVar2 = hn.f88096c;
            }
            xc xcVar3 = xcVar2;
            xc xcVar4 = (xc) JsonFieldResolver.resolveOptional(parsingContext, inVar.f88269d, jSONObject, "item_width", this.f88100a.y3(), this.f88100a.w3());
            if (xcVar4 == null) {
                xcVar4 = hn.f88097d;
            }
            return new gn(expressionResolveOptionalExpression, xcVar, xcVar3, xcVar4, (ar) JsonFieldResolver.resolveOptional(parsingContext, inVar.f88270e, jSONObject, "stroke", this.f88100a.E7(), this.f88100a.C7()));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f88095b = new xc(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f88096c = new xc(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f88097d = new xc(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
    }
}
