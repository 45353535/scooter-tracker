package k8;

import com.ironsource.C4240b4;
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
import k8.dv;
import k8.gv;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class fv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f87622a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f87624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gv.c f87625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeHelper f87626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ValueValidator f87627f;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87628f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof dv.c);
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
        private final my f87629a;

        public c(my myVar) {
            this.f87629a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public dv deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            a6 a6Var = (a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_in", this.f87629a.q1());
            a6 a6Var2 = (a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_out", this.f87629a.q1());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = fv.f87623b;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "close_by_tap_outside", typeHelper, function1, expression);
            Expression expression2 = optionalExpression2 == null ? expression : optionalExpression2;
            y0 y0Var = (y0) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f87629a.M4());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = fv.f87627f;
            Expression expression3 = fv.f87624c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper2, function12, valueValidator, expression3);
            if (optionalExpression3 != null) {
                expression3 = optionalExpression3;
            }
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            gv gvVar = (gv) JsonPropertyParser.readOptional(parsingContext, jSONObject, C4240b4.a.f42515t, this.f87629a.S8());
            if (gvVar == null) {
                gvVar = fv.f87625d;
            }
            return new dv(a6Var, a6Var2, optionalExpression, expression2, y0Var, expression3, str, gvVar, (zl) JsonPropertyParser.readOptional(parsingContext, jSONObject, "offset", this.f87629a.Z5()), JsonExpressionParser.readExpression(parsingContext, jSONObject, C4240b4.i.L, fv.f87626e, dv.c.f87098e), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tap_outside_actions", this.f87629a.u0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, dv dvVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "animation_in", dvVar.f87083a, this.f87629a.q1());
            JsonPropertyParser.write(parsingContext, jSONObject, "animation_out", dvVar.f87084b, this.f87629a.q1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_accessibility_description", dvVar.f87085c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "close_by_tap_outside", dvVar.f87086d);
            JsonPropertyParser.write(parsingContext, jSONObject, "div", dvVar.f87087e, this.f87629a.M4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", dvVar.f87088f);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", dvVar.f87089g);
            JsonPropertyParser.write(parsingContext, jSONObject, C4240b4.a.f42515t, dvVar.f87090h, this.f87629a.S8());
            JsonPropertyParser.write(parsingContext, jSONObject, "offset", dvVar.f87091i, this.f87629a.Z5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.i.L, dvVar.f87092j, dv.c.f87097d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tap_outside_actions", dvVar.f87093k, this.f87629a.u0());
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87630a;

        public d(my myVar) {
            this.f87630a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vv deserialize(ParsingContext parsingContext, vv vvVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new vv(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, vvVar != null ? vvVar.f92034a : null, this.f87630a.r1()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, vvVar != null ? vvVar.f92035b : null, this.f87630a.r1()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, vvVar != null ? vvVar.f92036c : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "close_by_tap_outside", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, vvVar != null ? vvVar.f92037d : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, vvVar != null ? vvVar.f92038e : null, this.f87630a.N4()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, vvVar != null ? vvVar.f92039f : null, ParsingConvertersKt.NUMBER_TO_INT, fv.f87627f), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, vvVar != null ? vvVar.f92040g : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.a.f42515t, allowPropertyOverride, vvVar != null ? vvVar.f92041h : null, this.f87630a.T8()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "offset", allowPropertyOverride, vvVar != null ? vvVar.f92042i : null, this.f87630a.a6()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.i.L, fv.f87626e, allowPropertyOverride, vvVar != null ? vvVar.f92043j : null, dv.c.f87098e), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tap_outside_actions", allowPropertyOverride, vvVar != null ? vvVar.f92044k : null, this.f87630a.v0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, vv vvVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "animation_in", vvVar.f92034a, this.f87630a.r1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "animation_out", vvVar.f92035b, this.f87630a.r1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_accessibility_description", vvVar.f92036c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "close_by_tap_outside", vvVar.f92037d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "div", vvVar.f92038e, this.f87630a.N4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", vvVar.f92039f);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", vvVar.f92040g);
            JsonFieldParser.writeField(parsingContext, jSONObject, C4240b4.a.f42515t, vvVar.f92041h, this.f87630a.T8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "offset", vvVar.f92042i, this.f87630a.a6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.i.L, vvVar.f92043j, dv.c.f87097d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tap_outside_actions", vvVar.f92044k, this.f87630a.v0());
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
        private final my f87631a;

        public e(my myVar) {
            this.f87631a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public dv resolve(ParsingContext parsingContext, vv vvVar, JSONObject jSONObject) {
            a6 a6Var = (a6) JsonFieldResolver.resolveOptional(parsingContext, vvVar.f92034a, jSONObject, "animation_in", this.f87631a.s1(), this.f87631a.q1());
            a6 a6Var2 = (a6) JsonFieldResolver.resolveOptional(parsingContext, vvVar.f92035b, jSONObject, "animation_out", this.f87631a.s1(), this.f87631a.q1());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, vvVar.f92036c, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field = vvVar.f92037d;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = fv.f87623b;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "close_by_tap_outside", typeHelper, function1, expression);
            Expression expression2 = expressionResolveOptionalExpression2 == null ? expression : expressionResolveOptionalExpression2;
            y0 y0Var = (y0) JsonFieldResolver.resolve(parsingContext, vvVar.f92038e, jSONObject, "div", this.f87631a.O4(), this.f87631a.M4());
            Field field2 = vvVar.f92039f;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = fv.f87627f;
            Expression expression3 = fv.f87624c;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = expressionResolveOptionalExpression3 == null ? expression3 : expressionResolveOptionalExpression3;
            String str = (String) JsonFieldResolver.resolve(parsingContext, vvVar.f92040g, jSONObject, "id");
            gv gvVar = (gv) JsonFieldResolver.resolveOptional(parsingContext, vvVar.f92041h, jSONObject, C4240b4.a.f42515t, this.f87631a.U8(), this.f87631a.S8());
            if (gvVar == null) {
                gvVar = fv.f87625d;
            }
            return new dv(a6Var, a6Var2, expressionResolveOptionalExpression, expression2, y0Var, expression4, str, gvVar, (zl) JsonFieldResolver.resolveOptional(parsingContext, vvVar.f92042i, jSONObject, "offset", this.f87631a.b6(), this.f87631a.Z5()), JsonFieldResolver.resolveExpression(parsingContext, vvVar.f92043j, jSONObject, C4240b4.i.L, fv.f87626e, dv.c.f87098e), JsonFieldResolver.resolveOptionalList(parsingContext, vvVar.f92044k, jSONObject, "tap_outside_actions", this.f87631a.w0(), this.f87631a.u0()));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f87623b = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f87624c = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        f87625d = new gv.c(new kv());
        f87626e = TypeHelper.INSTANCE.from(ArraysKt.first(dv.c.values()), a.f87628f);
        f87627f = new ValueValidator() { // from class: k8.ev
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return fv.b(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
