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
import k8.td;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ce {
    public static final ListValidator A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f86669a = new h(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f86670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f86671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f86672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ep.e f86673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f86674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f86675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f86676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression f86677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression f86678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression f86679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ep.d f86680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeHelper f86681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeHelper f86682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TypeHelper f86683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TypeHelper f86684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final TypeHelper f86685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final TypeHelper f86686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final TypeHelper f86687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ValueValidator f86688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ValueValidator f86689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ValueValidator f86690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ValueValidator f86691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ValueValidator f86692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ValueValidator f86693y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ValueValidator f86694z;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86695f = new a();

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
        public static final b f86696f = new b();

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
        public static final c f86697f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof td.c);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f86698f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof td.d);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f86699f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof td.f);
        }
    }

    static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f86700f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof td.e);
        }
    }

    static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f86701f = new g();

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
        private final my f86702a;

        public i(my myVar) {
            this.f86702a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public td deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f86702a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", ce.f86681m, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", ce.f86682n, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ce.f86688t;
            Expression expression = ce.f86670b;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = optionalExpression3 == null ? expression : optionalExpression3;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f86702a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f86702a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f86702a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_count", typeHelper2, function12, ce.f86689u);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, ce.f86690v);
            TypeHelper typeHelper3 = ce.f86683o;
            Function1 function13 = td.c.f91309e;
            Expression expression3 = ce.f86671c;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_content_alignment", typeHelper3, function13, expression3);
            Expression expression4 = optionalExpression6 == null ? expression3 : optionalExpression6;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_spacing", typeHelper2, function12, ce.f86691w);
            ValueValidator valueValidator2 = ce.f86692x;
            Expression expression5 = ce.f86672d;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper2, function12, valueValidator2, expression5);
            Expression expression6 = optionalExpression8 == null ? expression5 : optionalExpression8;
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f86702a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f86702a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f86702a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f86702a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f86702a.Y6());
            if (epVar == null) {
                epVar = ce.f86673e;
            }
            ep epVar2 = epVar;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            k8 k8Var = (k8) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", this.f86702a.d2());
            ValueValidator valueValidator3 = ce.f86693y;
            Expression expression7 = ce.f86674f;
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper2, function12, valueValidator3, expression7);
            if (optionalExpression9 != null) {
                expression7 = optionalExpression9;
            }
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f86702a.M4());
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f86702a.P4());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f86702a.Y2());
            TypeHelper typeHelper4 = ce.f86684p;
            Function1 function14 = td.d.f91319e;
            Expression expression8 = ce.f86675g;
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "orientation", typeHelper4, function14, expression8);
            Expression expression9 = optionalExpression10 == null ? expression8 : optionalExpression10;
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f86702a.Y2());
            TypeHelper<Boolean> typeHelper5 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function15 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression10 = ce.f86676h;
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper5, function15, expression10);
            Expression expression11 = optionalExpression11 == null ? expression10 : optionalExpression11;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, ce.f86694z);
            TypeHelper typeHelper6 = ce.f86685q;
            Function1 function16 = td.e.f91328e;
            Expression expression12 = ce.f86677i;
            Expression optionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_mode", typeHelper6, function16, expression12);
            Expression expression13 = optionalExpression14 == null ? expression12 : optionalExpression14;
            TypeHelper typeHelper7 = ce.f86686r;
            Function1 function17 = td.f.f91337e;
            Expression expression14 = ce.f86678j;
            Expression optionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scrollbar", typeHelper7, function17, expression14);
            Expression expression15 = optionalExpression15 == null ? expression14 : optionalExpression15;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f86702a.u0());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f86702a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f86702a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f86702a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f86702a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f86702a.z1());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, ce.A);
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f86702a.e9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f86702a.k9());
            TypeHelper typeHelper8 = ce.f86687s;
            Function1 function18 = gx.f87924e;
            Expression expression16 = ce.f86679k;
            Expression optionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper8, function18, expression16);
            if (optionalExpression16 != null) {
                expression16 = optionalExpression16;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f86702a.w9());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f86702a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f86702a.Y6());
            if (epVar3 == null) {
                epVar3 = ce.f86680l;
            }
            return new td(g1Var, optionalExpression, optionalExpression2, expression2, optionalList, optionalList2, l7Var, optionalExpression4, optionalExpression5, expression4, optionalExpression7, expression6, optionalList3, optionalList4, bdVar, optionalList5, epVar2, str, k8Var, expression7, optionalList6, zhVar, hbVar, expression9, hbVar2, expression11, optionalExpression12, optionalExpression13, expression13, expression15, optionalList7, optionalList8, wvVar, y7Var, r6Var, r6Var2, optionalList9, optionalList10, optionalList11, expression16, hxVar, optionalList12, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, td tdVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", tdVar.o(), this.f86702a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", tdVar.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", tdVar.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", tdVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", tdVar.w(), this.f86702a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, tdVar.getBackground(), this.f86702a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, tdVar.x(), this.f86702a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_count", tdVar.f91287h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", tdVar.b());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_content_alignment", tdVar.f91289j, td.c.f91308d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_spacing", tdVar.f91290k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_item", tdVar.f91291l);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", tdVar.k(), this.f86702a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", tdVar.getExtensions(), this.f86702a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", tdVar.n(), this.f86702a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", tdVar.u(), this.f86702a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", tdVar.getHeight(), this.f86702a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", tdVar.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", tdVar.f91298s, this.f86702a.d2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", tdVar.f91299t);
            JsonPropertyParser.writeList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, tdVar.f91300u, this.f86702a.M4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", tdVar.r(), this.f86702a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", tdVar.d(), this.f86702a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "orientation", tdVar.f91303x, td.d.f91318d);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", tdVar.p(), this.f86702a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", tdVar.f91305z);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", tdVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", tdVar.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scroll_mode", tdVar.C, td.e.f91327d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scrollbar", tdVar.D, td.f.f91336d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", tdVar.q(), this.f86702a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", tdVar.h(), this.f86702a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", tdVar.getTransform(), this.f86702a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", tdVar.j(), this.f86702a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", tdVar.v(), this.f86702a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", tdVar.i(), this.f86702a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", tdVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gallery");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", tdVar.s(), this.f86702a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", tdVar.c(), this.f86702a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", tdVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", tdVar.t(), this.f86702a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", tdVar.a(), this.f86702a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", tdVar.getWidth(), this.f86702a.Y6());
            return jSONObject;
        }
    }

    public static final class j implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86703a;

        public j(my myVar) {
            this.f86703a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public de deserialize(ParsingContext parsingContext, de deVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, deVar != null ? deVar.f87000a : null, this.f86703a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", ce.f86681m, allowPropertyOverride, deVar != null ? deVar.f87001b : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", ce.f86682n, allowPropertyOverride, deVar != null ? deVar.f87002c : null, z5.f92903e);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, deVar != null ? deVar.f87003d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, ce.f86688t);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, deVar != null ? deVar.f87004e : null, this.f86703a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, deVar != null ? deVar.f87005f : null, this.f86703a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, deVar != null ? deVar.f87006g : null, this.f86703a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = deVar != null ? deVar.f87007h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_count", typeHelper, allowPropertyOverride, field, function1, ce.f86689u);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, deVar != null ? deVar.f87008i : null, function1, ce.f86690v);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "cross_content_alignment", ce.f86683o, allowPropertyOverride, deVar != null ? deVar.f87009j : null, td.c.f91309e);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "cross_spacing", typeHelper, allowPropertyOverride, deVar != null ? deVar.f87010k : null, function1, ce.f86691w);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "default_item", typeHelper, allowPropertyOverride, deVar != null ? deVar.f87011l : null, function1, ce.f86692x);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, deVar != null ? deVar.f87012m : null, this.f86703a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, deVar != null ? deVar.f87013n : null, this.f86703a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, deVar != null ? deVar.f87014o : null, this.f86703a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, deVar != null ? deVar.f87015p : null, this.f86703a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, deVar != null ? deVar.f87016q : null, this.f86703a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, deVar != null ? deVar.f87017r : null);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, deVar != null ? deVar.f87018s : null, this.f86703a.e2());
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "item_spacing", typeHelper, allowPropertyOverride, deVar != null ? deVar.f87019t : null, function1, ce.f86693y);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, deVar != null ? deVar.f87020u : null, this.f86703a.N4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, deVar != null ? deVar.f87021v : null, this.f86703a.Q4());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, deVar != null ? deVar.f87022w : null, this.f86703a.Z2());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "orientation", ce.f86684p, allowPropertyOverride, deVar != null ? deVar.f87023x : null, td.d.f91319e);
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, deVar != null ? deVar.f87024y : null, this.f86703a.Z2());
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "restrict_parent_scroll", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, deVar != null ? deVar.f87025z : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, deVar != null ? deVar.A : null);
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, deVar != null ? deVar.B : null, function1, ce.f86694z);
            Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scroll_mode", ce.f86685q, allowPropertyOverride, deVar != null ? deVar.C : null, td.e.f91328e);
            Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scrollbar", ce.f86686r, allowPropertyOverride, deVar != null ? deVar.D : null, td.f.f91337e);
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, deVar != null ? deVar.E : null, this.f86703a.v0());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, deVar != null ? deVar.F : null, this.f86703a.Q8());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, deVar != null ? deVar.G : null, this.f86703a.c9());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, deVar != null ? deVar.H : null, this.f86703a.V1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, deVar != null ? deVar.I : null, this.f86703a.A1());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, deVar != null ? deVar.J : null, this.f86703a.A1());
            Field field2 = deVar != null ? deVar.K : null;
            Function1 function12 = aw.f86414e;
            ListValidator listValidator = ce.A;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new de(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalField6, optionalFieldWithExpression9, optionalListField6, optionalField7, optionalField8, optionalFieldWithExpression10, optionalField9, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalFieldWithExpression15, optionalListField7, optionalListField8, optionalField10, optionalField11, optionalField12, optionalField13, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field2, function12, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, deVar != null ? deVar.L : null, this.f86703a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, deVar != null ? deVar.M : null, this.f86703a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", ce.f86687s, allowPropertyOverride, deVar != null ? deVar.N : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, deVar != null ? deVar.O : null, this.f86703a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, deVar != null ? deVar.P : null, this.f86703a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, deVar != null ? deVar.Q : null, this.f86703a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, de deVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", deVar.f87000a, this.f86703a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", deVar.f87001b, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", deVar.f87002c, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", deVar.f87003d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", deVar.f87004e, this.f86703a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, deVar.f87005f, this.f86703a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, deVar.f87006g, this.f86703a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_count", deVar.f87007h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", deVar.f87008i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_content_alignment", deVar.f87009j, td.c.f91308d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_spacing", deVar.f87010k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_item", deVar.f87011l);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", deVar.f87012m, this.f86703a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", deVar.f87013n, this.f86703a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", deVar.f87014o, this.f86703a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", deVar.f87015p, this.f86703a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", deVar.f87016q, this.f86703a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", deVar.f87017r);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", deVar.f87018s, this.f86703a.e2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", deVar.f87019t);
            JsonFieldParser.writeListField(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, deVar.f87020u, this.f86703a.N4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", deVar.f87021v, this.f86703a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", deVar.f87022w, this.f86703a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "orientation", deVar.f87023x, td.d.f91318d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", deVar.f87024y, this.f86703a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", deVar.f87025z);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", deVar.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", deVar.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scroll_mode", deVar.C, td.e.f91327d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scrollbar", deVar.D, td.f.f91336d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", deVar.E, this.f86703a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", deVar.F, this.f86703a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", deVar.G, this.f86703a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", deVar.H, this.f86703a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", deVar.I, this.f86703a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", deVar.J, this.f86703a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", deVar.K, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gallery");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", deVar.L, this.f86703a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", deVar.M, this.f86703a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", deVar.N, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", deVar.O, this.f86703a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", deVar.P, this.f86703a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", deVar.Q, this.f86703a.Z6());
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
        private final my f86704a;

        public k(my myVar) {
            this.f86704a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public td resolve(ParsingContext parsingContext, de deVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, deVar.f87000a, jSONObject, "accessibility", this.f86704a.J(), this.f86704a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, deVar.f87001b, jSONObject, "alignment_horizontal", ce.f86681m, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, deVar.f87002c, jSONObject, "alignment_vertical", ce.f86682n, z5.f92903e);
            Field field = deVar.f87003d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = ce.f86688t;
            Expression expression = ce.f86670b;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = expressionResolveOptionalExpression3 == null ? expression : expressionResolveOptionalExpression3;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.f87004e, jSONObject, "animators", this.f86704a.v1(), this.f86704a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.f87005f, jSONObject, H2.f75840g, this.f86704a.H1(), this.f86704a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, deVar.f87006g, jSONObject, OutlinedTextFieldKt.BorderId, this.f86704a.N1(), this.f86704a.L1());
            Field field2 = deVar.f87007h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_count", typeHelper2, function12, ce.f86689u);
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, deVar.f87008i, jSONObject, "column_span", typeHelper2, function12, ce.f86690v);
            Field field3 = deVar.f87009j;
            TypeHelper typeHelper3 = ce.f86683o;
            Function1 function13 = td.c.f91309e;
            Expression expression3 = ce.f86671c;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "cross_content_alignment", typeHelper3, function13, expression3);
            Expression expression4 = expressionResolveOptionalExpression6 == null ? expression3 : expressionResolveOptionalExpression6;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, deVar.f87010k, jSONObject, "cross_spacing", typeHelper2, function12, ce.f86691w);
            Field field4 = deVar.f87011l;
            ValueValidator valueValidator2 = ce.f86692x;
            Expression expression5 = ce.f86672d;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "default_item", typeHelper2, function12, valueValidator2, expression5);
            Expression expression6 = expressionResolveOptionalExpression8 == null ? expression5 : expressionResolveOptionalExpression8;
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.f87012m, jSONObject, "disappear_actions", this.f86704a.R2(), this.f86704a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.f87013n, jSONObject, "extensions", this.f86704a.d3(), this.f86704a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, deVar.f87014o, jSONObject, "focus", this.f86704a.B3(), this.f86704a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.f87015p, jSONObject, "functions", this.f86704a.K3(), this.f86704a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, deVar.f87016q, jSONObject, "height", this.f86704a.a7(), this.f86704a.Y6());
            if (epVar == null) {
                epVar = ce.f86673e;
            }
            ep epVar2 = epVar;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, deVar.f87017r, jSONObject, "id");
            k8 k8Var = (k8) JsonFieldResolver.resolveOptional(parsingContext, deVar.f87018s, jSONObject, "item_builder", this.f86704a.f2(), this.f86704a.d2());
            Field field5 = deVar.f87019t;
            ValueValidator valueValidator3 = ce.f86693y;
            Expression expression7 = ce.f86674f;
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "item_spacing", typeHelper2, function12, valueValidator3, expression7);
            if (expressionResolveOptionalExpression9 != null) {
                expression7 = expressionResolveOptionalExpression9;
            }
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.f87020u, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f86704a.O4(), this.f86704a.M4());
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, deVar.f87021v, jSONObject, "layout_provider", this.f86704a.R4(), this.f86704a.P4());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, deVar.f87022w, jSONObject, "margins", this.f86704a.a3(), this.f86704a.Y2());
            Field field6 = deVar.f87023x;
            TypeHelper typeHelper4 = ce.f86684p;
            Function1 function14 = td.d.f91319e;
            Expression expression8 = ce.f86675g;
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "orientation", typeHelper4, function14, expression8);
            Expression expression9 = expressionResolveOptionalExpression10 == null ? expression8 : expressionResolveOptionalExpression10;
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, deVar.f87024y, jSONObject, "paddings", this.f86704a.a3(), this.f86704a.Y2());
            Field field7 = deVar.f87025z;
            TypeHelper<Boolean> typeHelper5 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function15 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression10 = ce.f86676h;
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "restrict_parent_scroll", typeHelper5, function15, expression10);
            Expression expression11 = expressionResolveOptionalExpression11 == null ? expression10 : expressionResolveOptionalExpression11;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, deVar.A, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, deVar.B, jSONObject, "row_span", typeHelper2, function12, ce.f86694z);
            Field field8 = deVar.C;
            TypeHelper typeHelper6 = ce.f86685q;
            Function1 function16 = td.e.f91328e;
            Expression expression12 = ce.f86677i;
            Expression expressionResolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "scroll_mode", typeHelper6, function16, expression12);
            Expression expression13 = expressionResolveOptionalExpression14 == null ? expression12 : expressionResolveOptionalExpression14;
            Field field9 = deVar.D;
            TypeHelper typeHelper7 = ce.f86686r;
            Function1 function17 = td.f.f91337e;
            Expression expression14 = ce.f86678j;
            Expression expressionResolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "scrollbar", typeHelper7, function17, expression14);
            Expression expression15 = expressionResolveOptionalExpression15 == null ? expression14 : expressionResolveOptionalExpression15;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.E, jSONObject, "selected_actions", this.f86704a.w0(), this.f86704a.u0());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.F, jSONObject, "tooltips", this.f86704a.R8(), this.f86704a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, deVar.G, jSONObject, "transform", this.f86704a.d9(), this.f86704a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, deVar.H, jSONObject, "transition_change", this.f86704a.W1(), this.f86704a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, deVar.I, jSONObject, "transition_in", this.f86704a.B1(), this.f86704a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, deVar.J, jSONObject, "transition_out", this.f86704a.B1(), this.f86704a.z1());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.K, jSONObject, "transition_triggers", aw.f86414e, ce.A);
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.L, jSONObject, "variable_triggers", this.f86704a.g9(), this.f86704a.e9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.M, jSONObject, "variables", this.f86704a.m9(), this.f86704a.k9());
            Field field10 = deVar.N;
            TypeHelper typeHelper8 = ce.f86687s;
            Function1 function18 = gx.f87924e;
            Expression expression16 = ce.f86679k;
            Expression expressionResolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "visibility", typeHelper8, function18, expression16);
            if (expressionResolveOptionalExpression16 != null) {
                expression16 = expressionResolveOptionalExpression16;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, deVar.O, jSONObject, "visibility_action", this.f86704a.y9(), this.f86704a.w9());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, deVar.P, jSONObject, "visibility_actions", this.f86704a.y9(), this.f86704a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, deVar.Q, jSONObject, "width", this.f86704a.a7(), this.f86704a.Y6());
            if (epVar3 == null) {
                epVar3 = ce.f86680l;
            }
            return new td(g1Var, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression2, listResolveOptionalList, listResolveOptionalList2, l7Var, expressionResolveOptionalExpression4, expressionResolveOptionalExpression5, expression4, expressionResolveOptionalExpression7, expression6, listResolveOptionalList3, listResolveOptionalList4, bdVar, listResolveOptionalList5, epVar2, str, k8Var, expression7, listResolveOptionalList6, zhVar, hbVar, expression9, hbVar2, expression11, expressionResolveOptionalExpression12, expressionResolveOptionalExpression13, expression13, expression15, listResolveOptionalList7, listResolveOptionalList8, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList9, listResolveOptionalList10, listResolveOptionalList11, expression16, hxVar, listResolveOptionalList12, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f86670b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        td.c cVar = td.c.START;
        f86671c = Expression.Companion.constant$default(companion, cVar, null, 2, null);
        f86672d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f86673e = new ep.e(new nx(null, null, null, 7, null));
        f86674f = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        td.d dVar = td.d.HORIZONTAL;
        f86675g = Expression.Companion.constant$default(companion, dVar, null, 2, null);
        f86676h = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        td.e eVar = td.e.DEFAULT;
        f86677i = Expression.Companion.constant$default(companion, eVar, null, 2, null);
        td.f fVar = td.f.NONE;
        f86678j = Expression.Companion.constant$default(companion, fVar, null, 2, null);
        gx gxVar = gx.VISIBLE;
        f86679k = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f86680l = new ep.d(new ni(null, 0 == true ? 1 : 0, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f86681m = companion2.from(ArraysKt.first(y5.values()), a.f86695f);
        f86682n = companion2.from(ArraysKt.first(z5.values()), b.f86696f);
        f86683o = companion2.from(cVar, c.f86697f);
        f86684p = companion2.from(dVar, d.f86698f);
        f86685q = companion2.from(eVar, f.f86700f);
        f86686r = companion2.from(fVar, e.f86699f);
        f86687s = companion2.from(gxVar, g.f86701f);
        f86688t = new ValueValidator() { // from class: k8.ud
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ce.i(((Double) obj).doubleValue());
            }
        };
        f86689u = new ValueValidator() { // from class: k8.vd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ce.j(((Long) obj).longValue());
            }
        };
        f86690v = new ValueValidator() { // from class: k8.wd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ce.k(((Long) obj).longValue());
            }
        };
        f86691w = new ValueValidator() { // from class: k8.xd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ce.l(((Long) obj).longValue());
            }
        };
        f86692x = new ValueValidator() { // from class: k8.yd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ce.m(((Long) obj).longValue());
            }
        };
        f86693y = new ValueValidator() { // from class: k8.zd
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ce.n(((Long) obj).longValue());
            }
        };
        f86694z = new ValueValidator() { // from class: k8.ae
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return ce.o(((Long) obj).longValue());
            }
        };
        A = new ListValidator() { // from class: k8.be
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return ce.p(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(long j10) {
        return j10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(List list) {
        return list.size() >= 1;
    }
}
