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
public abstract class je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f88389a = new g(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a6 f88390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f88391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f88392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f88393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f88394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ep.e f88395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f88396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression f88397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression f88398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression f88399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ep.d f88400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeHelper f88401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeHelper f88402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TypeHelper f88403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TypeHelper f88404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final TypeHelper f88405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final TypeHelper f88406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ValueValidator f88407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ValueValidator f88408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ValueValidator f88409u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ListValidator f88410v;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88411f = new a();

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
        public static final b f88412f = new b();

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
        public static final c f88413f = new c();

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
        public static final d f88414f = new d();

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
        public static final e f88415f = new e();

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
        public static final f f88416f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof gx);
        }
    }

    private static final class g {
        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
        }
    }

    public static final class h implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88417a;

        public h(my myVar) {
            this.f88417a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ee deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f88417a.H());
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f88417a.u0());
            a6 a6Var = (a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f88417a.q1());
            if (a6Var == null) {
                a6Var = je.f88390b;
            }
            a6 a6Var2 = a6Var;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f88417a.u0());
            TypeHelper typeHelper = je.f88401m;
            Function1 function1 = y5.f92620e;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = je.f88402n;
            Function1 function12 = z5.f92903e;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = je.f88407s;
            Expression expression = je.f88391c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f88417a.t1());
            w6 w6Var = (w6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.f88417a.C1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f88417a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f88417a.L1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = je.f88392d;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function15, je.f88408t);
            TypeHelper typeHelper6 = je.f88403o;
            Expression expression4 = je.f88393e;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = optionalExpression6 == null ? expression4 : optionalExpression6;
            TypeHelper typeHelper7 = je.f88404p;
            Expression expression6 = je.f88394f;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = optionalExpression7 == null ? expression6 : optionalExpression7;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f88417a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f88417a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f88417a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f88417a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f88417a.I3());
            Expression expression8 = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f88417a.Y6());
            if (epVar == null) {
                epVar = je.f88395g;
            }
            ep epVar2 = epVar;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f88417a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f88417a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f88417a.P4());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f88417a.u0());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f88417a.Y2());
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f88417a.Y2());
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression9 = je.f88396h;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", typeHelper8, function16, expression9);
            Expression expression10 = optionalExpression8 == null ? expression9 : optionalExpression8;
            Expression expression11 = je.f88397i;
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, function14, expression11);
            Expression expression12 = optionalExpression9 == null ? expression11 : optionalExpression9;
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f88417a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f88417a.u0());
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper9);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper9);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function15, je.f88409u);
            TypeHelper typeHelper10 = je.f88405q;
            Function1 function17 = df.f87029e;
            Expression expression13 = je.f88398j;
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper10, function17, expression13);
            Expression expression14 = optionalExpression13 == null ? expression13 : optionalExpression13;
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f88417a.u0());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f88417a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f88417a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f88417a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f88417a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f88417a.z1());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, je.f88410v);
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f88417a.e9());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f88417a.k9());
            TypeHelper typeHelper11 = je.f88406r;
            Function1 function18 = gx.f87924e;
            Expression expression15 = je.f88399k;
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper11, function18, expression15);
            if (optionalExpression14 != null) {
                expression15 = optionalExpression14;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f88417a.w9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f88417a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f88417a.Y6());
            if (epVar3 == null) {
                epVar3 = je.f88400l;
            }
            Expression expression16 = expression7;
            return new ee(g1Var, j1Var, a6Var2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, w6Var, optionalList3, l7Var, expression3, optionalExpression5, expression5, expression16, optionalList4, optionalList5, optionalList6, bdVar, optionalList7, expression8, epVar2, optionalList8, optionalList9, str, zhVar, optionalList10, hbVar, hbVar2, expression10, expression12, optionalList11, optionalList12, optionalExpression10, optionalExpression11, optionalExpression12, expression14, optionalList13, optionalList14, wvVar, y7Var, r6Var, r6Var2, optionalList15, optionalList16, optionalList17, expression15, hxVar, optionalList18, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ee eeVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", eeVar.o(), this.f88417a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", eeVar.f87235b, this.f88417a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", eeVar.f87236c, this.f88417a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", eeVar.f87237d, this.f88417a.u0());
            Expression expressionG = eeVar.g();
            Function1 function1 = y5.f92619d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, function1);
            Expression expressionM = eeVar.m();
            Function1 function12 = z5.f92902d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionM, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", eeVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", eeVar.w(), this.f88417a.t1());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", eeVar.f87242i, this.f88417a.C1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, eeVar.getBackground(), this.f88417a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, eeVar.x(), this.f88417a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", eeVar.f87245l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", eeVar.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", eeVar.f87247n, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", eeVar.f87248o, function12);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", eeVar.k(), this.f88417a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", eeVar.f87250q, this.f88417a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", eeVar.getExtensions(), this.f88417a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", eeVar.n(), this.f88417a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", eeVar.u(), this.f88417a.I3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, eeVar.f87254u, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", eeVar.getHeight(), this.f88417a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", eeVar.f87256w, this.f88417a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", eeVar.f87257x, this.f88417a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", eeVar.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", eeVar.r(), this.f88417a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", eeVar.A, this.f88417a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", eeVar.d(), this.f88417a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", eeVar.p(), this.f88417a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder_color", eeVar.D, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", eeVar.E);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", eeVar.F, this.f88417a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", eeVar.G, this.f88417a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", eeVar.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", eeVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", eeVar.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", eeVar.K, df.f87028d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", eeVar.q(), this.f88417a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", eeVar.h(), this.f88417a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", eeVar.getTransform(), this.f88417a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", eeVar.j(), this.f88417a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", eeVar.v(), this.f88417a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", eeVar.i(), this.f88417a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", eeVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gif");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", eeVar.s(), this.f88417a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", eeVar.c(), this.f88417a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", eeVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", eeVar.t(), this.f88417a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", eeVar.a(), this.f88417a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", eeVar.getWidth(), this.f88417a.Y6());
            return jSONObject;
        }
    }

    public static final class i implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88418a;

        public i(my myVar) {
            this.f88418a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ke deserialize(ParsingContext parsingContext, ke keVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, keVar != null ? keVar.f88631a : null, this.f88418a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, keVar != null ? keVar.f88632b : null, this.f88418a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, keVar != null ? keVar.f88633c : null, this.f88418a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, keVar != null ? keVar.f88634d : null, this.f88418a.v0());
            TypeHelper typeHelper = je.f88401m;
            Field field = keVar != null ? keVar.f88635e : null;
            Function1 function1 = y5.f92620e;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper typeHelper2 = je.f88402n;
            Field field2 = keVar != null ? keVar.f88636f : null;
            Function1 function12 = z5.f92903e;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, keVar != null ? keVar.f88637g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, je.f88407s);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, keVar != null ? keVar.f88638h : null, this.f88418a.u1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, keVar != null ? keVar.f88639i : null, this.f88418a.D1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, keVar != null ? keVar.f88640j : null, this.f88418a.G1());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, keVar != null ? keVar.f88641k : null, this.f88418a.M1());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field3 = keVar != null ? keVar.f88642l : null;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field3, function13);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field4 = keVar != null ? keVar.f88643m : null;
            Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, function14, je.f88408t);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", je.f88403o, allowPropertyOverride, keVar != null ? keVar.f88644n : null, function1);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", je.f88404p, allowPropertyOverride, keVar != null ? keVar.f88645o : null, function12);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, keVar != null ? keVar.f88646p : null, this.f88418a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, keVar != null ? keVar.f88647q : null, this.f88418a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, keVar != null ? keVar.f88648r : null, this.f88418a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, keVar != null ? keVar.f88649s : null, this.f88418a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, keVar != null ? keVar.f88650t : null, this.f88418a.J3());
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, keVar != null ? keVar.f88651u : null, ParsingConvertersKt.ANY_TO_URI);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, keVar != null ? keVar.f88652v : null, this.f88418a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, keVar != null ? keVar.f88653w : null, this.f88418a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, keVar != null ? keVar.f88654x : null, this.f88418a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, keVar != null ? keVar.f88655y : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, keVar != null ? keVar.f88656z : null, this.f88418a.Q4());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, keVar != null ? keVar.A : null, this.f88418a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, keVar != null ? keVar.B : null, this.f88418a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, keVar != null ? keVar.C : null, this.f88418a.Z2());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "placeholder_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, keVar != null ? keVar.D : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", typeHelper3, allowPropertyOverride, keVar != null ? keVar.E : null, function13);
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, keVar != null ? keVar.F : null, this.f88418a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, keVar != null ? keVar.G : null, this.f88418a.v0());
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preview", typeHelper5, allowPropertyOverride, keVar != null ? keVar.H : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, keVar != null ? keVar.I : null);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, keVar != null ? keVar.J : null, function14, je.f88409u);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", je.f88405q, allowPropertyOverride, keVar != null ? keVar.K : null, df.f87029e);
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, keVar != null ? keVar.L : null, this.f88418a.v0());
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, keVar != null ? keVar.M : null, this.f88418a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, keVar != null ? keVar.N : null, this.f88418a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, keVar != null ? keVar.O : null, this.f88418a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, keVar != null ? keVar.P : null, this.f88418a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, keVar != null ? keVar.Q : null, this.f88418a.A1());
            Field field5 = keVar != null ? keVar.R : null;
            Function1 function15 = aw.f86414e;
            ListValidator listValidator = je.f88410v;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new ke(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalField4, optionalListField3, optionalField5, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalListField5, optionalListField6, optionalField6, optionalListField7, fieldWithExpression, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalListField10, optionalField10, optionalField11, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField11, optionalListField12, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalListField13, optionalListField14, optionalField12, optionalField13, optionalField14, optionalField15, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, function15, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, keVar != null ? keVar.S : null, this.f88418a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, keVar != null ? keVar.T : null, this.f88418a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", je.f88406r, allowPropertyOverride, keVar != null ? keVar.U : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, keVar != null ? keVar.V : null, this.f88418a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, keVar != null ? keVar.W : null, this.f88418a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, keVar != null ? keVar.X : null, this.f88418a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ke keVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", keVar.f88631a, this.f88418a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", keVar.f88632b, this.f88418a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", keVar.f88633c, this.f88418a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", keVar.f88634d, this.f88418a.v0());
            Field field = keVar.f88635e;
            Function1 function1 = y5.f92619d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = keVar.f88636f;
            Function1 function12 = z5.f92902d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", keVar.f88637g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", keVar.f88638h, this.f88418a.u1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", keVar.f88639i, this.f88418a.D1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, keVar.f88640j, this.f88418a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, keVar.f88641k, this.f88418a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", keVar.f88642l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", keVar.f88643m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", keVar.f88644n, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", keVar.f88645o, function12);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", keVar.f88646p, this.f88418a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", keVar.f88647q, this.f88418a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", keVar.f88648r, this.f88418a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", keVar.f88649s, this.f88418a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", keVar.f88650t, this.f88418a.J3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, keVar.f88651u, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", keVar.f88652v, this.f88418a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", keVar.f88653w, this.f88418a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", keVar.f88654x, this.f88418a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", keVar.f88655y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", keVar.f88656z, this.f88418a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", keVar.A, this.f88418a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", keVar.B, this.f88418a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", keVar.C, this.f88418a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder_color", keVar.D, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", keVar.E);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", keVar.F, this.f88418a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", keVar.G, this.f88418a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", keVar.H);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", keVar.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", keVar.J);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", keVar.K, df.f87028d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", keVar.L, this.f88418a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", keVar.M, this.f88418a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", keVar.N, this.f88418a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", keVar.O, this.f88418a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", keVar.P, this.f88418a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", keVar.Q, this.f88418a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", keVar.R, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gif");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", keVar.S, this.f88418a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", keVar.T, this.f88418a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", keVar.U, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", keVar.V, this.f88418a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", keVar.W, this.f88418a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", keVar.X, this.f88418a.Z6());
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

    public static final class j implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88419a;

        public j(my myVar) {
            this.f88419a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ee resolve(ParsingContext parsingContext, ke keVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, keVar.f88631a, jSONObject, "accessibility", this.f88419a.J(), this.f88419a.H());
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, keVar.f88632b, jSONObject, "action", this.f88419a.w0(), this.f88419a.u0());
            a6 a6Var = (a6) JsonFieldResolver.resolveOptional(parsingContext, keVar.f88633c, jSONObject, "action_animation", this.f88419a.s1(), this.f88419a.q1());
            if (a6Var == null) {
                a6Var = je.f88390b;
            }
            a6 a6Var2 = a6Var;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.f88634d, jSONObject, "actions", this.f88419a.w0(), this.f88419a.u0());
            Field field = keVar.f88635e;
            TypeHelper typeHelper = je.f88401m;
            Function1 function1 = y5.f92620e;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, function1);
            Field field2 = keVar.f88636f;
            TypeHelper typeHelper2 = je.f88402n;
            Function1 function12 = z5.f92903e;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, function12);
            Field field3 = keVar.f88637g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = je.f88407s;
            Expression expression = je.f88391c;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.f88638h, jSONObject, "animators", this.f88419a.v1(), this.f88419a.t1());
            w6 w6Var = (w6) JsonFieldResolver.resolveOptional(parsingContext, keVar.f88639i, jSONObject, "aspect", this.f88419a.E1(), this.f88419a.C1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.f88640j, jSONObject, H2.f75840g, this.f88419a.H1(), this.f88419a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, keVar.f88641k, jSONObject, OutlinedTextFieldKt.BorderId, this.f88419a.N1(), this.f88419a.L1());
            Field field4 = keVar.f88642l;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = je.f88392d;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = expressionResolveOptionalExpression4 == null ? expression2 : expressionResolveOptionalExpression4;
            Field field5 = keVar.f88643m;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, function15, je.f88408t);
            Field field6 = keVar.f88644n;
            TypeHelper typeHelper6 = je.f88403o;
            Expression expression4 = je.f88393e;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = expressionResolveOptionalExpression6 == null ? expression4 : expressionResolveOptionalExpression6;
            Field field7 = keVar.f88645o;
            TypeHelper typeHelper7 = je.f88404p;
            Expression expression6 = je.f88394f;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = expressionResolveOptionalExpression7 == null ? expression6 : expressionResolveOptionalExpression7;
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.f88646p, jSONObject, "disappear_actions", this.f88419a.R2(), this.f88419a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.f88647q, jSONObject, "doubletap_actions", this.f88419a.w0(), this.f88419a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.f88648r, jSONObject, "extensions", this.f88419a.d3(), this.f88419a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, keVar.f88649s, jSONObject, "focus", this.f88419a.B3(), this.f88419a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.f88650t, jSONObject, "functions", this.f88419a.K3(), this.f88419a.I3());
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, keVar.f88651u, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, keVar.f88652v, jSONObject, "height", this.f88419a.a7(), this.f88419a.Y6());
            if (epVar == null) {
                epVar = je.f88395g;
            }
            ep epVar2 = epVar;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.f88653w, jSONObject, "hover_end_actions", this.f88419a.w0(), this.f88419a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.f88654x, jSONObject, "hover_start_actions", this.f88419a.w0(), this.f88419a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, keVar.f88655y, jSONObject, "id");
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, keVar.f88656z, jSONObject, "layout_provider", this.f88419a.R4(), this.f88419a.P4());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.A, jSONObject, "longtap_actions", this.f88419a.w0(), this.f88419a.u0());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, keVar.B, jSONObject, "margins", this.f88419a.a3(), this.f88419a.Y2());
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, keVar.C, jSONObject, "paddings", this.f88419a.a3(), this.f88419a.Y2());
            Field field8 = keVar.D;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression8 = je.f88396h;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "placeholder_color", typeHelper8, function16, expression8);
            Expression expression9 = expressionResolveOptionalExpression8 == null ? expression8 : expressionResolveOptionalExpression8;
            Field field9 = keVar.E;
            Expression expression10 = je.f88397i;
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "preload_required", typeHelper4, function14, expression10);
            Expression expression11 = expressionResolveOptionalExpression9 == null ? expression10 : expressionResolveOptionalExpression9;
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.F, jSONObject, "press_end_actions", this.f88419a.w0(), this.f88419a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.G, jSONObject, "press_start_actions", this.f88419a.w0(), this.f88419a.u0());
            Field field10 = keVar.H;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "preview", typeHelper9);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, keVar.I, jSONObject, "reuse_id", typeHelper9);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, keVar.J, jSONObject, "row_span", typeHelper5, function15, je.f88409u);
            Field field11 = keVar.K;
            TypeHelper typeHelper10 = je.f88405q;
            Function1 function17 = df.f87029e;
            Expression expression12 = je.f88398j;
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "scale", typeHelper10, function17, expression12);
            Expression expression13 = expressionResolveOptionalExpression13 == null ? expression12 : expressionResolveOptionalExpression13;
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.L, jSONObject, "selected_actions", this.f88419a.w0(), this.f88419a.u0());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.M, jSONObject, "tooltips", this.f88419a.R8(), this.f88419a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, keVar.N, jSONObject, "transform", this.f88419a.d9(), this.f88419a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, keVar.O, jSONObject, "transition_change", this.f88419a.W1(), this.f88419a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, keVar.P, jSONObject, "transition_in", this.f88419a.B1(), this.f88419a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, keVar.Q, jSONObject, "transition_out", this.f88419a.B1(), this.f88419a.z1());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.R, jSONObject, "transition_triggers", aw.f86414e, je.f88410v);
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.S, jSONObject, "variable_triggers", this.f88419a.g9(), this.f88419a.e9());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.T, jSONObject, "variables", this.f88419a.m9(), this.f88419a.k9());
            Field field12 = keVar.U;
            TypeHelper typeHelper11 = je.f88406r;
            Function1 function18 = gx.f87924e;
            Expression expression14 = je.f88399k;
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "visibility", typeHelper11, function18, expression14);
            if (expressionResolveOptionalExpression14 != null) {
                expression14 = expressionResolveOptionalExpression14;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, keVar.V, jSONObject, "visibility_action", this.f88419a.y9(), this.f88419a.w9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, keVar.W, jSONObject, "visibility_actions", this.f88419a.y9(), this.f88419a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, keVar.X, jSONObject, "width", this.f88419a.a7(), this.f88419a.Y6());
            if (epVar3 == null) {
                epVar3 = je.f88400l;
            }
            return new ee(g1Var, j1Var, a6Var2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList2, w6Var, listResolveOptionalList3, l7Var, expression3, expressionResolveOptionalExpression5, expression5, expression7, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, bdVar, listResolveOptionalList7, expressionResolveExpression, epVar2, listResolveOptionalList8, listResolveOptionalList9, str, zhVar, listResolveOptionalList10, hbVar, hbVar2, expression9, expression11, listResolveOptionalList11, listResolveOptionalList12, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, expression13, listResolveOptionalList13, listResolveOptionalList14, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList15, listResolveOptionalList16, listResolveOptionalList17, expression14, hxVar, listResolveOptionalList18, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        kp kpVar = null;
        f88390b = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f88391c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f88392d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        y5 y5Var = y5.CENTER;
        f88393e = Expression.Companion.constant$default(companion, y5Var, null, 2, null);
        z5 z5Var = z5.CENTER;
        f88394f = Expression.Companion.constant$default(companion, z5Var, null, 2, null);
        kp kpVar2 = null;
        f88395g = new ep.e(new nx(null, kpVar2, kpVar, 7, null));
        f88396h = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f88397i = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        df dfVar = df.FILL;
        f88398j = Expression.Companion.constant$default(companion, dfVar, null, 2, null);
        gx gxVar = gx.VISIBLE;
        f88399k = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f88400l = new ep.d(new ni(kpVar2, kpVar, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f88401m = companion2.from(ArraysKt.first(y5.values()), a.f88411f);
        f88402n = companion2.from(ArraysKt.first(z5.values()), b.f88412f);
        f88403o = companion2.from(y5Var, c.f88413f);
        f88404p = companion2.from(z5Var, d.f88414f);
        f88405q = companion2.from(dfVar, e.f88415f);
        f88406r = companion2.from(gxVar, f.f88416f);
        f88407s = new ValueValidator() { // from class: k8.fe
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return je.e(((Double) obj).doubleValue());
            }
        };
        f88408t = new ValueValidator() { // from class: k8.ge
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return je.f(((Long) obj).longValue());
            }
        };
        f88409u = new ValueValidator() { // from class: k8.he
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return je.g(((Long) obj).longValue());
            }
        };
        f88410v = new ListValidator() { // from class: k8.ie
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return je.h(list);
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
