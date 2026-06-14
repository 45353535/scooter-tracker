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
import k8.ep;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f86639a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f86640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ep.e f86641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f86642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ep.d f86643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TypeHelper f86644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f86645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TypeHelper f86646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValueValidator f86647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ValueValidator f86648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ValueValidator f86649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ListValidator f86650l;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86651f = new a();

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
        public static final b f86652f = new b();

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
        public static final c f86653f = new c();

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
        private final my f86654a;

        public e(my myVar) {
            this.f86654a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x9 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f86654a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", ca.f86644f, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", ca.f86645g, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ca.f86647i;
            Expression expression = ca.f86640b;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f86654a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f86654a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f86654a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, ca.f86648j);
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "custom_props");
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "custom_type");
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f86654a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f86654a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f86654a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f86654a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f86654a.Y6());
            if (epVar == null) {
                epVar = ca.f86641c;
            }
            ep epVar2 = epVar;
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f86654a.M4());
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f86654a.P4());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f86654a.Y2());
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f86654a.Y2());
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, ca.f86649k);
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f86654a.u0());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f86654a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f86654a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f86654a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f86654a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f86654a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, ca.f86650l);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f86654a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f86654a.k9());
            TypeHelper typeHelper3 = ca.f86646h;
            Function1 function13 = gx.f87924e;
            Expression expression2 = ca.f86642d;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper3, function13, expression2);
            if (optionalExpression7 != null) {
                expression2 = optionalExpression7;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f86654a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f86654a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f86654a.Y6());
            if (epVar3 == null) {
                epVar3 = ca.f86643e;
            }
            return new x9(g1Var, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, l7Var, optionalExpression4, jSONObject2, str, optionalList3, optionalList4, bdVar, optionalList5, epVar2, str2, optionalList6, zhVar, hbVar, hbVar2, optionalExpression5, optionalExpression6, optionalList7, optionalList8, wvVar, y7Var, r6Var, r6Var2, optionalList9, optionalList10, optionalList11, expression2, hxVar, optionalList12, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, x9 x9Var) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", x9Var.o(), this.f86654a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", x9Var.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", x9Var.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", x9Var.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", x9Var.w(), this.f86654a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, x9Var.getBackground(), this.f86654a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, x9Var.x(), this.f86654a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", x9Var.b());
            JsonPropertyParser.write(parsingContext, jSONObject, "custom_props", x9Var.f92310i);
            JsonPropertyParser.write(parsingContext, jSONObject, "custom_type", x9Var.f92311j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", x9Var.k(), this.f86654a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", x9Var.getExtensions(), this.f86654a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", x9Var.n(), this.f86654a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", x9Var.u(), this.f86654a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", x9Var.getHeight(), this.f86654a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", x9Var.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, x9Var.f92318q, this.f86654a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", x9Var.r(), this.f86654a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", x9Var.d(), this.f86654a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", x9Var.p(), this.f86654a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", x9Var.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", x9Var.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", x9Var.q(), this.f86654a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", x9Var.h(), this.f86654a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", x9Var.getTransform(), this.f86654a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", x9Var.j(), this.f86654a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", x9Var.v(), this.f86654a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", x9Var.i(), this.f86654a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", x9Var.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "custom");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", x9Var.s(), this.f86654a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", x9Var.c(), this.f86654a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", x9Var.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", x9Var.t(), this.f86654a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", x9Var.a(), this.f86654a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", x9Var.getWidth(), this.f86654a.Y6());
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86655a;

        public f(my myVar) {
            this.f86655a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public da deserialize(ParsingContext parsingContext, da daVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, daVar != null ? daVar.f86966a : null, this.f86655a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", ca.f86644f, allowPropertyOverride, daVar != null ? daVar.f86967b : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", ca.f86645g, allowPropertyOverride, daVar != null ? daVar.f86968c : null, z5.f92903e);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, daVar != null ? daVar.f86969d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, ca.f86647i);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, daVar != null ? daVar.f86970e : null, this.f86655a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, daVar != null ? daVar.f86971f : null, this.f86655a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, daVar != null ? daVar.f86972g : null, this.f86655a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = daVar != null ? daVar.f86973h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, function1, ca.f86648j);
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "custom_props", allowPropertyOverride, daVar != null ? daVar.f86974i : null);
            Field field2 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "custom_type", allowPropertyOverride, daVar != null ? daVar.f86975j : null);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, daVar != null ? daVar.f86976k : null, this.f86655a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, daVar != null ? daVar.f86977l : null, this.f86655a.c3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, daVar != null ? daVar.f86978m : null, this.f86655a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, daVar != null ? daVar.f86979n : null, this.f86655a.J3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, daVar != null ? daVar.f86980o : null, this.f86655a.Z6());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, daVar != null ? daVar.f86981p : null);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, daVar != null ? daVar.f86982q : null, this.f86655a.N4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, daVar != null ? daVar.f86983r : null, this.f86655a.Q4());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, daVar != null ? daVar.f86984s : null, this.f86655a.Z2());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, daVar != null ? daVar.f86985t : null, this.f86655a.Z2());
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, daVar != null ? daVar.f86986u : null);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, daVar != null ? daVar.f86987v : null, function1, ca.f86649k);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, daVar != null ? daVar.f86988w : null, this.f86655a.v0());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, daVar != null ? daVar.f86989x : null, this.f86655a.Q8());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, daVar != null ? daVar.f86990y : null, this.f86655a.c9());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, daVar != null ? daVar.f86991z : null, this.f86655a.V1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, daVar != null ? daVar.A : null, this.f86655a.A1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, daVar != null ? daVar.B : null, this.f86655a.A1());
            Field field3 = daVar != null ? daVar.C : null;
            Function1 function12 = aw.f86414e;
            ListValidator listValidator = ca.f86650l;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new da(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalField3, field2, optionalListField3, optionalListField4, optionalField4, optionalListField5, optionalField5, optionalField6, optionalListField6, optionalField7, optionalField8, optionalField9, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField7, optionalListField8, optionalField10, optionalField11, optionalField12, optionalField13, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, function12, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, daVar != null ? daVar.D : null, this.f86655a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, daVar != null ? daVar.E : null, this.f86655a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", ca.f86646h, allowPropertyOverride, daVar != null ? daVar.F : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, daVar != null ? daVar.G : null, this.f86655a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, daVar != null ? daVar.H : null, this.f86655a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, daVar != null ? daVar.I : null, this.f86655a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, da daVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", daVar.f86966a, this.f86655a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", daVar.f86967b, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", daVar.f86968c, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", daVar.f86969d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", daVar.f86970e, this.f86655a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, daVar.f86971f, this.f86655a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, daVar.f86972g, this.f86655a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", daVar.f86973h);
            JsonFieldParser.writeField(parsingContext, jSONObject, "custom_props", daVar.f86974i);
            JsonFieldParser.writeField(parsingContext, jSONObject, "custom_type", daVar.f86975j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", daVar.f86976k, this.f86655a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", daVar.f86977l, this.f86655a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", daVar.f86978m, this.f86655a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", daVar.f86979n, this.f86655a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", daVar.f86980o, this.f86655a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", daVar.f86981p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, daVar.f86982q, this.f86655a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", daVar.f86983r, this.f86655a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", daVar.f86984s, this.f86655a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", daVar.f86985t, this.f86655a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", daVar.f86986u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", daVar.f86987v);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", daVar.f86988w, this.f86655a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", daVar.f86989x, this.f86655a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", daVar.f86990y, this.f86655a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", daVar.f86991z, this.f86655a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", daVar.A, this.f86655a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", daVar.B, this.f86655a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", daVar.C, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "custom");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", daVar.D, this.f86655a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", daVar.E, this.f86655a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", daVar.F, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", daVar.G, this.f86655a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", daVar.H, this.f86655a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", daVar.I, this.f86655a.Z6());
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
        private final my f86656a;

        public g(my myVar) {
            this.f86656a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x9 resolve(ParsingContext parsingContext, da daVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86966a, jSONObject, "accessibility", this.f86656a.J(), this.f86656a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.f86967b, jSONObject, "alignment_horizontal", ca.f86644f, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.f86968c, jSONObject, "alignment_vertical", ca.f86645g, z5.f92903e);
            Field field = daVar.f86969d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ca.f86647i;
            Expression expression = ca.f86640b;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f86970e, jSONObject, "animators", this.f86656a.v1(), this.f86656a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f86971f, jSONObject, H2.f75840g, this.f86656a.H1(), this.f86656a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86972g, jSONObject, OutlinedTextFieldKt.BorderId, this.f86656a.N1(), this.f86656a.L1());
            Field field2 = daVar.f86973h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, ca.f86648j);
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86974i, jSONObject, "custom_props");
            String str = (String) JsonFieldResolver.resolve(parsingContext, daVar.f86975j, jSONObject, "custom_type");
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f86976k, jSONObject, "disappear_actions", this.f86656a.R2(), this.f86656a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f86977l, jSONObject, "extensions", this.f86656a.d3(), this.f86656a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86978m, jSONObject, "focus", this.f86656a.B3(), this.f86656a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f86979n, jSONObject, "functions", this.f86656a.K3(), this.f86656a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86980o, jSONObject, "height", this.f86656a.a7(), this.f86656a.Y6());
            if (epVar == null) {
                epVar = ca.f86641c;
            }
            ep epVar2 = epVar;
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86981p, jSONObject, "id");
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f86982q, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f86656a.O4(), this.f86656a.M4());
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86983r, jSONObject, "layout_provider", this.f86656a.R4(), this.f86656a.P4());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86984s, jSONObject, "margins", this.f86656a.a3(), this.f86656a.Y2());
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86985t, jSONObject, "paddings", this.f86656a.a3(), this.f86656a.Y2());
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.f86986u, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, daVar.f86987v, jSONObject, "row_span", typeHelper2, function12, ca.f86649k);
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f86988w, jSONObject, "selected_actions", this.f86656a.w0(), this.f86656a.u0());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.f86989x, jSONObject, "tooltips", this.f86656a.R8(), this.f86656a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86990y, jSONObject, "transform", this.f86656a.d9(), this.f86656a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, daVar.f86991z, jSONObject, "transition_change", this.f86656a.W1(), this.f86656a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, daVar.A, jSONObject, "transition_in", this.f86656a.B1(), this.f86656a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, daVar.B, jSONObject, "transition_out", this.f86656a.B1(), this.f86656a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.C, jSONObject, "transition_triggers", aw.f86414e, ca.f86650l);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.D, jSONObject, "variable_triggers", this.f86656a.g9(), this.f86656a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.E, jSONObject, "variables", this.f86656a.m9(), this.f86656a.k9());
            Field field3 = daVar.F;
            TypeHelper typeHelper3 = ca.f86646h;
            Function1 function13 = gx.f87924e;
            Expression expression2 = ca.f86642d;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "visibility", typeHelper3, function13, expression2);
            if (expressionResolveOptionalExpression7 != null) {
                expression2 = expressionResolveOptionalExpression7;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, daVar.G, jSONObject, "visibility_action", this.f86656a.y9(), this.f86656a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, daVar.H, jSONObject, "visibility_actions", this.f86656a.y9(), this.f86656a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, daVar.I, jSONObject, "width", this.f86656a.a7(), this.f86656a.Y6());
            if (epVar3 == null) {
                epVar3 = ca.f86643e;
            }
            return new x9(g1Var, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, l7Var, expressionResolveOptionalExpression4, jSONObject2, str, listResolveOptionalList3, listResolveOptionalList4, bdVar, listResolveOptionalList5, epVar2, str2, listResolveOptionalList6, zhVar, hbVar, hbVar2, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6, listResolveOptionalList7, listResolveOptionalList8, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression2, hxVar, listResolveOptionalList12, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f86640b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f86641c = new ep.e(new nx(null, null, null, 7, null));
        gx gxVar = gx.VISIBLE;
        f86642d = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f86643e = new ep.d(new ni(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f86644f = companion2.from(ArraysKt.first(y5.values()), a.f86651f);
        f86645g = companion2.from(ArraysKt.first(z5.values()), b.f86652f);
        f86646h = companion2.from(gxVar, c.f86653f);
        f86647i = new ValueValidator() { // from class: k8.y9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ca.e(((Double) obj).doubleValue());
            }
        };
        f86648j = new ValueValidator() { // from class: k8.z9
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ca.f(((Long) obj).longValue());
            }
        };
        f86649k = new ValueValidator() { // from class: k8.aa
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ca.g(((Long) obj).longValue());
            }
        };
        f86650l = new ListValidator() { // from class: k8.ba
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return ca.h(list);
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
