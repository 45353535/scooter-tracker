package k8;

import com.ironsource.C4240b4;
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
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import k8.bw;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class dw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f87112a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeHelper f87114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ListValidator f87115d;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87116f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof bw.c);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87117a;

        public c(my myVar) {
            this.f87117a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bw deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "actions", this.f87117a.u0(), dw.f87115d);
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper typeHelper = dw.f87114c;
            Function1 function1 = bw.c.f86592e;
            Expression expression2 = dw.f87113b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C4240b4.a.f42515t, typeHelper, function1, expression2);
            if (optionalExpression != null) {
                expression2 = optionalExpression;
            }
            return new bw(list, expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, bw bwVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", bwVar.f86585a, this.f87117a.u0());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "condition", bwVar.f86586b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.a.f42515t, bwVar.f86587c, bw.c.f86591d);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87118a;

        public d(my myVar) {
            this.f87118a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ew deserialize(ParsingContext parsingContext, ew ewVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field field = ewVar != null ? ewVar.f87376a : null;
            Lazy lazyV0 = this.f87118a.v0();
            ListValidator listValidator = dw.f87115d;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new ew(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, field, lazyV0, listValidator), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, ewVar != null ? ewVar.f87377b : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.a.f42515t, dw.f87114c, allowPropertyOverride, ewVar != null ? ewVar.f87378c : null, bw.c.f86592e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ew ewVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", ewVar.f87376a, this.f87118a.v0());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "condition", ewVar.f87377b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.a.f42515t, ewVar.f87378c, bw.c.f86591d);
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

    public static final class e implements TemplateResolver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87119a;

        public e(my myVar) {
            this.f87119a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bw resolve(ParsingContext parsingContext, ew ewVar, JSONObject jSONObject) {
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, ewVar.f87376a, jSONObject, "actions", this.f87119a.w0(), this.f87119a.u0(), dw.f87115d);
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, ewVar.f87377b, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field field = ewVar.f87378c;
            TypeHelper typeHelper = dw.f87114c;
            Function1 function1 = bw.c.f86592e;
            Expression expression = dw.f87113b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, C4240b4.a.f42515t, typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new bw(listResolveList, expressionResolveExpression, expression);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        bw.c cVar = bw.c.ON_CONDITION;
        f87113b = Expression.Companion.constant$default(companion, cVar, null, 2, null);
        f87114c = TypeHelper.INSTANCE.from(cVar, a.f87116f);
        f87115d = new ListValidator() { // from class: k8.cw
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return dw.b(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
