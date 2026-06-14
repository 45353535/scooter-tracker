package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f90183a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f90187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f90188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f90189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f90190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f90191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ValueValidator f90192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ValueValidator f90193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ValueValidator f90194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ValueValidator f90195m;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90196f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jp);
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
        private final my f90197a;

        public c(my myVar) {
            this.f90197a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hb deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression expression;
            Expression expression2;
            Expression expression3;
            Expression expression4;
            Expression expression5;
            Expression expression6;
            Expression expression7;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = ob.f90190h;
            Expression expression8 = ob.f90184b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, function1, valueValidator, expression8);
            if (optionalExpression == null) {
                optionalExpression = expression8;
            }
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper, function1, ob.f90191i);
            ValueValidator valueValidator2 = ob.f90192j;
            Expression expression9 = ob.f90185c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper, function1, valueValidator2, expression9);
            Expression expression10 = optionalExpression3 == null ? expression9 : optionalExpression3;
            ValueValidator valueValidator3 = ob.f90193k;
            Expression expression11 = ob.f90186d;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper, function1, valueValidator3, expression11);
            Expression expression12 = optionalExpression4 == null ? expression11 : optionalExpression4;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, function1, ob.f90194l);
            ValueValidator valueValidator4 = ob.f90195m;
            Expression expression13 = ob.f90187e;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top", typeHelper, function1, valueValidator4, expression13);
            if (optionalExpression6 != null) {
                expression13 = optionalExpression6;
            }
            TypeHelper typeHelper2 = ob.f90189g;
            Function1 function12 = jp.f88507e;
            Expression expression14 = ob.f90188f;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper2, function12, expression14);
            if (optionalExpression7 == null) {
                Expression expression15 = expression13;
                expression2 = expression14;
                expression = expression15;
                expression7 = optionalExpression;
                expression3 = optionalExpression2;
                expression4 = expression10;
                expression5 = expression12;
                expression6 = optionalExpression5;
            } else {
                expression = expression13;
                expression2 = optionalExpression7;
                expression3 = optionalExpression2;
                expression4 = expression10;
                expression5 = expression12;
                expression6 = optionalExpression5;
                expression7 = optionalExpression;
            }
            return new hb(expression7, expression3, expression4, expression5, expression6, expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, hb hbVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "bottom", hbVar.f88000a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", hbVar.f88001b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", hbVar.f88002c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", hbVar.f88003d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", hbVar.f88004e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top", hbVar.f88005f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", hbVar.f88006g, jp.f88506d);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90198a;

        public d(my myVar) {
            this.f90198a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public pb deserialize(ParsingContext parsingContext, pb pbVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = pbVar != null ? pbVar.f90361a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new pb(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, function1, ob.f90190h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end", typeHelper, allowPropertyOverride, pbVar != null ? pbVar.f90362b : null, function1, ob.f90191i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, pbVar != null ? pbVar.f90363c : null, function1, ob.f90192j), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, pbVar != null ? pbVar.f90364d : null, function1, ob.f90193k), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", typeHelper, allowPropertyOverride, pbVar != null ? pbVar.f90365e : null, function1, ob.f90194l), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "top", typeHelper, allowPropertyOverride, pbVar != null ? pbVar.f90366f : null, function1, ob.f90195m), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "unit", ob.f90189g, allowPropertyOverride, pbVar != null ? pbVar.f90367g : null, jp.f88507e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, pb pbVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "bottom", pbVar.f90361a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", pbVar.f90362b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", pbVar.f90363c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", pbVar.f90364d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", pbVar.f90365e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top", pbVar.f90366f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", pbVar.f90367g, jp.f88506d);
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
        private final my f90199a;

        public e(my myVar) {
            this.f90199a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hb resolve(ParsingContext parsingContext, pb pbVar, JSONObject jSONObject) {
            Field field = pbVar.f90361a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = ob.f90190h;
            Expression expression = ob.f90184b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "bottom", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, pbVar.f90362b, jSONObject, "end", typeHelper, function1, ob.f90191i);
            Field field2 = pbVar.f90363c;
            ValueValidator valueValidator2 = ob.f90192j;
            Expression expression2 = ob.f90185c;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "left", typeHelper, function1, valueValidator2, expression2);
            Expression expression3 = expressionResolveOptionalExpression3 == null ? expression2 : expressionResolveOptionalExpression3;
            Field field3 = pbVar.f90364d;
            ValueValidator valueValidator3 = ob.f90193k;
            Expression expression4 = ob.f90186d;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "right", typeHelper, function1, valueValidator3, expression4);
            Expression expression5 = expressionResolveOptionalExpression4 == null ? expression4 : expressionResolveOptionalExpression4;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, pbVar.f90365e, jSONObject, "start", typeHelper, function1, ob.f90194l);
            Field field4 = pbVar.f90366f;
            ValueValidator valueValidator4 = ob.f90195m;
            Expression expression6 = ob.f90187e;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "top", typeHelper, function1, valueValidator4, expression6);
            Expression expression7 = expressionResolveOptionalExpression6 == null ? expression6 : expressionResolveOptionalExpression6;
            Field field5 = pbVar.f90367g;
            TypeHelper typeHelper2 = ob.f90189g;
            Function1 function12 = jp.f88507e;
            Expression expression8 = ob.f90188f;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "unit", typeHelper2, function12, expression8);
            return new hb(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression3, expression5, expressionResolveOptionalExpression5, expression7, expressionResolveOptionalExpression7 == null ? expression8 : expressionResolveOptionalExpression7);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90184b = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90185c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90186d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90187e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        jp jpVar = jp.DP;
        f90188f = Expression.Companion.constant$default(companion, jpVar, null, 2, null);
        f90189g = TypeHelper.INSTANCE.from(jpVar, a.f90196f);
        f90190h = new ValueValidator() { // from class: k8.ib
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ob.g(((Long) obj).longValue());
            }
        };
        f90191i = new ValueValidator() { // from class: k8.jb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ob.h(((Long) obj).longValue());
            }
        };
        f90192j = new ValueValidator() { // from class: k8.kb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ob.i(((Long) obj).longValue());
            }
        };
        f90193k = new ValueValidator() { // from class: k8.lb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ob.j(((Long) obj).longValue());
            }
        };
        f90194l = new ValueValidator() { // from class: k8.mb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ob.k(((Long) obj).longValue());
            }
        };
        f90195m = new ValueValidator() { // from class: k8.nb
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ob.l(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(long j10) {
        return j10 >= 0;
    }
}
