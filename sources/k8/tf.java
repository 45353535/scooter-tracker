package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class tf implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f91390b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f91391c = a.f91393f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f91392a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91393f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tf invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return tf.f91390b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final tf a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((uf) BuiltInParserKt.getBuiltInParserComponent().g4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public final boolean a(tf tfVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return tfVar != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91392a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(tf.class).hashCode();
        this.f91392a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((uf) BuiltInParserKt.getBuiltInParserComponent().g4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
