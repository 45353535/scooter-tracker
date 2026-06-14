package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.s7;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class p7 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f90317e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f90318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f90319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f90320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Function2 f90321i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Expression f90322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f90323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f90324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f90325d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90326f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p7 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return p7.f90317e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p7 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((s7.c) BuiltInParserKt.getBuiltInParserComponent().O1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90318f = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f90319g = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        f90320h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90321i = a.f90326f;
    }

    public p7(Expression expression, Expression expression2, Expression expression3) {
        this.f90322a = expression;
        this.f90323b = expression2;
        this.f90324c = expression3;
    }

    public final boolean a(p7 p7Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return p7Var != null && ((Number) b().evaluate(expressionResolver)).longValue() == ((Number) p7Var.b().evaluate(expressionResolver2)).longValue() && c().evaluate(expressionResolver) == p7Var.c().evaluate(expressionResolver2) && ((Number) d().evaluate(expressionResolver)).longValue() == ((Number) p7Var.d().evaluate(expressionResolver2)).longValue();
    }

    public Expression b() {
        return this.f90322a;
    }

    public Expression c() {
        return this.f90323b;
    }

    public Expression d() {
        return this.f90324c;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90325d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(p7.class).hashCode() + b().hashCode() + c().hashCode() + d().hashCode();
        this.f90325d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((s7.c) BuiltInParserKt.getBuiltInParserComponent().O1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
