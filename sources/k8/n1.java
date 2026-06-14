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
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f89981a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeHelper f89982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeHelper f89983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ValueValidator f89984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ValueValidator f89985e;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f89986f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof b6);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f89987f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof c6);
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
        private final my f89988a;

        public d(my myVar) {
            this.f89988a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k1 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "animator_id");
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", n1.f89982b, b6.f86440e);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new k1(str, optionalExpression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, function1, n1.f89984d), (fw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "end_value", this.f89988a.h9()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", n1.f89983c, c6.f86615e), (n9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.f89988a.v2()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, n1.f89985e), (fw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "start_value", this.f89988a.h9()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, k1 k1Var) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "animator_id", k1Var.f88547a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", k1Var.f88548b, b6.f86439d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", k1Var.f88549c);
            JsonPropertyParser.write(parsingContext, jSONObject, "end_value", k1Var.f88550d, this.f89988a.h9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", k1Var.f88551e, c6.f86614d);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", k1Var.f88552f, this.f89988a.v2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", k1Var.f88553g);
            JsonPropertyParser.write(parsingContext, jSONObject, "start_value", k1Var.f88554h, this.f89988a.h9());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    public static final class e implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f89989a;

        public e(my myVar) {
            this.f89989a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o1 deserialize(ParsingContext parsingContext, o1 o1Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field field = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "animator_id", allowPropertyOverride, o1Var != null ? o1Var.f90130a : null);
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", n1.f89982b, allowPropertyOverride, o1Var != null ? o1Var.f90131b : null, b6.f86440e);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = o1Var != null ? o1Var.f90132c : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new o1(field, optionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field2, function1, n1.f89984d), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "end_value", allowPropertyOverride, o1Var != null ? o1Var.f90133d : null, this.f89989a.i9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", n1.f89983c, allowPropertyOverride, o1Var != null ? o1Var.f90134e : null, c6.f86615e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, o1Var != null ? o1Var.f90135f : null, this.f89989a.w2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, o1Var != null ? o1Var.f90136g : null, function1, n1.f89985e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "start_value", allowPropertyOverride, o1Var != null ? o1Var.f90137h : null, this.f89989a.i9()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, o1 o1Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "animator_id", o1Var.f90130a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", o1Var.f90131b, b6.f86439d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", o1Var.f90132c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "end_value", o1Var.f90133d, this.f89989a.i9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", o1Var.f90134e, c6.f86614d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", o1Var.f90135f, this.f89989a.w2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", o1Var.f90136g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "start_value", o1Var.f90137h, this.f89989a.i9());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_start");
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
        private final my f89990a;

        public f(my myVar) {
            this.f89990a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k1 resolve(ParsingContext parsingContext, o1 o1Var, JSONObject jSONObject) {
            String str = (String) JsonFieldResolver.resolve(parsingContext, o1Var.f90130a, jSONObject, "animator_id");
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, o1Var.f90131b, jSONObject, "direction", n1.f89982b, b6.f86440e);
            Field field = o1Var.f90132c;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new k1(str, expressionResolveOptionalExpression, JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, function1, n1.f89984d), (fw) JsonFieldResolver.resolveOptional(parsingContext, o1Var.f90133d, jSONObject, "end_value", this.f89990a.j9(), this.f89990a.h9()), JsonFieldResolver.resolveOptionalExpression(parsingContext, o1Var.f90134e, jSONObject, "interpolator", n1.f89983c, c6.f86615e), (n9) JsonFieldResolver.resolveOptional(parsingContext, o1Var.f90135f, jSONObject, "repeat_count", this.f89990a.x2(), this.f89990a.v2()), JsonFieldResolver.resolveOptionalExpression(parsingContext, o1Var.f90136g, jSONObject, "start_delay", typeHelper, function1, n1.f89985e), (fw) JsonFieldResolver.resolveOptional(parsingContext, o1Var.f90137h, jSONObject, "start_value", this.f89990a.j9(), this.f89990a.h9()));
        }
    }

    static {
        TypeHelper.Companion companion = TypeHelper.INSTANCE;
        f89982b = companion.from(ArraysKt.first(b6.values()), a.f89986f);
        f89983c = companion.from(ArraysKt.first(c6.values()), b.f89987f);
        f89984d = new ValueValidator() { // from class: k8.l1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return n1.c(((Long) obj).longValue());
            }
        };
        f89985e = new ValueValidator() { // from class: k8.m1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return n1.d(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j10) {
        return j10 >= 0;
    }
}
