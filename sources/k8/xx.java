package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.zx;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xx implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f92551c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f92552d = a.f92555f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f92554b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92555f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xx invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return xx.f92551c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xx a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((zx.b) BuiltInParserKt.getBuiltInParserComponent().F9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public xx(Expression expression) {
        this.f92553a = expression;
    }

    public final boolean a(xx xxVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return xxVar != null && ((Number) this.f92553a.evaluate(expressionResolver)).longValue() == ((Number) xxVar.f92553a.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92554b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(xx.class).hashCode() + this.f92553a.hashCode();
        this.f92554b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((zx.b) BuiltInParserKt.getBuiltInParserComponent().F9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
