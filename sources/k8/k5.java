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
import k8.j5;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f88566a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeHelper f88567b = TypeHelper.INSTANCE.from(ArraysKt.first(j5.a.values()), a.f88568f);

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88568f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof j5.a);
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
        private final my f88569a;

        public c(my myVar) {
            this.f88569a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j5 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new j5(JsonExpressionParser.readExpression(parsingContext, jSONObject, "action", k5.f88567b, j5.a.f88352e), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, j5 j5Var) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "action", j5Var.f88347a, j5.a.f88351d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", j5Var.f88348b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "timer");
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f88570a;

        public d(my myVar) {
            this.f88570a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l5 deserialize(ParsingContext parsingContext, l5 l5Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new l5(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "action", k5.f88567b, allowPropertyOverride, l5Var != null ? l5Var.f88748a : null, j5.a.f88352e), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, l5Var != null ? l5Var.f88749b : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, l5 l5Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "action", l5Var.f88748a, j5.a.f88351d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", l5Var.f88749b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "timer");
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
        private final my f88571a;

        public e(my myVar) {
            this.f88571a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j5 resolve(ParsingContext parsingContext, l5 l5Var, JSONObject jSONObject) {
            return new j5(JsonFieldResolver.resolveExpression(parsingContext, l5Var.f88748a, jSONObject, "action", k5.f88567b, j5.a.f88352e), JsonFieldResolver.resolveExpression(parsingContext, l5Var.f88749b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }
}
