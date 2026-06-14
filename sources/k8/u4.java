package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u4 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f91553d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f91554e = a.f91558f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f91556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f91557c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91558f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u4 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return u4.f91553d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u4 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((v4) BuiltInParserKt.getBuiltInParserComponent().S0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public u4(Expression expression, Expression expression2) {
        this.f91555a = expression;
        this.f91556b = expression2;
    }

    public final boolean a(u4 u4Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (u4Var != null && Intrinsics.areEqual(this.f91555a.evaluate(expressionResolver), u4Var.f91555a.evaluate(expressionResolver2))) {
            Expression expression = this.f91556b;
            Boolean bool = expression != null ? (Boolean) expression.evaluate(expressionResolver) : null;
            Expression expression2 = u4Var.f91556b;
            if (Intrinsics.areEqual(bool, expression2 != null ? (Boolean) expression2.evaluate(expressionResolver2) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91557c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(u4.class).hashCode() + this.f91555a.hashCode();
        Expression expression = this.f91556b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        this.f91557c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((v4) BuiltInParserKt.getBuiltInParserComponent().S0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
