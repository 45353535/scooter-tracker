package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.cr;
import k8.dr;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ar implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f86308f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dr.d f86309g = new dr.d(new mr());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f86310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f86311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Function2 f86312j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f86313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dr f86314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f86315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f86316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f86317e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86318f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ar invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ar.f86308f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ar a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((cr.c) BuiltInParserKt.getBuiltInParserComponent().C7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f86310h = Expression.Companion.constant$default(companion, jp.DP, null, 2, null);
        f86311i = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f86312j = a.f86318f;
    }

    public ar(Expression expression, dr drVar, Expression expression2, Expression expression3) {
        this.f86313a = expression;
        this.f86314b = drVar;
        this.f86315c = expression2;
        this.f86316d = expression3;
    }

    public final boolean a(ar arVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return arVar != null && ((Number) this.f86313a.evaluate(expressionResolver)).intValue() == ((Number) arVar.f86313a.evaluate(expressionResolver2)).intValue() && this.f86314b.a(arVar.f86314b, expressionResolver, expressionResolver2) && this.f86315c.evaluate(expressionResolver) == arVar.f86315c.evaluate(expressionResolver2) && ((Number) this.f86316d.evaluate(expressionResolver)).doubleValue() == ((Number) arVar.f86316d.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f86317e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ar.class).hashCode() + this.f86313a.hashCode() + this.f86314b.hash() + this.f86315c.hashCode() + this.f86316d.hashCode();
        this.f86317e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((cr.c) BuiltInParserKt.getBuiltInParserComponent().C7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
