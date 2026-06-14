package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class dz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f87127a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f87128b = "new_value";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeHelper f87129c = TypeHelper.INSTANCE.from(ArraysKt.first(qb.values()), a.f87130f);

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87130f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof qb);
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
        private final my f87131a;

        public c(my myVar) {
            this.f87131a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cz deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression expression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "name");
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "new_value_variable_name");
            if (str2 == null) {
                str2 = dz.f87128b;
            }
            return new cz(expression, str, str2, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "set", this.f87131a.u0()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value_type", dz.f87129c, qb.f90546e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, cz czVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "get", czVar.f86864a);
            JsonPropertyParser.write(parsingContext, jSONObject, "name", czVar.f86865b);
            JsonPropertyParser.write(parsingContext, jSONObject, "new_value_variable_name", czVar.f86866c);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "set", czVar.f86867d, this.f87131a.u0());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "property");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value_type", czVar.f86868e, qb.f90545d);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87132a;

        public d(my myVar) {
            this.f87132a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ez deserialize(ParsingContext parsingContext, ez ezVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new ez(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, ezVar != null ? ezVar.f87396a : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, ezVar != null ? ezVar.f87397b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "new_value_variable_name", allowPropertyOverride, ezVar != null ? ezVar.f87398c : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "set", allowPropertyOverride, ezVar != null ? ezVar.f87399d : null, this.f87132a.v0()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value_type", dz.f87129c, allowPropertyOverride, ezVar != null ? ezVar.f87400e : null, qb.f90546e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ez ezVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "get", ezVar.f87396a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "name", ezVar.f87397b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "new_value_variable_name", ezVar.f87398c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "set", ezVar.f87399d, this.f87132a.v0());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "property");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value_type", ezVar.f87400e, qb.f90545d);
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
        private final my f87133a;

        public e(my myVar) {
            this.f87133a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cz resolve(ParsingContext parsingContext, ez ezVar, JSONObject jSONObject) {
            Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, ezVar.f87396a, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
            String str = (String) JsonFieldResolver.resolve(parsingContext, ezVar.f87397b, jSONObject, "name");
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, ezVar.f87398c, jSONObject, "new_value_variable_name");
            if (str2 == null) {
                str2 = dz.f87128b;
            }
            return new cz(expressionResolveExpression, str, str2, JsonFieldResolver.resolveOptionalList(parsingContext, ezVar.f87399d, jSONObject, "set", this.f87133a.w0(), this.f87133a.u0()), JsonFieldResolver.resolveExpression(parsingContext, ezVar.f87400e, jSONObject, "value_type", dz.f87129c, qb.f90546e));
        }
    }
}
