package k8;

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
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f87786a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f87787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeHelper f87788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ListValidator f87789d;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87790f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof zv);
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
        private final my f87791a;

        public c(my myVar) {
            this.f87791a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ea deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            ParsingContext parsingContextCollectingErrors = ParsingContextKt.collectingErrors(parsingContext);
            List optionalList = JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "functions", this.f87791a.I3());
            String str = (String) JsonPropertyParser.read(parsingContextCollectingErrors, jSONObject, "log_id");
            List list = JsonPropertyParser.readList(parsingContextCollectingErrors, jSONObject, "states", this.f87791a.G2(), ga.f87789d);
            List optionalList2 = JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "timers", this.f87791a.M8());
            TypeHelper typeHelper = ga.f87788c;
            Function1 function1 = zv.f93012e;
            Expression expression = ga.f87787b;
            Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContextCollectingErrors, jSONObject, "transition_animation_selector", typeHelper, function1, expression);
            if (optionalExpression != null) {
                expression = optionalExpression;
            }
            return new ea(optionalList, str, list, optionalList2, expression, JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "variable_triggers", this.f87791a.e9()), JsonPropertyParser.readOptionalList(parsingContextCollectingErrors, jSONObject, "variables", this.f87791a.k9()), ParsingContextKt.getCollectedErrors(parsingContextCollectingErrors));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ea eaVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", eaVar.f87203a, this.f87791a.I3());
            JsonPropertyParser.write(parsingContext, jSONObject, "log_id", eaVar.f87204b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "states", eaVar.f87205c, this.f87791a.G2());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "timers", eaVar.f87206d, this.f87791a.M8());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "transition_animation_selector", eaVar.f87207e, zv.f93011d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", eaVar.f87208f, this.f87791a.e9());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", eaVar.f87209g, this.f87791a.k9());
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87792a;

        public d(my myVar) {
            this.f87792a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ka deserialize(ParsingContext parsingContext, ka kaVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, kaVar != null ? kaVar.f88596a : null, this.f87792a.J3());
            Field field = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "log_id", allowPropertyOverride, kaVar != null ? kaVar.f88597b : null);
            Field field2 = kaVar != null ? kaVar.f88598c : null;
            Lazy lazyH2 = this.f87792a.H2();
            ListValidator listValidator = ga.f87789d;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new ka(optionalListField, field, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "states", allowPropertyOverride, field2, lazyH2, listValidator), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "timers", allowPropertyOverride, kaVar != null ? kaVar.f88599d : null, this.f87792a.N8()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "transition_animation_selector", ga.f87788c, allowPropertyOverride, kaVar != null ? kaVar.f88600e : null, zv.f93012e), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, kaVar != null ? kaVar.f88601f : null, this.f87792a.f9()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, kaVar != null ? kaVar.f88602g : null, this.f87792a.l9()));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ka kaVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", kaVar.f88596a, this.f87792a.J3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "log_id", kaVar.f88597b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "states", kaVar.f88598c, this.f87792a.H2());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "timers", kaVar.f88599d, this.f87792a.N8());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "transition_animation_selector", kaVar.f88600e, zv.f93011d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", kaVar.f88601f, this.f87792a.f9());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", kaVar.f88602g, this.f87792a.l9());
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
        private final my f87793a;

        public e(my myVar) {
            this.f87793a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ea resolve(ParsingContext parsingContext, ka kaVar, JSONObject jSONObject) {
            List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.f88596a, jSONObject, "functions", this.f87793a.K3(), this.f87793a.I3());
            String str = (String) JsonFieldResolver.resolve(parsingContext, kaVar.f88597b, jSONObject, "log_id");
            List listResolveList = JsonFieldResolver.resolveList(parsingContext, kaVar.f88598c, jSONObject, "states", this.f87793a.I2(), this.f87793a.G2(), ga.f87789d);
            List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.f88599d, jSONObject, "timers", this.f87793a.O8(), this.f87793a.M8());
            Field field = kaVar.f88600e;
            TypeHelper typeHelper = ga.f87788c;
            Function1 function1 = zv.f93012e;
            Expression expression = ga.f87787b;
            Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "transition_animation_selector", typeHelper, function1, expression);
            if (expressionResolveOptionalExpression != null) {
                expression = expressionResolveOptionalExpression;
            }
            return new ea(listResolveOptionalList, str, listResolveList, listResolveOptionalList2, expression, JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.f88601f, jSONObject, "variable_triggers", this.f87793a.g9(), this.f87793a.e9()), JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.f88602g, jSONObject, "variables", this.f87793a.m9(), this.f87793a.k9()), null, 128, null);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        zv zvVar = zv.NONE;
        f87787b = Expression.Companion.constant$default(companion, zvVar, null, 2, null);
        f87788c = TypeHelper.INSTANCE.from(zvVar, a.f87790f);
        f87789d = new ListValidator() { // from class: k8.fa
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                return ga.b(list);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
