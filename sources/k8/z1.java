package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class z1 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92850d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f92851e = a.f92855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f92853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92854c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92855f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z1 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return z1.f92850d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z1 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((a2) BuiltInParserKt.getBuiltInParserComponent().T().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public z1(Expression expression, Expression expression2) {
        this.f92852a = expression;
        this.f92853b = expression2;
    }

    public final boolean a(z1 z1Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return z1Var != null && ((Number) this.f92852a.evaluate(expressionResolver)).longValue() == ((Number) z1Var.f92852a.evaluate(expressionResolver2)).longValue() && Intrinsics.areEqual(this.f92853b.evaluate(expressionResolver), z1Var.f92853b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92854c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(z1.class).hashCode() + this.f92852a.hashCode() + this.f92853b.hashCode();
        this.f92854c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((a2) BuiltInParserKt.getBuiltInParserComponent().T().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
