package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ob;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hb implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f87993i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f87994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f87995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Expression f87996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f87997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f87998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Function2 f87999o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f88001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f88002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f88003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f88004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression f88005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression f88006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f88007h;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88008f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hb invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return hb.f87993i.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hb a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ob.c) BuiltInParserKt.getBuiltInParserComponent().Y2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f87994j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87995k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87996l = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87997m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f87998n = Expression.Companion.constant$default(companion, jp.DP, null, 2, null);
        f87999o = a.f88008f;
    }

    public hb(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7) {
        this.f88000a = expression;
        this.f88001b = expression2;
        this.f88002c = expression3;
        this.f88003d = expression4;
        this.f88004e = expression5;
        this.f88005f = expression6;
        this.f88006g = expression7;
    }

    public final boolean a(hb hbVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (hbVar != null && ((Number) this.f88000a.evaluate(expressionResolver)).longValue() == ((Number) hbVar.f88000a.evaluate(expressionResolver2)).longValue()) {
            Expression expression = this.f88001b;
            Long l10 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
            Expression expression2 = hbVar.f88001b;
            if (Intrinsics.areEqual(l10, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null) && ((Number) this.f88002c.evaluate(expressionResolver)).longValue() == ((Number) hbVar.f88002c.evaluate(expressionResolver2)).longValue() && ((Number) this.f88003d.evaluate(expressionResolver)).longValue() == ((Number) hbVar.f88003d.evaluate(expressionResolver2)).longValue()) {
                Expression expression3 = this.f88004e;
                Long l11 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
                Expression expression4 = hbVar.f88004e;
                if (Intrinsics.areEqual(l11, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null) && ((Number) this.f88005f.evaluate(expressionResolver)).longValue() == ((Number) hbVar.f88005f.evaluate(expressionResolver2)).longValue() && this.f88006g.evaluate(expressionResolver) == hbVar.f88006g.evaluate(expressionResolver2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88007h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(hb.class).hashCode() + this.f88000a.hashCode();
        Expression expression = this.f88001b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f88002c.hashCode() + this.f88003d.hashCode();
        Expression expression2 = this.f88004e;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0) + this.f88005f.hashCode() + this.f88006g.hashCode();
        this.f88007h = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ob.c) BuiltInParserKt.getBuiltInParserComponent().Y2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ hb(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f87994j : expression, (i10 & 2) != 0 ? null : expression2, (i10 & 4) != 0 ? f87995k : expression3, (i10 & 8) != 0 ? f87996l : expression4, (i10 & 16) != 0 ? null : expression5, (i10 & 32) != 0 ? f87997m : expression6, (i10 & 64) != 0 ? f87998n : expression7);
    }
}
