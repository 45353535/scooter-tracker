package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88539c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f88540d = a.f88543f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f88542b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88543f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return k.f88539c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((l) BuiltInParserKt.getBuiltInParserComponent().g().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public k(Expression expression) {
        this.f88541a = expression;
    }

    public final boolean a(k kVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return kVar != null && ((Boolean) this.f88541a.evaluate(expressionResolver)).booleanValue() == ((Boolean) kVar.f88541a.evaluate(expressionResolver2)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88542b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(k.class).hashCode() + this.f88541a.hashCode();
        this.f88542b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((l) BuiltInParserKt.getBuiltInParserComponent().g().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
