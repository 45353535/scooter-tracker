package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.n7;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class l7 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f88752g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f88753h = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Function2 f88754i = a.f88761f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g9 f88756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f88757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oo f88758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ar f88759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f88760f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88761f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l7 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return l7.f88752g.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l7 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((n7.b) BuiltInParserKt.getBuiltInParserComponent().L1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public l7(Expression expression, g9 g9Var, Expression expression2, oo ooVar, ar arVar) {
        this.f88755a = expression;
        this.f88756b = g9Var;
        this.f88757c = expression2;
        this.f88758d = ooVar;
        this.f88759e = arVar;
    }

    public final boolean a(l7 l7Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (l7Var == null) {
            return false;
        }
        Expression expression = this.f88755a;
        Long l10 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = l7Var.f88755a;
        if (Intrinsics.areEqual(l10, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
            g9 g9Var = this.f88756b;
            if ((g9Var != null ? g9Var.a(l7Var.f88756b, expressionResolver, expressionResolver2) : l7Var.f88756b == null) && ((Boolean) this.f88757c.evaluate(expressionResolver)).booleanValue() == ((Boolean) l7Var.f88757c.evaluate(expressionResolver2)).booleanValue()) {
                oo ooVar = this.f88758d;
                if (ooVar != null ? ooVar.a(l7Var.f88758d, expressionResolver, expressionResolver2) : l7Var.f88758d == null) {
                    ar arVar = this.f88759e;
                    ar arVar2 = l7Var.f88759e;
                    if (arVar != null ? arVar.a(arVar2, expressionResolver, expressionResolver2) : arVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88760f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(l7.class).hashCode();
        Expression expression = this.f88755a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        g9 g9Var = this.f88756b;
        int iHash = iHashCode2 + (g9Var != null ? g9Var.hash() : 0) + this.f88757c.hashCode();
        oo ooVar = this.f88758d;
        int iHash2 = iHash + (ooVar != null ? ooVar.hash() : 0);
        ar arVar = this.f88759e;
        int iHash3 = iHash2 + (arVar != null ? arVar.hash() : 0);
        this.f88760f = Integer.valueOf(iHash3);
        return iHash3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((n7.b) BuiltInParserKt.getBuiltInParserComponent().L1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
