package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.mp;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class kp implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f88673d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Expression f88674e = Expression.Companion.constant$default(Expression.INSTANCE, jp.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f88675f = a.f88679f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f88677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f88678c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88679f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kp invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return kp.f88673d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kp a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((mp.c) BuiltInParserKt.getBuiltInParserComponent().b7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public kp(Expression expression, Expression expression2) {
        this.f88676a = expression;
        this.f88677b = expression2;
    }

    public final boolean a(kp kpVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return kpVar != null && this.f88676a.evaluate(expressionResolver) == kpVar.f88676a.evaluate(expressionResolver2) && ((Number) this.f88677b.evaluate(expressionResolver)).longValue() == ((Number) kpVar.f88677b.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88678c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(kp.class).hashCode() + this.f88676a.hashCode() + this.f88677b.hashCode();
        this.f88678c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((mp.c) BuiltInParserKt.getBuiltInParserComponent().b7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
