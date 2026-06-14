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
public final class tl implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f91402c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f91403d = a.f91406f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f91405b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91406f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tl invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return tl.f91402c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final tl a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ul) BuiltInParserKt.getBuiltInParserComponent().W5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public tl(Expression expression) {
        this.f91404a = expression;
    }

    public final boolean a(tl tlVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return tlVar != null && ((Number) this.f91404a.evaluate(expressionResolver)).doubleValue() == ((Number) tlVar.f91404a.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91405b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(tl.class).hashCode() + this.f91404a.hashCode();
        this.f91405b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ul) BuiltInParserKt.getBuiltInParserComponent().W5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
