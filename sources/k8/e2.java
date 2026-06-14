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
public final class e2 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f87155e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f87156f = a.f87161f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fw f87158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f87159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f87160d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87161f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e2 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return e2.f87155e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e2 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((f2) BuiltInParserKt.getBuiltInParserComponent().W().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public e2(Expression expression, fw fwVar, Expression expression2) {
        this.f87157a = expression;
        this.f87158b = fwVar;
        this.f87159c = expression2;
    }

    public final boolean a(e2 e2Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return e2Var != null && ((Number) this.f87157a.evaluate(expressionResolver)).longValue() == ((Number) e2Var.f87157a.evaluate(expressionResolver2)).longValue() && this.f87158b.a(e2Var.f87158b, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.f87159c.evaluate(expressionResolver), e2Var.f87159c.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87160d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(e2.class).hashCode() + this.f87157a.hashCode() + this.f87158b.hash() + this.f87159c.hashCode();
        this.f87160d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((f2) BuiltInParserKt.getBuiltInParserComponent().W().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
