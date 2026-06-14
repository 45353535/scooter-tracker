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
public final class j2 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f88334b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f88335c = a.f88337f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f88336a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88337f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j2 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return j2.f88334b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j2 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((k2) BuiltInParserKt.getBuiltInParserComponent().Z().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public final boolean a(j2 j2Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return j2Var != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88336a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(j2.class).hashCode();
        this.f88336a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((k2) BuiltInParserKt.getBuiltInParserComponent().Z().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
