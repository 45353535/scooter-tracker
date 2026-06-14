package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.y6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class w6 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f92108c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f92109d = a.f92112f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f92111b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92112f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return w6.f92108c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w6 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((y6.b) BuiltInParserKt.getBuiltInParserComponent().C1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public w6(Expression expression) {
        this.f92110a = expression;
    }

    public final boolean a(w6 w6Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return w6Var != null && ((Number) this.f92110a.evaluate(expressionResolver)).doubleValue() == ((Number) w6Var.f92110a.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92111b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(w6.class).hashCode() + this.f92110a.hashCode();
        this.f92111b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((y6.b) BuiltInParserKt.getBuiltInParserComponent().C1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
