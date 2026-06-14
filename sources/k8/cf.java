package k8;

import androidx.compose.material.OutlinedTextFieldKt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f86705a = new h(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a6 f86706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f86707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f86708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f86709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f86710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ep.e f86711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f86712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression f86713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression f86714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression f86715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression f86716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression f86717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ep.d f86718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TypeHelper f86719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TypeHelper f86720p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final TypeHelper f86721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final TypeHelper f86722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final TypeHelper f86723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TypeHelper f86724t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final TypeHelper f86725u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ValueValidator f86726v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ValueValidator f86727w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ValueValidator f86728x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ListValidator f86729y;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86730f = new a();

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
        public static final b f86731f = new b();

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
        public static final c f86732f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof y5);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f86733f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof z5);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f86734f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof df);
        }
    }

    static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f86735f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof g7);
        }
    }

    static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f86736f = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof gx);
        }
    }

    private static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private h() {
        }
    }

    public static final class i implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86737a;

        public i(my myVar) {
            this.f86737a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public te deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f86737a.H());
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f86737a.u0());
            a6 a6Var = (a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f86737a.q1());
            if (a6Var == null) {
                a6Var = cf.f86706b;
            }
            a6 a6Var2 = a6Var;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f86737a.u0());
            TypeHelper typeHelper = cf.f86719o;
            Function1 function1 = y5.f92620e;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = cf.f86720p;
            Function1 function12 = z5.f92903e;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = cf.f86726v;
            Expression expression = cf.f86707c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f86737a.t1());
            wb wbVar = (wb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "appearance_animation", this.f86737a.e3());
            w6 w6Var = (w6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.f86737a.C1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f86737a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f86737a.L1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = cf.f86708d;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function15, cf.f86727w);
            TypeHelper typeHelper6 = cf.f86721q;
            Expression expression4 = cf.f86709e;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = optionalExpression6 == null ? expression4 : optionalExpression6;
            TypeHelper typeHelper7 = cf.f86722r;
            Expression expression6 = cf.f86710f;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = optionalExpression7 == null ? expression6 : optionalExpression7;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f86737a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f86737a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f86737a.b3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.f86737a.h3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f86737a.z3());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f86737a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f86737a.Y6());
            if (epVar == null) {
                epVar = cf.f86711g;
            }
            ep epVar2 = epVar;
            Expression expression8 = cf.f86712h;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "high_priority_preview_show", typeHelper4, function14, expression8);
            Expression expression9 = optionalExpression8 == null ? expression8 : optionalExpression8;
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f86737a.u0());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f86737a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            Expression expression10 = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f86737a.P4());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f86737a.u0());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f86737a.Y2());
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f86737a.Y2());
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression11 = cf.f86713i;
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", typeHelper8, function16, expression11);
            Expression expression12 = optionalExpression9 == null ? expression11 : optionalExpression9;
            Expression expression13 = cf.f86714j;
            Expression expression14 = expression;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, function14, expression13);
            Expression expression15 = optionalExpression10 == null ? expression13 : optionalExpression10;
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f86737a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f86737a.u0());
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper9);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper9);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function15, cf.f86728x);
            TypeHelper typeHelper10 = cf.f86723s;
            Function1 function17 = df.f87029e;
            Expression expression16 = cf.f86715k;
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper10, function17, expression16);
            Expression expression17 = optionalExpression14 == null ? expression16 : optionalExpression14;
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f86737a.u0());
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_color", typeHelper8, function16);
            TypeHelper typeHelper11 = cf.f86724t;
            Function1 function18 = g7.f87760e;
            Expression expression18 = cf.f86716l;
            Expression optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_mode", typeHelper11, function18, expression18);
            Expression expression19 = optionalExpression16 == null ? expression18 : optionalExpression16;
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f86737a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f86737a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f86737a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f86737a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f86737a.z1());
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, cf.f86729y);
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f86737a.e9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f86737a.k9());
            TypeHelper typeHelper12 = cf.f86725u;
            Function1 function19 = gx.f87924e;
            Expression expression20 = cf.f86717m;
            Expression optionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper12, function19, expression20);
            if (optionalExpression17 != null) {
                expression20 = optionalExpression17;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f86737a.w9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f86737a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f86737a.Y6());
            if (epVar3 == null) {
                epVar3 = cf.f86718n;
            }
            return new te(g1Var, j1Var, a6Var2, optionalList, optionalExpression, optionalExpression2, expression14, optionalList2, wbVar, w6Var, optionalList3, l7Var, expression3, optionalExpression5, expression5, expression7, optionalList4, optionalList5, optionalList6, optionalList7, bdVar, optionalList8, epVar2, expression9, optionalList9, optionalList10, str, expression10, zhVar, optionalList11, hbVar, hbVar2, expression12, expression15, optionalList12, optionalList13, optionalExpression11, optionalExpression12, optionalExpression13, expression17, optionalList14, optionalExpression15, expression19, optionalList15, wvVar, y7Var, r6Var, r6Var2, optionalList16, optionalList17, optionalList18, expression20, hxVar, optionalList19, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, te teVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", teVar.o(), this.f86737a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", teVar.f91361b, this.f86737a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", teVar.f91363c, this.f86737a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", teVar.f91365d, this.f86737a.u0());
            Expression expressionG = teVar.g();
            Function1 function1 = y5.f92619d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, function1);
            Expression expressionM = teVar.m();
            Function1 function12 = z5.f92902d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionM, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", teVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", teVar.w(), this.f86737a.t1());
            JsonPropertyParser.write(parsingContext, jSONObject, "appearance_animation", teVar.f91371i, this.f86737a.e3());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", teVar.f91372j, this.f86737a.C1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, teVar.getBackground(), this.f86737a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, teVar.x(), this.f86737a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", teVar.f91375m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", teVar.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", teVar.f91377o, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", teVar.f91378p, function12);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", teVar.k(), this.f86737a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", teVar.f91380r, this.f86737a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", teVar.getExtensions(), this.f86737a.b3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", teVar.f91382t, this.f86737a.h3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", teVar.n(), this.f86737a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", teVar.u(), this.f86737a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", teVar.getHeight(), this.f86737a.Y6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "high_priority_preview_show", teVar.f91386x);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", teVar.f91387y, this.f86737a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", teVar.f91388z, this.f86737a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", teVar.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, teVar.B, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", teVar.r(), this.f86737a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", teVar.D, this.f86737a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", teVar.d(), this.f86737a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", teVar.p(), this.f86737a.Y2());
            Expression expression = teVar.G;
            Function1<Integer, String> function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder_color", expression, function13);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", teVar.H);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", teVar.I, this.f86737a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", teVar.J, this.f86737a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", teVar.K);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", teVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", teVar.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", teVar.N, df.f87028d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", teVar.q(), this.f86737a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_color", teVar.P, function13);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_mode", teVar.Q, g7.f87759d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", teVar.h(), this.f86737a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", teVar.getTransform(), this.f86737a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", teVar.j(), this.f86737a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", teVar.v(), this.f86737a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", teVar.i(), this.f86737a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", teVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", teVar.s(), this.f86737a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", teVar.c(), this.f86737a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", teVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", teVar.t(), this.f86737a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", teVar.a(), this.f86737a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", teVar.getWidth(), this.f86737a.Y6());
            return jSONObject;
        }
    }

    public static final class j implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86738a;

        public j(my myVar) {
            this.f86738a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ef deserialize(ParsingContext parsingContext, ef efVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, efVar != null ? efVar.f87276a : null, this.f86738a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, efVar != null ? efVar.f87278b : null, this.f86738a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, efVar != null ? efVar.f87280c : null, this.f86738a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, efVar != null ? efVar.f87282d : null, this.f86738a.v0());
            TypeHelper typeHelper = cf.f86719o;
            Field field = efVar != null ? efVar.f87283e : null;
            Function1 function1 = y5.f92620e;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper typeHelper2 = cf.f86720p;
            Field field2 = efVar != null ? efVar.f87284f : null;
            Function1 function12 = z5.f92903e;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, efVar != null ? efVar.f87285g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, cf.f86726v);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, efVar != null ? efVar.f87286h : null, this.f86738a.u1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "appearance_animation", allowPropertyOverride, efVar != null ? efVar.f87287i : null, this.f86738a.f3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, efVar != null ? efVar.f87288j : null, this.f86738a.D1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, efVar != null ? efVar.f87289k : null, this.f86738a.G1());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, efVar != null ? efVar.f87290l : null, this.f86738a.M1());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field3 = efVar != null ? efVar.f87291m : null;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field3, function13);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field4 = efVar != null ? efVar.f87292n : null;
            Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, function14, cf.f86727w);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", cf.f86721q, allowPropertyOverride, efVar != null ? efVar.f87293o : null, function1);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", cf.f86722r, allowPropertyOverride, efVar != null ? efVar.f87294p : null, function12);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, efVar != null ? efVar.f87295q : null, this.f86738a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, efVar != null ? efVar.f87296r : null, this.f86738a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, efVar != null ? efVar.f87297s : null, this.f86738a.c3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, efVar != null ? efVar.f87298t : null, this.f86738a.i3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, efVar != null ? efVar.f87299u : null, this.f86738a.A3());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, efVar != null ? efVar.f87300v : null, this.f86738a.J3());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, efVar != null ? efVar.f87301w : null, this.f86738a.Z6());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "high_priority_preview_show", typeHelper3, allowPropertyOverride, efVar != null ? efVar.f87302x : null, function13);
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, efVar != null ? efVar.f87303y : null, this.f86738a.v0());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, efVar != null ? efVar.f87304z : null, this.f86738a.v0());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, efVar != null ? efVar.A : null);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, efVar != null ? efVar.B : null, ParsingConvertersKt.ANY_TO_URI);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, efVar != null ? efVar.C : null, this.f86738a.Q4());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, efVar != null ? efVar.D : null, this.f86738a.v0());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, efVar != null ? efVar.E : null, this.f86738a.Z2());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, efVar != null ? efVar.F : null, this.f86738a.Z2());
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field5 = efVar != null ? efVar.G : null;
            Function1<Object, Integer> function15 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "placeholder_color", typeHelper5, allowPropertyOverride, field5, function15);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", typeHelper3, allowPropertyOverride, efVar != null ? efVar.H : null, function13);
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, efVar != null ? efVar.I : null, this.f86738a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, efVar != null ? efVar.J : null, this.f86738a.v0());
            TypeHelper<String> typeHelper6 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preview", typeHelper6, allowPropertyOverride, efVar != null ? efVar.K : null);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper6, allowPropertyOverride, efVar != null ? efVar.L : null);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, efVar != null ? efVar.M : null, function14, cf.f86728x);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", cf.f86723s, allowPropertyOverride, efVar != null ? efVar.N : null, df.f87029e);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, efVar != null ? efVar.O : null, this.f86738a.v0());
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tint_color", typeHelper5, allowPropertyOverride, efVar != null ? efVar.P : null, function15);
            Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tint_mode", cf.f86724t, allowPropertyOverride, efVar != null ? efVar.Q : null, g7.f87760e);
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, efVar != null ? efVar.R : null, this.f86738a.Q8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, efVar != null ? efVar.S : null, this.f86738a.c9());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, efVar != null ? efVar.T : null, this.f86738a.V1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, efVar != null ? efVar.U : null, this.f86738a.A1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, efVar != null ? efVar.V : null, this.f86738a.A1());
            Field field6 = efVar != null ? efVar.W : null;
            Function1 function16 = aw.f86414e;
            ListValidator listValidator = cf.f86729y;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new ef(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalField4, optionalField5, optionalListField3, optionalField6, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalListField5, optionalListField6, optionalListField7, optionalField7, optionalListField8, optionalField8, optionalFieldWithExpression8, optionalListField9, optionalListField10, optionalField9, fieldWithExpression, optionalField10, optionalListField11, optionalField11, optionalField12, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalListField12, optionalListField13, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalListField14, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField15, optionalField13, optionalField14, optionalField15, optionalField16, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field6, function16, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, efVar != null ? efVar.X : null, this.f86738a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, efVar != null ? efVar.Y : null, this.f86738a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", cf.f86725u, allowPropertyOverride, efVar != null ? efVar.Z : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, efVar != null ? efVar.f87277a0 : null, this.f86738a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, efVar != null ? efVar.f87279b0 : null, this.f86738a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, efVar != null ? efVar.f87281c0 : null, this.f86738a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ef efVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", efVar.f87276a, this.f86738a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", efVar.f87278b, this.f86738a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", efVar.f87280c, this.f86738a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", efVar.f87282d, this.f86738a.v0());
            Field field = efVar.f87283e;
            Function1 function1 = y5.f92619d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = efVar.f87284f;
            Function1 function12 = z5.f92902d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", efVar.f87285g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", efVar.f87286h, this.f86738a.u1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "appearance_animation", efVar.f87287i, this.f86738a.f3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", efVar.f87288j, this.f86738a.D1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, efVar.f87289k, this.f86738a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, efVar.f87290l, this.f86738a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", efVar.f87291m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", efVar.f87292n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", efVar.f87293o, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", efVar.f87294p, function12);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", efVar.f87295q, this.f86738a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", efVar.f87296r, this.f86738a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", efVar.f87297s, this.f86738a.c3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", efVar.f87298t, this.f86738a.i3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", efVar.f87299u, this.f86738a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", efVar.f87300v, this.f86738a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", efVar.f87301w, this.f86738a.Z6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "high_priority_preview_show", efVar.f87302x);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", efVar.f87303y, this.f86738a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", efVar.f87304z, this.f86738a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", efVar.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, efVar.B, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", efVar.C, this.f86738a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", efVar.D, this.f86738a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", efVar.E, this.f86738a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", efVar.F, this.f86738a.Z2());
            Field field3 = efVar.G;
            Function1<Integer, String> function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder_color", field3, function13);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", efVar.H);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", efVar.I, this.f86738a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", efVar.J, this.f86738a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", efVar.K);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", efVar.L);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", efVar.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", efVar.N, df.f87028d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", efVar.O, this.f86738a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_color", efVar.P, function13);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_mode", efVar.Q, g7.f87759d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", efVar.R, this.f86738a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", efVar.S, this.f86738a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", efVar.T, this.f86738a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", efVar.U, this.f86738a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", efVar.V, this.f86738a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", efVar.W, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", efVar.X, this.f86738a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", efVar.Y, this.f86738a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", efVar.Z, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", efVar.f87277a0, this.f86738a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", efVar.f87279b0, this.f86738a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", efVar.f87281c0, this.f86738a.Z6());
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

    public static final class k implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86739a;

        public k(my myVar) {
            this.f86739a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public te resolve(ParsingContext parsingContext, ef efVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, efVar.f87276a, jSONObject, "accessibility", this.f86739a.J(), this.f86739a.H());
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, efVar.f87278b, jSONObject, "action", this.f86739a.w0(), this.f86739a.u0());
            a6 a6Var = (a6) JsonFieldResolver.resolveOptional(parsingContext, efVar.f87280c, jSONObject, "action_animation", this.f86739a.s1(), this.f86739a.q1());
            if (a6Var == null) {
                a6Var = cf.f86706b;
            }
            a6 a6Var2 = a6Var;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87282d, jSONObject, "actions", this.f86739a.w0(), this.f86739a.u0());
            Field field = efVar.f87283e;
            TypeHelper typeHelper = cf.f86719o;
            Function1 function1 = y5.f92620e;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, function1);
            Field field2 = efVar.f87284f;
            TypeHelper typeHelper2 = cf.f86720p;
            Function1 function12 = z5.f92903e;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, function12);
            Field field3 = efVar.f87285g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = cf.f86726v;
            Expression expression = cf.f86707c;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87286h, jSONObject, "animators", this.f86739a.v1(), this.f86739a.t1());
            wb wbVar = (wb) JsonFieldResolver.resolveOptional(parsingContext, efVar.f87287i, jSONObject, "appearance_animation", this.f86739a.g3(), this.f86739a.e3());
            w6 w6Var = (w6) JsonFieldResolver.resolveOptional(parsingContext, efVar.f87288j, jSONObject, "aspect", this.f86739a.E1(), this.f86739a.C1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87289k, jSONObject, H2.f75840g, this.f86739a.H1(), this.f86739a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, efVar.f87290l, jSONObject, OutlinedTextFieldKt.BorderId, this.f86739a.N1(), this.f86739a.L1());
            Field field4 = efVar.f87291m;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = cf.f86708d;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = expressionResolveOptionalExpression4 == null ? expression2 : expressionResolveOptionalExpression4;
            Field field5 = efVar.f87292n;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, function15, cf.f86727w);
            Field field6 = efVar.f87293o;
            TypeHelper typeHelper6 = cf.f86721q;
            Expression expression4 = cf.f86709e;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = expressionResolveOptionalExpression6 == null ? expression4 : expressionResolveOptionalExpression6;
            Field field7 = efVar.f87294p;
            TypeHelper typeHelper7 = cf.f86722r;
            Expression expression6 = cf.f86710f;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = expressionResolveOptionalExpression7 == null ? expression6 : expressionResolveOptionalExpression7;
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87295q, jSONObject, "disappear_actions", this.f86739a.R2(), this.f86739a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87296r, jSONObject, "doubletap_actions", this.f86739a.w0(), this.f86739a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87297s, jSONObject, "extensions", this.f86739a.d3(), this.f86739a.b3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87298t, jSONObject, "filters", this.f86739a.j3(), this.f86739a.h3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, efVar.f87299u, jSONObject, "focus", this.f86739a.B3(), this.f86739a.z3());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87300v, jSONObject, "functions", this.f86739a.K3(), this.f86739a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, efVar.f87301w, jSONObject, "height", this.f86739a.a7(), this.f86739a.Y6());
            if (epVar == null) {
                epVar = cf.f86711g;
            }
            ep epVar2 = epVar;
            Field field8 = efVar.f87302x;
            Expression expression8 = cf.f86712h;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "high_priority_preview_show", typeHelper4, function14, expression8);
            Expression expression9 = expressionResolveOptionalExpression8 == null ? expression8 : expressionResolveOptionalExpression8;
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87303y, jSONObject, "hover_end_actions", this.f86739a.w0(), this.f86739a.u0());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87304z, jSONObject, "hover_start_actions", this.f86739a.w0(), this.f86739a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, efVar.A, jSONObject, "id");
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, efVar.B, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, efVar.C, jSONObject, "layout_provider", this.f86739a.R4(), this.f86739a.P4());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.D, jSONObject, "longtap_actions", this.f86739a.w0(), this.f86739a.u0());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, efVar.E, jSONObject, "margins", this.f86739a.a3(), this.f86739a.Y2());
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, efVar.F, jSONObject, "paddings", this.f86739a.a3(), this.f86739a.Y2());
            Field field9 = efVar.G;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression10 = cf.f86713i;
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "placeholder_color", typeHelper8, function16, expression10);
            Expression expression11 = expressionResolveOptionalExpression9 == null ? expression10 : expressionResolveOptionalExpression9;
            Field field10 = efVar.H;
            Expression expression12 = cf.f86714j;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "preload_required", typeHelper4, function14, expression12);
            Expression expression13 = expressionResolveOptionalExpression10 == null ? expression12 : expressionResolveOptionalExpression10;
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.I, jSONObject, "press_end_actions", this.f86739a.w0(), this.f86739a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.J, jSONObject, "press_start_actions", this.f86739a.w0(), this.f86739a.u0());
            Field field11 = efVar.K;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "preview", typeHelper9);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, efVar.L, jSONObject, "reuse_id", typeHelper9);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, efVar.M, jSONObject, "row_span", typeHelper5, function15, cf.f86728x);
            Field field12 = efVar.N;
            TypeHelper typeHelper10 = cf.f86723s;
            Function1 function17 = df.f87029e;
            Expression expression14 = cf.f86715k;
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "scale", typeHelper10, function17, expression14);
            Expression expression15 = expressionResolveOptionalExpression14 == null ? expression14 : expressionResolveOptionalExpression14;
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.O, jSONObject, "selected_actions", this.f86739a.w0(), this.f86739a.u0());
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, efVar.P, jSONObject, "tint_color", typeHelper8, function16);
            Field field13 = efVar.Q;
            TypeHelper typeHelper11 = cf.f86724t;
            Function1 function18 = g7.f87760e;
            Expression expression16 = cf.f86716l;
            Expression expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "tint_mode", typeHelper11, function18, expression16);
            Expression expression17 = expressionResolveOptionalExpression16 == null ? expression16 : expressionResolveOptionalExpression16;
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.R, jSONObject, "tooltips", this.f86739a.R8(), this.f86739a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, efVar.S, jSONObject, "transform", this.f86739a.d9(), this.f86739a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, efVar.T, jSONObject, "transition_change", this.f86739a.W1(), this.f86739a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, efVar.U, jSONObject, "transition_in", this.f86739a.B1(), this.f86739a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, efVar.V, jSONObject, "transition_out", this.f86739a.B1(), this.f86739a.z1());
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.W, jSONObject, "transition_triggers", aw.f86414e, cf.f86729y);
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.X, jSONObject, "variable_triggers", this.f86739a.g9(), this.f86739a.e9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.Y, jSONObject, "variables", this.f86739a.m9(), this.f86739a.k9());
            Field field14 = efVar.Z;
            TypeHelper typeHelper12 = cf.f86725u;
            Function1 function19 = gx.f87924e;
            Expression expression18 = cf.f86717m;
            Expression expressionResolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "visibility", typeHelper12, function19, expression18);
            if (expressionResolveOptionalExpression17 != null) {
                expression18 = expressionResolveOptionalExpression17;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, efVar.f87277a0, jSONObject, "visibility_action", this.f86739a.y9(), this.f86739a.w9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, efVar.f87279b0, jSONObject, "visibility_actions", this.f86739a.y9(), this.f86739a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, efVar.f87281c0, jSONObject, "width", this.f86739a.a7(), this.f86739a.Y6());
            if (epVar3 == null) {
                epVar3 = cf.f86718n;
            }
            return new te(g1Var, j1Var, a6Var2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList2, wbVar, w6Var, listResolveOptionalList3, l7Var, expression3, expressionResolveOptionalExpression5, expression5, expression7, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, listResolveOptionalList7, bdVar, listResolveOptionalList8, epVar2, expression9, listResolveOptionalList9, listResolveOptionalList10, str, expressionResolveExpression, zhVar, listResolveOptionalList11, hbVar, hbVar2, expression11, expression13, listResolveOptionalList12, listResolveOptionalList13, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expression15, listResolveOptionalList14, expressionResolveOptionalExpression15, expression17, listResolveOptionalList15, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList16, listResolveOptionalList17, listResolveOptionalList18, expression18, hxVar, listResolveOptionalList19, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        kp kpVar = null;
        f86706b = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f86707c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f86708d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        y5 y5Var = y5.CENTER;
        f86709e = Expression.Companion.constant$default(companion, y5Var, null, 2, null);
        z5 z5Var = z5.CENTER;
        f86710f = Expression.Companion.constant$default(companion, z5Var, null, 2, null);
        f86711g = new ep.e(new nx(null, null, kpVar, 7, null));
        Boolean bool = Boolean.FALSE;
        f86712h = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f86713i = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f86714j = Expression.Companion.constant$default(companion, bool, null, 2, null);
        df dfVar = df.FILL;
        f86715k = Expression.Companion.constant$default(companion, dfVar, null, 2, null);
        g7 g7Var = g7.SOURCE_IN;
        f86716l = Expression.Companion.constant$default(companion, g7Var, null, 2, null);
        gx gxVar = gx.VISIBLE;
        f86717m = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f86718n = new ep.d(new ni(kpVar, null, 0 == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f86719o = companion2.from(ArraysKt.first(y5.values()), a.f86730f);
        f86720p = companion2.from(ArraysKt.first(z5.values()), b.f86731f);
        f86721q = companion2.from(y5Var, c.f86732f);
        f86722r = companion2.from(z5Var, d.f86733f);
        f86723s = companion2.from(dfVar, e.f86734f);
        f86724t = companion2.from(g7Var, f.f86735f);
        f86725u = companion2.from(gxVar, g.f86736f);
        f86726v = new ValueValidator() { // from class: k8.ye
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return cf.e(((Double) obj).doubleValue());
            }
        };
        f86727w = new ValueValidator() { // from class: k8.ze
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return cf.f(((Long) obj).longValue());
            }
        };
        f86728x = new ValueValidator() { // from class: k8.af
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return cf.g(((Long) obj).longValue());
            }
        };
        f86729y = new ListValidator() { // from class: k8.bf
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return cf.h(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
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
    public static final boolean h(List list) {
        return list.size() >= 1;
    }
}
