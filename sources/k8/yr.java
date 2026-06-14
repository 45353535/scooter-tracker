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
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class yr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f92788a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f92789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ep.e f92790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f92791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f92792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ep.d f92793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f92794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TypeHelper f92795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final TypeHelper f92796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ValueValidator f92797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ValueValidator f92798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ValueValidator f92799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ListValidator f92800m;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92801f = new a();

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
        public static final b f92802f = new b();

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
        public static final c f92803f = new c();

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
        private final my f92804a;

        public e(my myVar) {
            this.f92804a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public tr deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f92804a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", yr.f92794g, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", yr.f92795h, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = yr.f92797j;
            Expression expression = yr.f92789b;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f92804a.t1());
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f92804a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f92804a.L1());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, yr.f92798k);
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f92804a.P2());
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f92804a.b3());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f92804a.z3());
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f92804a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f92804a.Y6());
            if (epVar == null) {
                epVar = yr.f92790c;
            }
            ep epVar2 = epVar;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = yr.f92791d;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper3, function13, expression2);
            Expression expression3 = optionalExpression5 == null ? expression2 : optionalExpression5;
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "is_on_variable");
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f92804a.P4());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f92804a.Y2());
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f92804a.Y2());
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, yr.f92799l);
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f92804a.u0());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f92804a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f92804a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f92804a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f92804a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f92804a.z1());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, yr.f92800m);
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f92804a.e9());
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f92804a.k9());
            TypeHelper typeHelper4 = yr.f92796i;
            Function1 function14 = gx.f87924e;
            Expression expression4 = yr.f92792e;
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, function14, expression4);
            if (optionalExpression9 != null) {
                expression4 = optionalExpression9;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f92804a.w9());
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f92804a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f92804a.Y6());
            if (epVar3 == null) {
                epVar3 = yr.f92793f;
            }
            return new tr(g1Var, optionalExpression, optionalExpression2, expression, optionalList, optionalList2, l7Var, optionalExpression4, optionalList3, optionalList4, bdVar, optionalList5, epVar2, str, expression3, str2, zhVar, hbVar, optionalExpression6, hbVar2, optionalExpression7, optionalExpression8, optionalList6, optionalList7, wvVar, y7Var, r6Var, r6Var2, optionalList8, optionalList9, optionalList10, expression4, hxVar, optionalList11, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, tr trVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", trVar.o(), this.f92804a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", trVar.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", trVar.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", trVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", trVar.w(), this.f92804a.t1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, trVar.getBackground(), this.f92804a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, trVar.x(), this.f92804a.L1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", trVar.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", trVar.k(), this.f92804a.P2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", trVar.getExtensions(), this.f92804a.b3());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", trVar.n(), this.f92804a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", trVar.u(), this.f92804a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", trVar.getHeight(), this.f92804a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", trVar.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", trVar.f91487o);
            JsonPropertyParser.write(parsingContext, jSONObject, "is_on_variable", trVar.f91488p);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", trVar.r(), this.f92804a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", trVar.d(), this.f92804a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "on_color", trVar.f91491s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", trVar.p(), this.f92804a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", trVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", trVar.e());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", trVar.q(), this.f92804a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", trVar.h(), this.f92804a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", trVar.getTransform(), this.f92804a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", trVar.j(), this.f92804a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", trVar.v(), this.f92804a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", trVar.i(), this.f92804a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", trVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "switch");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", trVar.s(), this.f92804a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", trVar.c(), this.f92804a.k9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", trVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", trVar.t(), this.f92804a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", trVar.a(), this.f92804a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", trVar.getWidth(), this.f92804a.Y6());
            return jSONObject;
        }
    }

    public static final class f implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92805a;

        public f(my myVar) {
            this.f92805a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public zr deserialize(ParsingContext parsingContext, zr zrVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, zrVar != null ? zrVar.f92972a : null, this.f92805a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", yr.f92794g, allowPropertyOverride, zrVar != null ? zrVar.f92973b : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", yr.f92795h, allowPropertyOverride, zrVar != null ? zrVar.f92974c : null, z5.f92903e);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, zrVar != null ? zrVar.f92975d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, yr.f92797j);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, zrVar != null ? zrVar.f92976e : null, this.f92805a.u1());
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, zrVar != null ? zrVar.f92977f : null, this.f92805a.G1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, zrVar != null ? zrVar.f92978g : null, this.f92805a.M1());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = zrVar != null ? zrVar.f92979h : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, function1, yr.f92798k);
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, zrVar != null ? zrVar.f92980i : null, this.f92805a.Q2());
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, zrVar != null ? zrVar.f92981j : null, this.f92805a.c3());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, zrVar != null ? zrVar.f92982k : null, this.f92805a.A3());
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, zrVar != null ? zrVar.f92983l : null, this.f92805a.J3());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, zrVar != null ? zrVar.f92984m : null, this.f92805a.Z6());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, zrVar != null ? zrVar.f92985n : null);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, zrVar != null ? zrVar.f92986o : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field field2 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "is_on_variable", allowPropertyOverride, zrVar != null ? zrVar.f92987p : null);
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, zrVar != null ? zrVar.f92988q : null, this.f92805a.Q4());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, zrVar != null ? zrVar.f92989r : null, this.f92805a.Z2());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, zrVar != null ? zrVar.f92990s : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, zrVar != null ? zrVar.f92991t : null, this.f92805a.Z2());
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, zrVar != null ? zrVar.f92992u : null);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, zrVar != null ? zrVar.f92993v : null, function1, yr.f92799l);
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, zrVar != null ? zrVar.f92994w : null, this.f92805a.v0());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, zrVar != null ? zrVar.f92995x : null, this.f92805a.Q8());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, zrVar != null ? zrVar.f92996y : null, this.f92805a.c9());
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, zrVar != null ? zrVar.f92997z : null, this.f92805a.V1());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, zrVar != null ? zrVar.A : null, this.f92805a.A1());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, zrVar != null ? zrVar.B : null, this.f92805a.A1());
            Field field3 = zrVar != null ? zrVar.C : null;
            Function1 function12 = aw.f86414e;
            ListValidator listValidator = yr.f92800m;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new zr(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression5, field2, optionalField6, optionalField7, optionalFieldWithExpression6, optionalField8, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalListField6, optionalListField7, optionalField9, optionalField10, optionalField11, optionalField12, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, function12, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, zrVar != null ? zrVar.D : null, this.f92805a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, zrVar != null ? zrVar.E : null, this.f92805a.l9()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", yr.f92796i, allowPropertyOverride, zrVar != null ? zrVar.F : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, zrVar != null ? zrVar.G : null, this.f92805a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, zrVar != null ? zrVar.H : null, this.f92805a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, zrVar != null ? zrVar.I : null, this.f92805a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, zr zrVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", zrVar.f92972a, this.f92805a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", zrVar.f92973b, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", zrVar.f92974c, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", zrVar.f92975d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", zrVar.f92976e, this.f92805a.u1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, zrVar.f92977f, this.f92805a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, zrVar.f92978g, this.f92805a.M1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", zrVar.f92979h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", zrVar.f92980i, this.f92805a.Q2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", zrVar.f92981j, this.f92805a.c3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", zrVar.f92982k, this.f92805a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", zrVar.f92983l, this.f92805a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", zrVar.f92984m, this.f92805a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", zrVar.f92985n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", zrVar.f92986o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "is_on_variable", zrVar.f92987p);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", zrVar.f92988q, this.f92805a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", zrVar.f92989r, this.f92805a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "on_color", zrVar.f92990s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", zrVar.f92991t, this.f92805a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", zrVar.f92992u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", zrVar.f92993v);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", zrVar.f92994w, this.f92805a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", zrVar.f92995x, this.f92805a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", zrVar.f92996y, this.f92805a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", zrVar.f92997z, this.f92805a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", zrVar.A, this.f92805a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", zrVar.B, this.f92805a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", zrVar.C, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "switch");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", zrVar.D, this.f92805a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", zrVar.E, this.f92805a.l9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", zrVar.F, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", zrVar.G, this.f92805a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", zrVar.H, this.f92805a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", zrVar.I, this.f92805a.Z6());
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
        private final my f92806a;

        public g(my myVar) {
            this.f92806a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public tr resolve(ParsingContext parsingContext, zr zrVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, zrVar.f92972a, jSONObject, "accessibility", this.f92806a.J(), this.f92806a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, zrVar.f92973b, jSONObject, "alignment_horizontal", yr.f92794g, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, zrVar.f92974c, jSONObject, "alignment_vertical", yr.f92795h, z5.f92903e);
            Field field = zrVar.f92975d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = yr.f92797j;
            Expression expression = yr.f92789b;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.f92976e, jSONObject, "animators", this.f92806a.v1(), this.f92806a.t1());
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.f92977f, jSONObject, H2.f75840g, this.f92806a.H1(), this.f92806a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, zrVar.f92978g, jSONObject, OutlinedTextFieldKt.BorderId, this.f92806a.N1(), this.f92806a.L1());
            Field field2 = zrVar.f92979h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, yr.f92798k);
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.f92980i, jSONObject, "disappear_actions", this.f92806a.R2(), this.f92806a.P2());
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.f92981j, jSONObject, "extensions", this.f92806a.d3(), this.f92806a.b3());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, zrVar.f92982k, jSONObject, "focus", this.f92806a.B3(), this.f92806a.z3());
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.f92983l, jSONObject, "functions", this.f92806a.K3(), this.f92806a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, zrVar.f92984m, jSONObject, "height", this.f92806a.a7(), this.f92806a.Y6());
            if (epVar == null) {
                epVar = yr.f92790c;
            }
            ep epVar2 = epVar;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, zrVar.f92985n, jSONObject, "id");
            Field field3 = zrVar.f92986o;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = yr.f92791d;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper3, function13, expression2);
            Expression expression3 = expressionResolveOptionalExpression5 == null ? expression2 : expressionResolveOptionalExpression5;
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, zrVar.f92987p, jSONObject, "is_on_variable");
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, zrVar.f92988q, jSONObject, "layout_provider", this.f92806a.R4(), this.f92806a.P4());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, zrVar.f92989r, jSONObject, "margins", this.f92806a.a3(), this.f92806a.Y2());
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, zrVar.f92990s, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, zrVar.f92991t, jSONObject, "paddings", this.f92806a.a3(), this.f92806a.Y2());
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, zrVar.f92992u, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, zrVar.f92993v, jSONObject, "row_span", typeHelper2, function12, yr.f92799l);
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.f92994w, jSONObject, "selected_actions", this.f92806a.w0(), this.f92806a.u0());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.f92995x, jSONObject, "tooltips", this.f92806a.R8(), this.f92806a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, zrVar.f92996y, jSONObject, "transform", this.f92806a.d9(), this.f92806a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, zrVar.f92997z, jSONObject, "transition_change", this.f92806a.W1(), this.f92806a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, zrVar.A, jSONObject, "transition_in", this.f92806a.B1(), this.f92806a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, zrVar.B, jSONObject, "transition_out", this.f92806a.B1(), this.f92806a.z1());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.C, jSONObject, "transition_triggers", aw.f86414e, yr.f92800m);
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.D, jSONObject, "variable_triggers", this.f92806a.g9(), this.f92806a.e9());
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.E, jSONObject, "variables", this.f92806a.m9(), this.f92806a.k9());
            Field field4 = zrVar.F;
            TypeHelper typeHelper4 = yr.f92796i;
            Function1 function14 = gx.f87924e;
            Expression expression4 = yr.f92792e;
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "visibility", typeHelper4, function14, expression4);
            if (expressionResolveOptionalExpression9 != null) {
                expression4 = expressionResolveOptionalExpression9;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, zrVar.G, jSONObject, "visibility_action", this.f92806a.y9(), this.f92806a.w9());
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, zrVar.H, jSONObject, "visibility_actions", this.f92806a.y9(), this.f92806a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, zrVar.I, jSONObject, "width", this.f92806a.a7(), this.f92806a.Y6());
            if (epVar3 == null) {
                epVar3 = yr.f92793f;
            }
            return new tr(g1Var, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression, listResolveOptionalList, listResolveOptionalList2, l7Var, expressionResolveOptionalExpression4, listResolveOptionalList3, listResolveOptionalList4, bdVar, listResolveOptionalList5, epVar2, str, expression3, str2, zhVar, hbVar, expressionResolveOptionalExpression6, hbVar2, expressionResolveOptionalExpression7, expressionResolveOptionalExpression8, listResolveOptionalList6, listResolveOptionalList7, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList8, listResolveOptionalList9, listResolveOptionalList10, expression4, hxVar, listResolveOptionalList11, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92789b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f92790c = new ep.e(new nx(null, null, null, 7, null));
        f92791d = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        gx gxVar = gx.VISIBLE;
        f92792e = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f92793f = new ep.d(new ni(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f92794g = companion2.from(ArraysKt.first(y5.values()), a.f92801f);
        f92795h = companion2.from(ArraysKt.first(z5.values()), b.f92802f);
        f92796i = companion2.from(gxVar, c.f92803f);
        f92797j = new ValueValidator() { // from class: k8.ur
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return yr.e(((Double) obj).doubleValue());
            }
        };
        f92798k = new ValueValidator() { // from class: k8.vr
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return yr.f(((Long) obj).longValue());
            }
        };
        f92799l = new ValueValidator() { // from class: k8.wr
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return yr.g(((Long) obj).longValue());
            }
        };
        f92800m = new ListValidator() { // from class: k8.xr
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return yr.h(list);
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
