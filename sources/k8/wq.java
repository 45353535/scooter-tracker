package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.yq;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wq implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92224d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final xc f92225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f92226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f92227g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xc f92228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f92229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92230c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92231f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wq invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return wq.f92224d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wq a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((yq.b) BuiltInParserKt.getBuiltInParserComponent().z7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92225e = new xc(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f92226f = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        f92227g = a.f92231f;
    }

    public wq(xc xcVar, Expression expression) {
        this.f92228a = xcVar;
        this.f92229b = expression;
    }

    public final boolean a(wq wqVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return wqVar != null && this.f92228a.a(wqVar.f92228a, expressionResolver, expressionResolver2) && ((Number) this.f92229b.evaluate(expressionResolver)).longValue() == ((Number) wqVar.f92229b.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92230c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(wq.class).hashCode() + this.f92228a.hash() + this.f92229b.hashCode();
        this.f92230c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((yq.b) BuiltInParserKt.getBuiltInParserComponent().z7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
