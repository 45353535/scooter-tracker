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
public final class u1 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f91544e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f91545f = a.f91550f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fw f91547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f91548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f91549d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91550f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return u1.f91544e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u1 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((v1) BuiltInParserKt.getBuiltInParserComponent().Q().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public u1(Expression expression, fw fwVar, Expression expression2) {
        this.f91546a = expression;
        this.f91547b = fwVar;
        this.f91548c = expression2;
    }

    public final boolean a(u1 u1Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (u1Var == null) {
            return false;
        }
        Expression expression = this.f91546a;
        Long l10 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = u1Var.f91546a;
        return Intrinsics.areEqual(l10, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null) && this.f91547b.a(u1Var.f91547b, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.f91548c.evaluate(expressionResolver), u1Var.f91548c.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91549d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(u1.class).hashCode();
        Expression expression = this.f91546a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f91547b.hash() + this.f91548c.hashCode();
        this.f91549d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((v1) BuiltInParserKt.getBuiltInParserComponent().Q().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
