package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import k8.go;
import k8.no;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f88101a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f88102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f88103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TypeHelper f88104d;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88105f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof go.c.EnumC1040c);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88106a;

        public c(my myVar) {
            this.f88106a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public go.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = ho.f88102b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            TypeHelper typeHelper2 = ho.f88104d;
            Function1 function12 = go.c.EnumC1040c.f87884e;
            Expression expression2 = ho.f88103c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "orientation", typeHelper2, function12, expression2);
            if (optionalExpression2 != null) {
                expression2 = optionalExpression2;
            }
            return new go.c(expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, go.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", cVar.f87878a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "orientation", cVar.f87879b, go.c.EnumC1040c.f87883d);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88107a;

        public d(my myVar) {
            this.f88107a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public no.c deserialize(ParsingContext parsingContext, no.c cVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new no.c(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, cVar != null ? cVar.f90093a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "orientation", ho.f88104d, allowPropertyOverride, cVar != null ? cVar.f90094b : null, go.c.EnumC1040c.f87884e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, no.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", cVar.f90093a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "orientation", cVar.f90094b, go.c.EnumC1040c.f87883d);
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

    public static final class e implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88108a;

        public e(my myVar) {
            this.f88108a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public go.c resolve(ParsingContext parsingContext, no.c cVar, JSONObject jSONObject) {
            Field field = cVar.f90093a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = ho.f88102b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "color", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Field field2 = cVar.f90094b;
            TypeHelper typeHelper2 = ho.f88104d;
            Function1 function12 = go.c.EnumC1040c.f87884e;
            Expression expression2 = ho.f88103c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "orientation", typeHelper2, function12, expression2);
            if (expressionResolveOptionalExpression2 != null) {
                expression2 = expressionResolveOptionalExpression2;
            }
            return new go.c(expression, expression2);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f88102b = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        go.c.EnumC1040c enumC1040c = go.c.EnumC1040c.HORIZONTAL;
        f88103c = Expression.Companion.constant$default(companion, enumC1040c, null, 2, null);
        f88104d = TypeHelper.INSTANCE.from(enumC1040c, a.f88105f);
    }
}
