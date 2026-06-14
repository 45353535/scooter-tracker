package k8;

import android.net.Uri;
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
public abstract class va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f91903a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f91904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f91905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f91906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f91907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ValueValidator f91908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ValueValidator f91909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f91910h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f91911a;

        public b(my myVar) {
            this.f91911a = myVar;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k8.ra deserialize(com.yandex.div.serialization.ParsingContext r19, org.json.JSONObject r20) {
            /*
                r18 = this;
                r0 = r18
                k8.ra r8 = new k8.ra
                com.yandex.div.internal.parser.TypeHelper<java.lang.Long> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_INT
                kotlin.jvm.functions.Function1<java.lang.Number, java.lang.Long> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_INT
                com.yandex.div.internal.parser.ValueValidator r6 = k8.va.f91908f
                com.yandex.div.json.expressions.Expression r7 = k8.va.f91904b
                java.lang.String r3 = "disappear_duration"
                r1 = r19
                r2 = r20
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                r9 = r4
                r10 = r5
                if (r3 != 0) goto L1c
                r11 = r7
                goto L1d
            L1c:
                r11 = r3
            L1d:
                k8.my r3 = r0.f91911a
                kotlin.Lazy r3 = r3.S2()
                java.lang.String r4 = "download_callbacks"
                java.lang.Object r3 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r4, r3)
                r12 = r3
                k8.xa r12 = (k8.xa) r12
                com.yandex.div.internal.parser.TypeHelper<java.lang.Boolean> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_BOOLEAN
                kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_BOOLEAN
                com.yandex.div.json.expressions.Expression r6 = k8.va.f91905c
                java.lang.String r3 = "is_enabled"
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6)
                if (r3 != 0) goto L3c
                r13 = r6
                goto L3d
            L3c:
                r13 = r3
            L3d:
                java.lang.String r3 = "log_id"
                com.yandex.div.internal.parser.TypeHelper<java.lang.String> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_STRING
                com.yandex.div.json.expressions.Expression r14 = com.yandex.div.internal.parser.JsonExpressionParser.readExpression(r1, r2, r3, r4)
                com.yandex.div.internal.parser.ValueValidator r6 = k8.va.f91909g
                com.yandex.div.json.expressions.Expression r7 = k8.va.f91906d
                java.lang.String r3 = "log_limit"
                r4 = r9
                r5 = r10
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L55
                r9 = r7
                goto L56
            L55:
                r9 = r3
            L56:
                java.lang.String r3 = "payload"
                java.lang.Object r3 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r3)
                r10 = r3
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                com.yandex.div.internal.parser.TypeHelper<android.net.Uri> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_URI
                kotlin.jvm.functions.Function1<java.lang.Object, android.net.Uri> r6 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_URI
                java.lang.String r7 = "referer"
                com.yandex.div.json.expressions.Expression r15 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r7, r3, r6)
                java.lang.String r7 = "scope_id"
                java.lang.Object r7 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r7)
                r16 = r7
                java.lang.String r16 = (java.lang.String) r16
                k8.my r7 = r0.f91911a
                kotlin.Lazy r7 = r7.h1()
                java.lang.String r0 = "typed"
                java.lang.Object r0 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r0, r7)
                k8.m5 r0 = (k8.m5) r0
                java.lang.String r7 = "url"
                com.yandex.div.json.expressions.Expression r17 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r7, r3, r6)
                com.yandex.div.internal.parser.ValueValidator r6 = k8.va.f91910h
                com.yandex.div.json.expressions.Expression r7 = k8.va.f91907e
                java.lang.String r3 = "visibility_percentage"
                com.yandex.div.json.expressions.Expression r1 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                r3 = r12
                if (r1 != 0) goto La2
                r12 = r7
                r1 = r8
                r6 = r9
                r2 = r11
                r4 = r13
                r5 = r14
                r8 = r15
                r9 = r16
                r11 = r17
                r7 = r10
                r10 = r0
                goto Laf
            La2:
                r12 = r1
                r6 = r9
                r7 = r10
                r2 = r11
                r4 = r13
                r5 = r14
                r9 = r16
                r11 = r17
                r10 = r0
                r1 = r8
                r8 = r15
            Laf:
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.va.b.deserialize(com.yandex.div.serialization.ParsingContext, org.json.JSONObject):k8.ra");
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ra raVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "disappear_duration", raVar.f90655a);
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", raVar.a(), this.f91911a.S2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", raVar.isEnabled());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", raVar.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_limit", raVar.c());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", raVar.getPayload());
            Expression expressionF = raVar.f();
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", expressionF, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", raVar.e());
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", raVar.d(), this.f91911a.h1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", raVar.getUrl(), function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_percentage", raVar.f90665k);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f91912a;

        public c(my myVar) {
            this.f91912a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wa deserialize(ParsingContext parsingContext, wa waVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = waVar != null ? waVar.f92129a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "disappear_duration", typeHelper, allowPropertyOverride, field, function1, va.f91908f);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, waVar != null ? waVar.f92130b : null, this.f91912a.T2());
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, waVar != null ? waVar.f92131c : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, waVar != null ? waVar.f92132d : null);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_limit", typeHelper, allowPropertyOverride, waVar != null ? waVar.f92133e : null, function1, va.f91909g);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, waVar != null ? waVar.f92134f : null);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field field2 = waVar != null ? waVar.f92135g : null;
            Function1<Object, Uri> function12 = ParsingConvertersKt.ANY_TO_URI;
            return new wa(optionalFieldWithExpression, optionalField, optionalFieldWithExpression2, fieldWithExpression, optionalFieldWithExpression3, optionalField2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "referer", typeHelper2, allowPropertyOverride, field2, function12), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, waVar != null ? waVar.f92136h : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, waVar != null ? waVar.f92137i : null, this.f91912a.i1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper2, allowPropertyOverride, waVar != null ? waVar.f92138j : null, function12), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility_percentage", typeHelper, allowPropertyOverride, waVar != null ? waVar.f92139k : null, function1, va.f91910h));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, wa waVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "disappear_duration", waVar.f92129a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", waVar.f92130b, this.f91912a.T2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", waVar.f92131c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", waVar.f92132d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_limit", waVar.f92133e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", waVar.f92134f);
            Field field = waVar.f92135g;
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", field, function1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", waVar.f92136h);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", waVar.f92137i, this.f91912a.i1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", waVar.f92138j, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_percentage", waVar.f92139k);
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
        private final my f91913a;

        public d(my myVar) {
            this.f91913a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ra resolve(ParsingContext parsingContext, wa waVar, JSONObject jSONObject) {
            Field field = waVar.f92129a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = va.f91908f;
            Expression expression = va.f91904b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "disappear_duration", typeHelper, function1, valueValidator, expression);
            Expression expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            xa xaVar = (xa) JsonFieldResolver.resolveOptional(parsingContext, waVar.f92130b, jSONObject, "download_callbacks", this.f91913a.U2(), this.f91913a.S2());
            Field field2 = waVar.f92131c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = va.f91905c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "is_enabled", typeHelper2, function12, expression3);
            Expression expression4 = expressionResolveOptionalExpression2 == null ? expression3 : expressionResolveOptionalExpression2;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, waVar.f92132d, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field3 = waVar.f92133e;
            ValueValidator valueValidator2 = va.f91909g;
            Expression expression5 = va.f91906d;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "log_limit", typeHelper, function1, valueValidator2, expression5);
            Expression expression6 = expressionResolveOptionalExpression3 == null ? expression5 : expressionResolveOptionalExpression3;
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, waVar.f92134f, jSONObject, "payload");
            Field field4 = waVar.f92135g;
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1<Object, Uri> function13 = ParsingConvertersKt.ANY_TO_URI;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "referer", typeHelper3, function13);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, waVar.f92136h, jSONObject, "scope_id");
            m5 m5Var = (m5) JsonFieldResolver.resolveOptional(parsingContext, waVar.f92137i, jSONObject, "typed", this.f91913a.j1(), this.f91913a.h1());
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, waVar.f92138j, jSONObject, "url", typeHelper3, function13);
            Field field5 = waVar.f92139k;
            ValueValidator valueValidator3 = va.f91910h;
            Expression expression7 = va.f91907e;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "visibility_percentage", typeHelper, function1, valueValidator3, expression7);
            return new ra(expression2, xaVar, expression4, expressionResolveExpression, expression6, jSONObject2, expressionResolveOptionalExpression4, str, m5Var, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6 == null ? expression7 : expressionResolveOptionalExpression6);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f91904b = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f91905c = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f91906d = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f91907e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f91908f = new ValueValidator() { // from class: k8.sa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return va.d(((Long) obj).longValue());
            }
        };
        f91909g = new ValueValidator() { // from class: k8.ta
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return va.e(((Long) obj).longValue());
            }
        };
        f91910h = new ValueValidator() { // from class: k8.ua
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return va.f(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j10) {
        return j10 >= 0 && j10 < 100;
    }
}
