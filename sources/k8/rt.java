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
import k8.a6;
import k8.ep;
import k8.us;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class rt {
    public static final TypeHelper A;
    public static final TypeHelper B;
    public static final ValueValidator C;
    public static final ValueValidator D;
    public static final ValueValidator E;
    public static final ValueValidator F;
    public static final ValueValidator G;
    public static final ValueValidator H;
    public static final ValueValidator I;
    public static final ValueValidator J;
    public static final ListValidator K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f90874a = new k(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a6 f90875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f90878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f90879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ep.e f90880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f90881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression f90882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression f90883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression f90884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression f90885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression f90886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression f90887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Expression f90888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Expression f90889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Expression f90890q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ep.d f90891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final TypeHelper f90892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TypeHelper f90893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final TypeHelper f90894u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final TypeHelper f90895v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final TypeHelper f90896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final TypeHelper f90897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final TypeHelper f90898y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final TypeHelper f90899z;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90900f = new a();

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
        public static final b f90901f = new b();

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
        public static final c f90902f = new c();

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
        public static final d f90903f = new d();

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
        public static final e f90904f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ei);
        }
    }

    static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f90905f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof y5);
        }
    }

    static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f90906f = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof z5);
        }
    }

    static final class h extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h f90907f = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof us.f);
        }
    }

    static final class i extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final i f90908f = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ei);
        }
    }

    static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final j f90909f = new j();

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
        private final my f90910a;

        public l(my myVar) {
            this.f90910a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public us deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f90910a.H());
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f90910a.u0());
            a6 a6Var = (a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f90910a.q1());
            if (a6Var == null) {
                a6Var = rt.f90875b;
            }
            a6 a6Var2 = a6Var;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f90910a.u0());
            TypeHelper typeHelper = rt.f90892s;
            Function1 function1 = y5.f92620e;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = rt.f90893t;
            Function1 function12 = z5.f92903e;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = rt.C;
            Expression expression = rt.f90876c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            Expression expression2 = optionalExpression3 == null ? expression : optionalExpression3;
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f90910a.t1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "auto_ellipsize", typeHelper4, function14);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f90910a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f90910a.L1());
            Expression expression3 = rt.f90877d;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression3);
            Expression expression4 = optionalExpression5 == null ? expression3 : optionalExpression5;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function15, rt.D);
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f90910a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f90910a.u0());
            us.c cVar = (us.c) JsonPropertyParser.readOptional(parsingContext, jSONObject, "ellipsis", this.f90910a.d8());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f90910a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f90910a.z3());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "focused_text_color", typeHelper6, function16);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper7);
            ValueValidator valueValidator2 = rt.E;
            Expression expression5 = rt.f90878e;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper5, function15, valueValidator2, expression5);
            if (optionalExpression10 != null) {
                expression5 = optionalExpression10;
            }
            TypeHelper typeHelper8 = rt.f90894u;
            Function1 function17 = jp.f88507e;
            Expression expression6 = rt.f90879f;
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper8, function17, expression6);
            Expression expression7 = optionalExpression11 == null ? expression6 : optionalExpression11;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, rt.f90895v, jd.f88380e);
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, function15, rt.F);
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f90910a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f90910a.Y6());
            if (epVar == null) {
                epVar = rt.f90880g;
            }
            ep epVar2 = epVar;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f90910a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f90910a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "images", this.f90910a.m8());
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f90910a.P4());
            Expression expression8 = rt.f90881h;
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, function13, expression8);
            Expression expression9 = optionalExpression15 == null ? expression8 : optionalExpression15;
            Expression optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, function15, rt.G);
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f90910a.u0());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f90910a.Y2());
            Expression optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_lines", typeHelper5, function15, rt.H);
            Expression optionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "min_hidden_lines", typeHelper5, function15, rt.I);
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f90910a.Y2());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f90910a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f90910a.u0());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.f90910a.y8());
            Expression optionalExpression19 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
            Expression optionalExpression20 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function15, rt.J);
            Expression expression10 = rt.f90882i;
            Expression optionalExpression21 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selectable", typeHelper4, function14, expression10);
            Expression expression11 = optionalExpression21 == null ? expression10 : optionalExpression21;
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f90910a.u0());
            TypeHelper typeHelper9 = rt.f90896w;
            Function1 function18 = ei.f87313e;
            Expression expression12 = rt.f90883j;
            Expression optionalExpression22 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper9, function18, expression12);
            Expression expression13 = optionalExpression22 == null ? expression12 : optionalExpression22;
            Expression expression14 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", typeHelper7);
            TypeHelper typeHelper10 = rt.f90897x;
            Expression expression15 = rt.f90884k;
            Expression optionalExpression23 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", typeHelper10, function1, expression15);
            Expression expression16 = optionalExpression23 == null ? expression15 : optionalExpression23;
            TypeHelper typeHelper11 = rt.f90898y;
            Expression expression17 = rt.f90885l;
            Expression optionalExpression24 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", typeHelper11, function12, expression17);
            Expression expression18 = optionalExpression24 == null ? expression17 : optionalExpression24;
            Expression expression19 = rt.f90886m;
            Expression optionalExpression25 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper6, function16, expression19);
            Expression expression20 = optionalExpression25 == null ? expression19 : optionalExpression25;
            zs zsVar = (zs) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_gradient", this.f90910a.g8());
            oo ooVar = (oo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_shadow", this.f90910a.P6());
            Expression expression21 = rt.f90887n;
            Expression optionalExpression26 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tighten_width", typeHelper4, function14, expression21);
            Expression expression22 = optionalExpression26 == null ? expression21 : optionalExpression26;
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f90910a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f90910a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f90910a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f90910a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f90910a.z1());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, rt.K);
            TypeHelper typeHelper12 = rt.f90899z;
            Function1 function19 = us.f.f91847e;
            Expression expression23 = rt.f90888o;
            Expression optionalExpression27 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "truncate", typeHelper12, function19, expression23);
            Expression expression24 = optionalExpression27 == null ? expression23 : optionalExpression27;
            TypeHelper typeHelper13 = rt.A;
            Expression expression25 = rt.f90889p;
            Expression optionalExpression28 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "underline", typeHelper13, function18, expression25);
            Expression expression26 = optionalExpression28 == null ? expression25 : optionalExpression28;
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f90910a.e9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f90910a.k9());
            TypeHelper typeHelper14 = rt.B;
            Function1 function110 = gx.f87924e;
            Expression expression27 = rt.f90890q;
            Expression optionalExpression29 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper14, function110, expression27);
            if (optionalExpression29 != null) {
                expression27 = optionalExpression29;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f90910a.w9());
            List optionalList20 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f90910a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f90910a.Y6());
            if (epVar3 == null) {
                epVar3 = rt.f90891r;
            }
            return new us(g1Var, j1Var, a6Var2, optionalList, optionalExpression, optionalExpression2, expression2, optionalList2, optionalExpression4, optionalList3, l7Var, expression4, optionalExpression6, optionalList4, optionalList5, cVar, optionalList6, bdVar, optionalExpression7, optionalExpression8, optionalExpression9, expression5, expression7, optionalExpression12, optionalExpression13, optionalExpression14, optionalList7, epVar2, optionalList8, optionalList9, str, optionalList10, zhVar, expression9, optionalExpression16, optionalList11, hbVar, optionalExpression17, optionalExpression18, hbVar2, optionalList12, optionalList13, optionalList14, optionalExpression19, optionalExpression20, expression11, optionalList15, expression13, expression14, expression16, expression18, expression20, zsVar, ooVar, expression22, optionalList16, wvVar, y7Var, r6Var, r6Var2, optionalList17, expression24, expression26, optionalList18, optionalList19, expression27, hxVar, optionalList20, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, us usVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", usVar.o(), this.f90910a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", usVar.f91719b, this.f90910a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", usVar.f91721c, this.f90910a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", usVar.f91723d, this.f90910a.u0());
            Expression expressionG = usVar.g();
            Function1 function1 = y5.f92619d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, function1);
            Expression expressionM = usVar.m();
            Function1 function12 = z5.f92902d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionM, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", usVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", usVar.w(), this.f90910a.t1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "auto_ellipsize", usVar.f91733i);
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, usVar.getBackground(), this.f90910a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, usVar.x(), this.f90910a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", usVar.f91739l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", usVar.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", usVar.k(), this.f90910a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", usVar.f91745o, this.f90910a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "ellipsis", usVar.f91747p, this.f90910a.d8());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", usVar.getExtensions(), this.f90910a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", usVar.n(), this.f90910a.z3());
            Expression expression = usVar.f91753s;
            Function1<Integer, String> function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "focused_text_color", expression, function13);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", usVar.f91754t);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_feature_settings", usVar.f91755u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", usVar.f91756v);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", usVar.f91757w, jp.f88506d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, usVar.f91758x);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, usVar.f91759y, jd.f88379d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", usVar.f91760z);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", usVar.u(), this.f90910a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", usVar.getHeight(), this.f90910a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", usVar.C, this.f90910a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", usVar.D, this.f90910a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", usVar.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "images", usVar.F, this.f90910a.m8());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", usVar.r(), this.f90910a.P4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", usVar.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", usVar.I);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", usVar.J, this.f90910a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", usVar.d(), this.f90910a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_lines", usVar.L);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "min_hidden_lines", usVar.M);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", usVar.p(), this.f90910a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", usVar.O, this.f90910a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", usVar.P, this.f90910a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", usVar.Q, this.f90910a.y8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", usVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", usVar.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selectable", usVar.T);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", usVar.q(), this.f90910a.u0());
            Expression expression2 = usVar.V;
            Function1 function14 = ei.f87312d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "strike", expression2, function14);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", usVar.W);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_horizontal", usVar.X, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_vertical", usVar.Y, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", usVar.Z, function13);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_gradient", usVar.f91718a0, this.f90910a.g8());
            JsonPropertyParser.write(parsingContext, jSONObject, "text_shadow", usVar.f91720b0, this.f90910a.P6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tighten_width", usVar.f91722c0);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", usVar.h(), this.f90910a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", usVar.getTransform(), this.f90910a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", usVar.j(), this.f90910a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", usVar.v(), this.f90910a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", usVar.i(), this.f90910a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", usVar.l(), aw.f86413d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "truncate", usVar.f91736j0, us.f.f91846d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "underline", usVar.f91738k0, function14);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", usVar.s(), this.f90910a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", usVar.c(), this.f90910a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", usVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", usVar.t(), this.f90910a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", usVar.a(), this.f90910a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", usVar.getWidth(), this.f90910a.Y6());
            return jSONObject;
        }
    }

    public static final class m implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90911a;

        public m(my myVar) {
            this.f90911a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xu deserialize(ParsingContext parsingContext, xu xuVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, xuVar != null ? xuVar.f92428a : null, this.f90911a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, xuVar != null ? xuVar.f92430b : null, this.f90911a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, xuVar != null ? xuVar.f92432c : null, this.f90911a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, xuVar != null ? xuVar.f92434d : null, this.f90911a.v0());
            TypeHelper typeHelper = rt.f90892s;
            Field field = xuVar != null ? xuVar.f92436e : null;
            Function1 function1 = y5.f92620e;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper typeHelper2 = rt.f90893t;
            Field field2 = xuVar != null ? xuVar.f92438f : null;
            Function1 function12 = z5.f92903e;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field3 = xuVar != null ? xuVar.f92440g : null;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper3, allowPropertyOverride, field3, function13, rt.C);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, xuVar != null ? xuVar.f92442h : null, this.f90911a.u1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field4 = xuVar != null ? xuVar.f92444i : null;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "auto_ellipsize", typeHelper4, allowPropertyOverride, field4, function14);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, xuVar != null ? xuVar.f92446j : null, this.f90911a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, xuVar != null ? xuVar.f92448k : null, this.f90911a.M1());
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper4, allowPropertyOverride, xuVar != null ? xuVar.f92450l : null, function14);
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field5 = xuVar != null ? xuVar.f92452m : null;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper5, allowPropertyOverride, field5, function15, rt.D);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, xuVar != null ? xuVar.f92454n : null, this.f90911a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, xuVar != null ? xuVar.f92456o : null, this.f90911a.v0());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "ellipsis", allowPropertyOverride, xuVar != null ? xuVar.f92458p : null, this.f90911a.e8());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, xuVar != null ? xuVar.f92460q : null, this.f90911a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, xuVar != null ? xuVar.f92462r : null, this.f90911a.A3());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field6 = xuVar != null ? xuVar.f92463s : null;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "focused_text_color", typeHelper6, allowPropertyOverride, field6, function16);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper7, allowPropertyOverride, xuVar != null ? xuVar.f92464t : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper7, allowPropertyOverride, xuVar != null ? xuVar.f92465u : null);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper5, allowPropertyOverride, xuVar != null ? xuVar.f92466v : null, function15, rt.E);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", rt.f90894u, allowPropertyOverride, xuVar != null ? xuVar.f92467w : null, jp.f88507e);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, xuVar != null ? xuVar.f92468x : null);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, rt.f90895v, allowPropertyOverride, xuVar != null ? xuVar.f92469y : null, jd.f88380e);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper5, allowPropertyOverride, xuVar != null ? xuVar.f92470z : null, function15, rt.F);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, xuVar != null ? xuVar.A : null, this.f90911a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, xuVar != null ? xuVar.B : null, this.f90911a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, xuVar != null ? xuVar.C : null, this.f90911a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, xuVar != null ? xuVar.D : null, this.f90911a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, xuVar != null ? xuVar.E : null);
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "images", allowPropertyOverride, xuVar != null ? xuVar.F : null, this.f90911a.n8());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, xuVar != null ? xuVar.G : null, this.f90911a.Q4());
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, xuVar != null ? xuVar.H : null, function13);
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper5, allowPropertyOverride, xuVar != null ? xuVar.I : null, function15, rt.G);
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, xuVar != null ? xuVar.J : null, this.f90911a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, xuVar != null ? xuVar.K : null, this.f90911a.Z2());
            Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_lines", typeHelper5, allowPropertyOverride, xuVar != null ? xuVar.L : null, function15, rt.H);
            Field optionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "min_hidden_lines", typeHelper5, allowPropertyOverride, xuVar != null ? xuVar.M : null, function15, rt.I);
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, xuVar != null ? xuVar.N : null, this.f90911a.Z2());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, xuVar != null ? xuVar.O : null, this.f90911a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, xuVar != null ? xuVar.P : null, this.f90911a.v0());
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, xuVar != null ? xuVar.Q : null, this.f90911a.z8());
            Field optionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper7, allowPropertyOverride, xuVar != null ? xuVar.R : null);
            Field optionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper5, allowPropertyOverride, xuVar != null ? xuVar.S : null, function15, rt.J);
            Field optionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selectable", typeHelper4, allowPropertyOverride, xuVar != null ? xuVar.T : null, function14);
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, xuVar != null ? xuVar.U : null, this.f90911a.v0());
            TypeHelper typeHelper8 = rt.f90896w;
            Field field7 = xuVar != null ? xuVar.V : null;
            Function1 function17 = ei.f87313e;
            Field optionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "strike", typeHelper8, allowPropertyOverride, field7, function17);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", typeHelper7, allowPropertyOverride, xuVar != null ? xuVar.W : null);
            Field optionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_horizontal", rt.f90897x, allowPropertyOverride, xuVar != null ? xuVar.X : null, function1);
            Field optionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_vertical", rt.f90898y, allowPropertyOverride, xuVar != null ? xuVar.Y : null, function12);
            Field optionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, xuVar != null ? xuVar.Z : null, function16);
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_gradient", allowPropertyOverride, xuVar != null ? xuVar.f92429a0 : null, this.f90911a.h8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, xuVar != null ? xuVar.f92431b0 : null, this.f90911a.Q6());
            Field optionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tighten_width", typeHelper4, allowPropertyOverride, xuVar != null ? xuVar.f92433c0 : null, function14);
            Field optionalListField16 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, xuVar != null ? xuVar.f92435d0 : null, this.f90911a.Q8());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, xuVar != null ? xuVar.f92437e0 : null, this.f90911a.c9());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, xuVar != null ? xuVar.f92439f0 : null, this.f90911a.V1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, xuVar != null ? xuVar.f92441g0 : null, this.f90911a.A1());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, xuVar != null ? xuVar.f92443h0 : null, this.f90911a.A1());
            Field field8 = xuVar != null ? xuVar.f92445i0 : null;
            Function1 function18 = aw.f86414e;
            ListValidator listValidator = rt.K;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new xu(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalFieldWithExpression4, optionalListField3, optionalField4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField4, optionalListField5, optionalField5, optionalListField6, optionalField6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalListField10, optionalField9, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField11, optionalField10, optionalFieldWithExpression17, optionalFieldWithExpression18, optionalField11, optionalListField12, optionalListField13, optionalListField14, optionalFieldWithExpression19, optionalFieldWithExpression20, optionalFieldWithExpression21, optionalListField15, optionalFieldWithExpression22, fieldWithExpression, optionalFieldWithExpression23, optionalFieldWithExpression24, optionalFieldWithExpression25, optionalField12, optionalField13, optionalFieldWithExpression26, optionalListField16, optionalField14, optionalField15, optionalField16, optionalField17, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field8, function18, listValidator), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "truncate", rt.f90899z, allowPropertyOverride, xuVar != null ? xuVar.f92447j0 : null, us.f.f91847e), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "underline", rt.A, allowPropertyOverride, xuVar != null ? xuVar.f92449k0 : null, function17), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, xuVar != null ? xuVar.f92451l0 : null, this.f90911a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, xuVar != null ? xuVar.f92453m0 : null, this.f90911a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", rt.B, allowPropertyOverride, xuVar != null ? xuVar.f92455n0 : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, xuVar != null ? xuVar.f92457o0 : null, this.f90911a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, xuVar != null ? xuVar.f92459p0 : null, this.f90911a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, xuVar != null ? xuVar.f92461q0 : null, this.f90911a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, xu xuVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", xuVar.f92428a, this.f90911a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", xuVar.f92430b, this.f90911a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", xuVar.f92432c, this.f90911a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", xuVar.f92434d, this.f90911a.v0());
            Field field = xuVar.f92436e;
            Function1 function1 = y5.f92619d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = xuVar.f92438f;
            Function1 function12 = z5.f92902d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", xuVar.f92440g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", xuVar.f92442h, this.f90911a.u1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "auto_ellipsize", xuVar.f92444i);
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, xuVar.f92446j, this.f90911a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, xuVar.f92448k, this.f90911a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", xuVar.f92450l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", xuVar.f92452m);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", xuVar.f92454n, this.f90911a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", xuVar.f92456o, this.f90911a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "ellipsis", xuVar.f92458p, this.f90911a.e8());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", xuVar.f92460q, this.f90911a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", xuVar.f92462r, this.f90911a.A3());
            Field field3 = xuVar.f92463s;
            Function1<Integer, String> function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "focused_text_color", field3, function13);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", xuVar.f92464t);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_feature_settings", xuVar.f92465u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", xuVar.f92466v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", xuVar.f92467w, jp.f88506d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, xuVar.f92468x);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, xuVar.f92469y, jd.f88379d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", xuVar.f92470z);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", xuVar.A, this.f90911a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", xuVar.B, this.f90911a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", xuVar.C, this.f90911a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", xuVar.D, this.f90911a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", xuVar.E);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "images", xuVar.F, this.f90911a.n8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", xuVar.G, this.f90911a.Q4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", xuVar.H);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", xuVar.I);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", xuVar.J, this.f90911a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", xuVar.K, this.f90911a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_lines", xuVar.L);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "min_hidden_lines", xuVar.M);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", xuVar.N, this.f90911a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", xuVar.O, this.f90911a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", xuVar.P, this.f90911a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", xuVar.Q, this.f90911a.z8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", xuVar.R);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", xuVar.S);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selectable", xuVar.T);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", xuVar.U, this.f90911a.v0());
            Field field4 = xuVar.V;
            Function1 function14 = ei.f87312d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "strike", field4, function14);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", xuVar.W);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_horizontal", xuVar.X, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_vertical", xuVar.Y, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", xuVar.Z, function13);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_gradient", xuVar.f92429a0, this.f90911a.h8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_shadow", xuVar.f92431b0, this.f90911a.Q6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tighten_width", xuVar.f92433c0);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", xuVar.f92435d0, this.f90911a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", xuVar.f92437e0, this.f90911a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", xuVar.f92439f0, this.f90911a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", xuVar.f92441g0, this.f90911a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", xuVar.f92443h0, this.f90911a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", xuVar.f92445i0, aw.f86413d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "truncate", xuVar.f92447j0, us.f.f91846d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "underline", xuVar.f92449k0, function14);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", xuVar.f92451l0, this.f90911a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", xuVar.f92453m0, this.f90911a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", xuVar.f92455n0, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", xuVar.f92457o0, this.f90911a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", xuVar.f92459p0, this.f90911a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", xuVar.f92461q0, this.f90911a.Z6());
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
        private final my f90912a;

        public n(my myVar) {
            this.f90912a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public us resolve(ParsingContext parsingContext, xu xuVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92428a, jSONObject, "accessibility", this.f90912a.J(), this.f90912a.H());
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92430b, jSONObject, "action", this.f90912a.w0(), this.f90912a.u0());
            a6 a6Var = (a6) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92432c, jSONObject, "action_animation", this.f90912a.s1(), this.f90912a.q1());
            if (a6Var == null) {
                a6Var = rt.f90875b;
            }
            a6 a6Var2 = a6Var;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92434d, jSONObject, "actions", this.f90912a.w0(), this.f90912a.u0());
            Field field = xuVar.f92436e;
            TypeHelper typeHelper = rt.f90892s;
            Function1 function1 = y5.f92620e;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, function1);
            Field field2 = xuVar.f92438f;
            TypeHelper typeHelper2 = rt.f90893t;
            Function1 function12 = z5.f92903e;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, function12);
            Field field3 = xuVar.f92440g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = rt.C;
            Expression expression = rt.f90876c;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            Expression expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92442h, jSONObject, "animators", this.f90912a.v1(), this.f90912a.t1());
            Field field4 = xuVar.f92444i;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "auto_ellipsize", typeHelper4, function14);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92446j, jSONObject, H2.f75840g, this.f90912a.H1(), this.f90912a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92448k, jSONObject, OutlinedTextFieldKt.BorderId, this.f90912a.N1(), this.f90912a.L1());
            Field field5 = xuVar.f92450l;
            Expression expression3 = rt.f90877d;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression3);
            Expression expression4 = expressionResolveOptionalExpression5 == null ? expression3 : expressionResolveOptionalExpression5;
            Field field6 = xuVar.f92452m;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "column_span", typeHelper5, function15, rt.D);
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92454n, jSONObject, "disappear_actions", this.f90912a.R2(), this.f90912a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92456o, jSONObject, "doubletap_actions", this.f90912a.w0(), this.f90912a.u0());
            us.c cVar = (us.c) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92458p, jSONObject, "ellipsis", this.f90912a.f8(), this.f90912a.d8());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92460q, jSONObject, "extensions", this.f90912a.d3(), this.f90912a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92462r, jSONObject, "focus", this.f90912a.B3(), this.f90912a.z3());
            Field field7 = xuVar.f92463s;
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "focused_text_color", typeHelper6, function16);
            Field field8 = xuVar.f92464t;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_family", typeHelper7);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, xuVar.f92465u, jSONObject, "font_feature_settings", typeHelper7);
            Field field9 = xuVar.f92466v;
            ValueValidator valueValidator2 = rt.E;
            Expression expression5 = rt.f90878e;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "font_size", typeHelper5, function15, valueValidator2, expression5);
            if (expressionResolveOptionalExpression10 != null) {
                expression5 = expressionResolveOptionalExpression10;
            }
            Field field10 = xuVar.f92467w;
            TypeHelper typeHelper8 = rt.f90894u;
            Function1 function17 = jp.f88507e;
            Expression expression6 = rt.f90879f;
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "font_size_unit", typeHelper8, function17, expression6);
            Expression expression7 = expressionResolveOptionalExpression11 == null ? expression6 : expressionResolveOptionalExpression11;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, xuVar.f92468x, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, xuVar.f92469y, jSONObject, FontsContractCompat.Columns.WEIGHT, rt.f90895v, jd.f88380e);
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, xuVar.f92470z, jSONObject, "font_weight_value", typeHelper5, function15, rt.F);
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.A, jSONObject, "functions", this.f90912a.K3(), this.f90912a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, xuVar.B, jSONObject, "height", this.f90912a.a7(), this.f90912a.Y6());
            if (epVar == null) {
                epVar = rt.f90880g;
            }
            ep epVar2 = epVar;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.C, jSONObject, "hover_end_actions", this.f90912a.w0(), this.f90912a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.D, jSONObject, "hover_start_actions", this.f90912a.w0(), this.f90912a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, xuVar.E, jSONObject, "id");
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.F, jSONObject, "images", this.f90912a.o8(), this.f90912a.m8());
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, xuVar.G, jSONObject, "layout_provider", this.f90912a.R4(), this.f90912a.P4());
            Field field11 = xuVar.H;
            Expression expression8 = rt.f90881h;
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "letter_spacing", typeHelper3, function13, expression8);
            Expression expression9 = expressionResolveOptionalExpression15 == null ? expression8 : expressionResolveOptionalExpression15;
            Expression expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, xuVar.I, jSONObject, "line_height", typeHelper5, function15, rt.G);
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.J, jSONObject, "longtap_actions", this.f90912a.w0(), this.f90912a.u0());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, xuVar.K, jSONObject, "margins", this.f90912a.a3(), this.f90912a.Y2());
            Expression expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, xuVar.L, jSONObject, "max_lines", typeHelper5, function15, rt.H);
            Expression expressionResolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, xuVar.M, jSONObject, "min_hidden_lines", typeHelper5, function15, rt.I);
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, xuVar.N, jSONObject, "paddings", this.f90912a.a3(), this.f90912a.Y2());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.O, jSONObject, "press_end_actions", this.f90912a.w0(), this.f90912a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.P, jSONObject, "press_start_actions", this.f90912a.w0(), this.f90912a.u0());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.Q, jSONObject, "ranges", this.f90912a.A8(), this.f90912a.y8());
            Expression expressionResolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(parsingContext, xuVar.R, jSONObject, "reuse_id", typeHelper7);
            Expression expressionResolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(parsingContext, xuVar.S, jSONObject, "row_span", typeHelper5, function15, rt.J);
            Field field12 = xuVar.T;
            Expression expression10 = rt.f90882i;
            Expression expressionResolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "selectable", typeHelper4, function14, expression10);
            Expression expression11 = expressionResolveOptionalExpression21 == null ? expression10 : expressionResolveOptionalExpression21;
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.U, jSONObject, "selected_actions", this.f90912a.w0(), this.f90912a.u0());
            Field field13 = xuVar.V;
            TypeHelper typeHelper9 = rt.f90896w;
            Function1 function18 = ei.f87313e;
            Expression expression12 = rt.f90883j;
            Expression expressionResolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "strike", typeHelper9, function18, expression12);
            Expression expression13 = expressionResolveOptionalExpression22 == null ? expression12 : expressionResolveOptionalExpression22;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, xuVar.W, jSONObject, "text", typeHelper7);
            Field field14 = xuVar.X;
            TypeHelper typeHelper10 = rt.f90897x;
            Expression expression14 = rt.f90884k;
            Expression expressionResolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "text_alignment_horizontal", typeHelper10, function1, expression14);
            Expression expression15 = expressionResolveOptionalExpression23 == null ? expression14 : expressionResolveOptionalExpression23;
            Field field15 = xuVar.Y;
            TypeHelper typeHelper11 = rt.f90898y;
            Expression expression16 = rt.f90885l;
            Expression expressionResolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "text_alignment_vertical", typeHelper11, function12, expression16);
            Expression expression17 = expressionResolveOptionalExpression24 == null ? expression16 : expressionResolveOptionalExpression24;
            Field field16 = xuVar.Z;
            Expression expression18 = rt.f90886m;
            Expression expressionResolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field16, jSONObject, "text_color", typeHelper6, function16, expression18);
            Expression expression19 = expressionResolveOptionalExpression25 == null ? expression18 : expressionResolveOptionalExpression25;
            zs zsVar = (zs) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92429a0, jSONObject, "text_gradient", this.f90912a.i8(), this.f90912a.g8());
            oo ooVar = (oo) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92431b0, jSONObject, "text_shadow", this.f90912a.R6(), this.f90912a.P6());
            Field field17 = xuVar.f92433c0;
            Expression expression20 = rt.f90887n;
            Expression expressionResolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject, "tighten_width", typeHelper4, function14, expression20);
            Expression expression21 = expressionResolveOptionalExpression26 == null ? expression20 : expressionResolveOptionalExpression26;
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92435d0, jSONObject, "tooltips", this.f90912a.R8(), this.f90912a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92437e0, jSONObject, "transform", this.f90912a.d9(), this.f90912a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92439f0, jSONObject, "transition_change", this.f90912a.W1(), this.f90912a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92441g0, jSONObject, "transition_in", this.f90912a.B1(), this.f90912a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92443h0, jSONObject, "transition_out", this.f90912a.B1(), this.f90912a.z1());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92445i0, jSONObject, "transition_triggers", aw.f86414e, rt.K);
            Field field18 = xuVar.f92447j0;
            TypeHelper typeHelper12 = rt.f90899z;
            Function1 function19 = us.f.f91847e;
            Expression expression22 = rt.f90888o;
            Expression expressionResolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field18, jSONObject, "truncate", typeHelper12, function19, expression22);
            Expression expression23 = expressionResolveOptionalExpression27 == null ? expression22 : expressionResolveOptionalExpression27;
            Field field19 = xuVar.f92449k0;
            TypeHelper typeHelper13 = rt.A;
            Expression expression24 = rt.f90889p;
            Expression expressionResolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field19, jSONObject, "underline", typeHelper13, function18, expression24);
            Expression expression25 = expressionResolveOptionalExpression28 == null ? expression24 : expressionResolveOptionalExpression28;
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92451l0, jSONObject, "variable_triggers", this.f90912a.g9(), this.f90912a.e9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92453m0, jSONObject, "variables", this.f90912a.m9(), this.f90912a.k9());
            Field field20 = xuVar.f92455n0;
            TypeHelper typeHelper14 = rt.B;
            Function1 function110 = gx.f87924e;
            Expression expression26 = rt.f90890q;
            Expression expressionResolveOptionalExpression29 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field20, jSONObject, "visibility", typeHelper14, function110, expression26);
            if (expressionResolveOptionalExpression29 != null) {
                expression26 = expressionResolveOptionalExpression29;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92457o0, jSONObject, "visibility_action", this.f90912a.y9(), this.f90912a.w9());
            List listResolveOptionalList20 = JsonFieldResolver.resolveOptionalList(parsingContext, xuVar.f92459p0, jSONObject, "visibility_actions", this.f90912a.y9(), this.f90912a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, xuVar.f92461q0, jSONObject, "width", this.f90912a.a7(), this.f90912a.Y6());
            if (epVar3 == null) {
                epVar3 = rt.f90891r;
            }
            return new us(g1Var, j1Var, a6Var2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, expressionResolveOptionalExpression4, listResolveOptionalList3, l7Var, expression4, expressionResolveOptionalExpression6, listResolveOptionalList4, listResolveOptionalList5, cVar, listResolveOptionalList6, bdVar, expressionResolveOptionalExpression7, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, expression5, expression7, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expressionResolveOptionalExpression14, listResolveOptionalList7, epVar2, listResolveOptionalList8, listResolveOptionalList9, str, listResolveOptionalList10, zhVar, expression9, expressionResolveOptionalExpression16, listResolveOptionalList11, hbVar, expressionResolveOptionalExpression17, expressionResolveOptionalExpression18, hbVar2, listResolveOptionalList12, listResolveOptionalList13, listResolveOptionalList14, expressionResolveOptionalExpression19, expressionResolveOptionalExpression20, expression11, listResolveOptionalList15, expression13, expressionResolveExpression, expression15, expression17, expression19, zsVar, ooVar, expression21, listResolveOptionalList16, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList17, expression23, expression25, listResolveOptionalList18, listResolveOptionalList19, expression26, hxVar, listResolveOptionalList20, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f90875b = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f90876c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f90877d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f90878e = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        jp jpVar = jp.SP;
        f90879f = Expression.Companion.constant$default(companion, jpVar, null, 2, null);
        f90880g = new ep.e(new nx(null, null, null, 7, null));
        f90881h = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        f90882i = Expression.Companion.constant$default(companion, bool, null, 2, null);
        ei eiVar = ei.NONE;
        f90883j = Expression.Companion.constant$default(companion, eiVar, null, 2, null);
        y5 y5Var = y5.START;
        f90884k = Expression.Companion.constant$default(companion, y5Var, null, 2, null);
        z5 z5Var = z5.TOP;
        f90885l = Expression.Companion.constant$default(companion, z5Var, null, 2, null);
        f90886m = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        f90887n = Expression.Companion.constant$default(companion, bool, null, 2, null);
        us.f fVar = us.f.END;
        f90888o = Expression.Companion.constant$default(companion, fVar, null, 2, null);
        f90889p = Expression.Companion.constant$default(companion, eiVar, null, 2, null);
        gx gxVar = gx.VISIBLE;
        f90890q = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f90891r = new ep.d(new ni(0 == true ? 1 : 0, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f90892s = companion2.from(ArraysKt.first(y5.values()), a.f90900f);
        f90893t = companion2.from(ArraysKt.first(z5.values()), b.f90901f);
        f90894u = companion2.from(jpVar, c.f90902f);
        f90895v = companion2.from(ArraysKt.first(jd.values()), d.f90903f);
        f90896w = companion2.from(eiVar, e.f90904f);
        f90897x = companion2.from(y5Var, f.f90905f);
        f90898y = companion2.from(z5Var, g.f90906f);
        f90899z = companion2.from(fVar, h.f90907f);
        A = companion2.from(eiVar, i.f90908f);
        B = companion2.from(gxVar, j.f90909f);
        C = new ValueValidator() { // from class: k8.ht
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rt.j(((Double) obj).doubleValue());
            }
        };
        D = new ValueValidator() { // from class: k8.jt
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rt.k(((Long) obj).longValue());
            }
        };
        E = new ValueValidator() { // from class: k8.kt
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rt.l(((Long) obj).longValue());
            }
        };
        F = new ValueValidator() { // from class: k8.lt
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rt.m(((Long) obj).longValue());
            }
        };
        G = new ValueValidator() { // from class: k8.mt
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rt.n(((Long) obj).longValue());
            }
        };
        H = new ValueValidator() { // from class: k8.nt
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rt.o(((Long) obj).longValue());
            }
        };
        I = new ValueValidator() { // from class: k8.ot
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rt.p(((Long) obj).longValue());
            }
        };
        J = new ValueValidator() { // from class: k8.pt
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rt.q(((Long) obj).longValue());
            }
        };
        K = new ListValidator() { // from class: k8.qt
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return rt.r(list);
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
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(long j10) {
        return j10 >= 0;
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
