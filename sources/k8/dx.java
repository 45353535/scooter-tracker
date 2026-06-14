package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import k8.ex;
import k8.xw;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class dx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f87120a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ValueValidator f87121b = new ValueValidator() { // from class: k8.bx
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return dx.c(((Long) obj).longValue());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ValueValidator f87122c = new ValueValidator() { // from class: k8.cx
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return dx.d(((Long) obj).longValue());
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
        private final my f87123a;

        public b(my myVar) {
            this.f87123a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xw.c deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new xw.c(JsonExpressionParser.readExpression(parsingContext, jSONObject, "height", typeHelper, function1, dx.f87121b), JsonExpressionParser.readExpression(parsingContext, jSONObject, "width", typeHelper, function1, dx.f87122c));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, xw.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "height", cVar.f92547a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "resolution");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "width", cVar.f92548b);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f87124a;

        public c(my myVar) {
            this.f87124a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ex.c deserialize(ParsingContext parsingContext, ex.c cVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = cVar != null ? cVar.f87389a : null;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new ex.c(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "height", typeHelper, allowPropertyOverride, field, function1, dx.f87121b), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "width", typeHelper, allowPropertyOverride, cVar != null ? cVar.f87390b : null, function1, dx.f87122c));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, ex.c cVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "height", cVar.f87389a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "resolution");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "width", cVar.f87390b);
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
        private final my f87125a;

        public d(my myVar) {
            this.f87125a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xw.c resolve(ParsingContext parsingContext, ex.c cVar, JSONObject jSONObject) {
            Field field = cVar.f87389a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new xw.c(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "height", typeHelper, function1, dx.f87121b), JsonFieldResolver.resolveExpression(parsingContext, cVar.f87390b, jSONObject, "width", typeHelper, function1, dx.f87122c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(long j10) {
        return j10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(long j10) {
        return j10 > 0;
    }
}
