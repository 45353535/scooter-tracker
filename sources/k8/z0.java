package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.e1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class z0 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f92838f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f92839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f92840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f92841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f92842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Function2 f92843k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f92845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f92846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f92847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f92848e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92849f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return z0.f92838f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z0 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((e1.b) BuiltInParserKt.getBuiltInParserComponent().E().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92839g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92840h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92841i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92842j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92843k = a.f92849f;
    }

    public z0(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.f92844a = expression;
        this.f92845b = expression2;
        this.f92846c = expression3;
        this.f92847d = expression4;
    }

    public final boolean a(z0 z0Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return z0Var != null && ((Number) this.f92844a.evaluate(expressionResolver)).longValue() == ((Number) z0Var.f92844a.evaluate(expressionResolver2)).longValue() && ((Number) this.f92845b.evaluate(expressionResolver)).longValue() == ((Number) z0Var.f92845b.evaluate(expressionResolver2)).longValue() && ((Number) this.f92846c.evaluate(expressionResolver)).longValue() == ((Number) z0Var.f92846c.evaluate(expressionResolver2)).longValue() && ((Number) this.f92847d.evaluate(expressionResolver)).longValue() == ((Number) z0Var.f92847d.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92848e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(z0.class).hashCode() + this.f92844a.hashCode() + this.f92845b.hashCode() + this.f92846c.hashCode() + this.f92847d.hashCode();
        this.f92848e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((e1.b) BuiltInParserKt.getBuiltInParserComponent().E().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
