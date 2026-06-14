package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f90982a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90983b = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ListValidator f90984c = new ListValidator() { // from class: k8.rc
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return sc.b(list);
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
        private final my f90985a;

        public b(my myVar) {
            this.f90985a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qc deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = sc.f90983b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "always_visible", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new qc(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING), JsonPropertyParser.readList(parsingContext, jSONObject, "pattern_elements", this.f90985a.t3(), sc.f90984c), (String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, qc qcVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "always_visible", qcVar.f90563a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", qcVar.f90564b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "pattern_elements", qcVar.f90565c, this.f90985a.t3());
            JsonPropertyParser.write(parsingContext, jSONObject, "raw_text_variable", qcVar.a());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed_length");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90986a;

        public c(my myVar) {
            this.f90986a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wc deserialize(ParsingContext parsingContext, wc wcVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "always_visible", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, wcVar != null ? wcVar.f92156a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, wcVar != null ? wcVar.f92157b : null);
            Field field = wcVar != null ? wcVar.f92158c : null;
            Lazy lazyU3 = this.f90986a.u3();
            ListValidator listValidator = sc.f90984c;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new wc(optionalFieldWithExpression, fieldWithExpression, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "pattern_elements", allowPropertyOverride, field, lazyU3, listValidator), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "raw_text_variable", allowPropertyOverride, wcVar != null ? wcVar.f92159d : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, wc wcVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "always_visible", wcVar.f92156a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", wcVar.f92157b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "pattern_elements", wcVar.f92158c, this.f90986a.u3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", wcVar.f92159d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed_length");
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
        private final my f90987a;

        public d(my myVar) {
            this.f90987a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qc resolve(ParsingContext parsingContext, wc wcVar, JSONObject jSONObject) {
            Field field = wcVar.f92156a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = sc.f90983b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "always_visible", typeHelper, function1, expression);
            return new qc(expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression, JsonFieldResolver.resolveExpression(parsingContext, wcVar.f92157b, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveList(parsingContext, wcVar.f92158c, jSONObject, "pattern_elements", this.f90987a.v3(), this.f90987a.t3(), sc.f90984c), (String) JsonFieldResolver.resolve(parsingContext, wcVar.f92159d, jSONObject, "raw_text_variable"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
