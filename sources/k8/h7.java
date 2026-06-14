package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.j7;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class h7 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f87987c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f87988d = a.f87991f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f87990b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87991f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h7 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return h7.f87987c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h7 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((j7.b) BuiltInParserKt.getBuiltInParserComponent().I1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public h7(Expression expression) {
        this.f87989a = expression;
    }

    public final boolean a(h7 h7Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return h7Var != null && ((Number) this.f87989a.evaluate(expressionResolver)).longValue() == ((Number) h7Var.f87989a.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87990b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(h7.class).hashCode() + this.f87989a.hashCode();
        this.f87990b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((j7.b) BuiltInParserKt.getBuiltInParserComponent().I1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
