package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f88963a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f88964b = "it";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ListValidator f88965c = new ListValidator() { // from class: k8.l8
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return m8.b(list);
        }
    };

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88966a;

        public b(my myVar) {
            this.f88966a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k8 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "data_element_name");
            if (str == null) {
                str = m8.f88964b;
            }
            return new k8(expression, str, JsonPropertyParser.readList(parsingContext, jSONObject, "prototypes", this.f88966a.g2(), m8.f88965c));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, k8 k8Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "data", k8Var.f88580a);
            JsonPropertyParser.write(parsingContext, jSONObject, "data_element_name", k8Var.f88581b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "prototypes", k8Var.f88582c, this.f88966a.g2());
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88967a;

        public c(my myVar) {
            this.f88967a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o8 deserialize(ParsingContext parsingContext, o8 o8Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, allowPropertyOverride, o8Var != null ? o8Var.f90164a : null);
            Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "data_element_name", allowPropertyOverride, o8Var != null ? o8Var.f90165b : null);
            Field field = o8Var != null ? o8Var.f90166c : null;
            Lazy lazyH2 = this.f88967a.h2();
            Field field2 = field;
            ListValidator listValidator = m8.f88965c;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new o8(fieldWithExpression, optionalField, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "prototypes", allowPropertyOverride, field2, lazyH2, listValidator));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, o8 o8Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "data", o8Var.f90164a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "data_element_name", o8Var.f90165b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "prototypes", o8Var.f90166c, this.f88967a.h2());
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
        private final my f88968a;

        public d(my myVar) {
            this.f88968a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k8 resolve(ParsingContext parsingContext, o8 o8Var, JSONObject jSONObject) {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, o8Var.f90164a, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, o8Var.f90165b, jSONObject, "data_element_name");
            if (str == null) {
                str = m8.f88964b;
            }
            return new k8(expressionResolveExpression, str, JsonFieldResolver.resolveList(parsingContext, o8Var.f90166c, jSONObject, "prototypes", this.f88968a.i2(), this.f88968a.g2(), m8.f88965c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
