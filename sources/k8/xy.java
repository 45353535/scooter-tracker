package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.zy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xy implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f92556c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f92557d = a.f92560f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f92559b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92560f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xy invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return xy.f92556c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xy a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((zy.b) BuiltInParserKt.getBuiltInParserComponent().U9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public xy(Expression expression) {
        this.f92558a = expression;
    }

    public final boolean a(xy xyVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return xyVar != null && ((Number) this.f92558a.evaluate(expressionResolver)).longValue() == ((Number) xyVar.f92558a.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92559b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(xy.class).hashCode() + this.f92558a.hashCode();
        this.f92559b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((zy.b) BuiltInParserKt.getBuiltInParserComponent().U9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
