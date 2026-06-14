package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.fl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class dl implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f87050c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f87051d = a.f87054f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f87053b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87054f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dl invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return dl.f87050c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dl a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((fl.b) BuiltInParserKt.getBuiltInParserComponent().K5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public dl(Expression expression) {
        this.f87052a = expression;
    }

    public final boolean a(dl dlVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return dlVar != null && ((Number) this.f87052a.evaluate(expressionResolver)).doubleValue() == ((Number) dlVar.f87052a.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87053b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(dl.class).hashCode() + this.f87052a.hashCode();
        this.f87053b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((fl.b) BuiltInParserKt.getBuiltInParserComponent().K5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
