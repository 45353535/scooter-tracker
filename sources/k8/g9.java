package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.l9;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g9 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f87778f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f87779g = a.f87785f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f87781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f87782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f87783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f87784e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87785f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g9 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return g9.f87778f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g9 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((l9.b) BuiltInParserKt.getBuiltInParserComponent().s2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public g9(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.f87780a = expression;
        this.f87781b = expression2;
        this.f87782c = expression3;
        this.f87783d = expression4;
    }

    public final boolean a(g9 g9Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (g9Var == null) {
            return false;
        }
        Expression expression = this.f87780a;
        Long l10 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = g9Var.f87780a;
        if (Intrinsics.areEqual(l10, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
            Expression expression3 = this.f87781b;
            Long l11 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
            Expression expression4 = g9Var.f87781b;
            if (Intrinsics.areEqual(l11, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null)) {
                Expression expression5 = this.f87782c;
                Long l12 = expression5 != null ? (Long) expression5.evaluate(expressionResolver) : null;
                Expression expression6 = g9Var.f87782c;
                if (Intrinsics.areEqual(l12, expression6 != null ? (Long) expression6.evaluate(expressionResolver2) : null)) {
                    Expression expression7 = this.f87783d;
                    Long l13 = expression7 != null ? (Long) expression7.evaluate(expressionResolver) : null;
                    Expression expression8 = g9Var.f87783d;
                    if (Intrinsics.areEqual(l13, expression8 != null ? (Long) expression8.evaluate(expressionResolver2) : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87784e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(g9.class).hashCode();
        Expression expression = this.f87780a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.f87781b;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.f87782c;
        int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.f87783d;
        int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        this.f87784e = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((l9.b) BuiltInParserKt.getBuiltInParserComponent().s2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
