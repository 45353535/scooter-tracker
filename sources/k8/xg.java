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
import k8.yf;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xg {
    public static final TypeHelper A;
    public static final ValueValidator B;
    public static final ValueValidator C;
    public static final ValueValidator D;
    public static final ValueValidator E;
    public static final ValueValidator F;
    public static final ValueValidator G;
    public static final ValueValidator H;
    public static final ValueValidator I;
    public static final ListValidator J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f92360a = new k(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f92361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f92362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f92363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f92364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f92365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ep.e f92366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f92367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression f92368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression f92369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression f92370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression f92371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression f92372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression f92373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Expression f92374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Expression f92375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ep.d f92376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final TypeHelper f92377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final TypeHelper f92378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TypeHelper f92379t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final TypeHelper f92380u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final TypeHelper f92381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final TypeHelper f92382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final TypeHelper f92383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final TypeHelper f92384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final TypeHelper f92385z;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92386f = new a();

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
        public static final b f92387f = new b();

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
        public static final c f92388f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof yf.a);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f92389f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof yf.d);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f92390f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jp);
        }
    }

    static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f92391f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jd);
        }
    }

    static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f92392f = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof yf.e);
        }
    }

    static final class h extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h f92393f = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof y5);
        }
    }

    static final class i extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final i f92394f = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof z5);
        }
    }

    static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final j f92395f = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof gx);
        }
    }

    private static final class k {
        public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private k() {
        }
    }

    public static final class l implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92396a;

        public l(my myVar) {
            this.f92396a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public yf deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f92396a.H());
            TypeHelper typeHelper = xg.f92377r;
            Function1 function1 = y5.f92620e;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = xg.f92378s;
            Function1 function12 = z5.f92903e;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = xg.B;
            Expression expression = xg.f92361b;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            Expression expression2 = optionalExpression3 == null ? expression : optionalExpression3;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f92396a.t1());
            TypeHelper typeHelper4 = xg.f92379t;
            Function1 function14 = yf.a.f92696e;
            Expression expression3 = xg.f92362c;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autocapitalization", typeHelper4, function14, expression3);
            Expression expression4 = optionalExpression4 == null ? expression3 : optionalExpression4;
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f92396a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f92396a.L1());
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function15, xg.C);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f92396a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "enter_key_actions", this.f92396a.u0());
            TypeHelper typeHelper6 = xg.f92380u;
            Function1 function16 = yf.d.f92709e;
            Expression expression5 = xg.f92363d;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "enter_key_type", typeHelper6, function16, expression5);
            Expression expression6 = optionalExpression6 == null ? expression5 : optionalExpression6;
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f92396a.b3());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.f92396a.m4());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f92396a.z3());
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
            ValueValidator valueValidator2 = xg.D;
            Expression expression7 = xg.f92364e;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper5, function15, valueValidator2, expression7);
            if (optionalExpression8 != null) {
                expression7 = optionalExpression8;
            }
            TypeHelper typeHelper8 = xg.f92381v;
            Function1 function17 = jp.f88507e;
            Expression expression8 = xg.f92365f;
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper8, function17, expression8);
            Expression expression9 = optionalExpression9 == null ? expression8 : optionalExpression9;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, xg.f92382w, jd.f88380e);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, function15, xg.E);
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f92396a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f92396a.Y6());
            if (epVar == null) {
                epVar = xg.f92366g;
            }
            ep epVar2 = epVar;
            TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function18 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "highlight_color", typeHelper9, function18);
            Expression expression10 = xg.f92367h;
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper9, function18, expression10);
            Expression expression11 = optionalExpression14 == null ? expression10 : optionalExpression14;
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper7);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper10 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function19 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression12 = xg.f92368i;
            Expression optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper10, function19, expression12);
            Expression expression13 = optionalExpression16 == null ? expression12 : optionalExpression16;
            TypeHelper typeHelper11 = xg.f92383x;
            Function1 function110 = yf.e.f92721e;
            Expression expression14 = xg.f92369j;
            Expression optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "keyboard_type", typeHelper11, function110, expression14);
            Expression expression15 = optionalExpression17 == null ? expression14 : optionalExpression17;
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f92396a.P4());
            Expression expression16 = xg.f92370k;
            Expression optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, function13, expression16);
            Expression expression17 = optionalExpression18 == null ? expression16 : optionalExpression18;
            Expression optionalExpression19 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, function15, xg.F);
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f92396a.Y2());
            yg ygVar = (yg) JsonPropertyParser.readOptional(parsingContext, jSONObject, "mask", this.f92396a.v4());
            Expression optionalExpression20 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_length", typeHelper5, function15, xg.G);
            Expression optionalExpression21 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_lines", typeHelper5, function15, xg.H);
            yf.f fVar = (yf.f) JsonPropertyParser.readOptional(parsingContext, jSONObject, "native_interface", this.f92396a.y4());
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f92396a.Y2());
            Expression optionalExpression22 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
            Expression optionalExpression23 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function15, xg.I);
            Expression expression18 = xg.f92371l;
            Expression optionalExpression24 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "select_all_on_focus", typeHelper10, function19, expression18);
            Expression expression19 = optionalExpression24 == null ? expression18 : optionalExpression24;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f92396a.u0());
            TypeHelper typeHelper12 = xg.f92384y;
            Expression expression20 = xg.f92372m;
            Expression optionalExpression25 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", typeHelper12, function1, expression20);
            Expression expression21 = optionalExpression25 == null ? expression20 : optionalExpression25;
            TypeHelper typeHelper13 = xg.f92385z;
            Expression expression22 = xg.f92373n;
            Expression optionalExpression26 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", typeHelper13, function12, expression22);
            Expression expression23 = optionalExpression26 == null ? expression22 : optionalExpression26;
            Expression expression24 = xg.f92374o;
            Expression optionalExpression27 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper9, function18, expression24);
            Expression expression25 = optionalExpression27 == null ? expression24 : optionalExpression27;
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "text_variable");
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f92396a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f92396a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f92396a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f92396a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f92396a.z1());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, xg.J);
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "validators", this.f92396a.G4());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f92396a.e9());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f92396a.k9());
            TypeHelper typeHelper14 = xg.A;
            Function1 function111 = gx.f87924e;
            Expression expression26 = xg.f92375p;
            Expression optionalExpression28 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper14, function111, expression26);
            if (optionalExpression28 != null) {
                expression26 = optionalExpression28;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f92396a.w9());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f92396a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f92396a.Y6());
            if (epVar3 == null) {
                epVar3 = xg.f92376q;
            }
            return new yf(g1Var, optionalExpression, optionalExpression2, expression2, optionalList, expression4, optionalList2, l7Var, optionalExpression5, optionalList3, optionalList4, expression6, optionalList5, optionalList6, bdVar, optionalExpression7, expression7, expression9, optionalExpression10, optionalExpression11, optionalExpression12, optionalList7, epVar2, optionalExpression13, expression11, optionalExpression15, str, expression13, expression15, zhVar, expression17, optionalExpression19, hbVar, ygVar, optionalExpression20, optionalExpression21, fVar, hbVar2, optionalExpression22, optionalExpression23, expression19, optionalList8, expression21, expression23, expression25, str2, optionalList9, wvVar, y7Var, r6Var, r6Var2, optionalList10, optionalList11, optionalList12, optionalList13, expression26, hxVar, optionalList14, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, yf yfVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", yfVar.o(), this.f92396a.H());
            Expression expressionG = yfVar.g();
            Function1 function1 = y5.f92619d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, function1);
            Expression expressionM = yfVar.m();
            Function1 function12 = z5.f92902d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionM, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", yfVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", yfVar.w(), this.f92396a.t1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "autocapitalization", yfVar.f92670f, yf.a.f92695d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, yfVar.getBackground(), this.f92396a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, yfVar.x(), this.f92396a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", yfVar.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", yfVar.k(), this.f92396a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "enter_key_actions", yfVar.f92678k, this.f92396a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "enter_key_type", yfVar.f92679l, yf.d.f92708d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", yfVar.getExtensions(), this.f92396a.b3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", yfVar.f92681n, this.f92396a.m4());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", yfVar.n(), this.f92396a.z3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", yfVar.f92683p);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", yfVar.f92684q);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", yfVar.f92685r, jp.f88506d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, yfVar.f92686s);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, yfVar.f92687t, jd.f88379d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", yfVar.f92688u);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", yfVar.u(), this.f92396a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", yfVar.getHeight(), this.f92396a.Y6());
            Expression expression = yfVar.f92691x;
            Function1<Integer, String> function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "highlight_color", expression, function13);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_color", yfVar.f92692y, function13);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_text", yfVar.f92693z);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", yfVar.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", yfVar.B);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "keyboard_type", yfVar.C, yf.e.f92720d);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", yfVar.r(), this.f92396a.P4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", yfVar.E);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", yfVar.F);
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", yfVar.d(), this.f92396a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "mask", yfVar.H, this.f92396a.v4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_length", yfVar.I);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_visible_lines", yfVar.J);
            JsonPropertyParser.write(parsingContext, jSONObject, "native_interface", yfVar.K, this.f92396a.y4());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", yfVar.p(), this.f92396a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", yfVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", yfVar.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "select_all_on_focus", yfVar.O);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", yfVar.q(), this.f92396a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_horizontal", yfVar.Q, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_vertical", yfVar.R, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", yfVar.S, function13);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_variable", yfVar.T);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", yfVar.h(), this.f92396a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", yfVar.getTransform(), this.f92396a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", yfVar.j(), this.f92396a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", yfVar.v(), this.f92396a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", yfVar.i(), this.f92396a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", yfVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "input");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "validators", yfVar.f92661a0, this.f92396a.G4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", yfVar.s(), this.f92396a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", yfVar.c(), this.f92396a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", yfVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", yfVar.t(), this.f92396a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", yfVar.a(), this.f92396a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", yfVar.getWidth(), this.f92396a.Y6());
            return jSONObject;
        }
    }

    public static final class m implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92397a;

        public m(my myVar) {
            this.f92397a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hh deserialize(ParsingContext parsingContext, hh hhVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, hhVar != null ? hhVar.f88031a : null, this.f92397a.I());
            TypeHelper typeHelper = xg.f92377r;
            Field field = hhVar != null ? hhVar.f88033b : null;
            Function1 function1 = y5.f92620e;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper typeHelper2 = xg.f92378s;
            Field field2 = hhVar != null ? hhVar.f88035c : null;
            Function1 function12 = z5.f92903e;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field3 = hhVar != null ? hhVar.f88037d : null;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper3, allowPropertyOverride, field3, function13, xg.B);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, hhVar != null ? hhVar.f88039e : null, this.f92397a.u1());
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "autocapitalization", xg.f92379t, allowPropertyOverride, hhVar != null ? hhVar.f88041f : null, yf.a.f92696e);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, hhVar != null ? hhVar.f88043g : null, this.f92397a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, hhVar != null ? hhVar.f88045h : null, this.f92397a.M1());
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field4 = hhVar != null ? hhVar.f88046i : null;
            Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, function14, xg.C);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, hhVar != null ? hhVar.f88047j : null, this.f92397a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "enter_key_actions", allowPropertyOverride, hhVar != null ? hhVar.f88048k : null, this.f92397a.v0());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "enter_key_type", xg.f92380u, allowPropertyOverride, hhVar != null ? hhVar.f88049l : null, yf.d.f92709e);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, hhVar != null ? hhVar.f88050m : null, this.f92397a.c3());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, hhVar != null ? hhVar.f88051n : null, this.f92397a.n4());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, hhVar != null ? hhVar.f88052o : null, this.f92397a.A3());
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper5, allowPropertyOverride, hhVar != null ? hhVar.f88053p : null);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper4, allowPropertyOverride, hhVar != null ? hhVar.f88054q : null, function14, xg.D);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", xg.f92381v, allowPropertyOverride, hhVar != null ? hhVar.f88055r : null, jp.f88507e);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, hhVar != null ? hhVar.f88056s : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, xg.f92382w, allowPropertyOverride, hhVar != null ? hhVar.f88057t : null, jd.f88380e);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper4, allowPropertyOverride, hhVar != null ? hhVar.f88058u : null, function14, xg.E);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, hhVar != null ? hhVar.f88059v : null, this.f92397a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, hhVar != null ? hhVar.f88060w : null, this.f92397a.Z6());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field5 = hhVar != null ? hhVar.f88061x : null;
            Function1<Object, Integer> function15 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "highlight_color", typeHelper6, allowPropertyOverride, field5, function15);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_color", typeHelper6, allowPropertyOverride, hhVar != null ? hhVar.f88062y : null, function15);
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_text", typeHelper5, allowPropertyOverride, hhVar != null ? hhVar.f88063z : null);
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, hhVar != null ? hhVar.A : null);
            TypeHelper<Boolean> typeHelper7 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field6 = hhVar != null ? hhVar.B : null;
            Function1<Object, Boolean> function16 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", typeHelper7, allowPropertyOverride, field6, function16);
            Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "keyboard_type", xg.f92383x, allowPropertyOverride, hhVar != null ? hhVar.C : null, yf.e.f92721e);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, hhVar != null ? hhVar.D : null, this.f92397a.Q4());
            Field optionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, hhVar != null ? hhVar.E : null, function13);
            Field optionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, hhVar != null ? hhVar.F : null, function14, xg.F);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, hhVar != null ? hhVar.G : null, this.f92397a.Z2());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, hhVar != null ? hhVar.H : null, this.f92397a.w4());
            Field optionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_length", typeHelper4, allowPropertyOverride, hhVar != null ? hhVar.I : null, function14, xg.G);
            Field optionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_visible_lines", typeHelper4, allowPropertyOverride, hhVar != null ? hhVar.J : null, function14, xg.H);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "native_interface", allowPropertyOverride, hhVar != null ? hhVar.K : null, this.f92397a.z4());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, hhVar != null ? hhVar.L : null, this.f92397a.Z2());
            Field optionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, hhVar != null ? hhVar.M : null);
            Field optionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, hhVar != null ? hhVar.N : null, function14, xg.I);
            Field optionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "select_all_on_focus", typeHelper7, allowPropertyOverride, hhVar != null ? hhVar.O : null, function16);
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, hhVar != null ? hhVar.P : null, this.f92397a.v0());
            Field optionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_horizontal", xg.f92384y, allowPropertyOverride, hhVar != null ? hhVar.Q : null, function1);
            Field optionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_vertical", xg.f92385z, allowPropertyOverride, hhVar != null ? hhVar.R : null, function12);
            Field optionalFieldWithExpression27 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, hhVar != null ? hhVar.S : null, function15);
            Field field7 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "text_variable", allowPropertyOverride, hhVar != null ? hhVar.T : null);
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, hhVar != null ? hhVar.U : null, this.f92397a.Q8());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, hhVar != null ? hhVar.V : null, this.f92397a.c9());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, hhVar != null ? hhVar.W : null, this.f92397a.V1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, hhVar != null ? hhVar.X : null, this.f92397a.A1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, hhVar != null ? hhVar.Y : null, this.f92397a.A1());
            Field field8 = hhVar != null ? hhVar.Z : null;
            Function1 function17 = aw.f86414e;
            ListValidator listValidator = xg.J;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new hh(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalFieldWithExpression4, optionalListField2, optionalField2, optionalFieldWithExpression5, optionalListField3, optionalListField4, optionalFieldWithExpression6, optionalListField5, optionalListField6, optionalField3, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField7, optionalField4, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalFieldWithExpression15, optionalField5, optionalFieldWithExpression16, optionalFieldWithExpression17, optionalField6, optionalFieldWithExpression18, optionalFieldWithExpression19, optionalField7, optionalField8, optionalFieldWithExpression20, optionalFieldWithExpression21, optionalField9, optionalField10, optionalFieldWithExpression22, optionalFieldWithExpression23, optionalFieldWithExpression24, optionalListField8, optionalFieldWithExpression25, optionalFieldWithExpression26, optionalFieldWithExpression27, field7, optionalListField9, optionalField11, optionalField12, optionalField13, optionalField14, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field8, function17, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "validators", allowPropertyOverride, hhVar != null ? hhVar.f88032a0 : null, this.f92397a.H4()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, hhVar != null ? hhVar.f88034b0 : null, this.f92397a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, hhVar != null ? hhVar.f88036c0 : null, this.f92397a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", xg.A, allowPropertyOverride, hhVar != null ? hhVar.f88038d0 : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, hhVar != null ? hhVar.f88040e0 : null, this.f92397a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, hhVar != null ? hhVar.f88042f0 : null, this.f92397a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, hhVar != null ? hhVar.f88044g0 : null, this.f92397a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, hh hhVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", hhVar.f88031a, this.f92397a.I());
            Field field = hhVar.f88033b;
            Function1 function1 = y5.f92619d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = hhVar.f88035c;
            Function1 function12 = z5.f92902d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", hhVar.f88037d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", hhVar.f88039e, this.f92397a.u1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "autocapitalization", hhVar.f88041f, yf.a.f92695d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, hhVar.f88043g, this.f92397a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, hhVar.f88045h, this.f92397a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", hhVar.f88046i);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", hhVar.f88047j, this.f92397a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "enter_key_actions", hhVar.f88048k, this.f92397a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "enter_key_type", hhVar.f88049l, yf.d.f92708d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", hhVar.f88050m, this.f92397a.c3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", hhVar.f88051n, this.f92397a.n4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", hhVar.f88052o, this.f92397a.A3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", hhVar.f88053p);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", hhVar.f88054q);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", hhVar.f88055r, jp.f88506d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, hhVar.f88056s);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, hhVar.f88057t, jd.f88379d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", hhVar.f88058u);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", hhVar.f88059v, this.f92397a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", hhVar.f88060w, this.f92397a.Z6());
            Field field3 = hhVar.f88061x;
            Function1<Integer, String> function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "highlight_color", field3, function13);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_color", hhVar.f88062y, function13);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_text", hhVar.f88063z);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", hhVar.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", hhVar.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "keyboard_type", hhVar.C, yf.e.f92720d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", hhVar.D, this.f92397a.Q4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", hhVar.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", hhVar.F);
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", hhVar.G, this.f92397a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "mask", hhVar.H, this.f92397a.w4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_length", hhVar.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_visible_lines", hhVar.J);
            JsonFieldParser.writeField(parsingContext, jSONObject, "native_interface", hhVar.K, this.f92397a.z4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", hhVar.L, this.f92397a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", hhVar.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", hhVar.N);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "select_all_on_focus", hhVar.O);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", hhVar.P, this.f92397a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_horizontal", hhVar.Q, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_vertical", hhVar.R, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", hhVar.S, function13);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_variable", hhVar.T);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", hhVar.U, this.f92397a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", hhVar.V, this.f92397a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", hhVar.W, this.f92397a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", hhVar.X, this.f92397a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", hhVar.Y, this.f92397a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", hhVar.Z, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "input");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "validators", hhVar.f88032a0, this.f92397a.H4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", hhVar.f88034b0, this.f92397a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", hhVar.f88036c0, this.f92397a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", hhVar.f88038d0, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", hhVar.f88040e0, this.f92397a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", hhVar.f88042f0, this.f92397a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", hhVar.f88044g0, this.f92397a.Z6());
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

    public static final class n implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92398a;

        public n(my myVar) {
            this.f92398a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public yf resolve(ParsingContext parsingContext, hh hhVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, hhVar.f88031a, jSONObject, "accessibility", this.f92398a.J(), this.f92398a.H());
            Field field = hhVar.f88033b;
            TypeHelper typeHelper = xg.f92377r;
            Function1 function1 = y5.f92620e;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, function1);
            Field field2 = hhVar.f88035c;
            TypeHelper typeHelper2 = xg.f92378s;
            Function1 function12 = z5.f92903e;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, function12);
            Field field3 = hhVar.f88037d;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = xg.B;
            Expression expression = xg.f92361b;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            Expression expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88039e, jSONObject, "animators", this.f92398a.v1(), this.f92398a.t1());
            Field field4 = hhVar.f88041f;
            TypeHelper typeHelper4 = xg.f92379t;
            Function1 function14 = yf.a.f92696e;
            Expression expression3 = xg.f92362c;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "autocapitalization", typeHelper4, function14, expression3);
            Expression expression4 = expressionResolveOptionalExpression4 == null ? expression3 : expressionResolveOptionalExpression4;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88043g, jSONObject, H2.f75840g, this.f92398a.H1(), this.f92398a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, hhVar.f88045h, jSONObject, OutlinedTextFieldKt.BorderId, this.f92398a.N1(), this.f92398a.L1());
            Field field5 = hhVar.f88046i;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, function15, xg.C);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88047j, jSONObject, "disappear_actions", this.f92398a.R2(), this.f92398a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88048k, jSONObject, "enter_key_actions", this.f92398a.w0(), this.f92398a.u0());
            Field field6 = hhVar.f88049l;
            TypeHelper typeHelper6 = xg.f92380u;
            Function1 function16 = yf.d.f92709e;
            Expression expression5 = xg.f92363d;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "enter_key_type", typeHelper6, function16, expression5);
            Expression expression6 = expressionResolveOptionalExpression6 == null ? expression5 : expressionResolveOptionalExpression6;
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88050m, jSONObject, "extensions", this.f92398a.d3(), this.f92398a.b3());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88051n, jSONObject, "filters", this.f92398a.o4(), this.f92398a.m4());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, hhVar.f88052o, jSONObject, "focus", this.f92398a.B3(), this.f92398a.z3());
            Field field7 = hhVar.f88053p;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "font_family", typeHelper7);
            Field field8 = hhVar.f88054q;
            ValueValidator valueValidator2 = xg.D;
            Expression expression7 = xg.f92364e;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_size", typeHelper5, function15, valueValidator2, expression7);
            if (expressionResolveOptionalExpression8 != null) {
                expression7 = expressionResolveOptionalExpression8;
            }
            Field field9 = hhVar.f88055r;
            TypeHelper typeHelper8 = xg.f92381v;
            Function1 function17 = jp.f88507e;
            Expression expression8 = xg.f92365f;
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "font_size_unit", typeHelper8, function17, expression8);
            Expression expression9 = expressionResolveOptionalExpression9 == null ? expression8 : expressionResolveOptionalExpression9;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, hhVar.f88056s, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, hhVar.f88057t, jSONObject, FontsContractCompat.Columns.WEIGHT, xg.f92382w, jd.f88380e);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, hhVar.f88058u, jSONObject, "font_weight_value", typeHelper5, function15, xg.E);
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88059v, jSONObject, "functions", this.f92398a.K3(), this.f92398a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, hhVar.f88060w, jSONObject, "height", this.f92398a.a7(), this.f92398a.Y6());
            if (epVar == null) {
                epVar = xg.f92366g;
            }
            ep epVar2 = epVar;
            Field field10 = hhVar.f88061x;
            TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function18 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "highlight_color", typeHelper9, function18);
            Field field11 = hhVar.f88062y;
            Expression expression10 = xg.f92367h;
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "hint_color", typeHelper9, function18, expression10);
            Expression expression11 = expressionResolveOptionalExpression14 == null ? expression10 : expressionResolveOptionalExpression14;
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, hhVar.f88063z, jSONObject, "hint_text", typeHelper7);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, hhVar.A, jSONObject, "id");
            Field field12 = hhVar.B;
            TypeHelper<Boolean> typeHelper10 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function19 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression12 = xg.f92368i;
            Expression expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "is_enabled", typeHelper10, function19, expression12);
            Expression expression13 = expressionResolveOptionalExpression16 == null ? expression12 : expressionResolveOptionalExpression16;
            Field field13 = hhVar.C;
            TypeHelper typeHelper11 = xg.f92383x;
            Function1 function110 = yf.e.f92721e;
            Expression expression14 = xg.f92369j;
            Expression expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "keyboard_type", typeHelper11, function110, expression14);
            Expression expression15 = expressionResolveOptionalExpression17 == null ? expression14 : expressionResolveOptionalExpression17;
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, hhVar.D, jSONObject, "layout_provider", this.f92398a.R4(), this.f92398a.P4());
            Field field14 = hhVar.E;
            Expression expression16 = xg.f92370k;
            Expression expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "letter_spacing", typeHelper3, function13, expression16);
            Expression expression17 = expressionResolveOptionalExpression18 == null ? expression16 : expressionResolveOptionalExpression18;
            Expression expressionResolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(parsingContext, hhVar.F, jSONObject, "line_height", typeHelper5, function15, xg.F);
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, hhVar.G, jSONObject, "margins", this.f92398a.a3(), this.f92398a.Y2());
            yg ygVar = (yg) JsonFieldResolver.resolveOptional(parsingContext, hhVar.H, jSONObject, "mask", this.f92398a.x4(), this.f92398a.v4());
            Expression expressionResolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(parsingContext, hhVar.I, jSONObject, "max_length", typeHelper5, function15, xg.G);
            Expression expressionResolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(parsingContext, hhVar.J, jSONObject, "max_visible_lines", typeHelper5, function15, xg.H);
            yf.f fVar = (yf.f) JsonFieldResolver.resolveOptional(parsingContext, hhVar.K, jSONObject, "native_interface", this.f92398a.A4(), this.f92398a.y4());
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, hhVar.L, jSONObject, "paddings", this.f92398a.a3(), this.f92398a.Y2());
            Expression expressionResolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(parsingContext, hhVar.M, jSONObject, "reuse_id", typeHelper7);
            Expression expressionResolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(parsingContext, hhVar.N, jSONObject, "row_span", typeHelper5, function15, xg.I);
            Field field15 = hhVar.O;
            Expression expression18 = xg.f92371l;
            Expression expressionResolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "select_all_on_focus", typeHelper10, function19, expression18);
            Expression expression19 = expressionResolveOptionalExpression24 == null ? expression18 : expressionResolveOptionalExpression24;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.P, jSONObject, "selected_actions", this.f92398a.w0(), this.f92398a.u0());
            Field field16 = hhVar.Q;
            TypeHelper typeHelper12 = xg.f92384y;
            Expression expression20 = xg.f92372m;
            Expression expressionResolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field16, jSONObject, "text_alignment_horizontal", typeHelper12, function1, expression20);
            Expression expression21 = expressionResolveOptionalExpression25 == null ? expression20 : expressionResolveOptionalExpression25;
            Field field17 = hhVar.R;
            TypeHelper typeHelper13 = xg.f92385z;
            Expression expression22 = xg.f92373n;
            Expression expressionResolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject, "text_alignment_vertical", typeHelper13, function12, expression22);
            Expression expression23 = expressionResolveOptionalExpression26 == null ? expression22 : expressionResolveOptionalExpression26;
            Field field18 = hhVar.S;
            Expression expression24 = xg.f92374o;
            Expression expressionResolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field18, jSONObject, "text_color", typeHelper9, function18, expression24);
            Expression expression25 = expressionResolveOptionalExpression27 == null ? expression24 : expressionResolveOptionalExpression27;
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, hhVar.T, jSONObject, "text_variable");
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.U, jSONObject, "tooltips", this.f92398a.R8(), this.f92398a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, hhVar.V, jSONObject, "transform", this.f92398a.d9(), this.f92398a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, hhVar.W, jSONObject, "transition_change", this.f92398a.W1(), this.f92398a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, hhVar.X, jSONObject, "transition_in", this.f92398a.B1(), this.f92398a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, hhVar.Y, jSONObject, "transition_out", this.f92398a.B1(), this.f92398a.z1());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.Z, jSONObject, "transition_triggers", aw.f86414e, xg.J);
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88032a0, jSONObject, "validators", this.f92398a.I4(), this.f92398a.G4());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88034b0, jSONObject, "variable_triggers", this.f92398a.g9(), this.f92398a.e9());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88036c0, jSONObject, "variables", this.f92398a.m9(), this.f92398a.k9());
            Field field19 = hhVar.f88038d0;
            TypeHelper typeHelper14 = xg.A;
            Function1 function111 = gx.f87924e;
            Expression expression26 = xg.f92375p;
            Expression expressionResolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field19, jSONObject, "visibility", typeHelper14, function111, expression26);
            if (expressionResolveOptionalExpression28 != null) {
                expression26 = expressionResolveOptionalExpression28;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, hhVar.f88040e0, jSONObject, "visibility_action", this.f92398a.y9(), this.f92398a.w9());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, hhVar.f88042f0, jSONObject, "visibility_actions", this.f92398a.y9(), this.f92398a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, hhVar.f88044g0, jSONObject, "width", this.f92398a.a7(), this.f92398a.Y6());
            if (epVar3 == null) {
                epVar3 = xg.f92376q;
            }
            return new yf(g1Var, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList, expression4, listResolveOptionalList2, l7Var, expressionResolveOptionalExpression5, listResolveOptionalList3, listResolveOptionalList4, expression6, listResolveOptionalList5, listResolveOptionalList6, bdVar, expressionResolveOptionalExpression7, expression7, expression9, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, listResolveOptionalList7, epVar2, expressionResolveOptionalExpression13, expression11, expressionResolveOptionalExpression15, str, expression13, expression15, zhVar, expression17, expressionResolveOptionalExpression19, hbVar, ygVar, expressionResolveOptionalExpression20, expressionResolveOptionalExpression21, fVar, hbVar2, expressionResolveOptionalExpression22, expressionResolveOptionalExpression23, expression19, listResolveOptionalList8, expression21, expression23, expression25, str2, listResolveOptionalList9, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList10, listResolveOptionalList11, listResolveOptionalList12, listResolveOptionalList13, expression26, hxVar, listResolveOptionalList14, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92361b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        yf.a aVar = yf.a.AUTO;
        f92362c = Expression.Companion.constant$default(companion, aVar, null, 2, null);
        yf.d dVar = yf.d.DEFAULT;
        f92363d = Expression.Companion.constant$default(companion, dVar, null, 2, null);
        f92364e = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        jp jpVar = jp.SP;
        f92365f = Expression.Companion.constant$default(companion, jpVar, null, 2, null);
        f92366g = new ep.e(new nx(null, null, null, 7, null));
        f92367h = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f92368i = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        yf.e eVar = yf.e.MULTI_LINE_TEXT;
        f92369j = Expression.Companion.constant$default(companion, eVar, null, 2, null);
        f92370k = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f92371l = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        y5 y5Var = y5.START;
        f92372m = Expression.Companion.constant$default(companion, y5Var, null, 2, null);
        z5 z5Var = z5.CENTER;
        f92373n = Expression.Companion.constant$default(companion, z5Var, null, 2, null);
        f92374o = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        gx gxVar = gx.VISIBLE;
        f92375p = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f92376q = new ep.d(new ni(null, 0 == true ? 1 : 0, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f92377r = companion2.from(ArraysKt.first(y5.values()), a.f92386f);
        f92378s = companion2.from(ArraysKt.first(z5.values()), b.f92387f);
        f92379t = companion2.from(aVar, c.f92388f);
        f92380u = companion2.from(dVar, d.f92389f);
        f92381v = companion2.from(jpVar, e.f92390f);
        f92382w = companion2.from(ArraysKt.first(jd.values()), f.f92391f);
        f92383x = companion2.from(eVar, g.f92392f);
        f92384y = companion2.from(y5Var, h.f92393f);
        f92385z = companion2.from(z5Var, i.f92394f);
        A = companion2.from(gxVar, j.f92395f);
        B = new ValueValidator() { // from class: k8.og
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return xg.j(((Double) obj).doubleValue());
            }
        };
        C = new ValueValidator() { // from class: k8.pg
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return xg.k(((Long) obj).longValue());
            }
        };
        D = new ValueValidator() { // from class: k8.qg
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return xg.l(((Long) obj).longValue());
            }
        };
        E = new ValueValidator() { // from class: k8.rg
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return xg.m(((Long) obj).longValue());
            }
        };
        F = new ValueValidator() { // from class: k8.sg
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return xg.n(((Long) obj).longValue());
            }
        };
        G = new ValueValidator() { // from class: k8.tg
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return xg.o(((Long) obj).longValue());
            }
        };
        H = new ValueValidator() { // from class: k8.ug
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return xg.p(((Long) obj).longValue());
            }
        };
        I = new ValueValidator() { // from class: k8.vg
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return xg.q(((Long) obj).longValue());
            }
        };
        J = new ListValidator() { // from class: k8.wg
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return xg.r(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(long j10) {
        return j10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(long j10) {
        return j10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(long j10) {
        return j10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(List list) {
        return list.size() >= 1;
    }
}
