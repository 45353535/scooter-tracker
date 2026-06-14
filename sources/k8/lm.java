package k8;

import com.ironsource.C4240b4;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import k8.em;
import k8.fn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88845a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ValueValidator f88846b = new ValueValidator() { // from class: k8.km
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return lm.b(((Double) obj).doubleValue());
        }
    };

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88847a;

        public b(my myVar) {
            this.f88847a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public em.a deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new em.a(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, C4240b4.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, lm.f88846b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, em.a aVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", aVar.f87347a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.i.L, aVar.f87348b);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88848a;

        public c(my myVar) {
            this.f88848a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public fn.a deserialize(ParsingContext parsingContext, fn.a aVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new fn.a(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, aVar != null ? aVar.f87566a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, aVar != null ? aVar.f87567b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, lm.f88846b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, fn.a aVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", aVar.f87566a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.i.L, aVar.f87567b);
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
        private final my f88849a;

        public d(my myVar) {
            this.f88849a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public em.a resolve(ParsingContext parsingContext, fn.a aVar, JSONObject jSONObject) {
            return new em.a(JsonFieldResolver.resolveExpression(parsingContext, aVar.f87566a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldResolver.resolveExpression(parsingContext, aVar.f87567b, jSONObject, C4240b4.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, lm.f88846b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }
}
