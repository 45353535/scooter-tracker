package k8;

import androidx.compose.material.OutlinedTextFieldKt;
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
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class rq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f90814a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a6 f90815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f90818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ep.e f90819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f90820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f90821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ep.d f90822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TypeHelper f90823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TypeHelper f90824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final TypeHelper f90825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeHelper f90826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ValueValidator f90827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ValueValidator f90828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ValueValidator f90829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ListValidator f90830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ListValidator f90831r;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90832f = new a();

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
        public static final b f90833f = new b();

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
        public static final c f90834f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof zv);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f90835f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof gx);
        }
    }

    private static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    public static final class f implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90836a;

        public f(my myVar) {
            this.f90836a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public lq deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f90836a.H());
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f90836a.u0());
            a6 a6Var = (a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f90836a.q1());
            if (a6Var == null) {
                a6Var = rq.f90815b;
            }
            a6 a6Var2 = a6Var;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f90836a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", rq.f90823j, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", rq.f90824k, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = rq.f90827n;
            Expression expression = rq.f90816c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f90836a.t1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f90836a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f90836a.L1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = rq.f90817d;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, function12, expression2);
            Expression expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            Expression expression4 = rq.f90818e;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper2, function12, expression4);
            Expression expression5 = optionalExpression5 == null ? expression4 : optionalExpression5;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, function13, rq.f90828o);
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_state_id", typeHelper4);
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f90836a.P2());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "div_id");
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f90836a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f90836a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f90836a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f90836a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f90836a.Y6());
            if (epVar == null) {
                epVar = rq.f90819f;
            }
            ep epVar2 = epVar;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f90836a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f90836a.u0());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f90836a.P4());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f90836a.u0());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f90836a.Y2());
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f90836a.Y2());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f90836a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f90836a.u0());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper4);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, function13, rq.f90829p);
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f90836a.u0());
            String str3 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "state_id_variable");
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "states", this.f90836a.w7(), rq.f90830q);
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f90836a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f90836a.b9());
            TypeHelper typeHelper5 = rq.f90825l;
            Function1 function14 = zv.f93012e;
            Expression expression6 = rq.f90820g;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "transition_animation_selector", typeHelper5, function14, expression6);
            Expression expression7 = optionalExpression10 == null ? expression6 : optionalExpression10;
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f90836a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f90836a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f90836a.z1());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, rq.f90831r);
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f90836a.e9());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f90836a.k9());
            TypeHelper typeHelper6 = rq.f90826m;
            Function1 function15 = gx.f87924e;
            Expression expression8 = rq.f90821h;
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, function15, expression8);
            if (optionalExpression11 != null) {
                expression8 = optionalExpression11;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f90836a.w9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f90836a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f90836a.Y6());
            if (epVar3 == null) {
                epVar3 = rq.f90822i;
            }
            return new lq(g1Var, j1Var, a6Var2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalList3, l7Var, expression3, expression5, optionalExpression6, optionalExpression7, optionalList4, str, optionalList5, optionalList6, bdVar, optionalList7, epVar2, optionalList8, optionalList9, str2, zhVar, optionalList10, hbVar, hbVar2, optionalList11, optionalList12, optionalExpression8, optionalExpression9, optionalList13, str3, list, optionalList14, wvVar, expression7, y7Var, r6Var, r6Var2, optionalList15, optionalList16, optionalList17, expression8, hxVar, optionalList18, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, lq lqVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", lqVar.o(), this.f90836a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", lqVar.f88859b, this.f90836a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", lqVar.f88860c, this.f90836a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", lqVar.f88861d, this.f90836a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", lqVar.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", lqVar.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", lqVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", lqVar.w(), this.f90836a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, lqVar.getBackground(), this.f90836a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, lqVar.x(), this.f90836a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", lqVar.f88868k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "clip_to_bounds", lqVar.f88869l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", lqVar.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_state_id", lqVar.f88871n);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", lqVar.k(), this.f90836a.P2());
            JsonPropertyParser.write(parsingContext, jSONObject, "div_id", lqVar.f88873p);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", lqVar.f88874q, this.f90836a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", lqVar.getExtensions(), this.f90836a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", lqVar.n(), this.f90836a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", lqVar.u(), this.f90836a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", lqVar.getHeight(), this.f90836a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", lqVar.f88879v, this.f90836a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", lqVar.f88880w, this.f90836a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", lqVar.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", lqVar.r(), this.f90836a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", lqVar.f88883z, this.f90836a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", lqVar.d(), this.f90836a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", lqVar.p(), this.f90836a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", lqVar.C, this.f90836a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", lqVar.D, this.f90836a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", lqVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", lqVar.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", lqVar.q(), this.f90836a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "state_id_variable", lqVar.H);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "states", lqVar.I, this.f90836a.w7());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", lqVar.h(), this.f90836a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", lqVar.getTransform(), this.f90836a.b9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "transition_animation_selector", lqVar.L, zv.f93011d);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", lqVar.j(), this.f90836a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", lqVar.v(), this.f90836a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", lqVar.i(), this.f90836a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", lqVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "state");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", lqVar.s(), this.f90836a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", lqVar.c(), this.f90836a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", lqVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", lqVar.t(), this.f90836a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", lqVar.a(), this.f90836a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", lqVar.getWidth(), this.f90836a.Y6());
            return jSONObject;
        }
    }

    public static final class g implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90837a;

        public g(my myVar) {
            this.f90837a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vq deserialize(ParsingContext parsingContext, vq vqVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, vqVar != null ? vqVar.f91976a : null, this.f90837a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, vqVar != null ? vqVar.f91977b : null, this.f90837a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, vqVar != null ? vqVar.f91978c : null, this.f90837a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, vqVar != null ? vqVar.f91979d : null, this.f90837a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", rq.f90823j, allowPropertyOverride, vqVar != null ? vqVar.f91980e : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", rq.f90824k, allowPropertyOverride, vqVar != null ? vqVar.f91981f : null, z5.f92903e);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, vqVar != null ? vqVar.f91982g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, rq.f90827n);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, vqVar != null ? vqVar.f91983h : null, this.f90837a.u1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, vqVar != null ? vqVar.f91984i : null, this.f90837a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, vqVar != null ? vqVar.f91985j : null, this.f90837a.M1());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = vqVar != null ? vqVar.f91986k : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper, allowPropertyOverride, field, function1);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "clip_to_bounds", typeHelper, allowPropertyOverride, vqVar != null ? vqVar.f91987l : null, function1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = vqVar != null ? vqVar.f91988m : null;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, function12, rq.f90828o);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "default_state_id", typeHelper3, allowPropertyOverride, vqVar != null ? vqVar.f91989n : null);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, vqVar != null ? vqVar.f91990o : null, this.f90837a.Q2());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "div_id", allowPropertyOverride, vqVar != null ? vqVar.f91991p : null);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, vqVar != null ? vqVar.f91992q : null, this.f90837a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, vqVar != null ? vqVar.f91993r : null, this.f90837a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, vqVar != null ? vqVar.f91994s : null, this.f90837a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, vqVar != null ? vqVar.f91995t : null, this.f90837a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, vqVar != null ? vqVar.f91996u : null, this.f90837a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, vqVar != null ? vqVar.f91997v : null, this.f90837a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, vqVar != null ? vqVar.f91998w : null, this.f90837a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, vqVar != null ? vqVar.f91999x : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, vqVar != null ? vqVar.f92000y : null, this.f90837a.Q4());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, vqVar != null ? vqVar.f92001z : null, this.f90837a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, vqVar != null ? vqVar.A : null, this.f90837a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, vqVar != null ? vqVar.B : null, this.f90837a.Z2());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, vqVar != null ? vqVar.C : null, this.f90837a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, vqVar != null ? vqVar.D : null, this.f90837a.v0());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, vqVar != null ? vqVar.E : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, vqVar != null ? vqVar.F : null, function12, rq.f90829p);
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, vqVar != null ? vqVar.G : null, this.f90837a.v0());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "state_id_variable", allowPropertyOverride, vqVar != null ? vqVar.H : null);
            Field field3 = vqVar != null ? vqVar.I : null;
            Lazy lazyX7 = this.f90837a.x7();
            ListValidator listValidator = rq.f90830q;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "states", allowPropertyOverride, field3, lazyX7, listValidator);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, vqVar != null ? vqVar.J : null, this.f90837a.Q8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, vqVar != null ? vqVar.K : null, this.f90837a.c9());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "transition_animation_selector", rq.f90825l, allowPropertyOverride, vqVar != null ? vqVar.L : null, zv.f93012e);
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, vqVar != null ? vqVar.M : null, this.f90837a.V1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, vqVar != null ? vqVar.N : null, this.f90837a.A1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, vqVar != null ? vqVar.O : null, this.f90837a.A1());
            Field field4 = vqVar != null ? vqVar.P : null;
            Function1 function13 = aw.f86414e;
            ListValidator listValidator2 = rq.f90831r;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new vq(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalListField3, optionalField4, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalField5, optionalListField5, optionalListField6, optionalField6, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalListField10, optionalField10, optionalField11, optionalListField11, optionalListField12, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField13, optionalField12, listField, optionalListField14, optionalField13, optionalFieldWithExpression10, optionalField14, optionalField15, optionalField16, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, function13, listValidator2), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, vqVar != null ? vqVar.Q : null, this.f90837a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, vqVar != null ? vqVar.R : null, this.f90837a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", rq.f90826m, allowPropertyOverride, vqVar != null ? vqVar.S : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, vqVar != null ? vqVar.T : null, this.f90837a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, vqVar != null ? vqVar.U : null, this.f90837a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, vqVar != null ? vqVar.V : null, this.f90837a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, vq vqVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", vqVar.f91976a, this.f90837a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", vqVar.f91977b, this.f90837a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", vqVar.f91978c, this.f90837a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", vqVar.f91979d, this.f90837a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", vqVar.f91980e, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", vqVar.f91981f, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", vqVar.f91982g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", vqVar.f91983h, this.f90837a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, vqVar.f91984i, this.f90837a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, vqVar.f91985j, this.f90837a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", vqVar.f91986k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "clip_to_bounds", vqVar.f91987l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", vqVar.f91988m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_state_id", vqVar.f91989n);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", vqVar.f91990o, this.f90837a.Q2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "div_id", vqVar.f91991p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", vqVar.f91992q, this.f90837a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", vqVar.f91993r, this.f90837a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", vqVar.f91994s, this.f90837a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", vqVar.f91995t, this.f90837a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", vqVar.f91996u, this.f90837a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", vqVar.f91997v, this.f90837a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", vqVar.f91998w, this.f90837a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", vqVar.f91999x);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", vqVar.f92000y, this.f90837a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", vqVar.f92001z, this.f90837a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", vqVar.A, this.f90837a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", vqVar.B, this.f90837a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", vqVar.C, this.f90837a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", vqVar.D, this.f90837a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", vqVar.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", vqVar.F);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", vqVar.G, this.f90837a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "state_id_variable", vqVar.H);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "states", vqVar.I, this.f90837a.x7());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", vqVar.J, this.f90837a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", vqVar.K, this.f90837a.c9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "transition_animation_selector", vqVar.L, zv.f93011d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", vqVar.M, this.f90837a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", vqVar.N, this.f90837a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", vqVar.O, this.f90837a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", vqVar.P, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "state");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", vqVar.Q, this.f90837a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", vqVar.R, this.f90837a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", vqVar.S, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", vqVar.T, this.f90837a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", vqVar.U, this.f90837a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", vqVar.V, this.f90837a.Z6());
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

    public static final class h implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90838a;

        public h(my myVar) {
            this.f90838a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public lq resolve(ParsingContext parsingContext, vq vqVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, vqVar.f91976a, jSONObject, "accessibility", this.f90838a.J(), this.f90838a.H());
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, vqVar.f91977b, jSONObject, "action", this.f90838a.w0(), this.f90838a.u0());
            a6 a6Var = (a6) JsonFieldResolver.resolveOptional(parsingContext, vqVar.f91978c, jSONObject, "action_animation", this.f90838a.s1(), this.f90838a.q1());
            if (a6Var == null) {
                a6Var = rq.f90815b;
            }
            a6 a6Var2 = a6Var;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.f91979d, jSONObject, "actions", this.f90838a.w0(), this.f90838a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, vqVar.f91980e, jSONObject, "alignment_horizontal", rq.f90823j, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, vqVar.f91981f, jSONObject, "alignment_vertical", rq.f90824k, z5.f92903e);
            Field field = vqVar.f91982g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = rq.f90827n;
            Expression expression = rq.f90816c;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.f91983h, jSONObject, "animators", this.f90838a.v1(), this.f90838a.t1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.f91984i, jSONObject, H2.f75840g, this.f90838a.H1(), this.f90838a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, vqVar.f91985j, jSONObject, OutlinedTextFieldKt.BorderId, this.f90838a.N1(), this.f90838a.L1());
            Field field2 = vqVar.f91986k;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = rq.f90817d;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper2, function12, expression2);
            Expression expression3 = expressionResolveOptionalExpression4 == null ? expression2 : expressionResolveOptionalExpression4;
            Field field3 = vqVar.f91987l;
            Expression expression4 = rq.f90818e;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "clip_to_bounds", typeHelper2, function12, expression4);
            Expression expression5 = expressionResolveOptionalExpression5 == null ? expression4 : expressionResolveOptionalExpression5;
            Field field4 = vqVar.f91988m;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "column_span", typeHelper3, function13, rq.f90828o);
            Field field5 = vqVar.f91989n;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "default_state_id", typeHelper4);
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.f91990o, jSONObject, "disappear_actions", this.f90838a.R2(), this.f90838a.P2());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, vqVar.f91991p, jSONObject, "div_id");
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.f91992q, jSONObject, "doubletap_actions", this.f90838a.w0(), this.f90838a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.f91993r, jSONObject, "extensions", this.f90838a.d3(), this.f90838a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, vqVar.f91994s, jSONObject, "focus", this.f90838a.B3(), this.f90838a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.f91995t, jSONObject, "functions", this.f90838a.K3(), this.f90838a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, vqVar.f91996u, jSONObject, "height", this.f90838a.a7(), this.f90838a.Y6());
            if (epVar == null) {
                epVar = rq.f90819f;
            }
            ep epVar2 = epVar;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.f91997v, jSONObject, "hover_end_actions", this.f90838a.w0(), this.f90838a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.f91998w, jSONObject, "hover_start_actions", this.f90838a.w0(), this.f90838a.u0());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, vqVar.f91999x, jSONObject, "id");
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, vqVar.f92000y, jSONObject, "layout_provider", this.f90838a.R4(), this.f90838a.P4());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.f92001z, jSONObject, "longtap_actions", this.f90838a.w0(), this.f90838a.u0());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, vqVar.A, jSONObject, "margins", this.f90838a.a3(), this.f90838a.Y2());
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, vqVar.B, jSONObject, "paddings", this.f90838a.a3(), this.f90838a.Y2());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.C, jSONObject, "press_end_actions", this.f90838a.w0(), this.f90838a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.D, jSONObject, "press_start_actions", this.f90838a.w0(), this.f90838a.u0());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, vqVar.E, jSONObject, "reuse_id", typeHelper4);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, vqVar.F, jSONObject, "row_span", typeHelper3, function13, rq.f90829p);
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.G, jSONObject, "selected_actions", this.f90838a.w0(), this.f90838a.u0());
            String str3 = (String) JsonFieldResolver.resolveOptional(parsingContext, vqVar.H, jSONObject, "state_id_variable");
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, vqVar.I, jSONObject, "states", this.f90838a.y7(), this.f90838a.w7(), rq.f90830q);
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.J, jSONObject, "tooltips", this.f90838a.R8(), this.f90838a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, vqVar.K, jSONObject, "transform", this.f90838a.d9(), this.f90838a.b9());
            Field field6 = vqVar.L;
            TypeHelper typeHelper5 = rq.f90825l;
            Function1 function14 = zv.f93012e;
            Expression expression6 = rq.f90820g;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "transition_animation_selector", typeHelper5, function14, expression6);
            Expression expression7 = expressionResolveOptionalExpression10 == null ? expression6 : expressionResolveOptionalExpression10;
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, vqVar.M, jSONObject, "transition_change", this.f90838a.W1(), this.f90838a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, vqVar.N, jSONObject, "transition_in", this.f90838a.B1(), this.f90838a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, vqVar.O, jSONObject, "transition_out", this.f90838a.B1(), this.f90838a.z1());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.P, jSONObject, "transition_triggers", aw.f86414e, rq.f90831r);
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.Q, jSONObject, "variable_triggers", this.f90838a.g9(), this.f90838a.e9());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.R, jSONObject, "variables", this.f90838a.m9(), this.f90838a.k9());
            Field field7 = vqVar.S;
            TypeHelper typeHelper6 = rq.f90826m;
            Function1 function15 = gx.f87924e;
            Expression expression8 = rq.f90821h;
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "visibility", typeHelper6, function15, expression8);
            if (expressionResolveOptionalExpression11 != null) {
                expression8 = expressionResolveOptionalExpression11;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, vqVar.T, jSONObject, "visibility_action", this.f90838a.y9(), this.f90838a.w9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, vqVar.U, jSONObject, "visibility_actions", this.f90838a.y9(), this.f90838a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, vqVar.V, jSONObject, "width", this.f90838a.a7(), this.f90838a.Y6());
            if (epVar3 == null) {
                epVar3 = rq.f90822i;
            }
            return new lq(g1Var, j1Var, a6Var2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList2, listResolveOptionalList3, l7Var, expression3, expression5, expressionResolveOptionalExpression6, expressionResolveOptionalExpression7, listResolveOptionalList4, str, listResolveOptionalList5, listResolveOptionalList6, bdVar, listResolveOptionalList7, epVar2, listResolveOptionalList8, listResolveOptionalList9, str2, zhVar, listResolveOptionalList10, hbVar, hbVar2, listResolveOptionalList11, listResolveOptionalList12, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, listResolveOptionalList13, str3, listResolveList, listResolveOptionalList14, wvVar, expression7, y7Var, r6Var, r6Var2, listResolveOptionalList15, listResolveOptionalList16, listResolveOptionalList17, expression8, hxVar, listResolveOptionalList18, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f90815b = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f90816c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        f90817d = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f90818e = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f90819f = new ep.e(new nx(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        zv zvVar = zv.STATE_CHANGE;
        f90820g = Expression.Companion.constant$default(companion, zvVar, null, 2, null);
        gx gxVar = gx.VISIBLE;
        f90821h = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f90822i = new ep.d(new ni(0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 7, 0 == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f90823j = companion2.from(ArraysKt.first(y5.values()), a.f90832f);
        f90824k = companion2.from(ArraysKt.first(z5.values()), b.f90833f);
        f90825l = companion2.from(zvVar, c.f90834f);
        f90826m = companion2.from(gxVar, d.f90835f);
        f90827n = new ValueValidator() { // from class: k8.mq
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rq.f(((Double) obj).doubleValue());
            }
        };
        f90828o = new ValueValidator() { // from class: k8.nq
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rq.g(((Long) obj).longValue());
            }
        };
        f90829p = new ValueValidator() { // from class: k8.oq
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rq.h(((Long) obj).longValue());
            }
        };
        f90830q = new ListValidator() { // from class: k8.pq
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return rq.i(list);
            }
        };
        f90831r = new ListValidator() { // from class: k8.qq
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return rq.j(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
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
    public static final boolean i(List list) {
        return list.size() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(List list) {
        return list.size() >= 1;
    }
}
