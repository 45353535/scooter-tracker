package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.f4;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class e4 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f87163e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f87164f = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f87165g = a.f87170f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3 f87167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f87168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f87169d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87170f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e4 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return e4.f87163e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e4 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((f4.b) BuiltInParserKt.getBuiltInParserComponent().G0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public e4(Expression expression, z3 z3Var, Expression expression2) {
        this.f87166a = expression;
        this.f87167b = z3Var;
        this.f87168c = expression2;
    }

    public final boolean a(e4 e4Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return e4Var != null && ((Boolean) this.f87166a.evaluate(expressionResolver)).booleanValue() == ((Boolean) e4Var.f87166a.evaluate(expressionResolver2)).booleanValue() && this.f87167b.a(e4Var.f87167b, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.f87168c.evaluate(expressionResolver), e4Var.f87168c.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87169d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(e4.class).hashCode() + this.f87166a.hashCode() + this.f87167b.hash() + this.f87168c.hashCode();
        this.f87169d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((f4.b) BuiltInParserKt.getBuiltInParserComponent().G0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
