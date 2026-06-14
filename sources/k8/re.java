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
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f90679a = new f(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a6 f90680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f90683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f90684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ep.e f90685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f90686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ep.d f90687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TypeHelper f90688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TypeHelper f90689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final TypeHelper f90690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeHelper f90691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeHelper f90692n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ValueValidator f90693o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ValueValidator f90694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ValueValidator f90695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ValueValidator f90696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ListValidator f90697s;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90698f = new a();

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
        public static final b f90699f = new b();

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
        public static final c f90700f = new c();

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
        public static final d f90701f = new d();

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
        public static final e f90702f = new e();

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
        private final my f90703a;

        public g(my myVar) {
            this.f90703a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public le deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f90703a.H());
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.f90703a.u0());
            a6 a6Var = (a6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.f90703a.q1());
            if (a6Var == null) {
                a6Var = re.f90680b;
            }
            a6 a6Var2 = a6Var;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f90703a.u0());
            TypeHelper typeHelper = re.f90688j;
            Function1 function1 = y5.f92620e;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = re.f90689k;
            Function1 function12 = z5.f92903e;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = re.f90693o;
            Expression expression = re.f90681c;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f90703a.t1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f90703a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f90703a.L1());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = re.f90682d;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression4 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "column_count", typeHelper5, function15, re.f90694p);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function15, re.f90695q);
            TypeHelper typeHelper6 = re.f90690l;
            Expression expression5 = re.f90683e;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression5);
            Expression expression6 = optionalExpression6 == null ? expression5 : optionalExpression6;
            TypeHelper typeHelper7 = re.f90691m;
            Expression expression7 = re.f90684f;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression7);
            Expression expression8 = optionalExpression7 == null ? expression7 : optionalExpression7;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f90703a.P2());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.f90703a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f90703a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f90703a.z3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f90703a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f90703a.Y6());
            if (epVar == null) {
                epVar = re.f90685g;
            }
            ep epVar2 = epVar;
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.f90703a.u0());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.f90703a.u0());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f90703a.M4());
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f90703a.P4());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.f90703a.u0());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f90703a.Y2());
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f90703a.Y2());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.f90703a.u0());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.f90703a.u0());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function15, re.f90696r);
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f90703a.u0());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f90703a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f90703a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f90703a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f90703a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f90703a.z1());
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, re.f90697s);
            List optionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f90703a.e9());
            List optionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f90703a.k9());
            TypeHelper typeHelper8 = re.f90692n;
            Function1 function16 = gx.f87924e;
            Expression expression9 = re.f90686h;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper8, function16, expression9);
            if (optionalExpression10 != null) {
                expression9 = optionalExpression10;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f90703a.w9());
            List optionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f90703a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f90703a.Y6());
            if (epVar3 == null) {
                epVar3 = re.f90687i;
            }
            return new le(g1Var, j1Var, a6Var2, optionalList, optionalExpression, optionalExpression2, expression, optionalList2, optionalList3, l7Var, expression3, expression4, optionalExpression5, expression6, expression8, optionalList4, optionalList5, optionalList6, bdVar, optionalList7, epVar2, optionalList8, optionalList9, str, optionalList10, zhVar, optionalList11, hbVar, hbVar2, optionalList12, optionalList13, optionalExpression8, optionalExpression9, optionalList14, optionalList15, wvVar, y7Var, r6Var, r6Var2, optionalList16, optionalList17, optionalList18, expression9, hxVar, optionalList19, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, le leVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", leVar.o(), this.f90703a.H());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", leVar.f88794b, this.f90703a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", leVar.f88795c, this.f90703a.q1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", leVar.f88796d, this.f90703a.u0());
            Expression expressionG = leVar.g();
            Function1 function1 = y5.f92619d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expressionG, function1);
            Expression expressionM = leVar.m();
            Function1 function12 = z5.f92902d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expressionM, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", leVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", leVar.w(), this.f90703a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, leVar.getBackground(), this.f90703a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, leVar.x(), this.f90703a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", leVar.f88803k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_count", leVar.f88804l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", leVar.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", leVar.f88806n, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", leVar.f88807o, function12);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", leVar.k(), this.f90703a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", leVar.f88809q, this.f90703a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", leVar.getExtensions(), this.f90703a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", leVar.n(), this.f90703a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", leVar.u(), this.f90703a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", leVar.getHeight(), this.f90703a.Y6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", leVar.f88814v, this.f90703a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", leVar.f88815w, this.f90703a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", leVar.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, leVar.f88817y, this.f90703a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", leVar.r(), this.f90703a.P4());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", leVar.A, this.f90703a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", leVar.d(), this.f90703a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", leVar.p(), this.f90703a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", leVar.D, this.f90703a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", leVar.E, this.f90703a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", leVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", leVar.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", leVar.q(), this.f90703a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", leVar.h(), this.f90703a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", leVar.getTransform(), this.f90703a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", leVar.j(), this.f90703a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", leVar.v(), this.f90703a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", leVar.i(), this.f90703a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", leVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "grid");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", leVar.s(), this.f90703a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", leVar.c(), this.f90703a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", leVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", leVar.t(), this.f90703a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", leVar.a(), this.f90703a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", leVar.getWidth(), this.f90703a.Y6());
            return jSONObject;
        }
    }

    public static final class h implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90704a;

        public h(my myVar) {
            this.f90704a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public se deserialize(ParsingContext parsingContext, se seVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, seVar != null ? seVar.f90999a : null, this.f90704a.I());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, seVar != null ? seVar.f91000b : null, this.f90704a.v0());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, seVar != null ? seVar.f91001c : null, this.f90704a.r1());
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, seVar != null ? seVar.f91002d : null, this.f90704a.v0());
            TypeHelper typeHelper = re.f90688j;
            Field field = seVar != null ? seVar.f91003e : null;
            Function1 function1 = y5.f92620e;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper typeHelper2 = re.f90689k;
            Field field2 = seVar != null ? seVar.f91004f : null;
            Function1 function12 = z5.f92903e;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, seVar != null ? seVar.f91005g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, re.f90693o);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, seVar != null ? seVar.f91006h : null, this.f90704a.u1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, seVar != null ? seVar.f91007i : null, this.f90704a.G1());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, seVar != null ? seVar.f91008j : null, this.f90704a.M1());
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, seVar != null ? seVar.f91009k : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field3 = seVar != null ? seVar.f91010l : null;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_count", typeHelper3, allowPropertyOverride, field3, function13, re.f90694p);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, seVar != null ? seVar.f91011m : null, function13, re.f90695q);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_horizontal", re.f90690l, allowPropertyOverride, seVar != null ? seVar.f91012n : null, function1);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "content_alignment_vertical", re.f90691m, allowPropertyOverride, seVar != null ? seVar.f91013o : null, function12);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, seVar != null ? seVar.f91014p : null, this.f90704a.Q2());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, seVar != null ? seVar.f91015q : null, this.f90704a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, seVar != null ? seVar.f91016r : null, this.f90704a.c3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, seVar != null ? seVar.f91017s : null, this.f90704a.A3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, seVar != null ? seVar.f91018t : null, this.f90704a.J3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, seVar != null ? seVar.f91019u : null, this.f90704a.Z6());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, seVar != null ? seVar.f91020v : null, this.f90704a.v0());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, seVar != null ? seVar.f91021w : null, this.f90704a.v0());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, seVar != null ? seVar.f91022x : null);
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, seVar != null ? seVar.f91023y : null, this.f90704a.N4());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, seVar != null ? seVar.f91024z : null, this.f90704a.Q4());
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, seVar != null ? seVar.A : null, this.f90704a.v0());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, seVar != null ? seVar.B : null, this.f90704a.Z2());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, seVar != null ? seVar.C : null, this.f90704a.Z2());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, seVar != null ? seVar.D : null, this.f90704a.v0());
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, seVar != null ? seVar.E : null, this.f90704a.v0());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, seVar != null ? seVar.F : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, seVar != null ? seVar.G : null, function13, re.f90696r);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, seVar != null ? seVar.H : null, this.f90704a.v0());
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, seVar != null ? seVar.I : null, this.f90704a.Q8());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, seVar != null ? seVar.J : null, this.f90704a.c9());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, seVar != null ? seVar.K : null, this.f90704a.V1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, seVar != null ? seVar.L : null, this.f90704a.A1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, seVar != null ? seVar.M : null, this.f90704a.A1());
            Field field4 = seVar != null ? seVar.N : null;
            Function1 function14 = aw.f86414e;
            ListValidator listValidator = re.f90697s;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new se(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalListField3, optionalField4, optionalFieldWithExpression4, fieldWithExpression, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalListField4, optionalListField5, optionalListField6, optionalField5, optionalListField7, optionalField6, optionalListField8, optionalListField9, optionalField7, optionalListField10, optionalField8, optionalListField11, optionalField9, optionalField10, optionalListField12, optionalListField13, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField14, optionalListField15, optionalField11, optionalField12, optionalField13, optionalField14, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, function14, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, seVar != null ? seVar.O : null, this.f90704a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, seVar != null ? seVar.P : null, this.f90704a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", re.f90692n, allowPropertyOverride, seVar != null ? seVar.Q : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, seVar != null ? seVar.R : null, this.f90704a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, seVar != null ? seVar.S : null, this.f90704a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, seVar != null ? seVar.T : null, this.f90704a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, se seVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", seVar.f90999a, this.f90704a.I());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", seVar.f91000b, this.f90704a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", seVar.f91001c, this.f90704a.r1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", seVar.f91002d, this.f90704a.v0());
            Field field = seVar.f91003e;
            Function1 function1 = y5.f92619d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = seVar.f91004f;
            Function1 function12 = z5.f92902d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", seVar.f91005g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", seVar.f91006h, this.f90704a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, seVar.f91007i, this.f90704a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, seVar.f91008j, this.f90704a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", seVar.f91009k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_count", seVar.f91010l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", seVar.f91011m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", seVar.f91012n, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", seVar.f91013o, function12);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", seVar.f91014p, this.f90704a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", seVar.f91015q, this.f90704a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", seVar.f91016r, this.f90704a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", seVar.f91017s, this.f90704a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", seVar.f91018t, this.f90704a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", seVar.f91019u, this.f90704a.Z6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", seVar.f91020v, this.f90704a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", seVar.f91021w, this.f90704a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", seVar.f91022x);
            JsonFieldParser.writeListField(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, seVar.f91023y, this.f90704a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", seVar.f91024z, this.f90704a.Q4());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", seVar.A, this.f90704a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", seVar.B, this.f90704a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", seVar.C, this.f90704a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", seVar.D, this.f90704a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", seVar.E, this.f90704a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", seVar.F);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", seVar.G);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", seVar.H, this.f90704a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", seVar.I, this.f90704a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", seVar.J, this.f90704a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", seVar.K, this.f90704a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", seVar.L, this.f90704a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", seVar.M, this.f90704a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", seVar.N, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "grid");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", seVar.O, this.f90704a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", seVar.P, this.f90704a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", seVar.Q, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", seVar.R, this.f90704a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", seVar.S, this.f90704a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", seVar.T, this.f90704a.Z6());
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
        private final my f90705a;

        public i(my myVar) {
            this.f90705a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public le resolve(ParsingContext parsingContext, se seVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, seVar.f90999a, jSONObject, "accessibility", this.f90705a.J(), this.f90705a.H());
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, seVar.f91000b, jSONObject, "action", this.f90705a.w0(), this.f90705a.u0());
            a6 a6Var = (a6) JsonFieldResolver.resolveOptional(parsingContext, seVar.f91001c, jSONObject, "action_animation", this.f90705a.s1(), this.f90705a.q1());
            if (a6Var == null) {
                a6Var = re.f90680b;
            }
            a6 a6Var2 = a6Var;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.f91002d, jSONObject, "actions", this.f90705a.w0(), this.f90705a.u0());
            Field field = seVar.f91003e;
            TypeHelper typeHelper = re.f90688j;
            Function1 function1 = y5.f92620e;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, function1);
            Field field2 = seVar.f91004f;
            TypeHelper typeHelper2 = re.f90689k;
            Function1 function12 = z5.f92903e;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, function12);
            Field field3 = seVar.f91005g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = re.f90693o;
            Expression expression = re.f90681c;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.f91006h, jSONObject, "animators", this.f90705a.v1(), this.f90705a.t1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.f91007i, jSONObject, H2.f75840g, this.f90705a.H1(), this.f90705a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, seVar.f91008j, jSONObject, OutlinedTextFieldKt.BorderId, this.f90705a.N1(), this.f90705a.L1());
            Field field4 = seVar.f91009k;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = re.f90682d;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = expressionResolveOptionalExpression4 == null ? expression2 : expressionResolveOptionalExpression4;
            Field field5 = seVar.f91010l;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field5, jSONObject, "column_count", typeHelper5, function15, re.f90694p);
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, seVar.f91011m, jSONObject, "column_span", typeHelper5, function15, re.f90695q);
            Field field6 = seVar.f91012n;
            TypeHelper typeHelper6 = re.f90690l;
            Expression expression4 = re.f90683e;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = expressionResolveOptionalExpression6 == null ? expression4 : expressionResolveOptionalExpression6;
            Field field7 = seVar.f91013o;
            TypeHelper typeHelper7 = re.f90691m;
            Expression expression6 = re.f90684f;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression6);
            Expression expression7 = expressionResolveOptionalExpression7 == null ? expression6 : expressionResolveOptionalExpression7;
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.f91014p, jSONObject, "disappear_actions", this.f90705a.R2(), this.f90705a.P2());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.f91015q, jSONObject, "doubletap_actions", this.f90705a.w0(), this.f90705a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.f91016r, jSONObject, "extensions", this.f90705a.d3(), this.f90705a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, seVar.f91017s, jSONObject, "focus", this.f90705a.B3(), this.f90705a.z3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.f91018t, jSONObject, "functions", this.f90705a.K3(), this.f90705a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, seVar.f91019u, jSONObject, "height", this.f90705a.a7(), this.f90705a.Y6());
            if (epVar == null) {
                epVar = re.f90685g;
            }
            ep epVar2 = epVar;
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.f91020v, jSONObject, "hover_end_actions", this.f90705a.w0(), this.f90705a.u0());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.f91021w, jSONObject, "hover_start_actions", this.f90705a.w0(), this.f90705a.u0());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, seVar.f91022x, jSONObject, "id");
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.f91023y, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f90705a.O4(), this.f90705a.M4());
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, seVar.f91024z, jSONObject, "layout_provider", this.f90705a.R4(), this.f90705a.P4());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.A, jSONObject, "longtap_actions", this.f90705a.w0(), this.f90705a.u0());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, seVar.B, jSONObject, "margins", this.f90705a.a3(), this.f90705a.Y2());
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, seVar.C, jSONObject, "paddings", this.f90705a.a3(), this.f90705a.Y2());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.D, jSONObject, "press_end_actions", this.f90705a.w0(), this.f90705a.u0());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.E, jSONObject, "press_start_actions", this.f90705a.w0(), this.f90705a.u0());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, seVar.F, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, seVar.G, jSONObject, "row_span", typeHelper5, function15, re.f90696r);
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.H, jSONObject, "selected_actions", this.f90705a.w0(), this.f90705a.u0());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.I, jSONObject, "tooltips", this.f90705a.R8(), this.f90705a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, seVar.J, jSONObject, "transform", this.f90705a.d9(), this.f90705a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, seVar.K, jSONObject, "transition_change", this.f90705a.W1(), this.f90705a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, seVar.L, jSONObject, "transition_in", this.f90705a.B1(), this.f90705a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, seVar.M, jSONObject, "transition_out", this.f90705a.B1(), this.f90705a.z1());
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.N, jSONObject, "transition_triggers", aw.f86414e, re.f90697s);
            List listResolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.O, jSONObject, "variable_triggers", this.f90705a.g9(), this.f90705a.e9());
            List listResolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.P, jSONObject, "variables", this.f90705a.m9(), this.f90705a.k9());
            Field field8 = seVar.Q;
            TypeHelper typeHelper8 = re.f90692n;
            Function1 function16 = gx.f87924e;
            Expression expression8 = re.f90686h;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "visibility", typeHelper8, function16, expression8);
            if (expressionResolveOptionalExpression10 != null) {
                expression8 = expressionResolveOptionalExpression10;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, seVar.R, jSONObject, "visibility_action", this.f90705a.y9(), this.f90705a.w9());
            List listResolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, seVar.S, jSONObject, "visibility_actions", this.f90705a.y9(), this.f90705a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, seVar.T, jSONObject, "width", this.f90705a.a7(), this.f90705a.Y6());
            if (epVar3 == null) {
                epVar3 = re.f90687i;
            }
            return new le(g1Var, j1Var, a6Var2, listResolveOptionalList, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList2, listResolveOptionalList3, l7Var, expression3, expressionResolveExpression, expressionResolveOptionalExpression5, expression5, expression7, listResolveOptionalList4, listResolveOptionalList5, listResolveOptionalList6, bdVar, listResolveOptionalList7, epVar2, listResolveOptionalList8, listResolveOptionalList9, str, listResolveOptionalList10, zhVar, listResolveOptionalList11, hbVar, hbVar2, listResolveOptionalList12, listResolveOptionalList13, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, listResolveOptionalList14, listResolveOptionalList15, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList16, listResolveOptionalList17, listResolveOptionalList18, expression8, hxVar, listResolveOptionalList19, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f90680b = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f90681c = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f90682d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        y5 y5Var = y5.START;
        f90683e = Expression.Companion.constant$default(companion, y5Var, null, 2, null);
        z5 z5Var = z5.TOP;
        f90684f = Expression.Companion.constant$default(companion, z5Var, null, 2, null);
        int i10 = 7;
        DefaultConstructorMarker defaultConstructorMarker = null;
        kp kpVar = null;
        f90685g = new ep.e(new nx(null, kpVar, null, i10, defaultConstructorMarker));
        gx gxVar = gx.VISIBLE;
        f90686h = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f90687i = new ep.d(new ni(0 == true ? 1 : 0, kpVar, 0 == true ? 1 : 0, i10, defaultConstructorMarker));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f90688j = companion2.from(ArraysKt.first(y5.values()), a.f90698f);
        f90689k = companion2.from(ArraysKt.first(z5.values()), b.f90699f);
        f90690l = companion2.from(y5Var, c.f90700f);
        f90691m = companion2.from(z5Var, d.f90701f);
        f90692n = companion2.from(gxVar, e.f90702f);
        f90693o = new ValueValidator() { // from class: k8.me
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return re.f(((Double) obj).doubleValue());
            }
        };
        f90694p = new ValueValidator() { // from class: k8.ne
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return re.g(((Long) obj).longValue());
            }
        };
        f90695q = new ValueValidator() { // from class: k8.oe
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return re.h(((Long) obj).longValue());
            }
        };
        f90696r = new ValueValidator() { // from class: k8.pe
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return re.i(((Long) obj).longValue());
            }
        };
        f90697s = new ListValidator() { // from class: k8.qe
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return re.j(list);
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
    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(List list) {
        return list.size() >= 1;
    }
}
