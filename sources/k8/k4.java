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
public final class k4 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f88559e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f88560f = a.f88565f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f88562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fw f88563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f88564d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88565f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k4 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return k4.f88559e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k4 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((l4) BuiltInParserKt.getBuiltInParserComponent().M0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public k4(Expression expression, Expression expression2, fw fwVar) {
        this.f88561a = expression;
        this.f88562b = expression2;
        this.f88563c = fwVar;
    }

    public final boolean a(k4 k4Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return k4Var != null && ((Number) this.f88561a.evaluate(expressionResolver)).longValue() == ((Number) k4Var.f88561a.evaluate(expressionResolver2)).longValue() && Intrinsics.areEqual(this.f88562b.evaluate(expressionResolver), k4Var.f88562b.evaluate(expressionResolver2)) && this.f88563c.a(k4Var.f88563c, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88564d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(k4.class).hashCode() + this.f88561a.hashCode() + this.f88562b.hashCode() + this.f88563c.hash();
        this.f88564d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((l4) BuiltInParserKt.getBuiltInParserComponent().M0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
