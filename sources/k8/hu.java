package k8;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.provider.FontsContractCompat;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import k8.us;
import k8.xu;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class hu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f88112a = new f(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f88113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f88114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f88115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeHelper f88116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TypeHelper f88117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TypeHelper f88118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TypeHelper f88119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final TypeHelper f88120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ValueValidator f88121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ValueValidator f88122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ValueValidator f88123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ValueValidator f88124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ValueValidator f88125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ValueValidator f88126o;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88127f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof vs);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f88128f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jp);
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f88129f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jd);
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f88130f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ei);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f88131f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ei);
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
        private final my f88132a;

        public g(my myVar) {
            this.f88132a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public us.e deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f88132a.u0());
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", hu.f88116e, vs.f92013e);
            st stVar = (st) JsonPropertyParser.readOptional(parsingContext, jSONObject, H2.f75840g, this.f88132a.s8());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression = hu.f88113b;
            Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "baseline_offset", typeHelper, function1, expression);
            Expression expression2 = optionalExpression2 == null ? expression : optionalExpression2;
            xt xtVar = (xt) JsonPropertyParser.readOptional(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, this.f88132a.v8());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper2, function12, hu.f88121j);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
            Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper3);
            Expression optionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper2, function12, hu.f88122k);
            TypeHelper typeHelper4 = hu.f88117f;
            Function1 function13 = jp.f88507e;
            Expression expression3 = hu.f88114c;
            Expression optionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper4, function13, expression3);
            Expression expression4 = optionalExpression7 == null ? expression3 : optionalExpression7;
            Expression optionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression optionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, hu.f88118g, jd.f88380e);
            Expression optionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, function12, hu.f88123l);
            Expression optionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, function1);
            Expression optionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, function12, hu.f88124m);
            iu iuVar = (iu) JsonPropertyParser.readOptional(parsingContext, jSONObject, "mask", this.f88132a.D8());
            ValueValidator valueValidator = hu.f88125n;
            Expression expression5 = hu.f88115d;
            Expression optionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper2, function12, valueValidator, expression5);
            if (optionalExpression13 != null) {
                expression5 = optionalExpression13;
            }
            TypeHelper typeHelper5 = hu.f88119h;
            Function1 function14 = ei.f87313e;
            return new us.e(optionalList, optionalExpression, stVar, expression2, xtVar, optionalExpression3, optionalExpression4, optionalExpression5, optionalExpression6, expression4, optionalExpression8, optionalExpression9, optionalExpression10, optionalExpression11, optionalExpression12, iuVar, expression5, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper5, function14), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (oo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_shadow", this.f88132a.P6()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top_offset", typeHelper2, function12, hu.f88126o), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "underline", hu.f88120i, function14));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, us.e eVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", eVar.f91821a, this.f88132a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", eVar.f91822b, vs.f92012d);
            JsonPropertyParser.write(parsingContext, jSONObject, H2.f75840g, eVar.f91823c, this.f88132a.s8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "baseline_offset", eVar.f91824d);
            JsonPropertyParser.write(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, eVar.f91825e, this.f88132a.v8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", eVar.f91826f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", eVar.f91827g);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_feature_settings", eVar.f91828h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", eVar.f91829i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", eVar.f91830j, jp.f88506d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, eVar.f91831k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, eVar.f91832l, jd.f88379d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", eVar.f91833m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", eVar.f91834n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", eVar.f91835o);
            JsonPropertyParser.write(parsingContext, jSONObject, "mask", eVar.f91836p, this.f88132a.D8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", eVar.f91837q);
            Expression expression = eVar.f91838r;
            Function1 function1 = ei.f87312d;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "strike", expression, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", eVar.f91839s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_shadow", eVar.f91840t, this.f88132a.P6());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top_offset", eVar.f91841u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "underline", eVar.f91842v, function1);
            return jSONObject;
        }
    }

    public static final class h implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88133a;

        public h(my myVar) {
            this.f88133a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xu.e deserialize(ParsingContext parsingContext, xu.e eVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, eVar != null ? eVar.f92508a : null, this.f88133a.v0());
            Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", hu.f88116e, allowPropertyOverride, eVar != null ? eVar.f92509b : null, vs.f92013e);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, H2.f75840g, allowPropertyOverride, eVar != null ? eVar.f92510c : null, this.f88133a.t8());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = eVar != null ? eVar.f92511d : null;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "baseline_offset", typeHelper, allowPropertyOverride, field, function1);
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, OutlinedTextFieldKt.BorderId, allowPropertyOverride, eVar != null ? eVar.f92512e : null, this.f88133a.w8());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = eVar != null ? eVar.f92513f : null;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end", typeHelper2, allowPropertyOverride, field2, function12, hu.f88121j);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, eVar != null ? eVar.f92514g : null);
            Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper3, allowPropertyOverride, eVar != null ? eVar.f92515h : null);
            Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f92516i : null, function12, hu.f88122k);
            Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", hu.f88117f, allowPropertyOverride, eVar != null ? eVar.f92517j : null, jp.f88507e);
            Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, eVar != null ? eVar.f92518k : null);
            Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, FontsContractCompat.Columns.WEIGHT, hu.f88118g, allowPropertyOverride, eVar != null ? eVar.f92519l : null, jd.f88380e);
            Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f92520m : null, function12, hu.f88123l);
            Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, eVar != null ? eVar.f92521n : null, function1);
            Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f92522o : null, function12, hu.f88124m);
            Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, eVar != null ? eVar.f92523p : null, this.f88133a.E8());
            Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f92524q : null, function12, hu.f88125n);
            TypeHelper typeHelper4 = hu.f88119h;
            Field field3 = eVar != null ? eVar.f92525r : null;
            Function1 function13 = ei.f87313e;
            return new xu.e(optionalListField, optionalFieldWithExpression, optionalField, optionalFieldWithExpression2, optionalField2, optionalFieldWithExpression3, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalField3, optionalFieldWithExpression13, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "strike", typeHelper4, allowPropertyOverride, field3, function13), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, eVar != null ? eVar.f92526s : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, eVar != null ? eVar.f92527t : null, this.f88133a.Q6()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "top_offset", typeHelper2, allowPropertyOverride, eVar != null ? eVar.f92528u : null, function12, hu.f88126o), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "underline", hu.f88120i, allowPropertyOverride, eVar != null ? eVar.f92529v : null, function13));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, xu.e eVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", eVar.f92508a, this.f88133a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", eVar.f92509b, vs.f92012d);
            JsonFieldParser.writeField(parsingContext, jSONObject, H2.f75840g, eVar.f92510c, this.f88133a.t8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "baseline_offset", eVar.f92511d);
            JsonFieldParser.writeField(parsingContext, jSONObject, OutlinedTextFieldKt.BorderId, eVar.f92512e, this.f88133a.w8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", eVar.f92513f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", eVar.f92514g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_feature_settings", eVar.f92515h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", eVar.f92516i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", eVar.f92517j, jp.f88506d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, eVar.f92518k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, FontsContractCompat.Columns.WEIGHT, eVar.f92519l, jd.f88379d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", eVar.f92520m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", eVar.f92521n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", eVar.f92522o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "mask", eVar.f92523p, this.f88133a.E8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", eVar.f92524q);
            Field field = eVar.f92525r;
            Function1 function1 = ei.f87312d;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "strike", field, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", eVar.f92526s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_shadow", eVar.f92527t, this.f88133a.Q6());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top_offset", eVar.f92528u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "underline", eVar.f92529v, function1);
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
        private final my f88134a;

        public i(my myVar) {
            this.f88134a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public us.e resolve(ParsingContext parsingContext, xu.e eVar, JSONObject jSONObject) {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, eVar.f92508a, jSONObject, "actions", this.f88134a.w0(), this.f88134a.u0());
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92509b, jSONObject, "alignment_vertical", hu.f88116e, vs.f92013e);
            st stVar = (st) JsonFieldResolver.resolveOptional(parsingContext, eVar.f92510c, jSONObject, H2.f75840g, this.f88134a.u8(), this.f88134a.s8());
            Field field = eVar.f92511d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression = hu.f88113b;
            Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "baseline_offset", typeHelper, function1, expression);
            Expression expression2 = expressionResolveOptionalExpression2 == null ? expression : expressionResolveOptionalExpression2;
            xt xtVar = (xt) JsonFieldResolver.resolveOptional(parsingContext, eVar.f92512e, jSONObject, OutlinedTextFieldKt.BorderId, this.f88134a.x8(), this.f88134a.v8());
            Field field2 = eVar.f92513f;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "end", typeHelper2, function12, hu.f88121j);
            Field field3 = eVar.f92514g;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "font_family", typeHelper3);
            Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92515h, jSONObject, "font_feature_settings", typeHelper3);
            Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92516i, jSONObject, "font_size", typeHelper2, function12, hu.f88122k);
            Field field4 = eVar.f92517j;
            TypeHelper typeHelper4 = hu.f88117f;
            Function1 function13 = jp.f88507e;
            Expression expression3 = hu.f88114c;
            Expression expressionResolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "font_size_unit", typeHelper4, function13, expression3);
            Expression expression4 = expressionResolveOptionalExpression7 == null ? expression3 : expressionResolveOptionalExpression7;
            Expression expressionResolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92518k, jSONObject, FontsContractCompat.Columns.VARIATION_SETTINGS, TypeHelpersKt.TYPE_HELPER_DICT);
            Expression expressionResolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92519l, jSONObject, FontsContractCompat.Columns.WEIGHT, hu.f88118g, jd.f88380e);
            Expression expressionResolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92520m, jSONObject, "font_weight_value", typeHelper2, function12, hu.f88123l);
            Expression expressionResolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92521n, jSONObject, "letter_spacing", typeHelper, function1);
            Expression expressionResolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92522o, jSONObject, "line_height", typeHelper2, function12, hu.f88124m);
            iu iuVar = (iu) JsonFieldResolver.resolveOptional(parsingContext, eVar.f92523p, jSONObject, "mask", this.f88134a.F8(), this.f88134a.D8());
            Field field5 = eVar.f92524q;
            ValueValidator valueValidator = hu.f88125n;
            Expression expression5 = hu.f88115d;
            Expression expressionResolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start", typeHelper2, function12, valueValidator, expression5);
            if (expressionResolveOptionalExpression13 != null) {
                expression5 = expressionResolveOptionalExpression13;
            }
            Field field6 = eVar.f92525r;
            TypeHelper typeHelper5 = hu.f88119h;
            Function1 function14 = ei.f87313e;
            return new us.e(listResolveOptionalList, expressionResolveOptionalExpression, stVar, expression2, xtVar, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6, expression4, expressionResolveOptionalExpression8, expressionResolveOptionalExpression9, expressionResolveOptionalExpression10, expressionResolveOptionalExpression11, expressionResolveOptionalExpression12, iuVar, expression5, JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "strike", typeHelper5, function14), JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92526s, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (oo) JsonFieldResolver.resolveOptional(parsingContext, eVar.f92527t, jSONObject, "text_shadow", this.f88134a.R6(), this.f88134a.P6()), JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92528u, jSONObject, "top_offset", typeHelper2, function12, hu.f88126o), JsonFieldResolver.resolveOptionalExpression(parsingContext, eVar.f92529v, jSONObject, "underline", hu.f88120i, function14));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f88113b = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        jp jpVar = jp.SP;
        f88114c = Expression.Companion.constant$default(companion, jpVar, null, 2, null);
        f88115d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        f88116e = companion2.from(ArraysKt.first(vs.values()), a.f88127f);
        f88117f = companion2.from(jpVar, b.f88128f);
        f88118g = companion2.from(ArraysKt.first(jd.values()), c.f88129f);
        f88119h = companion2.from(ArraysKt.first(ei.values()), d.f88130f);
        f88120i = companion2.from(ArraysKt.first(ei.values()), e.f88131f);
        f88121j = new ValueValidator() { // from class: k8.bu
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return hu.g(((Long) obj).longValue());
            }
        };
        f88122k = new ValueValidator() { // from class: k8.cu
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return hu.h(((Long) obj).longValue());
            }
        };
        f88123l = new ValueValidator() { // from class: k8.du
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return hu.i(((Long) obj).longValue());
            }
        };
        f88124m = new ValueValidator() { // from class: k8.eu
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return hu.j(((Long) obj).longValue());
            }
        };
        f88125n = new ValueValidator() { // from class: k8.fu
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return hu.k(((Long) obj).longValue());
            }
        };
        f88126o = new ValueValidator() { // from class: k8.gu
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return hu.l(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(long j10) {
        return j10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(long j10) {
        return j10 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(long j10) {
        return j10 > 0;
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
    public static final boolean l(long j10) {
        return j10 >= 0;
    }
}
