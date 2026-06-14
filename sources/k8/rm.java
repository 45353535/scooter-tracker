package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import k8.cn;
import k8.fm;
import k8.sm;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class rm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f90744a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fm.d f90745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fm.d f90746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sm.d f90747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ListValidator f90748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ListValidator f90749f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90750a;

        public b(my myVar) {
            this.f90750a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public em deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            fm fmVar = (fm) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_x", this.f90750a.c6());
            if (fmVar == null) {
                fmVar = rm.f90745b;
            }
            fm fmVar2 = (fm) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_y", this.f90750a.c6());
            if (fmVar2 == null) {
                fmVar2 = rm.f90746c;
            }
            List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", this.f90750a.f6(), rm.f90749f);
            ExpressionList optionalExpressionList = JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, rm.f90748e);
            sm smVar = (sm) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", this.f90750a.o6());
            if (smVar == null) {
                smVar = rm.f90747d;
            }
            return new em(fmVar, fmVar2, optionalList, optionalExpressionList, smVar);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, em emVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "center_x", emVar.f87339a, this.f90750a.c6());
            JsonPropertyParser.write(parsingContext, jSONObject, "center_y", emVar.f87340b, this.f90750a.c6());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "color_map", emVar.f87341c, this.f90750a.f6());
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, "colors", emVar.f87342d, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "radius", emVar.f87343e, this.f90750a.o6());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90751a;

        public c(my myVar) {
            this.f90751a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public fn deserialize(ParsingContext parsingContext, fn fnVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "center_x", allowPropertyOverride, fnVar != null ? fnVar.f87559a : null, this.f90751a.d6());
            Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "center_y", allowPropertyOverride, fnVar != null ? fnVar.f87560b : null, this.f90751a.d6());
            Field field = fnVar != null ? fnVar.f87561c : null;
            Lazy lazyG6 = this.f90751a.g6();
            ListValidator listValidator = rm.f90749f;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, field, lazyG6, listValidator);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field2 = fnVar != null ? fnVar.f87562d : null;
            Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            ListValidator listValidator2 = rm.f90748e;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new fn(optionalField, optionalField2, optionalListField, JsonFieldParser.readOptionalExpressionListField(parsingContextRestrictPropertyOverride, jSONObject, "colors", typeHelper, allowPropertyOverride, field2, function1, listValidator2), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, fnVar != null ? fnVar.f87563e : null, this.f90751a.p6()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, fn fnVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "center_x", fnVar.f87559a, this.f90751a.d6());
            JsonFieldParser.writeField(parsingContext, jSONObject, "center_y", fnVar.f87560b, this.f90751a.d6());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "color_map", fnVar.f87561c, this.f90751a.g6());
            JsonFieldParser.writeExpressionListField(parsingContext, jSONObject, "colors", fnVar.f87562d, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "radius", fnVar.f87563e, this.f90751a.p6());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "radial_gradient");
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

    public static final class d implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90752a;

        public d(my myVar) {
            this.f90752a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public em resolve(ParsingContext parsingContext, fn fnVar, JSONObject jSONObject) {
            fm fmVar = (fm) JsonFieldResolver.resolveOptional(parsingContext, fnVar.f87559a, jSONObject, "center_x", this.f90752a.e6(), this.f90752a.c6());
            if (fmVar == null) {
                fmVar = rm.f90745b;
            }
            fm fmVar2 = (fm) JsonFieldResolver.resolveOptional(parsingContext, fnVar.f87560b, jSONObject, "center_y", this.f90752a.e6(), this.f90752a.c6());
            if (fmVar2 == null) {
                fmVar2 = rm.f90746c;
            }
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, fnVar.f87561c, jSONObject, "color_map", this.f90752a.h6(), this.f90752a.f6(), rm.f90749f);
            ExpressionList expressionListResolveOptionalExpressionList = JsonFieldResolver.resolveOptionalExpressionList(parsingContext, fnVar.f87562d, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, rm.f90748e);
            sm smVar = (sm) JsonFieldResolver.resolveOptional(parsingContext, fnVar.f87563e, jSONObject, "radius", this.f90752a.q6(), this.f90752a.o6());
            if (smVar == null) {
                smVar = rm.f90747d;
            }
            return new em(fmVar, fmVar2, listResolveOptionalList, expressionListResolveOptionalExpressionList, smVar);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double dValueOf = Double.valueOf(0.5d);
        f90745b = new fm.d(new xm(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f90746c = new fm.d(new xm(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f90747d = new sm.d(new cn(Expression.Companion.constant$default(companion, cn.c.FARTHEST_CORNER, null, 2, null)));
        f90748e = new ListValidator() { // from class: k8.pm
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return rm.c(list);
            }
        };
        f90749f = new ListValidator() { // from class: k8.qm
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return rm.d(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(List list) {
        return list.size() >= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(List list) {
        return list.size() >= 2;
    }
}
