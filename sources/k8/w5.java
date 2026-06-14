package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import k8.v5;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f92102a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeHelper f92103b = TypeHelper.INSTANCE.from(ArraysKt.first(v5.a.values()), a.f92104f);

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92104f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof v5.a);
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
        private final my f92105a;

        public c(my myVar) {
            this.f92105a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v5 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new v5(JsonExpressionParser.readExpression(parsingContext, jSONObject, "action", w5.f92103b, v5.a.f91887e), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, v5 v5Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "action", v5Var.f91882a, v5.a.f91886d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", v5Var.f91883b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92106a;

        public d(my myVar) {
            this.f92106a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x5 deserialize(ParsingContext parsingContext, x5 x5Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new x5(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "action", w5.f92103b, allowPropertyOverride, x5Var != null ? x5Var.f92295a : null, v5.a.f91887e), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, x5Var != null ? x5Var.f92296b : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, x5 x5Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "action", x5Var.f92295a, v5.a.f91886d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", x5Var.f92296b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
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
        private final my f92107a;

        public e(my myVar) {
            this.f92107a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v5 resolve(ParsingContext parsingContext, x5 x5Var, JSONObject jSONObject) {
            return new v5(JsonFieldResolver.resolveExpression(parsingContext, x5Var.f92295a, jSONObject, "action", w5.f92103b, v5.a.f91887e), JsonFieldResolver.resolveExpression(parsingContext, x5Var.f92296b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }
}
