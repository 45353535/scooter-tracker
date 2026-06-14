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
import k8.ff;
import k8.to;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f90706a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f90707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f90708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f90709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f90710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ep.e f90711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f90712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f90713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final to.d f90714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final xc f90715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression f90716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ep.d f90717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeHelper f90718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeHelper f90719n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TypeHelper f90720o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TypeHelper f90721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ValueValidator f90722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ValueValidator f90723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ValueValidator f90724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ValueValidator f90725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ValueValidator f90726u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ListValidator f90727v;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90728f = new a();

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
        public static final b f90729f = new b();

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
        public static final c f90730f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ff.a);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f90731f = new d();

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
        private final my f90732a;

        public f(my myVar) {
            this.f90732a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ff deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f90732a.H());
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = rf.f90707b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_color", typeHelper, function1, expression);
            Expression expression2 = optionalExpression == null ? expression : optionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = rf.f90722q;
            Expression expression3 = rf.f90708c;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_size", typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = optionalExpression2 == null ? expression3 : optionalExpression2;
            gn gnVar = (gn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "active_shape", this.f90732a.x6());
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", rf.f90718m, y5.f92620e);
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", rf.f90719n, z5.f92903e);
            ValueValidator valueValidator2 = rf.f90723r;
            Expression expression5 = rf.f90709d;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper2, function12, valueValidator2, expression5);
            Expression expression6 = optionalExpression5 == null ? expression5 : optionalExpression5;
            TypeHelper typeHelper3 = rf.f90720o;
            Function1 function13 = ff.a.f87500e;
            Expression expression7 = rf.f90710e;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation", typeHelper3, function13, expression7);
            Expression expression8 = optionalExpression6 == null ? expression7 : optionalExpression6;
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f90732a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f90732a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f90732a.L1());
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper4, function14, rf.f90724s);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f90732a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f90732a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f90732a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f90732a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f90732a.Y6());
            if (epVar == null) {
                epVar = rf.f90711f;
            }
            ep epVar2 = epVar;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            Expression expression9 = rf.f90712g;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_item_color", typeHelper, function1, expression9);
            Expression expression10 = optionalExpression8 == null ? expression9 : optionalExpression8;
            gn gnVar2 = (gn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "inactive_minimum_shape", this.f90732a.x6());
            gn gnVar3 = (gn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "inactive_shape", this.f90732a.x6());
            gf gfVar = (gf) JsonPropertyParser.readOptional(parsingContext, jSONObject, "items_placement", this.f90732a.a4());
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f90732a.P4());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f90732a.Y2());
            ValueValidator valueValidator3 = rf.f90725t;
            Expression expression11 = rf.f90713h;
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "minimum_item_size", typeHelper2, function12, valueValidator3, expression11);
            if (optionalExpression9 != null) {
                expression11 = optionalExpression9;
            }
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f90732a.Y2());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pager_id");
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper4, function14, rf.f90726u);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f90732a.u0());
            to toVar = (to) JsonPropertyParser.readOptional(parsingContext, jSONObject, "shape", this.f90732a.V6());
            if (toVar == null) {
                toVar = rf.f90714i;
            }
            to toVar2 = toVar;
            xc xcVar = (xc) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", this.f90732a.w3());
            if (xcVar == null) {
                xcVar = rf.f90715j;
            }
            xc xcVar2 = xcVar;
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f90732a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f90732a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f90732a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f90732a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f90732a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, rf.f90727v);
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f90732a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f90732a.k9());
            TypeHelper typeHelper5 = rf.f90721p;
            Function1 function15 = gx.f87924e;
            Expression expression12 = rf.f90716k;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper5, function15, expression12);
            if (optionalExpression12 != null) {
                expression12 = optionalExpression12;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f90732a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f90732a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f90732a.Y6());
            if (epVar3 == null) {
                epVar3 = rf.f90717l;
            }
            return new ff(g1Var, expression2, expression4, gnVar, optionalExpression3, optionalExpression4, expression6, expression8, optionalList, optionalList2, l7Var, optionalExpression7, optionalList3, optionalList4, bdVar, optionalList5, epVar2, str, expression10, gnVar2, gnVar3, gfVar, zhVar, hbVar, expression11, hbVar2, str2, optionalExpression10, optionalExpression11, optionalList6, toVar2, xcVar2, optionalList7, wvVar, y7Var, r6Var, r6Var2, optionalList8, optionalList9, optionalList10, expression12, hxVar, optionalList11, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ff ffVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", ffVar.o(), this.f90732a.H());
            Expression expression = ffVar.f87473b;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_item_color", expression, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_item_size", ffVar.f87474c);
            JsonPropertyParser.write(parsingContext, jSONObject, "active_shape", ffVar.f87475d, this.f90732a.x6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", ffVar.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", ffVar.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", ffVar.getAlpha());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation", ffVar.f87479h, ff.a.f87499d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", ffVar.w(), this.f90732a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, ffVar.getBackground(), this.f90732a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, ffVar.x(), this.f90732a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", ffVar.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", ffVar.k(), this.f90732a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", ffVar.getExtensions(), this.f90732a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", ffVar.n(), this.f90732a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", ffVar.u(), this.f90732a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", ffVar.getHeight(), this.f90732a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", ffVar.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_item_color", ffVar.f87490s, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "inactive_minimum_shape", ffVar.f87491t, this.f90732a.x6());
            JsonPropertyParser.write(parsingContext, jSONObject, "inactive_shape", ffVar.f87492u, this.f90732a.x6());
            JsonPropertyParser.write(parsingContext, jSONObject, "items_placement", ffVar.f87493v, this.f90732a.a4());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", ffVar.r(), this.f90732a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", ffVar.d(), this.f90732a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "minimum_item_size", ffVar.f87496y);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", ffVar.p(), this.f90732a.Y2());
            JsonPropertyParser.write(parsingContext, jSONObject, "pager_id", ffVar.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", ffVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", ffVar.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", ffVar.q(), this.f90732a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "shape", ffVar.E, this.f90732a.V6());
            JsonPropertyParser.write(parsingContext, jSONObject, "space_between_centers", ffVar.F, this.f90732a.w3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", ffVar.h(), this.f90732a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", ffVar.getTransform(), this.f90732a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", ffVar.j(), this.f90732a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", ffVar.v(), this.f90732a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", ffVar.i(), this.f90732a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", ffVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "indicator");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", ffVar.s(), this.f90732a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", ffVar.c(), this.f90732a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", ffVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", ffVar.t(), this.f90732a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", ffVar.a(), this.f90732a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", ffVar.getWidth(), this.f90732a.Y6());
            return jSONObject;
        }
    }

    public static final class g implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90733a;

        public g(my myVar) {
            this.f90733a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public sf deserialize(ParsingContext parsingContext, sf sfVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, sfVar != null ? sfVar.f91031a : null, this.f90733a.I());
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field = sfVar != null ? sfVar.f91032b : null;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_item_color", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = sfVar != null ? sfVar.f91033c : null;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_item_size", typeHelper2, allowPropertyOverride, field2, function12, rf.f90722q);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "active_shape", allowPropertyOverride, sfVar != null ? sfVar.f91034d : null, this.f90733a.y6());
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", rf.f90718m, allowPropertyOverride, sfVar != null ? sfVar.f91035e : null, y5.f92620e);
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", rf.f90719n, allowPropertyOverride, sfVar != null ? sfVar.f91036f : null, z5.f92903e);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", typeHelper2, allowPropertyOverride, sfVar != null ? sfVar.f91037g : null, function12, rf.f90723r);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animation", rf.f90720o, allowPropertyOverride, sfVar != null ? sfVar.f91038h : null, ff.a.f87500e);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, sfVar != null ? sfVar.f91039i : null, this.f90733a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, sfVar != null ? sfVar.f91040j : null, this.f90733a.G1());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, sfVar != null ? sfVar.f91041k : null, this.f90733a.M1());
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field3 = sfVar != null ? sfVar.f91042l : null;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, field3, function13, rf.f90724s);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, sfVar != null ? sfVar.f91043m : null, this.f90733a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, sfVar != null ? sfVar.f91044n : null, this.f90733a.c3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, sfVar != null ? sfVar.f91045o : null, this.f90733a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, sfVar != null ? sfVar.f91046p : null, this.f90733a.J3());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, sfVar != null ? sfVar.f91047q : null, this.f90733a.Z6());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, sfVar != null ? sfVar.f91048r : null);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_item_color", typeHelper, allowPropertyOverride, sfVar != null ? sfVar.f91049s : null, function1);
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "inactive_minimum_shape", allowPropertyOverride, sfVar != null ? sfVar.f91050t : null, this.f90733a.y6());
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "inactive_shape", allowPropertyOverride, sfVar != null ? sfVar.f91051u : null, this.f90733a.y6());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "items_placement", allowPropertyOverride, sfVar != null ? sfVar.f91052v : null, this.f90733a.b4());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, sfVar != null ? sfVar.f91053w : null, this.f90733a.Q4());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, sfVar != null ? sfVar.f91054x : null, this.f90733a.Z2());
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "minimum_item_size", typeHelper2, allowPropertyOverride, sfVar != null ? sfVar.f91055y : null, function12, rf.f90725t);
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, sfVar != null ? sfVar.f91056z : null, this.f90733a.Z2());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "pager_id", allowPropertyOverride, sfVar != null ? sfVar.A : null);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, sfVar != null ? sfVar.B : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, sfVar != null ? sfVar.C : null, function13, rf.f90726u);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, sfVar != null ? sfVar.D : null, this.f90733a.v0());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, sfVar != null ? sfVar.E : null, this.f90733a.W6());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "space_between_centers", allowPropertyOverride, sfVar != null ? sfVar.F : null, this.f90733a.x3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, sfVar != null ? sfVar.G : null, this.f90733a.Q8());
            Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, sfVar != null ? sfVar.H : null, this.f90733a.c9());
            Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, sfVar != null ? sfVar.I : null, this.f90733a.V1());
            Field optionalField18 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, sfVar != null ? sfVar.J : null, this.f90733a.A1());
            Field optionalField19 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, sfVar != null ? sfVar.K : null, this.f90733a.A1());
            Field field4 = sfVar != null ? sfVar.L : null;
            Function1 function14 = aw.f86414e;
            ListValidator listValidator = rf.f90727v;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new sf(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalField2, optionalFieldWithExpression3, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField, optionalListField2, optionalField3, optionalFieldWithExpression7, optionalListField3, optionalListField4, optionalField4, optionalListField5, optionalField5, optionalField6, optionalFieldWithExpression8, optionalField7, optionalField8, optionalField9, optionalField10, optionalField11, optionalFieldWithExpression9, optionalField12, optionalField13, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalListField6, optionalField14, optionalField15, optionalListField7, optionalField16, optionalField17, optionalField18, optionalField19, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, function14, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, sfVar != null ? sfVar.M : null, this.f90733a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, sfVar != null ? sfVar.N : null, this.f90733a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", rf.f90721p, allowPropertyOverride, sfVar != null ? sfVar.O : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, sfVar != null ? sfVar.P : null, this.f90733a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, sfVar != null ? sfVar.Q : null, this.f90733a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, sfVar != null ? sfVar.R : null, this.f90733a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, sf sfVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", sfVar.f91031a, this.f90733a.I());
            Field field = sfVar.f91032b;
            Function1<Integer, String> function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_item_color", field, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_item_size", sfVar.f91033c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "active_shape", sfVar.f91034d, this.f90733a.y6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", sfVar.f91035e, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", sfVar.f91036f, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", sfVar.f91037g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation", sfVar.f91038h, ff.a.f87499d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", sfVar.f91039i, this.f90733a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, sfVar.f91040j, this.f90733a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, sfVar.f91041k, this.f90733a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", sfVar.f91042l);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", sfVar.f91043m, this.f90733a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", sfVar.f91044n, this.f90733a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", sfVar.f91045o, this.f90733a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", sfVar.f91046p, this.f90733a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", sfVar.f91047q, this.f90733a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", sfVar.f91048r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_item_color", sfVar.f91049s, function1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "inactive_minimum_shape", sfVar.f91050t, this.f90733a.y6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "inactive_shape", sfVar.f91051u, this.f90733a.y6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "items_placement", sfVar.f91052v, this.f90733a.b4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", sfVar.f91053w, this.f90733a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", sfVar.f91054x, this.f90733a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "minimum_item_size", sfVar.f91055y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", sfVar.f91056z, this.f90733a.Z2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "pager_id", sfVar.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", sfVar.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", sfVar.C);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", sfVar.D, this.f90733a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "shape", sfVar.E, this.f90733a.W6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "space_between_centers", sfVar.F, this.f90733a.x3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", sfVar.G, this.f90733a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", sfVar.H, this.f90733a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", sfVar.I, this.f90733a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", sfVar.J, this.f90733a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", sfVar.K, this.f90733a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", sfVar.L, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "indicator");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", sfVar.M, this.f90733a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", sfVar.N, this.f90733a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", sfVar.O, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", sfVar.P, this.f90733a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", sfVar.Q, this.f90733a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", sfVar.R, this.f90733a.Z6());
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
        private final my f90734a;

        public h(my myVar) {
            this.f90734a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ff resolve(ParsingContext parsingContext, sf sfVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91031a, jSONObject, "accessibility", this.f90734a.J(), this.f90734a.H());
            Field field = sfVar.f91032b;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = rf.f90707b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "active_item_color", typeHelper, function1, expression);
            Expression expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
            Field field2 = sfVar.f91033c;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = rf.f90722q;
            Expression expression3 = rf.f90708c;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "active_item_size", typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = expressionResolveOptionalExpression2 == null ? expression3 : expressionResolveOptionalExpression2;
            gn gnVar = (gn) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91034d, jSONObject, "active_shape", this.f90734a.z6(), this.f90734a.x6());
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, sfVar.f91035e, jSONObject, "alignment_horizontal", rf.f90718m, y5.f92620e);
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, sfVar.f91036f, jSONObject, "alignment_vertical", rf.f90719n, z5.f92903e);
            Field field3 = sfVar.f91037g;
            ValueValidator valueValidator2 = rf.f90723r;
            Expression expression5 = rf.f90709d;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper2, function12, valueValidator2, expression5);
            Expression expression6 = expressionResolveOptionalExpression5 == null ? expression5 : expressionResolveOptionalExpression5;
            Field field4 = sfVar.f91038h;
            TypeHelper typeHelper3 = rf.f90720o;
            Function1 function13 = ff.a.f87500e;
            Expression expression7 = rf.f90710e;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "animation", typeHelper3, function13, expression7);
            Expression expression8 = expressionResolveOptionalExpression6 == null ? expression7 : expressionResolveOptionalExpression6;
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.f91039i, jSONObject, "animators", this.f90734a.v1(), this.f90734a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.f91040j, jSONObject, H2.f75840g, this.f90734a.H1(), this.f90734a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91041k, jSONObject, OutlinedTextFieldKt.BorderId, this.f90734a.N1(), this.f90734a.L1());
            Field field5 = sfVar.f91042l;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper4, function14, rf.f90724s);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.f91043m, jSONObject, "disappear_actions", this.f90734a.R2(), this.f90734a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.f91044n, jSONObject, "extensions", this.f90734a.d3(), this.f90734a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91045o, jSONObject, "focus", this.f90734a.B3(), this.f90734a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.f91046p, jSONObject, "functions", this.f90734a.K3(), this.f90734a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91047q, jSONObject, "height", this.f90734a.a7(), this.f90734a.Y6());
            if (epVar == null) {
                epVar = rf.f90711f;
            }
            ep epVar2 = epVar;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91048r, jSONObject, "id");
            Field field6 = sfVar.f91049s;
            Expression expression9 = rf.f90712g;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "inactive_item_color", typeHelper, function1, expression9);
            Expression expression10 = expressionResolveOptionalExpression8 == null ? expression9 : expressionResolveOptionalExpression8;
            gn gnVar2 = (gn) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91050t, jSONObject, "inactive_minimum_shape", this.f90734a.z6(), this.f90734a.x6());
            gn gnVar3 = (gn) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91051u, jSONObject, "inactive_shape", this.f90734a.z6(), this.f90734a.x6());
            gf gfVar = (gf) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91052v, jSONObject, "items_placement", this.f90734a.c4(), this.f90734a.a4());
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91053w, jSONObject, "layout_provider", this.f90734a.R4(), this.f90734a.P4());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91054x, jSONObject, "margins", this.f90734a.a3(), this.f90734a.Y2());
            Field field7 = sfVar.f91055y;
            ValueValidator valueValidator3 = rf.f90725t;
            Expression expression11 = rf.f90713h;
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "minimum_item_size", typeHelper2, function12, valueValidator3, expression11);
            if (expressionResolveOptionalExpression9 != null) {
                expression11 = expressionResolveOptionalExpression9;
            }
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, sfVar.f91056z, jSONObject, "paddings", this.f90734a.a3(), this.f90734a.Y2());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, sfVar.A, jSONObject, "pager_id");
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, sfVar.B, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, sfVar.C, jSONObject, "row_span", typeHelper4, function14, rf.f90726u);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.D, jSONObject, "selected_actions", this.f90734a.w0(), this.f90734a.u0());
            to toVar = (to) JsonFieldResolver.resolveOptional(parsingContext, sfVar.E, jSONObject, "shape", this.f90734a.X6(), this.f90734a.V6());
            if (toVar == null) {
                toVar = rf.f90714i;
            }
            to toVar2 = toVar;
            xc xcVar = (xc) JsonFieldResolver.resolveOptional(parsingContext, sfVar.F, jSONObject, "space_between_centers", this.f90734a.y3(), this.f90734a.w3());
            if (xcVar == null) {
                xcVar = rf.f90715j;
            }
            xc xcVar2 = xcVar;
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.G, jSONObject, "tooltips", this.f90734a.R8(), this.f90734a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, sfVar.H, jSONObject, "transform", this.f90734a.d9(), this.f90734a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, sfVar.I, jSONObject, "transition_change", this.f90734a.W1(), this.f90734a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, sfVar.J, jSONObject, "transition_in", this.f90734a.B1(), this.f90734a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, sfVar.K, jSONObject, "transition_out", this.f90734a.B1(), this.f90734a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.L, jSONObject, "transition_triggers", aw.f86414e, rf.f90727v);
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.M, jSONObject, "variable_triggers", this.f90734a.g9(), this.f90734a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.N, jSONObject, "variables", this.f90734a.m9(), this.f90734a.k9());
            Field field8 = sfVar.O;
            TypeHelper typeHelper5 = rf.f90721p;
            Function1 function15 = gx.f87924e;
            Expression expression12 = rf.f90716k;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "visibility", typeHelper5, function15, expression12);
            if (expressionResolveOptionalExpression12 != null) {
                expression12 = expressionResolveOptionalExpression12;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, sfVar.P, jSONObject, "visibility_action", this.f90734a.y9(), this.f90734a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, sfVar.Q, jSONObject, "visibility_actions", this.f90734a.y9(), this.f90734a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, sfVar.R, jSONObject, "width", this.f90734a.a7(), this.f90734a.Y6());
            if (epVar3 == null) {
                epVar3 = rf.f90717l;
            }
            return new ff(g1Var, expression2, expression4, gnVar, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4, expression6, expression8, listResolveOptionalList, listResolveOptionalList2, l7Var, expressionResolveOptionalExpression7, listResolveOptionalList3, listResolveOptionalList4, bdVar, listResolveOptionalList5, epVar2, str, expression10, gnVar2, gnVar3, gfVar, zhVar, hbVar, expression11, hbVar2, str2, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, listResolveOptionalList6, toVar2, xcVar2, listResolveOptionalList7, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList8, listResolveOptionalList9, listResolveOptionalList10, expression12, hxVar, listResolveOptionalList11, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90707b = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        f90708c = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        f90709d = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        ff.a aVar = ff.a.SCALE;
        f90710e = Expression.Companion.constant$default(companion, aVar, null, 2, null);
        Expression expression = null;
        f90711f = new ep.e(new nx(expression, null, null, 7, null));
        f90712g = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        f90713h = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        byte b10 = 0 == true ? 1 : 0;
        f90714i = new to.d(new gn(expression, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, b10, 31, null));
        f90715j = new xc(null, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, null);
        gx gxVar = gx.VISIBLE;
        f90716k = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f90717l = new ep.d(new ni(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f90718m = companion2.from(ArraysKt.first(y5.values()), a.f90728f);
        f90719n = companion2.from(ArraysKt.first(z5.values()), b.f90729f);
        f90720o = companion2.from(aVar, c.f90730f);
        f90721p = companion2.from(gxVar, d.f90731f);
        f90722q = new ValueValidator() { // from class: k8.lf
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rf.g(((Double) obj).doubleValue());
            }
        };
        f90723r = new ValueValidator() { // from class: k8.mf
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rf.h(((Double) obj).doubleValue());
            }
        };
        f90724s = new ValueValidator() { // from class: k8.nf
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rf.i(((Long) obj).longValue());
            }
        };
        f90725t = new ValueValidator() { // from class: k8.of
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rf.j(((Double) obj).doubleValue());
            }
        };
        f90726u = new ValueValidator() { // from class: k8.pf
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return rf.k(((Long) obj).longValue());
            }
        };
        f90727v = new ListValidator() { // from class: k8.qf
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return rf.l(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(double d10) {
        return d10 > 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(double d10) {
        return d10 >= 0.0d && d10 <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(double d10) {
        return d10 > 0.0d;
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
