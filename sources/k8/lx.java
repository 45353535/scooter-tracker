package k8;

import android.net.Uri;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class lx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88908a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f88909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f88910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f88911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f88912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ValueValidator f88913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ValueValidator f88914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValueValidator f88915h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88916a;

        public b(my myVar) {
            this.f88916a = myVar;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k8.hx deserialize(com.yandex.div.serialization.ParsingContext r19, org.json.JSONObject r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                k8.hx r8 = new k8.hx
                k8.my r3 = r0.f88916a
                kotlin.Lazy r3 = r3.S2()
                java.lang.String r4 = "download_callbacks"
                java.lang.Object r3 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r4, r3)
                r9 = r3
                k8.xa r9 = (k8.xa) r9
                com.yandex.div.internal.parser.TypeHelper<java.lang.Boolean> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_BOOLEAN
                kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_BOOLEAN
                com.yandex.div.json.expressions.Expression r6 = k8.lx.f88909b
                java.lang.String r3 = "is_enabled"
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6)
                if (r3 != 0) goto L27
                r10 = r6
                goto L28
            L27:
                r10 = r3
            L28:
                java.lang.String r3 = "log_id"
                com.yandex.div.internal.parser.TypeHelper<java.lang.String> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_STRING
                com.yandex.div.json.expressions.Expression r11 = com.yandex.div.internal.parser.JsonExpressionParser.readExpression(r1, r2, r3, r4)
                com.yandex.div.internal.parser.TypeHelper<java.lang.Long> r4 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_INT
                kotlin.jvm.functions.Function1<java.lang.Number, java.lang.Long> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_INT
                com.yandex.div.internal.parser.ValueValidator r6 = k8.lx.f88913f
                com.yandex.div.json.expressions.Expression r7 = k8.lx.f88910c
                java.lang.String r3 = "log_limit"
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L42
                r12 = r7
                goto L43
            L42:
                r12 = r3
            L43:
                java.lang.String r3 = "payload"
                java.lang.Object r3 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r3)
                r13 = r3
                org.json.JSONObject r13 = (org.json.JSONObject) r13
                com.yandex.div.internal.parser.TypeHelper<android.net.Uri> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_URI
                kotlin.jvm.functions.Function1<java.lang.Object, android.net.Uri> r6 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_URI
                java.lang.String r7 = "referer"
                com.yandex.div.json.expressions.Expression r14 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r7, r3, r6)
                java.lang.String r7 = "scope_id"
                java.lang.Object r7 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r7)
                r15 = r7
                java.lang.String r15 = (java.lang.String) r15
                k8.my r7 = r0.f88916a
                kotlin.Lazy r7 = r7.h1()
                java.lang.String r0 = "typed"
                java.lang.Object r0 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r1, r2, r0, r7)
                k8.m5 r0 = (k8.m5) r0
                java.lang.String r7 = "url"
                com.yandex.div.json.expressions.Expression r16 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r7, r3, r6)
                com.yandex.div.internal.parser.ValueValidator r6 = k8.lx.f88914g
                com.yandex.div.json.expressions.Expression r7 = k8.lx.f88911d
                java.lang.String r3 = "visibility_duration"
                com.yandex.div.json.expressions.Expression r3 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L82
                r17 = r7
                goto L84
            L82:
                r17 = r3
            L84:
                com.yandex.div.internal.parser.ValueValidator r6 = k8.lx.f88915h
                com.yandex.div.json.expressions.Expression r7 = k8.lx.f88912e
                java.lang.String r3 = "visibility_percentage"
                r1 = r19
                r2 = r20
                com.yandex.div.json.expressions.Expression r1 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r1, r2, r3, r4, r5, r6, r7)
                r5 = r12
                if (r1 != 0) goto La3
                r12 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r6 = r13
                r8 = r15
                r10 = r16
                r11 = r17
                r9 = r0
                r7 = r14
                goto Lb0
            La3:
                r12 = r1
                r2 = r9
                r3 = r10
                r4 = r11
                r6 = r13
                r7 = r14
                r10 = r16
                r11 = r17
                r9 = r0
                r1 = r8
                r8 = r15
            Lb0:
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.lx.b.deserialize(com.yandex.div.serialization.ParsingContext, org.json.JSONObject):k8.hx");
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, hx hxVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", hxVar.a(), this.f88916a.S2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", hxVar.isEnabled());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", hxVar.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_limit", hxVar.c());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", hxVar.getPayload());
            Expression expressionF = hxVar.f();
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", expressionF, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", hxVar.e());
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", hxVar.d(), this.f88916a.h1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", hxVar.getUrl(), function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_duration", hxVar.f88152j);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_percentage", hxVar.f88153k);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88917a;

        public c(my myVar) {
            this.f88917a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public mx deserialize(ParsingContext parsingContext, mx mxVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, mxVar != null ? mxVar.f89067a : null, this.f88917a.T2());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, mxVar != null ? mxVar.f89068b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, mxVar != null ? mxVar.f89069c : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = mxVar != null ? mxVar.f89070d : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_limit", typeHelper, allowPropertyOverride, field, function1, lx.f88913f);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, mxVar != null ? mxVar.f89071e : null);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field field2 = mxVar != null ? mxVar.f89072f : null;
            Function1<Object, Uri> function12 = ParsingConvertersKt.ANY_TO_URI;
            return new mx(optionalField, optionalFieldWithExpression, fieldWithExpression, optionalFieldWithExpression2, optionalField2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "referer", typeHelper2, allowPropertyOverride, field2, function12), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, mxVar != null ? mxVar.f89073g : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, mxVar != null ? mxVar.f89074h : null, this.f88917a.i1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper2, allowPropertyOverride, mxVar != null ? mxVar.f89075i : null, function12), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility_duration", typeHelper, allowPropertyOverride, mxVar != null ? mxVar.f89076j : null, function1, lx.f88914g), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility_percentage", typeHelper, allowPropertyOverride, mxVar != null ? mxVar.f89077k : null, function1, lx.f88915h));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, mx mxVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", mxVar.f89067a, this.f88917a.T2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", mxVar.f89068b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", mxVar.f89069c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_limit", mxVar.f89070d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", mxVar.f89071e);
            Field field = mxVar.f89072f;
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", field, function1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", mxVar.f89073g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", mxVar.f89074h, this.f88917a.i1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", mxVar.f89075i, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_duration", mxVar.f89076j);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_percentage", mxVar.f89077k);
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
        private final my f88918a;

        public d(my myVar) {
            this.f88918a = myVar;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k8.hx resolve(com.yandex.div.serialization.ParsingContext r22, k8.mx r23, org.json.JSONObject r24) {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.lx.d.resolve(com.yandex.div.serialization.ParsingContext, k8.mx, org.json.JSONObject):k8.hx");
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f88909b = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f88910c = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f88911d = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f88912e = Expression.Companion.constant$default(companion, 50L, null, 2, null);
        f88913f = new ValueValidator() { // from class: k8.ix
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return lx.d(((Long) obj).longValue());
            }
        };
        f88914g = new ValueValidator() { // from class: k8.jx
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return lx.e(((Long) obj).longValue());
            }
        };
        f88915h = new ValueValidator() { // from class: k8.kx
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return lx.f(((Long) obj).longValue());
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
        return j10 > 0 && j10 <= 100;
    }
}
