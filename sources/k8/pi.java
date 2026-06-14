package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f90379a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ValueValidator f90380b = new ValueValidator() { // from class: k8.oi
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return pi.b(((Double) obj).doubleValue());
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
        private final my f90381a;

        public b(my myVar) {
            this.f90381a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ni deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new ni((kp) JsonPropertyParser.readOptional(parsingContext, jSONObject, "max_size", this.f90381a.b7()), (kp) JsonPropertyParser.readOptional(parsingContext, jSONObject, "min_size", this.f90381a.b7()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, pi.f90380b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ni niVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "max_size", niVar.f90042a, this.f90381a.b7());
            JsonPropertyParser.write(parsingContext, jSONObject, "min_size", niVar.f90043b, this.f90381a.b7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "match_parent");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "weight", niVar.f90044c);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90382a;

        public c(my myVar) {
            this.f90382a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qi deserialize(ParsingContext parsingContext, qi qiVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new qi(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, qiVar != null ? qiVar.f90580a : null, this.f90382a.c7()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, qiVar != null ? qiVar.f90581b : null, this.f90382a.c7()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, qiVar != null ? qiVar.f90582c : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, pi.f90380b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, qi qiVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "max_size", qiVar.f90580a, this.f90382a.c7());
            JsonFieldParser.writeField(parsingContext, jSONObject, "min_size", qiVar.f90581b, this.f90382a.c7());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "match_parent");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "weight", qiVar.f90582c);
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
        private final my f90383a;

        public d(my myVar) {
            this.f90383a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ni resolve(ParsingContext parsingContext, qi qiVar, JSONObject jSONObject) {
            return new ni((kp) JsonFieldResolver.resolveOptional(parsingContext, qiVar.f90580a, jSONObject, "max_size", this.f90383a.d7(), this.f90383a.b7()), (kp) JsonFieldResolver.resolveOptional(parsingContext, qiVar.f90581b, jSONObject, "min_size", this.f90383a.d7(), this.f90383a.b7()), JsonFieldResolver.resolveOptionalExpression(parsingContext, qiVar.f90582c, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, pi.f90380b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(double d10) {
        return d10 > 0.0d;
    }
}
