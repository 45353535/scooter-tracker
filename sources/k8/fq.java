package k8;

import androidx.core.provider.FontsContractCompat;
import androidx.core.view.ViewCompat;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
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
import k8.cq;
import k8.tp;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class fq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f87607a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f87609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f87610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f87611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TypeHelper f87612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f87613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f87614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f87615i;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87616f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jp);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f87617f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jd);
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87618a;

        public d(my myVar) {
            this.f87618a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public tp.d deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression expression;
            Expression expression2;
            Expression expression3;
            Expression expression4;
            Expression expression5;
            Expression expression6;
            Expression expression7;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = fq.f87614h;
            Expression expression8 = fq.f87608b;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper, function1, valueValidator, expression8);
            if (optionalExpression2 != null) {
                expression8 = optionalExpression2;
            }
            TypeHelper typeHelper2 = fq.f87612f;
            Function1 function12 = jp.f88507e;
            Expression expression9 = fq.f87609c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper2, function12, expression9);
            if (optionalExpression3 == null) {
                optionalExpression3 = expression9;
            }
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, fq.f87613g, jd.f88380e);
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper, function1, fq.f87615i);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression10 = fq.f87610d;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, function13, expression10);
            Expression expression11 = optionalExpression7 == null ? expression10 : optionalExpression7;
            zl zlVar = (zl) JsonPropertyParser.readOptional(parsingContext, jSONObject, "offset", this.f87618a.Z5());
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression12 = fq.f87611e;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper4, function14, expression12);
            if (optionalExpression8 == null) {
                Expression expression13 = expression11;
                expression2 = expression12;
                expression = expression13;
                expression3 = optionalExpression3;
                expression4 = optionalExpression6;
                expression7 = expression8;
                expression5 = optionalExpression4;
                expression6 = optionalExpression5;
            } else {
                expression = expression11;
                expression2 = optionalExpression8;
                expression3 = optionalExpression3;
                expression4 = optionalExpression6;
                expression5 = optionalExpression4;
                expression6 = optionalExpression5;
                expression7 = expression8;
            }
            return new tp.d(optionalExpression, expression7, expression3, expression5, expression6, expression4, expression, zlVar, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, tp.d dVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", dVar.f91461a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", dVar.f91462b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", dVar.f91463c, jp.f88506d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, dVar.f91464d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, dVar.f91465e, jd.f88379d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", dVar.f91466f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", dVar.f91467g);
            JsonPropertyParser.write(parsingContext, jSONObject, "offset", dVar.f91468h, this.f87618a.Z5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", dVar.f91469i, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }
    }

    public static final class e implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87619a;

        public e(my myVar) {
            this.f87619a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cq.d deserialize(ParsingContext parsingContext, cq.d dVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, dVar != null ? dVar.f86824a : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = dVar != null ? dVar.f86825b : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new cq.d(optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper, allowPropertyOverride, field, function1, fq.f87614h), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", fq.f87612f, allowPropertyOverride, dVar != null ? dVar.f86826c : null, jp.f88507e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, dVar != null ? dVar.f86827d : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, fq.f87613g, allowPropertyOverride, dVar != null ? dVar.f86828e : null, jd.f88380e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper, allowPropertyOverride, dVar != null ? dVar.f86829f : null, function1, fq.f87615i), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, dVar != null ? dVar.f86830g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "offset", allowPropertyOverride, dVar != null ? dVar.f86831h : null, this.f87619a.a6()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, dVar != null ? dVar.f86832i : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, cq.d dVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", dVar.f86824a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", dVar.f86825b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", dVar.f86826c, jp.f88506d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, dVar.f86827d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, dVar.f86828e, jd.f88379d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", dVar.f86829f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", dVar.f86830g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "offset", dVar.f86831h, this.f87619a.a6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", dVar.f86832i, ParsingConvertersKt.COLOR_INT_TO_STRING);
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

    public static final class f implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87620a;

        public f(my myVar) {
            this.f87620a = myVar;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k8.tp.d resolve(com.yandex.div.serialization.ParsingContext r19, k8.cq.d r20, org.json.JSONObject r21) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r9 = r20
                r3 = r21
                k8.tp$d r10 = new k8.tp$d
                com.yandex.div.internal.template.Field r2 = r9.f86824a
                java.lang.String r4 = "font_family"
                com.yandex.div.internal.parser.TypeHelper<java.lang.String> r5 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_STRING
                com.yandex.div.json.expressions.Expression r11 = com.yandex.div.internal.parser.JsonFieldResolver.resolveOptionalExpression(r1, r2, r3, r4, r5)
                com.yandex.div.internal.template.Field r2 = r9.f86825b
                com.yandex.div.internal.parser.TypeHelper<java.lang.Long> r5 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_INT
                kotlin.jvm.functions.Function1<java.lang.Number, java.lang.Long> r6 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_INT
                com.yandex.div.internal.parser.ValueValidator r7 = k8.fq.f87614h
                com.yandex.div.json.expressions.Expression r8 = k8.fq.f87608b
                java.lang.String r4 = "font_size"
                com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonFieldResolver.resolveOptionalExpression(r1, r2, r3, r4, r5, r6, r7, r8)
                r12 = r5
                r13 = r6
                if (r2 != 0) goto L29
                goto L2a
            L29:
                r8 = r2
            L2a:
                com.yandex.div.internal.template.Field r2 = r9.f86826c
                com.yandex.div.internal.parser.TypeHelper r5 = k8.fq.f87612f
                kotlin.jvm.functions.Function1 r6 = k8.jp.f88507e
                com.yandex.div.json.expressions.Expression r7 = k8.fq.f87609c
                java.lang.String r4 = "font_size_unit"
                r1 = r19
                r3 = r21
                com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonFieldResolver.resolveOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r2 != 0) goto L40
                r14 = r7
                goto L41
            L40:
                r14 = r2
            L41:
                com.yandex.div.internal.template.Field r2 = r9.f86827d
                java.lang.String r4 = "font_variation_settings"
                com.yandex.div.internal.parser.TypeHelper<org.json.JSONObject> r5 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_DICT
                com.yandex.div.json.expressions.Expression r15 = com.yandex.div.internal.parser.JsonFieldResolver.resolveOptionalExpression(r1, r2, r3, r4, r5)
                com.yandex.div.internal.template.Field r2 = r9.f86828e
                com.yandex.div.internal.parser.TypeHelper r5 = k8.fq.f87613g
                kotlin.jvm.functions.Function1 r6 = k8.jd.f88380e
                java.lang.String r4 = "font_weight"
                com.yandex.div.json.expressions.Expression r16 = com.yandex.div.internal.parser.JsonFieldResolver.resolveOptionalExpression(r1, r2, r3, r4, r5, r6)
                com.yandex.div.internal.template.Field r2 = r9.f86829f
                java.lang.String r4 = "font_weight_value"
                com.yandex.div.internal.parser.ValueValidator r7 = k8.fq.f87615i
                r1 = r19
                r3 = r21
                r5 = r12
                r6 = r13
                com.yandex.div.json.expressions.Expression r12 = com.yandex.div.internal.parser.JsonFieldResolver.resolveOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                com.yandex.div.internal.template.Field r2 = r9.f86830g
                com.yandex.div.internal.parser.TypeHelper<java.lang.Double> r5 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_DOUBLE
                kotlin.jvm.functions.Function1<java.lang.Number, java.lang.Double> r6 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_DOUBLE
                com.yandex.div.json.expressions.Expression r7 = k8.fq.f87610d
                java.lang.String r4 = "letter_spacing"
                com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonFieldResolver.resolveOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r2 != 0) goto L79
                r13 = r7
                goto L7a
            L79:
                r13 = r2
            L7a:
                com.yandex.div.internal.template.Field r2 = r9.f86831h
                k8.my r1 = r0.f87620a
                kotlin.Lazy r5 = r1.b6()
                k8.my r1 = r0.f87620a
                kotlin.Lazy r6 = r1.Z5()
                java.lang.String r4 = "offset"
                r1 = r19
                r3 = r21
                java.lang.Object r2 = com.yandex.div.internal.parser.JsonFieldResolver.resolveOptional(r1, r2, r3, r4, r5, r6)
                r17 = r2
                k8.zl r17 = (k8.zl) r17
                com.yandex.div.internal.template.Field r2 = r9.f86832i
                com.yandex.div.internal.parser.TypeHelper<java.lang.Integer> r5 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_COLOR
                kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Integer> r6 = com.yandex.div.internal.parser.ParsingConvertersKt.STRING_TO_COLOR_INT
                com.yandex.div.json.expressions.Expression r7 = k8.fq.f87611e
                java.lang.String r4 = "text_color"
                com.yandex.div.json.expressions.Expression r1 = com.yandex.div.internal.parser.JsonFieldResolver.resolveOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto Lb3
                r1 = r10
                r10 = r7
                r3 = r8
                r2 = r11
                r8 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r9 = r17
                r7 = r12
                goto Lc0
            Lb3:
                r2 = r10
                r10 = r1
                r1 = r2
                r3 = r8
                r2 = r11
                r7 = r12
                r8 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r9 = r17
            Lc0:
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.fq.f.resolve(com.yandex.div.serialization.ParsingContext, k8.cq$d, org.json.JSONObject):k8.tp$d");
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f87608b = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        jp jpVar = jp.SP;
        f87609c = Expression.Companion.constant$default(companion, jpVar, null, 2, null);
        f87610d = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f87611e = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f87612f = companion2.from(jpVar, a.f87616f);
        f87613g = companion2.from(ArraysKt.first(jd.values()), b.f87617f);
        f87614h = new ValueValidator() { // from class: k8.dq
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return fq.c(((Long) obj).longValue());
            }
        };
        f87615i = new ValueValidator() { // from class: k8.eq
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return fq.d(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j10) {
        return j10 > 0;
    }
}
