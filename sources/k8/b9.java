package k8;

import androidx.compose.material.OutlinedTextFieldKt;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import k8.u8;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b9 {
    public static final ListValidator A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f86451a = new h(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a6 f86452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f86453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f86454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f86455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f86456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f86457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ep.e f86458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression f86459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression f86460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression f86461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression f86462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression f86463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ep.d f86464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TypeHelper f86465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TypeHelper f86466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final TypeHelper f86467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final TypeHelper f86468r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final TypeHelper f86469s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TypeHelper f86470t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final TypeHelper f86471u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ValueValidator f86472v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ValueValidator f86473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ValueValidator f86474x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ValueValidator f86475y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ValueValidator f86476z;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86477f = new a();

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
        public static final b f86478f = new b();

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
        public static final c f86479f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof e9);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f86480f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof f9);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f86481f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof u8.c);
        }
    }

    static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f86482f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof u8.d);
        }
    }

    static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f86483f = new g();

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
        private final my f86484a;

        public i(my myVar) {
            this.f86484a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u8 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f86484a.H());
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f86484a.u0());
            a6 a6Var = (a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f86484a.q1());
            if (a6Var == null) {
                a6Var = b9.f86452b;
            }
            a6 a6Var2 = a6Var;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f86484a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", b9.f86465o, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", b9.f86466p, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = b9.f86472v;
            Expression expression = b9.f86453c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = optionalExpression3 == null ? expression : optionalExpression3;
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f86484a.t1());
            w6 w6Var = (w6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.f86484a.C1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f86484a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f86484a.L1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = b9.f86454d;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, function12, expression3);
            Expression expression4 = optionalExpression4 == null ? expression3 : optionalExpression4;
            Expression expression5 = b9.f86455e;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper2, function12, expression5);
            Expression expression6 = optionalExpression5 == null ? expression5 : optionalExpression5;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, function13, b9.f86473w);
            TypeHelper typeHelper4 = b9.f86467q;
            Function1 function14 = e9.f87187e;
            Expression expression7 = b9.f86456f;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper4, function14, expression7);
            Expression expression8 = optionalExpression7 == null ? expression7 : optionalExpression7;
            TypeHelper typeHelper5 = b9.f86468r;
            Function1 function15 = f9.f87451e;
            Expression expression9 = b9.f86457g;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper5, function15, expression9);
            Expression expression10 = optionalExpression8 == null ? expression9 : optionalExpression8;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f86484a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f86484a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f86484a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f86484a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f86484a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f86484a.Y6());
            if (epVar == null) {
                epVar = b9.f86458h;
            }
            ep epVar2 = epVar;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f86484a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f86484a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            k8 k8Var = (k8) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", this.f86484a.d2());
            ValueValidator valueValidator2 = b9.f86474x;
            Expression expression11 = b9.f86459i;
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper3, function13, valueValidator2, expression11);
            Expression expression12 = optionalExpression9 == null ? expression11 : optionalExpression9;
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f86484a.M4());
            TypeHelper typeHelper6 = b9.f86469s;
            Function1 function16 = u8.c.f91620e;
            Expression expression13 = b9.f86460j;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "layout_mode", typeHelper6, function16, expression13);
            Expression expression14 = optionalExpression10 == null ? expression13 : optionalExpression10;
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f86484a.P4());
            u8.e eVar = (u8.e) JsonPropertyParser.readOptional(parsingContext, jSONObject, "line_separator", this.f86484a.p2());
            ValueValidator valueValidator3 = b9.f86475y;
            Expression expression15 = b9.f86461k;
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_spacing", typeHelper3, function13, valueValidator3, expression15);
            if (optionalExpression11 != null) {
                expression15 = optionalExpression11;
            }
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f86484a.u0());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f86484a.Y2());
            TypeHelper typeHelper7 = b9.f86470t;
            Function1 function17 = u8.d.f91629e;
            Expression expression16 = b9.f86462l;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "orientation", typeHelper7, function17, expression16);
            Expression expression17 = optionalExpression12 == null ? expression16 : optionalExpression12;
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f86484a.Y2());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f86484a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f86484a.u0());
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, function13, b9.f86476z);
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f86484a.u0());
            u8.e eVar2 = (u8.e) JsonPropertyParser.readOptional(parsingContext, jSONObject, "separator", this.f86484a.p2());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f86484a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f86484a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f86484a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f86484a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f86484a.z1());
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, b9.A);
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f86484a.e9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f86484a.k9());
            TypeHelper typeHelper8 = b9.f86471u;
            Function1 function18 = gx.f87924e;
            Expression expression18 = b9.f86463m;
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper8, function18, expression18);
            if (optionalExpression15 != null) {
                expression18 = optionalExpression15;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f86484a.w9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f86484a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f86484a.Y6());
            if (epVar3 == null) {
                epVar3 = b9.f86464n;
            }
            return new u8(g1Var, j1Var, a6Var2, optionalList, optionalExpression, optionalExpression2, expression2, optionalList2, w6Var, optionalList3, l7Var, expression4, expression6, optionalExpression6, expression8, expression10, optionalList4, optionalList5, optionalList6, bdVar, optionalList7, epVar2, optionalList8, optionalList9, str, k8Var, expression12, optionalList10, expression14, zhVar, eVar, expression15, optionalList11, hbVar, expression17, hbVar2, optionalList12, optionalList13, optionalExpression13, optionalExpression14, optionalList14, eVar2, optionalList15, wvVar, y7Var, r6Var, r6Var2, optionalList16, optionalList17, optionalList18, expression18, hxVar, optionalList19, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, u8 u8Var) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", u8Var.o(), this.f86484a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", u8Var.f91589b, this.f86484a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", u8Var.f91591c, this.f86484a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", u8Var.f91593d, this.f86484a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", u8Var.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", u8Var.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", u8Var.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", u8Var.w(), this.f86484a.t1());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", u8Var.f91599i, this.f86484a.C1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, u8Var.getBackground(), this.f86484a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, u8Var.x(), this.f86484a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", u8Var.f91602l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "clip_to_bounds", u8Var.f91603m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", u8Var.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", u8Var.f91605o, e9.f87186d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", u8Var.f91606p, f9.f87450d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", u8Var.k(), this.f86484a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", u8Var.f91608r, this.f86484a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", u8Var.getExtensions(), this.f86484a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", u8Var.n(), this.f86484a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", u8Var.u(), this.f86484a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", u8Var.getHeight(), this.f86484a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", u8Var.f91613w, this.f86484a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", u8Var.f91614x, this.f86484a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", u8Var.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", u8Var.f91616z, this.f86484a.d2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", u8Var.A);
            JsonPropertyParser.writeList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, u8Var.B, this.f86484a.M4());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "layout_mode", u8Var.C, u8.c.f91619d);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", u8Var.r(), this.f86484a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "line_separator", u8Var.E, this.f86484a.p2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_spacing", u8Var.F);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", u8Var.G, this.f86484a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", u8Var.d(), this.f86484a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "orientation", u8Var.I, u8.d.f91628d);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", u8Var.p(), this.f86484a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", u8Var.K, this.f86484a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", u8Var.L, this.f86484a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", u8Var.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", u8Var.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", u8Var.q(), this.f86484a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "separator", u8Var.P, this.f86484a.p2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", u8Var.h(), this.f86484a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", u8Var.getTransform(), this.f86484a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", u8Var.j(), this.f86484a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", u8Var.v(), this.f86484a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", u8Var.i(), this.f86484a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", u8Var.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "container");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", u8Var.s(), this.f86484a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", u8Var.c(), this.f86484a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", u8Var.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", u8Var.t(), this.f86484a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", u8Var.a(), this.f86484a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", u8Var.getWidth(), this.f86484a.Y6());
            return jSONObject;
        }
    }

    public static final class j implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86485a;

        public j(my myVar) {
            this.f86485a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d9 deserialize(ParsingContext parsingContext, d9 d9Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, d9Var != null ? d9Var.f86926a : null, this.f86485a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, d9Var != null ? d9Var.f86928b : null, this.f86485a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, d9Var != null ? d9Var.f86930c : null, this.f86485a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, d9Var != null ? d9Var.f86931d : null, this.f86485a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", b9.f86465o, allowPropertyOverride, d9Var != null ? d9Var.f86932e : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", b9.f86466p, allowPropertyOverride, d9Var != null ? d9Var.f86933f : null, z5.f92903e);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, d9Var != null ? d9Var.f86934g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, b9.f86472v);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, d9Var != null ? d9Var.f86935h : null, this.f86485a.u1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, d9Var != null ? d9Var.f86936i : null, this.f86485a.D1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, d9Var != null ? d9Var.f86937j : null, this.f86485a.G1());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, d9Var != null ? d9Var.f86938k : null, this.f86485a.M1());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = d9Var != null ? d9Var.f86939l : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper, allowPropertyOverride, field, function1);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "clip_to_bounds", typeHelper, allowPropertyOverride, d9Var != null ? d9Var.f86940m : null, function1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = d9Var != null ? d9Var.f86941n : null;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, function12, b9.f86473w);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", b9.f86467q, allowPropertyOverride, d9Var != null ? d9Var.f86942o : null, e9.f87187e);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", b9.f86468r, allowPropertyOverride, d9Var != null ? d9Var.f86943p : null, f9.f87451e);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, d9Var != null ? d9Var.f86944q : null, this.f86485a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, d9Var != null ? d9Var.f86945r : null, this.f86485a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, d9Var != null ? d9Var.f86946s : null, this.f86485a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, d9Var != null ? d9Var.f86947t : null, this.f86485a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, d9Var != null ? d9Var.f86948u : null, this.f86485a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, d9Var != null ? d9Var.f86949v : null, this.f86485a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, d9Var != null ? d9Var.f86950w : null, this.f86485a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, d9Var != null ? d9Var.f86951x : null, this.f86485a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, d9Var != null ? d9Var.f86952y : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, d9Var != null ? d9Var.f86953z : null, this.f86485a.e2());
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", typeHelper2, allowPropertyOverride, d9Var != null ? d9Var.A : null, function12, b9.f86474x);
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, d9Var != null ? d9Var.B : null, this.f86485a.N4());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "layout_mode", b9.f86469s, allowPropertyOverride, d9Var != null ? d9Var.C : null, u8.c.f91620e);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, d9Var != null ? d9Var.D : null, this.f86485a.Q4());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "line_separator", allowPropertyOverride, d9Var != null ? d9Var.E : null, this.f86485a.q2());
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_spacing", typeHelper2, allowPropertyOverride, d9Var != null ? d9Var.F : null, function12, b9.f86475y);
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, d9Var != null ? d9Var.G : null, this.f86485a.v0());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, d9Var != null ? d9Var.H : null, this.f86485a.Z2());
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "orientation", b9.f86470t, allowPropertyOverride, d9Var != null ? d9Var.I : null, u8.d.f91629e);
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, d9Var != null ? d9Var.J : null, this.f86485a.Z2());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, d9Var != null ? d9Var.K : null, this.f86485a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, d9Var != null ? d9Var.L : null, this.f86485a.v0());
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, d9Var != null ? d9Var.M : null);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, d9Var != null ? d9Var.N : null, function12, b9.f86476z);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, d9Var != null ? d9Var.O : null, this.f86485a.v0());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "separator", allowPropertyOverride, d9Var != null ? d9Var.P : null, this.f86485a.q2());
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, d9Var != null ? d9Var.Q : null, this.f86485a.Q8());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, d9Var != null ? d9Var.R : null, this.f86485a.c9());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, d9Var != null ? d9Var.S : null, this.f86485a.V1());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, d9Var != null ? d9Var.T : null, this.f86485a.A1());
            Field optionalField18 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, d9Var != null ? d9Var.U : null, this.f86485a.A1());
            Field field3 = d9Var != null ? d9Var.V : null;
            Function1 function13 = aw.f86414e;
            ListValidator listValidator = b9.A;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new d9(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalField4, optionalListField3, optionalField5, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalListField4, optionalListField5, optionalListField6, optionalField6, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalFieldWithExpression9, optionalListField10, optionalFieldWithExpression10, optionalField10, optionalField11, optionalFieldWithExpression11, optionalListField11, optionalField12, optionalFieldWithExpression12, optionalField13, optionalListField12, optionalListField13, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalListField14, optionalField14, optionalListField15, optionalField15, optionalField16, optionalField17, optionalField18, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, function13, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, d9Var != null ? d9Var.W : null, this.f86485a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, d9Var != null ? d9Var.X : null, this.f86485a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", b9.f86471u, allowPropertyOverride, d9Var != null ? d9Var.Y : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, d9Var != null ? d9Var.Z : null, this.f86485a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, d9Var != null ? d9Var.f86927a0 : null, this.f86485a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, d9Var != null ? d9Var.f86929b0 : null, this.f86485a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, d9 d9Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", d9Var.f86926a, this.f86485a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", d9Var.f86928b, this.f86485a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", d9Var.f86930c, this.f86485a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", d9Var.f86931d, this.f86485a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", d9Var.f86932e, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", d9Var.f86933f, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", d9Var.f86934g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", d9Var.f86935h, this.f86485a.u1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", d9Var.f86936i, this.f86485a.D1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, d9Var.f86937j, this.f86485a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, d9Var.f86938k, this.f86485a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", d9Var.f86939l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "clip_to_bounds", d9Var.f86940m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", d9Var.f86941n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", d9Var.f86942o, e9.f87186d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", d9Var.f86943p, f9.f87450d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", d9Var.f86944q, this.f86485a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", d9Var.f86945r, this.f86485a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", d9Var.f86946s, this.f86485a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", d9Var.f86947t, this.f86485a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", d9Var.f86948u, this.f86485a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", d9Var.f86949v, this.f86485a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", d9Var.f86950w, this.f86485a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", d9Var.f86951x, this.f86485a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", d9Var.f86952y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", d9Var.f86953z, this.f86485a.e2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", d9Var.A);
            JsonFieldParser.writeListField(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, d9Var.B, this.f86485a.N4());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "layout_mode", d9Var.C, u8.c.f91619d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", d9Var.D, this.f86485a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "line_separator", d9Var.E, this.f86485a.q2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_spacing", d9Var.F);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", d9Var.G, this.f86485a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", d9Var.H, this.f86485a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "orientation", d9Var.I, u8.d.f91628d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", d9Var.J, this.f86485a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", d9Var.K, this.f86485a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", d9Var.L, this.f86485a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", d9Var.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", d9Var.N);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", d9Var.O, this.f86485a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "separator", d9Var.P, this.f86485a.q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", d9Var.Q, this.f86485a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", d9Var.R, this.f86485a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", d9Var.S, this.f86485a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", d9Var.T, this.f86485a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", d9Var.U, this.f86485a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", d9Var.V, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "container");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", d9Var.W, this.f86485a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", d9Var.X, this.f86485a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", d9Var.Y, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", d9Var.Z, this.f86485a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", d9Var.f86927a0, this.f86485a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", d9Var.f86929b0, this.f86485a.Z6());
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
        private final my f86486a;

        public k(my myVar) {
            this.f86486a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u8 resolve(ParsingContext parsingContext, d9 d9Var, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, d9Var.f86926a, jSONObject, "accessibility", this.f86486a.J(), this.f86486a.H());
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, d9Var.f86928b, jSONObject, "action", this.f86486a.w0(), this.f86486a.u0());
            a6 a6Var = (a6) JsonFieldResolver.resolveOptional(parsingContext, d9Var.f86930c, jSONObject, "action_animation", this.f86486a.s1(), this.f86486a.q1());
            if (a6Var == null) {
                a6Var = b9.f86452b;
            }
            a6 a6Var2 = a6Var;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.f86931d, jSONObject, "actions", this.f86486a.w0(), this.f86486a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, d9Var.f86932e, jSONObject, "alignment_horizontal", b9.f86465o, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, d9Var.f86933f, jSONObject, "alignment_vertical", b9.f86466p, z5.f92903e);
            Field field = d9Var.f86934g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = b9.f86472v;
            Expression expression = b9.f86453c;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.f86935h, jSONObject, "animators", this.f86486a.v1(), this.f86486a.t1());
            w6 w6Var = (w6) JsonFieldResolver.resolveOptional(parsingContext, d9Var.f86936i, jSONObject, "aspect", this.f86486a.E1(), this.f86486a.C1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.f86937j, jSONObject, H2.f75840g, this.f86486a.H1(), this.f86486a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, d9Var.f86938k, jSONObject, OutlinedTextFieldKt.BorderId, this.f86486a.N1(), this.f86486a.L1());
            Field field2 = d9Var.f86939l;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = b9.f86454d;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper2, function12, expression3);
            Expression expression4 = expressionResolveOptionalExpression4 == null ? expression3 : expressionResolveOptionalExpression4;
            Field field3 = d9Var.f86940m;
            Expression expression5 = b9.f86455e;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "clip_to_bounds", typeHelper2, function12, expression5);
            Expression expression6 = expressionResolveOptionalExpression5 == null ? expression5 : expressionResolveOptionalExpression5;
            Field field4 = d9Var.f86941n;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "column_span", typeHelper3, function13, b9.f86473w);
            Field field5 = d9Var.f86942o;
            TypeHelper typeHelper4 = b9.f86467q;
            Function1 function14 = e9.f87187e;
            Expression expression7 = b9.f86456f;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "content_alignment_horizontal", typeHelper4, function14, expression7);
            Expression expression8 = expressionResolveOptionalExpression7 == null ? expression7 : expressionResolveOptionalExpression7;
            Field field6 = d9Var.f86943p;
            TypeHelper typeHelper5 = b9.f86468r;
            Function1 function15 = f9.f87451e;
            Expression expression9 = b9.f86457g;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_vertical", typeHelper5, function15, expression9);
            Expression expression10 = expressionResolveOptionalExpression8 == null ? expression9 : expressionResolveOptionalExpression8;
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.f86944q, jSONObject, "disappear_actions", this.f86486a.R2(), this.f86486a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.f86945r, jSONObject, "doubletap_actions", this.f86486a.w0(), this.f86486a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.f86946s, jSONObject, "extensions", this.f86486a.d3(), this.f86486a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, d9Var.f86947t, jSONObject, "focus", this.f86486a.B3(), this.f86486a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.f86948u, jSONObject, "functions", this.f86486a.K3(), this.f86486a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, d9Var.f86949v, jSONObject, "height", this.f86486a.a7(), this.f86486a.Y6());
            if (epVar == null) {
                epVar = b9.f86458h;
            }
            ep epVar2 = epVar;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.f86950w, jSONObject, "hover_end_actions", this.f86486a.w0(), this.f86486a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.f86951x, jSONObject, "hover_start_actions", this.f86486a.w0(), this.f86486a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, d9Var.f86952y, jSONObject, "id");
            k8 k8Var = (k8) JsonFieldResolver.resolveOptional(parsingContext, d9Var.f86953z, jSONObject, "item_builder", this.f86486a.f2(), this.f86486a.d2());
            Field field7 = d9Var.A;
            ValueValidator valueValidator2 = b9.f86474x;
            Expression expression11 = b9.f86459i;
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "item_spacing", typeHelper3, function13, valueValidator2, expression11);
            Expression expression12 = expressionResolveOptionalExpression9 == null ? expression11 : expressionResolveOptionalExpression9;
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.B, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f86486a.O4(), this.f86486a.M4());
            Field field8 = d9Var.C;
            TypeHelper typeHelper6 = b9.f86469s;
            Function1 function16 = u8.c.f91620e;
            Expression expression13 = b9.f86460j;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "layout_mode", typeHelper6, function16, expression13);
            Expression expression14 = expressionResolveOptionalExpression10 == null ? expression13 : expressionResolveOptionalExpression10;
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, d9Var.D, jSONObject, "layout_provider", this.f86486a.R4(), this.f86486a.P4());
            u8.e eVar = (u8.e) JsonFieldResolver.resolveOptional(parsingContext, d9Var.E, jSONObject, "line_separator", this.f86486a.r2(), this.f86486a.p2());
            Field field9 = d9Var.F;
            ValueValidator valueValidator3 = b9.f86475y;
            Expression expression15 = b9.f86461k;
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "line_spacing", typeHelper3, function13, valueValidator3, expression15);
            if (expressionResolveOptionalExpression11 != null) {
                expression15 = expressionResolveOptionalExpression11;
            }
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.G, jSONObject, "longtap_actions", this.f86486a.w0(), this.f86486a.u0());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, d9Var.H, jSONObject, "margins", this.f86486a.a3(), this.f86486a.Y2());
            Field field10 = d9Var.I;
            TypeHelper typeHelper7 = b9.f86470t;
            Function1 function17 = u8.d.f91629e;
            Expression expression16 = b9.f86462l;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "orientation", typeHelper7, function17, expression16);
            Expression expression17 = expressionResolveOptionalExpression12 == null ? expression16 : expressionResolveOptionalExpression12;
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, d9Var.J, jSONObject, "paddings", this.f86486a.a3(), this.f86486a.Y2());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.K, jSONObject, "press_end_actions", this.f86486a.w0(), this.f86486a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.L, jSONObject, "press_start_actions", this.f86486a.w0(), this.f86486a.u0());
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, d9Var.M, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, d9Var.N, jSONObject, "row_span", typeHelper3, function13, b9.f86476z);
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.O, jSONObject, "selected_actions", this.f86486a.w0(), this.f86486a.u0());
            u8.e eVar2 = (u8.e) JsonFieldResolver.resolveOptional(parsingContext, d9Var.P, jSONObject, "separator", this.f86486a.r2(), this.f86486a.p2());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.Q, jSONObject, "tooltips", this.f86486a.R8(), this.f86486a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, d9Var.R, jSONObject, "transform", this.f86486a.d9(), this.f86486a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, d9Var.S, jSONObject, "transition_change", this.f86486a.W1(), this.f86486a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, d9Var.T, jSONObject, "transition_in", this.f86486a.B1(), this.f86486a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, d9Var.U, jSONObject, "transition_out", this.f86486a.B1(), this.f86486a.z1());
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.V, jSONObject, "transition_triggers", aw.f86414e, b9.A);
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.W, jSONObject, "variable_triggers", this.f86486a.g9(), this.f86486a.e9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.X, jSONObject, "variables", this.f86486a.m9(), this.f86486a.k9());
            Field field11 = d9Var.Y;
            TypeHelper typeHelper8 = b9.f86471u;
            Function1 function18 = gx.f87924e;
            Expression expression18 = b9.f86463m;
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "visibility", typeHelper8, function18, expression18);
            if (expressionResolveOptionalExpression15 != null) {
                expression18 = expressionResolveOptionalExpression15;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, d9Var.Z, jSONObject, "visibility_action", this.f86486a.y9(), this.f86486a.w9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, d9Var.f86927a0, jSONObject, "visibility_actions", this.f86486a.y9(), this.f86486a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, d9Var.f86929b0, jSONObject, "width", this.f86486a.a7(), this.f86486a.Y6());
            if (epVar3 == null) {
                epVar3 = b9.f86464n;
            }
            return new u8(g1Var, j1Var, a6Var2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList2, w6Var, listResolveOptionalList3, l7Var, expression4, expression6, expressionResolveOptionalExpression6, expression8, expression10, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, bdVar, listResolveOptionalList7, epVar2, listResolveOptionalList8, listResolveOptionalList9, str, k8Var, expression12, listResolveOptionalList10, expression14, zhVar, eVar, expression15, listResolveOptionalList11, hbVar, expression17, hbVar2, listResolveOptionalList12, listResolveOptionalList13, expressionResolveOptionalExpression13, expressionResolveOptionalExpression14, listResolveOptionalList14, eVar2, listResolveOptionalList15, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList16, listResolveOptionalList17, listResolveOptionalList18, expression18, hxVar, listResolveOptionalList19, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        kp kpVar = null;
        f86452b = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f86453c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f86454d = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f86455e = Expression.Companion.constant$default(companion, bool, null, 2, null);
        e9 e9Var = e9.START;
        f86456f = Expression.Companion.constant$default(companion, e9Var, null, 2, null);
        f9 f9Var = f9.TOP;
        f86457g = Expression.Companion.constant$default(companion, f9Var, null, 2, null);
        f86458h = new ep.e(new nx(null, null, kpVar, 7, null));
        f86459i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        u8.c cVar = u8.c.NO_WRAP;
        f86460j = Expression.Companion.constant$default(companion, cVar, null, 2, null);
        f86461k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        u8.d dVar = u8.d.VERTICAL;
        f86462l = Expression.Companion.constant$default(companion, dVar, null, 2, null);
        gx gxVar = gx.VISIBLE;
        f86463m = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f86464n = new ep.d(new ni(kpVar, null, 0 == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f86465o = companion2.from(ArraysKt.first(y5.values()), a.f86477f);
        f86466p = companion2.from(ArraysKt.first(z5.values()), b.f86478f);
        f86467q = companion2.from(e9Var, c.f86479f);
        f86468r = companion2.from(f9Var, d.f86480f);
        f86469s = companion2.from(cVar, e.f86481f);
        f86470t = companion2.from(dVar, f.f86482f);
        f86471u = companion2.from(gxVar, g.f86483f);
        f86472v = new ValueValidator() { // from class: k8.v8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return b9.g(((Double) obj).doubleValue());
            }
        };
        f86473w = new ValueValidator() { // from class: k8.w8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return b9.h(((Long) obj).longValue());
            }
        };
        f86474x = new ValueValidator() { // from class: k8.x8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return b9.i(((Long) obj).longValue());
            }
        };
        f86475y = new ValueValidator() { // from class: k8.y8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return b9.j(((Long) obj).longValue());
            }
        };
        f86476z = new ValueValidator() { // from class: k8.z8
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return b9.k(((Long) obj).longValue());
            }
        };
        A = new ListValidator() { // from class: k8.a9
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return b9.l(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(List list) {
        return list.size() >= 1;
    }
}
