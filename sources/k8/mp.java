package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class mp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f89046a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f89047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeHelper f89048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ValueValidator f89049d;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f89050f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof jp);
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
        private final my f89051a;

        public c(my myVar) {
            this.f89051a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kp deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper typeHelper = mp.f89048c;
            Function1 function1 = jp.f88507e;
            Expression expression = mp.f89047b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new kp(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, mp.f89049d));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, kp kpVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", kpVar.f88676a, jp.f88506d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", kpVar.f88677b);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f89052a;

        public d(my myVar) {
            this.f89052a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public np deserialize(ParsingContext parsingContext, np npVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new np(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "unit", mp.f89048c, allowPropertyOverride, npVar != null ? npVar.f90099a : null, jp.f88507e), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, npVar != null ? npVar.f90100b : null, ParsingConvertersKt.NUMBER_TO_INT, mp.f89049d));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, np npVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", npVar.f90099a, jp.f88506d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", npVar.f90100b);
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
        private final my f89053a;

        public e(my myVar) {
            this.f89053a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kp resolve(ParsingContext parsingContext, np npVar, JSONObject jSONObject) {
            Field field = npVar.f90099a;
            TypeHelper typeHelper = mp.f89048c;
            Function1 function1 = jp.f88507e;
            Expression expression = mp.f89047b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new kp(expression, JsonFieldResolver.resolveExpression(parsingContext, npVar.f90100b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, mp.f89049d));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        jp jpVar = jp.DP;
        f89047b = Expression.Companion.constant$default(companion, jpVar, null, 2, null);
        f89048c = TypeHelper.INSTANCE.from(jpVar, a.f89050f);
        f89049d = new ValueValidator() { // from class: k8.lp
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                return mp.b(((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(long j10) {
        return j10 >= 0;
    }
}
