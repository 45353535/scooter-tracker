package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ru;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class pu implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f90444g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f90445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f90446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f90447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final xc f90448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Function2 f90449l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f90451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f90452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f90453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xc f90454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f90455f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90456f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pu invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return pu.f90444g.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pu a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ru.b) BuiltInParserKt.getBuiltInParserComponent().G8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90445h = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        f90446i = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f90447j = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f90448k = new xc(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        f90449l = a.f90456f;
    }

    public pu(Expression expression, Expression expression2, Expression expression3, Expression expression4, xc xcVar) {
        this.f90450a = expression;
        this.f90451b = expression2;
        this.f90452c = expression3;
        this.f90453d = expression4;
        this.f90454e = xcVar;
    }

    public final boolean a(pu puVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return puVar != null && ((Number) this.f90450a.evaluate(expressionResolver)).intValue() == ((Number) puVar.f90450a.evaluate(expressionResolver2)).intValue() && ((Number) this.f90451b.evaluate(expressionResolver)).doubleValue() == ((Number) puVar.f90451b.evaluate(expressionResolver2)).doubleValue() && ((Boolean) this.f90452c.evaluate(expressionResolver)).booleanValue() == ((Boolean) puVar.f90452c.evaluate(expressionResolver2)).booleanValue() && ((Boolean) this.f90453d.evaluate(expressionResolver)).booleanValue() == ((Boolean) puVar.f90453d.evaluate(expressionResolver2)).booleanValue() && this.f90454e.a(puVar.f90454e, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90455f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(pu.class).hashCode() + this.f90450a.hashCode() + this.f90451b.hashCode() + this.f90452c.hashCode() + this.f90453d.hashCode() + this.f90454e.hash();
        this.f90455f = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ru.b) BuiltInParserKt.getBuiltInParserComponent().G8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
