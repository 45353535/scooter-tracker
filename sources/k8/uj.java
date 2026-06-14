package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.zj;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class uj implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f91677h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f91678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f91679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f91680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Expression f91681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f91682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f91683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Function2 f91684o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f91686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f91687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f91688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f91689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression f91690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f91691g;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91692f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uj invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return uj.f91677h.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final uj a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((zj.c) BuiltInParserKt.getBuiltInParserComponent().t5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f91678i = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f91679j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f91680k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f91681l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f91682m = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f91683n = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f91684o = a.f91692f;
    }

    public uj(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6) {
        this.f91685a = expression;
        this.f91686b = expression2;
        this.f91687c = expression3;
        this.f91688d = expression4;
        this.f91689e = expression5;
        this.f91690f = expression6;
    }

    public final boolean a(uj ujVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return ujVar != null && this.f91685a.evaluate(expressionResolver) == ujVar.f91685a.evaluate(expressionResolver2) && ((Number) this.f91686b.evaluate(expressionResolver)).doubleValue() == ((Number) ujVar.f91686b.evaluate(expressionResolver2)).doubleValue() && ((Number) this.f91687c.evaluate(expressionResolver)).doubleValue() == ((Number) ujVar.f91687c.evaluate(expressionResolver2)).doubleValue() && ((Number) this.f91688d.evaluate(expressionResolver)).doubleValue() == ((Number) ujVar.f91688d.evaluate(expressionResolver2)).doubleValue() && ((Number) this.f91689e.evaluate(expressionResolver)).doubleValue() == ((Number) ujVar.f91689e.evaluate(expressionResolver2)).doubleValue() && ((Boolean) this.f91690f.evaluate(expressionResolver)).booleanValue() == ((Boolean) ujVar.f91690f.evaluate(expressionResolver2)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91691g;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(uj.class).hashCode() + this.f91685a.hashCode() + this.f91686b.hashCode() + this.f91687c.hashCode() + this.f91688d.hashCode() + this.f91689e.hashCode() + this.f91690f.hashCode();
        this.f91691g = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((zj.c) BuiltInParserKt.getBuiltInParserComponent().t5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
