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
import k8.ep;
import k8.tp;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class yp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f92760a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f92761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ep.e f92762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f92763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f92764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f92765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f92766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ep.d f92767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final TypeHelper f92768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TypeHelper f92769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TypeHelper f92770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ValueValidator f92771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ValueValidator f92772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ValueValidator f92773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ListValidator f92774o;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92775f = new a();

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
        public static final b f92776f = new b();

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
        public static final c f92777f = new c();

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
        private final my f92778a;

        public e(my myVar) {
            this.f92778a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public tp deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f92778a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", yp.f92768i, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", yp.f92769j, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = yp.f92771l;
            Expression expression = yp.f92761b;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f92778a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f92778a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f92778a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, yp.f92772m);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f92778a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f92778a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f92778a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f92778a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f92778a.Y6());
            if (epVar == null) {
                epVar = yp.f92762c;
            }
            ep epVar2 = epVar;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = yp.f92763d;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper3, function13, expression2);
            Expression expression3 = optionalExpression5 == null ? expression2 : optionalExpression5;
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f92778a.P4());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f92778a.Y2());
            Expression expression4 = yp.f92764e;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_value", typeHelper2, function12, expression4);
            Expression expression5 = optionalExpression6 == null ? expression4 : optionalExpression6;
            Expression expression6 = yp.f92765f;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "min_value", typeHelper2, function12, expression6);
            Expression expression7 = optionalExpression7 == null ? expression6 : optionalExpression7;
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f92778a.Y2());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.f92778a.k7());
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, yp.f92773n);
            g1 g1Var2 = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "secondary_value_accessibility", this.f92778a.H());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f92778a.u0());
            cb cbVar = (cb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_style", this.f92778a.V2());
            tp.d dVar = (tp.d) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_text_style", this.f92778a.n7());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_value_variable");
            cb cbVar2 = (cb) JsonPropertyParser.read(parsingContext, jSONObject, "thumb_style", this.f92778a.V2());
            tp.d dVar2 = (tp.d) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_text_style", this.f92778a.n7());
            String str3 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_value_variable");
            cb cbVar3 = (cb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tick_mark_active_style", this.f92778a.V2());
            cb cbVar4 = (cb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tick_mark_inactive_style", this.f92778a.V2());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f92778a.P8());
            cb cbVar5 = (cb) JsonPropertyParser.read(parsingContext, jSONObject, "track_active_style", this.f92778a.V2());
            cb cbVar6 = (cb) JsonPropertyParser.read(parsingContext, jSONObject, "track_inactive_style", this.f92778a.V2());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f92778a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f92778a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f92778a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f92778a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, yp.f92774o);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f92778a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f92778a.k9());
            TypeHelper typeHelper4 = yp.f92770k;
            Function1 function14 = gx.f87924e;
            Expression expression8 = yp.f92766g;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, function14, expression8);
            if (optionalExpression10 != null) {
                expression8 = optionalExpression10;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f92778a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f92778a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f92778a.Y6());
            if (epVar3 == null) {
                epVar3 = yp.f92767h;
            }
            return new tp(g1Var, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, l7Var, optionalExpression4, optionalList3, optionalList4, bdVar, optionalList5, epVar2, str, expression3, zhVar, hbVar, expression5, expression7, hbVar2, optionalList6, optionalExpression8, optionalExpression9, g1Var2, optionalList7, cbVar, dVar, str2, cbVar2, dVar2, str3, cbVar3, cbVar4, optionalList8, cbVar5, cbVar6, wvVar, y7Var, r6Var, r6Var2, optionalList9, optionalList10, optionalList11, expression8, hxVar, optionalList12, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, tp tpVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", tpVar.o(), this.f92778a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", tpVar.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", tpVar.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", tpVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", tpVar.w(), this.f92778a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, tpVar.getBackground(), this.f92778a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, tpVar.x(), this.f92778a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", tpVar.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", tpVar.k(), this.f92778a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", tpVar.getExtensions(), this.f92778a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", tpVar.n(), this.f92778a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", tpVar.u(), this.f92778a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", tpVar.getHeight(), this.f92778a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", tpVar.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", tpVar.f91433o);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", tpVar.r(), this.f92778a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", tpVar.d(), this.f92778a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_value", tpVar.f91436r);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "min_value", tpVar.f91437s);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", tpVar.p(), this.f92778a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", tpVar.f91439u, this.f92778a.k7());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", tpVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", tpVar.e());
            JsonPropertyParser.write(parsingContext, jSONObject, "secondary_value_accessibility", tpVar.f91442x, this.f92778a.H());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", tpVar.q(), this.f92778a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_style", tpVar.f91444z, this.f92778a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_text_style", tpVar.A, this.f92778a.n7());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_value_variable", tpVar.B);
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_style", tpVar.C, this.f92778a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_text_style", tpVar.D, this.f92778a.n7());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_value_variable", tpVar.E);
            JsonPropertyParser.write(parsingContext, jSONObject, "tick_mark_active_style", tpVar.F, this.f92778a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "tick_mark_inactive_style", tpVar.G, this.f92778a.V2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", tpVar.h(), this.f92778a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "track_active_style", tpVar.I, this.f92778a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "track_inactive_style", tpVar.J, this.f92778a.V2());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", tpVar.getTransform(), this.f92778a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", tpVar.j(), this.f92778a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", tpVar.v(), this.f92778a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", tpVar.i(), this.f92778a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", tpVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slider");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", tpVar.s(), this.f92778a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", tpVar.c(), this.f92778a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", tpVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", tpVar.t(), this.f92778a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", tpVar.a(), this.f92778a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", tpVar.getWidth(), this.f92778a.Y6());
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92779a;

        public f(my myVar) {
            this.f92779a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cq deserialize(ParsingContext parsingContext, cq cqVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, cqVar != null ? cqVar.f86783a : null, this.f92779a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", yp.f92768i, allowPropertyOverride, cqVar != null ? cqVar.f86784b : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", yp.f92769j, allowPropertyOverride, cqVar != null ? cqVar.f86785c : null, z5.f92903e);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, cqVar != null ? cqVar.f86786d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, yp.f92771l);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, cqVar != null ? cqVar.f86787e : null, this.f92779a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, cqVar != null ? cqVar.f86788f : null, this.f92779a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, cqVar != null ? cqVar.f86789g : null, this.f92779a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = cqVar != null ? cqVar.f86790h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, function1, yp.f92772m);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, cqVar != null ? cqVar.f86791i : null, this.f92779a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, cqVar != null ? cqVar.f86792j : null, this.f92779a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, cqVar != null ? cqVar.f86793k : null, this.f92779a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, cqVar != null ? cqVar.f86794l : null, this.f92779a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, cqVar != null ? cqVar.f86795m : null, this.f92779a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, cqVar != null ? cqVar.f86796n : null);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, cqVar != null ? cqVar.f86797o : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, cqVar != null ? cqVar.f86798p : null, this.f92779a.Q4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, cqVar != null ? cqVar.f86799q : null, this.f92779a.Z2());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_value", typeHelper, allowPropertyOverride, cqVar != null ? cqVar.f86800r : null, function1);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "min_value", typeHelper, allowPropertyOverride, cqVar != null ? cqVar.f86801s : null, function1);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, cqVar != null ? cqVar.f86802t : null, this.f92779a.Z2());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, cqVar != null ? cqVar.f86803u : null, this.f92779a.l7());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, cqVar != null ? cqVar.f86804v : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, cqVar != null ? cqVar.f86805w : null, function1, yp.f92773n);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "secondary_value_accessibility", allowPropertyOverride, cqVar != null ? cqVar.f86806x : null, this.f92779a.I());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, cqVar != null ? cqVar.f86807y : null, this.f92779a.v0());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_style", allowPropertyOverride, cqVar != null ? cqVar.f86808z : null, this.f92779a.W2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_text_style", allowPropertyOverride, cqVar != null ? cqVar.A : null, this.f92779a.o7());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_secondary_value_variable", allowPropertyOverride, cqVar != null ? cqVar.B : null);
            Field field2 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_style", allowPropertyOverride, cqVar != null ? cqVar.C : null, this.f92779a.W2());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_text_style", allowPropertyOverride, cqVar != null ? cqVar.D : null, this.f92779a.o7());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "thumb_value_variable", allowPropertyOverride, cqVar != null ? cqVar.E : null);
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tick_mark_active_style", allowPropertyOverride, cqVar != null ? cqVar.F : null, this.f92779a.W2());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tick_mark_inactive_style", allowPropertyOverride, cqVar != null ? cqVar.G : null, this.f92779a.W2());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, cqVar != null ? cqVar.H : null, this.f92779a.Q8());
            Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, cqVar != null ? cqVar.I : null, this.f92779a.W2());
            Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, cqVar != null ? cqVar.J : null, this.f92779a.W2());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, cqVar != null ? cqVar.K : null, this.f92779a.c9());
            Field optionalField18 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, cqVar != null ? cqVar.L : null, this.f92779a.V1());
            Field optionalField19 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, cqVar != null ? cqVar.M : null, this.f92779a.A1());
            Field optionalField20 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, cqVar != null ? cqVar.N : null, this.f92779a.A1());
            Field field5 = cqVar != null ? cqVar.O : null;
            Function1 function12 = aw.f86414e;
            ListValidator listValidator = yp.f92774o;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new cq(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression5, optionalField6, optionalField7, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalField8, optionalListField6, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalField9, optionalListField7, optionalField10, optionalField11, optionalField12, field2, optionalField13, optionalField14, optionalField15, optionalField16, optionalListField8, field3, field4, optionalField17, optionalField18, optionalField19, optionalField20, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, function12, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, cqVar != null ? cqVar.P : null, this.f92779a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, cqVar != null ? cqVar.Q : null, this.f92779a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", yp.f92770k, allowPropertyOverride, cqVar != null ? cqVar.R : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, cqVar != null ? cqVar.S : null, this.f92779a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, cqVar != null ? cqVar.T : null, this.f92779a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, cqVar != null ? cqVar.U : null, this.f92779a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, cq cqVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", cqVar.f86783a, this.f92779a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", cqVar.f86784b, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", cqVar.f86785c, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", cqVar.f86786d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", cqVar.f86787e, this.f92779a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, cqVar.f86788f, this.f92779a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, cqVar.f86789g, this.f92779a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", cqVar.f86790h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", cqVar.f86791i, this.f92779a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", cqVar.f86792j, this.f92779a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", cqVar.f86793k, this.f92779a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", cqVar.f86794l, this.f92779a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", cqVar.f86795m, this.f92779a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", cqVar.f86796n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", cqVar.f86797o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", cqVar.f86798p, this.f92779a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", cqVar.f86799q, this.f92779a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_value", cqVar.f86800r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "min_value", cqVar.f86801s);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", cqVar.f86802t, this.f92779a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", cqVar.f86803u, this.f92779a.l7());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", cqVar.f86804v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", cqVar.f86805w);
            JsonFieldParser.writeField(parsingContext, jSONObject, "secondary_value_accessibility", cqVar.f86806x, this.f92779a.I());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", cqVar.f86807y, this.f92779a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_style", cqVar.f86808z, this.f92779a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_text_style", cqVar.A, this.f92779a.o7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_value_variable", cqVar.B);
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_style", cqVar.C, this.f92779a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_text_style", cqVar.D, this.f92779a.o7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_value_variable", cqVar.E);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tick_mark_active_style", cqVar.F, this.f92779a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "tick_mark_inactive_style", cqVar.G, this.f92779a.W2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", cqVar.H, this.f92779a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "track_active_style", cqVar.I, this.f92779a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "track_inactive_style", cqVar.J, this.f92779a.W2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", cqVar.K, this.f92779a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", cqVar.L, this.f92779a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", cqVar.M, this.f92779a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", cqVar.N, this.f92779a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", cqVar.O, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slider");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", cqVar.P, this.f92779a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", cqVar.Q, this.f92779a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", cqVar.R, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", cqVar.S, this.f92779a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", cqVar.T, this.f92779a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", cqVar.U, this.f92779a.Z6());
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
        private final my f92780a;

        public g(my myVar) {
            this.f92780a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public tp resolve(ParsingContext parsingContext, cq cqVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, cqVar.f86783a, jSONObject, "accessibility", this.f92780a.J(), this.f92780a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, cqVar.f86784b, jSONObject, "alignment_horizontal", yp.f92768i, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cqVar.f86785c, jSONObject, "alignment_vertical", yp.f92769j, z5.f92903e);
            Field field = cqVar.f86786d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = yp.f92771l;
            Expression expression = yp.f92761b;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.f86787e, jSONObject, "animators", this.f92780a.v1(), this.f92780a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.f86788f, jSONObject, H2.f75840g, this.f92780a.H1(), this.f92780a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, cqVar.f86789g, jSONObject, OutlinedTextFieldKt.BorderId, this.f92780a.N1(), this.f92780a.L1());
            Field field2 = cqVar.f86790h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, yp.f92772m);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.f86791i, jSONObject, "disappear_actions", this.f92780a.R2(), this.f92780a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.f86792j, jSONObject, "extensions", this.f92780a.d3(), this.f92780a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, cqVar.f86793k, jSONObject, "focus", this.f92780a.B3(), this.f92780a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.f86794l, jSONObject, "functions", this.f92780a.K3(), this.f92780a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, cqVar.f86795m, jSONObject, "height", this.f92780a.a7(), this.f92780a.Y6());
            if (epVar == null) {
                epVar = yp.f92762c;
            }
            ep epVar2 = epVar;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, cqVar.f86796n, jSONObject, "id");
            Field field3 = cqVar.f86797o;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = yp.f92763d;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper3, function13, expression2);
            Expression expression3 = expressionResolveOptionalExpression5 == null ? expression2 : expressionResolveOptionalExpression5;
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, cqVar.f86798p, jSONObject, "layout_provider", this.f92780a.R4(), this.f92780a.P4());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, cqVar.f86799q, jSONObject, "margins", this.f92780a.a3(), this.f92780a.Y2());
            Field field4 = cqVar.f86800r;
            Expression expression4 = yp.f92764e;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "max_value", typeHelper2, function12, expression4);
            Expression expression5 = expressionResolveOptionalExpression6 == null ? expression4 : expressionResolveOptionalExpression6;
            Field field5 = cqVar.f86801s;
            Expression expression6 = yp.f92765f;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "min_value", typeHelper2, function12, expression6);
            Expression expression7 = expressionResolveOptionalExpression7 == null ? expression6 : expressionResolveOptionalExpression7;
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, cqVar.f86802t, jSONObject, "paddings", this.f92780a.a3(), this.f92780a.Y2());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.f86803u, jSONObject, "ranges", this.f92780a.m7(), this.f92780a.k7());
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cqVar.f86804v, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cqVar.f86805w, jSONObject, "row_span", typeHelper2, function12, yp.f92773n);
            g1 g1Var2 = (g1) JsonFieldResolver.resolveOptional(parsingContext, cqVar.f86806x, jSONObject, "secondary_value_accessibility", this.f92780a.J(), this.f92780a.H());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.f86807y, jSONObject, "selected_actions", this.f92780a.w0(), this.f92780a.u0());
            cb cbVar = (cb) JsonFieldResolver.resolveOptional(parsingContext, cqVar.f86808z, jSONObject, "thumb_secondary_style", this.f92780a.X2(), this.f92780a.V2());
            tp.d dVar = (tp.d) JsonFieldResolver.resolveOptional(parsingContext, cqVar.A, jSONObject, "thumb_secondary_text_style", this.f92780a.p7(), this.f92780a.n7());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, cqVar.B, jSONObject, "thumb_secondary_value_variable");
            cb cbVar2 = (cb) JsonFieldResolver.resolve(parsingContext, cqVar.C, jSONObject, "thumb_style", this.f92780a.X2(), this.f92780a.V2());
            tp.d dVar2 = (tp.d) JsonFieldResolver.resolveOptional(parsingContext, cqVar.D, jSONObject, "thumb_text_style", this.f92780a.p7(), this.f92780a.n7());
            String str3 = (String) JsonFieldResolver.resolveOptional(parsingContext, cqVar.E, jSONObject, "thumb_value_variable");
            cb cbVar3 = (cb) JsonFieldResolver.resolveOptional(parsingContext, cqVar.F, jSONObject, "tick_mark_active_style", this.f92780a.X2(), this.f92780a.V2());
            cb cbVar4 = (cb) JsonFieldResolver.resolveOptional(parsingContext, cqVar.G, jSONObject, "tick_mark_inactive_style", this.f92780a.X2(), this.f92780a.V2());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.H, jSONObject, "tooltips", this.f92780a.R8(), this.f92780a.P8());
            cb cbVar5 = (cb) JsonFieldResolver.resolve(parsingContext, cqVar.I, jSONObject, "track_active_style", this.f92780a.X2(), this.f92780a.V2());
            cb cbVar6 = (cb) JsonFieldResolver.resolve(parsingContext, cqVar.J, jSONObject, "track_inactive_style", this.f92780a.X2(), this.f92780a.V2());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, cqVar.K, jSONObject, "transform", this.f92780a.d9(), this.f92780a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, cqVar.L, jSONObject, "transition_change", this.f92780a.W1(), this.f92780a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, cqVar.M, jSONObject, "transition_in", this.f92780a.B1(), this.f92780a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, cqVar.N, jSONObject, "transition_out", this.f92780a.B1(), this.f92780a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.O, jSONObject, "transition_triggers", aw.f86414e, yp.f92774o);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.P, jSONObject, "variable_triggers", this.f92780a.g9(), this.f92780a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.Q, jSONObject, "variables", this.f92780a.m9(), this.f92780a.k9());
            Field field6 = cqVar.R;
            TypeHelper typeHelper4 = yp.f92770k;
            Function1 function14 = gx.f87924e;
            Expression expression8 = yp.f92766g;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "visibility", typeHelper4, function14, expression8);
            if (expressionResolveOptionalExpression10 != null) {
                expression8 = expressionResolveOptionalExpression10;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, cqVar.S, jSONObject, "visibility_action", this.f92780a.y9(), this.f92780a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, cqVar.T, jSONObject, "visibility_actions", this.f92780a.y9(), this.f92780a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, cqVar.U, jSONObject, "width", this.f92780a.a7(), this.f92780a.Y6());
            if (epVar3 == null) {
                epVar3 = yp.f92767h;
            }
            return new tp(g1Var, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, l7Var, expressionResolveOptionalExpression4, listResolveOptionalList3, listResolveOptionalList4, bdVar, listResolveOptionalList5, epVar2, str, expression3, zhVar, hbVar, expression5, expression7, hbVar2, listResolveOptionalList6, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, g1Var2, listResolveOptionalList7, cbVar, dVar, str2, cbVar2, dVar2, str3, cbVar3, cbVar4, listResolveOptionalList8, cbVar5, cbVar6, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression8, hxVar, listResolveOptionalList12, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92761b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f92762c = new ep.e(new nx(null, null, null, 7, null));
        f92763d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f92764e = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        f92765f = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        gx gxVar = gx.VISIBLE;
        f92766g = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f92767h = new ep.d(new ni(null, null, 0 == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f92768i = companion2.from(ArraysKt.first(y5.values()), a.f92775f);
        f92769j = companion2.from(ArraysKt.first(z5.values()), b.f92776f);
        f92770k = companion2.from(gxVar, c.f92777f);
        f92771l = new ValueValidator() { // from class: k8.up
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return yp.e(((Double) obj).doubleValue());
            }
        };
        f92772m = new ValueValidator() { // from class: k8.vp
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return yp.f(((Long) obj).longValue());
            }
        };
        f92773n = new ValueValidator() { // from class: k8.wp
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return yp.g(((Long) obj).longValue());
            }
        };
        f92774o = new ListValidator() { // from class: k8.xp
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return yp.h(list);
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
