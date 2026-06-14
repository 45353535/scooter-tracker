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
import k8.us;
import k8.xu;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f87898a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xc f87900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f87901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f87902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f87903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xc f87904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TypeHelper f87905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final TypeHelper f87906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TypeHelper f87907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ValueValidator f87908k;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87909f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof vs);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f87910f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof us.d.EnumC1052d);
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f87911f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof g7);
        }
    }

    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public static final class e implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87912a;

        public e(my myVar) {
            this.f87912a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public us.d deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            us.d.a aVar = (us.d.a) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f87912a.j8());
            TypeHelper typeHelper = gt.f87905h;
            Function1 function1 = vs.f92013e;
            Expression expression = gt.f87899b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper, function1, expression);
            Expression expression2 = optionalExpression == null ? expression : optionalExpression;
            xc xcVar = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f87912a.w3());
            if (xcVar == null) {
                xcVar = gt.f87900c;
            }
            xc xcVar2 = xcVar;
            TypeHelper typeHelper2 = gt.f87906i;
            Function1 function12 = us.d.EnumC1052d.f91811e;
            Expression expression3 = gt.f87901d;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "indexing_direction", typeHelper2, function12, expression3);
            Expression expression4 = optionalExpression2 == null ? expression3 : optionalExpression2;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression5 = gt.f87902e;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper3, function13, expression5);
            Expression expression6 = optionalExpression3 == null ? expression5 : optionalExpression3;
            Expression expression7 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, gt.f87908k);
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper typeHelper4 = gt.f87907j;
            Function1 function14 = g7.f87760e;
            Expression expression8 = gt.f87903f;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_mode", typeHelper4, function14, expression8);
            if (optionalExpression5 != null) {
                expression8 = optionalExpression5;
            }
            Expression expression9 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            xc xcVar3 = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f87912a.w3());
            if (xcVar3 == null) {
                xcVar3 = gt.f87904g;
            }
            return new us.d(aVar, expression2, xcVar2, expression4, expression6, expression7, optionalExpression4, expression8, expression9, xcVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, us.d dVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", dVar.f91778a, this.f87912a.j8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", dVar.f91779b, vs.f92012d);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", dVar.f91780c, this.f87912a.w3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "indexing_direction", dVar.f91781d, us.d.EnumC1052d.f91810d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", dVar.f91782e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", dVar.f91783f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_color", dVar.f91784g, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_mode", dVar.f91785h, g7.f87759d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", dVar.f91786i, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", dVar.f91787j, this.f87912a.w3());
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87913a;

        public f(my myVar) {
            this.f87913a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xu.d deserialize(ParsingContext parsingContext, xu.d dVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new xu.d(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, dVar != null ? dVar.f92487a : null, this.f87913a.k8()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", gt.f87905h, allowPropertyOverride, dVar != null ? dVar.f92488b : null, vs.f92013e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, dVar != null ? dVar.f92489c : null, this.f87913a.x3()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "indexing_direction", gt.f87906i, allowPropertyOverride, dVar != null ? dVar.f92490d : null, us.d.EnumC1052d.f91811e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, dVar != null ? dVar.f92491e : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, dVar != null ? dVar.f92492f : null, ParsingConvertersKt.NUMBER_TO_INT, gt.f87908k), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, dVar != null ? dVar.f92493g : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tint_mode", gt.f87907j, allowPropertyOverride, dVar != null ? dVar.f92494h : null, g7.f87760e), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, dVar != null ? dVar.f92495i : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, dVar != null ? dVar.f92496j : null, this.f87913a.x3()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, xu.d dVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", dVar.f92487a, this.f87913a.k8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", dVar.f92488b, vs.f92012d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", dVar.f92489c, this.f87913a.x3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "indexing_direction", dVar.f92490d, us.d.EnumC1052d.f91810d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", dVar.f92491e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", dVar.f92492f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_color", dVar.f92493g, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_mode", dVar.f92494h, g7.f87759d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", dVar.f92495i, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", dVar.f92496j, this.f87913a.x3());
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

    public static final class g implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87914a;

        public g(my myVar) {
            this.f87914a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public us.d resolve(ParsingContext parsingContext, xu.d dVar, JSONObject jSONObject) {
            us.d.a aVar = (us.d.a) JsonFieldResolver.resolveOptional(parsingContext, dVar.f92487a, jSONObject, "accessibility", this.f87914a.l8(), this.f87914a.j8());
            Field field = dVar.f92488b;
            TypeHelper typeHelper = gt.f87905h;
            Function1 function1 = vs.f92013e;
            Expression expression = gt.f87899b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_vertical", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression == null) {
                expressionResolveOptionalExpression = expression;
            }
            xc xcVar = (xc) JsonFieldResolver.resolveOptional(parsingContext, dVar.f92489c, jSONObject, "height", this.f87914a.y3(), this.f87914a.w3());
            if (xcVar == null) {
                xcVar = gt.f87900c;
            }
            xc xcVar2 = xcVar;
            Field field2 = dVar.f92490d;
            TypeHelper typeHelper2 = gt.f87906i;
            Function1 function12 = us.d.EnumC1052d.f91811e;
            Expression expression2 = gt.f87901d;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "indexing_direction", typeHelper2, function12, expression2);
            Expression expression3 = expressionResolveOptionalExpression2 == null ? expression2 : expressionResolveOptionalExpression2;
            Field field3 = dVar.f92491e;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression4 = gt.f87902e;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "preload_required", typeHelper3, function13, expression4);
            Expression expression5 = expressionResolveOptionalExpression3 == null ? expression4 : expressionResolveOptionalExpression3;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, dVar.f92492f, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, gt.f87908k);
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, dVar.f92493g, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field field4 = dVar.f92494h;
            TypeHelper typeHelper4 = gt.f87907j;
            Function1 function14 = g7.f87760e;
            Expression expression6 = gt.f87903f;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "tint_mode", typeHelper4, function14, expression6);
            if (expressionResolveOptionalExpression5 != null) {
                expression6 = expressionResolveOptionalExpression5;
            }
            Expression expressionResolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, dVar.f92495i, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            xc xcVar3 = (xc) JsonFieldResolver.resolveOptional(parsingContext, dVar.f92496j, jSONObject, "width", this.f87914a.y3(), this.f87914a.w3());
            if (xcVar3 == null) {
                xcVar3 = gt.f87904g;
            }
            return new us.d(aVar, expressionResolveOptionalExpression, xcVar2, expression3, expression5, expressionResolveExpression, expressionResolveOptionalExpression4, expression6, expressionResolveExpression2, xcVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        vs vsVar = vs.CENTER;
        f87899b = Expression.Companion.constant$default(companion, vsVar, null, 2, null);
        f87900c = new xc(null, Expression.Companion.constant$default(companion, 20L, null, 2, null), 1, null);
        us.d.EnumC1052d enumC1052d = us.d.EnumC1052d.NORMAL;
        f87901d = Expression.Companion.constant$default(companion, enumC1052d, null, 2, null);
        f87902e = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        g7 g7Var = g7.SOURCE_IN;
        f87903f = Expression.Companion.constant$default(companion, g7Var, null, 2, null);
        f87904g = new xc(null, Expression.Companion.constant$default(companion, 20L, null, 2, null), 1, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f87905h = companion2.from(vsVar, a.f87909f);
        f87906i = companion2.from(enumC1052d, b.f87910f);
        f87907j = companion2.from(g7Var, c.f87911f);
        f87908k = new ValueValidator() { // from class: k8.ft
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return gt.b(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
