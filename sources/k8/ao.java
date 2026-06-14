package k8;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.provider.FontsContractCompat;
import androidx.core.view.ViewCompat;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import io.appmetrica.analytics.impl.H2;
import java.util.List;
import k8.ep;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f86275a = new f(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f86276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f86277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f86278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ep.e f86279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f86280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f86281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f86282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression f86283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ep.d f86284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TypeHelper f86285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final TypeHelper f86286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeHelper f86287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeHelper f86288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TypeHelper f86289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ValueValidator f86290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ValueValidator f86291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ValueValidator f86292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ValueValidator f86293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ValueValidator f86294t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ListValidator f86295u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ValueValidator f86296v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ListValidator f86297w;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86298f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof y5);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f86299f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof z5);
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f86300f = new c();

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
        public static final d f86301f = new d();

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
        public static final e f86302f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof gx);
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
        private final my f86303a;

        public g(my myVar) {
            this.f86303a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public rn deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f86303a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", ao.f86285k, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", ao.f86286l, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ao.f86290p;
            Expression expression = ao.f86276b;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = optionalExpression3 == null ? expression : optionalExpression3;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f86303a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f86303a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f86303a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, ao.f86291q);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f86303a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f86303a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f86303a.z3());
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
            ValueValidator valueValidator2 = ao.f86292r;
            Expression expression3 = ao.f86277c;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper2, function12, valueValidator2, expression3);
            if (optionalExpression6 != null) {
                expression3 = optionalExpression6;
            }
            TypeHelper typeHelper4 = ao.f86287m;
            Function1 function13 = jp.f88507e;
            Expression expression4 = ao.f86278d;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper4, function13, expression4);
            Expression expression5 = optionalExpression7 == null ? expression4 : optionalExpression7;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, ao.f86288n, jd.f88380e);
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, function12, ao.f86293s);
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f86303a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f86303a.Y6());
            if (epVar == null) {
                epVar = ao.f86279e;
            }
            ep epVar2 = epVar;
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression6 = ao.f86280f;
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper5, function14, expression6);
            Expression expression7 = optionalExpression11 == null ? expression6 : optionalExpression11;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper3);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f86303a.P4());
            Expression expression8 = ao.f86281g;
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, function1, expression8);
            Expression expression9 = optionalExpression13 == null ? expression8 : optionalExpression13;
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, function12, ao.f86294t);
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f86303a.Y2());
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "options", this.f86303a.G6(), ao.f86295u);
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f86303a.Y2());
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper3);
            Expression optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, ao.f86296v);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f86303a.u0());
            Expression expression10 = ao.f86282h;
            Expression optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper5, function14, expression10);
            Expression expression11 = optionalExpression17 == null ? expression10 : optionalExpression17;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f86303a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f86303a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f86303a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f86303a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f86303a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, ao.f86297w);
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "value_variable");
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f86303a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f86303a.k9());
            TypeHelper typeHelper6 = ao.f86289o;
            Function1 function15 = gx.f87924e;
            Expression expression12 = ao.f86283i;
            Expression optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, function15, expression12);
            if (optionalExpression18 != null) {
                expression12 = optionalExpression18;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f86303a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f86303a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f86303a.Y6());
            if (epVar3 == null) {
                epVar3 = ao.f86284j;
            }
            return new rn(g1Var, optionalExpression, optionalExpression2, expression2, optionalList, optionalList2, l7Var, optionalExpression4, optionalList3, optionalList4, bdVar, optionalExpression5, expression3, expression5, optionalExpression8, optionalExpression9, optionalExpression10, optionalList5, epVar2, expression7, optionalExpression12, str, zhVar, expression9, optionalExpression14, hbVar, list, hbVar2, optionalExpression15, optionalExpression16, optionalList6, expression11, optionalList7, wvVar, y7Var, r6Var, r6Var2, optionalList8, str2, optionalList9, optionalList10, expression12, hxVar, optionalList11, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, rn rnVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", rnVar.o(), this.f86303a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", rnVar.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", rnVar.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", rnVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", rnVar.w(), this.f86303a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, rnVar.getBackground(), this.f86303a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, rnVar.x(), this.f86303a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", rnVar.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", rnVar.k(), this.f86303a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", rnVar.getExtensions(), this.f86303a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", rnVar.n(), this.f86303a.z3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", rnVar.f90769l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", rnVar.f90770m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", rnVar.f90771n, jp.f88506d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, rnVar.f90772o);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, rnVar.f90773p, jd.f88379d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", rnVar.f90774q);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", rnVar.u(), this.f86303a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", rnVar.getHeight(), this.f86303a.Y6());
            Expression expression = rnVar.f90777t;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_color", expression, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_text", rnVar.f90778u);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", rnVar.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", rnVar.r(), this.f86303a.P4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", rnVar.f90781x);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", rnVar.f90782y);
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", rnVar.d(), this.f86303a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "options", rnVar.A, this.f86303a.G6());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", rnVar.p(), this.f86303a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", rnVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", rnVar.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", rnVar.q(), this.f86303a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", rnVar.F, function1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", rnVar.h(), this.f86303a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", rnVar.getTransform(), this.f86303a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", rnVar.j(), this.f86303a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", rnVar.v(), this.f86303a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", rnVar.i(), this.f86303a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", rnVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "select");
            JsonPropertyParser.write(parsingContext, jSONObject, "value_variable", rnVar.M);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", rnVar.s(), this.f86303a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", rnVar.c(), this.f86303a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", rnVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", rnVar.t(), this.f86303a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", rnVar.a(), this.f86303a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", rnVar.getWidth(), this.f86303a.Y6());
            return jSONObject;
        }
    }

    public static final class h implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86304a;

        public h(my myVar) {
            this.f86304a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public fo deserialize(ParsingContext parsingContext, fo foVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, foVar != null ? foVar.f87574a : null, this.f86304a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", ao.f86285k, allowPropertyOverride, foVar != null ? foVar.f87575b : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", ao.f86286l, allowPropertyOverride, foVar != null ? foVar.f87576c : null, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = foVar != null ? foVar.f87577d : null;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper, allowPropertyOverride, field, function1, ao.f86290p);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, foVar != null ? foVar.f87578e : null, this.f86304a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, foVar != null ? foVar.f87579f : null, this.f86304a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, foVar != null ? foVar.f87580g : null, this.f86304a.M1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = foVar != null ? foVar.f87581h : null;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, function12, ao.f86291q);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, foVar != null ? foVar.f87582i : null, this.f86304a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, foVar != null ? foVar.f87583j : null, this.f86304a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, foVar != null ? foVar.f87584k : null, this.f86304a.A3());
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, foVar != null ? foVar.f87585l : null);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper2, allowPropertyOverride, foVar != null ? foVar.f87586m : null, function12, ao.f86292r);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", ao.f86287m, allowPropertyOverride, foVar != null ? foVar.f87587n : null, jp.f88507e);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, foVar != null ? foVar.f87588o : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, ao.f86288n, allowPropertyOverride, foVar != null ? foVar.f87589p : null, jd.f88380e);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, foVar != null ? foVar.f87590q : null, function12, ao.f86293s);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, foVar != null ? foVar.f87591r : null, this.f86304a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, foVar != null ? foVar.f87592s : null, this.f86304a.Z6());
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field3 = foVar != null ? foVar.f87593t : null;
            Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_color", typeHelper4, allowPropertyOverride, field3, function13);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_text", typeHelper3, allowPropertyOverride, foVar != null ? foVar.f87594u : null);
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, foVar != null ? foVar.f87595v : null);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, foVar != null ? foVar.f87596w : null, this.f86304a.Q4());
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, foVar != null ? foVar.f87597x : null, function1);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, foVar != null ? foVar.f87598y : null, function12, ao.f86294t);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, foVar != null ? foVar.f87599z : null, this.f86304a.Z2());
            Field field4 = foVar != null ? foVar.A : null;
            Lazy lazyH6 = this.f86304a.H6();
            ListValidator listValidator = ao.f86295u;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "options", allowPropertyOverride, field4, lazyH6, listValidator);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, foVar != null ? foVar.B : null, this.f86304a.Z2());
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, foVar != null ? foVar.C : null);
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, foVar != null ? foVar.D : null, function12, ao.f86296v);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, foVar != null ? foVar.E : null, this.f86304a.v0());
            Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper4, allowPropertyOverride, foVar != null ? foVar.F : null, function13);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, foVar != null ? foVar.G : null, this.f86304a.Q8());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, foVar != null ? foVar.H : null, this.f86304a.c9());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, foVar != null ? foVar.I : null, this.f86304a.V1());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, foVar != null ? foVar.J : null, this.f86304a.A1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, foVar != null ? foVar.K : null, this.f86304a.A1());
            Field field5 = foVar != null ? foVar.L : null;
            Function1 function14 = aw.f86414e;
            ListValidator listValidator2 = ao.f86297w;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new fo(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalListField5, optionalField4, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalField5, optionalField6, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalField7, listField, optionalField8, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField6, optionalFieldWithExpression17, optionalListField7, optionalField9, optionalField10, optionalField11, optionalField12, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, function14, listValidator2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, foVar != null ? foVar.M : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, foVar != null ? foVar.N : null, this.f86304a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, foVar != null ? foVar.O : null, this.f86304a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", ao.f86289o, allowPropertyOverride, foVar != null ? foVar.P : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, foVar != null ? foVar.Q : null, this.f86304a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, foVar != null ? foVar.R : null, this.f86304a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, foVar != null ? foVar.S : null, this.f86304a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, fo foVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", foVar.f87574a, this.f86304a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", foVar.f87575b, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", foVar.f87576c, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", foVar.f87577d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", foVar.f87578e, this.f86304a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, foVar.f87579f, this.f86304a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, foVar.f87580g, this.f86304a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", foVar.f87581h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", foVar.f87582i, this.f86304a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", foVar.f87583j, this.f86304a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", foVar.f87584k, this.f86304a.A3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", foVar.f87585l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", foVar.f87586m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", foVar.f87587n, jp.f88506d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, foVar.f87588o);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, foVar.f87589p, jd.f88379d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", foVar.f87590q);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", foVar.f87591r, this.f86304a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", foVar.f87592s, this.f86304a.Z6());
            Field field = foVar.f87593t;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_color", field, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_text", foVar.f87594u);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", foVar.f87595v);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", foVar.f87596w, this.f86304a.Q4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", foVar.f87597x);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", foVar.f87598y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", foVar.f87599z, this.f86304a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "options", foVar.A, this.f86304a.H6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", foVar.B, this.f86304a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", foVar.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", foVar.D);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", foVar.E, this.f86304a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", foVar.F, function1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", foVar.G, this.f86304a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", foVar.H, this.f86304a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", foVar.I, this.f86304a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", foVar.J, this.f86304a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", foVar.K, this.f86304a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", foVar.L, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "select");
            JsonFieldParser.writeField(parsingContext, jSONObject, "value_variable", foVar.M);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", foVar.N, this.f86304a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", foVar.O, this.f86304a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", foVar.P, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", foVar.Q, this.f86304a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", foVar.R, this.f86304a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", foVar.S, this.f86304a.Z6());
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
        private final my f86305a;

        public i(my myVar) {
            this.f86305a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public rn resolve(ParsingContext parsingContext, fo foVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, foVar.f87574a, jSONObject, "accessibility", this.f86305a.J(), this.f86305a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, foVar.f87575b, jSONObject, "alignment_horizontal", ao.f86285k, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, foVar.f87576c, jSONObject, "alignment_vertical", ao.f86286l, z5.f92903e);
            Field field = foVar.f87577d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ao.f86290p;
            Expression expression = ao.f86276b;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.f87578e, jSONObject, "animators", this.f86305a.v1(), this.f86305a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.f87579f, jSONObject, H2.f75840g, this.f86305a.H1(), this.f86305a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, foVar.f87580g, jSONObject, OutlinedTextFieldKt.BorderId, this.f86305a.N1(), this.f86305a.L1());
            Field field2 = foVar.f87581h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, ao.f86291q);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.f87582i, jSONObject, "disappear_actions", this.f86305a.R2(), this.f86305a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.f87583j, jSONObject, "extensions", this.f86305a.d3(), this.f86305a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, foVar.f87584k, jSONObject, "focus", this.f86305a.B3(), this.f86305a.z3());
            Field field3 = foVar.f87585l;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "font_family", typeHelper3);
            Field field4 = foVar.f87586m;
            ValueValidator valueValidator2 = ao.f86292r;
            Expression expression3 = ao.f86277c;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "font_size", typeHelper2, function12, valueValidator2, expression3);
            if (expressionResolveOptionalExpression6 != null) {
                expression3 = expressionResolveOptionalExpression6;
            }
            Field field5 = foVar.f87587n;
            TypeHelper typeHelper4 = ao.f86287m;
            Function1 function13 = jp.f88507e;
            Expression expression4 = ao.f86278d;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "font_size_unit", typeHelper4, function13, expression4);
            Expression expression5 = expressionResolveOptionalExpression7 == null ? expression4 : expressionResolveOptionalExpression7;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, foVar.f87588o, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, foVar.f87589p, jSONObject, FontsContractCompat.Columns.WEIGHT, ao.f86288n, jd.f88380e);
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, foVar.f87590q, jSONObject, "font_weight_value", typeHelper2, function12, ao.f86293s);
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.f87591r, jSONObject, "functions", this.f86305a.K3(), this.f86305a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, foVar.f87592s, jSONObject, "height", this.f86305a.a7(), this.f86305a.Y6());
            if (epVar == null) {
                epVar = ao.f86279e;
            }
            ep epVar2 = epVar;
            Field field6 = foVar.f87593t;
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression6 = ao.f86280f;
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "hint_color", typeHelper5, function14, expression6);
            Expression expression7 = expressionResolveOptionalExpression11 == null ? expression6 : expressionResolveOptionalExpression11;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, foVar.f87594u, jSONObject, "hint_text", typeHelper3);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, foVar.f87595v, jSONObject, "id");
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, foVar.f87596w, jSONObject, "layout_provider", this.f86305a.R4(), this.f86305a.P4());
            Field field7 = foVar.f87597x;
            Expression expression8 = ao.f86281g;
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "letter_spacing", typeHelper, function1, expression8);
            Expression expression9 = expressionResolveOptionalExpression13 == null ? expression8 : expressionResolveOptionalExpression13;
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, foVar.f87598y, jSONObject, "line_height", typeHelper2, function12, ao.f86294t);
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, foVar.f87599z, jSONObject, "margins", this.f86305a.a3(), this.f86305a.Y2());
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, foVar.A, jSONObject, "options", this.f86305a.I6(), this.f86305a.G6(), ao.f86295u);
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, foVar.B, jSONObject, "paddings", this.f86305a.a3(), this.f86305a.Y2());
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, foVar.C, jSONObject, "reuse_id", typeHelper3);
            Expression expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, foVar.D, jSONObject, "row_span", typeHelper2, function12, ao.f86296v);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.E, jSONObject, "selected_actions", this.f86305a.w0(), this.f86305a.u0());
            Field field8 = foVar.F;
            Expression expression10 = ao.f86282h;
            Expression expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "text_color", typeHelper5, function14, expression10);
            Expression expression11 = expressionResolveOptionalExpression17 == null ? expression10 : expressionResolveOptionalExpression17;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.G, jSONObject, "tooltips", this.f86305a.R8(), this.f86305a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, foVar.H, jSONObject, "transform", this.f86305a.d9(), this.f86305a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, foVar.I, jSONObject, "transition_change", this.f86305a.W1(), this.f86305a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, foVar.J, jSONObject, "transition_in", this.f86305a.B1(), this.f86305a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, foVar.K, jSONObject, "transition_out", this.f86305a.B1(), this.f86305a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.L, jSONObject, "transition_triggers", aw.f86414e, ao.f86297w);
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, foVar.M, jSONObject, "value_variable");
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.N, jSONObject, "variable_triggers", this.f86305a.g9(), this.f86305a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.O, jSONObject, "variables", this.f86305a.m9(), this.f86305a.k9());
            Field field9 = foVar.P;
            TypeHelper typeHelper6 = ao.f86289o;
            Function1 function15 = gx.f87924e;
            Expression expression12 = ao.f86283i;
            Expression expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper6, function15, expression12);
            if (expressionResolveOptionalExpression18 != null) {
                expression12 = expressionResolveOptionalExpression18;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, foVar.Q, jSONObject, "visibility_action", this.f86305a.y9(), this.f86305a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, foVar.R, jSONObject, "visibility_actions", this.f86305a.y9(), this.f86305a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, foVar.S, jSONObject, "width", this.f86305a.a7(), this.f86305a.Y6());
            if (epVar3 == null) {
                epVar3 = ao.f86284j;
            }
            return new rn(g1Var, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList, listResolveOptionalList2, l7Var, expressionResolveOptionalExpression4, listResolveOptionalList3, listResolveOptionalList4, bdVar, expressionResolveOptionalExpression5, expression3, expression5, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, expressionResolveOptionalExpression10, listResolveOptionalList5, epVar2, expression7, expressionResolveOptionalExpression12, str, zhVar, expression9, expressionResolveOptionalExpression14, hbVar, listResolveList, hbVar2, expressionResolveOptionalExpression15, expressionResolveOptionalExpression16, listResolveOptionalList6, expression11, listResolveOptionalList7, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList8, str2, listResolveOptionalList9, listResolveOptionalList10, expression12, hxVar, listResolveOptionalList11, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f86276b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f86277c = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        jp jpVar = jp.SP;
        f86278d = Expression.Companion.constant$default(companion, jpVar, null, 2, null);
        int i10 = 7;
        DefaultConstructorMarker defaultConstructorMarker = null;
        kp kpVar = null;
        f86279e = new ep.e(new nx(null, kpVar, null, i10, defaultConstructorMarker));
        f86280f = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f86281g = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f86282h = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        gx gxVar = gx.VISIBLE;
        f86283i = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f86284j = new ep.d(new ni(0 == true ? 1 : 0, kpVar, 0 == true ? 1 : 0, i10, defaultConstructorMarker));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f86285k = companion2.from(ArraysKt.first(y5.values()), a.f86298f);
        f86286l = companion2.from(ArraysKt.first(z5.values()), b.f86299f);
        f86287m = companion2.from(jpVar, c.f86300f);
        f86288n = companion2.from(ArraysKt.first(jd.values()), d.f86301f);
        f86289o = companion2.from(gxVar, e.f86302f);
        f86290p = new ValueValidator() { // from class: k8.sn
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ao.i(((Double) obj).doubleValue());
            }
        };
        f86291q = new ValueValidator() { // from class: k8.tn
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ao.j(((Long) obj).longValue());
            }
        };
        f86292r = new ValueValidator() { // from class: k8.un
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ao.k(((Long) obj).longValue());
            }
        };
        f86293s = new ValueValidator() { // from class: k8.vn
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ao.l(((Long) obj).longValue());
            }
        };
        f86294t = new ValueValidator() { // from class: k8.wn
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ao.m(((Long) obj).longValue());
            }
        };
        f86295u = new ListValidator() { // from class: k8.xn
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return ao.n(list);
            }
        };
        f86296v = new ValueValidator() { // from class: k8.yn
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ao.o(((Long) obj).longValue());
            }
        };
        f86297w = new ListValidator() { // from class: k8.zn
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return ao.p(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
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
        return j10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(List list) {
        return list.size() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(List list) {
        return list.size() >= 1;
    }
}
