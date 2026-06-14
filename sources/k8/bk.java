package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.gk;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bk implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f86543g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f86544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f86545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f86546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f86547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Expression f86548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Function2 f86549m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f86550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f86551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f86552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f86553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f86554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f86555f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86556f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bk invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return bk.f86543g.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bk a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((gk.c) BuiltInParserKt.getBuiltInParserComponent().w5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f86544h = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f86545i = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f86546j = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f86547k = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f86548l = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f86549m = a.f86556f;
    }

    public bk(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
        this.f86550a = expression;
        this.f86551b = expression2;
        this.f86552c = expression3;
        this.f86553d = expression4;
        this.f86554e = expression5;
    }

    public final boolean a(bk bkVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return bkVar != null && this.f86550a.evaluate(expressionResolver) == bkVar.f86550a.evaluate(expressionResolver2) && ((Number) this.f86551b.evaluate(expressionResolver)).doubleValue() == ((Number) bkVar.f86551b.evaluate(expressionResolver2)).doubleValue() && ((Number) this.f86552c.evaluate(expressionResolver)).doubleValue() == ((Number) bkVar.f86552c.evaluate(expressionResolver2)).doubleValue() && ((Number) this.f86553d.evaluate(expressionResolver)).doubleValue() == ((Number) bkVar.f86553d.evaluate(expressionResolver2)).doubleValue() && ((Number) this.f86554e.evaluate(expressionResolver)).doubleValue() == ((Number) bkVar.f86554e.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f86555f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(bk.class).hashCode() + this.f86550a.hashCode() + this.f86551b.hashCode() + this.f86552c.hashCode() + this.f86553d.hashCode() + this.f86554e.hashCode();
        this.f86555f = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((gk.c) BuiltInParserKt.getBuiltInParserComponent().w5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
