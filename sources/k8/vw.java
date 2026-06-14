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
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class vw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f92046a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f92047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f92048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ep.e f92049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression f92050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression f92051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression f92052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression f92053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression f92054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ep.d f92055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TypeHelper f92056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final TypeHelper f92057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeHelper f92058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeHelper f92059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ValueValidator f92060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ValueValidator f92061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ValueValidator f92062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ListValidator f92063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ListValidator f92064s;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92065f = new a();

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
        public static final b f92066f = new b();

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
        public static final c f92067f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ww);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f92068f = new d();

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
        private final my f92069a;

        public f(my myVar) {
            this.f92069a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public pw deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.f92069a.H());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", vw.f92056k, y5.f92620e);
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", vw.f92057l, z5.f92903e);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = vw.f92060o;
            Expression expression = vw.f92047b;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (optionalExpression3 != null) {
                expression = optionalExpression3;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.f92069a.t1());
            w6 w6Var = (w6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.f92069a.C1());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = vw.f92048c;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autostart", typeHelper2, function12, expression2);
            Expression expression3 = optionalExpression4 == null ? expression2 : optionalExpression4;
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, H2.f75840g, this.f92069a.F1());
            l7 l7Var = (l7) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f92069a.L1());
            List optionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "buffering_actions", this.f92069a.u0());
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, function13, vw.f92061p);
            List optionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.f92069a.P2());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "elapsed_time_variable");
            List optionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.f92069a.u0());
            List optionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.f92069a.b3());
            List optionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "fatal_actions", this.f92069a.u0());
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.f92069a.z3());
            List optionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.f92069a.I3());
            ep epVar = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.f92069a.Y6());
            if (epVar == null) {
                epVar = vw.f92049d;
            }
            ep epVar2 = epVar;
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            zh zhVar = (zh) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.f92069a.P4());
            hb hbVar = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.f92069a.Y2());
            Expression expression4 = vw.f92050e;
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "muted", typeHelper2, function12, expression4);
            Expression expression5 = optionalExpression6 == null ? expression4 : optionalExpression6;
            hb hbVar2 = (hb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.f92069a.Y2());
            List optionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "pause_actions", this.f92069a.u0());
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "player_settings_payload");
            Expression expression6 = vw.f92051f;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper2, function12, expression6);
            Expression expression7 = optionalExpression7 == null ? expression6 : optionalExpression7;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper4);
            Expression expression8 = vw.f92052g;
            Expression expression9 = expression;
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "repeatable", typeHelper2, function12, expression8);
            Expression expression10 = optionalExpression9 == null ? expression8 : optionalExpression9;
            List optionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "resume_actions", this.f92069a.u0());
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper4);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, function13, vw.f92062q);
            TypeHelper typeHelper5 = vw.f92058m;
            Function1 function14 = ww.f92254e;
            Expression expression11 = vw.f92053h;
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper5, function14, expression11);
            Expression expression12 = optionalExpression12 == null ? expression11 : optionalExpression12;
            List optionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.f92069a.u0());
            List optionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.f92069a.P8());
            wv wvVar = (wv) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.f92069a.b9());
            y7 y7Var = (y7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.f92069a.U1());
            r6 r6Var = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.f92069a.z1());
            r6 r6Var2 = (r6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.f92069a.z1());
            List optionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", aw.f86414e, vw.f92063r);
            List optionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.f92069a.e9());
            List optionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.f92069a.k9());
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "video_sources", this.f92069a.q9(), vw.f92064s);
            TypeHelper typeHelper6 = vw.f92059n;
            Function1 function15 = gx.f87924e;
            Expression expression13 = vw.f92054i;
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, function15, expression13);
            if (optionalExpression13 != null) {
                expression13 = optionalExpression13;
            }
            hx hxVar = (hx) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.f92069a.w9());
            List optionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.f92069a.w9());
            ep epVar3 = (ep) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.f92069a.Y6());
            if (epVar3 == null) {
                epVar3 = vw.f92055j;
            }
            return new pw(g1Var, optionalExpression, optionalExpression2, expression9, optionalList, w6Var, expression3, optionalList2, l7Var, optionalList3, optionalExpression5, optionalList4, str, optionalList5, optionalList6, optionalList7, bdVar, optionalList8, epVar2, str2, zhVar, hbVar, expression5, hbVar2, optionalList9, jSONObject2, expression7, optionalExpression8, expression10, optionalList10, optionalExpression10, optionalExpression11, expression12, optionalList11, optionalList12, wvVar, y7Var, r6Var, r6Var2, optionalList13, optionalList14, optionalList15, list, expression13, hxVar, optionalList16, epVar3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, pw pwVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", pwVar.o(), this.f92069a.H());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", pwVar.g(), y5.f92619d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", pwVar.m(), z5.f92902d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", pwVar.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", pwVar.w(), this.f92069a.t1());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", pwVar.f90473f, this.f92069a.C1());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "autostart", pwVar.f90474g);
            JsonPropertyParser.writeList(parsingContext, jSONObject, H2.f75840g, pwVar.getBackground(), this.f92069a.F1());
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, pwVar.x(), this.f92069a.L1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "buffering_actions", pwVar.f90477j, this.f92069a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", pwVar.b());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", pwVar.k(), this.f92069a.P2());
            JsonPropertyParser.write(parsingContext, jSONObject, "elapsed_time_variable", pwVar.f90480m);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", pwVar.f90481n, this.f92069a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", pwVar.getExtensions(), this.f92069a.b3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "fatal_actions", pwVar.f90483p, this.f92069a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", pwVar.n(), this.f92069a.z3());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", pwVar.u(), this.f92069a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", pwVar.getHeight(), this.f92069a.Y6());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", pwVar.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", pwVar.r(), this.f92069a.P4());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", pwVar.d(), this.f92069a.Y2());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "muted", pwVar.f90490w);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", pwVar.p(), this.f92069a.Y2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "pause_actions", pwVar.f90492y, this.f92069a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "player_settings_payload", pwVar.f90493z);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", pwVar.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", pwVar.B);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "repeatable", pwVar.C);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "resume_actions", pwVar.D, this.f92069a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", pwVar.f());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", pwVar.e());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", pwVar.G, ww.f92253d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", pwVar.q(), this.f92069a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", pwVar.h(), this.f92069a.P8());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", pwVar.getTransform(), this.f92069a.b9());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", pwVar.j(), this.f92069a.U1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", pwVar.v(), this.f92069a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", pwVar.i(), this.f92069a.z1());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", pwVar.l(), aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", pwVar.s(), this.f92069a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", pwVar.c(), this.f92069a.k9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "video_sources", pwVar.Q, this.f92069a.q9());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", pwVar.getVisibility(), gx.f87923d);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", pwVar.t(), this.f92069a.w9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", pwVar.a(), this.f92069a.w9());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", pwVar.getWidth(), this.f92069a.Y6());
            return jSONObject;
        }
    }

    public static final class g implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92070a;

        public g(my myVar) {
            this.f92070a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public fx deserialize(ParsingContext parsingContext, fx fxVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, fxVar != null ? fxVar.f87650a : null, this.f92070a.I());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", vw.f92056k, allowPropertyOverride, fxVar != null ? fxVar.f87651b : null, y5.f92620e);
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", vw.f92057l, allowPropertyOverride, fxVar != null ? fxVar.f87652c : null, z5.f92903e);
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, fxVar != null ? fxVar.f87653d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, vw.f92060o);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, fxVar != null ? fxVar.f87654e : null, this.f92070a.u1());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, fxVar != null ? fxVar.f87655f : null, this.f92070a.D1());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = fxVar != null ? fxVar.f87656g : null;
            Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "autostart", typeHelper, allowPropertyOverride, field, function1);
            Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, fxVar != null ? fxVar.f87657h : null, this.f92070a.G1());
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, fxVar != null ? fxVar.f87658i : null, this.f92070a.M1());
            Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "buffering_actions", allowPropertyOverride, fxVar != null ? fxVar.f87659j : null, this.f92070a.v0());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = fxVar != null ? fxVar.f87660k : null;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, function12, vw.f92061p);
            Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, fxVar != null ? fxVar.f87661l : null, this.f92070a.Q2());
            Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "elapsed_time_variable", allowPropertyOverride, fxVar != null ? fxVar.f87662m : null);
            Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, fxVar != null ? fxVar.f87663n : null, this.f92070a.v0());
            Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, fxVar != null ? fxVar.f87664o : null, this.f92070a.c3());
            Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "fatal_actions", allowPropertyOverride, fxVar != null ? fxVar.f87665p : null, this.f92070a.v0());
            Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, fxVar != null ? fxVar.f87666q : null, this.f92070a.A3());
            Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, fxVar != null ? fxVar.f87667r : null, this.f92070a.J3());
            Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, fxVar != null ? fxVar.f87668s : null, this.f92070a.Z6());
            Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, fxVar != null ? fxVar.f87669t : null);
            Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, fxVar != null ? fxVar.f87670u : null, this.f92070a.Q4());
            Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, fxVar != null ? fxVar.f87671v : null, this.f92070a.Z2());
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "muted", typeHelper, allowPropertyOverride, fxVar != null ? fxVar.f87672w : null, function1);
            Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, fxVar != null ? fxVar.f87673x : null, this.f92070a.Z2());
            Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "pause_actions", allowPropertyOverride, fxVar != null ? fxVar.f87674y : null, this.f92070a.v0());
            Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "player_settings_payload", allowPropertyOverride, fxVar != null ? fxVar.f87675z : null);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preload_required", typeHelper, allowPropertyOverride, fxVar != null ? fxVar.A : null, function1);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "preview", typeHelper3, allowPropertyOverride, fxVar != null ? fxVar.B : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "repeatable", typeHelper, allowPropertyOverride, fxVar != null ? fxVar.C : null, function1);
            Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "resume_actions", allowPropertyOverride, fxVar != null ? fxVar.D : null, this.f92070a.v0());
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, fxVar != null ? fxVar.E : null);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, fxVar != null ? fxVar.F : null, function12, vw.f92062q);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "scale", vw.f92058m, allowPropertyOverride, fxVar != null ? fxVar.G : null, ww.f92254e);
            Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, fxVar != null ? fxVar.H : null, this.f92070a.v0());
            Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, fxVar != null ? fxVar.I : null, this.f92070a.Q8());
            Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, fxVar != null ? fxVar.J : null, this.f92070a.c9());
            Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, fxVar != null ? fxVar.K : null, this.f92070a.V1());
            Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, fxVar != null ? fxVar.L : null, this.f92070a.A1());
            Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, fxVar != null ? fxVar.M : null, this.f92070a.A1());
            Field field3 = fxVar != null ? fxVar.N : null;
            Function1 function13 = aw.f86414e;
            ListValidator listValidator = vw.f92063r;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, function13, listValidator);
            Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, fxVar != null ? fxVar.O : null, this.f92070a.f9());
            Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, fxVar != null ? fxVar.P : null, this.f92070a.l9());
            Field field4 = fxVar != null ? fxVar.Q : null;
            Lazy lazyR9 = this.f92070a.r9();
            ListValidator listValidator2 = vw.f92064s;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new fx(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalField2, optionalFieldWithExpression4, optionalListField2, optionalField3, optionalListField3, optionalFieldWithExpression5, optionalListField4, optionalField4, optionalListField5, optionalListField6, optionalListField7, optionalField5, optionalListField8, optionalField6, optionalField7, optionalField8, optionalField9, optionalFieldWithExpression6, optionalField10, optionalListField9, optionalField11, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField10, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField11, optionalListField12, optionalField12, optionalField13, optionalField14, optionalField15, optionalListField13, optionalListField14, optionalListField15, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "video_sources", allowPropertyOverride, field4, lazyR9, listValidator2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "visibility", vw.f92059n, allowPropertyOverride, fxVar != null ? fxVar.R : null, gx.f87924e), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, fxVar != null ? fxVar.S : null, this.f92070a.x9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, fxVar != null ? fxVar.T : null, this.f92070a.x9()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, fxVar != null ? fxVar.U : null, this.f92070a.Z6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, fx fxVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", fxVar.f87650a, this.f92070a.I());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", fxVar.f87651b, y5.f92619d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", fxVar.f87652c, z5.f92902d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", fxVar.f87653d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", fxVar.f87654e, this.f92070a.u1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", fxVar.f87655f, this.f92070a.D1());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "autostart", fxVar.f87656g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, H2.f75840g, fxVar.f87657h, this.f92070a.G1());
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, fxVar.f87658i, this.f92070a.M1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "buffering_actions", fxVar.f87659j, this.f92070a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", fxVar.f87660k);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", fxVar.f87661l, this.f92070a.Q2());
            JsonFieldParser.writeField(parsingContext, jSONObject, "elapsed_time_variable", fxVar.f87662m);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", fxVar.f87663n, this.f92070a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", fxVar.f87664o, this.f92070a.c3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "fatal_actions", fxVar.f87665p, this.f92070a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", fxVar.f87666q, this.f92070a.A3());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", fxVar.f87667r, this.f92070a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", fxVar.f87668s, this.f92070a.Z6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", fxVar.f87669t);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", fxVar.f87670u, this.f92070a.Q4());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", fxVar.f87671v, this.f92070a.Z2());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "muted", fxVar.f87672w);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", fxVar.f87673x, this.f92070a.Z2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "pause_actions", fxVar.f87674y, this.f92070a.v0());
            JsonFieldParser.writeField(parsingContext, jSONObject, "player_settings_payload", fxVar.f87675z);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", fxVar.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", fxVar.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "repeatable", fxVar.C);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "resume_actions", fxVar.D, this.f92070a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", fxVar.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", fxVar.F);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", fxVar.G, ww.f92253d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", fxVar.H, this.f92070a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", fxVar.I, this.f92070a.Q8());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", fxVar.J, this.f92070a.c9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", fxVar.K, this.f92070a.V1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", fxVar.L, this.f92070a.A1());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", fxVar.M, this.f92070a.A1());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", fxVar.N, aw.f86413d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", fxVar.O, this.f92070a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", fxVar.P, this.f92070a.l9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "video_sources", fxVar.Q, this.f92070a.r9());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", fxVar.R, gx.f87923d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", fxVar.S, this.f92070a.x9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", fxVar.T, this.f92070a.x9());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", fxVar.U, this.f92070a.Z6());
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
        private final my f92071a;

        public h(my myVar) {
            this.f92071a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public pw resolve(ParsingContext parsingContext, fx fxVar, JSONObject jSONObject) {
            g1 g1Var = (g1) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87650a, jSONObject, "accessibility", this.f92071a.J(), this.f92071a.H());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, fxVar.f87651b, jSONObject, "alignment_horizontal", vw.f92056k, y5.f92620e);
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, fxVar.f87652c, jSONObject, "alignment_vertical", vw.f92057l, z5.f92903e);
            Field field = fxVar.f87653d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = vw.f92060o;
            Expression expression = vw.f92047b;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (expressionResolveOptionalExpression3 != null) {
                expression = expressionResolveOptionalExpression3;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.f87654e, jSONObject, "animators", this.f92071a.v1(), this.f92071a.t1());
            w6 w6Var = (w6) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87655f, jSONObject, "aspect", this.f92071a.E1(), this.f92071a.C1());
            Field field2 = fxVar.f87656g;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = vw.f92048c;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "autostart", typeHelper2, function12, expression2);
            Expression expression3 = expressionResolveOptionalExpression4 == null ? expression2 : expressionResolveOptionalExpression4;
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.f87657h, jSONObject, H2.f75840g, this.f92071a.H1(), this.f92071a.F1());
            l7 l7Var = (l7) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87658i, jSONObject, OutlinedTextFieldKt.BorderId, this.f92071a.N1(), this.f92071a.L1());
            List listResolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.f87659j, jSONObject, "buffering_actions", this.f92071a.w0(), this.f92071a.u0());
            Field field3 = fxVar.f87660k;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper3, function13, vw.f92061p);
            List listResolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.f87661l, jSONObject, "disappear_actions", this.f92071a.R2(), this.f92071a.P2());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87662m, jSONObject, "elapsed_time_variable");
            List listResolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.f87663n, jSONObject, "end_actions", this.f92071a.w0(), this.f92071a.u0());
            List listResolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.f87664o, jSONObject, "extensions", this.f92071a.d3(), this.f92071a.b3());
            List listResolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.f87665p, jSONObject, "fatal_actions", this.f92071a.w0(), this.f92071a.u0());
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87666q, jSONObject, "focus", this.f92071a.B3(), this.f92071a.z3());
            List listResolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.f87667r, jSONObject, "functions", this.f92071a.K3(), this.f92071a.I3());
            ep epVar = (ep) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87668s, jSONObject, "height", this.f92071a.a7(), this.f92071a.Y6());
            if (epVar == null) {
                epVar = vw.f92049d;
            }
            ep epVar2 = epVar;
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87669t, jSONObject, "id");
            zh zhVar = (zh) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87670u, jSONObject, "layout_provider", this.f92071a.R4(), this.f92071a.P4());
            hb hbVar = (hb) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87671v, jSONObject, "margins", this.f92071a.a3(), this.f92071a.Y2());
            Field field4 = fxVar.f87672w;
            Expression expression4 = vw.f92050e;
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "muted", typeHelper2, function12, expression4);
            Expression expression5 = expressionResolveOptionalExpression6 == null ? expression4 : expressionResolveOptionalExpression6;
            hb hbVar2 = (hb) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87673x, jSONObject, "paddings", this.f92071a.a3(), this.f92071a.Y2());
            List listResolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.f87674y, jSONObject, "pause_actions", this.f92071a.w0(), this.f92071a.u0());
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, fxVar.f87675z, jSONObject, "player_settings_payload");
            Field field5 = fxVar.A;
            Expression expression6 = vw.f92051f;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "preload_required", typeHelper2, function12, expression6);
            Expression expression7 = expressionResolveOptionalExpression7 == null ? expression6 : expressionResolveOptionalExpression7;
            Field field6 = fxVar.B;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "preview", typeHelper4);
            Field field7 = fxVar.C;
            Expression expression8 = vw.f92052g;
            Expression expression9 = expression;
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "repeatable", typeHelper2, function12, expression8);
            Expression expression10 = expressionResolveOptionalExpression9 == null ? expression8 : expressionResolveOptionalExpression9;
            List listResolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.D, jSONObject, "resume_actions", this.f92071a.w0(), this.f92071a.u0());
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, fxVar.E, jSONObject, "reuse_id", typeHelper4);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, fxVar.F, jSONObject, "row_span", typeHelper3, function13, vw.f92062q);
            Field field8 = fxVar.G;
            TypeHelper typeHelper5 = vw.f92058m;
            Function1 function14 = ww.f92254e;
            Expression expression11 = vw.f92053h;
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "scale", typeHelper5, function14, expression11);
            Expression expression12 = expressionResolveOptionalExpression12 == null ? expression11 : expressionResolveOptionalExpression12;
            List listResolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.H, jSONObject, "selected_actions", this.f92071a.w0(), this.f92071a.u0());
            List listResolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.I, jSONObject, "tooltips", this.f92071a.R8(), this.f92071a.P8());
            wv wvVar = (wv) JsonFieldResolver.resolveOptional(parsingContext, fxVar.J, jSONObject, "transform", this.f92071a.d9(), this.f92071a.b9());
            y7 y7Var = (y7) JsonFieldResolver.resolveOptional(parsingContext, fxVar.K, jSONObject, "transition_change", this.f92071a.W1(), this.f92071a.U1());
            r6 r6Var = (r6) JsonFieldResolver.resolveOptional(parsingContext, fxVar.L, jSONObject, "transition_in", this.f92071a.B1(), this.f92071a.z1());
            r6 r6Var2 = (r6) JsonFieldResolver.resolveOptional(parsingContext, fxVar.M, jSONObject, "transition_out", this.f92071a.B1(), this.f92071a.z1());
            List listResolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.N, jSONObject, "transition_triggers", aw.f86414e, vw.f92063r);
            List listResolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.O, jSONObject, "variable_triggers", this.f92071a.g9(), this.f92071a.e9());
            List listResolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.P, jSONObject, "variables", this.f92071a.m9(), this.f92071a.k9());
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, fxVar.Q, jSONObject, "video_sources", this.f92071a.s9(), this.f92071a.q9(), vw.f92064s);
            Field field9 = fxVar.R;
            TypeHelper typeHelper6 = vw.f92059n;
            Function1 function15 = gx.f87924e;
            Expression expression13 = vw.f92054i;
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper6, function15, expression13);
            if (expressionResolveOptionalExpression13 != null) {
                expression13 = expressionResolveOptionalExpression13;
            }
            hx hxVar = (hx) JsonFieldResolver.resolveOptional(parsingContext, fxVar.S, jSONObject, "visibility_action", this.f92071a.y9(), this.f92071a.w9());
            List listResolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, fxVar.T, jSONObject, "visibility_actions", this.f92071a.y9(), this.f92071a.w9());
            ep epVar3 = (ep) JsonFieldResolver.resolveOptional(parsingContext, fxVar.U, jSONObject, "width", this.f92071a.a7(), this.f92071a.Y6());
            if (epVar3 == null) {
                epVar3 = vw.f92055j;
            }
            return new pw(g1Var, expressionResolveOptionalExpression, expressionResolveOptionalExpression2, expression9, listResolveOptionalList, w6Var, expression3, listResolveOptionalList2, l7Var, listResolveOptionalList3, expressionResolveOptionalExpression5, listResolveOptionalList4, str, listResolveOptionalList5, listResolveOptionalList6, listResolveOptionalList7, bdVar, listResolveOptionalList8, epVar2, str2, zhVar, hbVar, expression5, hbVar2, listResolveOptionalList9, jSONObject2, expression7, expressionResolveOptionalExpression8, expression10, listResolveOptionalList10, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expression12, listResolveOptionalList11, listResolveOptionalList12, wvVar, y7Var, r6Var, r6Var2, listResolveOptionalList13, listResolveOptionalList14, listResolveOptionalList15, listResolveList, expression13, hxVar, listResolveOptionalList16, epVar3);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92047b = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        f92048c = Expression.Companion.constant$default(companion, bool, null, 2, null);
        int i10 = 7;
        DefaultConstructorMarker defaultConstructorMarker = null;
        kp kpVar = null;
        f92049d = new ep.e(new nx(null, kpVar, null, i10, defaultConstructorMarker));
        f92050e = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f92051f = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f92052g = Expression.Companion.constant$default(companion, bool, null, 2, null);
        ww wwVar = ww.FIT;
        f92053h = Expression.Companion.constant$default(companion, wwVar, null, 2, null);
        gx gxVar = gx.VISIBLE;
        f92054i = Expression.Companion.constant$default(companion, gxVar, null, 2, null);
        f92055j = new ep.d(new ni(0 == true ? 1 : 0, kpVar, 0 == true ? 1 : 0, i10, defaultConstructorMarker));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f92056k = companion2.from(ArraysKt.first(y5.values()), a.f92065f);
        f92057l = companion2.from(ArraysKt.first(z5.values()), b.f92066f);
        f92058m = companion2.from(wwVar, c.f92067f);
        f92059n = companion2.from(gxVar, d.f92068f);
        f92060o = new ValueValidator() { // from class: k8.qw
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return vw.f(((Double) obj).doubleValue());
            }
        };
        f92061p = new ValueValidator() { // from class: k8.rw
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return vw.g(((Long) obj).longValue());
            }
        };
        f92062q = new ValueValidator() { // from class: k8.sw
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return vw.h(((Long) obj).longValue());
            }
        };
        f92063r = new ListValidator() { // from class: k8.tw
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return vw.i(list);
            }
        };
        f92064s = new ListValidator() { // from class: k8.uw
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return vw.j(list);
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
