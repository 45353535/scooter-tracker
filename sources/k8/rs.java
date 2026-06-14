package k8;

import androidx.core.provider.FontsContractCompat;
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
import k8.as;
import k8.ss;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class rs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f90844a = new f(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f90848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f90849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f90850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f90851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression f90852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression f90853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression f90854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final hb f90855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeHelper f90856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeHelper f90857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TypeHelper f90858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TypeHelper f90859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final TypeHelper f90860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ValueValidator f90861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ValueValidator f90862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ValueValidator f90863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ValueValidator f90864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ValueValidator f90865v;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90866f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jd);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f90867f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof as.e.a);
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f90868f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jp);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f90869f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jd);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f90870f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jd);
        }
    }

    private static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    public static final class g implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90871a;

        public g(my myVar) {
            this.f90871a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public as.e deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = rs.f90845b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_background_color", typeHelper, function1, expression);
            Expression expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_font_variation_settings", typeHelper2);
            TypeHelper typeHelper3 = rs.f90856m;
            Function1 function12 = jd.f88380e;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_font_weight", typeHelper3, function12);
            Expression expression3 = rs.f90846c;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_text_color", typeHelper, function1, expression3);
            Expression expression4 = optionalExpression4 == null ? expression3 : optionalExpression4;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = rs.f90861r;
            Expression expression5 = rs.f90847d;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation_duration", typeHelper4, function13, valueValidator, expression5);
            Expression expression6 = optionalExpression5 == null ? expression5 : optionalExpression5;
            TypeHelper typeHelper5 = rs.f90857n;
            Function1 function14 = as.e.a.f86397e;
            Expression expression7 = rs.f90848e;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation_type", typeHelper5, function14, expression7);
            Expression expression8 = optionalExpression6 == null ? expression7 : optionalExpression6;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", typeHelper4, function13, rs.f90862s);
            g9 g9Var = (g9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corners_radius", this.f90871a.s2());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            ValueValidator valueValidator2 = rs.f90863t;
            Expression expression9 = rs.f90849f;
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper4, function13, valueValidator2, expression9);
            Expression expression10 = optionalExpression9 == null ? expression9 : optionalExpression9;
            TypeHelper typeHelper6 = rs.f90858o;
            Function1 function15 = jp.f88507e;
            Expression expression11 = rs.f90850g;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper6, function15, expression11);
            Expression expression12 = optionalExpression10 == null ? expression11 : optionalExpression10;
            TypeHelper typeHelper7 = rs.f90859p;
            Expression expression13 = rs.f90851h;
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, typeHelper7, function12, expression13);
            Expression expression14 = optionalExpression11 == null ? expression13 : optionalExpression11;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_background_color", typeHelper, function1);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_font_variation_settings", typeHelper2);
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_font_weight", rs.f90860q, function12);
            Expression expression15 = rs.f90852i;
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_text_color", typeHelper, function1, expression15);
            Expression expression16 = optionalExpression15 == null ? expression15 : optionalExpression15;
            ValueValidator valueValidator3 = rs.f90864u;
            Expression expression17 = rs.f90853j;
            Expression optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper4, function13, valueValidator3, expression17);
            if (optionalExpression16 != null) {
                expression17 = optionalExpression16;
            }
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function16 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression18 = rs.f90854k;
            Expression optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper8, function16, expression18);
            Expression expression19 = optionalExpression17 == null ? expression18 : optionalExpression17;
            Expression optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper4, function13, rs.f90865v);
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f90871a.Y2());
            if (hbVar == null) {
                hbVar = rs.f90855l;
            }
            return new as.e(expression2, optionalExpression2, optionalExpression3, expression4, expression6, expression8, optionalExpression7, g9Var, optionalExpression8, expression10, expression12, expression14, optionalExpression12, optionalExpression13, optionalExpression14, expression16, expression17, expression19, optionalExpression18, hbVar);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, as.e eVar) {
            JSONObject jSONObject = new JSONObject();
            Expression expression = eVar.f86374a;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_background_color", expression, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_font_variation_settings", eVar.f86375b);
            Expression expression2 = eVar.f86376c;
            Function1 function12 = jd.f88379d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_font_weight", expression2, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_text_color", eVar.f86377d, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation_duration", eVar.f86378e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation_type", eVar.f86379f, as.e.a.f86396d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", eVar.f86380g);
            JsonPropertyParser.write(parsingContext, jSONObject, "corners_radius", eVar.f86381h, this.f90871a.s2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", eVar.f86382i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", eVar.f86383j);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", eVar.f86384k, jp.f88506d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, eVar.f86385l, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_background_color", eVar.f86386m, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_font_variation_settings", eVar.f86387n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_font_weight", eVar.f86388o, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_text_color", eVar.f86389p, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", eVar.f86390q);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", eVar.f86391r);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", eVar.f86392s);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", eVar.f86393t, this.f90871a.Y2());
            return jSONObject;
        }
    }

    public static final class h implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90872a;

        public h(my myVar) {
            this.f90872a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ss.e deserialize(ParsingContext parsingContext, ss.e eVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field = eVar != null ? eVar.f91162a : null;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_background_color", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_font_variation_settings", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f91163b : null);
            TypeHelper typeHelper3 = rs.f90856m;
            Field field2 = eVar != null ? eVar.f91164c : null;
            Function1 function12 = jd.f88380e;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_font_weight", typeHelper3, allowPropertyOverride, field2, function12);
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_text_color", typeHelper, allowPropertyOverride, eVar != null ? eVar.f91165d : null, function1);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field3 = eVar != null ? eVar.f91166e : null;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            return new ss.e(optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalFieldWithExpression4, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animation_duration", typeHelper4, allowPropertyOverride, field3, function13, rs.f90861r), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animation_type", rs.f90857n, allowPropertyOverride, eVar != null ? eVar.f91167f : null, as.e.a.f86397e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", typeHelper4, allowPropertyOverride, eVar != null ? eVar.f91168g : null, function13, rs.f90862s), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "corners_radius", allowPropertyOverride, eVar != null ? eVar.f91169h : null, this.f90872a.t2()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, eVar != null ? eVar.f91170i : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper4, allowPropertyOverride, eVar != null ? eVar.f91171j : null, function13, rs.f90863t), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", rs.f90858o, allowPropertyOverride, eVar != null ? eVar.f91172k : null, jp.f88507e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, rs.f90859p, allowPropertyOverride, eVar != null ? eVar.f91173l : null, function12), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_background_color", typeHelper, allowPropertyOverride, eVar != null ? eVar.f91174m : null, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_font_variation_settings", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f91175n : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_font_weight", rs.f90860q, allowPropertyOverride, eVar != null ? eVar.f91176o : null, function12), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_text_color", typeHelper, allowPropertyOverride, eVar != null ? eVar.f91177p : null, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", typeHelper4, allowPropertyOverride, eVar != null ? eVar.f91178q : null, function13, rs.f90864u), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, eVar != null ? eVar.f91179r : null, ParsingConvertersKt.NUMBER_TO_DOUBLE), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, eVar != null ? eVar.f91180s : null, function13, rs.f90865v), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, eVar != null ? eVar.f91181t : null, this.f90872a.Z2()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ss.e eVar) {
            JSONObject jSONObject = new JSONObject();
            Field field = eVar.f91162a;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_background_color", field, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_font_variation_settings", eVar.f91163b);
            Field field2 = eVar.f91164c;
            Function1 function12 = jd.f88379d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_font_weight", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_text_color", eVar.f91165d, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation_duration", eVar.f91166e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation_type", eVar.f91167f, as.e.a.f86396d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", eVar.f91168g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corners_radius", eVar.f91169h, this.f90872a.t2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", eVar.f91170i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", eVar.f91171j);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", eVar.f91172k, jp.f88506d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, eVar.f91173l, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_background_color", eVar.f91174m, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_font_variation_settings", eVar.f91175n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_font_weight", eVar.f91176o, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_text_color", eVar.f91177p, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", eVar.f91178q);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", eVar.f91179r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", eVar.f91180s);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", eVar.f91181t, this.f90872a.Z2());
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

    public static final class i implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90873a;

        public i(my myVar) {
            this.f90873a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public as.e resolve(ParsingContext parsingContext, ss.e eVar, JSONObject jSONObject) {
            Field field = eVar.f91162a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = rs.f90845b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "active_background_color", typeHelper, function1, expression);
            Expression expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field field2 = eVar.f91163b;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "active_font_variation_settings", typeHelper2);
            Field field3 = eVar.f91164c;
            TypeHelper typeHelper3 = rs.f90856m;
            Function1 function12 = jd.f88380e;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "active_font_weight", typeHelper3, function12);
            Field field4 = eVar.f91165d;
            Expression expression3 = rs.f90846c;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "active_text_color", typeHelper, function1, expression3);
            Expression expression4 = expressionResolveOptionalExpression4 == null ? expression3 : expressionResolveOptionalExpression4;
            Field field5 = eVar.f91166e;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = rs.f90861r;
            Expression expression5 = rs.f90847d;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "animation_duration", typeHelper4, function13, valueValidator, expression5);
            Expression expression6 = expressionResolveOptionalExpression5 == null ? expression5 : expressionResolveOptionalExpression5;
            Field field6 = eVar.f91167f;
            TypeHelper typeHelper5 = rs.f90857n;
            Function1 function14 = as.e.a.f86397e;
            Expression expression7 = rs.f90848e;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "animation_type", typeHelper5, function14, expression7);
            Expression expression8 = expressionResolveOptionalExpression6 == null ? expression7 : expressionResolveOptionalExpression6;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f91168g, jSONObject, "corner_radius", typeHelper4, function13, rs.f90862s);
            g9 g9Var = (g9) JsonFieldResolver.resolveOptional(parsingContext, eVar.f91169h, jSONObject, "corners_radius", this.f90873a.u2(), this.f90873a.s2());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f91170i, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field7 = eVar.f91171j;
            ValueValidator valueValidator2 = rs.f90863t;
            Expression expression9 = rs.f90849f;
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "font_size", typeHelper4, function13, valueValidator2, expression9);
            Expression expression10 = expressionResolveOptionalExpression9 == null ? expression9 : expressionResolveOptionalExpression9;
            Field field8 = eVar.f91172k;
            TypeHelper typeHelper6 = rs.f90858o;
            Function1 function15 = jp.f88507e;
            Expression expression11 = rs.f90850g;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_size_unit", typeHelper6, function15, expression11);
            Expression expression12 = expressionResolveOptionalExpression10 == null ? expression11 : expressionResolveOptionalExpression10;
            Field field9 = eVar.f91173l;
            TypeHelper typeHelper7 = rs.f90859p;
            Expression expression13 = rs.f90851h;
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, FontsContractCompat.Columns.WEIGHT, typeHelper7, function12, expression13);
            Expression expression14 = expressionResolveOptionalExpression11 == null ? expression13 : expressionResolveOptionalExpression11;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f91174m, jSONObject, "inactive_background_color", typeHelper, function1);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f91175n, jSONObject, "inactive_font_variation_settings", typeHelper2);
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f91176o, jSONObject, "inactive_font_weight", rs.f90860q, function12);
            Field field10 = eVar.f91177p;
            Expression expression15 = rs.f90852i;
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "inactive_text_color", typeHelper, function1, expression15);
            Expression expression16 = expressionResolveOptionalExpression15 == null ? expression15 : expressionResolveOptionalExpression15;
            Field field11 = eVar.f91178q;
            ValueValidator valueValidator3 = rs.f90864u;
            Expression expression17 = rs.f90853j;
            Expression expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "item_spacing", typeHelper4, function13, valueValidator3, expression17);
            if (expressionResolveOptionalExpression16 != null) {
                expression17 = expressionResolveOptionalExpression16;
            }
            Field field12 = eVar.f91179r;
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function16 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression18 = rs.f90854k;
            Expression expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "letter_spacing", typeHelper8, function16, expression18);
            Expression expression19 = expressionResolveOptionalExpression17 == null ? expression18 : expressionResolveOptionalExpression17;
            Expression expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f91180s, jSONObject, "line_height", typeHelper4, function13, rs.f90865v);
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, eVar.f91181t, jSONObject, "paddings", this.f90873a.a3(), this.f90873a.Y2());
            if (hbVar == null) {
                hbVar = rs.f90855l;
            }
            return new as.e(expression2, expressionResolveOptionalExpression2, expressionResolveOptionalExpression3, expression4, expression6, expression8, expressionResolveOptionalExpression7, g9Var, expressionResolveOptionalExpression8, expression10, expression12, expression14, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expressionResolveOptionalExpression14, expression16, expression17, expression19, expressionResolveOptionalExpression18, hbVar);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90845b = Expression.Companion.constant$default(companion, -9120, null, 2, null);
        f90846c = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
        f90847d = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        as.e.a aVar = as.e.a.SLIDE;
        f90848e = Expression.Companion.constant$default(companion, aVar, null, 2, null);
        f90849f = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        jp jpVar = jp.SP;
        f90850g = Expression.Companion.constant$default(companion, jpVar, null, 2, null);
        jd jdVar = jd.REGULAR;
        f90851h = Expression.Companion.constant$default(companion, jdVar, null, 2, null);
        f90852i = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
        f90853j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90854k = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f90855l = new hb(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f90856m = companion2.from(ArraysKt.first(jd.values()), a.f90866f);
        f90857n = companion2.from(aVar, b.f90867f);
        f90858o = companion2.from(jpVar, c.f90868f);
        f90859p = companion2.from(jdVar, d.f90869f);
        f90860q = companion2.from(ArraysKt.first(jd.values()), e.f90870f);
        f90861r = new ValueValidator() { // from class: k8.ms
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rs.f(((Long) obj).longValue());
            }
        };
        f90862s = new ValueValidator() { // from class: k8.ns
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rs.g(((Long) obj).longValue());
            }
        };
        f90863t = new ValueValidator() { // from class: k8.os
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rs.h(((Long) obj).longValue());
            }
        };
        f90864u = new ValueValidator() { // from class: k8.ps
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rs.i(((Long) obj).longValue());
            }
        };
        f90865v = new ValueValidator() { // from class: k8.qs
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rs.j(((Long) obj).longValue());
            }
        };
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(long j10) {
        return j10 >= 0;
    }
}
