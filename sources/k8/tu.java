package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.uu;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class tu implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f91521d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Expression f91522e = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f91523f = a.f91527f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f91525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f91526c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91527f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tu invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return tu.f91521d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final tu a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((uu.b) BuiltInParserKt.getBuiltInParserComponent().J8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public tu(Expression expression, Expression expression2) {
        this.f91524a = expression;
        this.f91525b = expression2;
    }

    public final boolean a(tu tuVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return tuVar != null && ((Number) this.f91524a.evaluate(expressionResolver)).intValue() == ((Number) tuVar.f91524a.evaluate(expressionResolver2)).intValue() && ((Boolean) this.f91525b.evaluate(expressionResolver)).booleanValue() == ((Boolean) tuVar.f91525b.evaluate(expressionResolver2)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91526c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(tu.class).hashCode() + this.f91524a.hashCode() + this.f91525b.hashCode();
        this.f91526c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((uu.b) BuiltInParserKt.getBuiltInParserComponent().J8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
