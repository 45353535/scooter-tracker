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
import k8.jk;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f90388a = new g(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ep.e f90392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f90393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xc f90394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f90395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression f90396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression f90397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression f90398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ep.d f90399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeHelper f90400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeHelper f90401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TypeHelper f90402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TypeHelper f90403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final TypeHelper f90404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final TypeHelper f90405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ValueValidator f90406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ValueValidator f90407t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ValueValidator f90408u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ValueValidator f90409v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ListValidator f90410w;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90411f = new a();

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
        public static final b f90412f = new b();

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
        public static final c f90413f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jk.c);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f90414f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jk.d);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f90415f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jk.c);
        }
    }

    static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f90416f = new f();

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
        private final my f90417a;

        public h(my myVar) {
            this.f90417a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public jk deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f90417a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", pk.f90400m, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", pk.f90401n, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = pk.f90406s;
            Expression expression = pk.f90389b;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = optionalExpression3 == null ? expression : optionalExpression3;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f90417a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f90417a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f90417a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, pk.f90407t);
            TypeHelper typeHelper3 = pk.f90402o;
            Function1 function13 = jk.c.f88466e;
            Expression expression3 = pk.f90390c;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_axis_alignment", typeHelper3, function13, expression3);
            Expression expression4 = optionalExpression5 == null ? expression3 : optionalExpression5;
            ValueValidator valueValidator2 = pk.f90408u;
            Expression expression5 = pk.f90391d;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper2, function12, valueValidator2, expression5);
            if (optionalExpression6 != null) {
                expression5 = optionalExpression6;
            }
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f90417a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f90417a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f90417a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f90417a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f90417a.Y6());
            if (epVar == null) {
                epVar = pk.f90392e;
            }
            ep epVar2 = epVar;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression6 = pk.f90393f;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "infinite_scroll", typeHelper4, function14, expression6);
            Expression expression7 = optionalExpression7 == null ? expression6 : optionalExpression7;
            k8 k8Var = (k8) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", this.f90417a.d2());
            xc xcVar = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", this.f90417a.w3());
            if (xcVar == null) {
                xcVar = pk.f90394g;
            }
            xc xcVar2 = xcVar;
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f90417a.M4());
            qk qkVar = (qk) JsonPropertyParser.read(parsingContext, jSONObject, "layout_mode", this.f90417a.C5());
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f90417a.P4());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f90417a.Y2());
            TypeHelper typeHelper5 = pk.f90403p;
            Function1 function15 = jk.d.f88476e;
            Expression expression8 = pk.f90395h;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "orientation", typeHelper5, function15, expression8);
            Expression expression9 = optionalExpression8 == null ? expression8 : optionalExpression8;
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f90417a.Y2());
            qj qjVar = (qj) JsonPropertyParser.readOptional(parsingContext, jSONObject, "page_transformation", this.f90417a.q5());
            Expression expression10 = pk.f90396i;
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper4, function14, expression10);
            Expression expression11 = optionalExpression9 == null ? expression10 : optionalExpression9;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, pk.f90409v);
            TypeHelper typeHelper6 = pk.f90404q;
            Expression expression12 = pk.f90397j;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_axis_alignment", typeHelper6, function13, expression12);
            Expression expression13 = optionalExpression12 == null ? expression12 : optionalExpression12;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f90417a.u0());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f90417a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f90417a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f90417a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f90417a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f90417a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, pk.f90410w);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f90417a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f90417a.k9());
            TypeHelper typeHelper7 = pk.f90405r;
            Function1 function16 = gx.f87924e;
            Expression expression14 = pk.f90398k;
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper7, function16, expression14);
            if (optionalExpression13 != null) {
                expression14 = optionalExpression13;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f90417a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f90417a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f90417a.Y6());
            if (epVar3 == null) {
                epVar3 = pk.f90399l;
            }
            return new jk(g1Var, optionalExpression, optionalExpression2, expression2, optionalList, optionalList2, l7Var, optionalExpression4, expression4, expression5, optionalList3, optionalList4, bdVar, optionalList5, epVar2, str, expression7, k8Var, xcVar2, optionalList6, qkVar, zhVar, hbVar, expression9, hbVar2, qjVar, expression11, optionalExpression10, optionalExpression11, expression13, optionalList7, optionalList8, wvVar, y7Var, r6Var, r6Var2, optionalList9, optionalList10, optionalList11, expression14, hxVar, optionalList12, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, jk jkVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", jkVar.o(), this.f90417a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", jkVar.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", jkVar.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", jkVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", jkVar.w(), this.f90417a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, jkVar.getBackground(), this.f90417a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, jkVar.x(), this.f90417a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", jkVar.b());
            Expression expression = jkVar.f88445i;
            Function1 function1 = jk.c.f88465d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_axis_alignment", expression, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_item", jkVar.f88446j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", jkVar.k(), this.f90417a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", jkVar.getExtensions(), this.f90417a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", jkVar.n(), this.f90417a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", jkVar.u(), this.f90417a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", jkVar.getHeight(), this.f90417a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", jkVar.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "infinite_scroll", jkVar.f88453q);
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", jkVar.f88454r, this.f90417a.d2());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_spacing", jkVar.f88455s, this.f90417a.w3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, jkVar.f88456t, this.f90417a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_mode", jkVar.f88457u, this.f90417a.C5());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", jkVar.r(), this.f90417a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", jkVar.d(), this.f90417a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "orientation", jkVar.f88460x, jk.d.f88475d);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", jkVar.p(), this.f90417a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "page_transformation", jkVar.f88462z, this.f90417a.q5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", jkVar.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", jkVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", jkVar.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scroll_axis_alignment", jkVar.D, function1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", jkVar.q(), this.f90417a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", jkVar.h(), this.f90417a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", jkVar.getTransform(), this.f90417a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", jkVar.j(), this.f90417a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", jkVar.v(), this.f90417a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", jkVar.i(), this.f90417a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", jkVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pager");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", jkVar.s(), this.f90417a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", jkVar.c(), this.f90417a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", jkVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", jkVar.t(), this.f90417a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", jkVar.a(), this.f90417a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", jkVar.getWidth(), this.f90417a.Y6());
            return jSONObject;
        }
    }

    public static final class i implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90418a;

        public i(my myVar) {
            this.f90418a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vk deserialize(ParsingContext parsingContext, vk vkVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, vkVar != null ? vkVar.f91940a : null, this.f90418a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", pk.f90400m, allowPropertyOverride, vkVar != null ? vkVar.f91941b : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", pk.f90401n, allowPropertyOverride, vkVar != null ? vkVar.f91942c : null, z5.f92903e);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, vkVar != null ? vkVar.f91943d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, pk.f90406s);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, vkVar != null ? vkVar.f91944e : null, this.f90418a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, vkVar != null ? vkVar.f91945f : null, this.f90418a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, vkVar != null ? vkVar.f91946g : null, this.f90418a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = vkVar != null ? vkVar.f91947h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, function1, pk.f90407t);
            TypeHelper typeHelper2 = pk.f90402o;
            Field field2 = vkVar != null ? vkVar.f91948i : null;
            Function1 function12 = jk.c.f88466e;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "cross_axis_alignment", typeHelper2, allowPropertyOverride, field2, function12);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "default_item", typeHelper, allowPropertyOverride, vkVar != null ? vkVar.f91949j : null, function1, pk.f90408u);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, vkVar != null ? vkVar.f91950k : null, this.f90418a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, vkVar != null ? vkVar.f91951l : null, this.f90418a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, vkVar != null ? vkVar.f91952m : null, this.f90418a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, vkVar != null ? vkVar.f91953n : null, this.f90418a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, vkVar != null ? vkVar.f91954o : null, this.f90418a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, vkVar != null ? vkVar.f91955p : null);
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field3 = vkVar != null ? vkVar.f91956q : null;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "infinite_scroll", typeHelper3, allowPropertyOverride, field3, function13);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, vkVar != null ? vkVar.f91957r : null, this.f90418a.e2());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, vkVar != null ? vkVar.f91958s : null, this.f90418a.x3());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, vkVar != null ? vkVar.f91959t : null, this.f90418a.N4());
            Field field4 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "layout_mode", allowPropertyOverride, vkVar != null ? vkVar.f91960u : null, this.f90418a.D5());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, vkVar != null ? vkVar.f91961v : null, this.f90418a.Q4());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, vkVar != null ? vkVar.f91962w : null, this.f90418a.Z2());
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "orientation", pk.f90403p, allowPropertyOverride, vkVar != null ? vkVar.f91963x : null, jk.d.f88476e);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, vkVar != null ? vkVar.f91964y : null, this.f90418a.Z2());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "page_transformation", allowPropertyOverride, vkVar != null ? vkVar.f91965z : null, this.f90418a.r5());
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper3, allowPropertyOverride, vkVar != null ? vkVar.A : null, function13);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, vkVar != null ? vkVar.B : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, vkVar != null ? vkVar.C : null, function1, pk.f90409v);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scroll_axis_alignment", pk.f90404q, allowPropertyOverride, vkVar != null ? vkVar.D : null, function12);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, vkVar != null ? vkVar.E : null, this.f90418a.v0());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, vkVar != null ? vkVar.F : null, this.f90418a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, vkVar != null ? vkVar.G : null, this.f90418a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, vkVar != null ? vkVar.H : null, this.f90418a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, vkVar != null ? vkVar.I : null, this.f90418a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, vkVar != null ? vkVar.J : null, this.f90418a.A1());
            Field field5 = vkVar != null ? vkVar.K : null;
            Function1 function14 = aw.f86414e;
            ListValidator listValidator = pk.f90410w;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new vk(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression7, optionalField6, optionalField7, optionalListField6, field4, optionalField8, optionalField9, optionalFieldWithExpression8, optionalField10, optionalField11, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField7, optionalListField8, optionalField12, optionalField13, optionalField14, optionalField15, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, function14, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, vkVar != null ? vkVar.L : null, this.f90418a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, vkVar != null ? vkVar.M : null, this.f90418a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", pk.f90405r, allowPropertyOverride, vkVar != null ? vkVar.N : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, vkVar != null ? vkVar.O : null, this.f90418a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, vkVar != null ? vkVar.P : null, this.f90418a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, vkVar != null ? vkVar.Q : null, this.f90418a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, vk vkVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", vkVar.f91940a, this.f90418a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", vkVar.f91941b, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", vkVar.f91942c, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", vkVar.f91943d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", vkVar.f91944e, this.f90418a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, vkVar.f91945f, this.f90418a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, vkVar.f91946g, this.f90418a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", vkVar.f91947h);
            Field field = vkVar.f91948i;
            Function1 function1 = jk.c.f88465d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_axis_alignment", field, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_item", vkVar.f91949j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", vkVar.f91950k, this.f90418a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", vkVar.f91951l, this.f90418a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", vkVar.f91952m, this.f90418a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", vkVar.f91953n, this.f90418a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", vkVar.f91954o, this.f90418a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", vkVar.f91955p);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "infinite_scroll", vkVar.f91956q);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", vkVar.f91957r, this.f90418a.e2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_spacing", vkVar.f91958s, this.f90418a.x3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, vkVar.f91959t, this.f90418a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_mode", vkVar.f91960u, this.f90418a.D5());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", vkVar.f91961v, this.f90418a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", vkVar.f91962w, this.f90418a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "orientation", vkVar.f91963x, jk.d.f88475d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", vkVar.f91964y, this.f90418a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "page_transformation", vkVar.f91965z, this.f90418a.r5());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", vkVar.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", vkVar.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", vkVar.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scroll_axis_alignment", vkVar.D, function1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", vkVar.E, this.f90418a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", vkVar.F, this.f90418a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", vkVar.G, this.f90418a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", vkVar.H, this.f90418a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", vkVar.I, this.f90418a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", vkVar.J, this.f90418a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", vkVar.K, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pager");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", vkVar.L, this.f90418a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", vkVar.M, this.f90418a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", vkVar.N, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", vkVar.O, this.f90418a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", vkVar.P, this.f90418a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", vkVar.Q, this.f90418a.Z6());
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
        private final my f90419a;

        public j(my myVar) {
            this.f90419a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public jk resolve(ParsingContext parsingContext, vk vkVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91940a, jSONObject, "accessibility", this.f90419a.J(), this.f90419a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, vkVar.f91941b, jSONObject, "alignment_horizontal", pk.f90400m, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, vkVar.f91942c, jSONObject, "alignment_vertical", pk.f90401n, z5.f92903e);
            Field field = vkVar.f91943d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = pk.f90406s;
            Expression expression = pk.f90389b;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.f91944e, jSONObject, "animators", this.f90419a.v1(), this.f90419a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.f91945f, jSONObject, H2.f75840g, this.f90419a.H1(), this.f90419a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91946g, jSONObject, OutlinedTextFieldKt.BorderId, this.f90419a.N1(), this.f90419a.L1());
            Field field2 = vkVar.f91947h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, pk.f90407t);
            Field field3 = vkVar.f91948i;
            TypeHelper typeHelper3 = pk.f90402o;
            Function1 function13 = jk.c.f88466e;
            Expression expression3 = pk.f90390c;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "cross_axis_alignment", typeHelper3, function13, expression3);
            Expression expression4 = expressionResolveOptionalExpression5 == null ? expression3 : expressionResolveOptionalExpression5;
            Field field4 = vkVar.f91949j;
            ValueValidator valueValidator2 = pk.f90408u;
            Expression expression5 = pk.f90391d;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "default_item", typeHelper2, function12, valueValidator2, expression5);
            if (expressionResolveOptionalExpression6 != null) {
                expression5 = expressionResolveOptionalExpression6;
            }
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.f91950k, jSONObject, "disappear_actions", this.f90419a.R2(), this.f90419a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.f91951l, jSONObject, "extensions", this.f90419a.d3(), this.f90419a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91952m, jSONObject, "focus", this.f90419a.B3(), this.f90419a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.f91953n, jSONObject, "functions", this.f90419a.K3(), this.f90419a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91954o, jSONObject, "height", this.f90419a.a7(), this.f90419a.Y6());
            if (epVar == null) {
                epVar = pk.f90392e;
            }
            ep epVar2 = epVar;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91955p, jSONObject, "id");
            Field field5 = vkVar.f91956q;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression6 = pk.f90393f;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "infinite_scroll", typeHelper4, function14, expression6);
            Expression expression7 = expressionResolveOptionalExpression7 == null ? expression6 : expressionResolveOptionalExpression7;
            k8 k8Var = (k8) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91957r, jSONObject, "item_builder", this.f90419a.f2(), this.f90419a.d2());
            xc xcVar = (xc) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91958s, jSONObject, "item_spacing", this.f90419a.y3(), this.f90419a.w3());
            if (xcVar == null) {
                xcVar = pk.f90394g;
            }
            xc xcVar2 = xcVar;
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.f91959t, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f90419a.O4(), this.f90419a.M4());
            qk qkVar = (qk) JsonFieldResolver.resolve(parsingContext, vkVar.f91960u, jSONObject, "layout_mode", this.f90419a.E5(), this.f90419a.C5());
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91961v, jSONObject, "layout_provider", this.f90419a.R4(), this.f90419a.P4());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91962w, jSONObject, "margins", this.f90419a.a3(), this.f90419a.Y2());
            Field field6 = vkVar.f91963x;
            TypeHelper typeHelper5 = pk.f90403p;
            Function1 function15 = jk.d.f88476e;
            Expression expression8 = pk.f90395h;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "orientation", typeHelper5, function15, expression8);
            Expression expression9 = expressionResolveOptionalExpression8 == null ? expression8 : expressionResolveOptionalExpression8;
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91964y, jSONObject, "paddings", this.f90419a.a3(), this.f90419a.Y2());
            qj qjVar = (qj) JsonFieldResolver.resolveOptional(parsingContext, vkVar.f91965z, jSONObject, "page_transformation", this.f90419a.s5(), this.f90419a.q5());
            Field field7 = vkVar.A;
            Expression expression10 = pk.f90396i;
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "restrict_parent_scroll", typeHelper4, function14, expression10);
            Expression expression11 = expressionResolveOptionalExpression9 == null ? expression10 : expressionResolveOptionalExpression9;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, vkVar.B, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, vkVar.C, jSONObject, "row_span", typeHelper2, function12, pk.f90409v);
            Field field8 = vkVar.D;
            TypeHelper typeHelper6 = pk.f90404q;
            Expression expression12 = pk.f90397j;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "scroll_axis_alignment", typeHelper6, function13, expression12);
            Expression expression13 = expressionResolveOptionalExpression12 == null ? expression12 : expressionResolveOptionalExpression12;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.E, jSONObject, "selected_actions", this.f90419a.w0(), this.f90419a.u0());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.F, jSONObject, "tooltips", this.f90419a.R8(), this.f90419a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, vkVar.G, jSONObject, "transform", this.f90419a.d9(), this.f90419a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, vkVar.H, jSONObject, "transition_change", this.f90419a.W1(), this.f90419a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, vkVar.I, jSONObject, "transition_in", this.f90419a.B1(), this.f90419a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, vkVar.J, jSONObject, "transition_out", this.f90419a.B1(), this.f90419a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.K, jSONObject, "transition_triggers", aw.f86414e, pk.f90410w);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.L, jSONObject, "variable_triggers", this.f90419a.g9(), this.f90419a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.M, jSONObject, "variables", this.f90419a.m9(), this.f90419a.k9());
            Field field9 = vkVar.N;
            TypeHelper typeHelper7 = pk.f90405r;
            Function1 function16 = gx.f87924e;
            Expression expression14 = pk.f90398k;
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper7, function16, expression14);
            if (expressionResolveOptionalExpression13 != null) {
                expression14 = expressionResolveOptionalExpression13;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, vkVar.O, jSONObject, "visibility_action", this.f90419a.y9(), this.f90419a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, vkVar.P, jSONObject, "visibility_actions", this.f90419a.y9(), this.f90419a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, vkVar.Q, jSONObject, "width", this.f90419a.a7(), this.f90419a.Y6());
            if (epVar3 == null) {
                epVar3 = pk.f90399l;
            }
            return new jk(g1Var, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList, listResolveOptionalList2, l7Var, expressionResolveOptionalExpression4, expression4, expression5, listResolveOptionalList3, listResolveOptionalList4, bdVar, listResolveOptionalList5, epVar2, str, expression7, k8Var, xcVar2, listResolveOptionalList6, qkVar, zhVar, hbVar, expression9, hbVar2, qjVar, expression11, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expression13, listResolveOptionalList7, listResolveOptionalList8, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression14, hxVar, listResolveOptionalList12, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90389b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        jk.c cVar = jk.c.START;
        f90390c = Expression.Companion.constant$default(companion, cVar, null, 2, null);
        f90391d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        kp kpVar = null;
        kp kpVar2 = null;
        f90392e = new ep.e(new nx(null, kpVar, kpVar2, 7, null));
        Boolean bool = Boolean.FALSE;
        f90393f = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f90394g = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, 0 == true ? 1 : 0);
        jk.d dVar = jk.d.HORIZONTAL;
        f90395h = Expression.Companion.constant$default(companion, dVar, null, 2, null);
        f90396i = Expression.Companion.constant$default(companion, bool, null, 2, null);
        jk.c cVar2 = jk.c.CENTER;
        f90397j = Expression.Companion.constant$default(companion, cVar2, null, 2, null);
        gx gxVar = gx.VISIBLE;
        f90398k = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f90399l = new ep.d(new ni(kpVar, kpVar2, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f90400m = companion2.from(ArraysKt.first(y5.values()), a.f90411f);
        f90401n = companion2.from(ArraysKt.first(z5.values()), b.f90412f);
        f90402o = companion2.from(cVar, c.f90413f);
        f90403p = companion2.from(dVar, d.f90414f);
        f90404q = companion2.from(cVar2, e.f90415f);
        f90405r = companion2.from(gxVar, f.f90416f);
        f90406s = new ValueValidator() { // from class: k8.kk
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return pk.f(((Double) obj).doubleValue());
            }
        };
        f90407t = new ValueValidator() { // from class: k8.lk
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return pk.g(((Long) obj).longValue());
            }
        };
        f90408u = new ValueValidator() { // from class: k8.mk
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return pk.h(((Long) obj).longValue());
            }
        };
        f90409v = new ValueValidator() { // from class: k8.nk
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return pk.i(((Long) obj).longValue());
            }
        };
        f90410w = new ListValidator() { // from class: k8.ok
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return pk.j(list);
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
