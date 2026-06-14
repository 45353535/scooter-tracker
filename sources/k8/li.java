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
import com.yandex.div.internal.parser.ValueValidator;
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
public abstract class li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88828a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f88829b = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ValueValidator f88830c = new ValueValidator() { // from class: k8.ii
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return li.d(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ListValidator f88831d = new ListValidator() { // from class: k8.ji
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return li.e(list);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ListValidator f88832e = new ListValidator() { // from class: k8.ki
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return li.f(list);
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
        private final my f88833a;

        public b(my myVar) {
            this.f88833a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public fi deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = li.f88830c;
            Expression expression = li.f88829b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "angle", typeHelper, function1, valueValidator, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new fi(expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", this.f88833a.S4(), li.f88832e), JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, li.f88831d));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, fi fiVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "angle", fiVar.f87514a);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "color_map", fiVar.f87515b, this.f88833a.S4());
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, "colors", fiVar.f87516c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88834a;

        public c(my myVar) {
            this.f88834a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public mi deserialize(ParsingContext parsingContext, mi miVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "angle", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, miVar != null ? miVar.f89003a : null, ParsingConvertersKt.NUMBER_TO_INT, li.f88830c);
            Field field = miVar != null ? miVar.f89004b : null;
            Lazy lazyT4 = this.f88834a.T4();
            ListValidator listValidator = li.f88832e;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, field, lazyT4, listValidator);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field2 = miVar != null ? miVar.f89005c : null;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            ListValidator listValidator2 = li.f88831d;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new mi(optionalFieldWithExpression, optionalListField, JsonFieldParser.readOptionalExpressionListField(parsingContextRestrictPropertyOverride, jSONObject, "colors", typeHelper, allowPropertyOverride, field2, function1, listValidator2));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, mi miVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "angle", miVar.f89003a);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "color_map", miVar.f89004b, this.f88834a.T4());
            JsonFieldParser.writeExpressionListField(parsingContext, jSONObject, "colors", miVar.f89005c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gradient");
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
        private final my f88835a;

        public d(my myVar) {
            this.f88835a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public fi resolve(ParsingContext parsingContext, mi miVar, JSONObject jSONObject) {
            Field field = miVar.f89003a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = li.f88830c;
            Expression expression = li.f88829b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "angle", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new fi(expression, JsonFieldResolver.resolveOptionalList(parsingContext, miVar.f89004b, jSONObject, "color_map", this.f88835a.U4(), this.f88835a.S4(), li.f88832e), JsonFieldResolver.resolveOptionalExpressionList(parsingContext, miVar.f89005c, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, li.f88831d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j10) {
        return j10 >= 0 && j10 <= 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(List list) {
        return list.size() >= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(List list) {
        return list.size() >= 2;
    }
}
