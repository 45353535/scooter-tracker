package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f91538c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f91539d = a.f91542f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f91541b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91542f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return u.f91538c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((v) BuiltInParserKt.getBuiltInParserComponent().m().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public u(Expression expression) {
        this.f91540a = expression;
    }

    public final boolean a(u uVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return uVar != null && ((Number) this.f91540a.evaluate(expressionResolver)).intValue() == ((Number) uVar.f91540a.evaluate(expressionResolver2)).intValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91541b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(u.class).hashCode() + this.f91540a.hashCode();
        this.f91541b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((v) BuiltInParserKt.getBuiltInParserComponent().m().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
