package k8;

import androidx.constraintlayout.motion.widget.Key;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import k8.ml;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f92531a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ml.d f92532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ml.d f92533c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92534a;

        public b(my myVar) {
            this.f92534a = myVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wv deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            ml mlVar = (ml) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pivot_x", this.f92534a.T5());
            if (mlVar == null) {
                mlVar = xv.f92532b;
            }
            ml mlVar2 = (ml) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pivot_y", this.f92534a.T5());
            if (mlVar2 == null) {
                mlVar2 = xv.f92533c;
            }
            return new wv(mlVar, mlVar2, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Key.ROTATION, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, wv wvVar) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "pivot_x", wvVar.f92247a, this.f92534a.T5());
            JsonPropertyParser.write(parsingContext, jSONObject, "pivot_y", wvVar.f92248b, this.f92534a.T5());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, Key.ROTATION, wvVar.f92249c);
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final my f92535a;

        public c(my myVar) {
            this.f92535a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public yv deserialize(ParsingContext parsingContext, yv yvVar, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new yv(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "pivot_x", allowPropertyOverride, yvVar != null ? yvVar.f92823a : null, this.f92535a.U5()), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "pivot_y", allowPropertyOverride, yvVar != null ? yvVar.f92824b : null, this.f92535a.U5()), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, Key.ROTATION, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, yvVar != null ? yvVar.f92825c : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext parsingContext, yv yvVar) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "pivot_x", yvVar.f92823a, this.f92535a.U5());
            JsonFieldParser.writeField(parsingContext, jSONObject, "pivot_y", yvVar.f92824b, this.f92535a.U5());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, Key.ROTATION, yvVar.f92825c);
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
        private final my f92536a;

        public d(my myVar) {
            this.f92536a = myVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wv resolve(ParsingContext parsingContext, yv yvVar, JSONObject jSONObject) {
            ml mlVar = (ml) JsonFieldResolver.resolveOptional(parsingContext, yvVar.f92823a, jSONObject, "pivot_x", this.f92536a.V5(), this.f92536a.T5());
            if (mlVar == null) {
                mlVar = xv.f92532b;
            }
            ml mlVar2 = (ml) JsonFieldResolver.resolveOptional(parsingContext, yvVar.f92824b, jSONObject, "pivot_y", this.f92536a.V5(), this.f92536a.T5());
            if (mlVar2 == null) {
                mlVar2 = xv.f92533c;
            }
            return new wv(mlVar, mlVar2, JsonFieldResolver.resolveOptionalExpression(parsingContext, yvVar.f92825c, jSONObject, Key.ROTATION, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double dValueOf = Double.valueOf(50.0d);
        f92532b = new ml.d(new tl(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f92533c = new ml.d(new tl(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
    }
}
