package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.i8;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g8 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f87771e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f87772f = a.f87777f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f87774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hb f87775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f87776d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87777f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g8 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return g8.f87771e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g8 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((i8.b) BuiltInParserKt.getBuiltInParserComponent().a2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public g8(Expression expression, Expression expression2, hb hbVar) {
        this.f87773a = expression;
        this.f87774b = expression2;
        this.f87775c = hbVar;
    }

    public final boolean a(g8 g8Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (g8Var != null && ((Number) this.f87773a.evaluate(expressionResolver)).intValue() == ((Number) g8Var.f87773a.evaluate(expressionResolver2)).intValue() && ((Number) this.f87774b.evaluate(expressionResolver)).longValue() == ((Number) g8Var.f87774b.evaluate(expressionResolver2)).longValue()) {
            hb hbVar = this.f87775c;
            hb hbVar2 = g8Var.f87775c;
            if (hbVar != null ? hbVar.a(hbVar2, expressionResolver, expressionResolver2) : hbVar2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87776d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(g8.class).hashCode() + this.f87773a.hashCode() + this.f87774b.hashCode();
        hb hbVar = this.f87775c;
        int iHash = iHashCode + (hbVar != null ? hbVar.hash() : 0);
        this.f87776d = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((i8.b) BuiltInParserKt.getBuiltInParserComponent().a2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
