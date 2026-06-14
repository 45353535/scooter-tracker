package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.oc;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class mc implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88981c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f88982d = a.f88985f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f88984b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88985f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mc invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return mc.f88981c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mc a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((oc.b) BuiltInParserKt.getBuiltInParserComponent().n3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public mc(Expression expression) {
        this.f88983a = expression;
    }

    public final boolean a(mc mcVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return mcVar != null && ((Number) this.f88983a.evaluate(expressionResolver)).longValue() == ((Number) mcVar.f88983a.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88984b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(mc.class).hashCode() + this.f88983a.hashCode();
        this.f88984b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((oc.b) BuiltInParserKt.getBuiltInParserComponent().n3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
