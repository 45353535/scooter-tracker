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
import k8.as;
import k8.ep;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f88685a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f88686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f88687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f88688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ep.e f88689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f88690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f88691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f88692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final hb f88693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression f88694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final hb f88695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression f88696l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ep.d f88697m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeHelper f88698n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TypeHelper f88699o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TypeHelper f88700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ValueValidator f88701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ValueValidator f88702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ListValidator f88703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ValueValidator f88704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ValueValidator f88705u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ListValidator f88706v;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88707f = new a();

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
        public static final b f88708f = new b();

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
        public static final c f88709f = new c();

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
        private final my f88710a;

        public e(my myVar) {
            this.f88710a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public as deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f88710a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", ks.f88698n, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", ks.f88699o, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ks.f88701q;
            Expression expression = ks.f88686b;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = optionalExpression3 == null ? expression : optionalExpression3;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f88710a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f88710a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f88710a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, ks.f88702r);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f88710a.P2());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = ks.f88687c;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "dynamic_height", typeHelper3, function13, expression3);
            Expression expression4 = optionalExpression5 == null ? expression3 : optionalExpression5;
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f88710a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f88710a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f88710a.I3());
            Expression expression5 = ks.f88688d;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "has_separator", typeHelper3, function13, expression5);
            Expression expression6 = optionalExpression6 == null ? expression5 : optionalExpression6;
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f88710a.Y6());
            if (epVar == null) {
                epVar = ks.f88689e;
            }
            ep epVar2 = epVar;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f88710a.R7(), ks.f88703s);
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f88710a.P4());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f88710a.Y2());
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f88710a.Y2());
            Expression expression7 = ks.f88690f;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper3, function13, expression7);
            Expression expression8 = optionalExpression7 == null ? expression7 : optionalExpression7;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, ks.f88704t);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f88710a.u0());
            ValueValidator valueValidator2 = ks.f88705u;
            Expression expression9 = ks.f88691g;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selected_tab", typeHelper2, function12, valueValidator2, expression9);
            if (optionalExpression10 != null) {
                expression9 = optionalExpression10;
            }
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression10 = ks.f88692h;
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "separator_color", typeHelper4, function14, expression10);
            Expression expression11 = optionalExpression11 == null ? expression10 : optionalExpression11;
            hb hbVar3 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "separator_paddings", this.f88710a.Y2());
            if (hbVar3 == null) {
                hbVar3 = ks.f88693i;
            }
            hb hbVar4 = hbVar3;
            Expression expression12 = ks.f88694j;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper3, function13, expression12);
            Expression expression13 = optionalExpression12 == null ? expression12 : optionalExpression12;
            as.d dVar = (as.d) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tab_title_delimiter", this.f88710a.X7());
            as.e eVar = (as.e) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tab_title_style", this.f88710a.a8());
            hb hbVar5 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "title_paddings", this.f88710a.Y2());
            if (hbVar5 == null) {
                hbVar5 = ks.f88695k;
            }
            hb hbVar6 = hbVar5;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f88710a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f88710a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f88710a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f88710a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f88710a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, ks.f88706v);
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f88710a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f88710a.k9());
            TypeHelper typeHelper5 = ks.f88700p;
            Function1 function15 = gx.f87924e;
            Expression expression14 = ks.f88696l;
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper5, function15, expression14);
            if (optionalExpression13 != null) {
                expression14 = optionalExpression13;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f88710a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f88710a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f88710a.Y6());
            if (epVar3 == null) {
                epVar3 = ks.f88697m;
            }
            return new as(g1Var, optionalExpression, optionalExpression2, expression2, optionalList, optionalList2, l7Var, optionalExpression4, optionalList3, expression4, optionalList4, bdVar, optionalList5, expression6, epVar2, str, list, zhVar, hbVar, hbVar2, expression8, optionalExpression8, optionalExpression9, optionalList6, expression9, expression11, hbVar4, expression13, dVar, eVar, hbVar6, optionalList7, wvVar, y7Var, r6Var, r6Var2, optionalList8, optionalList9, optionalList10, expression14, hxVar, optionalList11, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, as asVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", asVar.o(), this.f88710a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", asVar.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", asVar.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", asVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", asVar.w(), this.f88710a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, asVar.getBackground(), this.f88710a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, asVar.x(), this.f88710a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", asVar.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", asVar.k(), this.f88710a.P2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "dynamic_height", asVar.f86335j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", asVar.getExtensions(), this.f88710a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", asVar.n(), this.f88710a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", asVar.u(), this.f88710a.I3());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "has_separator", asVar.f86339n);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", asVar.getHeight(), this.f88710a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", asVar.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, asVar.f86342q, this.f88710a.R7());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", asVar.r(), this.f88710a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", asVar.d(), this.f88710a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", asVar.p(), this.f88710a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", asVar.f86346u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", asVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", asVar.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", asVar.q(), this.f88710a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selected_tab", asVar.f86350y);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "separator_color", asVar.f86351z, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "separator_paddings", asVar.A, this.f88710a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", asVar.B);
            JsonPropertyParser.write(parsingContext, jSONObject, "tab_title_delimiter", asVar.C, this.f88710a.X7());
            JsonPropertyParser.write(parsingContext, jSONObject, "tab_title_style", asVar.D, this.f88710a.a8());
            JsonPropertyParser.write(parsingContext, jSONObject, "title_paddings", asVar.E, this.f88710a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", asVar.h(), this.f88710a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", asVar.getTransform(), this.f88710a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", asVar.j(), this.f88710a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", asVar.v(), this.f88710a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", asVar.i(), this.f88710a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", asVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "tabs");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", asVar.s(), this.f88710a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", asVar.c(), this.f88710a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", asVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", asVar.t(), this.f88710a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", asVar.a(), this.f88710a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", asVar.getWidth(), this.f88710a.Y6());
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88711a;

        public f(my myVar) {
            this.f88711a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ss deserialize(ParsingContext parsingContext, ss ssVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, ssVar != null ? ssVar.f91115a : null, this.f88711a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", ks.f88698n, allowPropertyOverride, ssVar != null ? ssVar.f91116b : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", ks.f88699o, allowPropertyOverride, ssVar != null ? ssVar.f91117c : null, z5.f92903e);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, ssVar != null ? ssVar.f91118d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, ks.f88701q);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, ssVar != null ? ssVar.f91119e : null, this.f88711a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, ssVar != null ? ssVar.f91120f : null, this.f88711a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, ssVar != null ? ssVar.f91121g : null, this.f88711a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = ssVar != null ? ssVar.f91122h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, function1, ks.f88702r);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, ssVar != null ? ssVar.f91123i : null, this.f88711a.Q2());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field2 = ssVar != null ? ssVar.f91124j : null;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "dynamic_height", typeHelper2, allowPropertyOverride, field2, function12);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, ssVar != null ? ssVar.f91125k : null, this.f88711a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, ssVar != null ? ssVar.f91126l : null, this.f88711a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, ssVar != null ? ssVar.f91127m : null, this.f88711a.J3());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "has_separator", typeHelper2, allowPropertyOverride, ssVar != null ? ssVar.f91128n : null, function12);
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, ssVar != null ? ssVar.f91129o : null, this.f88711a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, ssVar != null ? ssVar.f91130p : null);
            Field field3 = ssVar != null ? ssVar.f91131q : null;
            Lazy lazyS7 = this.f88711a.S7();
            ListValidator listValidator = ks.f88703s;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, field3, lazyS7, listValidator);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, ssVar != null ? ssVar.f91132r : null, this.f88711a.Q4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, ssVar != null ? ssVar.f91133s : null, this.f88711a.Z2());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, ssVar != null ? ssVar.f91134t : null, this.f88711a.Z2());
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper2, allowPropertyOverride, ssVar != null ? ssVar.f91135u : null, function12);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, ssVar != null ? ssVar.f91136v : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, ssVar != null ? ssVar.f91137w : null, function1, ks.f88704t);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, ssVar != null ? ssVar.f91138x : null, this.f88711a.v0());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selected_tab", typeHelper, allowPropertyOverride, ssVar != null ? ssVar.f91139y : null, function1, ks.f88705u);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "separator_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, ssVar != null ? ssVar.f91140z : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "separator_paddings", allowPropertyOverride, ssVar != null ? ssVar.A : null, this.f88711a.Z2());
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper2, allowPropertyOverride, ssVar != null ? ssVar.B : null, function12);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tab_title_delimiter", allowPropertyOverride, ssVar != null ? ssVar.C : null, this.f88711a.Y7());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tab_title_style", allowPropertyOverride, ssVar != null ? ssVar.D : null, this.f88711a.b8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "title_paddings", allowPropertyOverride, ssVar != null ? ssVar.E : null, this.f88711a.Z2());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, ssVar != null ? ssVar.F : null, this.f88711a.Q8());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, ssVar != null ? ssVar.G : null, this.f88711a.c9());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, ssVar != null ? ssVar.H : null, this.f88711a.V1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, ssVar != null ? ssVar.I : null, this.f88711a.A1());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, ssVar != null ? ssVar.J : null, this.f88711a.A1());
            Field field4 = ssVar != null ? ssVar.K : null;
            Function1 function13 = aw.f86414e;
            ListValidator listValidator2 = ks.f88706v;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new ss(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalFieldWithExpression5, optionalListField4, optionalField3, optionalListField5, optionalFieldWithExpression6, optionalField4, optionalField5, listField, optionalField6, optionalField7, optionalField8, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField6, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalField9, optionalFieldWithExpression12, optionalField10, optionalField11, optionalField12, optionalListField7, optionalField13, optionalField14, optionalField15, optionalField16, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, function13, listValidator2), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, ssVar != null ? ssVar.L : null, this.f88711a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, ssVar != null ? ssVar.M : null, this.f88711a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", ks.f88700p, allowPropertyOverride, ssVar != null ? ssVar.N : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, ssVar != null ? ssVar.O : null, this.f88711a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, ssVar != null ? ssVar.P : null, this.f88711a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, ssVar != null ? ssVar.Q : null, this.f88711a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ss ssVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", ssVar.f91115a, this.f88711a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", ssVar.f91116b, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", ssVar.f91117c, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", ssVar.f91118d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", ssVar.f91119e, this.f88711a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, ssVar.f91120f, this.f88711a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, ssVar.f91121g, this.f88711a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", ssVar.f91122h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", ssVar.f91123i, this.f88711a.Q2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "dynamic_height", ssVar.f91124j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", ssVar.f91125k, this.f88711a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", ssVar.f91126l, this.f88711a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", ssVar.f91127m, this.f88711a.J3());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "has_separator", ssVar.f91128n);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", ssVar.f91129o, this.f88711a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", ssVar.f91130p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, ssVar.f91131q, this.f88711a.S7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", ssVar.f91132r, this.f88711a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", ssVar.f91133s, this.f88711a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", ssVar.f91134t, this.f88711a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", ssVar.f91135u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", ssVar.f91136v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", ssVar.f91137w);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", ssVar.f91138x, this.f88711a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selected_tab", ssVar.f91139y);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "separator_color", ssVar.f91140z, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "separator_paddings", ssVar.A, this.f88711a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", ssVar.B);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tab_title_delimiter", ssVar.C, this.f88711a.Y7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "tab_title_style", ssVar.D, this.f88711a.b8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "title_paddings", ssVar.E, this.f88711a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", ssVar.F, this.f88711a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", ssVar.G, this.f88711a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", ssVar.H, this.f88711a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", ssVar.I, this.f88711a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", ssVar.J, this.f88711a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", ssVar.K, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "tabs");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", ssVar.L, this.f88711a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", ssVar.M, this.f88711a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", ssVar.N, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", ssVar.O, this.f88711a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", ssVar.P, this.f88711a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", ssVar.Q, this.f88711a.Z6());
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
        private final my f88712a;

        public g(my myVar) {
            this.f88712a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public as resolve(ParsingContext parsingContext, ss ssVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, ssVar.f91115a, jSONObject, "accessibility", this.f88712a.J(), this.f88712a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, ssVar.f91116b, jSONObject, "alignment_horizontal", ks.f88698n, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, ssVar.f91117c, jSONObject, "alignment_vertical", ks.f88699o, z5.f92903e);
            Field field = ssVar.f91118d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ks.f88701q;
            Expression expression = ks.f88686b;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.f91119e, jSONObject, "animators", this.f88712a.v1(), this.f88712a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.f91120f, jSONObject, H2.f75840g, this.f88712a.H1(), this.f88712a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, ssVar.f91121g, jSONObject, OutlinedTextFieldKt.BorderId, this.f88712a.N1(), this.f88712a.L1());
            Field field2 = ssVar.f91122h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, ks.f88702r);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.f91123i, jSONObject, "disappear_actions", this.f88712a.R2(), this.f88712a.P2());
            Field field3 = ssVar.f91124j;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = ks.f88687c;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "dynamic_height", typeHelper3, function13, expression3);
            Expression expression4 = expressionResolveOptionalExpression5 == null ? expression3 : expressionResolveOptionalExpression5;
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.f91125k, jSONObject, "extensions", this.f88712a.d3(), this.f88712a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, ssVar.f91126l, jSONObject, "focus", this.f88712a.B3(), this.f88712a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.f91127m, jSONObject, "functions", this.f88712a.K3(), this.f88712a.I3());
            Field field4 = ssVar.f91128n;
            Expression expression5 = ks.f88688d;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "has_separator", typeHelper3, function13, expression5);
            Expression expression6 = expressionResolveOptionalExpression6 == null ? expression5 : expressionResolveOptionalExpression6;
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, ssVar.f91129o, jSONObject, "height", this.f88712a.a7(), this.f88712a.Y6());
            if (epVar == null) {
                epVar = ks.f88689e;
            }
            ep epVar2 = epVar;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, ssVar.f91130p, jSONObject, "id");
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, ssVar.f91131q, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f88712a.T7(), this.f88712a.R7(), ks.f88703s);
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, ssVar.f91132r, jSONObject, "layout_provider", this.f88712a.R4(), this.f88712a.P4());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, ssVar.f91133s, jSONObject, "margins", this.f88712a.a3(), this.f88712a.Y2());
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, ssVar.f91134t, jSONObject, "paddings", this.f88712a.a3(), this.f88712a.Y2());
            Field field5 = ssVar.f91135u;
            Expression expression7 = ks.f88690f;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "restrict_parent_scroll", typeHelper3, function13, expression7);
            Expression expression8 = expressionResolveOptionalExpression7 == null ? expression7 : expressionResolveOptionalExpression7;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, ssVar.f91136v, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, ssVar.f91137w, jSONObject, "row_span", typeHelper2, function12, ks.f88704t);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.f91138x, jSONObject, "selected_actions", this.f88712a.w0(), this.f88712a.u0());
            Field field6 = ssVar.f91139y;
            ValueValidator valueValidator2 = ks.f88705u;
            Expression expression9 = ks.f88691g;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "selected_tab", typeHelper2, function12, valueValidator2, expression9);
            if (expressionResolveOptionalExpression10 != null) {
                expression9 = expressionResolveOptionalExpression10;
            }
            Field field7 = ssVar.f91140z;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression10 = ks.f88692h;
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "separator_color", typeHelper4, function14, expression10);
            Expression expression11 = expressionResolveOptionalExpression11 == null ? expression10 : expressionResolveOptionalExpression11;
            hb hbVar3 = (hb) JsonFieldResolver.resolveOptional(parsingContext, ssVar.A, jSONObject, "separator_paddings", this.f88712a.a3(), this.f88712a.Y2());
            if (hbVar3 == null) {
                hbVar3 = ks.f88693i;
            }
            hb hbVar4 = hbVar3;
            Field field8 = ssVar.B;
            Expression expression12 = ks.f88694j;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper3, function13, expression12);
            Expression expression13 = expressionResolveOptionalExpression12 == null ? expression12 : expressionResolveOptionalExpression12;
            as.d dVar = (as.d) JsonFieldResolver.resolveOptional(parsingContext, ssVar.C, jSONObject, "tab_title_delimiter", this.f88712a.Z7(), this.f88712a.X7());
            as.e eVar = (as.e) JsonFieldResolver.resolveOptional(parsingContext, ssVar.D, jSONObject, "tab_title_style", this.f88712a.c8(), this.f88712a.a8());
            hb hbVar5 = (hb) JsonFieldResolver.resolveOptional(parsingContext, ssVar.E, jSONObject, "title_paddings", this.f88712a.a3(), this.f88712a.Y2());
            if (hbVar5 == null) {
                hbVar5 = ks.f88695k;
            }
            hb hbVar6 = hbVar5;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.F, jSONObject, "tooltips", this.f88712a.R8(), this.f88712a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, ssVar.G, jSONObject, "transform", this.f88712a.d9(), this.f88712a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, ssVar.H, jSONObject, "transition_change", this.f88712a.W1(), this.f88712a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, ssVar.I, jSONObject, "transition_in", this.f88712a.B1(), this.f88712a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, ssVar.J, jSONObject, "transition_out", this.f88712a.B1(), this.f88712a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.K, jSONObject, "transition_triggers", aw.f86414e, ks.f88706v);
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.L, jSONObject, "variable_triggers", this.f88712a.g9(), this.f88712a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.M, jSONObject, "variables", this.f88712a.m9(), this.f88712a.k9());
            Field field9 = ssVar.N;
            TypeHelper typeHelper5 = ks.f88700p;
            Function1 function15 = gx.f87924e;
            Expression expression14 = ks.f88696l;
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper5, function15, expression14);
            if (expressionResolveOptionalExpression13 != null) {
                expression14 = expressionResolveOptionalExpression13;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, ssVar.O, jSONObject, "visibility_action", this.f88712a.y9(), this.f88712a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, ssVar.P, jSONObject, "visibility_actions", this.f88712a.y9(), this.f88712a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, ssVar.Q, jSONObject, "width", this.f88712a.a7(), this.f88712a.Y6());
            if (epVar3 == null) {
                epVar3 = ks.f88697m;
            }
            return new as(g1Var, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList, listResolveOptionalList2, l7Var, expressionResolveOptionalExpression4, listResolveOptionalList3, expression4, listResolveOptionalList4, bdVar, listResolveOptionalList5, expression6, epVar2, str, listResolveList, zhVar, hbVar, hbVar2, expression8, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, listResolveOptionalList6, expression9, expression11, hbVar4, expression13, dVar, eVar, hbVar6, listResolveOptionalList7, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList8, listResolveOptionalList9, listResolveOptionalList10, expression14, hxVar, listResolveOptionalList11, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f88686b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        f88687c = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f88688d = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f88689e = new ep.e(new nx(null, null, null, 7, null));
        f88690f = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f88691g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f88692h = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        f88693i = new hb(Expression.Companion.constant$default(companion, 0L, null, 2, null), null, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null, Expression.Companion.constant$default(companion, 0L, null, 2, null), null, 82, null);
        f88694j = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f88695k = new hb(Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null, Expression.Companion.constant$default(companion, 0L, null, 2, null), null, 82, null);
        gx gxVar = gx.VISIBLE;
        f88696l = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f88697m = new ep.d(new ni(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f88698n = companion2.from(ArraysKt.first(y5.values()), a.f88707f);
        f88699o = companion2.from(ArraysKt.first(z5.values()), b.f88708f);
        f88700p = companion2.from(gxVar, c.f88709f);
        f88701q = new ValueValidator() { // from class: k8.es
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ks.g(((Double) obj).doubleValue());
            }
        };
        f88702r = new ValueValidator() { // from class: k8.fs
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ks.h(((Long) obj).longValue());
            }
        };
        f88703s = new ListValidator() { // from class: k8.gs
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return ks.i(list);
            }
        };
        f88704t = new ValueValidator() { // from class: k8.hs
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ks.j(((Long) obj).longValue());
            }
        };
        f88705u = new ValueValidator() { // from class: k8.is
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ks.k(((Long) obj).longValue());
            }
        };
        f88706v = new ListValidator() { // from class: k8.js
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return ks.l(list);
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
    public static final boolean i(List list) {
        return list.size() >= 1;
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
