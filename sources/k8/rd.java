package k8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f90674a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ValueValidator f90675b = new ValueValidator() { // from class: k8.qd
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return rd.b((String) obj);
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
        private final my f90676a;

        public b(my myVar) {
            this.f90676a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kd deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new kd(JsonPropertyParser.readList(parsingContext, jSONObject, "arguments", this.f90676a.F3()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "body"), (String) JsonPropertyParser.read(parsingContext, jSONObject, "name", rd.f90675b), (qb) JsonPropertyParser.read(parsingContext, jSONObject, "return_type", qb.f90546e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, kd kdVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "arguments", kdVar.f88614a, this.f90676a.F3());
            JsonPropertyParser.write(parsingContext, jSONObject, "body", kdVar.f88615b);
            JsonPropertyParser.write(parsingContext, jSONObject, "name", kdVar.f88616c);
            JsonPropertyParser.write(parsingContext, jSONObject, "return_type", kdVar.f88617d, (Function1<qb, R>) qb.f90545d);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90677a;

        public c(my myVar) {
            this.f90677a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public sd deserialize(ParsingContext parsingContext, sd sdVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new sd(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "arguments", allowPropertyOverride, sdVar != null ? sdVar.f90990a : null, this.f90677a.G3()), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "body", allowPropertyOverride, sdVar != null ? sdVar.f90991b : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, sdVar != null ? sdVar.f90992c : null, rd.f90675b), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "return_type", allowPropertyOverride, sdVar != null ? sdVar.f90993d : null, qb.f90546e));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, sd sdVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "arguments", sdVar.f90990a, this.f90677a.G3());
            JsonFieldParser.writeField(parsingContext, jSONObject, "body", sdVar.f90991b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "name", sdVar.f90992c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "return_type", sdVar.f90993d, qb.f90545d);
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
        private final my f90678a;

        public d(my myVar) {
            this.f90678a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kd resolve(ParsingContext parsingContext, sd sdVar, JSONObject jSONObject) {
            return new kd(JsonFieldResolver.resolveList(parsingContext, sdVar.f90990a, jSONObject, "arguments", this.f90678a.H3(), this.f90678a.F3()), (String) JsonFieldResolver.resolve(parsingContext, sdVar.f90991b, jSONObject, "body"), (String) JsonFieldResolver.resolve(parsingContext, sdVar.f90992c, jSONObject, "name", rd.f90675b), (qb) JsonFieldResolver.resolve(parsingContext, sdVar.f90993d, jSONObject, "return_type", qb.f90546e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String str) {
        return ParsingValidatorsKt.doesMatch(str, "^[a-zA-Z_][a-zA-Z0-9_]*$");
    }
}
