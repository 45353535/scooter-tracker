package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.template.Field;
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
public abstract class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f90312a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ListValidator f90313b = new ListValidator() { // from class: k8.o6
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            return p6.b(list);
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
        private final my f90314a;

        public b(my myVar) {
            this.f90314a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n6 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new n6(JsonPropertyParser.readList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f90314a.z1(), p6.f90313b));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, n6 n6Var) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, n6Var.f90003a, this.f90314a.z1());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f90315a;

        public c(my myVar) {
            this.f90315a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q6 deserialize(ParsingContext parsingContext, q6 q6Var, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field field = q6Var != null ? q6Var.f90535a : null;
            Lazy lazyA1 = this.f90315a.A1();
            ListValidator listValidator = p6.f90313b;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new q6(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, field, lazyA1, listValidator));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, q6 q6Var) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, FirebaseAnalytics.Param.ITEMS, q6Var.f90535a, this.f90315a.A1());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
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
        private final my f90316a;

        public d(my myVar) {
            this.f90316a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n6 resolve(ParsingContext parsingContext, q6 q6Var, JSONObject jSONObject) {
            return new n6(JsonFieldResolver.resolveList(parsingContext, q6Var.f90535a, jSONObject, FirebaseAnalytics.Param.ITEMS, this.f90316a.B1(), this.f90316a.z1(), p6.f90313b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List list) {
        return list.size() >= 1;
    }
}
