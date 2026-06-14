package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f90007a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90008b = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ValueValidator f90009c = new ValueValidator() { // from class: k8.m7
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return n7.b(((Long) obj).longValue());
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
        private final my f90010a;

        public b(my myVar) {
            this.f90010a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l7 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, n7.f90009c);
            g9 g9Var = (g9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corners_radius", this.f90010a.s2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = n7.f90008b;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "has_shadow", typeHelper, function1, expression);
            if (optionalExpression2 == null) {
                optionalExpression2 = expression;
            }
            return new l7(optionalExpression, g9Var, optionalExpression2, (oo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "shadow", this.f90010a.P6()), (ar) JsonPropertyParser.readOptional(parsingContext, jSONObject, "stroke", this.f90010a.C7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, l7 l7Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", l7Var.f88755a);
            JsonPropertyParser.write(parsingContext, jSONObject, "corners_radius", l7Var.f88756b, this.f90010a.s2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "has_shadow", l7Var.f88757c);
            JsonPropertyParser.write(parsingContext, jSONObject, "shadow", l7Var.f88758d, this.f90010a.P6());
            JsonPropertyParser.write(parsingContext, jSONObject, "stroke", l7Var.f88759e, this.f90010a.C7());
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90011a;

        public c(my myVar) {
            this.f90011a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o7 deserialize(ParsingContext parsingContext, o7 o7Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new o7(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, o7Var != null ? o7Var.f90155a : null, ParsingConvertersKt.NUMBER_TO_INT, n7.f90009c), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "corners_radius", allowPropertyOverride, o7Var != null ? o7Var.f90156b : null, this.f90011a.t2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "has_shadow", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, o7Var != null ? o7Var.f90157c : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "shadow", allowPropertyOverride, o7Var != null ? o7Var.f90158d : null, this.f90011a.Q6()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "stroke", allowPropertyOverride, o7Var != null ? o7Var.f90159e : null, this.f90011a.D7()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, o7 o7Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", o7Var.f90155a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corners_radius", o7Var.f90156b, this.f90011a.t2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "has_shadow", o7Var.f90157c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "shadow", o7Var.f90158d, this.f90011a.Q6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "stroke", o7Var.f90159e, this.f90011a.D7());
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
        private final my f90012a;

        public d(my myVar) {
            this.f90012a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l7 resolve(ParsingContext parsingContext, o7 o7Var, JSONObject jSONObject) {
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, o7Var.f90155a, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, n7.f90009c);
            g9 g9Var = (g9) JsonFieldResolver.resolveOptional(parsingContext, o7Var.f90156b, jSONObject, "corners_radius", this.f90012a.u2(), this.f90012a.s2());
            Field field = o7Var.f90157c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = n7.f90008b;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "has_shadow", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression2 != null) {
                expression = expressionResolveOptionalExpression2;
            }
            return new l7(expressionResolveOptionalExpression, g9Var, expression, (oo) JsonFieldResolver.resolveOptional(parsingContext, o7Var.f90158d, jSONObject, "shadow", this.f90012a.R6(), this.f90012a.P6()), (ar) JsonFieldResolver.resolveOptional(parsingContext, o7Var.f90159e, jSONObject, "stroke", this.f90012a.E7(), this.f90012a.C7()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
