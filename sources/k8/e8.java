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
public abstract class e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f87180a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xc f87181b = new xc(null, Expression.Companion.constant$default(Expression.INSTANCE, 10L, null, 2, null), 1, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87182a;

        public b(my myVar) {
            this.f87182a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d8 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            xc xcVar = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", this.f87182a.w3());
            if (xcVar == null) {
                xcVar = e8.f87181b;
            }
            return new d8(optionalExpression, xcVar, (ar) JsonPropertyParser.readOptional(parsingContext, jSONObject, "stroke", this.f87182a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, d8 d8Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_color", d8Var.f86906a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "radius", d8Var.f86907b, this.f87182a.w3());
            JsonPropertyParser.write(parsingContext, jSONObject, "stroke", d8Var.f86908c, this.f87182a.C7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87183a;

        public c(my myVar) {
            this.f87183a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f8 deserialize(ParsingContext parsingContext, f8 f8Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new f8(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, f8Var != null ? f8Var.f87445a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, f8Var != null ? f8Var.f87446b : null, this.f87183a.x3()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "stroke", allowPropertyOverride, f8Var != null ? f8Var.f87447c : null, this.f87183a.D7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, f8 f8Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_color", f8Var.f87445a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "radius", f8Var.f87446b, this.f87183a.x3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "stroke", f8Var.f87447c, this.f87183a.D7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "circle");
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
        private final my f87184a;

        public d(my myVar) {
            this.f87184a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d8 resolve(ParsingContext parsingContext, f8 f8Var, JSONObject jSONObject) {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, f8Var.f87445a, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            xc xcVar = (xc) JsonFieldResolver.resolveOptional(parsingContext, f8Var.f87446b, jSONObject, "radius", this.f87184a.y3(), this.f87184a.w3());
            if (xcVar == null) {
                xcVar = e8.f87181b;
            }
            return new d8(expressionResolveOptionalExpression, xcVar, (ar) JsonFieldResolver.resolveOptional(parsingContext, f8Var.f87447c, jSONObject, "stroke", this.f87184a.E7(), this.f87184a.C7()));
        }
    }
}
