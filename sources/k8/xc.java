package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.zc;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xc implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92335d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Expression f92336e = Expression.Companion.constant$default(Expression.INSTANCE, jp.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f92337f = a.f92341f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f92339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92340c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92341f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xc invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return xc.f92335d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xc a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((zc.c) BuiltInParserKt.getBuiltInParserComponent().w3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public xc(Expression expression, Expression expression2) {
        this.f92338a = expression;
        this.f92339b = expression2;
    }

    public final boolean a(xc xcVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return xcVar != null && this.f92338a.evaluate(expressionResolver) == xcVar.f92338a.evaluate(expressionResolver2) && ((Number) this.f92339b.evaluate(expressionResolver)).longValue() == ((Number) xcVar.f92339b.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92340c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(xc.class).hashCode() + this.f92338a.hashCode() + this.f92339b.hashCode();
        this.f92340c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((zc.c) BuiltInParserKt.getBuiltInParserComponent().w3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ xc(Expression expression, Expression expression2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f92336e : expression, expression2);
    }
}
