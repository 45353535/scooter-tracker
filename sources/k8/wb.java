package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ac;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wb implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f92141f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f92142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f92143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f92144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f92145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Function2 f92146k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f92148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f92149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f92150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f92151e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92152f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wb invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return wb.f92141f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wb a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ac.c) BuiltInParserKt.getBuiltInParserComponent().e3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92142g = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        f92143h = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f92144i = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        f92145j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92146k = a.f92152f;
    }

    public wb(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.f92147a = expression;
        this.f92148b = expression2;
        this.f92149c = expression3;
        this.f92150d = expression4;
    }

    public final boolean a(wb wbVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return wbVar != null && ((Number) this.f92147a.evaluate(expressionResolver)).doubleValue() == ((Number) wbVar.f92147a.evaluate(expressionResolver2)).doubleValue() && ((Number) b().evaluate(expressionResolver)).longValue() == ((Number) wbVar.b().evaluate(expressionResolver2)).longValue() && c().evaluate(expressionResolver) == wbVar.c().evaluate(expressionResolver2) && ((Number) d().evaluate(expressionResolver)).longValue() == ((Number) wbVar.d().evaluate(expressionResolver2)).longValue();
    }

    public Expression b() {
        return this.f92148b;
    }

    public Expression c() {
        return this.f92149c;
    }

    public Expression d() {
        return this.f92150d;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92151e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(wb.class).hashCode() + this.f92147a.hashCode() + b().hashCode() + c().hashCode() + d().hashCode();
        this.f92151e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ac.c) BuiltInParserKt.getBuiltInParserComponent().e3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
