package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import k8.cn;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f87060a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeHelper f87061b = TypeHelper.INSTANCE.from(ArraysKt.first(cn.c.values()), a.f87062f);

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87062f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof cn.c);
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
        private final my f87063a;

        public c(my myVar) {
            this.f87063a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cn deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new cn(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", dn.f87061b, cn.c.f86764e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, cn cnVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "relative");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", cnVar.f86759a, cn.c.f86763d);
            return jSONObject;
        }
    }

    public static final class d implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87064a;

        public d(my myVar) {
            this.f87064a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public en deserialize(ParsingContext parsingContext, en enVar, JSONObject jSONObject) {
            return new en(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", dn.f87061b, parsingContext.getAllowPropertyOverride(), enVar != null ? enVar.f87354a : null, cn.c.f86764e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, en enVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "relative");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", enVar.f87354a, cn.c.f86763d);
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
        private final my f87065a;

        public e(my myVar) {
            this.f87065a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cn resolve(ParsingContext parsingContext, en enVar, JSONObject jSONObject) {
            return new cn(JsonFieldResolver.resolveExpression(parsingContext, enVar.f87354a, jSONObject, "value", dn.f87061b, cn.c.f86764e));
        }
    }
}
