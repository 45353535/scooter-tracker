package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.pn;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class jn implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f88489h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f88490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f88491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f88492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Expression f88493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f88494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f88495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Function2 f88496o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Expression f88497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f88498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f88499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f88500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f88501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Expression f88502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f88503g;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88504f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jn invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return jn.f88489h.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jn a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((pn.c) BuiltInParserKt.getBuiltInParserComponent().A6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f88490i = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f88491j = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(0.5d);
        f88492k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f88493l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f88494m = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f88495n = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f88496o = a.f88504f;
    }

    public jn(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6) {
        this.f88497a = expression;
        this.f88498b = expression2;
        this.f88499c = expression3;
        this.f88500d = expression4;
        this.f88501e = expression5;
        this.f88502f = expression6;
    }

    public final boolean a(jn jnVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return jnVar != null && ((Number) b().evaluate(expressionResolver)).longValue() == ((Number) jnVar.b().evaluate(expressionResolver2)).longValue() && c().evaluate(expressionResolver) == jnVar.c().evaluate(expressionResolver2) && ((Number) this.f88499c.evaluate(expressionResolver)).doubleValue() == ((Number) jnVar.f88499c.evaluate(expressionResolver2)).doubleValue() && ((Number) this.f88500d.evaluate(expressionResolver)).doubleValue() == ((Number) jnVar.f88500d.evaluate(expressionResolver2)).doubleValue() && ((Number) this.f88501e.evaluate(expressionResolver)).doubleValue() == ((Number) jnVar.f88501e.evaluate(expressionResolver2)).doubleValue() && ((Number) d().evaluate(expressionResolver)).longValue() == ((Number) jnVar.d().evaluate(expressionResolver2)).longValue();
    }

    public Expression b() {
        return this.f88497a;
    }

    public Expression c() {
        return this.f88498b;
    }

    public Expression d() {
        return this.f88502f;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88503g;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(jn.class).hashCode() + b().hashCode() + c().hashCode() + this.f88499c.hashCode() + this.f88500d.hashCode() + this.f88501e.hashCode() + d().hashCode();
        this.f88503g = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((pn.c) BuiltInParserKt.getBuiltInParserComponent().A6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
