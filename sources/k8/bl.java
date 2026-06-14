package k8;

import com.ironsource.C4240b4;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import k8.wk;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f86557a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f86558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeHelper f86559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ListValidator f86560d;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86561f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof wk.d);
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
        private final my f86562a;

        public c(my myVar) {
            this.f86562a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wk deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List list = JsonPropertyParser.readList(parsingContext, jSONObject, "changes", this.f86562a.F5(), bl.f86560d);
            TypeHelper typeHelper = bl.f86559c;
            Function1 function1 = wk.d.f92210e;
            Expression expression = bl.f86558b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, C4240b4.a.f42515t, typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new wk(list, expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_applied_actions", this.f86562a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_failed_actions", this.f86562a.u0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, wk wkVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "changes", wkVar.f92195a, this.f86562a.F5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, C4240b4.a.f42515t, wkVar.f92196b, wk.d.f92209d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "on_applied_actions", wkVar.f92197c, this.f86562a.u0());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "on_failed_actions", wkVar.f92198d, this.f86562a.u0());
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f86563a;

        public d(my myVar) {
            this.f86563a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cl deserialize(ParsingContext parsingContext, cl clVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field field = clVar != null ? clVar.f86746a : null;
            Lazy lazyG5 = this.f86563a.G5();
            ListValidator listValidator = bl.f86560d;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new cl(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "changes", allowPropertyOverride, field, lazyG5, listValidator), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, C4240b4.a.f42515t, bl.f86559c, allowPropertyOverride, clVar != null ? clVar.f86747b : null, wk.d.f92210e), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_applied_actions", allowPropertyOverride, clVar != null ? clVar.f86748c : null, this.f86563a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_failed_actions", allowPropertyOverride, clVar != null ? clVar.f86749d : null, this.f86563a.v0()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, cl clVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "changes", clVar.f86746a, this.f86563a.G5());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, C4240b4.a.f42515t, clVar.f86747b, wk.d.f92209d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "on_applied_actions", clVar.f86748c, this.f86563a.v0());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "on_failed_actions", clVar.f86749d, this.f86563a.v0());
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
        private final my f86564a;

        public e(my myVar) {
            this.f86564a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wk resolve(ParsingContext parsingContext, cl clVar, JSONObject jSONObject) {
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, clVar.f86746a, jSONObject, "changes", this.f86564a.H5(), this.f86564a.F5(), bl.f86560d);
            Field field = clVar.f86747b;
            TypeHelper typeHelper = bl.f86559c;
            Function1 function1 = wk.d.f92210e;
            Expression expression = bl.f86558b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, C4240b4.a.f42515t, typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new wk(listResolveList, expression, JsonFieldResolver.resolveOptionalList(parsingContext, clVar.f86748c, jSONObject, "on_applied_actions", this.f86564a.w0(), this.f86564a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, clVar.f86749d, jSONObject, "on_failed_actions", this.f86564a.w0(), this.f86564a.u0()));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        wk.d dVar = wk.d.PARTIAL;
        f86558b = Expression.Companion.constant$default(companion, dVar, null, 2, null);
        f86559c = TypeHelper.INSTANCE.from(dVar, a.f86561f);
        f86560d = new ListValidator() { // from class: k8.al
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return bl.b(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
