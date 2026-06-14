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
import k8.go;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f89026a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a6 f89027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f89028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f89029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ep.e f89030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f89031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ep.d f89032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TypeHelper f89033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final TypeHelper f89034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TypeHelper f89035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ValueValidator f89036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ValueValidator f89037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ValueValidator f89038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ListValidator f89039n;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f89040f = new a();

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
        public static final b f89041f = new b();

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
        public static final c f89042f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof gx);
        }
    }

    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public static final class e implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f89043a;

        public e(my myVar) {
            this.f89043a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public go deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f89043a.H());
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f89043a.u0());
            a6 a6Var = (a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f89043a.q1());
            if (a6Var == null) {
                a6Var = mo.f89027b;
            }
            a6 a6Var2 = a6Var;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f89043a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", mo.f89033h, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", mo.f89034i, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = mo.f89036k;
            Expression expression = mo.f89028c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f89043a.t1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f89043a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f89043a.L1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = mo.f89029d;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, function12, expression2);
            Expression expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, function13, mo.f89037l);
            go.c cVar = (go.c) JsonPropertyParser.readOptional(parsingContext, jSONObject, "delimiter_style", this.f89043a.J6());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f89043a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f89043a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f89043a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f89043a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f89043a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f89043a.Y6());
            if (epVar == null) {
                epVar = mo.f89030e;
            }
            ep epVar2 = epVar;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f89043a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f89043a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f89043a.P4());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f89043a.u0());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f89043a.Y2());
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f89043a.Y2());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f89043a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f89043a.u0());
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, function13, mo.f89038m);
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f89043a.u0());
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f89043a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f89043a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f89043a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f89043a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f89043a.z1());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, mo.f89039n);
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f89043a.e9());
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f89043a.k9());
            TypeHelper typeHelper4 = mo.f89035j;
            Function1 function14 = gx.f87924e;
            Expression expression4 = mo.f89031f;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, function14, expression4);
            if (optionalExpression8 != null) {
                expression4 = optionalExpression8;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f89043a.w9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f89043a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f89043a.Y6());
            if (epVar3 == null) {
                epVar3 = mo.f89032g;
            }
            return new go(g1Var, j1Var, a6Var2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalList3, l7Var, expression3, optionalExpression5, cVar, optionalList4, optionalList5, optionalList6, bdVar, optionalList7, epVar2, optionalList8, optionalList9, str, zhVar, optionalList10, hbVar, hbVar2, optionalList11, optionalList12, optionalExpression6, optionalExpression7, optionalList13, optionalList14, wvVar, y7Var, r6Var, r6Var2, optionalList15, optionalList16, optionalList17, expression4, hxVar, optionalList18, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, go goVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", goVar.o(), this.f89043a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", goVar.f87848b, this.f89043a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", goVar.f87849c, this.f89043a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", goVar.f87850d, this.f89043a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", goVar.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", goVar.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", goVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", goVar.w(), this.f89043a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, goVar.getBackground(), this.f89043a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, goVar.x(), this.f89043a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", goVar.f87857k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", goVar.b());
            JsonPropertyParser.write(parsingContext, jSONObject, "delimiter_style", goVar.f87859m, this.f89043a.J6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", goVar.k(), this.f89043a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", goVar.f87861o, this.f89043a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", goVar.getExtensions(), this.f89043a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", goVar.n(), this.f89043a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", goVar.u(), this.f89043a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", goVar.getHeight(), this.f89043a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", goVar.f87866t, this.f89043a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", goVar.f87867u, this.f89043a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", goVar.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", goVar.r(), this.f89043a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", goVar.f87870x, this.f89043a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", goVar.d(), this.f89043a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", goVar.p(), this.f89043a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", goVar.A, this.f89043a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", goVar.B, this.f89043a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", goVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", goVar.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", goVar.q(), this.f89043a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", goVar.h(), this.f89043a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", goVar.getTransform(), this.f89043a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", goVar.j(), this.f89043a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", goVar.v(), this.f89043a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", goVar.i(), this.f89043a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", goVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "separator");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", goVar.s(), this.f89043a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", goVar.c(), this.f89043a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", goVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", goVar.t(), this.f89043a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", goVar.a(), this.f89043a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", goVar.getWidth(), this.f89043a.Y6());
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f89044a;

        public f(my myVar) {
            this.f89044a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public no deserialize(ParsingContext parsingContext, no noVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, noVar != null ? noVar.f90062a : null, this.f89044a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, noVar != null ? noVar.f90063b : null, this.f89044a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, noVar != null ? noVar.f90064c : null, this.f89044a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, noVar != null ? noVar.f90065d : null, this.f89044a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", mo.f89033h, allowPropertyOverride, noVar != null ? noVar.f90066e : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", mo.f89034i, allowPropertyOverride, noVar != null ? noVar.f90067f : null, z5.f92903e);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, noVar != null ? noVar.f90068g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, mo.f89036k);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, noVar != null ? noVar.f90069h : null, this.f89044a.u1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, noVar != null ? noVar.f90070i : null, this.f89044a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, noVar != null ? noVar.f90071j : null, this.f89044a.M1());
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, noVar != null ? noVar.f90072k : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = noVar != null ? noVar.f90073l : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, function1, mo.f89037l);
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "delimiter_style", allowPropertyOverride, noVar != null ? noVar.f90074m : null, this.f89044a.K6());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, noVar != null ? noVar.f90075n : null, this.f89044a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, noVar != null ? noVar.f90076o : null, this.f89044a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, noVar != null ? noVar.f90077p : null, this.f89044a.c3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, noVar != null ? noVar.f90078q : null, this.f89044a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, noVar != null ? noVar.f90079r : null, this.f89044a.J3());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, noVar != null ? noVar.f90080s : null, this.f89044a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, noVar != null ? noVar.f90081t : null, this.f89044a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, noVar != null ? noVar.f90082u : null, this.f89044a.v0());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, noVar != null ? noVar.f90083v : null);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, noVar != null ? noVar.f90084w : null, this.f89044a.Q4());
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, noVar != null ? noVar.f90085x : null, this.f89044a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, noVar != null ? noVar.f90086y : null, this.f89044a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, noVar != null ? noVar.f90087z : null, this.f89044a.Z2());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, noVar != null ? noVar.A : null, this.f89044a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, noVar != null ? noVar.B : null, this.f89044a.v0());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, noVar != null ? noVar.C : null);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, noVar != null ? noVar.D : null, function1, mo.f89038m);
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, noVar != null ? noVar.E : null, this.f89044a.v0());
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, noVar != null ? noVar.F : null, this.f89044a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, noVar != null ? noVar.G : null, this.f89044a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, noVar != null ? noVar.H : null, this.f89044a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, noVar != null ? noVar.I : null, this.f89044a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, noVar != null ? noVar.J : null, this.f89044a.A1());
            Field field2 = noVar != null ? noVar.K : null;
            Function1 function12 = aw.f86414e;
            ListValidator listValidator = mo.f89039n;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new no(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalListField3, optionalField4, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalField5, optionalListField4, optionalListField5, optionalListField6, optionalField6, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalField9, optionalListField10, optionalField10, optionalField11, optionalListField11, optionalListField12, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField13, optionalListField14, optionalField12, optionalField13, optionalField14, optionalField15, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field2, function12, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, noVar != null ? noVar.L : null, this.f89044a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, noVar != null ? noVar.M : null, this.f89044a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", mo.f89035j, allowPropertyOverride, noVar != null ? noVar.N : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, noVar != null ? noVar.O : null, this.f89044a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, noVar != null ? noVar.P : null, this.f89044a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, noVar != null ? noVar.Q : null, this.f89044a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, no noVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", noVar.f90062a, this.f89044a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", noVar.f90063b, this.f89044a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", noVar.f90064c, this.f89044a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", noVar.f90065d, this.f89044a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", noVar.f90066e, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", noVar.f90067f, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", noVar.f90068g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", noVar.f90069h, this.f89044a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, noVar.f90070i, this.f89044a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, noVar.f90071j, this.f89044a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", noVar.f90072k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", noVar.f90073l);
            JsonFieldParser.writeField(parsingContext, jSONObject, "delimiter_style", noVar.f90074m, this.f89044a.K6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", noVar.f90075n, this.f89044a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", noVar.f90076o, this.f89044a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", noVar.f90077p, this.f89044a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", noVar.f90078q, this.f89044a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", noVar.f90079r, this.f89044a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", noVar.f90080s, this.f89044a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", noVar.f90081t, this.f89044a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", noVar.f90082u, this.f89044a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", noVar.f90083v);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", noVar.f90084w, this.f89044a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", noVar.f90085x, this.f89044a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", noVar.f90086y, this.f89044a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", noVar.f90087z, this.f89044a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", noVar.A, this.f89044a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", noVar.B, this.f89044a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", noVar.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", noVar.D);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", noVar.E, this.f89044a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", noVar.F, this.f89044a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", noVar.G, this.f89044a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", noVar.H, this.f89044a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", noVar.I, this.f89044a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", noVar.J, this.f89044a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", noVar.K, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "separator");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", noVar.L, this.f89044a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", noVar.M, this.f89044a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", noVar.N, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", noVar.O, this.f89044a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", noVar.P, this.f89044a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", noVar.Q, this.f89044a.Z6());
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

    public static final class g implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f89045a;

        public g(my myVar) {
            this.f89045a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public go resolve(ParsingContext parsingContext, no noVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90062a, jSONObject, "accessibility", this.f89045a.J(), this.f89045a.H());
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90063b, jSONObject, "action", this.f89045a.w0(), this.f89045a.u0());
            a6 a6Var = (a6) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90064c, jSONObject, "action_animation", this.f89045a.s1(), this.f89045a.q1());
            if (a6Var == null) {
                a6Var = mo.f89027b;
            }
            a6 a6Var2 = a6Var;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.f90065d, jSONObject, "actions", this.f89045a.w0(), this.f89045a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, noVar.f90066e, jSONObject, "alignment_horizontal", mo.f89033h, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, noVar.f90067f, jSONObject, "alignment_vertical", mo.f89034i, z5.f92903e);
            Field field = noVar.f90068g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = mo.f89036k;
            Expression expression = mo.f89028c;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.f90069h, jSONObject, "animators", this.f89045a.v1(), this.f89045a.t1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.f90070i, jSONObject, H2.f75840g, this.f89045a.H1(), this.f89045a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90071j, jSONObject, OutlinedTextFieldKt.BorderId, this.f89045a.N1(), this.f89045a.L1());
            Field field2 = noVar.f90072k;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = mo.f89029d;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper2, function12, expression2);
            Expression expression3 = expressionResolveOptionalExpression4 == null ? expression2 : expressionResolveOptionalExpression4;
            Field field3 = noVar.f90073l;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper3, function13, mo.f89037l);
            go.c cVar = (go.c) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90074m, jSONObject, "delimiter_style", this.f89045a.L6(), this.f89045a.J6());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.f90075n, jSONObject, "disappear_actions", this.f89045a.R2(), this.f89045a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.f90076o, jSONObject, "doubletap_actions", this.f89045a.w0(), this.f89045a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.f90077p, jSONObject, "extensions", this.f89045a.d3(), this.f89045a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90078q, jSONObject, "focus", this.f89045a.B3(), this.f89045a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.f90079r, jSONObject, "functions", this.f89045a.K3(), this.f89045a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90080s, jSONObject, "height", this.f89045a.a7(), this.f89045a.Y6());
            if (epVar == null) {
                epVar = mo.f89030e;
            }
            ep epVar2 = epVar;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.f90081t, jSONObject, "hover_end_actions", this.f89045a.w0(), this.f89045a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.f90082u, jSONObject, "hover_start_actions", this.f89045a.w0(), this.f89045a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90083v, jSONObject, "id");
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90084w, jSONObject, "layout_provider", this.f89045a.R4(), this.f89045a.P4());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.f90085x, jSONObject, "longtap_actions", this.f89045a.w0(), this.f89045a.u0());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90086y, jSONObject, "margins", this.f89045a.a3(), this.f89045a.Y2());
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, noVar.f90087z, jSONObject, "paddings", this.f89045a.a3(), this.f89045a.Y2());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.A, jSONObject, "press_end_actions", this.f89045a.w0(), this.f89045a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.B, jSONObject, "press_start_actions", this.f89045a.w0(), this.f89045a.u0());
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, noVar.C, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, noVar.D, jSONObject, "row_span", typeHelper3, function13, mo.f89038m);
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.E, jSONObject, "selected_actions", this.f89045a.w0(), this.f89045a.u0());
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.F, jSONObject, "tooltips", this.f89045a.R8(), this.f89045a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, noVar.G, jSONObject, "transform", this.f89045a.d9(), this.f89045a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, noVar.H, jSONObject, "transition_change", this.f89045a.W1(), this.f89045a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, noVar.I, jSONObject, "transition_in", this.f89045a.B1(), this.f89045a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, noVar.J, jSONObject, "transition_out", this.f89045a.B1(), this.f89045a.z1());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.K, jSONObject, "transition_triggers", aw.f86414e, mo.f89039n);
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.L, jSONObject, "variable_triggers", this.f89045a.g9(), this.f89045a.e9());
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.M, jSONObject, "variables", this.f89045a.m9(), this.f89045a.k9());
            Field field4 = noVar.N;
            TypeHelper typeHelper4 = mo.f89035j;
            Function1 function14 = gx.f87924e;
            Expression expression4 = mo.f89031f;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "visibility", typeHelper4, function14, expression4);
            if (expressionResolveOptionalExpression8 != null) {
                expression4 = expressionResolveOptionalExpression8;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, noVar.O, jSONObject, "visibility_action", this.f89045a.y9(), this.f89045a.w9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, noVar.P, jSONObject, "visibility_actions", this.f89045a.y9(), this.f89045a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, noVar.Q, jSONObject, "width", this.f89045a.a7(), this.f89045a.Y6());
            if (epVar3 == null) {
                epVar3 = mo.f89032g;
            }
            return new go(g1Var, j1Var, a6Var2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList2, listResolveOptionalList3, l7Var, expression3, expressionResolveOptionalExpression5, cVar, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, bdVar, listResolveOptionalList7, epVar2, listResolveOptionalList8, listResolveOptionalList9, str, zhVar, listResolveOptionalList10, hbVar, hbVar2, listResolveOptionalList11, listResolveOptionalList12, expressionResolveOptionalExpression6, expressionResolveOptionalExpression7, listResolveOptionalList13, listResolveOptionalList14, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList15, listResolveOptionalList16, listResolveOptionalList17, expression4, hxVar, listResolveOptionalList18, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        kp kpVar = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        f89027b = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f89028c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f89029d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        int i10 = 7;
        f89030e = new ep.e(new nx(null, kpVar, null, i10, defaultConstructorMarker));
        gx gxVar = gx.VISIBLE;
        f89031f = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f89032g = new ep.d(new ni(0 == true ? 1 : 0, kpVar, 0 == true ? 1 : 0, i10, defaultConstructorMarker));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f89033h = companion2.from(ArraysKt.first(y5.values()), a.f89040f);
        f89034i = companion2.from(ArraysKt.first(z5.values()), b.f89041f);
        f89035j = companion2.from(gxVar, c.f89042f);
        f89036k = new ValueValidator() { // from class: k8.io
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return mo.e(((Double) obj).doubleValue());
            }
        };
        f89037l = new ValueValidator() { // from class: k8.jo
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return mo.f(((Long) obj).longValue());
            }
        };
        f89038m = new ValueValidator() { // from class: k8.ko
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return mo.g(((Long) obj).longValue());
            }
        };
        f89039n = new ListValidator() { // from class: k8.lo
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return mo.h(list);
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
