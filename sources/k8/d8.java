package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.e8;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class d8 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f86903e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final xc f86904f = new xc(null, Expression.Companion.constant$default(Expression.INSTANCE, 10L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f86905g = a.f86910f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f86906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xc f86907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ar f86908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f86909d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86910f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d8 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return d8.f86903e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d8 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((e8.b) BuiltInParserKt.getBuiltInParserComponent().X1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public d8(Expression expression, xc xcVar, ar arVar) {
        this.f86906a = expression;
        this.f86907b = xcVar;
        this.f86908c = arVar;
    }

    public final boolean a(d8 d8Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (d8Var == null) {
            return false;
        }
        Expression expression = this.f86906a;
        Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
        Expression expression2 = d8Var.f86906a;
        if (Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(expressionResolver2) : null) && this.f86907b.a(d8Var.f86907b, expressionResolver, expressionResolver2)) {
            ar arVar = this.f86908c;
            ar arVar2 = d8Var.f86908c;
            if (arVar != null ? arVar.a(arVar2, expressionResolver, expressionResolver2) : arVar2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f86909d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(d8.class).hashCode();
        Expression expression = this.f86906a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f86907b.hash();
        ar arVar = this.f86908c;
        int iHash = iHashCode2 + (arVar != null ? arVar.hash() : 0);
        this.f86909d = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((e8.b) BuiltInParserKt.getBuiltInParserComponent().X1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
