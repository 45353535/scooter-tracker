package k8;

import com.ironsource.C4240b4;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
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
public abstract class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88762a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ValueValidator f88763b = new ValueValidator() { // from class: k8.h9
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return l9.e(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ValueValidator f88764c = new ValueValidator() { // from class: k8.i9
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return l9.f(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ValueValidator f88765d = new ValueValidator() { // from class: k8.j9
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return l9.g(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ValueValidator f88766e = new ValueValidator() { // from class: k8.k9
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return l9.h(((Long) obj).longValue());
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
        private final my f88767a;

        public b(my myVar) {
            this.f88767a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g9 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new g9(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C4240b4.e.f42565e, typeHelper, function1, l9.f88763b), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C4240b4.e.f42564d, typeHelper, function1, l9.f88764c), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C4240b4.e.f42563c, typeHelper, function1, l9.f88765d), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C4240b4.e.f42562b, typeHelper, function1, l9.f88766e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, g9 g9Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.e.f42565e, g9Var.f87780a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.e.f42564d, g9Var.f87781b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.e.f42563c, g9Var.f87782c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.e.f42562b, g9Var.f87783d);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88768a;

        public c(my myVar) {
            this.f88768a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m9 deserialize(ParsingContext parsingContext, m9 m9Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = m9Var != null ? m9Var.f88971a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new m9(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.e.f42565e, typeHelper, allowPropertyOverride, field, function1, l9.f88763b), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.e.f42564d, typeHelper, allowPropertyOverride, m9Var != null ? m9Var.f88972b : null, function1, l9.f88764c), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.e.f42563c, typeHelper, allowPropertyOverride, m9Var != null ? m9Var.f88973c : null, function1, l9.f88765d), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.e.f42562b, typeHelper, allowPropertyOverride, m9Var != null ? m9Var.f88974d : null, function1, l9.f88766e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, m9 m9Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.e.f42565e, m9Var.f88971a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.e.f42564d, m9Var.f88972b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.e.f42563c, m9Var.f88973c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.e.f42562b, m9Var.f88974d);
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
        private final my f88769a;

        public d(my myVar) {
            this.f88769a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g9 resolve(ParsingContext parsingContext, m9 m9Var, JSONObject jSONObject) {
            Field field = m9Var.f88971a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new g9(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, C4240b4.e.f42565e, typeHelper, function1, l9.f88763b), JsonFieldResolver.resolveOptionalExpression(parsingContext, m9Var.f88972b, jSONObject, C4240b4.e.f42564d, typeHelper, function1, l9.f88764c), JsonFieldResolver.resolveOptionalExpression(parsingContext, m9Var.f88973c, jSONObject, C4240b4.e.f42563c, typeHelper, function1, l9.f88765d), JsonFieldResolver.resolveOptionalExpression(parsingContext, m9Var.f88974d, jSONObject, C4240b4.e.f42562b, typeHelper, function1, l9.f88766e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j10) {
        return j10 >= 0;
    }
}
