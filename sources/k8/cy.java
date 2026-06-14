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
public final class cy implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f86856c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f86857d = a.f86860f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f86858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f86859b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86860f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cy invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return cy.f86856c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cy a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((dy) BuiltInParserKt.getBuiltInParserComponent().I9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public cy(Expression expression) {
        this.f86858a = expression;
    }

    public final boolean a(cy cyVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return cyVar != null && ((Number) this.f86858a.evaluate(expressionResolver)).longValue() == ((Number) cyVar.f86858a.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f86859b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(cy.class).hashCode() + this.f86858a.hashCode();
        this.f86859b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((dy) BuiltInParserKt.getBuiltInParserComponent().I9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
