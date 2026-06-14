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
public final class y2 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f92594e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f92595f = a.f92600f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fw f92597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f92598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f92599d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92600f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y2 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return y2.f92594e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y2 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((z2) BuiltInParserKt.getBuiltInParserComponent().i0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public y2(Expression expression, fw fwVar, Expression expression2) {
        this.f92596a = expression;
        this.f92597b = fwVar;
        this.f92598c = expression2;
    }

    public final boolean a(y2 y2Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (y2Var != null && Intrinsics.areEqual(this.f92596a.evaluate(expressionResolver), y2Var.f92596a.evaluate(expressionResolver2))) {
            fw fwVar = this.f92597b;
            if ((fwVar != null ? fwVar.a(y2Var.f92597b, expressionResolver, expressionResolver2) : y2Var.f92597b == null) && Intrinsics.areEqual(this.f92598c.evaluate(expressionResolver), y2Var.f92598c.evaluate(expressionResolver2))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92599d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(y2.class).hashCode() + this.f92596a.hashCode();
        fw fwVar = this.f92597b;
        int iHash = iHashCode + (fwVar != null ? fwVar.hash() : 0) + this.f92598c.hashCode();
        this.f92599d = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((z2) BuiltInParserKt.getBuiltInParserComponent().i0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
