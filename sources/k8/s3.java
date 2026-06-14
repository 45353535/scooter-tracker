package k8;

import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import k8.j1;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f90941a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90942b = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeHelper f90943c = TypeHelper.INSTANCE.from(ArraysKt.first(j1.d.values()), a.f90944f);

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90944f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof j1.d);
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
        private final my f90945a;

        public c(my myVar) {
            this.f90945a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j1 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            xa xaVar = (xa) JsonPropertyParser.readOptional(parsingContext, jSONObject, "download_callbacks", this.f90945a.S2());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = s3.f90942b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, function1, expression);
            if (optionalExpression == null) {
                optionalExpression = expression;
            }
            Expression expression2 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1<Object, Uri> function12 = ParsingConvertersKt.ANY_TO_URI;
            return new j1(xaVar, optionalExpression, expression2, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "log_url", typeHelper2, function12), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "menu_items", this.f90945a.x0()), (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "payload"), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "referer", typeHelper2, function12), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "scope_id"), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TypedValues.AttributesType.S_TARGET, s3.f90943c, j1.d.f88327e), (m5) JsonPropertyParser.readOptional(parsingContext, jSONObject, "typed", this.f90945a.h1()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "url", typeHelper2, function12));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, j1 j1Var) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", j1Var.f88305a, this.f90945a.S2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", j1Var.f88306b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", j1Var.f88307c);
            Expression expression = j1Var.f88308d;
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_url", expression, function1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "menu_items", j1Var.f88309e, this.f90945a.x0());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", j1Var.f88310f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", j1Var.f88311g, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", j1Var.f88312h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TypedValues.AttributesType.S_TARGET, j1Var.f88313i, j1.d.f88326d);
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", j1Var.f88314j, this.f90945a.h1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", j1Var.f88315k, function1);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90946a;

        public d(my myVar) {
            this.f90946a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i5 deserialize(ParsingContext parsingContext, i5 i5Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, i5Var != null ? i5Var.f88200a : null, this.f90946a.T2());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, i5Var != null ? i5Var.f88201b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, i5Var != null ? i5Var.f88202c : null);
            TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
            Field field = i5Var != null ? i5Var.f88203d : null;
            Function1<Object, Uri> function1 = ParsingConvertersKt.ANY_TO_URI;
            return new i5(optionalField, optionalFieldWithExpression, fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "log_url", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "menu_items", allowPropertyOverride, i5Var != null ? i5Var.f88204e : null, this.f90946a.y0()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, i5Var != null ? i5Var.f88205f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "referer", typeHelper, allowPropertyOverride, i5Var != null ? i5Var.f88206g : null, function1), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, i5Var != null ? i5Var.f88207h : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, TypedValues.AttributesType.S_TARGET, s3.f90943c, allowPropertyOverride, i5Var != null ? i5Var.f88208i : null, j1.d.f88327e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, i5Var != null ? i5Var.f88209j : null, this.f90946a.i1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", typeHelper, allowPropertyOverride, i5Var != null ? i5Var.f88210k : null, function1));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, i5 i5Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", i5Var.f88200a, this.f90946a.T2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", i5Var.f88201b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", i5Var.f88202c);
            Field field = i5Var.f88203d;
            Function1<Uri, String> function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_url", field, function1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "menu_items", i5Var.f88204e, this.f90946a.y0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", i5Var.f88205f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", i5Var.f88206g, function1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", i5Var.f88207h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TypedValues.AttributesType.S_TARGET, i5Var.f88208i, j1.d.f88326d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", i5Var.f88209j, this.f90946a.i1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", i5Var.f88210k, function1);
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
        private final my f90947a;

        public e(my myVar) {
            this.f90947a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j1 resolve(ParsingContext parsingContext, i5 i5Var, JSONObject jSONObject) {
            xa xaVar = (xa) JsonFieldResolver.resolveOptional(parsingContext, i5Var.f88200a, jSONObject, "download_callbacks", this.f90947a.U2(), this.f90947a.S2());
            Field field = i5Var.f88201b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = s3.f90942b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, i5Var.f88202c, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field2 = i5Var.f88203d;
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1<Object, Uri> function12 = ParsingConvertersKt.ANY_TO_URI;
            return new j1(xaVar, expression, expressionResolveExpression, JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "log_url", typeHelper2, function12), JsonFieldResolver.resolveOptionalList(parsingContext, i5Var.f88204e, jSONObject, "menu_items", this.f90947a.z0(), this.f90947a.x0()), (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, i5Var.f88205f, jSONObject, "payload"), JsonFieldResolver.resolveOptionalExpression(parsingContext, i5Var.f88206g, jSONObject, "referer", typeHelper2, function12), (String) JsonFieldResolver.resolveOptional(parsingContext, i5Var.f88207h, jSONObject, "scope_id"), JsonFieldResolver.resolveOptionalExpression(parsingContext, i5Var.f88208i, jSONObject, TypedValues.AttributesType.S_TARGET, s3.f90943c, j1.d.f88327e), (m5) JsonFieldResolver.resolveOptional(parsingContext, i5Var.f88209j, jSONObject, "typed", this.f90947a.j1(), this.f90947a.h1()), JsonFieldResolver.resolveOptionalExpression(parsingContext, i5Var.f88210k, jSONObject, "url", typeHelper2, function12));
        }
    }
}
